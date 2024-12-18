package X;

import com.instagram.model.direct.DirectShareTarget;

/* loaded from: classes6.dex */
public final class E6V extends C0T6 {
    public int A00;
    public Integer A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final DirectShareTarget A07;

    public E6V(DirectShareTarget directShareTarget, Integer num, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC167007dF.A1I(directShareTarget, 1, num);
        this.A07 = directShareTarget;
        this.A04 = z;
        this.A03 = false;
        this.A02 = z2;
        this.A05 = z3;
        this.A06 = z4;
        this.A00 = i;
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E6V)) {
            return false;
        }
        return C14360o3.A0K(this.A07, ((E6V) obj).A07);
    }

    public final int hashCode() {
        return this.A07.hashCode();
    }
}
