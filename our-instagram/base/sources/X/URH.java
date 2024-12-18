package X;

import java.util.List;

/* loaded from: classes11.dex */
public final class URH extends C0T6 implements XFQ {
    public final int A00;
    public final int A01;
    public final List A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof URH) {
                URH urh = (URH) obj;
                if (this.A03 != urh.A03 || !C14360o3.A0K(this.A02, urh.A02) || this.A00 != urh.A00 || this.A01 != urh.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A03 * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + this.A00) * 31) + this.A01;
    }

    public URH(List list, int i, int i2, int i3) {
        this.A03 = i;
        this.A02 = list;
        this.A00 = i2;
        this.A01 = i3;
    }
}
