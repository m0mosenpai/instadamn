package X;

import com.facebook.forker.Process;

/* renamed from: X.00w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC003100w extends AnonymousClass010 {
    public static final Integer A0i(String str) {
        C14360o3.A0B(str, 0);
        return A0j(str, 10);
    }

    public static final Integer A0j(String str, int i) {
        boolean z;
        int i2;
        C14360o3.A0B(str, 0);
        int length = str.length();
        if (length != 0) {
            int i3 = 0;
            char charAt = str.charAt(0);
            int A00 = C14360o3.A00(charAt, 48);
            int i4 = Process.WAIT_RESULT_STOPPED;
            int i5 = 1;
            if (A00 < 0) {
                if (length != 1) {
                    if (charAt == '-') {
                        i4 = Integer.MIN_VALUE;
                        z = true;
                    } else if (charAt == '+') {
                        z = false;
                    }
                }
            } else {
                z = false;
                i5 = 0;
            }
            int i6 = -59652323;
            while (i5 < length) {
                int digit = Character.digit((int) str.charAt(i5), i);
                if (digit >= 0 && ((i3 >= i6 || (i6 == -59652323 && i3 >= (i6 = i4 / i))) && (i2 = i3 * i) >= i4 + digit)) {
                    i3 = i2 - digit;
                    i5++;
                }
            }
            if (z) {
                return Integer.valueOf(i3);
            }
            return Integer.valueOf(-i3);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Long A0k(int r18, java.lang.String r19) {
        /*
            r0 = 0
            r10 = r19
            X.C14360o3.A0B(r10, r0)
            int r9 = r10.length()
            r17 = 0
            if (r9 == 0) goto L53
            r8 = 0
            char r1 = r10.charAt(r0)
            r0 = 48
            int r0 = X.C14360o3.A00(r1, r0)
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 1
            if (r0 >= 0) goto L66
            if (r9 == r7) goto L53
            r0 = 45
            if (r1 != r0) goto L61
            r15 = -9223372036854775808
            r8 = 1
        L2a:
            r13 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r5 = 0
            r11 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
        L36:
            if (r8 >= r9) goto L68
            char r0 = r10.charAt(r8)
            r3 = r18
            int r2 = java.lang.Character.digit(r0, r3)
            if (r2 < 0) goto L53
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 >= 0) goto L54
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 != 0) goto L53
            long r0 = (long) r3
            long r11 = r15 / r0
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 >= 0) goto L54
        L53:
            return r17
        L54:
            long r0 = (long) r3
            long r5 = r5 * r0
            long r3 = (long) r2
            long r1 = r15 + r3
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L53
            long r5 = r5 - r3
            int r8 = r8 + 1
            goto L36
        L61:
            r0 = 43
            if (r1 != r0) goto L53
            r8 = 1
        L66:
            r7 = 0
            goto L2a
        L68:
            if (r7 == 0) goto L6f
            java.lang.Long r17 = java.lang.Long.valueOf(r5)
            return r17
        L6f:
            long r0 = -r5
            java.lang.Long r17 = java.lang.Long.valueOf(r0)
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC003100w.A0k(int, java.lang.String):java.lang.Long");
    }

    public static final void A0l(String str) {
        throw new NumberFormatException(AnonymousClass001.A0S("Invalid number format: '", str, '\''));
    }
}
