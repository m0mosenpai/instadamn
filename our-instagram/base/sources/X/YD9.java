package X;

/* loaded from: classes12.dex */
public final class YD9 implements YOw {
    public C72760Xmc A00;
    public final InterfaceC73608YNy A01;

    @Override // X.YOw
    public final void AGF(Xl5 xl5) {
        C72760Xmc c72760Xmc = this.A00;
        if (c72760Xmc != null) {
            C73296Xzl.A00(xl5.A00.A04.A03).A00.remove(c72760Xmc);
            this.A00 = null;
        }
    }

    @Override // X.YOw
    public final void ELC(InterfaceC73607YNx interfaceC73607YNx, Xl5 xl5, AbstractC73413YCe abstractC73413YCe) {
        if (abstractC73413YCe != null) {
            throw AbstractC166987dD.A15("effectId");
        }
        C72760Xmc c72760Xmc = new C72760Xmc(interfaceC73607YNx, xl5, this);
        this.A00 = c72760Xmc;
        C73296Xzl.A00(xl5.A00.A04.A03).A00(c72760Xmc);
    }

    public YD9(Class cls) {
        this.A01 = new YDG(0, this, cls);
    }

    public YD9(InterfaceC73608YNy interfaceC73608YNy) {
        this.A01 = interfaceC73608YNy;
    }

    public YD9() {
        this.A01 = new YDF(this);
    }
}
