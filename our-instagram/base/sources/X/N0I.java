package X;

/* loaded from: classes9.dex */
public final class N0I extends AbstractC53632Nnd {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof N0I) && this.A00 == ((N0I) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public static N0I A00(int i) {
        return new N0I(i);
    }

    public N0I(int i) {
        this.A00 = i;
    }
}
