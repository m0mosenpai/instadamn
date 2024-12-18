package X;

import com.facebook.mobileconfig.MobileConfigCxxLogger;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1AO, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1AO {
    public static MobileConfigCxxLogger A00;
    public static final java.util.Set A01 = Collections.newSetFromMap(new ConcurrentHashMap());

    public static void A00(String str, String str2) {
        if (A00 != null) {
            java.util.Set set = A01;
            if (!set.contains("DiskCorruptionError")) {
                set.add("DiskCorruptionError");
                if (A00 != null) {
                    A00.logEvent("mobile_config_error", new C25010B4k(str, str2));
                }
            }
        }
    }
}
