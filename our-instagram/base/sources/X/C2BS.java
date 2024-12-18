package X;

/* renamed from: X.2BS, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2BS {
    public static final int A00(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final C72106XOb A01() {
        C72106XOb c72106XOb = C72106XOb.A00;
        C14360o3.A0C(c72106XOb, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
        return c72106XOb;
    }
}
