package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.7Ix, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC160897Ix {
    public static final Long A00(C7TT c7tt) {
        C14360o3.A0B(c7tt, 0);
        C1118752z c1118752z = c7tt.A0N;
        boolean z = c1118752z.A08;
        Integer num = c1118752z.A02;
        if (!z || num == null) {
            return null;
        }
        return Long.valueOf(TimeUnit.SECONDS.toMillis(num.intValue()));
    }

    public static final Long A01(C2EF c2ef) {
        Integer num;
        boolean Ay8 = c2ef.Ay8();
        C1118752z Ay9 = c2ef.Ay9();
        if (Ay9 != null) {
            num = Ay9.A02;
        } else {
            num = null;
        }
        if (!Ay8 || num == null) {
            return null;
        }
        return Long.valueOf(TimeUnit.SECONDS.toMillis(num.intValue()));
    }
}
