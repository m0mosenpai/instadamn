package X;

/* loaded from: classes8.dex */
public final class M4F implements Runnable {
    public final /* synthetic */ C83693oE A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    public M4F(C83693oE c83693oE, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = c83693oE;
        this.A01 = interfaceC16660sJ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        C83693oE c83693oE = this.A00;
        InterfaceC16660sJ interfaceC16660sJ = this.A01;
        if (c83693oE != null) {
            obj = new C4JL(c83693oE);
        } else {
            obj = C4JK.A00;
            C14360o3.A07(obj);
        }
        interfaceC16660sJ.invoke(obj);
    }
}
