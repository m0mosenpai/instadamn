package X;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Q4n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58715Q4n extends WebViewClient {
    public final String A00;
    public final /* synthetic */ C63279Sge A01;

    public C58715Q4n(C63279Sge c63279Sge, String str) {
        C14360o3.A0B(str, 2);
        this.A01 = c63279Sge;
        this.A00 = str;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        AbstractC25233BEq.A0v(0, webView, str, str2);
        super.onReceivedError(webView, i, str, str2);
        C63279Sge.A01(this.A01, this.A00);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        AbstractC167017dG.A1N(webView, str);
        super.onPageFinished(webView, str);
        C63279Sge c63279Sge = this.A01;
        String str2 = this.A00;
        synchronized (c63279Sge) {
            Map map = c63279Sge.A05;
            C68961Vez c68961Vez = (C68961Vez) map.get(str2);
            if (c68961Vez != null) {
                Integer num = C05F.A0C;
                c68961Vez.A00 = num;
                Iterator A15 = AbstractC166997dE.A15(map);
                while (A15.hasNext() && ((C68961Vez) AbstractC31176DnK.A0j(A15)).A00 == num) {
                }
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        AbstractC167027dH.A12(webView, sslErrorHandler, sslError);
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C63279Sge.A01(this.A01, this.A00);
    }
}
