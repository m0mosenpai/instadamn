package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H7O extends C0T6 implements JLD {
    public final H3V A00;
    public final C38321qM A01;

    @Override // X.JLD
    public final H7O F4i(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H7O) {
                H7O h7o = (H7O) obj;
                if (!C14360o3.A0K(this.A01, h7o.A01) || !C14360o3.A0K(this.A00, h7o.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JLD
    public final C38321qM BG1() {
        return this.A01;
    }

    @Override // X.JLD
    public final /* bridge */ /* synthetic */ JM4 Bh5() {
        return this.A00;
    }

    @Override // X.JLD
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTGuideMediaContent", I0A.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public H7O(H3V h3v, C38321qM c38321qM) {
        this.A01 = c38321qM;
        this.A00 = h3v;
    }

    @Override // X.JLD
    public final JLD EBQ(C1DY c1dy) {
        return this;
    }
}
