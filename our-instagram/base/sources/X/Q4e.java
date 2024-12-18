package X;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import net.trustly.android.sdk.views.TrustlyView;

/* loaded from: classes10.dex */
public final class Q4e extends WebChromeClient {
    public final /* synthetic */ TrustlyView A00;
    public final /* synthetic */ TrustlyView A01;

    public Q4e(TrustlyView trustlyView, TrustlyView trustlyView2) {
        this.A00 = trustlyView;
        this.A01 = trustlyView2;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.HitTestResult hitTestResult = webView.getHitTestResult();
        String extra = hitTestResult.getExtra();
        if (hitTestResult.getType() == 0) {
            Q5C q5c = new Q5C(webView.getContext());
            this.A01.addView(q5c);
            ((WebView.WebViewTransport) message.obj).setWebView(q5c.A00);
            message.sendToTarget();
            return true;
        }
        new C63165SeP().A01().A00(webView.getContext(), android.net.Uri.parse(extra));
        return false;
    }
}
