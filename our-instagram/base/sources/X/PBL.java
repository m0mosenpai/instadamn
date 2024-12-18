package X;

/* loaded from: classes9.dex */
public final class PBL implements InterfaceC58064Pop {
    public final C56139Ovz A00;
    public final OW9 A01;

    @Override // X.InterfaceC58064Pop
    public final void A7P(InterfaceC57854PlK interfaceC57854PlK) {
        if (interfaceC57854PlK instanceof C56621PBr) {
            C56621PBr.A00(this.A01.A0Z, interfaceC57854PlK);
        } else {
            if (!(interfaceC57854PlK instanceof C56622PBs)) {
                return;
            }
            this.A00.A01(1, ((C56622PBs) interfaceC57854PlK).A00);
        }
    }

    @Override // X.InterfaceC58064Pop
    public final InterfaceC19390xP EoM(C19L c19l) {
        OW9 ow9 = this.A01;
        return AnonymousClass111.A03(AbstractC16960so.A1Q(C0ST.A01(ow9.A0G.A01), C0ST.A01(MV5.A00(ow9.A0E, AbstractC208910l.A02(ow9.A0H.A01), 18))));
    }

    public PBL(C56139Ovz c56139Ovz, OW9 ow9) {
        this.A00 = c56139Ovz;
        this.A01 = ow9;
    }
}
