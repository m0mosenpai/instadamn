package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.GuideMediaType;

/* loaded from: classes7.dex */
public final class H7P extends C0T6 implements JLE {
    public final GuideMediaType A00;
    public final H7O A01;

    @Override // X.JLE
    public final H7P F4h(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H7P) {
                H7P h7p = (H7P) obj;
                if (!C14360o3.A0K(this.A01, h7p.A01) || this.A00 != h7p.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JLE
    public final /* bridge */ /* synthetic */ JLD Aqp() {
        return this.A01;
    }

    @Override // X.JLE
    public final GuideMediaType CBS() {
        return this.A00;
    }

    @Override // X.JLE
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTGuideMedia", I0D.A00(this));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public H7P(GuideMediaType guideMediaType, H7O h7o) {
        AbstractC167017dG.A1P(h7o, guideMediaType);
        this.A01 = h7o;
        this.A00 = guideMediaType;
    }

    @Override // X.JLE
    public final JLE EBR(C1DY c1dy) {
        return this;
    }
}
