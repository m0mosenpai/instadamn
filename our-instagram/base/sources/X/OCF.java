package X;

import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OCF {
    public final C54823OLg A00;
    public final AvatarStore A01;
    public final UserSession A02;
    public final C21C A03;

    public /* synthetic */ OCF(UserSession userSession) {
        C54823OLg c54823OLg = new C54823OLg(userSession);
        C21C A00 = C21B.A00(userSession);
        AvatarStore A002 = C20Y.A00(userSession);
        AbstractC37302Gc3.A1U(A00, A002);
        this.A02 = userSession;
        this.A00 = c54823OLg;
        this.A03 = A00;
        this.A01 = A002;
    }
}
