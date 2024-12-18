package X;

import android.text.TextUtils;
import com.facebook.browser.lite.BrowserLiteFragment;

/* renamed from: X.TPc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64671TPc implements Runnable {
    public final /* synthetic */ QF4 A00;
    public final /* synthetic */ QF6 A01;
    public final /* synthetic */ String A02;

    public RunnableC64671TPc(QF4 qf4, QF6 qf6, String str) {
        this.A00 = qf4;
        this.A01 = qf6;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        QF6 qf6 = this.A01;
        BrowserLiteFragment browserLiteFragment = this.A00.A0E;
        if (qf6 == browserLiteFragment.C9a() && TextUtils.equals(qf6.A05(), this.A02)) {
            AbstractC25226BEj.A1Q(browserLiteFragment);
        }
    }
}
