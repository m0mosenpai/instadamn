package X;

import java.math.BigInteger;
import java.util.Comparator;

/* renamed from: X.4Gt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93404Gt extends C2E0 {

    @Deprecated
    public static final Comparator A01 = AbstractC93414Gu.A00;
    public static final C93404Gt A00 = new C93404Gt();

    public C93404Gt() {
        super("MINCURSOR", "MAXCURSOR", A01);
    }

    public static String A00(String str, boolean z) {
        if (str != null && z && !"MAXCURSOR".equals(str) && !"MINCURSOR".equals(str)) {
            return new BigInteger(str).add(BigInteger.ONE).toString();
        }
        return (String) A00.A00;
    }

    public static String A01(String str, boolean z, boolean z2) {
        Object obj;
        if (str != null) {
            if (z && !"MAXCURSOR".equals(str) && !"MINCURSOR".equals(str)) {
                return new BigInteger(str).subtract(BigInteger.ONE).toString();
            }
        } else if (!z2) {
            obj = A00.A00;
            return (String) obj;
        }
        obj = A00.A01;
        return (String) obj;
    }
}
