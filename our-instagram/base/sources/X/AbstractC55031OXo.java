package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration;

/* renamed from: X.OXo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55031OXo {
    public static N75 A00(EnumC50631MWs enumC50631MWs, UserSession userSession, C55U c55u, EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration, InterfaceC149856oe interfaceC149856oe, boolean z) {
        N75 n75 = new N75();
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putParcelable("ar_effect_bottom_sheet_info", effectInfoBottomSheetConfiguration);
        A05.putSerializable("ar_effect_surface", enumC50631MWs);
        A05.putBoolean("ar_effect_is_e2ee_mandated", z);
        if (c55u != null) {
            A05.putString("camera_destination", c55u.A02);
        }
        n75.setArguments(A05);
        n75.A02 = interfaceC149856oe;
        return n75;
    }

    public static void A01(Context context) {
        C3DN A01 = C3DN.A00.A01(context);
        if (A01 != null && (A01.A09() instanceof N75)) {
            A01.A0B();
        }
    }

    public static void A02(Context context, EnumC50631MWs enumC50631MWs, UserSession userSession, C55U c55u, EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration, InterfaceC149856oe interfaceC149856oe, InterfaceC1119153d interfaceC1119153d) {
        if (context != null) {
            effectInfoBottomSheetConfiguration.A02.get(0);
            C189448aO A0y = AbstractC25225BEi.A0y(userSession);
            A0y.A05(context, R.dimen.clips_audio_browser_audiomixing_height);
            A0y.A1G = true;
            if (interfaceC1119153d != null) {
                A0y.A0U = interfaceC1119153d;
            }
            A0y.A00().A03(context, A00(enumC50631MWs, userSession, c55u, effectInfoBottomSheetConfiguration, interfaceC149856oe, false));
        }
    }
}
