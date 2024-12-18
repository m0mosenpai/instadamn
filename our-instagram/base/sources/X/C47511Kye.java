package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Kye, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47511Kye {
    public final C39120HJs A00;
    public final C57112jm A01;

    public C47511Kye(InterfaceC59992oh interfaceC59992oh, UserSession userSession, C57112jm c57112jm, InterfaceC60442pS interfaceC60442pS, String str, String str2) {
        C14360o3.A0B(userSession, 1);
        this.A01 = c57112jm;
        C39120HJs c39120HJs = new C39120HJs(userSession, interfaceC60442pS, str, str2);
        this.A00 = c39120HJs;
        interfaceC59992oh.registerLifecycleListener(new KF9(c39120HJs));
    }
}
