package X;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7Ck, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC159247Ck {
    public static final boolean A00(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        if (z && !C4GR.A04(i) && !C4GR.A07(Integer.valueOf(i)) && i != 1013 && !z2 && !z3 && !z4) {
            return true;
        }
        return false;
    }

    public static final boolean A01(C83403nh c83403nh) {
        if (c83403nh.A1F == C05F.A0j && c83403nh.A10 == C2EY.A1i) {
            List A0u = c83403nh.A0u();
            if ((A0u == null || A0u.isEmpty()) && c83403nh.A13 == null && TimeUnit.MICROSECONDS.toMinutes(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()) - c83403nh.C8i()) < 15) {
                return true;
            }
            return false;
        }
        return false;
    }
}
