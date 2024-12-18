package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H3K extends C0T6 implements JKH {
    public final Float A00;
    public final Float A01;

    @Override // X.JKH
    public final H3K EtU() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3K) {
                H3K h3k = (H3K) obj;
                if (!C14360o3.A0K(this.A00, h3k.A00) || !C14360o3.A0K(this.A01, h3k.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JKH
    public final Float Bal() {
        return this.A00;
    }

    @Override // X.JKH
    public final Float Bam() {
        return this.A01;
    }

    @Override // X.JKH
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTFeedCTAHighlightTimeInfoDict", AbstractC39919Hn9.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public H3K(Float f, Float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}
