package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.AwV, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24689AwV implements Runnable {
    public final /* synthetic */ C7SC A00;
    public final /* synthetic */ String A01;

    public RunnableC24689AwV(C7SC c7sc, String str) {
        this.A00 = c7sc;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7SC c7sc = this.A00;
        Activity activity = c7sc.A01;
        String str = this.A01;
        View BKF = c7sc.BKF();
        C5SU c5su = new C5SU(activity, new C149686oL(str));
        c5su.A03(BKF);
        c5su.A02();
        c5su.A0B = true;
        c5su.A0A = true;
        c5su.A00().A07(c7sc.A02);
    }
}
