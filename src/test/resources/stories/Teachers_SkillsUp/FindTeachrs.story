Story: Find teachers in  SkillsUp school
Narrative:
In order to find teacher and find out which cource he teaches
As an SkillsUp student
I want to look up teachers in SkillsUp school

Scenario: Find teachers
Given the user is on the Home page
When the user go to Coache Page
Then they should see the name <name>

Examples:
|name|
|Александр Галковский|
|Михаил Чокан|
|Артем Карпов|
|Ева Корнеплянская|
|Илья|

Scenario: Find cources for teachers
Given the user is on the Our Team page
Then they should see the name and cource contains:
|name|cource|
|Александр Галковский||Diving into Java|
|Михаил Чокан||Руководитель учебного курса|
|Артем Карпов||Автоматизация тестирования ПО|
|Ева Корнеплянская||психология и музыка|
|Илья||Административная и операционная поддержка деятельности учебного центра|