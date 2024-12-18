package X;

/* renamed from: X.8Sh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187398Sh extends AbstractC193598he {
    public final Object A00;

    public C187398Sh(Object obj) {
        super(2, obj);
        this.A00 = obj;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C187398Sh) && C14360o3.A0K(this.A00, ((C187398Sh) obj).A00));
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
        sb.append("LoadingWithData(data=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
