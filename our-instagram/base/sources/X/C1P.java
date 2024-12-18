package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class C1P extends C17T implements InterfaceC31132DmF {
    public List A00;

    private final List A01(C1DY c1dy) {
        List<ImmutablePandoMediaDict> A0o = A0o(1377047637, ImmutablePandoMediaDict.class);
        ArrayList A0q = AbstractC167017dG.A0q(A0o);
        for (ImmutablePandoMediaDict immutablePandoMediaDict : A0o) {
            AtomicBoolean atomicBoolean = C38321qM.A0i;
            A0q.add(C38801rC.A00(c1dy, immutablePandoMediaDict));
        }
        return A0q;
    }

    @Override // X.InterfaceC31132DmF
    public final List Aoa() {
        List list = this.A00;
        if (list != null) {
            return list;
        }
        throw new UnsupportedOperationException("Please call reconciledWithStore() first to access the 'clipsSpins' field.");
    }

    @Override // X.InterfaceC31132DmF
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC27672CIr.A00(this));
    }

    @Override // X.InterfaceC31132DmF
    public final boolean BV0() {
        return getBooleanValueByHashCode(-1932541039);
    }

    @Override // X.InterfaceC31132DmF
    public final String Bb8() {
        return A0i(801940329);
    }

    @Override // X.InterfaceC31132DmF
    public final InterfaceC31132DmF EBO(C1DY c1dy) {
        this.A00 = A01(c1dy);
        return this;
    }

    @Override // X.InterfaceC31132DmF
    public final C26214Bie F4d(C1DY c1dy) {
        List A01 = A01(c1dy);
        ArrayList A0q = AbstractC167017dG.A0q(A01);
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            A0q.add(c1dy.A00((C38321qM) it.next()));
        }
        return new C26214Bie(A0i(801940329), A0q, getBooleanValueByHashCode(-1932541039));
    }

    @Override // X.InterfaceC31132DmF
    public final C26214Bie F4e(C1DV c1dv) {
        return F4d(AbstractC25235BEs.A0b(c1dv));
    }
}
