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

WebUI.callTestCase(findTestCase('Reusable/Successful Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Homepage/header_About'), 0)

WebUI.verifyElementVisible(findTestObject('Homepage/div_Mice'))

WebUI.click(findTestObject('Homepage/div_Mice'))

WebUI.waitForElementVisible(findTestObject('Product-Mice/h3_MICE'), 0)

WebUI.verifyElementVisible(findTestObject('Product-Mice/img_HPZ3200'))

WebUI.verifyElementVisible(findTestObject('Product-Mice/link_HP Z3200 Wireless Mouse'))

WebUI.click(findTestObject('Product-Mice/link_HP Z3200 Wireless Mouse'))

WebUI.waitForElementVisible(findTestObject('Product-Mice/HP Z3200/h1_HP Z3200 WIRELESS MOUSE'), 0)

WebUI.verifyElementVisible(findTestObject('Product-Mice/HP Z3200/h1_HP Z3200 WIRELESS MOUSE'))

WebUI.verifyElementVisible(findTestObject('Product-Mice/HP Z3200/txt_PriceorSoldOut'))

WebUI.verifyElementVisible(findTestObject('Product-Mice/HP Z3200/h2_Color'))

WebUI.verifyElementVisible(findTestObject('Product-Mice/HP Z3200/label_Quantity'))

WebUI.verifyElementVisible(findTestObject('Product-Mice/HP Z3200/button_ADD TO CART'))

WebUI.closeBrowser()

