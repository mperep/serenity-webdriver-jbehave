Story: Find teachers in  SkillsUp school
Narrative:
In order to find teacher and find out which cource he teaches
As an SkillsUp student
I want to look up teachers in SkillsUp school

Scenario: Find teacher 'Александр Галковский'
Given the user is on the Our Team page
When the user click on teacher 'Александр Галковский'
Then they should see the name 'Александр Галковский'

Scenario: Find cource for teacher 'Александр Галковский'
Given the user is on the Teacher page
When the user look up cource for teacher 'Александр Галковский'
Then they should see the name of cource for teacher 'Александр Галковский'