package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.AAo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22970AAo {
    public final AG2 A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        AG2 ag2 = AG2.A02;
        if (ag2 == null) {
            synchronized (this) {
                ag2 = AG2.A02;
                if (ag2 == null) {
                    ag2 = new AG2(userSession);
                    AG2.A02 = ag2;
                }
            }
        }
        return ag2;
    }
}
