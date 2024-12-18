package X;

/* renamed from: X.3NX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3NX extends C3NY {
    public final Object A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C3NX) && C14360o3.A0K(this.A00, ((C3NX) obj).A00));
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
        sb.append(AbstractC111324zv.A00(1804));
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C3NX(Object obj) {
        this.A00 = obj;
    }
}
