package X;

import com.facebook.common.build.BuildConstants;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.1LE, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1LE {
    public static final int A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36331055342503057L)) {
            return ((int) C18U.A01(c06090Tz, userSession, 36612530319137173L)) * 1000;
        }
        return 15000;
    }

    public static final long A01(UserSession userSession) {
        long j;
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36318479681460425L) && !C18U.A06(c06090Tz, userSession, 36318479681591498L)) {
            j = 36607320523871826L;
        } else {
            j = 36599954658102955L;
        }
        return C18U.A01(c06090Tz, userSession, j);
    }

    public static final List A02(UserSession userSession) {
        long j;
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36318479681460425L) && !C18U.A06(c06090Tz, userSession, 36318479681591498L)) {
            j = 36888795500708677L;
        } else {
            j = 36881429634679163L;
        }
        return AbstractC001900j.A0R(C18U.A04(c06090Tz, userSession, j), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
    }

    public static final boolean A03(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36324441092796586L);
    }

    public static final boolean A04(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36318479681591498L);
    }

    public static final boolean A05(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36318479681460425L);
    }

    public static final boolean A06(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36325845547103669L) && !C18U.A06(c06090Tz, userSession, 36318479681460425L) && !C18U.A06(c06090Tz, userSession, 36318479681591498L)) {
            return false;
        }
        return true;
    }

    public static final boolean A07(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (!C18U.A06(C06090Tz.A06, userSession, 36325055273317035L) && !C18U.A06(C06090Tz.A05, userSession, 36321211277386967L)) {
            return false;
        }
        return true;
    }

    public static final boolean A08(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (BuildConstants.A02() && C18U.A06(C06090Tz.A05, userSession, 36316018661986172L)) {
            return true;
        }
        return false;
    }

    public static final boolean A09(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36318479679756469L) && !C18U.A06(c06090Tz, userSession, 36318479679559858L) && !C18U.A06(c06090Tz, userSession, 36318479679822006L) && !C18U.A06(c06090Tz, userSession, 36318479679625395L) && !C18U.A06(c06090Tz, userSession, 36318479679887543L) && !C18U.A06(c06090Tz, userSession, 36318479679690932L)) {
            C06090Tz c06090Tz2 = C06090Tz.A06;
            if (!C18U.A06(c06090Tz2, userSession, 36319209826557006L) && !C18U.A06(c06090Tz2, userSession, 36319209826622543L) && !C18U.A06(c06090Tz2, userSession, 36321937127450530L) && !A0A(userSession) && !C18U.A06(c06090Tz2, userSession, 36321937127516067L) && !C18U.A06(c06090Tz2, userSession, 36321937127581604L)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A0B(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36328151944543477L);
    }

    public static final boolean A0C(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36325579259131059L);
    }

    public static final boolean A0D(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A06;
        if (!C18U.A06(c06090Tz, userSession, 36325055273382572L) && !C18U.A06(c06090Tz, userSession, 36321211278304483L)) {
            return false;
        }
        return true;
    }

    public static final boolean A0E(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (A0F(userSession) && C18U.A06(C06090Tz.A06, userSession, 36316018662051709L)) {
            return true;
        }
        return false;
    }

    public static final boolean A0A(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A06;
        if (!C18U.A06(c06090Tz, userSession, 36312874756670945L) && !C18U.A06(c06090Tz, userSession, 36312874755622354L)) {
            return false;
        }
        return true;
    }

    public static final boolean A0F(UserSession userSession) {
        if (BuildConstants.A02() && C18U.A06(C06090Tz.A06, userSession, 36316018661986172L)) {
            return true;
        }
        return false;
    }

    public static final boolean A0G(UserSession userSession) {
        if (AbstractC23021Ah.A00(userSession).A1n() && C18U.A06(C06090Tz.A05, userSession, 36318844750404142L)) {
            return true;
        }
        return false;
    }
}
