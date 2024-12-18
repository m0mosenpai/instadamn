package X;

/* renamed from: X.Pul, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58407Pul {
    public static final AbstractC61596RqK A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.RqK] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    static {
        ?? r0;
        if (C58400Pue.A04 && C58400Pue.A05 && (AbstractC58393PuX.A00 == null || AbstractC58393PuX.A01)) {
            r0 = new Object();
        } else {
            r0 = new Object();
        }
        A00 = r0;
    }

    public static int A00(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                int length2 = charSequence.length();
                int i3 = 0;
                while (i < length2) {
                    char charAt2 = charSequence.charAt(i);
                    if (charAt2 < 2048) {
                        i3 += (127 - charAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i) >= 65536) {
                                i++;
                            } else {
                                throw new RkK(i, length2);
                            }
                        }
                    }
                    i++;
                }
                i2 += i3;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        throw AbstractC58319PtB.A0h("UTF-8 length does not fit in int: ", i2 + 4294967296L);
    }
}
