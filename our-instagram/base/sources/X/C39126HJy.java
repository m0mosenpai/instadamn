package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HJy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39126HJy extends AbstractC64162vb {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final String A02;

    public C39126HJy(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        super(C1BX.A03.A01(AbstractC62752tE.A00(userSession, AbstractC111324zv.A00(906))));
        this.A00 = userSession;
        this.A01 = interfaceC60442pS;
        this.A02 = str;
    }

    private final void A00(C38321qM c38321qM, String str) {
        InterfaceC60442pS interfaceC60442pS = this.A01;
        C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS, str);
        c82713mZ.A61 = c38321qM.getId();
        c82713mZ.A5F = this.A02;
        c82713mZ.A3b = AbstractC449424y.A08(c38321qM.A2h());
        C32U.A0B(this.A00, c82713mZ, c38321qM, interfaceC60442pS, C05F.A00);
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        A00(AbstractC37301Gc2.A0H(obj), "instagram_organic_impression");
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        A00(AbstractC37301Gc2.A0H(obj), AbstractC111324zv.A00(4691));
    }
}
