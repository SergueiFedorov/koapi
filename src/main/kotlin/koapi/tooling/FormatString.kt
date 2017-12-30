package koapi.tooling

fun String.formatString(input: Map<String, Any>) : String {

    val builder = StringBuilder()

    val iterator = this.iterator()
    while (iterator.hasNext()) {

        val value = iterator.next()
        if (value == '{') {

            val keyBuilder = StringBuilder()
            while (iterator.hasNext()) {
                val subValue = iterator.next()
                if (subValue == '}') {
                    builder.append(input[keyBuilder.toString()].toString())
                    break
                }

                keyBuilder.append(subValue)

            }

        }

    }

    return builder.toString()

}