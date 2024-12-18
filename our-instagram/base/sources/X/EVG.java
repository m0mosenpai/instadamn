package X;

/* loaded from: classes6.dex */
public final class EVG extends AbstractC60592pi {
    public final ELU A00;
    public final InterfaceC41501vz A01 = new C36155FxU(this, 0);
    public final InterfaceC41501vz A02 = new C36155FxU(this, 1);
    public final AbstractC12990ll A03;
    public final EnumC31713DwI A04;

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        C41451vu c41451vu = C41451vu.A01;
        c41451vu.A03(this.A01, C36036FvY.class);
        if (C1AD.A06(C06090Tz.A05, 18302732549100336L)) {
            c41451vu.A03(this.A02, C36037FvZ.class);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.1vw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.1vw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.1vw, java.lang.Object] */
    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        String str;
        C41451vu c41451vu = C41451vu.A01;
        c41451vu.A02(this.A01, C36036FvY.class);
        C36007Fv5 A00 = C36007Fv5.A00();
        AbstractC12990ll abstractC12990ll = this.A03;
        if (!AbstractC31171DnF.A1X(A00.A02(abstractC12990ll, "ig_android_growth_fx_access_fb_ig_sso", "BigBlueTokenHelper"))) {
            C36007Fv5.A00().A03(abstractC12990ll, this.A04);
        } else {
            c41451vu.E4s(new Object());
        }
        if (C1AD.A06(C06090Tz.A05, 18302732549100336L)) {
            c41451vu.A02(this.A02, C36037FvZ.class);
            C36159FxZ c36159FxZ = C36159FxZ.A03;
            C14360o3.A0B(abstractC12990ll, 2);
            if (!AbstractC31181DnP.A11(abstractC12990ll, "BigBlueTokenHelper") && (str = C36159FxZ.A02) != null && str.length() != 0) {
                c41451vu.E4s(new Object());
            } else {
                c41451vu.E4s(new Object());
                C14120nc.A00().ATO(new EZZ(abstractC12990ll));
            }
        }
    }

    public EVG(AbstractC12990ll abstractC12990ll, ELU elu, EnumC31713DwI enumC31713DwI) {
        this.A03 = abstractC12990ll;
        this.A00 = elu;
        this.A04 = enumC31713DwI;
    }
}
