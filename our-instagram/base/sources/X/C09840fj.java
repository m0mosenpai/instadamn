package X;

import java.security.SecureRandom;
import java.util.UUID;

/* renamed from: X.0fj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09840fj {
    public static String A00;

    public static final synchronized String A00() {
        String str;
        synchronized (C09840fj.class) {
            str = A00;
            if (str == null) {
                SecureRandom secureRandom = new SecureRandom();
                str = new UUID(secureRandom.nextLong() ^ System.currentTimeMillis(), secureRandom.nextLong()).toString();
                A00 = str;
            }
            if (str == null) {
                C14360o3.A0F("_processUuid");
                throw C00O.createAndThrow();
            }
        }
        return str;
    }
}
