# Write your MySQL query statement below
select stock_name , sum( case 
when operation='buy' then -1*price
when operation ='sell' then 1*price 
end) as capital_gain_loss  from stocks group by stock_name ; 