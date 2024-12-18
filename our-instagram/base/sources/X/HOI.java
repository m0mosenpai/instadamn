package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.showreel.IgShowreelComposition;
import com.instagram.model.showreel.IgShowreelCompositionImpl;
import com.instagram.model.showreel.ImmutablePandoIgShowreelComposition;
import com.instagram.model.showreelnative.IgShowreelNativeAnimation;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import com.instagram.model.showreelnative.ImmutablePandoIgShowreelNativeAnimation;

/* loaded from: classes7.dex */
public final class HOI extends C17T implements InterfaceC104804nl {
    @Override // X.InterfaceC104804nl
    public final IgShowreelComposition Bx5() {
        return (IgShowreelComposition) A05(-1604670462, ImmutablePandoIgShowreelComposition.class);
    }

    @Override // X.InterfaceC104804nl
    public final IgShowreelNativeAnimationIntf Bx7() {
        return (IgShowreelNativeAnimationIntf) A05(-824538620, ImmutablePandoIgShowreelNativeAnimation.class);
    }

    @Override // X.InterfaceC104804nl
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39863HmC.A00(this));
    }

    @Override // X.InterfaceC104804nl
    public final C52r Esh() {
        IgShowreelCompositionImpl igShowreelCompositionImpl;
        IgShowreelComposition Bx5 = Bx5();
        IgShowreelNativeAnimation igShowreelNativeAnimation = null;
        if (Bx5 != null) {
            igShowreelCompositionImpl = Bx5.F6Y();
        } else {
            igShowreelCompositionImpl = null;
        }
        IgShowreelNativeAnimationIntf Bx7 = Bx7();
        if (Bx7 != null) {
            igShowreelNativeAnimation = Bx7.F6Z();
        }
        return new C52r(igShowreelCompositionImpl, igShowreelNativeAnimation);
    }
}
