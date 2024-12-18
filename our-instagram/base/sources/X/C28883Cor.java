package X;

/* renamed from: X.Cor, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28883Cor implements InterfaceC09670ek {
    public final /* synthetic */ C07R A00;
    public final /* synthetic */ C07R A01;
    public final /* synthetic */ InterfaceC16620sF A02;
    public final /* synthetic */ C15370ps A03;
    public final /* synthetic */ InterfaceC24901Jp A04;
    public final /* synthetic */ C19L A05;

    public C28883Cor(C07R c07r, C07R c07r2, InterfaceC16620sF interfaceC16620sF, C15370ps c15370ps, InterfaceC24901Jp interfaceC24901Jp, C19L c19l) {
        this.A01 = c07r;
        this.A03 = c15370ps;
        this.A05 = c19l;
        this.A00 = c07r2;
        this.A04 = interfaceC24901Jp;
        this.A02 = interfaceC16620sF;
    }

    @Override // X.InterfaceC09670ek
    public final void DoQ(C07R c07r, C07X c07x) {
        C14360o3.A0B(c07r, 1);
        if (c07r == this.A01) {
            C15370ps c15370ps = this.A03;
            if (c15370ps.A00 == null) {
                c15370ps.A00 = AbstractC25226BEj.A1L(new D51(this.A02, (InterfaceC23621Ds) null, 38), this.A05);
                return;
            }
            throw AbstractC166987dD.A14("job should only be launched once");
        }
        if (c07r != this.A00) {
            return;
        }
        AnonymousClass195 anonymousClass195 = (AnonymousClass195) this.A03.A00;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        this.A04.resumeWith(C0eB.A00);
    }
}
