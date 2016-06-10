Story: Find teachers in  SkillsUp school
Narrative:
In order to find teacher and find out which cource he teaches
As an SkillsUp student
I want to look up teachers in SkillsUp school

Scenario: Find teachers
Given the user is on the Home page
When the user go to Coache Page
Then user should see the name <name> and position <position>
Examples:
|name|position|
|Александр Галковский|тренер|
|Михаил Чокан|руководитель учебного центра|
|Артем Карпов|тренер|
|Ева Корнеплянская|контент-менеджер, тестировщик|
|Илья|координатор учебного центра|

Scenario: Find cources for teacher
Given the user is on the Coache page
When the user click on teacher`s name <name>
Then they should see the name of cource <cource>

Examples:
|name||cource|
|Александр Галковский||Diving into Java|
|Михаил Чокан||Руководитель учебного курса|
|Артем Карпов||Автоматизация тестирования ПО|
|Ева Корнеплянская||психология и музыка|
|Илья||Административная и операционная поддержка деятельности учебного центра|