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

WebUI.callTestCase(findTestCase('Reusable/Adding product to cart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Homepage/btn_ShoppingCart'))

WebUI.waitForElementVisible(findTestObject('Shopping Cart/h3_SHOPPING CART (2)'), 0)

WebUI.verifyElementVisible(findTestObject('Shopping Cart/txt_HP Z3200 WIRELESS MOUSE'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Shopping Cart/span_COLOR_productColor'))

WebUI.verifyElementVisible(findTestObject('Shopping Cart/txt_Quantity'))

WebUI.verifyElementVisible(findTestObject('Shopping Cart/txt_TotalProductPrice'))

WebUI.verifyElementVisible(findTestObject('Shopping Cart/txt_TotalCartPrice'))

WebUI.verifyElementVisible(findTestObject('Shopping Cart/btn_CheckOut'))

WebUI.click(findTestObject('Shopping Cart/btn_Remove'))

WebUI.verifyElementNotVisible(findTestObject('Shopping Cart/txt_HP Z3200 WIRELESS MOUSE'))

WebUI.closeBrowser()

