package issue10904.demov2

class ExampleController {
//    static namespace = 'example.v2'
    static namespace = 'v2.example'

    def index() {
        render 'index - v2'
    }
}
