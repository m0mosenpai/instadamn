package X;

import android.os.Bundle;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.ErrorIdentifier;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.boost.webview.BoostWebViewAdPreviewFragment$Config;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vvi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69798Vvi {
    public final C60891Raz A00(UserSession userSession, String str) {
        boolean A1R = AbstractC167007dF.A1R(0, str, userSession);
        BoostWebViewAdPreviewFragment$Config boostWebViewAdPreviewFragment$Config = new BoostWebViewAdPreviewFragment$Config(str, AnonymousClass001.A0R("access_token=", userSession.token), null, null, false, false, false, false, false, A1R, false, A1R, false, false, false);
        Bundle bundle = new Bundle();
        bundle.putParcelable(AbstractC58317Pt9.A00(982), boostWebViewAdPreviewFragment$Config);
        AbstractC31173DnH.A1C(bundle, userSession);
        C60891Raz c60891Raz = new C60891Raz();
        c60891Raz.setArguments(bundle);
        return c60891Raz;
    }

    public final C52564NNk A05() {
        C52564NNk c52564NNk = new C52564NNk();
        Bundle bundle = new Bundle();
        bundle.putString(MSV.A00(501), MSV.A00(1378));
        bundle.putString(MSV.A00(500), null);
        c52564NNk.setArguments(bundle);
        return c52564NNk;
    }

    public final KCN A06(boolean z) {
        KCN kcn = new KCN();
        Bundle bundle = new Bundle();
        bundle.putBoolean(AbstractC43591JPw.A00(1110), z);
        bundle.putBoolean(AbstractC43591JPw.A00(1117), false);
        kcn.setArguments(bundle);
        return kcn;
    }

    public final C67874V0f A07(XIGIGBoostCallToAction xIGIGBoostCallToAction, XIGIGBoostDestination xIGIGBoostDestination, UserSession userSession, ImageUrl imageUrl, AudioOverlayTrack audioOverlayTrack, String str, String str2, String str3, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        AbstractC25234BEr.A0j(2, xIGIGBoostDestination, list, str, xIGIGBoostCallToAction);
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putBoolean("is_view_pager_child", z);
        A05.putString("destination", xIGIGBoostDestination.toString());
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((AdsAPIInstagramPosition) it.next()).name());
        }
        AbstractC65703TsZ.A1G(A05, A0q, xIGIGBoostCallToAction, str, z2);
        A05.putBoolean("is_fb_placement_selected", z3);
        A05.putBoolean("is_ad_format_preferences_eligible", z4);
        A05.putBoolean("should_show_creative_optimization_toggle", z5);
        A05.putBoolean("should_show_multi_advertiser_ads_toggle", z6);
        A05.putString("political_ad_byline_text", str2);
        A05.putParcelable("selected_audio_overlay_track", audioOverlayTrack);
        A05.putString("ab_text_banner_text", str3);
        A05.putParcelable("ab_test_banner_url", imageUrl);
        C67874V0f c67874V0f = new C67874V0f();
        c67874V0f.setArguments(A05);
        return c67874V0f;
    }

    public final C67873V0e A08(XIGIGBoostCallToAction xIGIGBoostCallToAction, XIGIGBoostDestination xIGIGBoostDestination, UserSession userSession, AudioOverlayTrack audioOverlayTrack, String str, String str2, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        AbstractC25234BEr.A0j(2, xIGIGBoostDestination, list, str, xIGIGBoostCallToAction);
        C14360o3.A0B(list2, 12);
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putBoolean("is_view_pager_child", z);
        A05.putString("destination", xIGIGBoostDestination.toString());
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((AdsAPIInstagramPosition) it.next()).name());
        }
        AbstractC65703TsZ.A1G(A05, A0q, xIGIGBoostCallToAction, str, z2);
        A05.putBoolean("is_fb_placement_selected", z3);
        A05.putBoolean("is_ad_format_preferences_eligible", z4);
        A05.putBoolean("should_show_creative_optimization_toggle", z5);
        A05.putBoolean("should_show_multi_advertiser_ads_toggle", z6);
        A05.putString("political_ad_byline_text", str2);
        A05.putStringArrayList("special_requirement_categories", new ArrayList<>(list2));
        A05.putParcelable("selected_audio_overlay_track", audioOverlayTrack);
        C67873V0e c67873V0e = new C67873V0e();
        c67873V0e.setArguments(A05);
        return c67873V0e;
    }

    public final V0L A09(ErrorIdentifier errorIdentifier, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putString("error_type", errorIdentifier.toString());
        V0L v0l = new V0L();
        v0l.setArguments(A05);
        return v0l;
    }

    public final C67890V0x A02(VG4 vg4) {
        Bundle bundle = new Bundle();
        bundle.putString(OptSvcAnalyticsStore.LOGGING_KEY_STEP, vg4.toString());
        C67890V0x c67890V0x = new C67890V0x();
        c67890V0x.setArguments(bundle);
        return c67890V0x;
    }

    public final V11 A03(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("should_open_special_category", z);
        V11 v11 = new V11();
        v11.setArguments(bundle);
        return v11;
    }

    public final C52570NNq A04(boolean z, boolean z2) {
        C52570NNq c52570NNq = new C52570NNq();
        Bundle bundle = new Bundle();
        bundle.putBoolean(MSV.A00(1344), z);
        bundle.putBoolean("is_standard_lead_form", z2);
        c52570NNq.setArguments(bundle);
        return c52570NNq;
    }

    public final V16 A01(UserSession userSession, String str, String str2) {
        AbstractC167017dG.A1N(userSession, str);
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putString("coupon_offer_id", str2);
        A05.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        V16 v16 = new V16();
        v16.setArguments(A05);
        return v16;
    }
}
