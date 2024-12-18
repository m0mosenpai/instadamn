package X;

import java.util.List;

/* loaded from: classes7.dex */
public final class H2Y extends C0T6 implements JIT {
    public final Integer A00;
    public final List A01;
    public final boolean A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H2Y) {
                H2Y h2y = (H2Y) obj;
                if (!C14360o3.A0K(this.A01, h2y.A01) || this.A02 != h2y.A02 || this.A03 != h2y.A03 || !C14360o3.A0K(this.A00, h2y.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC167007dF.A0D(this.A02, AbstractC167017dG.A0M(this.A01) * 31) + this.A03) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public H2Y(Integer num, List list, int i, boolean z) {
        this.A01 = list;
        this.A02 = z;
        this.A03 = i;
        this.A00 = num;
    }
}
