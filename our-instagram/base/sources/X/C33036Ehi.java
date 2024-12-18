package X;

import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ehi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33036Ehi extends C17T implements InterfaceC37272GbP {
    public List A00;

    private final List A01(C1DY c1dy) {
        List<ImmutablePandoUserDict> A0o = A0o(-867503855, ImmutablePandoUserDict.class);
        ArrayList A0q = AbstractC167017dG.A0q(A0o);
        for (ImmutablePandoUserDict immutablePandoUserDict : A0o) {
            Parcelable.Creator creator = User.CREATOR;
            A0q.add(AbstractC38851rI.A01(c1dy, immutablePandoUserDict));
        }
        return A0q;
    }

    @Override // X.InterfaceC37272GbP
    public final List Bkm() {
        List list = this.A00;
        if (list != null) {
            return list;
        }
        throw new UnsupportedOperationException("Please call reconciledWithStore() first to access the 'reactors' field.");
    }

    @Override // X.InterfaceC37272GbP
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC33746EvY.A00(this));
    }

    @Override // X.InterfaceC37272GbP
    public final InterfaceC37272GbP EAf(C1DY c1dy) {
        this.A00 = A01(c1dy);
        return this;
    }

    @Override // X.InterfaceC37272GbP
    public final E8B F1c(C1DY c1dy) {
        String A0h = A0h(96632902);
        List A01 = A01(c1dy);
        ArrayList A0q = AbstractC167017dG.A0q(A01);
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            A0q.add(c1dy.A00(AbstractC25226BEj.A15(it)));
        }
        return new E8B(A0h, A0q);
    }

    @Override // X.InterfaceC37272GbP
    public final E8B F1d(C1DV c1dv) {
        return F1c(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.InterfaceC37272GbP
    public final String getEmoji() {
        return A0h(96632902);
    }
}
