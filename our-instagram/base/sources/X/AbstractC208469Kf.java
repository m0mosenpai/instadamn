package X;

/* renamed from: X.9Kf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC208469Kf {
    public static final C8DO A00(String str) {
        int hashCode;
        if (str != null && (hashCode = str.hashCode()) != -1212837439) {
            if (hashCode != 3415681) {
                if (hashCode == 668488878 && str.equals("permanent")) {
                    return C8DO.A05;
                }
            } else if (str.equals("once")) {
                return C8DO.A06;
            }
        }
        return C8DO.A03;
    }
}
