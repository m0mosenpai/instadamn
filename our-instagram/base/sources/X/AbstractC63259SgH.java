package X;

import java.util.TimeZone;

/* renamed from: X.SgH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63259SgH {
    public static final TimeZone A00 = TimeZone.getTimeZone("UTC");

    public static int A00(String str, int i, int i2) {
        int i3;
        int i4;
        if (i >= 0 && i2 <= str.length() && i <= i2) {
            if (i < i2) {
                i3 = i + 1;
                int digit = Character.digit(str.charAt(i), 10);
                if (digit >= 0) {
                    i4 = -digit;
                } else {
                    throw new NumberFormatException(AnonymousClass001.A0R("Invalid number: ", str.substring(i, i2)));
                }
            } else {
                i3 = i;
                i4 = 0;
            }
            while (i3 < i2) {
                int i5 = i3 + 1;
                int digit2 = Character.digit(str.charAt(i3), 10);
                if (digit2 >= 0) {
                    i4 = (i4 * 10) - digit2;
                    i3 = i5;
                } else {
                    throw new NumberFormatException(AnonymousClass001.A0R("Invalid number: ", str.substring(i, i2)));
                }
            }
            return -i4;
        }
        throw new NumberFormatException(str);
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x018b: IF  (r3 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) != (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:94:0x01bb (LINE:395), block:B:85:0x018b */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7 A[Catch: IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x018a, TryCatch #0 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x018a, blocks: (B:2:0x0000, B:4:0x0014, B:5:0x0016, B:7:0x0022, B:8:0x0024, B:10:0x0034, B:12:0x003a, B:17:0x0056, B:19:0x0066, B:20:0x0068, B:22:0x0074, B:23:0x0076, B:25:0x007c, B:29:0x0086, B:34:0x0096, B:36:0x009e, B:38:0x00a4, B:42:0x00b0, B:44:0x00b4, B:47:0x00c3, B:48:0x00d1, B:50:0x00d7, B:52:0x00de, B:53:0x00e2, B:58:0x017d, B:59:0x0189, B:60:0x011a, B:62:0x0124, B:63:0x012a, B:65:0x0137, B:67:0x013f, B:69:0x0153, B:71:0x0161, B:73:0x0172, B:74:0x0176, B:76:0x00c6), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0176 A[Catch: IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x018a, TryCatch #0 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x018a, blocks: (B:2:0x0000, B:4:0x0014, B:5:0x0016, B:7:0x0022, B:8:0x0024, B:10:0x0034, B:12:0x003a, B:17:0x0056, B:19:0x0066, B:20:0x0068, B:22:0x0074, B:23:0x0076, B:25:0x007c, B:29:0x0086, B:34:0x0096, B:36:0x009e, B:38:0x00a4, B:42:0x00b0, B:44:0x00b4, B:47:0x00c3, B:48:0x00d1, B:50:0x00d7, B:52:0x00de, B:53:0x00e2, B:58:0x017d, B:59:0x0189, B:60:0x011a, B:62:0x0124, B:63:0x012a, B:65:0x0137, B:67:0x013f, B:69:0x0153, B:71:0x0161, B:73:0x0172, B:74:0x0176, B:76:0x00c6), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date A01(java.lang.String r16, java.text.ParsePosition r17) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63259SgH.A01(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static boolean A02(String str, char c, int i) {
        if (i < str.length() && str.charAt(i) == c) {
            return true;
        }
        return false;
    }
}
