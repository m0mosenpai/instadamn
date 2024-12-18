package X;

/* loaded from: classes11.dex */
public final class V4W extends VIV {
    public final Q08 A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof V4W) && C14360o3.A0K(this.A00, ((V4W) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Response(response=");
        return AbstractC167017dG.A0o(this.A00, sb);
    }

    public V4W(Q08 q08) {
        this.A00 = q08;
    }
}
