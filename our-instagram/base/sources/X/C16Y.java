package X;

import com.facebook.common.dextricks.DexStore;
import com.instagram.debug.devoptions.debughead.util.MemoryUtil;

/* renamed from: X.16Y, reason: invalid class name */
/* loaded from: classes.dex */
public final class C16Y {
    public static final String A01 = String.valueOf(Long.MIN_VALUE).substring(1);
    public static final String A00 = String.valueOf(Long.MAX_VALUE);

    public static int A01(String str) {
        String trim;
        int length;
        if (str == null || (length = (trim = str.trim()).length()) == 0) {
            return 0;
        }
        int i = 0;
        char charAt = trim.charAt(0);
        if (charAt == '+') {
            trim = trim.substring(1);
            length = trim.length();
        } else if (charAt == '-') {
            i = 1;
        }
        while (i < length) {
            try {
                char charAt2 = trim.charAt(i);
                if (charAt2 <= '9' && charAt2 >= '0') {
                    i++;
                } else {
                    return (int) A00(trim);
                }
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return Integer.parseInt(trim);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x005a, code lost:
    
        if (r6 > 9) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A02(java.lang.String r8) {
        /*
            r7 = 0
            char r5 = r8.charAt(r7)
            int r6 = r8.length()
            r2 = 1
            r0 = 45
            if (r5 != r0) goto L58
            r7 = 1
            r0 = 10
            if (r6 == r2) goto L5c
            if (r6 > r0) goto L5c
            char r5 = r8.charAt(r2)
            r2 = 2
        L1a:
            r4 = 57
            if (r5 > r4) goto L5c
            r3 = 48
            if (r5 < r3) goto L5c
            int r5 = r5 - r3
            if (r2 >= r6) goto L61
            int r1 = r2 + 1
            char r0 = r8.charAt(r2)
            if (r0 > r4) goto L5c
            if (r0 < r3) goto L5c
            int r5 = r5 * 10
            int r0 = r0 - r3
            int r5 = r5 + r0
            if (r1 >= r6) goto L61
            int r2 = r1 + 1
            char r0 = r8.charAt(r1)
            if (r0 > r4) goto L5c
            if (r0 < r3) goto L5c
            int r5 = r5 * 10
            int r0 = r0 - r3
            int r5 = r5 + r0
            if (r2 >= r6) goto L61
        L45:
            int r1 = r2 + 1
            char r0 = r8.charAt(r2)
            if (r0 > r4) goto L5c
            if (r0 < r3) goto L5c
            int r5 = r5 * 10
            int r0 = r0 + (-48)
            int r5 = r5 + r0
            if (r1 >= r6) goto L61
            r2 = r1
            goto L45
        L58:
            r0 = 9
            if (r6 <= r0) goto L1a
        L5c:
            int r0 = java.lang.Integer.parseInt(r8)
            return r0
        L61:
            if (r7 == 0) goto L64
            int r5 = -r5
        L64:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16Y.A02(java.lang.String):int");
    }

    public static double A00(String str) {
        if ("2.2250738585072012e-308".equals(str)) {
            return Double.MIN_VALUE;
        }
        return Double.parseDouble(str);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    public static int A03(char[] cArr, int i, int i2) {
        int i3 = cArr[(i + i2) - 1] - '0';
        switch (i2) {
            case 9:
                i3 += (cArr[i] - '0') * 100000000;
                i++;
            case 8:
                i3 += (cArr[i] - '0') * MemoryUtil.MAX_ALLOC_SIZE;
                i++;
            case 7:
                i3 += (cArr[i] - '0') * DexStore.MS_IN_NS;
                i++;
            case 6:
                i3 += (cArr[i] - '0') * 100000;
                i++;
            case 5:
                i3 += (cArr[i] - '0') * 10000;
                i++;
            case 4:
                i3 += (cArr[i] - '0') * 1000;
                i++;
            case 3:
                i3 += (cArr[i] - '0') * 100;
                i++;
            case 2:
                return i3 + ((cArr[i] - '0') * 10);
            default:
                return i3;
        }
    }

    public static long A05(char[] cArr, int i, int i2) {
        int i3 = i2 - 9;
        return (A03(cArr, i, i3) * 1000000000) + A03(cArr, i + i3, 9);
    }

    public static long A04(String str) {
        if (str.length() <= 9) {
            return A02(str);
        }
        return Long.parseLong(str);
    }
}
