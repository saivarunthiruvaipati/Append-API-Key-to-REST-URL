def url = message.getHeader("CamelHttpUri")
def apiKey = "123456789"
message.setHeader("CamelHttpUri", url + "?apikey=" + apiKey)
return message
