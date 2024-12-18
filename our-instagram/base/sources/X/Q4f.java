package X;

import android.content.Context;
import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* loaded from: classes10.dex */
public final class Q4f extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        if (!z2) {
            return false;
        }
        String extra = webView.getHitTestResult().getExtra();
        Context context = webView.getContext();
        if (extra == null) {
            return false;
        }
        new C63165SeP().A01().A00(context, AbstractC08820cl.A03(extra));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return true;
    }
}
