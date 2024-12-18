package X;

/* loaded from: classes9.dex */
public final class PRN implements Runnable {
    public final /* synthetic */ C51759Mti A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    public PRN(C51759Mti c51759Mti, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = c51759Mti;
        this.A01 = interfaceC16660sJ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.invoke(this.A00);
    }
}
