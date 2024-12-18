package X;

/* renamed from: X.0MG, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0MG {
    public static char A00(char c, char c2, char c3) {
        if (c2 != '0' && c2 != 'i') {
            if (c2 != '9' || c != 'j') {
                if ((c == 'R' || c == 'U' || c == 'r' || c == 'c' || c == 'u' || c == 'q' || c == 'm' || c == 'j') && c2 == 'Q') {
                    return c;
                }
                return c2;
            }
        } else if (c3 != '0' && c3 != 'i') {
            return c3;
        }
        return c;
    }

    public static boolean A01(char c) {
        if ('r' != c && 'c' != c && 's' != c && 'p' != c && 'f' != c) {
            return false;
        }
        return true;
    }

    public static boolean A02(Integer num, char c) {
        for (C0MI c0mi : C0MI.values()) {
            if (c0mi.A01 == c) {
                if (c0mi.A00 != num) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
