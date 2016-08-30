package example

class UserController {
    UserService userService = new UserService()

    User createUser(String email, String name) {
        User user = userService.createUser(email, name)

        userService.sendWelcomeEmail(user)

        return user
    }
}
