package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Iac, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41589Iac {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final C4E9 A02;
    public final C4E5 A03;
    public final String A04;

    public C41589Iac(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        AbstractC167007dF.A1D(userSession, 1, interfaceC60442pS);
        this.A00 = userSession;
        this.A01 = interfaceC60442pS;
        this.A04 = str;
        C4E5 c4e5 = new C4E5(null, null, null, C05F.A01, 444, true, false, false);
        this.A03 = c4e5;
        this.A02 = C4E8.A00(userSession, c4e5);
    }

    public static final C82713mZ A00(C101274gj c101274gj, C41589Iac c41589Iac, int i) {
        EnumC130265uW enumC130265uW;
        InterfaceC60442pS interfaceC60442pS = c41589Iac.A01;
        C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS, "IMPRESSION");
        c82713mZ.A4y = interfaceC60442pS.getModuleName();
        c82713mZ.A0T(Integer.valueOf(i));
        c82713mZ.A3c = AbstractC25228BEl.A13(c101274gj.getId());
        c82713mZ.A6h = c41589Iac.A04;
        if (c101274gj.A01 == C1XV.A0Q) {
            enumC130265uW = EnumC130265uW.HIGHLIGHTS_IN_FEED_UNIT;
        } else {
            enumC130265uW = EnumC130265uW.STORIES_IN_FEED_UNIT;
        }
        c82713mZ.A0d = enumC130265uW;
        return c82713mZ;
    }
}
