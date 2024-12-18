package X;

import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.5sJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC128985sJ {
    public static final long A00(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 0);
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            long parseLong = Long.parseLong(A2E.getId());
            if (Long.valueOf(parseLong) != null) {
                return parseLong;
            }
            return -1L;
        }
        return -1L;
    }

    public static final Long A03(C38321qM c38321qM, Integer num) {
        int intValue;
        C14360o3.A0B(c38321qM, 0);
        if (c38321qM.A5M() && num != null && (intValue = num.intValue()) != -1) {
            return Long.valueOf(intValue);
        }
        return null;
    }

    public static final String A06(UserSession userSession, C38321qM c38321qM) {
        FollowStatus followStatus;
        C14360o3.A0B(userSession, 0);
        Parcelable.Creator creator = User.CREATOR;
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            followStatus = A2E.B7L();
        } else {
            followStatus = null;
        }
        return AbstractC38851rI.A06(followStatus);
    }

    public static final String A07(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c38321qM, 2);
        if (AbstractC75423a9.A02(c38321qM, interfaceC60442pS)) {
            return AbstractC41071vF.A0F(userSession, c38321qM);
        }
        return c38321qM.A0C.getOrganicTrackingToken();
    }

    public static final String A08(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        if (c38321qM.A5M() && (c38321qM = c38321qM.A1e(0)) == null) {
            return null;
        }
        return c38321qM.A0C.AZ3();
    }

    public static final String A09(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        String id = c38321qM.getId();
        if (id != null) {
            return id;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final String A0A(C38321qM c38321qM, Integer num) {
        C38321qM A1e;
        if (!c38321qM.A5M() || num == null || num.intValue() == -1 || (A1e = c38321qM.A1e(0)) == null) {
            return null;
        }
        return A1e.getId();
    }

    public static final Long A01(UserSession userSession, C38321qM c38321qM) {
        String A07 = AbstractC41071vF.A07(userSession, c38321qM);
        if (A07 != null) {
            return AbstractC003100w.A0k(10, A07);
        }
        return null;
    }

    public static final Long A02(UserSession userSession, C38321qM c38321qM) {
        if (c38321qM.CdW()) {
            return Long.valueOf(C77403dQ.A00.A06(userSession, c38321qM).size());
        }
        return null;
    }

    public static final Long A04(C38321qM c38321qM, Integer num) {
        int intValue;
        C38321qM A1e;
        if (!c38321qM.A5M() || num == null || (intValue = num.intValue()) == -1 || (A1e = c38321qM.A1e(intValue)) == null) {
            return null;
        }
        return Long.valueOf(A1e.BRp().A00);
    }

    public static final Long A05(C38321qM c38321qM, Integer num) {
        if (c38321qM.A5M() && num != null && num.intValue() != -1) {
            return Long.valueOf(c38321qM.A0p());
        }
        return null;
    }

    public static final String A0B(C38321qM c38321qM, Integer num) {
        int intValue;
        C38321qM A1e;
        if (!c38321qM.A5M() || num == null || (intValue = num.intValue()) == -1 || (A1e = c38321qM.A1e(intValue)) == null) {
            return null;
        }
        return A1e.getId();
    }
}
