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

WebUI.openBrowser('https://library.trunojoyo.ac.id/elib/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('LG005-Scriptless Valid Test/Page_e-Libs  TRUNOJOYO Library/a_Log in'))

WebUI.setText(findTestObject('LG005-Scriptless Valid Test/Page_e-Libs  TRUNOJOYO Library/input_ID Anggota_txtID'), '200411100102')

WebUI.setEncryptedText(findTestObject('LG005-Scriptless Valid Test/Page_e-Libs  TRUNOJOYO Library/input_Password_txtPassword'), 
    'OxULj3R6uKEQKWfLZm0hkA==')

WebUI.click(findTestObject('LG005-Scriptless Valid Test/Page_e-Libs  TRUNOJOYO Library/input_Password_searchSubmit'))

WebUI.verifyElementText(findTestObject('LG005-Scriptless Valid Test/Page_e-Libs  TRUNOJOYO Library/a_Home'), 'Home')

WebUI.closeBrowser()

