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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://moxieleadlda-dev.outsystemscloud.com/SandboxReactive_AT/Login')

WebUI.setText(findTestObject('Object Repository/Sample Products/Page_Login/input_Username_Input_UsernameVal'), 'admilson.tavares@moxie.pt')

WebUI.setEncryptedText(findTestObject('Object Repository/Sample Products/Page_Login/input_Password_Input_PasswordVal'), 'EvhPRo7aIGB2E+wceZUUpQ==')

WebUI.click(findTestObject('Object Repository/Sample Products/Page_Login/input_Password_Checkbox1'))

WebUI.click(findTestObject('Object Repository/Sample Products/Page_Login/button_Login'))

WebUI.setText(findTestObject('Object Repository/Sample Products/Page_Products/input_Product List_Input_TextVar'), 'edit demo')

WebUI.click(findTestObject('Object Repository/Sample Products/Page_Products/span_Black and silver headphones - edit demo'))

WebUI.setText(findTestObject('Object Repository/Sample Products/Page_ProductDetail/input_Name_Input_Name'), 'Black and silver headphones - admilson tests')

WebUI.click(findTestObject('Object Repository/Sample Products/Page_ProductDetail/button_Save'))

WebUI.setText(findTestObject('Object Repository/Sample Products/Page_Products/input_Product List_Input_TextVar'), 'admilson tests')

WebUI.click(findTestObject('Object Repository/Sample Products/Page_Products/span_Black and silver headphones - admilson tests'))

WebUI.click(findTestObject('Object Repository/Sample Products/Page_ProductDetail/img_Save_OSFillParent'))

WebUI.setText(findTestObject('Object Repository/Sample Products/Page_ProductDetail/input_Name_Input_Name'), 'Black and silver headphones - edit demo')

WebUI.click(findTestObject('Object Repository/Sample Products/Page_ProductDetail/button_Save'))

WebUI.setText(findTestObject('Object Repository/Sample Products/Page_Products/input_Product List_Input_TextVar'), 'edit demo')

WebUI.closeBrowser()

