package com.test

class LoginController {

    static responseFormats = ['json']

    def getData() {
        Map result = [:]
        result.success = true
        result.foo = "bar"
        result.user = User.first()
        result.roles = ["ROLE_ADMIN", "ROLE_USER"]

        respond(result)
    }
}
