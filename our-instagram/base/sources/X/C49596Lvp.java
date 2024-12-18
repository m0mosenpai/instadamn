package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lvp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49596Lvp implements C34E {
    public final UserSession A00;

    @Override // X.C34E
    public final void EI6(EnumC64262vl enumC64262vl, AnonymousClass317 anonymousClass317, EnumC64222vh enumC64222vh, String str) {
        AbstractC167027dH.A12(enumC64262vl, anonymousClass317, enumC64222vh);
        AbstractC166987dD.A1Z(new C50112MAl(this, enumC64222vh, enumC64262vl, anonymousClass317, str, null, 3), AbstractC43593JPy.A17(C12L.A00, 2080523710, 3));
    }

    public C49596Lvp(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.C34E
    public final java.util.Set AUW(EnumC64262vl enumC64262vl, AnonymousClass317 anonymousClass317, EnumC64222vh enumC64222vh) {
        AbstractC167017dG.A1N(enumC64262vl, anonymousClass317);
        C14360o3.A0B(enumC64222vh, 2);
        UserSession userSession = this.A00;
        C48508Lcz c48508Lcz = (C48508Lcz) userSession.A01(C48508Lcz.class, new J8V(userSession, 26));
        String obj = enumC64262vl.toString();
        String obj2 = anonymousClass317.toString();
        String obj3 = enumC64222vh.toString();
        AbstractC167007dF.A1K(obj, obj2);
        C14360o3.A0B(obj3, 2);
        String A0j = AnonymousClass001.A0j(obj, obj3, obj2, '_', '_');
        InterfaceC19630xq interfaceC19630xq = c48508Lcz.A00;
        java.util.Set set = C16910sj.A00;
        java.util.Set stringSet = interfaceC19630xq.getStringSet(A0j, set);
        if (stringSet != null) {
            set = AbstractC001800i.A0k(AbstractC001800i.A0X(stringSet));
        }
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.EEj(A0j);
        ARD.apply();
        return set;
    }
}
