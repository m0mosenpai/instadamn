package X;

import android.os.Bundle;
import com.instagram.api.schemas.ContextualAdResponseOrganicInfoImpl;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.I1e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40672I1e {
    public static final Bundle A00(UserSession userSession, C38321qM c38321qM, IntentAwareAdPivotState intentAwareAdPivotState, EnumC71153Hb enumC71153Hb, HBC hbc) {
        String str;
        String str2;
        Bundle A0b = AbstractC166987dD.A0b();
        C38321qM c38321qM2 = hbc.A04;
        if (c38321qM2 != null && c38321qM2.CdW() && C5MB.A00.A01(Integer.valueOf(hbc.A00))) {
            A0b.putString("contextual_feed_seed_ad_tracking_token", AbstractC41071vF.A0F(userSession, c38321qM2));
        }
        int i = hbc.A00;
        String A00 = AbstractC111324zv.A00(196);
        String str3 = null;
        if (i == 7) {
            ContextualAdResponseOrganicInfoImpl contextualAdResponseOrganicInfoImpl = hbc.A02;
            if (contextualAdResponseOrganicInfoImpl != null) {
                str = contextualAdResponseOrganicInfoImpl.A01;
            } else {
                str = null;
            }
            A0b.putString(A00, str);
            ContextualAdResponseOrganicInfoImpl contextualAdResponseOrganicInfoImpl2 = hbc.A02;
            if (contextualAdResponseOrganicInfoImpl2 != null) {
                str2 = contextualAdResponseOrganicInfoImpl2.A00;
            } else {
                str2 = null;
            }
            A0b.putString(AbstractC111324zv.A00(379), str2);
        } else {
            A0b.putString(A00, hbc.A00().A02);
        }
        A0b.putParcelable(AbstractC111324zv.A00(378), intentAwareAdPivotState);
        A0b.putInt("contextual_feed_ad_pivot_type", hbc.A00);
        H4K h4k = hbc.A03;
        if (h4k != null) {
            str3 = h4k.A04;
        }
        A0b.putString("contextual_feed_category_hash_id", str3);
        A0b.putInt("contextual_feed_multi_ad_unit_chaining_position", new C40861ut(hbc.A01()).A09());
        A0b.putString("contextual_feed_multi_ad_unit_id", hbc.getId());
        A0b.putString("contextual_feed_inventory_source", hbc.A0A);
        A0b.putString("contextual_feed_individual_ad_media_id", c38321qM.getId());
        if (c38321qM.CdW()) {
            A0b.putString("contextual_feed_individual_ad_tracking_token", AbstractC41071vF.A0F(userSession, c38321qM));
            A0b.putString("contextual_feed_individual_ad_ad_id", AbstractC41071vF.A07(userSession, c38321qM));
        }
        if (enumC71153Hb != null) {
            A0b.putString("contextual_feed_trigger_type_name", enumC71153Hb.name());
        }
        return A0b;
    }
}
