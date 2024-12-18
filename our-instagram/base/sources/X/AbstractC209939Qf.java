package X;

/* renamed from: X.9Qf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC209939Qf {
    public static boolean A00(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == 'x' || charAt < '\t' || (charAt > '\r' && (charAt < ' ' || charAt > '~'))) {
                return true;
            }
        }
        return false;
    }
}
