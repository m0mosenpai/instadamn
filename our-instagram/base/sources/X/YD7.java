package X;

/* loaded from: classes12.dex */
public final class YD7 implements YOw {
    public YD9 A00;
    public final XXq A01;
    public final InterfaceC73608YNy A02;

    @Override // X.YOw
    public final void AGF(Xl5 xl5) {
        YD9 yd9 = this.A00;
        if (yd9 != null) {
            yd9.AGF(xl5);
            this.A00 = null;
        }
    }

    @Override // X.YOw
    public final void ELC(InterfaceC73607YNx interfaceC73607YNx, Xl5 xl5, AbstractC73413YCe abstractC73413YCe) {
        YD9 yd9 = new YD9(this.A02);
        this.A00 = yd9;
        yd9.ELC(new YDB(interfaceC73607YNx, this), xl5, abstractC73413YCe);
        new YD4(this.A01).ELC(new YDA(this), xl5, abstractC73413YCe);
    }

    public YD7(XXq xXq, Class cls) {
        this.A01 = xXq;
        this.A02 = new YDG(1, this, cls);
    }
}
