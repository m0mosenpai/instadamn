package X;

import android.webkit.DownloadListener;
import android.webkit.WebView;

/* renamed from: X.Sop, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63522Sop implements DownloadListener {
    public final /* synthetic */ WebView A00;
    public final /* synthetic */ C60891Raz A01;

    public C63522Sop(WebView webView, C60891Raz c60891Raz) {
        this.A01 = c60891Raz;
        this.A00 = webView;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        AbstractC63262SgL.A00(this.A01.requireContext(), str, false);
        WebView webView = this.A00;
        if (C14360o3.A0K(str, webView.getUrl()) && webView.canGoBack()) {
            webView.goBack();
        }
    }
}
