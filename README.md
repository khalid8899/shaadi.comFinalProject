Pre-requisite required: Java Jdk 1.8.0_144, Eclipse photon, Test NG for eclipse, Cucumber Eclipse plugin Download Eclipse from below URL. https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/photon/R/eclipse-jee-photon-R-win32-x86_64.zip 

Steps to install cucumber plugin:

Launch the Eclipse IDE and from Help menu, click “Install New Software”
You will see a dialog window, click “Add” button.
Type name as you wish, let’s take “Cucumber” and type “http://cucumber.github.com/cucumber-eclipse/update-site” as location. Click OK.
you must see Cucumber Eclipse Plugin option in the available software list. Just Check the box and press “Next” button.
Click on Next.
Click “I accept the terms of the license agreement” then click Finish.
Let it install, it will take few seconds to complete.
You may or may not encounter a Security warning, if in case you do just click OK.
You are all done now, just Click Yes.
Steps to install Test NG plugin:

Launch the Eclipse IDE and from Help menu, click “Eclipse Market place”
Type Test Ng inside Find input field and click on search icon.
Test Ng for Eclipse Option will display, click install and proceed with the installation.
Restart eclipse once all setup is done.
Steps to import project from GIT to Local Drive:

Go to https://github.com/khalid8899/openWeatherDemo.git
Click on download->Download Zip(project will be download)
Unzip project and save it on your local drive.
Launch Eclipse IDE and select Workspace (Eclipse will open)
Click on File->import->Click on Maven
Select Existing Maven Projects and click on next.
Browse Root Directory and go to the project location.
Click on web folder , projects with POM file is display.
Select POM.XML file and click on finish.
Project will be imported on eclipse(wait until all files are imported)
Steps for Execution: There are 2 ways for execution.

Explore the project and go to the Test Runner Class file(src/main/java)
Under tag option you can enter tag details provided in cucumber feature file.
You can run all test cases simultaneously using @smoke common tag or by providing one test case tag detail i.e TC_001 and so on.
Right Click on Test runner class file and select Run as Test NG Test.
Execution will start for provided test case tag name.
Another way to execute is go to the “openWeather.feature” file(under feature folde)
Right click on feature file and select Run as Cucumber feature
Execution will start and test cases will be executed.
Reports:

After execution all the validation details will be printed on console.
Reports will be generated in Test Ng result format on console.
You can also go to target folder for different reports format.
Framework details:

Framework is divided into 3 parts 1)Cucumber feature file 2)Step definition class 3)Page object class 2)Single specific feature can be tested by providing cucumber tag inside test runner class(under tag option). 3)Feature file is inside feature folder, tag details is present for all the test cases as well as common tag to run all scripts.
