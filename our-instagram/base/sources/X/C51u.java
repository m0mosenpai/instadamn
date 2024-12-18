package X;

import java.io.Serializable;

/* renamed from: X.51u, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C51u implements Serializable {
    public final Object A00;
    public final Object A01;
    public final Object A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51u) {
                C51u c51u = (C51u) obj;
                if (!C14360o3.A0K(this.A00, c51u.A00) || !C14360o3.A0K(this.A01, c51u.A01) || !C14360o3.A0K(this.A02, c51u.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.A00;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.A01;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.A02;
        return hashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final Object A00() {
        return this.A00;
    }

    public final Object A01() {
        return this.A01;
    }

    public final Object A02() {
        return this.A02;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.A00);
        sb.append(", ");
        sb.append(this.A01);
        sb.append(", ");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C51u(Object obj, Object obj2, Object obj3) {
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }
}
