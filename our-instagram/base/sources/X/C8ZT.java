package X;

/* renamed from: X.8ZT, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8ZT extends AbstractC193598he {
    public final Object A00;

    public C8ZT(Object obj) {
        super(3, obj);
        this.A00 = obj;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C8ZT) && C14360o3.A0K(this.A00, ((C8ZT) obj).A00));
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
        sb.append(AbstractC43591JPw.A00(121));
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
