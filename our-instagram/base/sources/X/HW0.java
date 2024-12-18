package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.GuideMediaType;

/* loaded from: classes7.dex */
public final class HW0 extends C17T implements JLE {
    public JLD A00;

    @Override // X.JLE
    public final JLD Aqp() {
        JLD jld = this.A00;
        if (jld == null) {
            return (JLD) A04(951530617, C39295HVz.class);
        }
        return jld;
    }

    @Override // X.JLE
    public final GuideMediaType CBS() {
        return (GuideMediaType) A0M(3575610, JCQ.A00);
    }

    @Override // X.JLE
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I0D.A00(this));
    }

    @Override // X.JLE
    public final JLE EBR(C1DY c1dy) {
        JLD Aqp = Aqp();
        Aqp.EBQ(c1dy);
        this.A00 = Aqp;
        return this;
    }

    @Override // X.JLE
    public final H7P F4h(C1DY c1dy) {
        return new H7P(CBS(), Aqp().F4i(c1dy));
    }
}
