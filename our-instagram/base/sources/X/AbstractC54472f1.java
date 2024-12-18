package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2f1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC54472f1 {
    public static final boolean A05(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (!A06(userSession, 36325901381875195L) && !A06(userSession, 36325901381744121L)) {
            return false;
        }
        return true;
    }

    public static final boolean A07(UserSession userSession, boolean z) {
        long j;
        C14360o3.A0B(userSession, 0);
        if (A04(18301933686558975L, true) && A06(userSession, 2342162532568931818L)) {
            if (z) {
                if (!A06(userSession, 36319523355303403L)) {
                    j = 18301933688721683L;
                } else {
                    if (A06(userSession, 36319523355434477L)) {
                        return false;
                    }
                    j = 18310618109522584L;
                }
                if (!A04(j, true)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        if (A04(18301933688262928L, true)) {
            return true;
        }
        return false;
    }

    public static final boolean A08(UserSession userSession, boolean z) {
        boolean A04;
        C14360o3.A0B(userSession, 0);
        if (!A06(userSession, 2342162532568931818L)) {
            return false;
        }
        if (!z) {
            return true;
        }
        if (!A06(userSession, 36319523355303403L)) {
            A04 = A06(userSession, 36325025208414874L);
        } else {
            if (A06(userSession, 36319523355434477L)) {
                return true;
            }
            A04 = A04(18310618109522584L, true);
        }
        return !A04;
    }

    public static final boolean A04(long j, boolean z) {
        if (z) {
            C1AD.A05(j);
        }
        C06090Tz c06090Tz = C06090Tz.A04;
        if (!z) {
            c06090Tz = C06090Tz.A00(c06090Tz);
            c06090Tz.A03 = true;
        }
        C14360o3.A0A(c06090Tz);
        return C1AD.A06(c06090Tz, j);
    }

    public static final int A00(int i) {
        if (A04(18301933687345414L, true)) {
            return 1;
        }
        if (!A04(18301933686690049L, true)) {
            return i;
        }
        return 2;
    }

    public static final boolean A01() {
        return A04(18301933685182711L, true);
    }

    public static final boolean A02() {
        return A04(18301933685248248L, true);
    }

    public static final boolean A03() {
        if (A04(18316910236157171L, true)) {
            return false;
        }
        return A04(18301933685313785L, true);
    }

    public static final boolean A06(UserSession userSession, long j) {
        boolean AhA;
        boolean A04 = A04(18311953843763023L, true);
        C229419w A02 = C18U.A02(userSession, j);
        if (A04) {
            if (A02 != null) {
                AhA = A02.AhE(C06090Tz.A04, j);
            } else {
                return false;
            }
        } else if (A02 != null) {
            AhA = A02.AhA(j);
        } else {
            return false;
        }
        if (AhA) {
            return true;
        }
        return false;
    }
}
