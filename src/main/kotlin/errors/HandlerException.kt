package errors

class UserAlreadyExistsException: RuntimeException("User already exist.")
class UserNotFoundException: RuntimeException("User not found")
class EducationalContentNotFoundException: RuntimeException("Educational content not found.")