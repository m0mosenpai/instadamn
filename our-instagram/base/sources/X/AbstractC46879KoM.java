package X;

/* renamed from: X.KoM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46879KoM {
    public static final Integer A00(String str) {
        int i;
        int hashCode = str.hashCode();
        if (hashCode != -1212837439) {
            if (hashCode != 3415681) {
                if (hashCode == 668488878 && str.equals("permanent")) {
                    i = 2;
                } else {
                    return null;
                }
            } else if (str.equals("once")) {
                i = 0;
            } else {
                return null;
            }
        } else if (str.equals("replayable")) {
            i = 1;
        } else {
            return null;
        }
        return Integer.valueOf(i);
    }
}
