package X;

/* renamed from: X.Kqh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47024Kqh {
    public static final String A00(String str) {
        C14360o3.A0B(str, 0);
        int length = str.length();
        if (length > 28) {
            str = AbstractC25227BEk.A0w(str, 0, length - 28);
        }
        char[] charArray = str.toCharArray();
        C14360o3.A07(charArray);
        long j = 0;
        for (char c : charArray) {
            j = (j * 64) + AbstractC001900j.A04("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", c, 0);
        }
        return String.valueOf(j);
    }
}
