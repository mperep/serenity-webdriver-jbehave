Story: Find information using search field

Narrative:
Search to find information using search field
In order to find information in site
As a user
I want to be able to look up detail information from search result

Scenario: Find position and cource for teachers
Given the user is on the Home page
When the user enter in input field word <word>
Then they should see the cource <cource> and position <position>

Examples:
|word||cource||position|
|Artem Loginov||Diving into Java||Senior Java Developer|
|Alexander||Diving into Java||Java Tech Leader|

Scenario: Find teacher and sertificate
Given the user is on the Home page
When the user enter in input field word <word>
Then they should see the name <name> and number of sertificate <sertificate>

Examples:
|word||name||sertificate|
|Alexander||Alexander Tsariov||06109150|

Scenario: Do not find teacher on russian lengiage
Given the user is on the Home page
When the user enter in input field name Александр Галковский
Then the user should see the result Alexander Galkovskiy
