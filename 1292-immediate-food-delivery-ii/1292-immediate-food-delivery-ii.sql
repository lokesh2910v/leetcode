# Write your MySQL query statement below
select Round((count(case when order_date = customer_pref_delivery_date then customer_id end)/count(*))*100,2) as immediate_percentage
from 
(select *,row_number() over (partition by customer_id order by order_date) as t from delivery ) tb
where t=1;