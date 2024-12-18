package X;

import android.app.Activity;

/* loaded from: classes6.dex */
public final class GPM implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C32237EHv A01;
    public final /* synthetic */ C189478aR A02;

    public GPM(Activity activity, C32237EHv c32237EHv, C189478aR c189478aR) {
        this.A02 = c189478aR;
        this.A00 = activity;
        this.A01 = c32237EHv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.A02(this.A00, this.A01);
    }
}
