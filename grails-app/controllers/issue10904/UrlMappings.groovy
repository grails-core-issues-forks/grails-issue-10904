package issue10904

class UrlMappings {

    static mappings = {
//        "/some/rest/resourceV1" (resources: "example", namespace: "example.v1")
//        "/some/rest/resourceV2" (resources: "example", namespace: "example.v2")

        "/some/rest/resourceV1" (resources: "example", namespace: "v1.example")
        "/some/rest/resourceV2" (resources: "example", namespace: "v2.example")

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
