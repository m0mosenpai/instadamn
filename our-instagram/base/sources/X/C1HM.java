package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Semaphore;

/* renamed from: X.1HM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1HM implements InterfaceC12870lZ {
    public static C1HM A06;
    public boolean A00;
    public boolean A01;
    public final C19740y2 A04;
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final AbstractRunnableC14200nk A03 = new AbstractRunnableC14200nk() { // from class: X.1HN
        @Override // java.lang.Runnable
        public final void run() {
            throw new RuntimeException();
        }

        {
            super(1559692924, 2, false, false);
        }
    };
    public final Semaphore A05 = new Semaphore(1);

    public C1HM(C19740y2 c19740y2) {
        this.A04 = c19740y2;
        C218914p.A03(EnumC220415e.A03, this);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-1535473142);
        if (this.A01) {
            if (this.A00) {
                this.A02.removeCallbacks(this.A03);
            }
            throw new RuntimeException();
        }
        C0f9.A0A(-359698558, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(346195037, C0f9.A03(-1108619083));
    }
}
