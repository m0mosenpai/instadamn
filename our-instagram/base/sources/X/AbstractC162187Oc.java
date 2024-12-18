package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Oc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC162187Oc {
    public static final AbstractC162207Oe A00(C9C9 c9c9, UserSession userSession) {
        C81663kb c81663kb;
        boolean z;
        C9E3 c9e3;
        Class cls;
        C2DS A00 = AbstractC28761aE.A00(userSession);
        if (A00 != null) {
            String str = c9c9.A01;
            C14360o3.A0B(str, 0);
            c81663kb = ((C2DU) A00).A0N(str);
        } else {
            c81663kb = null;
        }
        C06090Tz c06090Tz = C06090Tz.A06;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36318634297661813L);
        boolean A062 = C18U.A06(c06090Tz, userSession, 36318634297596276L);
        boolean z2 = false;
        if (c81663kb != null) {
            z = c81663kb.CVQ();
        } else {
            z = false;
        }
        if (A06 && z) {
            z2 = true;
        }
        if (A062) {
            if (z2) {
                c9e3 = new C9E3(userSession, 24);
                cls = C220109nw.class;
            } else {
                c9e3 = new C9E3(userSession, 25);
                cls = C220099nv.class;
            }
        } else if (z2) {
            c9e3 = new C9E3(userSession, 26);
            cls = C220119nx.class;
        } else {
            c9e3 = new C9E3(userSession, 27);
            cls = C77W.class;
        }
        return (AbstractC162207Oe) userSession.A01(cls, c9e3);
    }
}
