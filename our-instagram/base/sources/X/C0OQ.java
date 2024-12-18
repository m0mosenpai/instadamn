package X;

import com.facebook.errorreporting.lacrima.common.check.DirectReports;
import java.util.Random;

/* renamed from: X.0OQ, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0OQ {
    public static long A00 = -2;
    public static long A01 = -2;
    public static long A02 = -2;
    public static long A03 = -2;
    public static boolean A04;
    public static boolean A05;
    public static boolean A06;
    public static final C03720In A07 = new C03720In("ActivityThreadDataCollector");

    public static void A00(Throwable th, String str, Object... objArr) {
        Random random = AbstractC03760Ir.A00;
        if (random == null) {
            random = new Random(System.currentTimeMillis() ^ new Object().hashCode());
            AbstractC03760Ir.A00 = random;
        }
        if (random.nextInt(1000) == 1) {
            String format = String.format(str, objArr);
            A07.A0A(th, "Sending Direct SoftErrorReport for errmsg: %s", format);
            DirectReports.A01(null, null, null, null, "android_reliability_on_pause_hooking", format, th, null);
            return;
        }
        A07.A06(str, th, objArr, 6, 2);
    }
}
