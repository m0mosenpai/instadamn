package X;

/* loaded from: classes6.dex */
public final class GH6 implements C7XU {
    public final int A00;
    public final Object A01;

    public GH6(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C7XU
    public final void DAy() {
        String str;
        switch (this.A00) {
            case 0:
                ((C60852q9) ((C44293Jhj) this.A01).A06.getValue()).A00(EEB.A00);
                return;
            case 1:
                C31476DsK c31476DsK = ((EIJ) this.A01).A01;
                if (c31476DsK == null) {
                    str = "bottomSheetViewModel";
                    break;
                } else {
                    EEH eeh = EEH.A00;
                    C14360o3.A0B(eeh, 0);
                    c31476DsK.A00.Egh(eeh);
                    return;
                }
            case 2:
                ((C34690FQb) this.A01).A06.A00();
                return;
            case 3:
            case 4:
            default:
                return;
            case 5:
                HC0.A01((HC0) this.A01);
                return;
            case 6:
                ELm eLm = (ELm) this.A01;
                if (eLm.A03) {
                    return;
                }
                GZW gzw = eLm.A01;
                if (gzw != null) {
                    gzw.onCancel();
                    C28238Cci.A00.A00(AbstractC166987dD.A0o(eLm.A0A));
                    return;
                } else {
                    str = "callback";
                    break;
                }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C7XU
    public final void DB3() {
        if (3 - this.A00 == 0) {
            ((G4F) this.A01).A04.D01();
        }
    }
}
