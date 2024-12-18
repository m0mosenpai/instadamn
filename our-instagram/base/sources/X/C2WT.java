package X;

/* renamed from: X.2WT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2WT {
    public final int A00;
    public final int A01;
    public final String A02;

    public C2WT(String str, int i, int i2) {
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2WT) {
                C2WT c2wt = (C2WT) obj;
                if (!C14360o3.A0K(this.A02, c2wt.A02) || this.A00 != c2wt.A00 || this.A01 != c2wt.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A02.hashCode() * 31) + this.A00) * 31) + this.A01;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SystemIdInfo(workSpecId=");
        sb.append(this.A02);
        sb.append(", generation=");
        sb.append(this.A00);
        sb.append(", systemId=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }
}
