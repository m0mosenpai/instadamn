package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;

/* renamed from: X.3Gx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71113Gx {
    public static final Integer A00(Integer num) {
        if (num != null) {
            for (Integer num2 : C05F.A00(20)) {
                if (C5MB.A00(num2) == num.intValue()) {
                    return num2;
                }
            }
        }
        return null;
    }

    public final boolean A01(Integer num) {
        Integer A00 = A00(num);
        if (A00 != null) {
            int intValue = A00.intValue();
            if (intValue != 3 && intValue != 12) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A02(Integer num) {
        Integer A00 = A00(num);
        if (A00 != null) {
            int intValue = A00.intValue();
            if (intValue != 2) {
                switch (intValue) {
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    case 16:
                    case 17:
                    case 18:
                    case Process.SIGSTOP /* 19 */:
                        return true;
                }
            }
            return true;
        }
        return false;
    }
}
