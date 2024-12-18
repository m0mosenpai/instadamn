package X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.Oru, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55905Oru implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "RecommendToFacebookOptimizedUpsellFragment$Companion";

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "recommend_to_facebook_optimization_upsell";
    }

    public static final C52125N4y A00(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, C55011OVw c55011OVw, InterfaceC16820sZ interfaceC16820sZ) {
        Bundle A00 = C55011OVw.A00(c55011OVw);
        A00.putString("ARG_DESIGN_VARIANT", c55011OVw.A04);
        A00.putInt("ARG_NUX_ATTEMPT_QPL_INSTANCE_KEY", c55011OVw.A00);
        C52125N4y c52125N4y = new C52125N4y();
        c52125N4y.A00 = onClickListener;
        c52125N4y.A01 = onClickListener2;
        c52125N4y.A04 = interfaceC16820sZ;
        c52125N4y.setArguments(A00);
        return c52125N4y;
    }
}
