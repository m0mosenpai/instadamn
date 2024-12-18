package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;

/* renamed from: X.1Hp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24461Hp {
    public final UserSession A00;
    public final java.util.Set A01 = new LinkedHashSet();
    public final java.util.Set A02 = new LinkedHashSet();
    public final java.util.Set A03 = new LinkedHashSet();
    public final java.util.Set A06 = new LinkedHashSet();
    public final java.util.Set A05 = new LinkedHashSet();
    public final java.util.Set A04 = new LinkedHashSet();

    public final String A00() {
        String str = null;
        if (C18U.A06(C06090Tz.A05, this.A00, 36317083814138660L)) {
            java.util.Set set = this.A04;
            if (!set.isEmpty()) {
                str = AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", set, null);
            }
            set.clear();
        }
        return str;
    }

    public final String A01() {
        String str = null;
        if (C18U.A06(C06090Tz.A05, this.A00, 36317083813942049L)) {
            java.util.Set set = this.A01;
            if (!set.isEmpty()) {
                str = AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", set, null);
            }
            set.clear();
        }
        return str;
    }

    public final String A02() {
        String str = null;
        if (C18U.A06(C06090Tz.A05, this.A00, 36317083814007586L)) {
            java.util.Set set = this.A02;
            if (!set.isEmpty()) {
                str = AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", set, null);
            }
            set.clear();
        }
        return str;
    }

    public final String A03() {
        String str = null;
        if (C18U.A06(C06090Tz.A05, this.A00, 36317083814073123L)) {
            java.util.Set set = this.A03;
            if (!set.isEmpty()) {
                str = AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", set, null);
            }
            set.clear();
        }
        return str;
    }

    public final String A04() {
        String str = null;
        if (C18U.A06(C06090Tz.A05, this.A00, 36317083813876512L)) {
            java.util.Set set = this.A06;
            if (!set.isEmpty()) {
                str = AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", set, null);
            }
            set.clear();
        }
        return str;
    }

    public final String A05() {
        String str = null;
        if (C18U.A06(C06090Tz.A05, this.A00, 36317083814204197L)) {
            java.util.Set set = this.A05;
            if (!set.isEmpty()) {
                str = AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", set, null);
            }
            set.clear();
        }
        return str;
    }

    public final void A06(String str) {
        if (C18U.A06(C06090Tz.A05, this.A00, 36317083813876512L) && str != null && !AbstractC001900j.A0T(str)) {
            this.A06.add(str);
        }
    }

    public C24461Hp(UserSession userSession) {
        this.A00 = userSession;
    }
}
