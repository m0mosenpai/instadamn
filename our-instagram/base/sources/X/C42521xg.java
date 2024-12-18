package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: X.1xg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42521xg {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final C0f6 A05 = C18950wb.A01;
    public final C42541xi A06;
    public final HashSet A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean A00(String str) {
        if (this.A09) {
            HashSet hashSet = this.A07;
            if (hashSet.isEmpty() || hashSet.contains(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C42521xg(UserSession userSession) {
        HashSet hashSet;
        this.A06 = new C42541xi(userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        C18U.A06(c06090Tz, userSession, 36312565508211886L);
        this.A08 = C18U.A06(c06090Tz, userSession, 36314528308595374L);
        this.A00 = Long.valueOf(C18U.A01(c06090Tz, userSession, 36596973951257301L)).intValue();
        this.A0A = C18U.A06(c06090Tz, userSession, 36321314356667708L);
        this.A09 = C18U.A06(c06090Tz, userSession, 36325703813510445L);
        this.A0B = C18U.A06(c06090Tz, userSession, 36325703813444908L);
        String A04 = C18U.A04(c06090Tz, userSession, 36888653766722364L);
        if (A04.isEmpty()) {
            hashSet = new HashSet();
        } else {
            hashSet = new HashSet(Arrays.asList(A04.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1)));
        }
        this.A07 = hashSet;
        this.A01 = Long.valueOf(C18U.A01(c06090Tz, userSession, 36607178790278703L)).intValue();
        this.A02 = Long.valueOf(C18U.A01(c06090Tz, userSession, 36607178790344240L)).intValue();
        this.A03 = Long.valueOf(C18U.A01(c06090Tz, userSession, 36606680574334459L)).intValue();
        this.A04 = Long.valueOf(C18U.A01(c06090Tz, userSession, 36606680574072314L)).intValue();
    }
}
