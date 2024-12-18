package X;

import android.os.Bundle;

/* renamed from: X.G7b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36477G7b implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "ShoppingExternalUrlHandler$2";
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ GIE A01;

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    public C36477G7b(Bundle bundle, GIE gie) {
        this.A01 = gie;
        this.A00 = bundle;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        Bundle bundle = this.A00;
        if (bundle.getString("prior_module") != null) {
            return bundle.getString("prior_module");
        }
        return "deep_link";
    }
}
