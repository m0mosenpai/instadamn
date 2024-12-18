package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MediaGiftCountVisibilityState;
import com.instagram.api.schemas.MediaGiftingState;

/* loaded from: classes7.dex */
public final class HQq extends C17T implements JKO {
    @Override // X.JKO
    public final MediaGiftCountVisibilityState B9r() {
        return (MediaGiftCountVisibilityState) A0M(524023665, JA8.A00);
    }

    @Override // X.JKO
    public final MediaGiftingState BQn() {
        return (MediaGiftingState) A0M(-1966056023, JA9.A00);
    }

    @Override // X.JKO
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40061Hpn.A00(this));
    }

    @Override // X.JKO
    public final H4A EwC() {
        return new H4A(B9r(), BQn());
    }
}
