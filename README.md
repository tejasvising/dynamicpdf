# dynamicpdf




# Request
- POST:  http://localhost:8080/pdf

## application.properties file config ->
```
  spring.application.name=demo
  server.port=8080
  spring.datasource.url=jdbc:mysql://localhost:3306/db2;
  spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
  spring.datasource.username=root
  spring.datasource.password=root
  spring.jpa.properties.hibernate.c3p0.min_size=5
  spring.jpa.properties.hibernate.c3p0.max_size=20
  spring.jpa.properties.hibernate.c3p0.timeout=300
```
## Results
<p align="center">
  <img src="Screenshot (22).png" width="auto" alt="accessibility text">
</p>
<p align="center">
  <img src="Screenshot (23).png" width="auto" alt="accessibility text">
</p>

# Body
```--data-raw 
{
"seller": "XYZ Pvt. Ltd.",
"sellerGstin": "29AABBCCDD121ZD",
"sellerAddress": "New Delhi, India",
"buyer": "Vedant Computers",
"buyerGstin": "29AABBCCDD131ZD",
"buyerAddress": "New Delhi, India",
"items": [
{
"name": "Product 1",
"quantity": "12 Nos",
"rate": 123.00,
"amount": 1476.00
}
]
}
```
