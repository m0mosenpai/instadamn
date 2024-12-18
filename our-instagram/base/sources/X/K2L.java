package X;

/* loaded from: classes8.dex */
public final class K2L extends C0T6 implements MSK {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof K2L) && C14360o3.A0K(this.A00, ((K2L) obj).A00));
    }

    @Override // X.MSK
    public final String AYy() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0O(this.A00);
    }

    public K2L(String str) {
        this.A00 = str;
    }

    public K2L() {
        this(null);
    }
}
