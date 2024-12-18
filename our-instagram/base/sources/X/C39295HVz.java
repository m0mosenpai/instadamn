package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.HVz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39295HVz extends C17T implements JLD {
    public JM4 A00;
    public C38321qM A01;

    @Override // X.JLD
    public final C38321qM BG1() {
        return this.A01;
    }

    @Override // X.JLD
    public final JM4 Bh5() {
        JM4 jm4 = this.A00;
        if (jm4 == null) {
            return (JM4) A05(1400556101, HPK.class);
        }
        return jm4;
    }

    @Override // X.JLD
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I0A.A00(this));
    }

    @Override // X.JLD
    public final JLD EBQ(C1DY c1dy) {
        this.A01 = AbstractC37304Gc5.A0D(c1dy, this, 1660139965);
        JM4 Bh5 = Bh5();
        if (Bh5 != null) {
            Bh5.E98(c1dy);
        } else {
            Bh5 = null;
        }
        this.A00 = Bh5;
        return this;
    }

    @Override // X.JLD
    public final H7O F4i(C1DY c1dy) {
        C38321qM c38321qM;
        C38321qM A0D = AbstractC37304Gc5.A0D(c1dy, this, 1660139965);
        H3V h3v = null;
        if (A0D != null) {
            c38321qM = (C38321qM) c1dy.A00(A0D);
        } else {
            c38321qM = null;
        }
        JM4 Bh5 = Bh5();
        if (Bh5 != null) {
            h3v = Bh5.Eu4(c1dy);
        }
        return new H7O(h3v, c38321qM);
    }
}
