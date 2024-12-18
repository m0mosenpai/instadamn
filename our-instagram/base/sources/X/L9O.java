package X;

/* loaded from: classes8.dex */
public final class L9O {
    public final String A00;

    public L9O(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof L9O) && C14360o3.A0K(this.A00, ((L9O) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AbstractC25235BEs.A0r("OffsiteDataKey(securityOrigin=", this.A00);
    }
}
