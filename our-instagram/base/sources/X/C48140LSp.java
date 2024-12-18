package X;

/* renamed from: X.LSp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48140LSp implements InterfaceC48212Jk {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C48140LSp(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj;
        this.A04 = obj2;
        this.A01 = obj4;
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        if (this.A00 != 0) {
            C14360o3.A0A(th);
            C1346766r c1346766r = (C1346766r) this.A01;
            L94 l94 = (L94) this.A02;
            if (l94 != null) {
                l94.A00("failed");
                l94.A01("fetch failed", null);
            }
            th.getMessage();
            C48496Lcn.A01(c1346766r, th.getMessage());
            c1346766r.A00();
            return;
        }
        C38321qM c38321qM = (C38321qM) this.A03;
        c38321qM.A43((C3x9) this.A02);
        c38321qM.AEH((AbstractC12990ll) this.A04);
        AbstractC25227BEk.A1Q((InterfaceC16660sJ) this.A01, false);
    }
}
