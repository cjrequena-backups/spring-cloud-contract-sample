/**
 * Created by jgutierrez on 20/11/2017.
 */
org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'POST'
        urlPath '/producer-test/hotels'
        body("""{
          "id": 12,
          "description": "string",
          "email": "string",
          "fax": "string",
          "local_currency_code": "string",
          "name": "string",
          "phone": "string",
          "rate": "string",
          "test_long": 1,
          "test_boolean": true
        }""")
        headers {
            contentType(applicationJson())
        }
    }
    response {
        status 201
    }
}
