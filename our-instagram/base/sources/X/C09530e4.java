package X;

import java.io.Serializable;

/* renamed from: X.0e4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09530e4 implements Serializable {
    public final Object A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C09530e4) {
                C09530e4 c09530e4 = (C09530e4) obj;
                if (!C14360o3.A0K(this.A00, c09530e4.A00) || !C14360o3.A0K(this.A01, c09530e4.A01)) {
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
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.A00);
        sb.append(", ");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C09530e4(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }
}
