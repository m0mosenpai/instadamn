package X;

import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;

/* renamed from: X.7TI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7TI {
    public final AvatarStore A00;
    public final UserSession A01;
    public final C7TJ A02;

    public /* synthetic */ C7TI(UserSession userSession) {
        C7TJ c7tj = new C7TJ(userSession);
        AvatarStore A00 = C20Y.A00(userSession);
        C14360o3.A0B(A00, 3);
        this.A01 = userSession;
        this.A02 = c7tj;
        this.A00 = A00;
    }
}
