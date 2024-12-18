package X;

/* loaded from: classes11.dex */
public final class W1Q {
    public final String A00;

    public static W1Q A00(C97974ac c97974ac) {
        String str;
        c97974ac.A0H(2);
        int A02 = c97974ac.A02();
        int i = A02 >> 1;
        int A022 = ((c97974ac.A02() >> 3) & 31) | ((A02 & 1) << 5);
        if (i != 4 && i != 5 && i != 7) {
            if (i == 8) {
                str = "hev1";
            } else if (i == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        String str2 = ".0";
        if (A022 >= 10) {
            str2 = ".";
        }
        return new W1Q(AnonymousClass001.A0o(str, ".0", str2, i, A022));
    }

    public W1Q(String str) {
        this.A00 = str;
    }
}
