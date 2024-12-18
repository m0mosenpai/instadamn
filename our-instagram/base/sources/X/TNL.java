package X;

import com.facebook.browser.lite.webview.SystemWebView;

/* loaded from: classes10.dex */
public final class TNL implements Runnable {
    public final /* synthetic */ AbstractC58879QEp A00;
    public final /* synthetic */ String A01;

    public TNL(AbstractC58879QEp abstractC58879QEp, String str) {
        this.A00 = abstractC58879QEp;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        QF6 qf6 = this.A00.A00;
        if (qf6 != null) {
            ((SystemWebView) qf6).A04.loadUrl(this.A01);
        }
    }
}
