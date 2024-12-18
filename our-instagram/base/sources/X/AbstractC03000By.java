package X;

/* renamed from: X.0By, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC03000By {
    public static boolean A01(C005001p c005001p, C005001p c005001p2) {
        boolean equals;
        if (c005001p != c005001p2) {
            int size = c005001p.size();
            if (size == c005001p2.size()) {
                for (int i = 0; i < size; i++) {
                    Object A05 = c005001p.A05(i);
                    Object A06 = c005001p.A06(i);
                    Object obj = c005001p2.get(A05);
                    if (A06 == null) {
                        if (obj == null) {
                            equals = c005001p2.containsKey(A05);
                        }
                    } else {
                        equals = A06.equals(obj);
                    }
                    if (equals) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(Object obj) {
        if (obj != null) {
        } else {
            throw new IllegalArgumentException("Null value passed to getSnapshot!");
        }
    }
}
