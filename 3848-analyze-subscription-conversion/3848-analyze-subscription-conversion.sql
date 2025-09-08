# Write your MySQL query statement below
select u.user_id, round(Avg(b.activity_duration),2) as trial_avg_duration,
round(Avg(u.activity_duration),2) as paid_avg_duration from useractivity u 
left join (select user_id , activity_duration from useractivity where activity_type='free_trial') as b

on u.user_id=b.user_id
where activity_type='paid' 
group by u.user_id;
