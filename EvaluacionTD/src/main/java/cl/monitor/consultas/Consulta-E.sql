SELECT
    bodega.warehouse_name,
    SUM((SELECT SUM(inventories.quantity) FROM inventories) * prod.standard_cost) AS inventario_valorizado
FROM inventories inv
    INNER JOIN warehouses bodega ON bodega.warehouse_id = inv.warehouse_id
    INNER JOIN products   prod ON inv.product_id = prod.product_id
GROUP BY bodega.warehouse_name
ORDER BY inventario_valorizado desc;