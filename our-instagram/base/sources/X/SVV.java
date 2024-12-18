package X;

import android.webkit.WebSettings;
import com.facebook.secure.securewebview.SecureWebView;

/* loaded from: classes10.dex */
public final class SVV {
    public final WebSettings A00;

    public SVV(WebSettings webSettings) {
        this.A00 = webSettings;
    }

    public static void A00(SecureWebView secureWebView) {
        SVV secureSettings = secureWebView.getSecureSettings();
        C62990SaE c62990SaE = new C62990SaE();
        c62990SaE.A02();
        secureWebView.A01 = c62990SaE.A01();
        WebSettings webSettings = secureSettings.A00;
        String userAgentString = webSettings.getUserAgentString();
        C14360o3.A07(userAgentString);
        webSettings.setUserAgentString(C1FO.A01(userAgentString));
    }
}
