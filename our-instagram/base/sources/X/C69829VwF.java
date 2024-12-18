package X;

/* renamed from: X.VwF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69829VwF {
    public static final Integer A00(String str) {
        String A0h = AbstractC167007dF.A0h(str);
        int hashCode = A0h.hashCode();
        if (hashCode != -1338941519) {
            if (hashCode != -1325970902) {
                if (hashCode == 109618859 && A0h.equals("solid")) {
                    return C05F.A00;
                }
                return null;
            }
            if (A0h.equals("dotted")) {
                return C05F.A0C;
            }
            return null;
        }
        if (A0h.equals("dashed")) {
            return C05F.A01;
        }
        return null;
    }
}
