package koapi

import koapi.config.Config
import koapi.config.IConfigReader

class Koapi(
        private val configReader : IConfigReader,
        private val prefetchConfig: Boolean = false
) {

    var config : Config? = null

    init {
        if (prefetchConfig) {
            this.loadConfig()
        }
    }

    private fun loadConfig() {
        this.config = configReader.read()
    }

    fun<T> call(name : String, args : T) {

        if(this.config == null) {
            this.loadConfig()
        }

        val endpoint = this.config!!.getEndpoint(name)

    }
}