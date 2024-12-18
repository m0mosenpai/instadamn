package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.H2o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38703H2o extends C0T6 implements JKC {
    public final int A00;
    public final long A01;

    @Override // X.JKC
    public final C38703H2o EsC() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38703H2o) {
                C38703H2o c38703H2o = (C38703H2o) obj;
                if (this.A01 != c38703H2o.A01 || this.A00 != c38703H2o.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JKC
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        getEffectId();
        A1I.put("effect_id", Long.valueOf(getEffectId()));
        getSegmentIndex();
        return AbstractC37300Gc1.A05("XDTClipsTemplateSegmentEffectInfo", AbstractC37301Gc2.A0r("segment_index", Integer.valueOf(getSegmentIndex()), A1I));
    }

    @Override // X.JKC
    public final long getEffectId() {
        return this.A01;
    }

    @Override // X.JKC
    public final int getSegmentIndex() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC25235BEs.A03(this.A01) + this.A00;
    }

    public C38703H2o(long j, int i) {
        this.A01 = j;
        this.A00 = i;
    }
}
