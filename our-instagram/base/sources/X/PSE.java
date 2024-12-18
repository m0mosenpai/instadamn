package X;

/* loaded from: classes9.dex */
public final class PSE implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC95144Qa A01;
    public final /* synthetic */ C41241vZ A02;

    public PSE(InterfaceC95144Qa interfaceC95144Qa, C41241vZ c41241vZ, int i) {
        this.A01 = interfaceC95144Qa;
        this.A00 = i;
        this.A02 = c41241vZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.Cxu(this.A00, this.A02.A0C);
    }
}
