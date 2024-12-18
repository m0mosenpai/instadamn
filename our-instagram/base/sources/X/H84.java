package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H84 extends C0T6 implements JLJ {
    public final Float A00;
    public final Integer A01;
    public final Integer A02;

    @Override // X.JLJ
    public final H84 F7E() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H84) {
                H84 h84 = (H84) obj;
                if (!C14360o3.A0K(this.A01, h84.A01) || !C14360o3.A0K(this.A02, h84.A02) || !C14360o3.A0K(this.A00, h84.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JLJ
    public final Integer BYx() {
        return this.A01;
    }

    @Override // X.JLJ
    public final Integer Bak() {
        return this.A02;
    }

    @Override // X.JLJ
    public final Float CEJ() {
        return this.A00;
    }

    @Override // X.JLJ
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTPredicateClientDict", I9S.A00(this));
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public H84(Float f, Integer num, Integer num2) {
        this.A01 = num;
        this.A02 = num2;
        this.A00 = f;
    }
}
