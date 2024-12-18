package X;

/* renamed from: X.3ab, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75703ab {
    public final C2XK A00;
    public final C2V3 A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C75703ab) {
                C75703ab c75703ab = (C75703ab) obj;
                if (!C14360o3.A0K(this.A01, c75703ab.A01) || this.A02 != c75703ab.A02 || !C14360o3.A0K(this.A00, c75703ab.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LithoConfiguration(componentsConfig=");
        sb.append(this.A01);
        sb.append(", areTransitionsEnabled=");
        sb.append(this.A02);
        sb.append(", renderUnitIdGenerator=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A01.hashCode() * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        C2XK c2xk = this.A00;
        if (c2xk == null) {
            hashCode = 0;
        } else {
            hashCode = c2xk.hashCode();
        }
        return i2 + hashCode;
    }

    public C75703ab(C2XK c2xk, C2V3 c2v3, boolean z) {
        this.A01 = c2v3;
        this.A02 = z;
        this.A00 = c2xk;
    }
}
