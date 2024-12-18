package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Kyd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47510Kyd {
    public final C39126HJy A00;
    public final C57112jm A01;

    public C47510Kyd(InterfaceC59992oh interfaceC59992oh, UserSession userSession, C57112jm c57112jm, InterfaceC60442pS interfaceC60442pS, String str) {
        C14360o3.A0B(userSession, 1);
        this.A01 = c57112jm;
        C39126HJy c39126HJy = new C39126HJy(userSession, interfaceC60442pS, str);
        this.A00 = c39126HJy;
        interfaceC59992oh.registerLifecycleListener(new KF9(c39126HJy));
    }
}
