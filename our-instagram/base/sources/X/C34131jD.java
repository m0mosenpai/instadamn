package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1jD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34131jD implements InterfaceC29301b7 {
    public static final C0KV A01 = C34141jE.A00;
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        C34111jB c34111jB = (C34111jB) c1ow;
        C14360o3.A0B(c34111jB, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        UserSession userSession = this.A00;
        String str2 = c34111jB.A00;
        if (str2 != null) {
            if (c34111jB.A01) {
                str = "open_nudged_thread/";
            } else {
                str = "dismiss_inbox_nudge/";
            }
            C25621Ms c25621Ms = new C25621Ms(userSession, -2);
            c25621Ms.A05();
            c25621Ms.A0L(AnonymousClass001.A0R("direct_v2/threads/%s/", str), str2);
            c25621Ms.A0R(C40781ul.class, C55702hA.class);
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
            C1GJ.A03(A0N);
            return;
        }
        C14360o3.A0F("threadId");
        throw C00O.createAndThrow();
    }

    public C34131jD(UserSession userSession) {
        this.A00 = userSession;
    }
}
