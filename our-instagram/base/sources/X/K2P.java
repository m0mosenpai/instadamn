package X;

/* loaded from: classes8.dex */
public final class K2P extends C0T6 implements MNH {
    public final String A00;

    public K2P(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof K2P) && C14360o3.A0K(this.A00, ((K2P) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
