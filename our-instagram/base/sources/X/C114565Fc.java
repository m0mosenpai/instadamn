package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.showreel.IgShowreelComposition;

/* renamed from: X.5Fc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C114565Fc extends C0T6 implements InterfaceC104794nk {
    public final C69N A00;
    public final IgShowreelComposition A01;

    @Override // X.InterfaceC104794nk
    public final C114565Fc Esg() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114565Fc) {
                C114565Fc c114565Fc = (C114565Fc) obj;
                if (!C14360o3.A0K(this.A01, c114565Fc.A01) || !C14360o3.A0K(this.A00, c114565Fc.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        IgShowreelComposition igShowreelComposition = this.A01;
        int hashCode = (igShowreelComposition == null ? 0 : igShowreelComposition.hashCode()) * 31;
        C69N c69n = this.A00;
        return hashCode + (c69n != null ? c69n.hashCode() : 0);
    }

    @Override // X.InterfaceC104794nk
    public final IgShowreelComposition Bx5() {
        return this.A01;
    }

    @Override // X.InterfaceC104794nk
    public final C69N Bx6() {
        return this.A00;
    }

    @Override // X.InterfaceC104794nk
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCreativeTransformation", AbstractC39862HmB.A00(this));
    }

    public C114565Fc(C69N c69n, IgShowreelComposition igShowreelComposition) {
        this.A01 = igShowreelComposition;
        this.A00 = c69n;
    }
}
