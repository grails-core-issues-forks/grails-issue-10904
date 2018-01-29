package issue10904.demov1

class ExampleController {
//    static namespace = 'example.v1'
    static namespace = 'v1.example'

    def index() {
        render 'index - v1'
    }
}
