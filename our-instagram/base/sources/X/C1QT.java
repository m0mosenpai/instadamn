package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.1QT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1QT extends UserFlowLoggerImpl {
    public final QuickPerformanceLogger A00;

    public C1QT(QuickPerformanceLogger quickPerformanceLogger) {
        super(quickPerformanceLogger, false);
        this.A00 = quickPerformanceLogger;
    }

    public final long A00(Integer num, String str, String str2) {
        int i;
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        switch (num.intValue()) {
            case 0:
                i = 220145826;
                break;
            case 1:
                i = 220146361;
                break;
            case 2:
                i = 220137636;
                break;
            case 3:
                i = 220137730;
                break;
            case 4:
                i = 220140399;
                break;
            case 5:
                i = 220147597;
                break;
            case 6:
                i = 220151436;
                break;
            case 7:
                i = 220146420;
                break;
            case 8:
                i = 220140388;
                break;
            default:
                i = 220137859;
                break;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C14360o3.A07(lowerCase);
        int hashCode = Arrays.hashCode(new Object[]{lowerCase, Integer.valueOf((int) System.currentTimeMillis())});
        this.A00.markerLinkPivot(i, hashCode, lowerCase);
        Long flowStartIfNotOngoingForMarker = flowStartIfNotOngoingForMarker(i, hashCode, str2, false, 300000L);
        if (flowStartIfNotOngoingForMarker != null) {
            return flowStartIfNotOngoingForMarker.longValue();
        }
        return 0L;
    }

    public final AHF A01(String str, int i) {
        AHF ahf = new AHF(this);
        ahf.A00 = i;
        ahf.A02 = str;
        return ahf;
    }
}
