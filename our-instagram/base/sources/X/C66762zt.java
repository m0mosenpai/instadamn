package X;

/* renamed from: X.2zt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66762zt extends AbstractC65572xt {
    public final java.util.Set A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C66762zt) && C14360o3.A0K(this.A00, ((C66762zt) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomFeeds(feeds=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C66762zt(java.util.Set set) {
        this.A00 = set;
    }
}
