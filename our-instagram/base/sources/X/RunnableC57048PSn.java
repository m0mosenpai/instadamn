package X;

/* renamed from: X.PSn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57048PSn implements Runnable {
    public final /* synthetic */ OVi A00;
    public final /* synthetic */ InterfaceC16820sZ A01;
    public final /* synthetic */ InterfaceC16660sJ A02;

    public RunnableC57048PSn(OVi oVi, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = oVi;
        this.A01 = interfaceC16820sZ;
        this.A02 = interfaceC16660sJ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OVi oVi = this.A00;
        OVi.A00(oVi, this.A01);
        C51759Mti c51759Mti = oVi.A00;
        if (c51759Mti != null) {
            this.A02.invoke(c51759Mti);
        }
    }
}
