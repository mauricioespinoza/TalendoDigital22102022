SELECT PRODUCT_ID, PRODUCT_NAME, list_price FROM PRODUCTS PROD
INNER JOIN product_categories CAT
ON prod.category_id = cat.category_id
WHERE CAT.CATEGORY_NAME = 'Storage'
ORDER BY PROD.PRODUCT_NAME ASC, PROD.LIST_PRICE ASC;