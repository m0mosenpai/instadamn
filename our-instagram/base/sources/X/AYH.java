package X;

/* loaded from: classes4.dex */
public final class AYH implements InterfaceC169767hq {
    public static final C169777hr A07 = new C169777hr(new C170417iu());
    public static final C225139wc A06 = new Object();
    public int A01 = 1;
    public int A00 = 2;
    public C169777hr A05 = A07;
    public C225139wc A04 = A06;
    public int A02 = Integer.MIN_VALUE;
    public int A03 = 0;

    @Override // X.InterfaceC169767hq
    public final /* bridge */ /* synthetic */ InterfaceC169817hv AER() {
        int i = this.A02;
        AbstractC61802rh A00 = AbstractC169797ht.A00(i, this.A03);
        int i2 = this.A01;
        int i3 = this.A00;
        AYI ayi = new AYI(A00, this.A04, this.A05, i2, i3, i);
        int i4 = ayi.A01;
        if (ayi.A00 == 1 && i4 != Integer.MIN_VALUE && i4 != -1) {
            throw AbstractC166987dD.A1D("Only snap to start is implemented for vertical lists");
        }
        return ayi;
    }

    @Override // X.InterfaceC169767hq
    public final /* bridge */ /* synthetic */ InterfaceC169767hq E34(int i) {
        this.A01 = i;
        return this;
    }

    @Override // X.InterfaceC169767hq
    public final /* bridge */ /* synthetic */ InterfaceC169767hq ECj(C169777hr c169777hr) {
        this.A05 = c169777hr;
        return this;
    }
}
