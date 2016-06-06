Story: Find cost and size of cource in SkillsUp school

Narrative:
In order to find cource and find out cost and size of cource
As a user
I want to be able to look up cost and size of cource in SkillsUp school

Scenario: Find cost of cource
Given the user is on the cource page
When the user go to cource Эффективный лидер
Then they should see the cost <cost> and size <size>

Examples:
|cost||size|
|250 грн/занятие||12-16 человек|