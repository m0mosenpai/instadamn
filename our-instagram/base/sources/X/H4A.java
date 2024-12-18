package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MediaGiftCountVisibilityState;
import com.instagram.api.schemas.MediaGiftingState;

/* loaded from: classes7.dex */
public final class H4A extends C0T6 implements JKO {
    public final MediaGiftCountVisibilityState A00;
    public final MediaGiftingState A01;

    @Override // X.JKO
    public final H4A EwC() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H4A) {
                H4A h4a = (H4A) obj;
                if (this.A00 != h4a.A00 || this.A01 != h4a.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JKO
    public final MediaGiftCountVisibilityState B9r() {
        return this.A00;
    }

    @Override // X.JKO
    public final MediaGiftingState BQn() {
        return this.A01;
    }

    @Override // X.JKO
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTMediaAppreciationSettings", AbstractC40061Hpn.A00(this));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public H4A(MediaGiftCountVisibilityState mediaGiftCountVisibilityState, MediaGiftingState mediaGiftingState) {
        AbstractC167017dG.A1P(mediaGiftCountVisibilityState, mediaGiftingState);
        this.A00 = mediaGiftCountVisibilityState;
        this.A01 = mediaGiftingState;
    }
}
