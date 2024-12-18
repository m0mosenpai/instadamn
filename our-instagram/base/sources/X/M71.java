package X;

import com.instagram.direct.ui.countdowntimer.CountdownTimerPill;

/* loaded from: classes8.dex */
public final class M71 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ CountdownTimerPill A02;
    public final /* synthetic */ InterfaceC16820sZ A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public M71(CountdownTimerPill countdownTimerPill, InterfaceC16820sZ interfaceC16820sZ, long j, long j2, boolean z, boolean z2) {
        this.A02 = countdownTimerPill;
        this.A00 = j;
        this.A01 = j2;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountdownTimerPill countdownTimerPill = this.A02;
        long j = this.A00;
        long j2 = CountdownTimerPill.A04;
        long j3 = this.A01;
        boolean z = this.A05;
        boolean z2 = this.A04;
        countdownTimerPill.A00 = new CountDownTimerC44379JjI(countdownTimerPill, this.A03, j, j3, j - j2, j2, z, z2).start();
    }
}
