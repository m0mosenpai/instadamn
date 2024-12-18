package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.8uc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200958uc {
    public final QuickPerformanceLogger A00;

    public static final int A00(Map map) {
        String str = (String) map.get("instance_key");
        if (str != null) {
            return Integer.parseInt(str);
        }
        return -1;
    }

    public final void A02(int i) {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerStart(i);
            quickPerformanceLogger.markerAnnotate(i, "platform", "Android");
            quickPerformanceLogger.markerAnnotate(i, "app_id", 567067343352427L);
            quickPerformanceLogger.markerAnnotate(i, "app_source", "INSTAGRAM_WITH_V2_PROVIDER");
            quickPerformanceLogger.markerAnnotate(i, "item_type", "ACCOUNT_ITEM");
            quickPerformanceLogger.markerAnnotate(i, "credential_source", "ACTIVE_ACCOUNT");
            quickPerformanceLogger.markerAnnotate(i, "logging_version", "3.0");
        }
    }

    public C200958uc(QuickPerformanceLogger quickPerformanceLogger) {
        this.A00 = quickPerformanceLogger;
    }

    public static final void A01(Map map, C200958uc c200958uc, int i) {
        String str;
        QuickPerformanceLogger quickPerformanceLogger;
        for (Map.Entry entry : map.entrySet()) {
            Integer[] A00 = C05F.A00(4);
            int length = A00.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    switch (A00[i2].intValue()) {
                        case 1:
                            str = "CALLER_NAME";
                            break;
                        case 2:
                            str = AbstractC111324zv.A00(154);
                            break;
                        case 3:
                            str = "TARGET_APP_FETCH_RESULT";
                            break;
                        default:
                            str = "RESOLVER_NAME";
                            break;
                    }
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    C14360o3.A07(lowerCase);
                    if (lowerCase.equals(entry.getKey())) {
                        CharSequence charSequence = (CharSequence) entry.getValue();
                        if (charSequence != null && charSequence.length() != 0 && (quickPerformanceLogger = c200958uc.A00) != null) {
                            quickPerformanceLogger.markerAnnotate(857814189, i, (String) entry.getKey(), (String) entry.getValue());
                        }
                    } else {
                        i2++;
                    }
                }
            }
        }
    }
}
