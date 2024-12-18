package X;

import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.43V, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C43V {
    public static C101584hT A00(C101674hc c101674hc, C101594hU c101594hU, C38321qM c38321qM, Integer num, String str, String str2, int i) {
        if (Systrace.A0E(32L)) {
            AbstractC09800fd.A01("DirectMessagePostProcessHelper.migrateToVisualMedia", -383801318);
        }
        try {
            C101584hT c101584hT = new C101584hT();
            c101584hT.A03 = c101674hc;
            c101584hT.A05 = c38321qM;
            c101584hT.A04 = c101594hU;
            c101584hT.A0A = str;
            c101584hT.A00 = i;
            if (num != null) {
                c101584hT.A00 = Math.max(i, num.intValue());
            }
            c101584hT.A09 = str2;
            if (c101594hU != null) {
                c101584hT.A06 = c101594hU.A0C;
                c101584hT.A07 = c101594hU.A0D;
                c101584hT.A08 = c101594hU.A0E;
                c101584hT.A0B = c101594hU.A0M;
            }
            if (Systrace.A0E(32L)) {
                AbstractC09800fd.A00(-2004609323);
            }
            return c101584hT;
        } catch (Throwable th) {
            if (Systrace.A0E(32L)) {
                AbstractC09800fd.A00(-575035564);
            }
            throw th;
        }
    }

    public static C38321qM A01(UserSession userSession, C38321qM c38321qM, String str) {
        User A02;
        if (Systrace.A0E(32L)) {
            AbstractC09800fd.A01("DirectMessagePostProcessHelper.updateMediaCache", -1212622093);
        }
        if (c38321qM != null) {
            try {
                if (c38321qM.getId() != null && c38321qM.A2E(userSession) == null && (A02 = AnonymousClass189.A00(userSession).A02(str)) != null) {
                    c38321qM.A0C.EgZ(A02);
                    C38321qM A00 = C1DW.A00(userSession).A00(c38321qM);
                    if (Systrace.A0E(32L)) {
                        AbstractC09800fd.A00(1565754489);
                    }
                    return A00;
                }
            } catch (Throwable th) {
                if (Systrace.A0E(32L)) {
                    AbstractC09800fd.A00(1022956074);
                }
                throw th;
            }
        }
        if (Systrace.A0E(32L)) {
            AbstractC09800fd.A00(-2033391762);
        }
        return c38321qM;
    }

    public static C38321qM A02(UserSession userSession, C38321qM c38321qM, String str) {
        User A02;
        if (Systrace.A0E(32L)) {
            AbstractC09800fd.A01("DirectMessagePostProcessHelper.updateMediaCacheNotNull", -1231759664);
        }
        try {
            if (c38321qM.A2E(userSession) == null && (A02 = AnonymousClass189.A00(userSession).A02(str)) != null) {
                c38321qM.A0C.EgZ(A02);
                C38321qM A00 = C1DW.A00(userSession).A00(c38321qM);
                if (Systrace.A0E(32L)) {
                    AbstractC09800fd.A00(1530607353);
                }
                return A00;
            }
            if (Systrace.A0E(32L)) {
                AbstractC09800fd.A00(-299285988);
            }
            return c38321qM;
        } catch (Throwable th) {
            if (Systrace.A0E(32L)) {
                AbstractC09800fd.A00(-680044565);
            }
            throw th;
        }
    }
}
