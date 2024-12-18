package X;

import android.app.Activity;

/* loaded from: classes8.dex */
public final class M5S implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C7AC A01;
    public final /* synthetic */ String A02;

    public M5S(Activity activity, C7AC c7ac, String str) {
        this.A01 = c7ac;
        this.A00 = activity;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7AC c7ac = this.A01;
        C5SU A0Q = AbstractC31178DnM.A0Q(this.A00, c7ac.A07, this.A02);
        A0Q.A01();
        A0Q.A0B = false;
        A0Q.A0A = true;
        A0Q.A00().A07(c7ac.A0A);
    }
}
