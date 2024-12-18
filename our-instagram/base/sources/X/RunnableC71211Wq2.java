package X;

import android.view.View;

/* renamed from: X.Wq2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71211Wq2 implements Runnable {
    public final /* synthetic */ WPW A00;

    public RunnableC71211Wq2(WPW wpw) {
        this.A00 = wpw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WPW wpw = this.A00;
        View view = wpw.A06;
        if (view != null && view.getWindowToken() != null) {
            wpw.show();
        }
    }
}
