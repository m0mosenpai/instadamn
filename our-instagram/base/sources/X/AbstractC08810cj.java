package X;

import go.Seq;
import java.text.BreakIterator;

/* renamed from: X.0cj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC08810cj {
    public static boolean A01(int i) {
        if (i < 48) {
            return false;
        }
        if (i <= 57) {
            return true;
        }
        if (i < 65) {
            return false;
        }
        if (i > 70) {
            return i >= 97 && i <= 102;
        }
        return true;
    }

    public static boolean A02(int i) {
        if (i == 33 || i == 36 || i == 59 || i == 61) {
            return true;
        }
        switch (i) {
            case 38:
            case 39:
            case 40:
            case Seq.NULL_REFNUM /* 41 */:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 43:
            case 44:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r2 > r0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A03(int r2) {
        /*
            r0 = 65
            if (r2 < r0) goto L26
            r0 = 90
            if (r2 <= r0) goto L10
            r0 = 97
            if (r2 < r0) goto L2d
            r0 = 122(0x7a, float:1.71E-43)
        Le:
            if (r2 > r0) goto L2d
        L10:
            r0 = 1
        L11:
            r1 = 1
            if (r0 != 0) goto L25
            r0 = 45
            if (r2 == r0) goto L25
            r0 = 46
            if (r2 == r0) goto L25
            r0 = 95
            if (r2 == r0) goto L25
            r0 = 126(0x7e, float:1.77E-43)
            if (r2 == r0) goto L25
            r1 = 0
        L25:
            return r1
        L26:
            r0 = 48
            if (r2 < r0) goto L2d
            r0 = 57
            goto Le
        L2d:
            r0 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC08810cj.A03(int):boolean");
    }

    public static void A00(String str, BreakIterator breakIterator) {
        int length = str.length();
        int current = breakIterator.current();
        if (current < length && current != -1) {
            int codePointAt = str.codePointAt(current);
            if (A01(codePointAt)) {
                int next = breakIterator.next();
                if (next < length && next != -1) {
                    int codePointAt2 = str.codePointAt(next);
                    if (A01(codePointAt2)) {
                        return;
                    } else {
                        throw new IllegalArgumentException(AnonymousClass001.A0g("Second hex string character ", new String(new int[]{codePointAt2}, 0, 1), " is not a valid hex digit"));
                    }
                }
                throw new IllegalArgumentException("Hex string must have 2 characters, found 1");
            }
            throw new IllegalArgumentException(AnonymousClass001.A0g("First hex string character ", new String(new int[]{codePointAt}, 0, 1), " is not a valid hex digit"));
        }
        throw new IllegalArgumentException("Hex string must have 2 characters, found 0");
    }
}
