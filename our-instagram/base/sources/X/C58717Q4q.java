package X;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.Q4q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58717Q4q extends WebViewClient {
    public C62698SMm A00;
    public Executor A01;
    public final List A03 = AbstractC58322PtE.A0z();
    public final List A05 = AbstractC58322PtE.A0z();
    public final List A06 = AbstractC58322PtE.A0z();
    public final List A02 = AbstractC58322PtE.A0z();
    public final List A04 = AbstractC58322PtE.A0z();

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        this.A01.execute(new RunnableC64670TPb(webResourceRequest, webView, this));
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.RsB, java.lang.Object] */
    public C58717Q4q(R7U r7u, Executor executor) {
        this.A01 = executor;
        r7u.addJavascriptInterface(new SKG(new C63902Svd(r7u, this)), "_FBIXLoggingBridge");
        ?? obj = new Object();
        C62411SAl c62411SAl = new C62411SAl(this);
        this.A04.add(new C63906Svh(obj));
        this.A02.add(new C63903Sve(c62411SAl, obj));
    }

    public final void A00(String str) {
        if (!AbstractC116315Ok.A00(str) && AbstractC63387Sj3.A04(android.net.Uri.parse(str))) {
            this.A01.execute(new TN7(this, str));
            C62698SMm c62698SMm = this.A00;
            if (c62698SMm != null) {
                c62698SMm.A00(str);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.A01.execute(new RunnableC64669TPa(webView, this, str));
        A00(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        A00(str);
        C62698SMm c62698SMm = this.A00;
        if (c62698SMm != null) {
            c62698SMm.A00.execute(new TN8((R7U) webView, c62698SMm));
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (AbstractC116315Ok.A00(str) || ReactWebViewManager.BLANK_URL.equals(str)) {
            return true;
        }
        C62698SMm c62698SMm = this.A00;
        if (c62698SMm != null) {
            List list = c62698SMm.A05;
            synchronized (list) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AbstractC166987dD.A15("shouldOverrideUrlLoading");
                }
            }
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return null;
    }
}
