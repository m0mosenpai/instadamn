package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.SoundPlatformProduct;

/* loaded from: classes7.dex */
public final class H2L extends C0T6 implements JK8 {
    public final SoundPlatformProduct A00;
    public final String A01;

    @Override // X.JK8
    public final H2L Er3() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H2L) {
                H2L h2l = (H2L) obj;
                if (!C14360o3.A0K(this.A01, h2l.A01) || this.A00 != h2l.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JK8
    public final String Ah2() {
        return this.A01;
    }

    @Override // X.JK8
    public final SoundPlatformProduct Bya() {
        return this.A00;
    }

    @Override // X.JK8
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTAudioGoDarkInfoText", AbstractC39756HkS.A00(this));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public H2L(SoundPlatformProduct soundPlatformProduct, String str) {
        AbstractC167017dG.A1P(str, soundPlatformProduct);
        this.A01 = str;
        this.A00 = soundPlatformProduct;
    }
}
