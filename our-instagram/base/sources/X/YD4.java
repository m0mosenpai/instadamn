package X;

/* loaded from: classes12.dex */
public final class YD4 implements YOw {
    public final Object A00;

    @Override // X.YOw
    public final void AGF(Xl5 xl5) {
    }

    @Override // X.YOw
    public final void ELC(InterfaceC73607YNx interfaceC73607YNx, Xl5 xl5, AbstractC73413YCe abstractC73413YCe) {
        if (abstractC73413YCe != null) {
            throw AbstractC166987dD.A15("effectId");
        }
        YIG yig = new YIG(interfaceC73607YNx, xl5, this);
        C72726Xly c72726Xly = xl5.A00.A04.A05;
        C72764Xmg c72764Xmg = new C72764Xmg(c72726Xly, yig);
        C72764Xmg c72764Xmg2 = c72726Xly.A01;
        if (c72764Xmg2 == null) {
            c72726Xly.A01 = c72764Xmg;
            c72726Xly.A00 = c72764Xmg;
        } else {
            c72764Xmg2.A00 = c72764Xmg;
            c72726Xly.A01 = c72764Xmg;
        }
    }

    public YD4(Object obj) {
        this.A00 = obj;
    }
}
