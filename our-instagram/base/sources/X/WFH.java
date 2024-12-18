package X;

import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public final class WFH {
    public final WFa A00 = new WFa();
    public final StringBuilder A01 = new StringBuilder();
    public static final Pattern A03 = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern A02 = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0022 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A00(X.WFa r6, java.lang.StringBuilder r7) {
        /*
            r5 = 0
            r7.setLength(r5)
            int r4 = r6.A01
            r3 = r4
            int r2 = r6.A00
        L9:
            if (r3 >= r2) goto L42
            if (r5 != 0) goto L42
            byte[] r0 = r6.A02
            r0 = r0[r3]
            char r1 = (char) r0
            r0 = 65
            if (r1 < r0) goto L24
            r0 = 90
            if (r1 <= r0) goto L3c
            r0 = 97
            if (r1 < r0) goto L38
            r0 = 122(0x7a, float:1.71E-43)
        L20:
            if (r1 <= r0) goto L3c
        L22:
            r5 = 1
            goto L9
        L24:
            r0 = 48
            if (r1 < r0) goto L2b
            r0 = 57
            goto L20
        L2b:
            r0 = 35
            if (r1 == r0) goto L3c
            r0 = 45
            if (r1 == r0) goto L3c
            r0 = 46
            if (r1 == r0) goto L3c
            goto L22
        L38:
            r0 = 95
            if (r1 != r0) goto L22
        L3c:
            int r3 = r3 + 1
            r7.append(r1)
            goto L9
        L42:
            int r3 = r3 - r4
            r6.A0P(r3)
            java.lang.String r0 = r7.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WFH.A00(X.WFa, java.lang.StringBuilder):java.lang.String");
    }

    public static void A02(WFa wFa) {
        int i;
        while (true) {
            boolean z = true;
            while (true) {
                int i2 = wFa.A00;
                int i3 = wFa.A01;
                if (i2 - i3 > 0 && z) {
                    byte[] bArr = wFa.A02;
                    byte b = bArr[i3];
                    char c = (char) b;
                    if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                        break;
                    }
                    if (i3 + 2 <= i2) {
                        int i4 = i3 + 1;
                        if (b == 47) {
                            int i5 = i4 + 1;
                            if (bArr[i4] == 42) {
                                while (true) {
                                    int i6 = i5 + 1;
                                    if (i6 >= i2) {
                                        break;
                                    }
                                    if (((char) bArr[i5]) == '*' && ((char) bArr[i6]) == '/') {
                                        i2 = i6 + 1;
                                        i5 = i2;
                                    } else {
                                        i5 = i6;
                                    }
                                }
                                i = i2 - i3;
                            }
                        } else {
                            continue;
                        }
                    }
                    z = false;
                } else {
                    return;
                }
            }
            i = 1;
            wFa.A0P(i);
        }
    }

    public static String A01(WFa wFa, StringBuilder sb) {
        A02(wFa);
        if (wFa.A00 - wFa.A01 == 0) {
            return null;
        }
        String A00 = A00(wFa, sb);
        if (!"".equals(A00)) {
            return A00;
        }
        return AnonymousClass001.A0C("", (char) wFa.A05());
    }
}
