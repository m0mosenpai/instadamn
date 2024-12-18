package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes6.dex */
public final class E7a extends C0T6 implements InterfaceC37271GbO {
    public final C87493vH A00;
    public final List A01;

    @Override // X.InterfaceC37271GbO
    public final E7a ErF(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC37271GbO
    public final E7a ErG(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E7a) {
                E7a e7a = (E7a) obj;
                if (!C14360o3.A0K(this.A01, e7a.A01) || !C14360o3.A0K(this.A00, e7a.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC37271GbO
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTBlendRecommenderInfoList", AbstractC33667EuH.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public E7a(C87493vH c87493vH, List list) {
        this.A01 = list;
        this.A00 = c87493vH;
    }

    @Override // X.InterfaceC37271GbO
    public final List BNG() {
        return this.A01;
    }

    @Override // X.InterfaceC37271GbO
    public final /* bridge */ /* synthetic */ InterfaceC87503vI BlA() {
        return this.A00;
    }

    @Override // X.InterfaceC37271GbO
    public final InterfaceC37271GbO E8k(C1DY c1dy) {
        return this;
    }
}
