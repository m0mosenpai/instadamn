package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.HNr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39202HNr extends C17T implements JKC {
    @Override // X.JKC
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        getEffectId();
        A1I.put("effect_id", Long.valueOf(getEffectId()));
        getSegmentIndex();
        return AbstractC25234BEr.A0P(this, AbstractC37301Gc2.A0r("segment_index", Integer.valueOf(getSegmentIndex()), A1I));
    }

    @Override // X.JKC
    public final C38703H2o EsC() {
        return new C38703H2o(A03(-1468661111), getIntValueByHashCode(-614025018));
    }

    @Override // X.JKC
    public final long getEffectId() {
        return A03(-1468661111);
    }

    @Override // X.JKC
    public final int getSegmentIndex() {
        return getIntValueByHashCode(-614025018);
    }
}
