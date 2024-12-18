package X;

/* renamed from: X.VwG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69830VwG {
    public static final Integer A00(String str) {
        String A0h = AbstractC167007dF.A0h(str);
        int hashCode = A0h.hashCode();
        if (hashCode != -1217487446) {
            if (hashCode != -907680051) {
                if (hashCode == 466743410 && A0h.equals("visible")) {
                    return C05F.A00;
                }
                return null;
            }
            if (A0h.equals("scroll")) {
                return C05F.A0C;
            }
            return null;
        }
        if (A0h.equals("hidden")) {
            return C05F.A01;
        }
        return null;
    }
}
