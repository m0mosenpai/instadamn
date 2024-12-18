package X;

/* renamed from: X.1Io, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24711Io implements InterfaceC24681Il {
    public final InterfaceC24731Iq A00;
    public final InterfaceC06180Ui A01;
    public final C24651Ii A02;
    public final C19L A03;

    public C24711Io(C24651Ii c24651Ii) {
        C14360o3.A0B(c24651Ii, 1);
        this.A02 = c24651Ii;
        Integer num = C05F.A00;
        this.A00 = new C24721Ip(Integer.MAX_VALUE);
        AnonymousClass057 A00 = C10M.A00(C05F.A01, 1, 0);
        A00.F8m(true);
        this.A01 = A00;
        C19K A02 = AbstractC24771Iv.A02(311, 3);
        this.A03 = A02;
        AbstractC23641Du.A03(num, AnonymousClass191.A00, new C9D3(this, C12L.A00, (InterfaceC23621Ds) null, 45), A02);
    }

    @Override // X.InterfaceC24681Il
    public final void E37(AbstractRunnableC14200nk abstractRunnableC14200nk) {
    }

    public static final void A00(C24711Io c24711Io) {
        InterfaceC06180Ui interfaceC06180Ui = c24711Io.A01;
        C24651Ii c24651Ii = c24711Io.A02;
        interfaceC06180Ui.F8m(Boolean.valueOf(c24651Ii.A03.contains(C1KA.A02.A00)));
    }

    @Override // X.InterfaceC24681Il
    public final C1KA Bbe() {
        return C1KA.A02;
    }

    @Override // X.InterfaceC24681Il
    public final void ELG() {
        A00(this);
    }

    @Override // X.InterfaceC24681Il
    public final void Ep7(AbstractRunnableC14200nk abstractRunnableC14200nk) {
        A00(this);
        C19L c19l = this.A03;
        C9D3 c9d3 = new C9D3(this, abstractRunnableC14200nk, (InterfaceC23621Ds) null, 46);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d3, c19l);
    }
}
