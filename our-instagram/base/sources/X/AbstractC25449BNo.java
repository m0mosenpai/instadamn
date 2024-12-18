package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BNo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25449BNo {
    public static final float A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36329307291074814L)) {
            return (float) C18U.A00(C06090Tz.A06, userSession, 37173732220928614L);
        }
        return 0.0f;
    }

    public static final float A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36329307291009277L)) {
            return (float) C18U.A00(C06090Tz.A06, userSession, 37173732220863077L);
        }
        return 0.0f;
    }

    public static final int A03(UserSession userSession, int i) {
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36329307291009277L)) {
            return AbstractC13950nL.A06(i, (float) C18U.A00(C06090Tz.A06, userSession, 37173732220994151L));
        }
        return -7829368;
    }

    public static final Integer A07(UserSession userSession, int i) {
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36329307291074814L)) {
            return Integer.valueOf(AbstractC13950nL.A06(i, (float) C18U.A00(C06090Tz.A06, userSession, 37173732221059688L)));
        }
        return null;
    }

    public static int A02(C2YS c2ys, UserSession userSession) {
        return A03(userSession, AbstractC77623dm.A01(c2ys));
    }

    public static long A04(UserSession userSession) {
        return Double.doubleToRawLongBits(A01(userSession));
    }

    public static long A05(UserSession userSession) {
        return Double.doubleToRawLongBits(A00(userSession));
    }

    public static Integer A06(C2YS c2ys, UserSession userSession) {
        return A07(userSession, AbstractC77623dm.A01(c2ys));
    }
}
