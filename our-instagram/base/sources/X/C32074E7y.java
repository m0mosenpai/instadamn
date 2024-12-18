package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.E7y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32074E7y extends C0T6 implements InterfaceC37266GbJ {
    public final String A00;
    public final List A01;

    @Override // X.InterfaceC37266GbJ
    public final C32074E7y Exr() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32074E7y) {
                C32074E7y c32074E7y = (C32074E7y) obj;
                if (!C14360o3.A0K(this.A00, c32074E7y.A00) || !C14360o3.A0K(this.A01, c32074E7y.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC37266GbJ
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTPACAdSocialFeedbackAggregationInfo", AbstractC33726EvE.A00(this));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public C32074E7y(String str, List list) {
        AbstractC167017dG.A1P(str, list);
        this.A00 = str;
        this.A01 = list;
    }

    @Override // X.InterfaceC37266GbJ
    public final List Baq() {
        return this.A01;
    }

    @Override // X.InterfaceC37266GbJ
    public final String getMediaId() {
        return this.A00;
    }
}
