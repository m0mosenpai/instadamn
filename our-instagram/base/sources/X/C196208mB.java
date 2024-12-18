package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.crossposting.setting.manager.FbAutoCrossPostingSettingManager;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8mB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196208mB implements CallerContextable {
    public C22882A7c A00;
    public final UserSession A01;
    public static final C196218mC A03 = new Object();
    public static final String __redex_internal_original_name = "FeedShareToFBController";
    public static final CallerContext A02 = CallerContext.A01(__redex_internal_original_name);

    public static final void A00(C196208mB c196208mB, Integer num, String str, boolean z, boolean z2) {
        Integer num2;
        String str2;
        if (z2 && z) {
            num2 = C05F.A01;
        } else {
            num2 = C05F.A0C;
        }
        if (1 - num2.intValue() != 0) {
            str2 = "OFF";
        } else {
            str2 = "ON";
        }
        UserSession userSession = c196208mB.A01;
        C9LK.A05(userSession, str, "server_setting_updated_success", str2, null, C196218mC.A00(userSession), z);
        A03.A01(userSession, num, str, z, true);
        C22882A7c c22882A7c = c196208mB.A00;
        if (c22882A7c != null) {
            c22882A7c.A01.A01 = true;
        }
    }

    public final void A02(Integer num, String str, boolean z) {
        C196218mC c196218mC = A03;
        UserSession userSession = this.A01;
        c196218mC.A01(userSession, num, str, z, false);
        C9LK.A02(userSession, str, "server_setting_fetch_success_not_null", String.valueOf(z), C9H5.A01(num), C196218mC.A00(userSession));
    }

    public final void A01(UserSession userSession, String str, boolean z) {
        int intValue;
        C14360o3.A0B(userSession, 0);
        C131995xZ A00 = C196068lw.A00(userSession).A00(A02);
        Integer num = A00.A01;
        C196218mC c196218mC = A03;
        if (num != C05F.A00 && !C196068lw.A03(A00)) {
            c196218mC.A01(userSession, null, str, z, true);
            return;
        }
        UserSession userSession2 = this.A01;
        boolean A002 = C196218mC.A00(userSession2);
        String A01 = C9H5.A01(num);
        C18920wW A022 = AbstractC12220kQ.A02(userSession2);
        InterfaceC02590Ai A003 = A022.A00(A022.A00, "ig_auto_xposting_to_fb_setting");
        A003.AAP("flow_name", "ig_feed_share_to_fb");
        A003.AAP("event_name", "user_update_setting_attempt");
        A003.AAP("xposting_setting_location", str);
        A003.A7v("client_setting", Boolean.valueOf(A002));
        A003.A7v("user_interaction", true);
        Boolean valueOf = Boolean.valueOf(z);
        A003.A7v("user_attempted_client_setting", valueOf);
        A003.AAP("account_type", AbstractC08690cX.A01(userSession2).name());
        A003.AAP("destination_account_linkage_type", A01);
        A003.Cht();
        FbAutoCrossPostingSettingManager A004 = C196018lq.A00(userSession);
        if (A004.isCrossPostingSettingsPlatformizationWriteEnabled()) {
            A004.updateAutoCrossPostingSetting(new C51761Mtk(AbstractC16850sd.A0M(new C09530e4(EnumC222709sB.A02, valueOf))), null);
            return;
        }
        C18920wW A023 = AbstractC12220kQ.A02(userSession2);
        InterfaceC02590Ai A005 = A023.A00(A023.A00, "ig_auto_xposting_to_fb_setting");
        A005.AAP("flow_name", "ig_feed_share_to_fb");
        A005.AAP("event_name", "server_setting_update_attempt");
        A005.AAP("xposting_setting_location", str);
        A005.A7v("user_interaction", true);
        A005.A7v("user_attempted_client_setting", valueOf);
        A005.AAP("account_type", AbstractC08690cX.A01(userSession2).name());
        A005.AAP("destination_account_linkage_type", null);
        A005.Cht();
        if (num != null && (intValue = num.intValue()) != 0 && intValue == 1) {
            OVK ovk = OVK.A00;
            List singletonList = Collections.singletonList(new OTO("FEED", z));
            C14360o3.A07(singletonList);
            ovk.A00(userSession2, new C24044Alg(this, str, z), singletonList);
            return;
        }
        MY8 my8 = MY8.A00;
        List singletonList2 = Collections.singletonList(new OTO("FEED", z));
        C14360o3.A07(singletonList2);
        my8.A01(userSession2, new C24049All(this, str, z), singletonList2);
    }

    public C196208mB(UserSession userSession) {
        this.A01 = userSession;
        InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
        if (!interfaceC19630xq.contains("feed_last_server_xposting_turn_on_time_in_second")) {
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.E7D("feed_last_server_xposting_turn_on_time_in_second", (int) (System.currentTimeMillis() / 1000));
            ARD.apply();
        }
    }
}
