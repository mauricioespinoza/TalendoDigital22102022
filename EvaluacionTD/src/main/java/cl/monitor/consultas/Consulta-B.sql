SELECT cat.category_name, COUNT(*)
FROM product_categories cat
INNER JOIN products prod ON ( cat.category_id = prod.category_id )
GROUP BY cat.category_name
HAVING COUNT(*) > 1
ORDER BY COUNT(*) DESC;