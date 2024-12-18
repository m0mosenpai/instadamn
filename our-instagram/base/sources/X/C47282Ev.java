package X;

/* renamed from: X.2Ev, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47282Ev {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47282Ev) {
                C47282Ev c47282Ev = (C47282Ev) obj;
                if (this.A00 != c47282Ev.A00 || !C14360o3.A0K(this.A01, c47282Ev.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MarkerIdentifier(id=");
        sb.append(this.A00);
        sb.append(", name=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C47282Ev(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
