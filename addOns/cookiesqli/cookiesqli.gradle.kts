description = "Testing to create active addon for zap for sqli injection in cookies"

zapAddOn {
    addOnName.set("CookieSQLi")

    manifest {
        author.set("Created by Hardik")
    }
}

crowdin {
    configuration {
        val resourcesPath = "org/zaproxy/addon/${zapAddOn.addOnId.get()}/resources/"
        tokens.put("%messagesPath%", resourcesPath)
        tokens.put("%helpPath%", resourcesPath)
    }
}
