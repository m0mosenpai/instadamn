package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration;

/* loaded from: classes9.dex */
public final class OUH {
    public final UserSession A00;
    public final EffectInfoBottomSheetConfiguration A01;
    public final O22 A02;
    public final C55907Ory A03;
    public final C55907Ory A04;
    public final String A05;

    public OUH(UserSession userSession, EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration, O22 o22, C55907Ory c55907Ory, C55907Ory c55907Ory2, String str) {
        this.A00 = userSession;
        this.A01 = effectInfoBottomSheetConfiguration;
        this.A02 = o22;
        this.A03 = c55907Ory;
        this.A04 = c55907Ory2;
        this.A05 = str;
    }

    public static void A00(View view, float f) {
        Object tag = view.getTag(R.id.effect_info_attributions_item_view_holder);
        if (tag instanceof OF7) {
            float A02 = AbstractC13600mm.A02(f, 0.75f, 1.0f, 0.0f, 1.0f);
            OF7 of7 = (OF7) tag;
            of7.A06.setAlpha(A02);
            of7.A04.setAlpha(A02);
            of7.A02.setAlpha(A02);
            of7.A03.setAlpha(A02);
        }
    }
}
