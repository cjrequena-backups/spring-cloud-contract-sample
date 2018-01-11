/**
 * Created by jgutierrez on 20/11/2017.
 */
org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'POST'
        url '/producer/hotels'
        body("""{
          "id": 6,
          "description": "string",
          "email": "string",
          "fax": "string",
          "local_currency_code": "string",
          "name": "string",
          "phone": "string",
          "rate": "string"
        }""")
        headers {
            header('''Accept''', '''*/*''')
            header('''Content-Type''', '''application/json''')
        }
    }
    response {
        status 201
    }
}
