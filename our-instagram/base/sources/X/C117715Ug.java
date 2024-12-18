package X;

/* renamed from: X.5Ug, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C117715Ug implements C5US {
    public final Object A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C117715Ug) && C14360o3.A0K(this.A00, ((C117715Ug) obj).A00));
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
        sb.append("StaticValueHolder(value=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C117715Ug(Object obj) {
        this.A00 = obj;
    }

    @Override // X.C5US
    public final Object E8W(C59P c59p) {
        return this.A00;
    }
}
