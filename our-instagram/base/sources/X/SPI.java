package X;

import android.webkit.JavascriptInterface;
import com.facebook.browser.lite.webview.SystemWebView;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes10.dex */
public class SPI {
    public WeakReference A00;
    public boolean A02;
    public final SNG A04;
    public Map A01 = AbstractC166987dD.A1I();
    public final InterfaceC65483Tl0 A05 = new C63958Swi();
    public final InterfaceC65483Tl0 A03 = new C63959Swj(this, 0);

    public void A01(QF6 qf6, String str) {
        qf6.A0F(this.A05, AbstractC58318PtA.A0o(Locale.ROOT, "fbpay.sendMessage(\"%s\")", AbstractC166997dE.A1b(str, 1)), false);
    }

    @JavascriptInterface
    public final void sendMessage(String str) {
        C14360o3.A0B(str, 0);
        this.A04.A01(str, null);
    }

    public SPI(SNG sng) {
        this.A04 = sng;
    }

    public void A00(QF6 qf6) {
        this.A00 = AbstractC25225BEi.A16(qf6);
        ((SystemWebView) qf6).A04.addJavascriptInterface(this, "fbpayIAWBridge");
    }
}
