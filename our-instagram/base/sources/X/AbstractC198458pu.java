package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8pu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC198458pu {
    public static final AbstractC198478pw A00(UserSession userSession, C55U c55u, boolean z) {
        C14360o3.A0B(c55u, 1);
        if (c55u instanceof C81V) {
            return new C199138rG(userSession);
        }
        if (c55u instanceof C81T) {
            return new C198468pv(userSession, z);
        }
        return new C198748qW(userSession, z);
    }
}
