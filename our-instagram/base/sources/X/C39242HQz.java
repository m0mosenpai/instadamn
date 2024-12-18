package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.HQz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39242HQz extends C17T implements InterfaceC74403Vw {
    @Override // X.InterfaceC74403Vw
    public final ExtendedImageUrl BGU() {
        C37926GmO c37926GmO = (C37926GmO) getTreeValueByHashCode(100313435, C37926GmO.class);
        if (c37926GmO != null) {
            return new ExtendedImageUrl(c37926GmO);
        }
        return null;
    }

    @Override // X.InterfaceC74403Vw
    public final C38321qM CEv() {
        return null;
    }

    @Override // X.InterfaceC74403Vw
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40069Hpv.A00(this));
    }

    @Override // X.InterfaceC74403Vw
    public final C74393Vv EwU(C1DY c1dy) {
        C38321qM c38321qM;
        ExtendedImageUrl BGU = BGU();
        ImmutablePandoMediaDict immutablePandoMediaDict = (ImmutablePandoMediaDict) getTreeValueByHashCode(112202875, ImmutablePandoMediaDict.class);
        if (immutablePandoMediaDict != null) {
            C38801rC c38801rC = C38321qM.A0h;
            C38321qM A00 = C38801rC.A00(c1dy, immutablePandoMediaDict);
            if (A00 != null) {
                c38321qM = (C38321qM) c1dy.A00(A00);
                return new C74393Vv(c38321qM, BGU);
            }
        }
        c38321qM = null;
        return new C74393Vv(c38321qM, BGU);
    }

    @Override // X.InterfaceC74403Vw
    public final C74393Vv EwV(C1DV c1dv) {
        return EwU(AbstractC37304Gc5.A09(c1dv));
    }
}
