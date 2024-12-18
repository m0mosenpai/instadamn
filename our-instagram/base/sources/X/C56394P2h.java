package X;

/* renamed from: X.P2h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56394P2h implements InterfaceC58047PoY {
    public final /* synthetic */ P09 A00;

    public C56394P2h(P09 p09) {
        this.A00 = p09;
    }

    @Override // X.InterfaceC58047PoY
    public final void DEF(Exception exc) {
        P09 p09 = this.A00;
        if (!p09.A06) {
            p09.A06 = true;
            C19280xC A00 = AbstractC31718DwN.A00(C05F.A0R);
            A00.A0C("error", AbstractC167017dG.A0n(exc, "Rendering error: ", AbstractC166987dD.A1C()));
            AbstractC31173DnH.A1S(A00, p09.A0E);
            p09.A0F.A01.A05.A0A(null, C05F.A1I);
        }
    }

    @Override // X.InterfaceC58047PoY
    public final void DfN() {
        this.A00.AP5();
    }
}
