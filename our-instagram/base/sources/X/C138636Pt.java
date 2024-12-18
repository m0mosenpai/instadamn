package X;

/* renamed from: X.6Pt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138636Pt extends C0T6 {
    public final long A00;
    public final C9C3 A01;
    public final short A02;
    public final short A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C138636Pt) {
                C138636Pt c138636Pt = (C138636Pt) obj;
                if (this.A02 != c138636Pt.A02 || this.A00 != c138636Pt.A00 || !C14360o3.A0K(this.A01, c138636Pt.A01) || this.A03 != c138636Pt.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NavigationOutcome(actionId=");
        sb.append((int) this.A02);
        sb.append(", finishTime=");
        sb.append(this.A00);
        sb.append(", interrupt=");
        sb.append(this.A01);
        sb.append(", granularActionId=");
        sb.append((int) this.A03);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int i = this.A02 * 31;
        long j = this.A00;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        C9C3 c9c3 = this.A01;
        if (c9c3 == null) {
            hashCode = 0;
        } else {
            hashCode = c9c3.hashCode();
        }
        return ((i2 + hashCode) * 31) + this.A03;
    }

    public C138636Pt(C9C3 c9c3, long j, short s, short s2) {
        this.A02 = s;
        this.A00 = j;
        this.A01 = c9c3;
        this.A03 = s2;
    }
}
