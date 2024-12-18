package X;

import java.util.Locale;

/* renamed from: X.W0w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70062W0w {
    public static final byte[] A00 = {0, 0, 0, 1};
    public static final String[] A01 = {"", "A", "B", "C"};

    public static String A00(int[] iArr, int i, int i2, int i3, int i4, boolean z) {
        String str = A01[i];
        Integer valueOf = Integer.valueOf(i2);
        Integer valueOf2 = Integer.valueOf(i3);
        char c = 'L';
        if (z) {
            c = 'H';
        }
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", str, valueOf, valueOf2, Character.valueOf(c), Integer.valueOf(i4)));
        int i5 = 6;
        while (true) {
            if (iArr[i5 - 1] == 0) {
                i5--;
                if (i5 <= 0) {
                    break;
                }
            } else {
                int i6 = 0;
                do {
                    sb.append(String.format(".%02X", AbstractC25228BEl.A1Y(iArr[i6])));
                    i6++;
                } while (i6 < i5);
            }
        }
        return sb.toString();
    }
}
