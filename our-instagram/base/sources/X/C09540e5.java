package X;

import java.io.Serializable;

/* renamed from: X.0e5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09540e5 implements Serializable {
    public final Throwable A00;

    public final boolean equals(Object obj) {
        if ((obj instanceof C09540e5) && C14360o3.A0K(this.A00, ((C09540e5) obj).A00)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Failure(");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C09540e5(Throwable th) {
        this.A00 = th;
    }
}
