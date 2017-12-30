package koapi.config

import koapi.config.Config
import koapi.config.IConfigReader

class FileConfigReader : IConfigReader {
    override fun read(): Config {
        return Config(url = "")
    }
}