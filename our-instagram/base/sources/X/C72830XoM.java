package X;

/* renamed from: X.XoM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72830XoM {
    public final InterfaceC178897x1 A00;
    public final InterfaceC178897x1 A02;
    public final Object A01 = AbstractC58318PtA.A0b();
    public volatile boolean A03 = false;

    public final void A00() {
        Object obj = this.A01;
        synchronized (obj) {
            this.A03 = false;
            obj.notifyAll();
        }
        this.A00.release();
        this.A02.release();
    }

    public C72830XoM(InterfaceC178897x1 interfaceC178897x1, int i) {
        this.A00 = interfaceC178897x1;
        this.A02 = C178917x3.A00(i);
    }
}
