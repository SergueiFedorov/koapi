package koapi.config

enum class HttpMethod {
    POST, GET
}

class Config(val url: String) {

    data class Endpoint(val name: String, val route: String, val parameters: Array<String>, val method: HttpMethod)

    private var endpoints : MutableMap<String, Endpoint> = mutableMapOf()

    fun insertEndpoint(name: String, route: String, parameters: Array<String>, method: HttpMethod) {
        endpoints[name] = Endpoint(
                name, route, parameters, method
        )
    }

    fun insertEndpoint(endpoint: Endpoint) {
        endpoints[endpoint.name] = endpoint
    }

    fun getEndpoint(name: String) : Endpoint {
        return endpoints[name]!!
    }
}