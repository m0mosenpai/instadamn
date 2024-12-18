package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HJs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39120HJs extends AbstractC64162vb {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final String A02;
    public final String A03;

    public C39120HJs(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2) {
        super(C1BX.A03.A01(AbstractC62752tE.A00(userSession, AbstractC111324zv.A00(906))));
        this.A00 = userSession;
        this.A01 = interfaceC60442pS;
        this.A03 = str;
        this.A02 = str2;
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C38321qM c38321qM = (C38321qM) obj;
        IEC iec = (IEC) obj2;
        AbstractC167017dG.A1N(c38321qM, iec);
        InterfaceC02590Ai A09 = AbstractC37302Gc3.A09(this.A01, this.A00);
        if (A09.isSampled()) {
            AbstractC37300Gc1.A0h(A09, Long.getLong(c38321qM.getId()));
            A09.AAP(AbstractC111324zv.A00(396), this.A03);
            A09.AAP(AbstractC111324zv.A00(2024), this.A02);
            A09.AAP("search_session_id", null);
            A09.A9K("effect_id", AbstractC449424y.A08(c38321qM.A2h()));
            A09.A9K("row", AbstractC31171DnF.A0V(iec.A01));
            A09.AAP("position", String.valueOf(iec.A00));
            AbstractC25234BEr.A11(A09, "device_aspect_ratio_category", AbstractC37301Gc2.A0g(A09));
            A09.Cht();
        }
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C38321qM c38321qM = (C38321qM) obj;
        IEC iec = (IEC) obj2;
        AbstractC167017dG.A1N(c38321qM, iec);
        InterfaceC60442pS interfaceC60442pS = this.A01;
        C14360o3.A0A(interfaceC60442pS);
        C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS, "instagram_thumbnail_sub_impression");
        c82713mZ.A61 = c38321qM.getId();
        String str = this.A03;
        C14360o3.A0A(str);
        c82713mZ.A5F = str;
        c82713mZ.A4h = this.A02;
        c82713mZ.A6y = null;
        c82713mZ.A3b = AbstractC449424y.A08(c38321qM.A2h());
        c82713mZ.A0I = iec.A01;
        c82713mZ.A0H = iec.A00;
        C32U.A0B(this.A00, c82713mZ, c38321qM, interfaceC60442pS, C05F.A00);
    }
}
