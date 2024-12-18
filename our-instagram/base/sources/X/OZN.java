package X;

import android.content.Context;

/* loaded from: classes9.dex */
public abstract class OZN {
    public static Integer A00;
    public static Integer A01;

    public static int A00(Context context) {
        Integer num = A00;
        if (num == null) {
            num = Integer.valueOf(Math.round(A01(context) / 0.643f));
            A00 = num;
        }
        return num.intValue();
    }

    public static int A01(Context context) {
        Integer num = A01;
        if (num == null) {
            num = Integer.valueOf(AbstractC13880nE.A0A(context) / 2);
            A01 = num;
        }
        return num.intValue();
    }

    public static String A02(String str) {
        if (str.indexOf("series_") == 0) {
            return str.substring(7);
        }
        return str;
    }
}
