package X;

/* renamed from: X.6Vp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140116Vp {
    public final int A00;
    public final int A01;
    public final C102884kP A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C140116Vp) {
                C140116Vp c140116Vp = (C140116Vp) obj;
                if (this.A01 != c140116Vp.A01 || this.A00 != c140116Vp.A00 || !C14360o3.A0K(this.A02, c140116Vp.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) + this.A02.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LayoutSignalArgs(widthSpec=");
        sb.append(this.A01);
        sb.append(", heightSpec=");
        sb.append(this.A00);
        sb.append(", model=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C140116Vp(C102884kP c102884kP, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = c102884kP;
    }
}
