SELECT pais.country_name, bodega.warehouse_name, loca.address, loca.city, loca.state  from countries pais
inner join locations loca on pais.country_id = loca.country_id
inner join warehouses bodega on  loca.location_id = bodega.location_id
order by pais.country_name asc;