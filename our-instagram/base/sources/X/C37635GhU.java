package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GhU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37635GhU {
    public final UserSession A00;

    public static final void A00(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, String str2) {
        C14360o3.A0B(interfaceC60442pS, 4);
        String A0i = AnonymousClass001.A0i(AbstractC111324zv.A00(764), str, str2, '_');
        C82713mZ A0F = AbstractC37301Gc2.A0F(userSession, c38321qM, interfaceC60442pS, "gesture");
        A0F.A7A = "bottom_sheet";
        A0F.A4y = "clips_viewer_watch_browser";
        A0F.A7T = A0i;
        C32U.A0H(userSession, A0F, interfaceC60442pS);
    }

    public C37635GhU(UserSession userSession) {
        this.A00 = userSession;
    }
}
