package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductCollectionImpl;

/* loaded from: classes7.dex */
public final class HP1 extends C17T implements JMT {
    public ProductCollection A00;

    @Override // X.JMT
    public final ProductCollection Ap9() {
        return AbstractC37303Gc4.A0H(this, this.A00);
    }

    @Override // X.JMT
    public final JL0 AyK() {
        return (JL0) A05(1118015597, HR9.class);
    }

    @Override // X.JMT
    public final JMT E94(C1DY c1dy) {
        ProductCollection A0H = AbstractC37303Gc4.A0H(this, this.A00);
        if (A0H != null) {
            A0H.ECD(c1dy);
        } else {
            A0H = null;
        }
        this.A00 = A0H;
        return this;
    }

    @Override // X.JMT
    public final H3L Etc(C1DY c1dy) {
        ProductCollectionImpl productCollectionImpl;
        ProductCollection A0H = AbstractC37303Gc4.A0H(this, this.A00);
        H4G h4g = null;
        if (A0H != null) {
            productCollectionImpl = A0H.F7Q(c1dy);
        } else {
            productCollectionImpl = null;
        }
        String A0i = A0i(1060506683);
        JL0 AyK = AyK();
        if (AyK != null) {
            h4g = AyK.Ewi();
        }
        return new H3L(h4g, productCollectionImpl, getOptionalBooleanValueByHashCode(1518770791), A0i, A0i(1987220567), A0i(856135849));
    }

    @Override // X.JMT
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39923HnE.A00(this));
    }

    @Override // X.JMT
    public final String ApG() {
        return A0i(1060506683);
    }

    @Override // X.JMT
    public final String BE2() {
        return A0i(1987220567);
    }

    @Override // X.JMT
    public final String BE3() {
        return A0i(856135849);
    }

    @Override // X.JMT
    public final Boolean CQH() {
        return getOptionalBooleanValueByHashCode(1518770791);
    }

    @Override // X.JMT
    public final H3L Etd(C1DV c1dv) {
        return Etc(AbstractC25235BEs.A0b(c1dv));
    }
}
