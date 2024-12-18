package X;

/* renamed from: X.3AY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3AY {
    public final Object A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3AY)) {
            return false;
        }
        C3AY c3ay = (C3AY) obj;
        if (!C02O.A00(c3ay.A00, this.A00) || !C02O.A00(c3ay.A01, this.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.A00;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.A01;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pair{");
        sb.append(this.A00);
        sb.append(" ");
        sb.append(this.A01);
        sb.append("}");
        return sb.toString();
    }

    public C3AY(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }
}
