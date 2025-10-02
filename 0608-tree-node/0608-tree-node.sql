# Write your MySQL query statement below
select id , case
when P_id is null then "Root"
when id in ( select p_id from tree where p_id in (select id from tree)) then "Inner"
else "Leaf" 
end as type from tree;
