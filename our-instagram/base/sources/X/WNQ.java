package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import com.instagram.business.promote.model.InstagramMediaProductType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class WNQ implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public WNQ(V16 v16, VG5 vg5, String str, int i) {
        this.A00 = i;
        switch (i) {
            case 4:
            case 5:
            case 6:
                this.A02 = v16;
                this.A03 = str;
                break;
            default:
                this.A03 = str;
                this.A02 = v16;
                break;
        }
        this.A01 = vg5;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        String str;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-706302561);
                UFY ufy = (UFY) this.A02;
                String str2 = this.A03;
                String valueOf = String.valueOf(((C67526UnQ) this.A01).A0E());
                C14360o3.A0B(str2, 0);
                UFY.A00(ufy, "user_click_payouthub_atomic", "notification_hub_dismiss_click", str2, valueOf, null, null, null, null, null, null, null, null, null);
                C58252li c58252li = ufy.A07;
                List list = (List) c58252li.A02();
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        AbstractC25228BEl.A1Q(obj, arrayList, C14360o3.A0K(((AbstractC70120W4v) obj).A00.A03, str2) ? 1 : 0);
                    }
                    c58252li.A0B(arrayList);
                }
                i = -1740168759;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(236527795);
                V0N v0n = (V0N) this.A02;
                FragmentActivity requireActivity = v0n.requireActivity();
                UserSession userSession = (UserSession) v0n.A0B.getValue();
                String str3 = this.A03;
                W6I w6i = v0n.A00;
                if (w6i != null) {
                    VG5 vg5 = (VG5) this.A01;
                    C14360o3.A0B(userSession, 1);
                    if (str3 != null) {
                        w6i.A0A("ads_manager_highlights_hub", WGU.A01(vg5), null, null);
                        W6f.A02(requireActivity, new We7(requireActivity, w6i, userSession, str3), userSession, false);
                    }
                    i = 48960381;
                    C0f9.A0C(i, A05);
                    return;
                }
                str = "adsManagerLogger";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 2:
                A05 = C0f9.A05(-1560396576);
                V0N v0n2 = (V0N) this.A02;
                Context requireContext = v0n2.requireContext();
                UserSession userSession2 = (UserSession) v0n2.A0B.getValue();
                String str4 = this.A03;
                W6I w6i2 = v0n2.A00;
                if (w6i2 != null) {
                    VG5 vg52 = (VG5) this.A01;
                    C14360o3.A0B(userSession2, 1);
                    if (str4 != null) {
                        w6i2.A0A("ads_manager_highlights_hub", WGU.A01(vg52), str4, null);
                        AbstractC69888VxF.A00().A06(v0n2, VRF.A00().A00(requireContext, userSession2, str4, "ads_manager_highlights_hub"), v0n2);
                    }
                    i = 278821688;
                    C0f9.A0C(i, A05);
                    return;
                }
                str = "adsManagerLogger";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 3:
                A05 = C0f9.A05(1051923540);
                V0N v0n3 = (V0N) this.A02;
                Context requireContext2 = v0n3.requireContext();
                FragmentActivity requireActivity2 = v0n3.requireActivity();
                UserSession userSession3 = (UserSession) v0n3.A0B.getValue();
                String str5 = this.A03;
                W6I w6i3 = v0n3.A00;
                if (w6i3 != null) {
                    AbstractC69895VxM.A00(requireContext2, v0n3, requireActivity2, w6i3, (VG5) this.A01, v0n3, userSession3, str5, "promote_ads_manager_highlights_hub_see_all_fragment");
                    i = -354336211;
                    C0f9.A0C(i, A05);
                    return;
                }
                str = "adsManagerLogger";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 4:
                A05 = C0f9.A05(-157904670);
                V16 v16 = (V16) this.A02;
                FragmentActivity requireActivity3 = v16.requireActivity();
                UserSession session = v16.getSession();
                String str6 = this.A03;
                W6I w6i4 = v16.A07;
                if (w6i4 != null) {
                    VG5 vg53 = (VG5) this.A01;
                    C14360o3.A0B(session, 1);
                    if (str6 != null) {
                        w6i4.A0A("ads_manager_highlights_hub", WGU.A01(vg53), null, null);
                        W6f.A02(requireActivity3, new We7(requireActivity3, w6i4, session, str6), session, false);
                    }
                    i = -28304142;
                    C0f9.A0C(i, A05);
                    return;
                }
                str = "adsManagerLogger";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 5:
                A05 = C0f9.A05(-229253196);
                V16 v162 = (V16) this.A02;
                Context requireContext3 = v162.requireContext();
                UserSession session2 = v162.getSession();
                String str7 = this.A03;
                W6I w6i5 = v162.A07;
                if (w6i5 != null) {
                    VG5 vg54 = (VG5) this.A01;
                    C14360o3.A0B(session2, 1);
                    if (str7 != null) {
                        w6i5.A0A("ads_manager_highlights_hub", WGU.A01(vg54), str7, null);
                        AbstractC69888VxF.A00().A06(v162, VRF.A00().A00(requireContext3, session2, str7, "ads_manager_highlights_hub"), v162);
                    }
                    i = 979729302;
                    C0f9.A0C(i, A05);
                    return;
                }
                str = "adsManagerLogger";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 6:
                A05 = C0f9.A05(580121671);
                V16 v163 = (V16) this.A02;
                Context requireContext4 = v163.requireContext();
                FragmentActivity requireActivity4 = v163.requireActivity();
                UserSession session3 = v163.getSession();
                String str8 = this.A03;
                W6I w6i6 = v163.A07;
                if (w6i6 != null) {
                    AbstractC69895VxM.A00(requireContext4, v163, requireActivity4, w6i6, (VG5) this.A01, v163, session3, str8, "promote_ads_manager_fragment");
                    i = 1355724294;
                    C0f9.A0C(i, A05);
                    return;
                }
                str = "adsManagerLogger";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 7:
                A05 = C0f9.A05(2140486433);
                String str9 = this.A03;
                if (str9 != null) {
                    V16 v164 = (V16) this.A02;
                    List list2 = v164.A0c;
                    C14360o3.A0B(list2, 0);
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            InterfaceC72003XEr interfaceC72003XEr = (InterfaceC72003XEr) it.next();
                            if (C14360o3.A0K(interfaceC72003XEr.BZZ(), str9)) {
                                C70654Wea c70654Wea = (C70654Wea) interfaceC72003XEr;
                                if (c70654Wea != null) {
                                    Object obj2 = this.A01;
                                    WGU.A03(v164.requireContext(), new DialogInterfaceOnClickListenerC70208WHm(v164, c70654Wea, obj2, str9, 2), v164, c70654Wea.C89(), AbstractC167007dF.A1X(c70654Wea.BIP(), InstagramMediaProductType.A0K));
                                }
                            }
                        }
                    }
                    W6I w6i7 = v164.A07;
                    if (w6i7 != null) {
                        w6i7.A07("ads_manager_highlights_hub", AppStateModule.APP_STATE_ACTIVE, str9, "FB Login failed or cancelled");
                        AbstractC65702TsY.A17(v164);
                    }
                    str = "adsManagerLogger";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                i = 190197844;
                C0f9.A0C(i, A05);
                return;
            case 8:
                A05 = C0f9.A05(243642346);
                C45477KBp c45477KBp = (C45477KBp) this.A02;
                LE1 le1 = c45477KBp.A00;
                if (le1 == null) {
                    str = "logger";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                LE1.A00(le1, "igd_campaign_card_action_button_click", AbstractC167007dF.A0n("ad_action_type", "extend_ad"));
                C1Y6 A00 = AbstractC69888VxF.A00();
                UserSession userSession4 = (UserSession) c45477KBp.A04.getValue();
                FragmentActivity requireActivity5 = c45477KBp.requireActivity();
                String str10 = this.A03;
                Bundle bundle = (Bundle) this.A01;
                A00.A05(requireActivity5, userSession4, str10, "inbox_campaign_message_list", AbstractC153636vY.A01(bundle, "remaining_budget"), AbstractC153636vY.A01(bundle, "remaining_duration"), AbstractC153636vY.A01(bundle, "daily_spend_offset"), null, bundle.getInt("spent_budget_offset_amount"), bundle.getInt("total_budget_offset_amount"), bundle.getInt("elapsed_duration_in_days"), bundle.getInt("total_duration_in_days"), bundle.getInt("remaining_duration_in_hours"));
                i = 366087426;
                C0f9.A0C(i, A05);
                return;
            case 9:
                A05 = C0f9.A05(-598598892);
                V1H v1h = (V1H) this.A02;
                IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict = v1h.A01;
                C65886Tvq c65886Tvq = v1h.A06;
                OnFeedMessagesIntf onFeedMessagesIntf = v1h.A02;
                if (onFeedMessagesIntf != null && c65886Tvq != null && iGCTMessagingAdsInfoDict != null) {
                    String str11 = v1h.A09;
                    if (str11 == null) {
                        str11 = "-1";
                    }
                    c65886Tvq.A06((Long) this.A01, str11, this.A03, AbstractC76663cE.A00(onFeedMessagesIntf), VTE.A00(iGCTMessagingAdsInfoDict));
                }
                V1H.A00(AbstractC166997dE.A0L(view), v1h, this.A03, false);
                i = -1705561920;
                C0f9.A0C(i, A05);
                return;
            case 10:
                A05 = C0f9.A05(2023561493);
                Fragment fragment = (Fragment) this.A01;
                String str12 = this.A03;
                if (fragment.isAdded()) {
                    AbstractC13900nG.A00(fragment.requireContext(), str12);
                    C9GR.A07(fragment.requireContext(), 2131965226);
                }
                i = 7059772;
                C0f9.A0C(i, A05);
                return;
            default:
                ((InterfaceC58311Pt3) this.A01).Day((C5HW) this.A02, this.A03);
                return;
        }
    }

    public WNQ(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = str;
        this.A01 = obj;
    }
}
