package X;

/* renamed from: X.Fxh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36167Fxh implements C5GZ {
    public final /* synthetic */ EKB A00;

    public C36167Fxh(EKB ekb) {
        this.A00 = ekb;
    }

    @Override // X.C5GZ
    public final void E0N(C3OO c3oo) {
        String str;
        EnumC33508Erh enumC33508Erh;
        EKB ekb = this.A00;
        InterfaceC83733oI interfaceC83733oI = ekb.A01;
        if (interfaceC83733oI != null) {
            C81663kb A0W = AbstractC31176DnK.A0W((C2DU) AbstractC31180DnO.A0O(ekb.A07), AbstractC31174DnI.A0b(interfaceC83733oI));
            C142846ck A0d = AbstractC31172DnG.A0d(ekb.A06);
            String str2 = null;
            if (A0W != null) {
                str = A0W.C7I();
                str2 = A0W.C7q();
            } else {
                str = null;
            }
            int i = ekb.A00;
            boolean A1X = AbstractC167007dF.A1X(ekb.A05.getValue(), EnumC33344Eod.A02);
            C25531Mh A0I = AbstractC31172DnG.A0I(A0d);
            if (AbstractC25226BEj.A1Z(A0I)) {
                AbstractC31175DnJ.A1B(A0I, A0d);
                AbstractC31174DnI.A1K(A0I, "learn_more_sheet_rendered");
                A0I.A0o("learn_more_sheet");
                AbstractC31178DnM.A1H(A0I, "thread_view", i);
                if (A1X) {
                    enumC33508Erh = EnumC33508Erh.NEW_CHANNEL_FIRST_MESSAGE;
                } else {
                    enumC33508Erh = EnumC33508Erh.EXISTING_CHANNEL_FIRST_EXPOSURE;
                }
                A0I.A0M(enumC33508Erh, "entrypoint");
                A0I.A0r(str);
                AbstractC31177DnL.A1H(A0I, A0d, AbstractC25233BEq.A0n(str2));
            }
        }
    }
}
