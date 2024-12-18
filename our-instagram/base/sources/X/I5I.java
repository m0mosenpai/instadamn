package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes7.dex */
public abstract class I5I {
    public static void A00(UserSession userSession, C38930HCd c38930HCd, C41628IbJ c41628IbJ, NXU nxu, NXU nxu2, NXU nxu3, C75363a3 c75363a3, String str) {
        View view = nxu.A00;
        view.setVisibility(0);
        int A06 = AbstractC167007dF.A06(1, view.getContext(), str);
        AbstractC54239NyK.A00(nxu, new OFM(null, null, C41628IbJ.A00(c41628IbJ).Bhu(), new HJA(5, c38930HCd, c41628IbJ), AbstractC31178DnM.A0c(nxu.A02.getContext(), C41628IbJ.A00(c41628IbJ), 2131971226), str, 1.0f, false, true, false));
        Context context = nxu2.A00.getContext();
        C14360o3.A0B(context, 1);
        ImageUrl Bhu = AbstractC166987dD.A10(userSession).Bhu();
        AbstractC54239NyK.A00(nxu2, new OFM(context.getDrawable(R.drawable.empty_story_badge_elevated), null, Bhu, new KKm(A06, c41628IbJ, nxu2, c38930HCd, userSession, c75363a3), context.getString(2131971229), str, 1.0f, false, true, false));
        Context context2 = nxu3.A00.getContext();
        C14360o3.A0B(context2, 1);
        AbstractC54239NyK.A00(nxu3, new OFM(null, context2.getDrawable(R.drawable.instagram_delete_pano_outline_24), null, new HJA(6, c38930HCd, c41628IbJ), context2.getString(2131971225), str, 1.0f, true, true, false));
    }
}
