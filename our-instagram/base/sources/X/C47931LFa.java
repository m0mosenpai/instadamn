package X;

import android.os.SystemClock;
import java.util.List;

/* renamed from: X.LFa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47931LFa {
    public static long A00;
    public static final C47931LFa A02 = new Object();
    public static final C45125Jxu A01 = new C45125Jxu(C05F.A00, AbstractC166987dD.A1E());

    public final C45125Jxu A00() {
        C45125Jxu c45125Jxu = A01;
        if (((List) c45125Jxu.A04).isEmpty() || SystemClock.uptimeMillis() - A00 >= 1800000) {
            return null;
        }
        return c45125Jxu;
    }
}
