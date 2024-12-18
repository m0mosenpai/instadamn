package X;

/* renamed from: X.Axn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24765Axn implements Runnable {
    public final /* synthetic */ C9V3 A00;
    public final /* synthetic */ C195608l0 A01;
    public final /* synthetic */ BBC A02;

    public RunnableC24765Axn(C9V3 c9v3, C195608l0 c195608l0, BBC bbc) {
        this.A00 = c9v3;
        this.A01 = c195608l0;
        this.A02 = bbc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9V3 c9v3 = this.A00;
        InterfaceC195388ke interfaceC195388ke = c9v3.A0B;
        C195608l0 c195608l0 = this.A01;
        interfaceC195388ke.DNa(c9v3.A06, c195608l0.A03, this.A02, c195608l0.A02);
    }
}
