package X;

import android.os.Handler;
import android.text.TextUtils;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.business.BusinessInfo;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.registration.model.RegFlowExtras;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class GRB implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ AbstractC12990ll A02;
    public final /* synthetic */ BusinessInfo A03;
    public final /* synthetic */ GY6 A04;
    public final /* synthetic */ RegFlowExtras A05;
    public final /* synthetic */ EnumC33445EqI A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    public GRB(Handler handler, AbstractC59962oe abstractC59962oe, AbstractC12990ll abstractC12990ll, BusinessInfo businessInfo, GY6 gy6, RegFlowExtras regFlowExtras, EnumC33445EqI enumC33445EqI, String str, String str2, String str3) {
        this.A02 = abstractC12990ll;
        this.A01 = abstractC59962oe;
        this.A05 = regFlowExtras;
        this.A00 = handler;
        this.A09 = str;
        this.A07 = str2;
        this.A03 = businessInfo;
        this.A06 = enumC33445EqI;
        this.A08 = str3;
        this.A04 = gy6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Integer num;
        C07270a1 c07270a1;
        String str;
        AbstractC12990ll abstractC12990ll = this.A02;
        AbstractC59962oe abstractC59962oe = this.A01;
        RegFlowExtras regFlowExtras = this.A05;
        Handler handler = this.A00;
        String str2 = this.A09;
        String str3 = this.A07;
        BusinessInfo businessInfo = this.A03;
        EnumC33445EqI enumC33445EqI = this.A06;
        if (enumC33445EqI == EnumC33445EqI.A06) {
            num = C05F.A01;
        } else {
            num = C05F.A00;
        }
        String str4 = this.A08;
        GY6 gy6 = this.A04;
        CallerContext callerContext = C35786FrO.A00;
        boolean z = abstractC12990ll instanceof UserSession;
        if (z) {
            c07270a1 = C023409i.A0A.A03((C08V) abstractC59962oe.requireActivity());
        } else {
            c07270a1 = (C07270a1) abstractC12990ll;
        }
        if (num == C05F.A00) {
            str = "accounts/create_business/";
        } else {
            str = "accounts/create_business_validated/";
        }
        C25621Ms c25621Ms = new C25621Ms(c07270a1);
        RegFlowExtras.A00(abstractC59962oe.requireContext(), c25621Ms, abstractC12990ll, regFlowExtras, true);
        c25621Ms.A05();
        ((AbstractC23721Ec) c25621Ms).A03 = null;
        c25621Ms.A0L = true;
        ((AbstractC23721Ec) c25621Ms).A02 = null;
        c25621Ms.A0M = true;
        c25621Ms.A0E = str;
        String str5 = str2;
        Pattern pattern = AbstractC13670mt.A01;
        if (str2 == null) {
            str5 = "";
        }
        c25621Ms.A9s(AbstractC31190DnZ.A00(), str5);
        String str6 = regFlowExtras.A08;
        if (str6 == null) {
            str6 = "";
        }
        c25621Ms.A9s("email", str6);
        String str7 = regFlowExtras.A0Q;
        if (str7 == null) {
            str7 = "";
        }
        c25621Ms.A9s(AbstractC31190DnZ.A01(9, 12, 105), str7);
        String str8 = businessInfo.A0J;
        if (str8 == null) {
            str8 = "";
        }
        c25621Ms.A9s("page_id", str8);
        String str9 = businessInfo.A09;
        if (str9 == null) {
            str9 = "";
        }
        c25621Ms.A9s("category_id", str9);
        boolean z2 = businessInfo.A0S;
        String str10 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        String str11 = "0";
        String str12 = "0";
        if (z2) {
            str12 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        }
        c25621Ms.A9s("should_show_public_contacts", str12);
        if (!businessInfo.A0Q) {
            str10 = "0";
        }
        c25621Ms.A9s("should_show_category", str10);
        C11820jg c11820jg = C11830jh.A04;
        C11830jh A01 = c11820jg.A01(c07270a1);
        C19T c19t = C19T.A1N;
        AbstractC31175DnJ.A1F(c19t, c25621Ms, A01);
        FDT.A00(c19t, c25621Ms, c11820jg, c07270a1);
        c25621Ms.A9s(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str3);
        W4M w4m = new W4M(c07270a1);
        String str13 = regFlowExtras.A0P;
        if (str13 == null) {
            str13 = "";
        }
        c25621Ms.A9s("enc_password", w4m.A00(str13));
        c25621Ms.A0P(C07340a8.A00, EDQ.class, C34837FWu.class, false);
        EnumC222416a enumC222416a = businessInfo.A02;
        if (enumC222416a != null) {
            c25621Ms.A9s("to_account_type", String.valueOf(enumC222416a.A00));
        }
        String str14 = businessInfo.A0I;
        if (TextUtils.isEmpty(str14)) {
            str14 = "instagram";
        }
        c25621Ms.A9s("professional_signup_source_user_type", str14);
        String str15 = businessInfo.A0H;
        if (!TextUtils.isEmpty(str15)) {
            c25621Ms.A9s("professional_signup_source_page_id", str15);
        }
        String str16 = businessInfo.A0G;
        if (!TextUtils.isEmpty(str16)) {
            c25621Ms.A9s("professional_signup_source_account_id", str16);
        } else {
            if (str4 == null) {
                if (z) {
                    str11 = AbstractC03270Dk.A02(abstractC12990ll);
                }
            } else {
                str11 = str4;
            }
            c25621Ms.A9s("professional_signup_source_account_id", str11);
        }
        AbstractC31181DnP.A0o(c25621Ms, regFlowExtras);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new C32544EUu(abstractC59962oe.requireContext(), handler, abstractC59962oe.getParentFragmentManager(), abstractC59962oe, c07270a1, abstractC12990ll, businessInfo, gy6, enumC33445EqI, enumC33445EqI, str2, str3);
        abstractC59962oe.schedule(A0N);
    }
}
