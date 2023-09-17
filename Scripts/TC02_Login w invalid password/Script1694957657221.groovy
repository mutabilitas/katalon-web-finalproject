import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

def randomNo = org.apache.commons.lang.RandomStringUtils.randomNumeric(3)

def initialPass = 'payattent+987'

def invalidPass = initialPass.replace('987', randomNo.toString())

WebUI.callTestCase(findTestCase('Reusable/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Homepage/header_About'), 0)

WebUI.click(findTestObject('Homepage/btn_Profile'))

WebUI.waitForElementVisible(findTestObject('Login-Logout/popup_SignIn'), 0)

WebUI.verifyElementVisible(findTestObject('Login-Logout/popup_SignIn'))

WebUI.verifyElementVisible(findTestObject('Login-Logout/txt_Forgot your password'))

WebUI.verifyElementVisible(findTestObject('Login-Logout/txt_CREATE NEW ACCOUNT'))

WebUI.verifyElementVisible(findTestObject('Login-Logout/txt_Username'))

WebUI.setText(findTestObject('Login-Logout/input_Username'), GlobalVariable.validUsername)

WebUI.verifyElementVisible(findTestObject('Login-Logout/txt_Password'))

WebUI.setText(findTestObject('Login-Logout/input_Password'), invalidPass)

WebUI.verifyElementVisible(findTestObject('Login-Logout/input_Password'))

WebUI.verifyElementVisible(findTestObject('Login-Logout/txt_REMEMBER ME'))

WebUI.verifyElementVisible(findTestObject('Login-Logout/btn_SignIn'))

WebUI.click(findTestObject('Login-Logout/btn_SignIn'))

WebUI.verifyElementPresent(findTestObject('Login-Logout/txt_Incorrect credentials'), 0)

WebUI.verifyElementNotVisible(findTestObject('Login-Logout/txt_signedUser'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

