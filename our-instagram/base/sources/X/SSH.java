package X;

import android.text.TextUtils;

/* loaded from: classes10.dex */
public abstract class SSH {
    public static final boolean A00(EnumC61219RhJ enumC61219RhJ, String str) {
        int length;
        if (str == null || (length = str.length()) == 0 || EnumC61219RhJ.A0E == enumC61219RhJ || !TextUtils.isDigitsOnly(str) || length < enumC61219RhJ.A01 || length > enumC61219RhJ.A00) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int charAt = str.charAt((length - 1) - i2) - '0';
            if (i2 % 2 != 0 && (charAt = charAt * 2) > 9) {
                charAt = (charAt - 10) + 1;
            }
            i += charAt;
        }
        return i % 10 == 0;
    }

    public static final boolean A01(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return A00(EnumC61219RhJ.A06.A02(str), str);
    }
}
