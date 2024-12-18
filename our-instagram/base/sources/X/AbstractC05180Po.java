package X;

import java.util.Random;

/* renamed from: X.0Po, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC05180Po {
    public static final Random A00 = new Random();

    public static final String A00(long j) {
        if (j >= 0) {
            if (j <= (1 << Math.min(63, 66)) - 1) {
                StringBuilder sb = new StringBuilder();
                int i = 0;
                do {
                    sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((int) (j % 64)));
                    j >>= 6;
                    i++;
                } while (i < 11);
                if (j <= 0) {
                    sb.reverse();
                    String obj = sb.toString();
                    C14360o3.A07(obj);
                    return obj;
                }
                throw new IllegalArgumentException("Number won't fit in string");
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot internalEncode integer ");
            sb2.append(j);
            sb2.append(" in ");
            sb2.append(11);
            sb2.append(" chars");
            throw new IllegalArgumentException(sb2.toString());
        }
        throw new IllegalArgumentException(AnonymousClass001.A0Q("Cannot internalEncode negative integer ", j));
    }
}
