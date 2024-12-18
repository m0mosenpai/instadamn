package X;

import java.util.List;

/* loaded from: classes4.dex */
public abstract class AJp {
    public static final List A00 = AbstractC16960so.A1Q('$', '@', '#', '%', '&', '*');

    public static final boolean A01(String str) {
        C14360o3.A0B(str, 0);
        if (!AbstractC001900j.A0T(str)) {
            for (int i = 0; i < str.length(); i++) {
                if (A00.contains(Character.valueOf(str.charAt(i)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final String A00(int i) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        if (i < 4) {
            i = 4;
        }
        int i2 = 0;
        do {
            A1C.append(((Character) AbstractC167007dF.A0e(A00, i2)).charValue());
            i2++;
        } while (i2 < i);
        return AbstractC166987dD.A19(A1C);
    }
}
