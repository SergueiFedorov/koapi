package koapi.request

import koapi.config.Config

interface IRequester {

    fun doRequest(endpoint: Config.Endpoint, args: Map<String, String>, model: Any) : Any
}