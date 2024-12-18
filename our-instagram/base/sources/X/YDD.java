package X;

/* loaded from: classes12.dex */
public final class YDD implements InterfaceC73607YNx {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC73607YNx A01;
    public final /* synthetic */ Xl5 A02;
    public final /* synthetic */ YD8 A03;

    public YDD(InterfaceC73607YNx interfaceC73607YNx, Xl5 xl5, YD8 yd8, int i) {
        this.A03 = yd8;
        this.A00 = i;
        this.A01 = interfaceC73607YNx;
        this.A02 = xl5;
    }

    @Override // X.InterfaceC73607YNx
    public final void DD3(Object obj) {
        YD8 yd8 = this.A03;
        if (!yd8.A01) {
            YDP ydp = yd8.A03;
            ydp.A00.set(this.A00, obj);
            int i = yd8.A00 + 1;
            yd8.A00 = i;
            if (i == yd8.A02.A00.size()) {
                yd8.A01 = true;
                this.A01.DD3(ydp);
            }
        }
    }
}
