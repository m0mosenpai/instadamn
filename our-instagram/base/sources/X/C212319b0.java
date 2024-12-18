package X;

/* renamed from: X.9b0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212319b0 extends C196518mh {
    public C176017sK A00;

    @Override // X.C196518mh
    public final boolean A0B(EnumC222819sM enumC222819sM, boolean z) {
        C14360o3.A0B(enumC222819sM, 0);
        if (!super.A0B(enumC222819sM, false)) {
            return false;
        }
        EnumC222819sM enumC222819sM2 = EnumC222819sM.A04;
        C176017sK c176017sK = this.A00;
        if (enumC222819sM == enumC222819sM2) {
            if (c176017sK != null) {
                c176017sK.A0C(true);
                return true;
            }
        } else if (c176017sK != null) {
            c176017sK.A0C(false);
            return true;
        }
        C14360o3.A0F("supernovaBasicRecordingComponent");
        throw C00O.createAndThrow();
    }

    @Override // X.C196518mh, X.C175777rr, X.AbstractC178227vw
    public final void A09() {
        super.A09();
        C178087vh c178087vh = InterfaceC179627yC.A00;
        InterfaceC178207vu interfaceC178207vu = ((AbstractC179687yI) this).A00;
        if (interfaceC178207vu.CRY(c178087vh)) {
            InterfaceC178067vf Aq0 = interfaceC178207vu.Aq0(c178087vh);
            C14360o3.A07(Aq0);
            InterfaceC179627yC interfaceC179627yC = (InterfaceC179627yC) Aq0;
            if (interfaceC179627yC instanceof C176017sK) {
                this.A00 = (C176017sK) interfaceC179627yC;
                return;
            }
            throw AbstractC166987dD.A18("Missing SupernovaBasicRecordingComponent");
        }
        throw AbstractC166987dD.A18("Missing RecordingComponent");
    }

    @Override // X.C196518mh
    public final void A0A() {
        super.A0A();
        C176017sK c176017sK = this.A00;
        if (c176017sK == null) {
            C14360o3.A0F("supernovaBasicRecordingComponent");
            throw C00O.createAndThrow();
        }
        c176017sK.A0C(false);
    }
}
