package X;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.CreatorViewerSignalModel;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;

/* renamed from: X.Gc6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37305Gc6 {
    public static String A02(C31D c31d, InterfaceC42381xS interfaceC42381xS) {
        C14360o3.A0B(interfaceC42381xS, 0);
        C40971v4 c40971v4 = (C40971v4) interfaceC42381xS.BUM();
        return AnonymousClass001.A17("ad_id: [", c40971v4.A0S, "] tracking_token: [", c40971v4.A0j, "] media_id: [", c40971v4.A0K.getId(), "] ad_client_delivery_session_id: [", c31d.A00, ']');
    }

    public static InterfaceC02590Ai A00(C18920wW c18920wW, ShoppingTaggingFeedArguments shoppingTaggingFeedArguments, String str) {
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, str);
        A00.AAP("prior_module", shoppingTaggingFeedArguments.A0B);
        A00.AAP("session_instance_id", shoppingTaggingFeedArguments.A0F);
        A00.AAP("waterfall_id", shoppingTaggingFeedArguments.A0G);
        A00.AAP("usage", shoppingTaggingFeedArguments.A03.A00);
        return A00;
    }

    public static String A01(C0Zx c0Zx, JMH jmh, String str) {
        c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        String Byf = jmh.Byf();
        if (C14360o3.A0K(Byf, "USER_ENGAGED")) {
            return "USER_ENGAGED";
        }
        if (C14360o3.A0K(Byf, "PERSONALIZED_TRENDING")) {
            return "PERSONALIZED_TRENDING";
        }
        return "UNKNOWN";
    }

    public static void A03(Activity activity, InterfaceC11380iw interfaceC11380iw) {
        C1OU c1ou = C1OU.$redex_init_class;
        C3M4 A05 = C3M4.A05(activity);
        if (A05 != null && A05.A0a() && A05.A0G == C3G2.A1g) {
            A05.A0Y(interfaceC11380iw);
        }
    }

    public static void A04(View view, ViewGroup.LayoutParams layoutParams, String str, String str2, int i) {
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor(str), Color.parseColor(str2)});
        gradientDrawable.setCornerRadius(0.0f);
        view.setBackground(gradientDrawable);
    }

    public static void A05(InterfaceC02590Ai interfaceC02590Ai, CreatorViewerSignalModel creatorViewerSignalModel, Long l) {
        interfaceC02590Ai.A9K("media_ig_id", l);
        interfaceC02590Ai.AAP("signal", creatorViewerSignalModel.BxI().toString());
        interfaceC02590Ai.AAP("signal_text_enum", creatorViewerSignalModel.getTitle());
    }

    public static void A06(AbstractC02600Aj abstractC02600Aj, InterfaceC11380iw interfaceC11380iw, Long l) {
        abstractC02600Aj.A0Q("post_id", l);
        abstractC02600Aj.A0R("reel_id", "");
        abstractC02600Aj.A0Q("reel_position", l);
        abstractC02600Aj.A0Q("reel_size", l);
        abstractC02600Aj.A0R("reel_type", "");
        abstractC02600Aj.A0Q("session_reel_counter", l);
        abstractC02600Aj.A0R("source_of_action", interfaceC11380iw.getModuleName());
    }

    public static void A07(AbstractC02600Aj abstractC02600Aj, UserSession userSession, Long l, String str) {
        abstractC02600Aj.A0R("sticker_type", str);
        abstractC02600Aj.A0R("story_ranking_token", "");
        Double valueOf = Double.valueOf(0.0d);
        abstractC02600Aj.A0P("time_elapsed", valueOf);
        abstractC02600Aj.A0P("time_remaining", valueOf);
        abstractC02600Aj.A0Q("tray_pos_excl_own_story", l);
        abstractC02600Aj.A0Q("tray_position", l);
        abstractC02600Aj.A0R("tray_session_id", "");
        abstractC02600Aj.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, userSession.userId);
    }

    public static void A08(C18920wW c18920wW, Long l, String str) {
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, str);
        if (A00.isSampled()) {
            A00.A9K("media_id", l);
            A00.AAP("entrypoint", "accept_flow_entrypoint_other");
            A00.AAP("surface", "accept_flow_review_surface_dialog");
            A00.Cht();
        }
    }
}
