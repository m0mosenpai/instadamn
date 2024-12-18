package X;

/* loaded from: classes11.dex */
public final class W1N {
    public final String A00;

    public static W1N A00(WFa wFa) {
        String str;
        wFa.A0P(2);
        int A05 = wFa.A05();
        int i = A05 >> 1;
        int A052 = ((wFa.A05() >> 3) & 31) | ((A05 & 1) << 5);
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
        if (A052 >= 10) {
            str2 = ".";
        }
        return new W1N(AnonymousClass001.A0o(str, ".0", str2, i, A052));
    }

    public W1N(String str) {
        this.A00 = str;
    }
}
