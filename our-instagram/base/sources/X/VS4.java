package X;

/* loaded from: classes11.dex */
public abstract class VS4 {
    public static final String A00(String str) {
        int length = str.length() - 1;
        int A07 = AbstractC001900j.A07(str, ".jpg", length);
        if (A07 == -1) {
            A07 = AbstractC001900j.A07(str, ".png", length);
        }
        if (A07 == -1) {
            A07 = 30;
        }
        int i = A07 - 30;
        int i2 = new int[]{0, i}[0] ^ Integer.MIN_VALUE;
        int i3 = i ^ Integer.MIN_VALUE;
        if (i3 > i2) {
            i2 = i3;
        }
        return AbstractC25227BEk.A0w(str, i2 ^ Integer.MIN_VALUE, A07);
    }
}
