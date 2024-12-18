package X;

/* loaded from: classes5.dex */
public final class BWA implements InterfaceC118965aD {
    public final /* synthetic */ InterfaceC09670ek A00;
    public final /* synthetic */ C07X A01;
    public final /* synthetic */ C25660BVw A02;
    public final /* synthetic */ InterfaceC16660sJ A03;

    public BWA(InterfaceC09670ek interfaceC09670ek, C07X c07x, C25660BVw c25660BVw, InterfaceC16660sJ interfaceC16660sJ) {
        this.A03 = interfaceC16660sJ;
        this.A02 = c25660BVw;
        this.A01 = c07x;
        this.A00 = interfaceC09670ek;
    }

    @Override // X.InterfaceC118965aD
    public final void dispose() {
        this.A03.invoke(Integer.valueOf(this.A02.A00.A03()));
        this.A01.getLifecycle().A0A(this.A00);
    }
}
