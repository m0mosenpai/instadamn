package X;

import android.app.Activity;
import android.view.View;

/* loaded from: classes8.dex */
public final class M5R implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C7AC A01;
    public final /* synthetic */ String A02;

    public M5R(Activity activity, C7AC c7ac, String str) {
        this.A01 = c7ac;
        this.A00 = activity;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7AC c7ac = this.A01;
        View view = c7ac.A03;
        int A0B = AbstractC166987dD.A0B(AbstractC166987dD.A07(view), -0.3f);
        int height = view.getHeight() / 2;
        C5SU A0Q = AbstractC31178DnM.A0Q(this.A00, view, this.A02);
        A0Q.A01();
        A0Q.A0B = false;
        A0Q.A0A = true;
        A0Q.A04(view, A0B, height, true);
        A0Q.A00().A07(c7ac.A0A);
    }
}
