package X;

import java.io.Serializable;

/* renamed from: X.0e6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09550e6 implements Serializable {
    public final Object A00;

    public static final Throwable A00(Object obj) {
        if (obj instanceof C09540e5) {
            return ((C09540e5) obj).A00;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        Object obj2 = this.A00;
        if (!(obj instanceof C09550e6) || !C14360o3.A0K(obj2, ((C09550e6) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.A00;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.A00;
        if (obj instanceof C09540e5) {
            return obj.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Success(");
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }
}
