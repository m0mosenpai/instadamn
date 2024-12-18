package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;

/* renamed from: X.ShT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63320ShT {
    public static final QuickPerformanceLogger A00 = QuickPerformanceLoggerProvider.getQPLInstance();

    public static final void A03(int i, String str, String str2, String str3) {
        QuickPerformanceLogger quickPerformanceLogger = A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerAnnotate(i, "iaw_session_id", str);
            quickPerformanceLogger.markerAnnotate(i, "checkout_session_id", str2);
            if (str3 == null) {
                str3 = "";
            }
            quickPerformanceLogger.markerAnnotate(i, "sdk_version", str3);
        }
    }

    public static final Integer A00(Integer num) {
        int i;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    return null;
                }
                i = 507383195;
            } else {
                i = 23273330;
            }
        } else {
            i = 37355529;
        }
        return Integer.valueOf(i);
    }

    public static final Integer A01(Integer num) {
        int i;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    return null;
                }
                i = 507388547;
            } else {
                i = 23281173;
            }
        } else {
            i = 37355531;
        }
        return Integer.valueOf(i);
    }

    public static final Integer A02(Integer num) {
        int i;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    return null;
                }
                i = 507385469;
            } else {
                i = 23270272;
            }
        } else {
            i = 37356947;
        }
        return Integer.valueOf(i);
    }
}
