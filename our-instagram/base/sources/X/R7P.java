package X;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.HashMap;
import org.json.JSONException;

/* loaded from: classes10.dex */
public final class R7P extends AbstractC62760SPs {
    public SI8 A00;

    @Override // X.AbstractC62760SPs
    public final void A02(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.A02(webView, webResourceRequest, webResourceError);
        SI8 si8 = this.A00;
        if (si8 != null) {
            int errorCode = webResourceError.getErrorCode();
            String charSequence = webResourceError.getDescription().toString();
            String A0r = AbstractC58319PtB.A0r(webResourceRequest);
            C102884kP c102884kP = si8.A04;
            InterfaceC103384lE A0A = c102884kP.A0A();
            if (A0A != null) {
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put("domain", A0r);
                AbstractC166997dE.A1U(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, A1G, errorCode);
                A1G.put(DevServerEntity.COLUMN_DESCRIPTION, charSequence);
                C6FP.A03(si8.A03, c102884kP, AbstractC31179DnN.A0I(A1G).A00(), A0A);
            }
        }
    }

    @Override // X.AbstractC62760SPs
    public final void A03(WebView webView, String str) {
        super.A03(webView, str);
        SI8 si8 = this.A00;
        if (si8 != null) {
            C102884kP c102884kP = si8.A04;
            String str2 = "";
            String A0I = c102884kP.A0I();
            if (A0I != null) {
                str2 = A0I;
            }
            String str3 = "";
            String A0J = c102884kP.A0J();
            if (A0J != null) {
                str3 = A0J;
            }
            String str4 = "";
            String A0H = c102884kP.A0H();
            if (A0H != null) {
                str4 = A0H;
            }
            if ("POST".equals(str4) && !"".equals(str3) && str.contains("<html> <head>  <script> function post(input) { var sourceURI = input['inlineUrl'];var params = input['bodyParams'];var method = \"POST\"; var form = document.createElement(\"form\"); form.setAttribute(\"method\", method);   form.setAttribute(\"action\", sourceURI); var jsonObj = JSON.parse(params);for(var key in jsonObj) { if(jsonObj.hasOwnProperty(key)) { var hiddenField = document.createElement(\"input\");   hiddenField.setAttribute(\"type\", \"hidden\");    hiddenField.setAttribute(\"name\", key);      hiddenField.setAttribute(\"value\", jsonObj[key]);          form.appendChild(hiddenField); } } document.body.appendChild(form);form.submit(); }   </script>  </head> <body></body> </html>")) {
                try {
                    si8.A01.evaluateJavascript(String.format("post(%s)", AbstractC31171DnF.A0q().put("inlineUrl", str2).put("bodyParams", str3).toString()), null);
                } catch (JSONException e) {
                    AbstractC25241Le.A03("json exception body params needs to be in json format", e);
                }
            }
            SFQ sfq = si8.A02;
            sfq.A01 = str;
            if (sfq.A02) {
                sfq.A00.A04(si8.A01.canGoBack());
            }
            InterfaceC103384lE A0B = c102884kP.A0B(52);
            if (A0B != null) {
                C6FP.A03(si8.A03, c102884kP, AbstractC58320PtC.A0g(str), A0B);
            }
        }
    }

    @Override // X.AbstractC62760SPs
    public final void A04(WebView webView, String str, Bitmap bitmap) {
        super.A04(webView, str, bitmap);
        SI8 si8 = this.A00;
        if (si8 != null) {
            C102884kP c102884kP = si8.A04;
            InterfaceC103384lE A0B = c102884kP.A0B(51);
            if (A0B != null) {
                C6FP.A03(si8.A03, c102884kP, AbstractC31179DnN.A0I(str).A00(), A0B);
            }
            if (c102884kP.A0S(44, true)) {
                InterfaceC103384lE A09 = c102884kP.A09();
                SFQ sfq = si8.A02;
                if (!str.equals(sfq.A01) && A09 != null) {
                    C6FP.A03(si8.A03, c102884kP, AbstractC31179DnN.A0I(str).A00(), A09);
                }
                InterfaceC103384lE A0B2 = c102884kP.A0B(48);
                if (!str.equals(sfq.A01) && A0B2 != null) {
                    C6FX A0I = AbstractC31179DnN.A0I(str);
                    C6FG c6fg = si8.A03;
                    C6FP.A03(c6fg, c102884kP, AbstractC25227BEk.A0f(A0I, c6fg, 1), A0B2);
                }
            }
        }
    }
}
