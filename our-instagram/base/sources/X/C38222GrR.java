package X;

import android.os.Handler;

/* renamed from: X.GrR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38222GrR {
    public Runnable A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(C38224GrT.A00);
    public final C37648Ghh A02;

    public final void A01(InterfaceC43393JFi interfaceC43393JFi) {
        C14360o3.A0B(interfaceC43393JFi, 0);
        C37648Ghh c37648Ghh = this.A02;
        C37651Ghk c37651Ghk = (C37651Ghk) c37648Ghh.A03.get(interfaceC43393JFi);
        if (c37651Ghk != null && c37651Ghk.equals(c37648Ghh.A01)) {
            c37651Ghk.A01.A03 = true;
        }
        C37651Ghk c37651Ghk2 = c37648Ghh.A01.A00;
        if (c37651Ghk2 != null) {
            c37648Ghh.A01 = c37651Ghk2;
            C37649Ghi c37649Ghi = c37651Ghk2.A01;
            c37649Ghi.A00.ELB(c37649Ghi, this);
        }
    }

    public C38222GrR(C37648Ghh c37648Ghh) {
        this.A02 = c37648Ghh;
    }

    public final void A00(C37729Gj4 c37729Gj4, InterfaceC43393JFi interfaceC43393JFi, long j) {
        AbstractC167017dG.A1N(interfaceC43393JFi, c37729Gj4);
        Runnable runnable = this.A00;
        if (runnable != null) {
            ((Handler) this.A01.getValue()).removeCallbacks(runnable);
        }
        RunnableC38223GrS runnableC38223GrS = new RunnableC38223GrS(c37729Gj4, interfaceC43393JFi, this);
        ((Handler) this.A01.getValue()).postDelayed(runnableC38223GrS, j);
        this.A00 = runnableC38223GrS;
    }
}
