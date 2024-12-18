package X;

/* renamed from: X.Rsd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61722Rsd {
    public static final String A00(String str) {
        String A0r = AbstractC58322PtE.A0r(str);
        if (A0r.length() == 15 && !SSH.A01(A0r)) {
            int i = 48;
            do {
                String A0C = AnonymousClass001.A0C(A0r, (char) i);
                if (SSH.A01(A0C)) {
                    return A0C;
                }
                i++;
            } while (i <= 57);
        }
        return str;
    }
}
