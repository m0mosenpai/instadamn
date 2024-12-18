package X;

import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.webview.SystemWebView;

/* loaded from: classes4.dex */
public final class AU5 implements InterfaceC65626Tpm {
    public final /* synthetic */ BrowserLiteFragment A00;

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onDestroy(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStop(C07X c07x) {
    }

    public AU5(BrowserLiteFragment browserLiteFragment) {
        this.A00 = browserLiteFragment;
    }

    @Override // X.InterfaceC65626Tpm
    public final void onPause(C07X c07x) {
        BrowserLiteFragment browserLiteFragment = this.A00;
        BrowserLiteFragment.A0E(browserLiteFragment, browserLiteFragment.C9a());
    }

    @Override // X.InterfaceC65626Tpm
    public final void onResume(C07X c07x) {
        QF6 C9a = this.A00.C9a();
        if (C9a != null) {
            R7V r7v = ((SystemWebView) C9a).A04;
            r7v.onResume();
            r7v.resumeTimers();
        }
    }
}
