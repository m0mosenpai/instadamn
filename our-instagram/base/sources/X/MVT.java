package X;

/* loaded from: classes9.dex */
public final class MVT implements InterfaceC55022g1 {
    public final /* synthetic */ C64742wY A00;
    public final /* synthetic */ C15370ps A01;

    @Override // X.InterfaceC55022g1
    public final void Dtj(C125715mI c125715mI) {
        C14360o3.A0B(c125715mI, 0);
        C64742wY c64742wY = this.A00;
        Object obj = this.A01.A00;
        if (obj == null) {
            C14360o3.A0F("qpFragmentPresenter");
            throw C00O.createAndThrow();
        }
        c64742wY.A01((AbstractC55352ga) obj, c125715mI);
    }

    public MVT(C64742wY c64742wY, C15370ps c15370ps) {
        this.A00 = c64742wY;
        this.A01 = c15370ps;
    }

    @Override // X.InterfaceC55022g1
    public final void DXC(C125715mI c125715mI) {
        this.A00.A02 = c125715mI;
    }
}
