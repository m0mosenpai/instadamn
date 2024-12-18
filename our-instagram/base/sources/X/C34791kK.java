package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1kK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34791kK implements InterfaceC29301b7 {
    public static final C0KV A01 = C34801kL.A00;
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C34771kI c34771kI = (C34771kI) c1ow;
        C14360o3.A0B(c34771kI, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        UserSession userSession = this.A00;
        String str = c34771kI.A00;
        if (str != null) {
            boolean z = c34771kI.A01;
            String str2 = c34771kI.A05;
            C25621Ms c25621Ms = new C25621Ms(userSession, -2);
            c25621Ms.A05();
            c25621Ms.A0L("direct_v2/threads/%s/toggle_read_receipts/", str);
            c25621Ms.A0R(C40781ul.class, C55702hA.class);
            c25621Ms.A0I("is_read_receipts_disabled", z);
            c25621Ms.A9s("mutation_token", str2);
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
            C1GJ.A03(A0N);
            return;
        }
        C14360o3.A0F("threadId");
        throw C00O.createAndThrow();
    }

    public C34791kK(UserSession userSession) {
        this.A00 = userSession;
    }
}
