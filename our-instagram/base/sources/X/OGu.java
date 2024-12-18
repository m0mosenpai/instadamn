package X;

import com.facebook.mobileconfig.factory.MobileConfigValueSource;

/* loaded from: classes9.dex */
public final class OGu {
    public C54513O6q A00;

    public final String A01(String str) {
        C54513O6q c54513O6q = this.A00;
        if (c54513O6q == null) {
            return null;
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        Number A0Q = AbstractC37300Gc1.A0Q(str, c54513O6q.A00);
        if (A0Q != null) {
            long longValue = A0Q.longValue();
            if (longValue != 0) {
                C229419w c229419w = c54513O6q.A01;
                C06090Tz A00 = C06090Tz.A00(c06090Tz);
                A00.A02 = true;
                String C2x = c229419w.C2x(A00, longValue);
                MobileConfigValueSource mobileConfigValueSource = A00.A00.A00;
                if (mobileConfigValueSource == MobileConfigValueSource.SERVER) {
                    return C2x;
                }
                if (mobileConfigValueSource == MobileConfigValueSource.OVERRIDE) {
                    return C2x;
                }
            }
        }
        return null;
    }

    public static String A00(String str, String str2, int i) {
        String str3;
        if (str2.length() > 0) {
            str3 = AnonymousClass001.A0R("_", str2);
        } else {
            str3 = "";
        }
        return AnonymousClass001.A07(i, str, str3, "_V");
    }
}
