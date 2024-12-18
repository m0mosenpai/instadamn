package X;

/* renamed from: X.7mU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC172607mU {
    public static final int A00(AbstractC50712Us abstractC50712Us, C17u c17u) {
        C14360o3.A0B(abstractC50712Us, 0);
        if (!c17u.isEmpty()) {
            int i = c17u.A01;
            int i2 = c17u.A00;
            if (i < Integer.MAX_VALUE) {
                return abstractC50712Us.A06(i2, i + 1);
            }
            if (i2 > Integer.MIN_VALUE) {
                return abstractC50712Us.A06(i2 - 1, i) + 1;
            }
            return abstractC50712Us.A03();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC43591JPw.A00(557));
        sb.append(c17u);
        throw new IllegalArgumentException(sb.toString());
    }

    public static final String A01(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Random range is empty: [");
        sb.append(obj);
        sb.append(", ");
        sb.append(obj2);
        sb.append(").");
        return sb.toString();
    }
}
