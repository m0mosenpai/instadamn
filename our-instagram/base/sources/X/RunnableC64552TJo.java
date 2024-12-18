package X;

import com.facebook.browser.lite.webview.SystemWebView;

/* renamed from: X.TJo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64552TJo implements Runnable {
    public final /* synthetic */ QF6 A00;

    public RunnableC64552TJo(QF6 qf6) {
        this.A00 = qf6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((SystemWebView) this.A00).A04.reload();
    }
}
