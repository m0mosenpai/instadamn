package X;

/* renamed from: X.Vum, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69752Vum {
    public final int A00;
    public final int A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69752Vum) {
                C69752Vum c69752Vum = (C69752Vum) obj;
                if (this.A01 != c69752Vum.A01 || this.A00 != c69752Vum.A00 || this.A02 != c69752Vum.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((this.A01 * 31) + this.A00) * 31;
        int i2 = 1237;
        if (this.A02) {
            i2 = 1231;
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BidiRun(start=");
        sb.append(this.A01);
        sb.append(", end=");
        sb.append(this.A00);
        sb.append(", isRtl=");
        return AbstractC25236BEt.A0a(sb, this.A02);
    }

    public C69752Vum(int i, int i2, boolean z) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = z;
    }
}
