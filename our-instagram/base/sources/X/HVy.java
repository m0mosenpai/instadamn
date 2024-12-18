package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.GuideTypeStr;

/* loaded from: classes7.dex */
public final class HVy extends C17T implements JMX {
    public JLE A00;

    @Override // X.JMX
    public final JLE BUE() {
        JLE jle = this.A00;
        if (jle == null) {
            return (JLE) A05(689572632, HW0.class);
        }
        return jle;
    }

    @Override // X.JMX
    public final GuideTypeStr CBT() {
        return (GuideTypeStr) A0M(3575610, JCP.A00);
    }

    @Override // X.JMX
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I08.A00(this));
    }

    @Override // X.JMX
    public final int BXg() {
        return getIntValueByHashCode(1567799751);
    }

    @Override // X.JMX
    public final JMX EBP(C1DY c1dy) {
        JLE BUE = BUE();
        if (BUE != null) {
            BUE.EBR(c1dy);
        } else {
            BUE = null;
        }
        this.A00 = BUE;
        return this;
    }

    @Override // X.JMX
    public final H7N F4f(C1DY c1dy) {
        H7P h7p;
        String A0T = A0T();
        String A0g = A0g();
        JLE BUE = BUE();
        if (BUE != null) {
            h7p = BUE.F4h(c1dy);
        } else {
            h7p = null;
        }
        int intValueByHashCode = getIntValueByHashCode(1567799751);
        return new H7N(CBT(), h7p, A0T, A0g, A0Y(), intValueByHashCode);
    }

    @Override // X.JMX
    public final H7N F4g(C1DV c1dv) {
        return F4f(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.JMX
    public final String getDescription() {
        return A0T();
    }

    @Override // X.JMX
    public final String getId() {
        return A0g();
    }

    @Override // X.JMX
    public final String getTitle() {
        return A0Y();
    }
}
