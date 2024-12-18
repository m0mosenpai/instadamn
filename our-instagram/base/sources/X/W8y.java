package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.adsdatapreferences.consentgrowth.controller.IGAdsPreferencesIsOptedOutFromThirdPartyMutationResponseImpl;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes11.dex */
public final class W8y {
    public final C685036n A00;
    public final AbstractC59962oe A01;
    public final Map A02;
    public final UserSession A03;

    public W8y(C685036n c685036n, AbstractC59962oe abstractC59962oe, UserSession userSession, Map map) {
        AbstractC25233BEq.A0w(2, userSession, c685036n, map);
        this.A01 = abstractC59962oe;
        this.A03 = userSession;
        this.A00 = c685036n;
        this.A02 = map;
    }

    public static final void A00(W8y w8y, String str) {
        C66277U6x A01 = C66277U6x.A01("com.instagram.ads.cad_data_preferences.helpers.ads_personalization_screen_wrapper", AbstractC167017dG.A0r(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str));
        AbstractC59962oe abstractC59962oe = w8y.A01;
        FragmentActivity requireActivity = abstractC59962oe.requireActivity();
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(w8y.A03);
        igBloksScreenConfig.A0U = abstractC59962oe.requireActivity().getString(2131957504);
        A01.A04(requireActivity, igBloksScreenConfig);
    }

    public static final void A01(W8y w8y, boolean z) {
        C40701ud A01 = AbstractC40691uc.A01(w8y.A03);
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        c2jm.A02("is_account_opt_out", Boolean.valueOf(z));
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGAdsPreferencesIsOptedOutFromThirdPartyMutation", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), IGAdsPreferencesIsOptedOutFromThirdPartyMutationResponseImpl.class, true, null, 0, null, "update_ig_opt_out_from_third_party", new ArrayList());
        A01.ATV(C70437WVp.A00, WW7.A00, pandoGraphQLRequest);
    }
}
