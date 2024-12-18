package X;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* renamed from: X.08w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC022408w {
    public static final android.net.Uri A01 = android.net.Uri.parse("*");
    public static final android.net.Uri A00 = android.net.Uri.parse("");

    public static void A03(WebView webView) {
        if (SVN.A0a.A01()) {
            A00(webView).A00();
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static void A04(WebView webView, InterfaceC65304Thc interfaceC65304Thc, String str, java.util.Set set) {
        if (SVN.A0a.A01()) {
            A00(webView).A01(interfaceC65304Thc, str, (String[]) set.toArray(new String[0]));
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static SND A00(WebView webView) {
        return new SND(A02(webView));
    }

    public static InterfaceC65568Tn1 A01() {
        return AbstractC61645RrH.A00();
    }

    public static WebViewProviderBoundaryInterface A02(WebView webView) {
        return A01().ANX(webView);
    }
}
