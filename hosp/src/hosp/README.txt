DESCRIPTION OF EACH FRAME:

1. LOGINFORM.JAVA

TWO BUTTONS: a. LOGIN button: if username or password invalid/ dont match with
			      database then go to FAIL_LOG.JAVA, else go to 
                              SUCESS_LOG.JAVA
	     b. CANCEL button: dispose the window

2. FAIL_LOG.JAVA

ONE BUTTON: a. OK button: display a message for login failure and go back to
			  LOGINFORM.JAVA

3. SUCESS_LOG.JAVA (mind the spelling please)

ONE BUTTON: a. OK button: go to MAINFORM.JAVA

4. MAINFORM.JAVA

FIVE BUTTONS: a. REGISTER button: when clicked, go to REGISTER.JAVA
	      b. PATIENT RECORD button: when clicked, go to
                 SEARCHFOR_PATIENT.JAVA 
              c. STAFF RECORD button: when clicked, go to STAFFREC.JAVA
              d. STOCK RECORD button: when clicked, go to STOCKREC.JAVA
              e. ABOUT US button: not coded yet

5. REGISTER.JAVA
opens registration form of patient
ONE BUTTON: a. NEXT button: when clicked, save data and go to SUCCESS_REG.JAVA

5.a. SUCCESS_REG.JAVA

ONE BUTTON: a. OK button: when clicked, go to PATIENT_DIAGNOSIS.JAVA

5.b. PATIENT_DIAGNOSIS.JAVA
info related to diagnosis of a patient is added
TWO BUTTONS: a. OK button: when clicked, should go to SUCCESS_PATDIAGNOSE.JAVA
                only when data is valid. data should be saved in database
             b. CANCEL button: dispose the window

5.c. SUCCESS_PATDIAGNOSE.JAVA

ONE BUTTON: a. OK button: when clicked, dispose window

6. SEARCHFOR_PATIENT.JAVA

TWO RADIOBUTTONS: a. By Name: it isnt coded yet. when clicked it should go to a
                              frame where name is entered and accordingly 
                              detail is displayed by going to PATIENT_REC.JAVA
                  b. By ID:   it isnt coded yet. when clicked it should go to a
                              frame where ID is entered and accordingly detail
                              is displayed by going to PATIENT_REC.JAVA 
6.a. PATIENT_REC.JAVA
here the details of a patient is displayed
TWO BUTTONS: a. OK button: when clicked, window disposed
	     b. EDIT button: when clicked, open REGISTER.JAVA to edit details

7. STAFFREC.JAVA

THREE RADIOBUTTONS: a. Show existing record: when clicked go to
                       STAFFREC_CURRENT.JAVA
                    b. Register a new member: when clicked go to 
                       STAFFREC_ADD.JAVA
                    c. Remove a member: not coded yet. when clicked
                       a member should be removed. 
                       IMPORTANT: when a staff member is removed so that its 
                       details are not present in staffrec_current but still 
                       exist in the database along with popping up 
                       STAFFREC_ADD.JAVA frame where the termination date of 
                       the staff removed is updated.

7.a. STAFFREC_CURRENT.JAVA

TWO BUTTONS: a. OK button: dispose the window
             b. EDIT button: there is an EDIT button next to each staff member
                             field. not coded yet.when clicked they should go
                             STAFFREC_ADD.JAVA

7.b. STAFFREC_ADD.JAVA
 TWO BUTTONS: a. OK button: when clicked, go to SUCCESS_STAFFADD.JAVA only when
                            details are valid, else no.
              b. CANCEL button: when clicked, dispose window.

8. STOCKREC.JAVA

THREE RADIOBUTTONS: a. Add a new medicine: when clicked, go to ADD_MEDICINE.JAVA
                    b. Remove a medicine: hasnt been coded yet. when clicked
                       a new frame should open where the required medicine is
                       removed
                    c. Show complete record: when clicked, go to 
                       MEDCOMPLETE_REC.JAVA

8.a. ADD_MEDICINE.JAVA

ONE BUTTON: a. OK button: when clicked, it should go to SUCCESS_MEDADD.JAVA only
                          if data is valid, else no.

8.b SUCCESS_MEDADD.JAVA

ONE BUTTON: a. OK button: when clicked, display successful addition of medicine
                          and dispose

8.c MEDCOMPLETE_REC.JAVA
complete data about medicine
                                          
                                           
                       
	 	