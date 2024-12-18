package X;

/* loaded from: classes6.dex */
public final class GAR implements GZK {
    public final /* synthetic */ EMS A00;

    @Override // X.GZK
    public final void Dq1(R1L r1l) {
        EMS ems;
        int i;
        String A09;
        if (r1l != null) {
            C60019Qsf A0E = r1l.A0E();
            if (A0E != null && A0E.getRequiredBooleanField(1, "code_sent")) {
                ems = this.A00;
                i = 2131961720;
                if (ems.A02) {
                    i = 2131974272;
                }
                EMS.A00(ems, i);
            }
            String str = null;
            C60019Qsf A0E2 = r1l.A0E();
            if (A0E2 != null && (A09 = A0E2.A09("error")) != null && A09.length() != 0) {
                C60019Qsf A0E3 = r1l.A0E();
                if (A0E3 != null) {
                    str = A0E3.A09("error");
                }
                AbstractC25225BEi.A1S(str);
                C41451vu c41451vu = C41451vu.A01;
                C146106i8 A0X = AbstractC31173DnH.A0X(str);
                A0X.A06();
                AbstractC31178DnM.A1N(c41451vu, A0X);
                return;
            }
        }
        ems = this.A00;
        i = 2131974293;
        EMS.A00(ems, i);
    }

    public GAR(EMS ems) {
        this.A00 = ems;
    }

    @Override // X.GZK
    public final void DFf() {
        EMS.A00(this.A00, 2131974293);
    }
}
