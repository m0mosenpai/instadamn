package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public abstract class VRW {
    public static final void A00(View view, FragmentActivity fragmentActivity, PromoteData promoteData, PromoteState promoteState, UserSession userSession, List list) {
        boolean z;
        View findViewById;
        EnumC58132lV enumC58132lV;
        int i;
        C14360o3.A0B(userSession, 1);
        View A0S = AbstractC166997dE.A0S(view, R.id.destination_option_group);
        UserSession userSession2 = promoteData.A0y;
        C14360o3.A06(userSession2);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession2);
        if (!promoteState.A05 && !C97F.A04(promoteData)) {
            View findViewWithTag = A0S.findViewWithTag(XIGIGBoostDestination.A04);
            if (findViewWithTag != null && (findViewById = findViewWithTag.findViewById(R.id.primary_text)) != null) {
                i = 2131970641;
                if (promoteData.A1p.contains(XIGIGBoostDestination.A0G) && !C97F.A04(promoteData)) {
                    InterfaceC19630xq interfaceC19630xq = A00.A01;
                    z = false;
                    if (interfaceC19630xq.getInt("whatsapp_linking_in_promote_flow_tooltip_impression_count", 0) < 2) {
                        C70399WUb.A00(userSession2).A0I(VG4.A17, "whatsapp_linking_tooltip");
                        AbstractC50522MSa.A1T(interfaceC19630xq, "whatsapp_linking_in_promote_flow_tooltip_impression_count", 0);
                        enumC58132lV = EnumC58132lV.A03;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            if (promoteState.A05 && list.contains(AdsAPIInstagramPosition.A0G)) {
                InterfaceC19630xq interfaceC19630xq2 = A00.A01;
                z = false;
                if (interfaceC19630xq2.getInt("promote_destination_ads_preview_thumbnail_tooltip_impression_count", 0) < 2) {
                    if (System.currentTimeMillis() - interfaceC19630xq2.getLong("promote_destination_ads_preview_thumbnail_tooltip_impression_time", -1L) > 600000) {
                        AbstractC50522MSa.A1T(interfaceC19630xq2, "promote_destination_ads_preview_thumbnail_tooltip_impression_count", 0);
                        InterfaceC19610xo ARD = interfaceC19630xq2.ARD();
                        ARD.E7G("promote_destination_ads_preview_thumbnail_tooltip_impression_time", System.currentTimeMillis());
                        ARD.apply();
                        findViewById = AbstractC166997dE.A0R(view, R.id.promotion_preview_thumbnail);
                        enumC58132lV = EnumC58132lV.A02;
                        i = 2131970546;
                    }
                }
            }
            z = false;
            if (!promoteData.A2i) {
                return;
            }
            UserSession userSession3 = promoteData.A0y;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!AbstractC31178DnM.A1X(c06090Tz, userSession3, 36316568417735179L)) {
                return;
            }
            InterfaceC19630xq interfaceC19630xq3 = A00.A01;
            if (interfaceC19630xq3.getInt("promote_direct_inbox_entered_more_message_goal_tooltip_impression_count", 0) > C18U.A01(c06090Tz, userSession3, 36598043394706522L)) {
                return;
            }
            if (System.currentTimeMillis() - interfaceC19630xq3.getLong("promote_direct_inbox_entered_more_message_goal_tooltip_last_seen_timestamp", -1L) < TimeUnit.SECONDS.toMillis(C18U.A01(c06090Tz, userSession3, 36598043394640985L))) {
                return;
            }
            AbstractC167017dG.A1L(interfaceC19630xq3.ARD(), interfaceC19630xq3, "promote_direct_inbox_entered_more_message_goal_tooltip_impression_count", 0);
            long currentTimeMillis = System.currentTimeMillis();
            InterfaceC19610xo ARD2 = interfaceC19630xq3.ARD();
            ARD2.E7G("promote_direct_inbox_entered_more_message_goal_tooltip_last_seen_timestamp", currentTimeMillis);
            ARD2.apply();
            findViewById = A0S.findViewWithTag(XIGIGBoostDestination.A04).findViewById(R.id.secondary_text);
            C14360o3.A0A(findViewById);
            enumC58132lV = EnumC58132lV.A03;
            i = 2131970767;
        }
        C5SU A0f = AbstractC167017dG.A0f(fragmentActivity, fragmentActivity.getString(i));
        A0f.A03(findViewById);
        A0f.A0B = z;
        A0f.A05 = enumC58132lV;
        findViewById.post(new RunnableC71311Wrf(A0f));
    }
}
