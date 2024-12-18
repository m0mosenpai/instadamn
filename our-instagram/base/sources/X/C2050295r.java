package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.95r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2050295r implements InterfaceC03950Jk {
    @Override // X.InterfaceC03950Jk
    public final /* bridge */ /* synthetic */ void ATX(UserSession userSession, InterfaceC03960Jm interfaceC03960Jm, Object obj) {
        C2050195q c2050195q = (C2050195q) obj;
        c2050195q.getClass();
        C03990Jp c03990Jp = new C03990Jp(c2050195q.A00, interfaceC03960Jm);
        String str = c2050195q.A01;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0B("multiple_accounts/get_account_family/");
        c25621Ms.A9s("request_source", str);
        c25621Ms.A0S(C2050895y.class, C2050995z.class);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = c03990Jp;
        C1GJ.A03(A0N);
    }
}
