# TaskAttempt
Class Persons This class will set the name, gender and Lists for Parents, Children and Spouse.

Class Family This class will utilise methods to add members to the family tree. 
  Method1: Boolean Male(): 
    - Will check if the person is present in tree 
    - IF TRUE 
      - Store person in checkPerson 
      - Check if person's spouse is male (IF SO return false)
      - Check if persons gender has been assigned (IF not, assign 'Male' and return true)
    - ELSE 
      - Make the person 
      - Set gender to male 
  
  Method2: Boolean Female(): 
    - Will be the same as Male() in terms of functionality. 
    
    
 Method3: Boolean isMale(): 
  -Will check if the person is present in tree 
     - IF TRUE
      -CHECK GENDER, if not male, return false
      -IF MALE truen true.
  -IF No person present, create and return false

Method4: Boolean isFemale():
  - Will be the same as isMale() in terms of functionality.

Boolean setParentsOf():
  - Will check if parent is present
     - If true, check if child is present
        - If true, check if this person is the child of the child (RETURN FALSE)
          - ELSE get thte size of the parentsList, IF 0- add parent, IF 1- check parents gender and react accordingly, 2 - return false;
        - ELSE return false.
     - IF no child present, add them and add parent, return true;
     
  - ELSE repeat above processes again.

String[] getParentsOf():
  - CHECK IF Person is present
      - IF TRUE, get parents list and store in a string array, return string array
      - ELSE make person and return empty array
      

String[] getChildrenOf():
  - CHECK IF Person is present
      - IF TRUE, get child list and store in a string array, return string array
      - ELSE make person and return empty array
      

Boolean ishere():
  - Checks if person is present in tree

Persons getPerson():
  - Gets the person and returns the object using .filter

Boolean checkMaleSpouse():
  - Checks if the spouse is male

Boolean isChild():
  - Checks if the person is the child of someone

