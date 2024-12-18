package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Deprecated;

/* renamed from: X.JeP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44100JeP {
    public final InterfaceC19630xq A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    public C44100JeP(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = C1AT.A01(userSession).A04(C1AV.A3X, C44100JeP.class);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A02 = AbstractC09440dt.A00(enumC09460dv, new C37051GUh(userSession, 3));
        this.A01 = AbstractC09440dt.A00(enumC09460dv, new C37051GUh(this, 2));
    }

    public static final java.util.Set A02(String str) {
        List A0m = AbstractC167007dF.A0m(str, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A0m.iterator();
        while (it.hasNext()) {
            Integer A0i = AbstractC003100w.A0i(AbstractC166987dD.A1B(it));
            if (A0i != null) {
                A1E.add(A0i);
            }
        }
        return AbstractC001800i.A0k(A1E);
    }

    private final LinkedHashMap A01(String str) {
        String string = this.A00.getString(str, null);
        if (string == null) {
            return AbstractC166987dD.A1I();
        }
        List A0m = AbstractC167007dF.A0m(string, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
        ArrayList A0q = AbstractC167017dG.A0q(A0m);
        Iterator it = A0m.iterator();
        while (it.hasNext()) {
            List A0m2 = AbstractC167007dF.A0m(AbstractC166987dD.A1B(it), ":", 0);
            AbstractC166997dE.A1R(Integer.valueOf(Integer.parseInt(AbstractC25226BEj.A1I(A0m2, 0))), Integer.valueOf(Integer.parseInt(AbstractC25226BEj.A1I(A0m2, 1))), A0q);
        }
        return AbstractC06930Yk.A03(AbstractC06930Yk.A08(A0q));
    }

    public static boolean A04(C44100JeP c44100JeP) {
        return C6CB.A02(((C6CF) c44100JeP.A02.getValue()).A00, 36315928470163182L);
    }

    public final void A09(long j) {
        InterfaceC19610xo ARD = this.A00.ARD();
        ARD.E7G("EB_CUTOVER_TIMESTAMP_MS", j);
        ARD.apply();
    }

    public static final String A00(Integer num) {
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 3) {
                if (intValue != 4) {
                    if (intValue != 7) {
                        if (intValue != 6) {
                            return null;
                        }
                        return "MEX_EBUPSELL_BANNER_INTERVAL_IMPRESSIONS";
                    }
                    return "MEX_EB_LOW_DISK_SPACE_BANNER_INTERVAL_IMPRESSION";
                }
                return "EB_WARN_BANNER_INTERVAL_IMPRESSIONS";
            }
            return "EB_SELL_BANNER_INTERVAL_IMPRESSIONS";
        }
        return "EB_INTRODUCE_BANNER_INTERVAL_IMPRESSIONS";
    }

    public static void A03(C44100JeP c44100JeP, Integer num, Number number) {
        c44100JeP.A08(number.intValue(), num);
    }

    public final long A05() {
        boolean z;
        Integer A06;
        if (!A04(this)) {
            z = false;
        } else {
            z = this.A00.getBoolean("EB_SHOULD_OVERRIDE_CUTOVER_TIMESTAMP", false);
        }
        if (z && (A06 = A06()) != null) {
            return System.currentTimeMillis() - (A06.intValue() * 86400000);
        }
        return this.A00.getLong("EB_CUTOVER_TIMESTAMP_MS", 0L);
    }

    @Deprecated(message = "INTERNAL DEBUG TOOLS, SHOULD NOT BE USED")
    public final Integer A06() {
        int i;
        if (!A04(this) || (i = this.A00.getInt("EB_CUTOVER_TIMESTAMP_OVERRIDE_MS", 99999)) == 99999) {
            return null;
        }
        return Integer.valueOf(i);
    }

    public final void A07(int i, Integer num) {
        String A00 = A00(num);
        LinkedHashMap A01 = A01(A00);
        Integer valueOf = Integer.valueOf(i);
        Number number = (Number) A01.getOrDefault(valueOf, null);
        int i2 = 1;
        if (number != null) {
            i2 = number.intValue() + 1;
        }
        AbstractC37301Gc2.A1T(valueOf, A01, i2);
        InterfaceC19610xo ARD = this.A00.ARD();
        ARD.E7K(A00, AbstractC25226BEj.A1H(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A01.entrySet(), C50321MJz.A00));
        ARD.apply();
    }

    public final void A08(int i, Integer num) {
        String A00 = A00(num);
        LinkedHashMap A01 = A01(A00);
        AbstractC37301Gc2.A1T(Integer.valueOf(i), A01, 2);
        InterfaceC19610xo ARD = this.A00.ARD();
        ARD.E7K(A00, AbstractC25226BEj.A1H(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A01.entrySet(), C50321MJz.A00));
        ARD.apply();
    }

    public final boolean A0A(Integer num, int i) {
        Number number = (Number) A01(A00(num)).getOrDefault(Integer.valueOf(i), null);
        if (number == null || number.intValue() < AbstractC167027dH.A01(this.A01)) {
            return false;
        }
        return true;
    }
}
