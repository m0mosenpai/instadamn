package X;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* loaded from: classes10.dex */
public class SKX {
    public final WebChromeClient A00 = new WebChromeClient();

    public void A00(WebView webView, int i) {
        this.A00.onProgressChanged(webView, i);
    }
}
