package koapi.request

import koapi.config.Config
import koapi.config.HttpMethod

class HttpRequester : IRequester {

    fun get(endpoint: Config.Endpoint, args: Map<String, String>, model: Any) : String
    {
        val route = endpoint.route.format()

        return ""
    }

    override fun doRequest(endpoint: Config.Endpoint, args: Map<String, String>, model: Any) : Any {

        val result: String = when(endpoint.method) {
            HttpMethod.GET -> get(endpoint, args, model)
            else -> {
                return ""
            }
        }

        return Any()

    }

}