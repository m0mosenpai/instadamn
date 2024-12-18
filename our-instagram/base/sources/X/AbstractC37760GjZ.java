package X;

import com.instagram.api.schemas.ClipsMerchandisingPillType;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GjZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37760GjZ {
    public static final boolean A00(C120985dq c120985dq, C120985dq c120985dq2, UserSession userSession, int i, boolean z) {
        C3x9 A0u;
        C5HM BSU;
        Object obj;
        C3x9 A0u2;
        C5HM BSU2;
        List BSV;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM == null || (A0u = AbstractC25226BEj.A0u(c38321qM)) == null || (BSU = A0u.BSU()) == null) {
            return false;
        }
        int loopTime = BSU.getLoopTime();
        if (!C14360o3.A0K(c120985dq.getId(), c120985dq2.getId()) || z) {
            return false;
        }
        C38321qM c38321qM2 = c120985dq.A02;
        if (c38321qM2 != null && (A0u2 = AbstractC25226BEj.A0u(c38321qM2)) != null && (BSU2 = A0u2.BSU()) != null && (BSV = BSU2.BSV()) != null) {
            obj = AbstractC001800i.A0O(BSV, 0);
        } else {
            obj = null;
        }
        if (obj != ClipsMerchandisingPillType.A04 || i < loopTime) {
            return false;
        }
        return AbstractC31176DnK.A1a(C06090Tz.A05, userSession, 36316478223618469L);
    }
}
