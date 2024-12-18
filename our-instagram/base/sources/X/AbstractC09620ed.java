package X;

import com.facebook.systrace.Systrace;

/* renamed from: X.0ed, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC09620ed {
    public static volatile boolean A00;

    public static long A00(long j) {
        if ((1 & C0ev.A02) != 0 && !A00) {
            A00 = true;
            Systrace.A08(1L, "fburl.com/fbsystrace", 1000);
            Systrace.A08(1L, "USE fbsystrace", 1000);
            Systrace.A08(1L, "DO NOT USE systrace", 1000);
        } else if (A00 && (1 & C0ev.A02) == 0) {
            A00 = false;
        }
        return j - System.nanoTime();
    }
}
