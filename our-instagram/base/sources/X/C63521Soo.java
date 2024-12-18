package X;

import android.webkit.DownloadListener;
import android.webkit.WebView;

/* renamed from: X.Soo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63521Soo implements DownloadListener {
    public final /* synthetic */ Rb0 A00;

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        C14360o3.A0B(str, 0);
        Rb0 rb0 = this.A00;
        AbstractC63262SgL.A00(rb0.requireContext(), str, false);
        WebView webView = rb0.A02;
        if (webView != null && str.equals(webView.getUrl()) && webView.canGoBack()) {
            webView.goBack();
        }
    }

    public C63521Soo(Rb0 rb0) {
        this.A00 = rb0;
    }
}
