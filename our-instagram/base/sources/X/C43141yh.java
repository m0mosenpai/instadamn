package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1yh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43141yh extends AbstractC43161yj {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.1yj, X.1yh, java.lang.Object] */
    public static C43141yh A00(UserSession userSession) {
        C43141yh c43141yh = (C43141yh) userSession.A00(C43141yh.class);
        if (c43141yh == null) {
            ?? abstractC43161yj = new AbstractC43161yj(new InterfaceC43191ym() { // from class: X.1yl
                @Override // X.InterfaceC43191ym
                public final C1AV BfP() {
                    return C1AV.A0M;
                }
            }, userSession);
            userSession.A04(C43141yh.class, abstractC43161yj);
            return abstractC43161yj;
        }
        return c43141yh;
    }
}
