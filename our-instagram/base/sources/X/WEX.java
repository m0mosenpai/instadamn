package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.boost.model.BoostFlowType;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import kotlin.Deprecated;

@Deprecated(message = "To be removed after Boost launcher migration")
/* loaded from: classes11.dex */
public final class WEX {
    public XIGIGBoostDestination A00;
    public BoostFlowType A01 = BoostFlowType.A07;
    public PromoteLaunchOrigin A02;
    public UserSession A03;
    public ImageUrl A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final Context A0E;
    public final C1Y5 A0F;

    public static Bundle A01(BoostFlowType boostFlowType, PromoteLaunchOrigin promoteLaunchOrigin, UserSession userSession, String str, String str2, String str3, String str4, String str5, int i, int i2) {
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putString("media_id", str4);
        A05.putSerializable("promote_launch_origin", promoteLaunchOrigin);
        A05.putSerializable("boost_flow_type", boostFlowType);
        A05.putString("audience_id", null);
        A05.putParcelable("media_url", null);
        A05.putString("ad_account_id", null);
        A05.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str3);
        A05.putBoolean("is_sub_flow", false);
        A05.putString("coupon_offer_id", str2);
        A05.putString("objective", str5);
        A05.putString("destination_cta", null);
        A05.putString("political_ad_byline_text", null);
        A05.putBoolean("has_product_tag", false);
        A05.putStringArray("sponsor_ids", null);
        A05.putSerializable("destination", null);
        A05.putSerializable("personalized_destination", null);
        A05.putInt("default_budget", i);
        A05.putInt("default_duration", i2);
        A05.putBoolean("is_from_ctwa_upsell", false);
        A05.putBoolean("is_ctwa_coupon_aymt", false);
        A05.putBoolean("is_from_lead_ads_upsell", false);
        A05.putString("aymt_channel", str);
        A05.putString("reference_code_for_aymt_dropoff", null);
        A05.putSerializable("media_product_type", null);
        A05.putBoolean("is_from_direct_inbox_entry_point", false);
        A05.putString("selected_audio_spec", null);
        A05.putParcelable("selected_audio_overlay_track", null);
        A05.putString("draft_id", null);
        A05.putString("daily_spend_offset", null);
        A05.putInt("elapsed_duration_in_days", 0);
        A05.putString("page_id", null);
        A05.putString("remaining_budget", null);
        A05.putString("remaining_duration", null);
        A05.putInt("remaining_duration_in_hours", 0);
        A05.putInt("spent_budget_offset_amount", 0);
        A05.putInt("total_budget_offset_amount", 0);
        A05.putInt("total_duration_in_days", 0);
        return A05;
    }

    public static final String A02(String str) {
        String str2 = (String) AbstractC167007dF.A0m(str, "_", 0).get(0);
        if (AbstractC001900j.A0a(str2, ".", false)) {
            return (String) AbstractC167007dF.A0m(str2, "\\.", 0).get(1);
        }
        return str2;
    }

    public static final Bundle A00(WEX wex) {
        Bundle bundle = new Bundle();
        AbstractC31173DnH.A1C(bundle, wex.A03);
        bundle.putString("media_id", wex.A0A);
        bundle.putSerializable("promote_launch_origin", wex.A02);
        bundle.putSerializable("boost_flow_type", wex.A01);
        bundle.putString("audience_id", wex.A06);
        bundle.putParcelable("media_url", wex.A04);
        bundle.putString("ad_account_id", wex.A05);
        bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, wex.A09);
        bundle.putBoolean("is_sub_flow", false);
        bundle.putString("coupon_offer_id", wex.A07);
        bundle.putString("objective", null);
        bundle.putString("destination_cta", null);
        bundle.putString("political_ad_byline_text", null);
        bundle.putBoolean("has_product_tag", wex.A0B);
        bundle.putStringArray("sponsor_ids", null);
        bundle.putSerializable("destination", null);
        bundle.putSerializable("personalized_destination", wex.A00);
        bundle.putInt("default_budget", 0);
        bundle.putInt("default_duration", 0);
        bundle.putBoolean("is_from_ctwa_upsell", wex.A0C);
        bundle.putBoolean("is_ctwa_coupon_aymt", false);
        bundle.putBoolean("is_from_lead_ads_upsell", false);
        bundle.putString("aymt_channel", null);
        bundle.putString("reference_code_for_aymt_dropoff", null);
        bundle.putSerializable("media_product_type", null);
        bundle.putBoolean("is_from_direct_inbox_entry_point", wex.A0D);
        bundle.putString("selected_audio_spec", null);
        bundle.putParcelable("selected_audio_overlay_track", null);
        bundle.putString("draft_id", wex.A08);
        bundle.putString("daily_spend_offset", null);
        bundle.putInt("elapsed_duration_in_days", 0);
        bundle.putString("page_id", null);
        bundle.putString("remaining_budget", null);
        bundle.putString("remaining_duration", null);
        bundle.putInt("remaining_duration_in_hours", 0);
        bundle.putInt("spent_budget_offset_amount", 0);
        bundle.putInt("total_budget_offset_amount", 0);
        bundle.putInt("total_duration_in_days", 0);
        return bundle;
    }

    public WEX(Context context, C1Y5 c1y5, UserSession userSession, String str, String str2) {
        this.A0A = A02(str);
        this.A09 = str2;
        this.A03 = userSession;
        this.A0E = context;
        this.A0F = c1y5;
    }
}
