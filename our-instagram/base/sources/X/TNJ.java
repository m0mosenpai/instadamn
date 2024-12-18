package X;

import com.facebook.browser.lite.webview.SystemWebView;

/* loaded from: classes10.dex */
public final class TNJ implements Runnable {
    public final /* synthetic */ QF6 A00;
    public final /* synthetic */ String A01;

    public TNJ(QF6 qf6, String str) {
        this.A00 = qf6;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        QF6 qf6 = this.A00;
        ((SystemWebView) qf6).A04.loadUrl(this.A01);
    }
}
