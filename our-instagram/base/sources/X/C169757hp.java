package X;

/* renamed from: X.7hp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169757hp implements InterfaceC169767hq {
    public static final C169777hr A06 = new C169777hr(new C170417iu());
    public static final C169787hs A05 = new Object();
    public int A00 = 1;
    public int A01 = Integer.MIN_VALUE;
    public C169777hr A04 = A06;
    public C169787hs A03 = A05;
    public int A02 = 0;

    @Override // X.InterfaceC169767hq
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C169807hu AER() {
        int i = this.A01;
        AbstractC61802rh A00 = AbstractC169797ht.A00(i, this.A02);
        int i2 = this.A00;
        C169807hu c169807hu = new C169807hu(A00, this.A03, this.A04, i2, i);
        int i3 = c169807hu.A01;
        if (c169807hu.A00 == 1 && i3 != Integer.MIN_VALUE && i3 != -1 && i3 != Integer.MAX_VALUE) {
            throw new UnsupportedOperationException("Only snap to start is implemented for vertical lists");
        }
        return c169807hu;
    }

    @Override // X.InterfaceC169767hq
    public final /* bridge */ /* synthetic */ InterfaceC169767hq E34(int i) {
        this.A00 = i;
        return this;
    }

    @Override // X.InterfaceC169767hq
    public final /* bridge */ /* synthetic */ InterfaceC169767hq ECj(C169777hr c169777hr) {
        this.A04 = c169777hr;
        return this;
    }
}
