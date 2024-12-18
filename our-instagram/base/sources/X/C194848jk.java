package X;

/* renamed from: X.8jk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194848jk extends C3NY {
    public final Object A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C194848jk) && C14360o3.A0K(this.A00, ((C194848jk) obj).A00));
    }

    public final int hashCode() {
        Object obj = this.A00;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Failure(error=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C194848jk(Object obj) {
        this.A00 = obj;
    }
}
