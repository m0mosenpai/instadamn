package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;

/* renamed from: X.1gT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32431gT implements InterfaceC29301b7 {
    public static final C0KV A01 = new C0KV() { // from class: X.1gU
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(2077765542);
            int A032 = C0f9.A03(989138955);
            C32431gT c32431gT = new C32431gT(userSession);
            C0f9.A0A(1760633258, A032);
            C0f9.A0A(503981900, A03);
            return c32431gT;
        }
    };
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C32411gR c32411gR = (C32411gR) c1ow;
        UserSession userSession = this.A00;
        String str = c32411gR.A03().A00;
        String str2 = c32411gR.A00;
        if (str2 != null) {
            String trim = str2.trim();
            C14360o3.A0B(userSession, 0);
            C25621Ms c25621Ms = new C25621Ms(userSession, -2);
            c25621Ms.A05();
            c25621Ms.A0L("direct_v2/threads/%s/update_title/", str);
            c25621Ms.A9s(DialogModule.KEY_TITLE, trim);
            c25621Ms.A0R(C1574875f.class, C75g.class);
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = new C32224EDx(userSession, interfaceC37261GbE, this);
            C1GJ.A03(A0N);
            return;
        }
        C14360o3.A0F("newTitle");
        throw C00O.createAndThrow();
    }

    public C32431gT(UserSession userSession) {
        this.A00 = userSession;
    }
}
