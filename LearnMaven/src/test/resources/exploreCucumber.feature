Feature: Verify that the new user registration is successful after passing correct inputs.
Scenario: Test Cucumber with maven
Given the user on the user registration page.
When user enter invalid data on the page
| Fields                 | Values              |
| First Name             | Preeti              |
| Last Name              | Sharma              |
| Email Address          | someone@gmail.com   |
| Re-enter Email Address | someone@gmail.com   |
| Password               |PASSWORD             |
| Birthdate              | 02                  |
Then the user registration should be successful.