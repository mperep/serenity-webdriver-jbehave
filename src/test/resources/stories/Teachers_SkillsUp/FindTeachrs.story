Story: Find teachers in  SkillsUp school
Narrative:
In order to find teacher and find out which cource he teaches
As an SkillsUp student
I want to look up teachers in SkillsUp school

Scenario: Find teachers
Given the user is on the Our Team page
When the user find teacher <teacher>
Then they should see the name <name> and cource <cource>

Examples:
|teacher||name||cource|
|Александр Галковский||Александр Галковский||Diving into Java|
|Михаил Чокан||Михаил Чокан||Руководитель учебного курса|

Scenario: Find cource for teacher 'Александр Галковский'
Given the user is on the Teacher page
When the user click on card of teacher 'Александр Галковский'
Then they should see the cource 'Diving into Java'

Scenario: Find all teachers
Given the user is on the Our Team page
Then they should see the name and cource contains:
|name|cource|
|Александр Галковский|Diving into Java|
