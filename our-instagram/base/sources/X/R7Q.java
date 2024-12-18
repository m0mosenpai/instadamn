package X;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

/* loaded from: classes10.dex */
public final class R7Q extends AbstractC62760SPs {
    public final long A00;
    public final /* synthetic */ C63178Sed A01;

    @Override // X.AbstractC62760SPs
    public final void A00(WebView webView, int i, String str, String str2) {
        AbstractC25233BEq.A0v(0, webView, str, str2);
        super.A00(webView, i, str, str2);
        this.A01.A02(this.A00, i, str);
    }

    public R7Q(C63178Sed c63178Sed, long j) {
        this.A01 = c63178Sed;
        this.A00 = j;
    }

    @Override // X.AbstractC62760SPs
    public final void A01(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        AbstractC167027dH.A12(webView, sslErrorHandler, sslError);
        super.A01(webView, sslErrorHandler, sslError);
        this.A01.A02(this.A00, sslError.getPrimaryError(), "");
    }

    @Override // X.AbstractC62760SPs
    public final void A03(WebView webView, String str) {
        AbstractC167017dG.A1N(webView, str);
        super.A03(webView, str);
        C63178Sed c63178Sed = this.A01;
        long j = this.A00;
        synchronized (c63178Sed) {
            SJV sjv = (SJV) c63178Sed.A03.get(Long.valueOf(j));
            if (sjv != null) {
                sjv.A04 = C05F.A0C;
                sjv.A01 = c63178Sed.A01.now() - sjv.A02;
                C63178Sed.A00(c63178Sed, j);
                C63178Sed.A01(c63178Sed, j);
            }
        }
    }
}
