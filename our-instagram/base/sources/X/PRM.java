package X;

/* loaded from: classes9.dex */
public final class PRM implements Runnable {
    public final /* synthetic */ C52000Myq A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    public PRM(C52000Myq c52000Myq, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = c52000Myq;
        this.A01 = interfaceC16660sJ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.invoke(this.A00);
    }
}
