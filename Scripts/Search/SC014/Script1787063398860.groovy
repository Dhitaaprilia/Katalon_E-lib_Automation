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

WebUI.openBrowser(null)

WebUI.navigateToUrl('https://library.trunojoyo.ac.id/elib/index.php')

WebUI.setText(findTestObject('SC014-Very Long Keyword/Page_e-Libs  TRUNOJOYO Library/input_search'), 'Fast food drinks with various types of toping are becoming the current trend. But the presentation is still done manually so it is less efficient. The solution to this problem is the development of technology in the field of food and beverages. One example is the fast food drink machine. Fast food drinks machines are machines that can work automatically in the process of making and ordering drinks. In general, fast-food machines, users order drinks by visiting the machine and waiting for them to finish. Based on these problems a thought was formed to create an Arduino-based fast-food beverage maker with Android controls that can help users in the case of fast-food drinks. The output of the machine is both fast food and toping served in a paper cup. Users simply choose what drink menu they want on an Android Smartphone connected to the machine with wifi, then the machine will make it according to the menu selected. Users only need to take drinks in the space provided.')

WebUI.click(findTestObject('SC014-Very Long Keyword/Page_e-Libs  TRUNOJOYO Library/input_searchSubmit'))

WebUI.closeBrowser()

