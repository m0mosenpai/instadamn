package X;

import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.crossposting.setting.manager.FbAutoCrossPostingSettingManager;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8ld, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195918ld implements CallerContextable {
    public static final C196008lp A05 = new Object();
    public static final String __redex_internal_original_name = "StoryShareToFBController";
    public InterfaceC191388dp A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final UserSession A04;

    public static final void A00(C195918ld c195918ld, Integer num, String str, String str2, boolean z) {
        String str3;
        UserSession userSession = c195918ld.A04;
        boolean A00 = C196008lp.A00(userSession);
        boolean z2 = c195918ld.A02;
        String A01 = C9H5.A01(num);
        C18920wW A02 = AbstractC12220kQ.A02(userSession);
        InterfaceC02590Ai A002 = A02.A00(A02.A00, "ig_auto_xposting_to_fb_setting");
        A002.AAP("flow_name", "ig_story_share_to_fb");
        if (z) {
            str3 = "server_setting_updated_success";
        } else {
            str3 = "server_setting_updated_failed";
        }
        A002.AAP("event_name", str3);
        A002.AAP("xposting_setting_location", str);
        A002.A7v("client_setting", Boolean.valueOf(A00));
        A002.AAP("server_setting", str2);
        A002.A7v("user_interaction", true);
        A002.AAP("account_type", AbstractC08690cX.A01(userSession).name());
        A002.A7v("user_attempted_client_setting", Boolean.valueOf(z2));
        A002.AAP("destination_account_linkage_type", A01);
        A002.Cht();
    }

    public static final void A01(C195918ld c195918ld, Integer num, String str, boolean z, boolean z2) {
        String str2;
        A05.A01(c195918ld.A04, num, str, z, true);
        InterfaceC191388dp interfaceC191388dp = c195918ld.A00;
        if (interfaceC191388dp != null) {
            interfaceC191388dp.Dlg();
        }
        if (z2 && z) {
            str2 = "ON";
        } else {
            str2 = "OFF";
        }
        A00(c195918ld, num, str, str2, true);
    }

    public final void A03(C128735rg c128735rg, Integer num, String str) {
        String str2;
        boolean coercedBooleanField = c128735rg.getCoercedBooleanField(1, "is_auto_crosspost_enabled");
        UserSession userSession = this.A04;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        int coercedIntField = c128735rg.getCoercedIntField(2, "auto_crosspost_setting_timestamp");
        InterfaceC19610xo ARD = A00.A01.ARD();
        ARD.E7D("xpost_to_facebook_story_server_mtime_in_second", coercedIntField);
        ARD.apply();
        InterfaceC191388dp interfaceC191388dp = this.A00;
        if (interfaceC191388dp != null) {
            interfaceC191388dp.Dlg();
        }
        boolean A002 = C196008lp.A00(userSession);
        if (coercedBooleanField) {
            str2 = "ON";
        } else {
            str2 = "OFF";
        }
        C9LK.A04(userSession, str, "server_setting_fetch_success_not_null", str2, "CAL", A002);
        A05.A01(userSession, num, str, coercedBooleanField, false);
    }

    public final void A02() {
        this.A02 = C196008lp.A00(this.A04);
        InterfaceC191388dp interfaceC191388dp = this.A00;
        if (interfaceC191388dp != null) {
            interfaceC191388dp.Dlg();
        }
    }

    public final void A04(boolean z) {
        if (this.A02 != z) {
            this.A02 = z;
            InterfaceC191388dp interfaceC191388dp = this.A00;
            if (interfaceC191388dp != null) {
                interfaceC191388dp.Dlg();
            }
        }
    }

    public final void A05(boolean z, String str) {
        String str2;
        int intValue;
        UserSession userSession = this.A04;
        Integer A00 = AbstractC196078lx.A00(userSession);
        boolean A002 = C196008lp.A00(userSession);
        String A01 = C9H5.A01(A00);
        C18920wW A02 = AbstractC12220kQ.A02(userSession);
        InterfaceC02590Ai A003 = A02.A00(A02.A00, "ig_auto_xposting_to_fb_setting");
        A003.AAP("flow_name", "ig_story_share_to_fb");
        A003.AAP("event_name", "user_update_setting_attempt");
        A003.AAP("xposting_setting_location", str);
        A003.A7v("client_setting", Boolean.valueOf(A002));
        A003.A7v("user_interaction", true);
        Boolean valueOf = Boolean.valueOf(z);
        A003.A7v("user_attempted_client_setting", valueOf);
        A003.AAP("account_type", AbstractC08690cX.A01(userSession).name());
        A003.AAP("destination_account_linkage_type", A01);
        A003.Cht();
        this.A02 = z;
        InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
        ARD.E7D(AbstractC111324zv.A00(5276), Integer.MAX_VALUE);
        ARD.apply();
        FbAutoCrossPostingSettingManager A004 = C196018lq.A00(userSession);
        if (A004.isCrossPostingSettingsPlatformizationWriteEnabled()) {
            A004.updateAutoCrossPostingSetting(new C51761Mtk(AbstractC16850sd.A0M(new C09530e4(EnumC222709sB.A04, valueOf))), null);
            return;
        }
        if (A00 != null) {
            str2 = C9H5.A01(A00);
        } else {
            str2 = null;
        }
        C18920wW A022 = AbstractC12220kQ.A02(userSession);
        InterfaceC02590Ai A005 = A022.A00(A022.A00, "ig_auto_xposting_to_fb_setting");
        A005.AAP("flow_name", "ig_story_share_to_fb");
        A005.AAP("event_name", "server_setting_update_attempt");
        A005.AAP("xposting_setting_location", str);
        A005.A7v("user_interaction", true);
        A005.A7v("user_attempted_client_setting", valueOf);
        A005.AAP("account_type", AbstractC08690cX.A01(userSession).name());
        A005.AAP("destination_account_linkage_type", str2);
        A005.Cht();
        if (A00 != null && (intValue = A00.intValue()) != 0 && intValue == 1) {
            OVK ovk = OVK.A00;
            List singletonList = Collections.singletonList(new OTO("STORY", z));
            C14360o3.A07(singletonList);
            ovk.A00(userSession, new C24045Alh(this, str, z), singletonList);
            return;
        }
        MY8 my8 = MY8.A00;
        List singletonList2 = Collections.singletonList(new OTO("STORY", this.A02));
        C14360o3.A07(singletonList2);
        my8.A01(userSession, new C24047Alj(this, str), singletonList2);
    }

    public final boolean A06() {
        if (this.A02 && !this.A01 && C180377zR.A07(this.A04)) {
            return true;
        }
        return false;
    }

    public C195918ld(UserSession userSession, InterfaceC191388dp interfaceC191388dp) {
        this.A04 = userSession;
        this.A00 = interfaceC191388dp;
        this.A02 = C196008lp.A00(userSession);
        this.A03 = C196008lp.A00(userSession);
        InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
        if (!interfaceC19630xq.contains("story_last_server_xposting_turn_on_time_in_second")) {
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.E7D("story_last_server_xposting_turn_on_time_in_second", (int) (System.currentTimeMillis() / 1000));
            ARD.apply();
        }
    }
}
