package X;

/* renamed from: X.Iwl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42809Iwl implements AnonymousClass388 {
    public final C61552rI A00;
    public final AnonymousClass388 A01;
    public final InterfaceC37202GaD A02;

    @Override // X.AnonymousClass375
    public final InterfaceC37202GaD CCt() {
        return this.A02;
    }

    public C42809Iwl(C61552rI c61552rI, AnonymousClass388 anonymousClass388, InterfaceC37202GaD interfaceC37202GaD) {
        AbstractC167027dH.A13(anonymousClass388, interfaceC37202GaD, c61552rI);
        this.A01 = anonymousClass388;
        this.A02 = interfaceC37202GaD;
        this.A00 = c61552rI;
    }

    @Override // X.AnonymousClass388
    public final void Di3(C38321qM c38321qM, C75113Zb c75113Zb, InterfaceC37202GaD interfaceC37202GaD, int i) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        C14360o3.A0B(interfaceC37202GaD, 3);
        this.A00.A00("SAVE");
        this.A01.Di3(c38321qM, c75113Zb, interfaceC37202GaD, i);
    }

    @Override // X.AnonymousClass388
    public final void Di5(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        this.A00.A00("SAVE");
        this.A01.Di5(c38321qM, c75113Zb, i);
    }
}
