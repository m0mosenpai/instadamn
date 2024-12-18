package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1g5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32201g5 implements InterfaceC29301b7 {
    public static final C0KV A01 = new C0KV() { // from class: X.1g6
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(-587184213);
            int A032 = C0f9.A03(1633246316);
            C32201g5 c32201g5 = new C32201g5(userSession);
            C0f9.A0A(-427083730, A032);
            C0f9.A0A(1452867435, A03);
            return c32201g5;
        }
    };
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        C1g3 c1g3 = (C1g3) c1ow;
        UserSession userSession = this.A00;
        String str2 = c1g3.A00;
        boolean z = c1g3.A01;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str2, 1);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        if (z) {
            str = "approval_required_for_new_members";
        } else {
            str = "approval_not_required_for_new_members";
        }
        c25621Ms.A0L("direct_v2/threads/%s/%s/", str2, str);
        c25621Ms.A0R(C40781ul.class, C55702hA.class);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
        C1GJ.A03(A0N);
    }

    public C32201g5(UserSession userSession) {
        this.A00 = userSession;
    }
}
