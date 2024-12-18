package X;

import android.util.Pair;

/* loaded from: classes11.dex */
public abstract class VSA {
    public static Pair A00(C1338462s c1338462s) {
        C102884kP c102884kP = c1338462s.A02;
        C102884kP c102884kP2 = (C102884kP) C102884kP.A00(c102884kP, 35);
        if (c102884kP2 != null) {
            return new Pair(c102884kP, new C1338462s(null, c1338462s.A01, c102884kP2, c1338462s.A03));
        }
        throw new IllegalStateException("Null content for BottomSheet");
    }
}
