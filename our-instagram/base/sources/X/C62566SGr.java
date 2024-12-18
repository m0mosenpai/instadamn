package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.SGr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62566SGr {
    public final UserSession A00;
    public final C40701ud A01;
    public final AbstractC12990ll A02;

    public C62566SGr(AbstractC12990ll abstractC12990ll) {
        UserSession userSession;
        C40701ud A00;
        this.A02 = abstractC12990ll;
        boolean z = abstractC12990ll instanceof UserSession;
        if (z) {
            userSession = (UserSession) abstractC12990ll;
        } else {
            userSession = null;
        }
        this.A00 = userSession;
        if (z) {
            A00 = AbstractC40691uc.A01((UserSession) abstractC12990ll);
        } else {
            A00 = AbstractC40691uc.A00((C07270a1) abstractC12990ll);
        }
        this.A01 = A00;
    }
}
