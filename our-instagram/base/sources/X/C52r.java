package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.showreel.IgShowreelComposition;
import com.instagram.model.showreelnative.IgShowreelNativeAnimation;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;

/* renamed from: X.52r, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C52r extends C0T6 implements InterfaceC104804nl {
    public final IgShowreelComposition A00;
    public final IgShowreelNativeAnimation A01;

    @Override // X.InterfaceC104804nl
    public final C52r Esh() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52r) {
                C52r c52r = (C52r) obj;
                if (!C14360o3.A0K(this.A00, c52r.A00) || !C14360o3.A0K(this.A01, c52r.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        IgShowreelComposition igShowreelComposition = this.A00;
        int hashCode = (igShowreelComposition == null ? 0 : igShowreelComposition.hashCode()) * 31;
        IgShowreelNativeAnimation igShowreelNativeAnimation = this.A01;
        return hashCode + (igShowreelNativeAnimation != null ? igShowreelNativeAnimation.hashCode() : 0);
    }

    @Override // X.InterfaceC104804nl
    public final IgShowreelComposition Bx5() {
        return this.A00;
    }

    @Override // X.InterfaceC104804nl
    public final /* bridge */ /* synthetic */ IgShowreelNativeAnimationIntf Bx7() {
        return this.A01;
    }

    @Override // X.InterfaceC104804nl
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCreativeTransformationsFeedInfo", AbstractC39863HmC.A00(this));
    }

    public C52r(IgShowreelComposition igShowreelComposition, IgShowreelNativeAnimation igShowreelNativeAnimation) {
        this.A00 = igShowreelComposition;
        this.A01 = igShowreelNativeAnimation;
    }
}
