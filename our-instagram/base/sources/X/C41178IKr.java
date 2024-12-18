package X;

import android.app.Activity;
import com.facebook.R;
import com.instagram.ar.features.effectspage.models.EffectsPageModel;
import com.instagram.common.session.UserSession;
import instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment;

/* renamed from: X.IKr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41178IKr {
    public final void A00(Activity activity, EnumC223429tZ enumC223429tZ, C8JW c8jw, UserSession userSession, String str, String str2) {
        AbstractC167017dG.A1Q(userSession, str2);
        EffectsPageModel effectsPageModel = new EffectsPageModel(null, null, Integer.valueOf(R.drawable.horizon_worlds_foa_horizonlogo), 2131963649, 2131963652, 2131963648, "", "", "43", "43", "", AbstractC166997dE.A0p(activity, 2131963651), "", "HORIZON", false, C18U.A06(C06090Tz.A05, userSession, 36319922787196770L), false, true, false, false, true, false);
        String A0n = AbstractC166997dE.A0n();
        C14360o3.A0B(A0n, 2);
        AbstractC40465Hwu.A00(activity, EffectsPageFragment.A00(enumC223429tZ, c8jw, effectsPageModel, null, str, A0n, null, null, null), null, enumC223429tZ, null, EnumC50631MWs.A0G, userSession, C05F.A01, str2);
    }
}
