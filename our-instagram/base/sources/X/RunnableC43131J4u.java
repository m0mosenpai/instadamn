package X;

import android.os.Handler;

/* renamed from: X.J4u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43131J4u implements Runnable {
    public final /* synthetic */ C38482Gw3 A00;
    public final /* synthetic */ C42315Iod A01;

    public RunnableC43131J4u(C38482Gw3 c38482Gw3, C42315Iod c42315Iod) {
        this.A01 = c42315Iod;
        this.A00 = c38482Gw3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C42315Iod c42315Iod = this.A01;
        if (c42315Iod.A01.A02) {
            C38482Gw3 c38482Gw3 = this.A00;
            I64.A00(c38482Gw3, c42315Iod);
            Handler handler = c38482Gw3.A01;
            Runnable runnable = c38482Gw3.A00;
            C14360o3.A0A(runnable);
            handler.postDelayed(runnable, 1000L);
        }
    }
}
