package X;

import android.view.View;

/* renamed from: X.Glx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37900Glx implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C149686oL A01;
    public final /* synthetic */ C37784Gjz A02;
    public final /* synthetic */ InterfaceC43437JHb A03;
    public final /* synthetic */ boolean A04;

    public RunnableC37900Glx(View view, C149686oL c149686oL, C37784Gjz c37784Gjz, InterfaceC43437JHb interfaceC43437JHb, boolean z) {
        this.A03 = interfaceC43437JHb;
        this.A02 = c37784Gjz;
        this.A01 = c149686oL;
        this.A00 = view;
        this.A04 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC43437JHb interfaceC43437JHb = this.A03;
        if (interfaceC43437JHb.CSz()) {
            C37784Gjz c37784Gjz = this.A02;
            C5SU c5su = new C5SU(c37784Gjz.A01, this.A01);
            View view = this.A00;
            c5su.A04(view, 0, (-view.getHeight()) / 2, true);
            c5su.A02();
            c5su.A04 = new C220479oX(7, interfaceC43437JHb, c37784Gjz);
            c5su.A0B = this.A04;
            c5su.A0A = false;
            C5SW A00 = c5su.A00();
            c37784Gjz.A00 = A00;
            A00.A07(c37784Gjz.A02);
        }
    }
}
