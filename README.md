Spring Boot Day 5 Exercise
Exercise Title: Input Validation and Global Error Handling
Objective:
Today you will add input validation to your DTO and handle validation errors using a global
exception handler. You will use standard Java validation annotations and customize error
responses.
Requirements:
1. Add validation annotations in UserDTO:
 - @NotBlank on name
 - @Email on email
2. Annotate controller methods with @Valid to enable validation.
3. Create a GlobalExceptionHandler class using @RestControllerAdvice.
4. Handle MethodArgumentNotValidException to return custom error messages.
5. Test your POST and PUT endpoints with valid and invalid inputs.
6. Ensure invalid input returns 400 Bad Request with proper message.
Bonus Task (Optional):
Create a custom error response structure with fields like:
- timestamp
- status
- error
- path
- message
Submission Checklist:
- UserDTO has validation annotations
- Controller uses @Valid
- GlobalExceptionHandler handles validation errors
- Proper error messages are returned for invalid input
- Bonus: Structured error format implemented (if attempted)
