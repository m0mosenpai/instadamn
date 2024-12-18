package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class HOl extends C17T implements JKG {
    @Override // X.JKG
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (getId() != null) {
            AbstractC37300Gc1.A12(getId(), A1I);
        }
        if (getText() != null) {
            AbstractC37300Gc1.A15(getText(), A1I);
        }
        return AbstractC25234BEr.A0P(this, AbstractC06930Yk.A0B(A1I));
    }

    @Override // X.JKG
    public final H3A EtD() {
        return new H3A(A0g(), A0P());
    }

    @Override // X.JKG
    public final String getId() {
        return A0g();
    }

    @Override // X.JKG
    public final String getText() {
        return A0P();
    }
}
