import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.fakeaddressgenerator.com')

WebUI.click(findTestObject('Object Repository/Page_Fake Address Generator All Ove/a_Sign Up'))

WebUI.setText(findTestObject('Object Repository/Page_Fake Address Generator All Ove/input_Email_sign-username'), 'przypadek2@jmail.ovh')

WebUI.setText(findTestObject('Page_Fake Address Generator All Ove/input_Password_sign-pwd'), 'karolek11')

WebUI.click(findTestObject('Object Repository/Page_Fake Address Generator All Ove/button_Create Your FAG Account'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.fakeaddressgenerator.com')

WebUI.setText(findTestObject('Object Repository/Page_Szybka i anonimowa poczta emai/input_KONTAKT_mailBox'), 'przypadek2')

WebUI.sendKeys(findTestObject('Object Repository/Page_Szybka i anonimowa poczta emai/input_KONTAKT_mailBox'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Szybka i anonimowa poczta emai/td_Welcome To FakeAddressGener'))

WebUI.click(findTestObject('Object Repository/Page_Szybka i anonimowa poczta emai/b_here'))

WebUI.click(findTestObject('Object Repository/Page_Szybka i anonimowa poczta emai/img_Login_logo'))

WebUI.closeBrowser()

