package X;

import com.facebook.browser.lite.BrowserLiteFragment;

/* loaded from: classes10.dex */
public final class TQX implements Runnable {
    public final /* synthetic */ BrowserLiteFragment A00;
    public final /* synthetic */ QF6 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public TQX(BrowserLiteFragment browserLiteFragment, QF6 qf6, String str, String str2) {
        this.A00 = browserLiteFragment;
        this.A03 = str;
        this.A01 = qf6;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.A03;
        QF6 qf6 = this.A01;
        if (str.equals(qf6.A05())) {
            qf6.A0G(this.A02);
        }
    }
}
