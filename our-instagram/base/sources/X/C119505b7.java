package X;

/* renamed from: X.5b7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C119505b7 implements InterfaceC1131459c {
    public final AbstractC137606Lg A00;

    @Override // X.InterfaceC1131459c
    public final long Chl(InterfaceC1131459c interfaceC1131459c, long j) {
        return Chm(interfaceC1131459c, j, true);
    }

    @Override // X.InterfaceC1131459c
    public final long Chm(InterfaceC1131459c interfaceC1131459c, long j, boolean z) {
        if (interfaceC1131459c instanceof C119505b7) {
            AbstractC137606Lg abstractC137606Lg = ((C119505b7) interfaceC1131459c).A00;
            C59U c59u = abstractC137606Lg.A04;
            c59u.A0Y();
            AbstractC137606Lg abstractC137606Lg2 = this.A00;
            AbstractC137606Lg A0V = abstractC137606Lg2.A04.A0W(c59u).A0V();
            if (A0V != null) {
                long A00 = C119235af.A00(C119235af.A01(abstractC137606Lg.A0P(A0V), AbstractC113765Bo.A01(j)), abstractC137606Lg2.A0P(A0V));
                return AbstractC119395aw.A00((int) (A00 >> 32), (int) (A00 & 4294967295L));
            }
            AbstractC137606Lg A002 = CBN.A00(abstractC137606Lg);
            long A01 = C119235af.A01(C119235af.A01(abstractC137606Lg.A0P(A002), A002.A00), AbstractC113765Bo.A01(j));
            AbstractC137606Lg A003 = CBN.A00(abstractC137606Lg2);
            long A004 = C119235af.A00(A01, C119235af.A01(abstractC137606Lg2.A0P(A003), A003.A00));
            long A005 = AbstractC119395aw.A00((int) (A004 >> 32), (int) (A004 & 4294967295L));
            C59U c59u2 = A003.A04.A07;
            C14360o3.A0A(c59u2);
            C59U c59u3 = A002.A04.A07;
            C14360o3.A0A(c59u3);
            return c59u2.Chm(c59u3, A005, true);
        }
        AbstractC137606Lg A006 = CBN.A00(this.A00);
        return C119365at.A07(Chm(A006.A03, j, true), A006.A04.Chm(interfaceC1131459c, 0L, true));
    }

    private final long A00() {
        AbstractC137606Lg abstractC137606Lg = this.A00;
        AbstractC137606Lg A00 = CBN.A00(abstractC137606Lg);
        return C119365at.A06(Chm(A00.A03, 0L, true), abstractC137606Lg.A04.Chm(A00.A04, 0L, true));
    }

    @Override // X.InterfaceC1131459c
    public final long Bxd() {
        AbstractC137606Lg abstractC137606Lg = this.A00;
        return AbstractC119215ad.A00(((C59W) abstractC137606Lg).A01, ((C59W) abstractC137606Lg).A00);
    }

    @Override // X.InterfaceC1131459c
    public final boolean CQ7() {
        return this.A00.A04.A0T().A08;
    }

    @Override // X.InterfaceC1131459c
    public final C114205Dh Chk(InterfaceC1131459c interfaceC1131459c, boolean z) {
        return this.A00.A04.Chk(interfaceC1131459c, z);
    }

    @Override // X.InterfaceC1131459c
    public final long Chn(long j) {
        return this.A00.A04.Chn(C119365at.A07(j, A00()));
    }

    @Override // X.InterfaceC1131459c
    public final long Chp(long j) {
        return this.A00.A04.Chp(C119365at.A07(j, A00()));
    }

    @Override // X.InterfaceC1131459c
    public final long EM9(long j) {
        return C119365at.A07(this.A00.A04.EM9(j), A00());
    }

    @Override // X.InterfaceC1131459c
    public final void F8P(InterfaceC1131459c interfaceC1131459c, float[] fArr) {
        this.A00.A04.F8P(interfaceC1131459c, fArr);
    }

    @Override // X.InterfaceC1131459c
    public final void F8S(float[] fArr) {
        this.A00.A04.F8S(fArr);
    }

    @Override // X.InterfaceC1131459c
    public final long FE8(long j) {
        return C119365at.A07(this.A00.A04.FE8(j), A00());
    }

    public C119505b7(AbstractC137606Lg abstractC137606Lg) {
        this.A00 = abstractC137606Lg;
    }

    @Override // X.InterfaceC1131459c
    public final InterfaceC1131459c BbN() {
        AbstractC137606Lg A0V;
        if (!CQ7()) {
            AbstractC28290Cdc.A01("LayoutCoordinate operations are only valid when isAttached is true");
            throw C00O.createAndThrow();
        }
        C59U c59u = this.A00.A04.A0H.A0W.A04.A07;
        if (c59u == null || (A0V = c59u.A0V()) == null) {
            return null;
        }
        return A0V.A03;
    }
}
