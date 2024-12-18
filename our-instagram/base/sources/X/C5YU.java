package X;

/* renamed from: X.5YU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5YU extends C5YV {
    public final int A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5YU) {
                long j = this.A01;
                C5YU c5yu = (C5YU) obj;
                long j2 = c5yu.A01;
                long j3 = C1132359l.A01;
                if (j != j2 || this.A00 != c5yu.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A01;
        long j2 = C1132359l.A01;
        return (((int) (j ^ (j >>> 32))) * 31) + this.A00;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("BlendModeColorFilter(color=");
        sb.append((Object) C1132359l.A06(this.A01));
        sb.append(", blendMode=");
        int i = this.A00;
        if (i == 5) {
            str = "SrcIn";
        } else if (i == 6) {
            str = "DstIn";
        } else if (i == 7) {
            str = "SrcOut";
        } else if (i == 8) {
            str = "DstOut";
        } else if (i == 9) {
            str = "SrcAtop";
        } else if (i == 10) {
            str = "DstAtop";
        } else if (i == 11) {
            str = "Xor";
        } else if (i == 12) {
            str = "Plus";
        } else if (i == 13) {
            str = "Modulate";
        } else if (i == 14) {
            str = "Screen";
        } else if (i == 15) {
            str = "Overlay";
        } else if (i == 16) {
            str = "Darken";
        } else if (i == 17) {
            str = "Lighten";
        } else if (i == 18) {
            str = "ColorDodge";
        } else if (i == 19) {
            str = "ColorBurn";
        } else if (i == 20) {
            str = "HardLight";
        } else if (i == 21) {
            str = "Softlight";
        } else if (i == 22) {
            str = "Difference";
        } else if (i == 23) {
            str = "Exclusion";
        } else {
            str = "Multiply";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    public C5YU(long j, int i) {
        super(C5YW.A00(i, j));
        this.A01 = j;
        this.A00 = i;
    }
}
