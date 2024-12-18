package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class C1Q extends C17T implements InterfaceC31135DmI {
    public InterfaceC31134DmH A00;
    public List A01;

    private final List A01(C1DY c1dy) {
        List<ImmutablePandoMediaDict> A0o = A0o(232478054, ImmutablePandoMediaDict.class);
        ArrayList A0q = AbstractC167017dG.A0q(A0o);
        for (ImmutablePandoMediaDict immutablePandoMediaDict : A0o) {
            AtomicBoolean atomicBoolean = C38321qM.A0i;
            A0q.add(C38801rC.A00(c1dy, immutablePandoMediaDict));
        }
        return A0q;
    }

    @Override // X.InterfaceC31135DmI
    public final List Bfu() {
        List list = this.A01;
        if (list != null) {
            return list;
        }
        throw new UnsupportedOperationException("Please call reconciledWithStore() first to access the 'previewMedias' field.");
    }

    @Override // X.InterfaceC31135DmI
    public final InterfaceC31134DmH Bie() {
        InterfaceC31134DmH interfaceC31134DmH = this.A00;
        if (interfaceC31134DmH == null) {
            return (InterfaceC31134DmH) A05(1633979813, C39241HQx.class);
        }
        return interfaceC31134DmH;
    }

    @Override // X.InterfaceC31135DmI
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC27674CIt.A00(this));
    }

    @Override // X.InterfaceC31135DmI
    public final int AdR() {
        return getIntValueByHashCode(975628804);
    }

    @Override // X.InterfaceC31135DmI
    public final List Aqg() {
        return getOptionalStringListByHashCode(1186418019);
    }

    @Override // X.InterfaceC31135DmI
    public final Long B3E() {
        return A0L(31792438);
    }

    @Override // X.InterfaceC31135DmI
    public final int BQa() {
        return getIntValueByHashCode(-9393932);
    }

    @Override // X.InterfaceC31135DmI
    public final int C2Z() {
        return getIntValueByHashCode(1416817934);
    }

    @Override // X.InterfaceC31135DmI
    public final InterfaceC31135DmI EBU(C1DY c1dy) {
        this.A01 = A01(c1dy);
        InterfaceC31134DmH Bie = Bie();
        if (Bie != null) {
            Bie.E9E(c1dy);
        } else {
            Bie = null;
        }
        this.A00 = Bie;
        return this;
    }

    @Override // X.InterfaceC31135DmI
    public final C26215Bif F4o(C1DY c1dy) {
        H4C h4c;
        int intValueByHashCode = getIntValueByHashCode(975628804);
        ImmutableList optionalStringListByHashCode = getOptionalStringListByHashCode(1186418019);
        Long A0L = A0L(31792438);
        int intValueByHashCode2 = getIntValueByHashCode(-9393932);
        List A01 = A01(c1dy);
        ArrayList A0q = AbstractC167017dG.A0q(A01);
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            A0q.add(c1dy.A00((C38321qM) it.next()));
        }
        InterfaceC31134DmH Bie = Bie();
        if (Bie != null) {
            h4c = Bie.EwR(c1dy);
        } else {
            h4c = null;
        }
        return new C26215Bif(h4c, A0L, optionalStringListByHashCode, A0q, intValueByHashCode, intValueByHashCode2, getIntValueByHashCode(1416817934));
    }

    @Override // X.InterfaceC31135DmI
    public final C26215Bif F4p(C1DV c1dv) {
        return F4o(AbstractC25235BEs.A0b(c1dv));
    }
}
