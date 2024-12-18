package X;

/* renamed from: X.11y, reason: invalid class name */
/* loaded from: classes.dex */
public final class C11y extends AbstractC211911v {
    public final C212211z A00;
    public final InterfaceC09390do A01;
    public final String A02;
    public final boolean A03;

    @Override // X.AbstractC211911v
    public final void A04(C226418s c226418s) {
        C14360o3.A0B(c226418s, 0);
        long j = super.A01;
        long j2 = super.A00;
        c226418s.A0Q(c226418s.A02, "MLOCK_INIT_START", j);
        c226418s.A0Q(c226418s.A02, "MLOCK_INIT_END", j2);
    }

    @Override // X.AbstractC211911v
    public final String A06() {
        return this.A02;
    }

    @Override // X.AbstractC211911v
    public final void A07() {
        if (!this.A03 && (this.A00.A00 & 255) != 0) {
            ((C220215c) this.A01.getValue()).A00(true);
        }
    }

    public C11y(boolean z) {
        String str;
        this.A03 = z;
        boolean A07 = C20150ym.A07(AbstractC20100yh.A00(36316229116891321L));
        String A03 = C20150ym.A03(AbstractC20100yh.A00(36879179069456640L));
        int i = C20150ym.A07(AbstractC20100yh.A00(36316229115515063L)) ? 1 << 1 : 0;
        int i2 = 1 << 2;
        int i3 = C20150ym.A07(AbstractC20100yh.A00(36316229115383989L)) ? i2 | i : (i2 ^ (-1)) & i;
        int i4 = 1 << 3;
        int i5 = C20150ym.A07(AbstractC20100yh.A00(36316229115449526L)) ? i4 | i3 : (i4 ^ (-1)) & i3;
        int i6 = 1 << 4;
        int i7 = C20150ym.A07(AbstractC20100yh.A00(36316229115646136L)) ? i6 | i5 : (i6 ^ (-1)) & i5;
        int i8 = 1 << 7;
        this.A00 = new C212211z(A07 ? C20150ym.A07(AbstractC20100yh.A00(36316229117153466L)) ? i8 | i7 : (i8 ^ (-1)) & i7 : 0, A03);
        this.A01 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9EI(this, 15));
        if (z) {
            str = "-shell";
        } else {
            str = "";
        }
        this.A02 = AnonymousClass001.A0R("MlockInitializer", str);
    }
}
