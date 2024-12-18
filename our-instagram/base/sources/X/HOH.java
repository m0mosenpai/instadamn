package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.showreel.IgShowreelComposition;
import com.instagram.model.showreel.IgShowreelCompositionImpl;
import com.instagram.model.showreel.ImmutablePandoIgShowreelComposition;

/* loaded from: classes7.dex */
public final class HOH extends C17T implements InterfaceC104794nk {
    @Override // X.InterfaceC104794nk
    public final IgShowreelComposition Bx5() {
        return (IgShowreelComposition) A05(-1604670462, ImmutablePandoIgShowreelComposition.class);
    }

    @Override // X.InterfaceC104794nk
    public final C69N Bx6() {
        return (C69N) A05(-824538620, HSv.class);
    }

    @Override // X.InterfaceC104794nk
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39862HmB.A00(this));
    }

    @Override // X.InterfaceC104794nk
    public final C114565Fc Esg() {
        IgShowreelCompositionImpl igShowreelCompositionImpl;
        IgShowreelComposition Bx5 = Bx5();
        H5B h5b = null;
        if (Bx5 != null) {
            igShowreelCompositionImpl = Bx5.F6Y();
        } else {
            igShowreelCompositionImpl = null;
        }
        C69N Bx6 = Bx6();
        if (Bx6 != null) {
            h5b = Bx6.EzX();
        }
        return new C114565Fc(h5b, igShowreelCompositionImpl);
    }
}
