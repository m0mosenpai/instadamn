package X;

/* loaded from: classes9.dex */
public final class PBK implements InterfaceC58064Pop {
    public final OW9 A00;

    @Override // X.InterfaceC58064Pop
    public final void A7P(InterfaceC57854PlK interfaceC57854PlK) {
        InterfaceC16660sJ c57753Pjg;
        boolean z;
        AbstractC52007Mz4 A00;
        OW9 ow9 = this.A00;
        C55207OeK c55207OeK = ow9.A0Z;
        if (interfaceC57854PlK instanceof PFA) {
            C05A c05a = ow9.A0H.A01;
            C51885MwT c51885MwT = (C51885MwT) c05a.getValue();
            c05a.F8m(new C51885MwT(c51885MwT.A00, c51885MwT.A01, c51885MwT.A02, c51885MwT.A03, c51885MwT.A04, c51885MwT.A06, c51885MwT.A05, c51885MwT.A07, false, c51885MwT.A09, c51885MwT.A08));
            return;
        }
        if (interfaceC57854PlK instanceof C56621PBr) {
            C56621PBr.A00(c55207OeK, interfaceC57854PlK);
            return;
        }
        if (interfaceC57854PlK instanceof PBX) {
            c55207OeK.A09(((PBX) interfaceC57854PlK).A00);
            return;
        }
        if (interfaceC57854PlK instanceof C56618PBo) {
            C52000Myq c52000Myq = c55207OeK.A02;
            if (c52000Myq != null && (A00 = C52000Myq.A00(c52000Myq)) != null) {
                z = A00.isCameraCurrentlyFacingFront();
            } else {
                z = false;
            }
            ow9.A0B.A00(AbstractC31172DnG.A0s(z));
            c57753Pjg = C57697Pim.A00;
        } else if (interfaceC57854PlK instanceof C56609PBf) {
            C55207OeK.A02(c55207OeK, new BQB(18, c55207OeK, AbstractC001800i.A0a(((C56609PBf) interfaceC57854PlK).A00), false));
            return;
        } else if (interfaceC57854PlK instanceof C56610PBg) {
            c57753Pjg = new C57753Pjg(((C56610PBg) interfaceC57854PlK).A00, 13);
        } else {
            C0K8.A0D("RtcLivePresentationManager", AnonymousClass001.A0R("Unexpected RtcStateAction: ", MSY.A0h(interfaceC57854PlK)));
            return;
        }
        C55207OeK.A02(c55207OeK, c57753Pjg);
    }

    @Override // X.InterfaceC58064Pop
    public final /* bridge */ /* synthetic */ InterfaceC19390xP EoM(C19L c19l) {
        return C10E.A00(C56626PBw.A00);
    }

    public PBK(OW9 ow9) {
        this.A00 = ow9;
    }
}
