package X;

/* loaded from: classes9.dex */
public final class OLP {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof OLP) && C14360o3.A0K(this.A00, ((OLP) obj).A00));
    }

    public final String toString() {
        return AnonymousClass001.A0l("ZeroBalanceDetectionHttpParams(url=", this.A00, ", timeoutSeconds=", ')', 5);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A00) + 5;
    }

    public OLP(String str) {
        this.A00 = str;
    }
}
