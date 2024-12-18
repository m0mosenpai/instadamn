package X;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes10.dex */
public final class TPG implements Runnable {
    public final /* synthetic */ InterfaceC65188TfW A00;
    public final /* synthetic */ CountDownLatch A01;

    public TPG(InterfaceC65188TfW interfaceC65188TfW, CountDownLatch countDownLatch) {
        this.A00 = interfaceC65188TfW;
        this.A01 = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C63642Sr8 c63642Sr8 = (C63642Sr8) this.A00;
        if (SVN.A0S.A01()) {
            c63642Sr8.A00.getCookieManager().removeAllCookies(new C63524Sor(this.A01, 3));
            return;
        }
        throw AbstractC166987dD.A1D("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
