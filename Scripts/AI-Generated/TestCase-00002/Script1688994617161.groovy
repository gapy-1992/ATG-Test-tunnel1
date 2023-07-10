import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_trien-khai-du-an-dai-hoc-khong-rac-thai-dau-tien'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/2021/10/trien-khai-du-an-dai-hoc-khong-rac-thai-dau-tien')

'step 2: Add visual checkpoint at Page_trien-khai-du-an-dai-hoc-khong-rac-thai-dau-tien'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00002_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
