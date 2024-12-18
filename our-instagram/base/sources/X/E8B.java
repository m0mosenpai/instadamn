package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes6.dex */
public final class E8B extends C0T6 implements InterfaceC37272GbP {
    public final String A00;
    public final List A01;

    @Override // X.InterfaceC37272GbP
    public final E8B F1c(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC37272GbP
    public final E8B F1d(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E8B) {
                E8B e8b = (E8B) obj;
                if (!C14360o3.A0K(this.A00, e8b.A00) || !C14360o3.A0K(this.A01, e8b.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC37272GbP
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryReactionStickerReactors", AbstractC33746EvY.A00(this));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public E8B(String str, List list) {
        AbstractC167017dG.A1P(str, list);
        this.A00 = str;
        this.A01 = list;
    }

    @Override // X.InterfaceC37272GbP
    public final List Bkm() {
        return this.A01;
    }

    @Override // X.InterfaceC37272GbP
    public final String getEmoji() {
        return this.A00;
    }

    @Override // X.InterfaceC37272GbP
    public final InterfaceC37272GbP EAf(C1DY c1dy) {
        return this;
    }
}
