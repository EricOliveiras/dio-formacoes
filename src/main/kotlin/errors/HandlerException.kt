package errors

class UserAlreadyExistsException: RuntimeException("User already exist.")
class UserNotFoundException: RuntimeException("User not found")
class AppErrorException: RuntimeException("Error starting the application.")
class EducationalContentNotFoundException: RuntimeException("Educational content not found.")