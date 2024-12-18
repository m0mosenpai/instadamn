package X;

/* renamed from: X.Mr0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51608Mr0 extends C0T6 {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C51608Mr0(int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A00 = i2;
        this.A04 = z;
        this.A02 = z2;
        this.A01 = i;
        this.A03 = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C51608Mr0) {
                    C51608Mr0 c51608Mr0 = (C51608Mr0) obj;
                    if (c51608Mr0.A00 == 1 && this.A04 == c51608Mr0.A04 && this.A03 == c51608Mr0.A03 && this.A02 == c51608Mr0.A02) {
                        int i = this.A01;
                        z2 = c51608Mr0.A01;
                        z = i;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!(obj instanceof C51608Mr0)) {
                return false;
            }
            C51608Mr0 c51608Mr02 = (C51608Mr0) obj;
            if (c51608Mr02.A00 != 0 || this.A04 != c51608Mr02.A04 || this.A02 != c51608Mr02.A02 || this.A01 != c51608Mr02.A01) {
                return false;
            }
            boolean z3 = this.A03;
            z2 = c51608Mr02.A03;
            z = z3;
        } else {
            return true;
        }
        if (z != z2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0D;
        int i;
        int i2 = this.A00;
        int A08 = AbstractC25225BEi.A08(this.A04);
        if (i2 != 0) {
            A0D = AbstractC167007dF.A0D(this.A02, AbstractC167007dF.A0D(this.A03, A08));
            i = this.A01;
        } else {
            A0D = (AbstractC167007dF.A0D(this.A02, A08) + this.A01) * 31;
            i = 1237;
            if (this.A03) {
                i = 1231;
            }
        }
        return A0D + i;
    }
}
