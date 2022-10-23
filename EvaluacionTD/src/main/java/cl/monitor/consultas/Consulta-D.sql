SELECT prod.product_id, prod.product_name, inv.quantity  from  products prod
inner join inventories inv on prod.product_id = inv.product_id
inner join warehouses bodega on  inv.warehouse_id = bodega.warehouse_id
where prod.product_name like '%Intel%'
and bodega.warehouse_name like '%San Francisco%'
order by NLSSORT(prod.product_name,'NLS_SORT=BINARY_AI');