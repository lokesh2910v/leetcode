# Write your MySQL query statement below
select id , movie , description , rating from cinema c
where c.description not like 'boring' and (id%2<>0) order by rating desc; 