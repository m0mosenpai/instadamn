package X;

import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.browser.lite.ipc.PrefetchCacheEntry;

/* loaded from: classes10.dex */
public final class TNN implements Runnable {
    public final /* synthetic */ PrefetchCacheEntry A00;
    public final /* synthetic */ C62707SMv A01;

    public TNN(PrefetchCacheEntry prefetchCacheEntry, C62707SMv c62707SMv) {
        this.A01 = c62707SMv;
        this.A00 = prefetchCacheEntry;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C62707SMv c62707SMv = this.A01;
        WebView webView = c62707SMv.A01;
        if (webView == null) {
            com.facebook.secure.webkit.WebView webView2 = new com.facebook.secure.webkit.WebView(c62707SMv.A07);
            WebSettings settings = webView2.getSettings();
            settings.setAllowFileAccess(false);
            try {
                settings.setJavaScriptEnabled(true);
            } catch (NullPointerException unused) {
            }
            settings.setBlockNetworkLoads(true);
            webView2.setWebViewClient(new Q4s(c62707SMv, 0));
            c62707SMv.A01 = webView2;
        } else {
            webView.stopLoading();
        }
        PrefetchCacheEntry prefetchCacheEntry = this.A00;
        String str = prefetchCacheEntry.A03;
        c62707SMv.A04 = str;
        c62707SMv.A03 = prefetchCacheEntry;
        c62707SMv.A00 = System.currentTimeMillis();
        c62707SMv.A01.loadUrl(str);
    }
}
