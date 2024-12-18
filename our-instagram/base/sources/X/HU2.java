package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class HU2 extends C17T implements JKW {
    @Override // X.JKW
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

    @Override // X.JKW
    public final C38781H5v F1T() {
        return new C38781H5v(A0e(), A0X());
    }

    @Override // X.JKW
    public final String getId() {
        return A0e();
    }

    @Override // X.JKW
    public final String getText() {
        return A0X();
    }
}
