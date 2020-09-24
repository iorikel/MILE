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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.mile.app/request-demo')

WebUI.click(findTestObject('Object Repository/Fill by Error/button_Request Demo'))

WebUI.setText(findTestObject('Object Repository/Fill by Error/input_Full name_name'), '')

WebUI.setText(findTestObject('Object Repository/Fill by Error/input_Company name_organization_name'), 'PT Selamat Sentosa')

WebUI.click(findTestObject('Object Repository/Fill by Error/button_Request Demo'))

WebUI.setText(findTestObject('Object Repository/Fill by Error/input_Full name_name'), 'Chyntia Vilanie')

WebUI.click(findTestObject('Object Repository/Fill by Error/button_Request Demo'))

WebUI.setText(findTestObject('Object Repository/Fill by Error/input_Phone number_phone'), '82210663344')

WebUI.click(findTestObject('Object Repository/Fill by Error/span_Request Demo'))

WebUI.setText(findTestObject('Object Repository/Fill by Error/input_Email_email'), 'chyntia99@gmail.com')

WebUI.click(findTestObject('Object Repository/Fill by Error/span_Request Demo'))

WebUI.closeBrowser()

