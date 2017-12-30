package koapi.config

import koapi.config.Config

interface IConfigReader {
    fun read() : Config
}