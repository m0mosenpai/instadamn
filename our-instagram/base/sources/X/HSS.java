package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class HSS extends C17T implements JKS {
    @Override // X.JKS
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (getTitle() != null) {
            AbstractC37300Gc1.A17(getTitle(), A1I);
        }
        if (getUrl() != null) {
            AbstractC37300Gc1.A13(getUrl(), A1I);
        }
        return AbstractC25234BEr.A0P(this, AbstractC06930Yk.A0B(A1I));
    }

    @Override // X.JKS
    public final C38752H4s Eyr() {
        return new C38752H4s(A0Y(), A0V());
    }

    @Override // X.JKS
    public final String getTitle() {
        return A0Y();
    }

    @Override // X.JKS
    public final String getUrl() {
        return A0V();
    }
}
