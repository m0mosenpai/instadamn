package X;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.Fgm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35253Fgm {
    public static final SpannableStringBuilder A00(FragmentActivity fragmentActivity, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        String A0p = AbstractC166997dE.A0p(fragmentActivity, 2131954157);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AbstractC31177DnL.A0b(fragmentActivity, A0p, 2131969352));
        AnonymousClass773.A05(A0H, new C27281C2g(fragmentActivity, userSession, AbstractC31174DnI.A02(fragmentActivity)), A0p);
        return A0H;
    }

    public static final void A01(Context context, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4) {
        C14360o3.A0B(context, 0);
        AbstractC167027dH.A0a(1, fragmentActivity, userSession, interfaceC11380iw, str);
        C34726FRp A07 = C28531Zo.A04.A02.A07(interfaceC11380iw, userSession, C2EY.A1M);
        A07.A08(false);
        Bundle bundle = A07.A07;
        bundle.putString("DirectShareSheetConstants.partnership_ad_code", str);
        bundle.putString("DirectShareSheetConstants.prefill_reshare_text", AbstractC166997dE.A0p(context, 2131969351));
        DirectShareSheetFragment A00 = A07.A00();
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A0T = A00;
        A0y.A03 = 0.66f;
        AbstractC25225BEi.A1Q(A0y, true);
        AbstractC31173DnH.A0w(fragmentActivity, A00, A0y);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_bc_boost_code_access_token_share");
        A0f.AAP("media_id", str2);
        A0f.AAP("media_type", str3);
        A0f.AAP(MSV.A00(183), str4);
        A0f.Cht();
    }

    public static final void A02(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3) {
        ClipboardManager clipboardManager;
        C14360o3.A0B(context, 0);
        AbstractC167027dH.A13(userSession, interfaceC11380iw, str);
        Object A0X = AbstractC31171DnF.A0X(context);
        if ((A0X instanceof ClipboardManager) && (clipboardManager = (ClipboardManager) A0X) != null) {
            AbstractC31173DnH.A0x(clipboardManager, AbstractC166997dE.A0p(context, 2131969360), str);
            C146106i8 A0Y = AbstractC31174DnI.A0Y();
            AbstractC25226BEj.A1N(context, A0Y, 2131954155);
            AbstractC25233BEq.A1F(A0Y);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_bc_boost_code_access_token_copy");
            A0f.AAP(MSV.A00(183), str3);
            A0f.AAP("media_id", str2);
            A0f.AAP("sponsor_igid", null);
            A0f.Cht();
        }
    }

    public static final void A04(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, boolean z) {
        long j;
        Long A0j;
        AbstractC167007dF.A1K(fragmentActivity, userSession);
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        A0C.A0R = "com.bloks.www.ig.branded_content_ads.permissions";
        AbstractC31171DnF.A10(fragmentActivity, A0C, 2131969361);
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap A1G2 = AbstractC166987dD.A1G();
        HashMap A0h = AbstractC31177DnL.A0h();
        A1G.put("prior_module", str);
        if (str2 != null && (A0j = AbstractC166997dE.A0j(str2)) != null) {
            j = A0j.longValue();
        } else {
            j = 0;
        }
        A1G.put("permission_id", Long.valueOf(j));
        C66277U6x A0H = AbstractC31179DnN.A0H("com.bloks.www.ig.branded_content_ads.permissions", A1G, A1G2);
        A0H.A03 = null;
        A0H.A02 = null;
        A0H.A04 = null;
        A0H.A08(A0h);
        C140966Yy A0A = AbstractC31180DnO.A0A(fragmentActivity, A0C, A0H, userSession);
        if (z) {
            A0A.A0D = false;
        }
        A0A.A04();
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [boolean] */
    public static final void A05(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, boolean z) {
        ?? A1b = AbstractC25233BEq.A1b(fragmentActivity, userSession, str);
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        A0C.A0R = "com.bloks.www.ig.branded_content_ads.settings.ads_by_partner";
        AbstractC31171DnF.A10(fragmentActivity, A0C, 2131969364);
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap A1G2 = AbstractC166987dD.A1G();
        HashMap A1G3 = AbstractC166987dD.A1G();
        BitSet A0j = AbstractC31171DnF.A0j(A1b == true ? 1 : 0);
        A1G.put("ad_partner_igid", str2);
        A1G.put("selected_tab", AbstractC31171DnF.A0V(z ? 1 : 0));
        A0j.set(0);
        A1G.put("prior_module", str);
        if (A0j.nextClearBit(0) >= A1b) {
            C66277U6x A0H = AbstractC31179DnN.A0H("com.bloks.www.ig.branded_content_ads.settings.ads_by_partner", A1G, A1G2);
            A0H.A03 = null;
            A0H.A02 = null;
            A0H.A04 = null;
            A0H.A08(A1G3);
            AbstractC31180DnO.A0A(fragmentActivity, A0C, A0H, userSession).A04();
            return;
        }
        throw AbstractC31173DnH.A0f();
    }

    public static final void A06(FragmentActivity fragmentActivity, UserSession userSession, String str, boolean z) {
        AbstractC167007dF.A1K(fragmentActivity, userSession);
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        A0C.A0R = "com.bloks.www.ig.branded_content_ads.individual_posts";
        AbstractC31171DnF.A10(fragmentActivity, A0C, 2131954168);
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap A1G2 = AbstractC166987dD.A1G();
        HashMap A0h = AbstractC31177DnL.A0h();
        A1G.put("prior_module", str);
        C66277U6x A0H = AbstractC31179DnN.A0H("com.bloks.www.ig.branded_content_ads.individual_posts", A1G, A1G2);
        A0H.A03 = null;
        A0H.A02 = null;
        A0H.A04 = null;
        A0H.A08(A0h);
        C140966Yy A0A = AbstractC31180DnO.A0A(fragmentActivity, A0C, A0H, userSession);
        if (z) {
            A0A.A0D = false;
        }
        A0A.A04();
    }

    public static final void A07(FragmentActivity fragmentActivity, UserSession userSession, String str, boolean z, boolean z2) {
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        A0C.A0R = "com.bloks.www.ig.branded_content_ads.settings";
        AbstractC31171DnF.A10(fragmentActivity, A0C, 2131969364);
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap A1G2 = AbstractC166987dD.A1G();
        HashMap A0h = AbstractC31177DnL.A0h();
        A1G.put("prior_module", str);
        C66277U6x A0H = AbstractC31179DnN.A0H("com.bloks.www.ig.branded_content_ads.settings", A1G, A1G2);
        A0H.A03 = null;
        A0H.A02 = null;
        A0H.A04 = null;
        A0H.A08(A0h);
        C140966Yy A0A = AbstractC31180DnO.A0A(fragmentActivity, A0C, A0H, userSession);
        if (z2) {
            A0A.A0F = true;
        }
        if (z) {
            A0A.A0D = false;
        }
        A0A.A04();
    }

    public static final void A03(FragmentActivity fragmentActivity, UserSession userSession, String str, int i) {
        String str2 = ((String[]) AbstractC31178DnM.A1b(str, "_"))[0];
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        A0C.A0R = "com.bloks.www.ig.branded_content_ads.ad_details";
        AbstractC31171DnF.A10(fragmentActivity, A0C, 2131953783);
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap A1G2 = AbstractC166987dD.A1G();
        HashMap A0h = AbstractC31177DnL.A0h();
        A1G.put("media_igid", str2);
        A1G.put("prior_module", "bc_inbox");
        A1G.put("notification_type", AbstractC31171DnF.A0V(i));
        C66277U6x A0H = AbstractC31179DnN.A0H("com.bloks.www.ig.branded_content_ads.ad_details", A1G, A1G2);
        A0H.A03 = null;
        A0H.A02 = null;
        A0H.A04 = null;
        A0H.A08(A0h);
        AbstractC31180DnO.A0A(fragmentActivity, A0C, A0H, userSession).A04();
    }
}
