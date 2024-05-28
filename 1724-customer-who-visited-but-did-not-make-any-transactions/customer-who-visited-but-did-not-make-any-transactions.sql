# Write your MySQL query statement below
SELECT customer_id, COUNT(v.visit_id) as count_no_trans 
FROM Visits v 
left join Transactions t on v.visit_id = t.visit_id
where transaction_id  IS Null
Group by customer_id;

