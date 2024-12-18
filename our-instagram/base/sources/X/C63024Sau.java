package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Sau, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63024Sau {
    public final C62620SJd A00;
    public final C43031yW A01;

    public final void A02(Bundle bundle, C26061Bfo c26061Bfo, Integer num, String str) {
        String str2;
        C14360o3.A0B(num, 1);
        switch (num.intValue()) {
            case 0:
                str2 = "CONTACT_AUTOFILL";
                break;
            case 1:
                str2 = "PAYMENT_AUTOFILL";
                break;
            default:
                str2 = "CONTACT_AND_PAYMENT_AUTOFILL";
                break;
        }
        A00(bundle, this, c26061Bfo, str, str2);
    }

    public final void A03(Bundle bundle, Integer num, String str, String str2) {
        String str3;
        String A0R = AnonymousClass001.A0R("BLOKS_REQUEST_PROMPT_", str);
        if (num.intValue() != 0) {
            str3 = "PAYMENT_AUTOFILL";
        } else {
            str3 = "CONTACT_AUTOFILL";
        }
        A00(bundle, this, new C26061Bfo((Integer) null, (Integer) 0, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (Map) AbstractC25233BEq.A0p("prompt_session_id", str2, AbstractC166987dD.A1L("is_bloks_screen", "true")), 512, false), A0R, str3);
    }

    public final void A04(Bundle bundle, String str, String str2, String str3, String str4, Map map, Map map2, java.util.Set set, boolean z) {
        C14360o3.A0B(map, 3);
        AbstractC167017dG.A1U(set, str4);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        A1I.putAll(AbstractC06930Yk.A06(AbstractC166987dD.A1L("is_bloks_screen", "true"), AbstractC166987dD.A1L("prompt_session_id", str4), AbstractC166987dD.A1L("prompt_type", str2), AbstractC166987dD.A1L("fields_rendered_in_bottomsheet", AbstractC001800i.A0P(", ", "", "", AbstractC001800i.A0Z(map.keySet()), null)), AbstractC166987dD.A1L("has_cached_screen", String.valueOf(!set.isEmpty())), AbstractC166987dD.A1L("cache_layers", AnonymousClass001.A0E(AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", set, null), '[', ']'))));
        A1I.putAll(map2);
        A00(bundle, this, new C26061Bfo((Integer) null, (Integer) 0, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (Map) A1I, 512, z), str, str3);
    }

    public final void A05(Bundle bundle, String str, Map map) {
        A00(bundle, this, new C26061Bfo((Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, map, 1022, false), str, "PAYMENT_AUTOFILL");
    }

    public final void A06(String str, Bundle bundle) {
        A00(bundle, this, new C26061Bfo((Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (Map) null, 1022, false), str, "PAYMENT_AUTOFILL");
    }

    public C63024Sau(C62620SJd c62620SJd, C43031yW c43031yW) {
        this.A00 = c62620SJd;
        this.A01 = c43031yW;
    }

    public static final void A00(Bundle bundle, C63024Sau c63024Sau, C26061Bfo c26061Bfo, String str, String str2) {
        C63305ShB A00 = C63305ShB.A00();
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        C09530e4 A1L = AbstractC166987dD.A1L("used_logger_v2", "true");
        boolean z = false;
        C62620SJd c62620SJd = c63024Sau.A00;
        C14360o3.A0B(c62620SJd, 0);
        A1I.putAll(AbstractC25233BEq.A0p("family_device_id", SYL.A00(c62620SJd.A0Q), A1L));
        Map map = (Map) c26061Bfo.A01;
        if (map != null) {
            A1I.putAll(map);
        }
        C09530e4 A1L2 = AbstractC166987dD.A1L("action", "BrowserLiteIntent.IAB_AUTOFILL_INTERACTION");
        C09530e4 A1L3 = AbstractC166987dD.A1L("user_action", str);
        C09530e4 A1L4 = AbstractC166987dD.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
        C09530e4 A1L5 = AbstractC166987dD.A1L("payment_credential_ids", c26061Bfo.A06);
        C09530e4 A1L6 = AbstractC166987dD.A1L("with_ads_disclosure", String.valueOf(c26061Bfo.A0A));
        C09530e4 A1L7 = AbstractC166987dD.A1L("form_completion_duration", String.valueOf(c26061Bfo.A02));
        C09530e4 A1L8 = AbstractC166987dD.A1L("event_times", String.valueOf(c26061Bfo.A05));
        C09530e4 A1L9 = AbstractC166987dD.A1L("time_spend", String.valueOf(c26061Bfo.A04));
        C09530e4 A1L10 = AbstractC166987dD.A1L("index", String.valueOf(c26061Bfo.A03));
        C09530e4 A1L11 = AbstractC166987dD.A1L("enhanced_regex_new_fields_metadata", AbstractC31175DnJ.A0d(A1I));
        MUG mug = c62620SJd.A0K;
        Object obj = mug.A00;
        EnumC61149RgA enumC61149RgA = EnumC61149RgA.A04;
        if (obj == enumC61149RgA) {
            z = true;
        }
        C09530e4 A1L12 = AbstractC166987dD.A1L("is_payment_opt_in", String.valueOf(z));
        C09530e4 A1L13 = AbstractC166987dD.A1L("is_contact_opt_in", String.valueOf(AbstractC167007dF.A1X(mug.A03, enumC61149RgA)));
        QIh qIh = c62620SJd.A09;
        C09530e4 A1L14 = AbstractC166987dD.A1L("ad_id", qIh.A04);
        String str3 = qIh.A05;
        C09530e4 A1L15 = AbstractC166987dD.A1L("BrowserLiteIntent.IABLoggingExtras.IAB_SESSION_ID", str3);
        C09530e4 A1L16 = AbstractC166987dD.A1L("iab_session_id", str3);
        QIl qIl = c62620SJd.A00;
        A00.A07(bundle, AbstractC06930Yk.A06(A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, A1L9, A1L10, A1L11, A1L12, A1L13, A1L14, A1L15, A1L16, AbstractC166987dD.A1L("selected_field_tag", qIl.A00), AbstractC166987dD.A1L("current_url", qIh.A01), AbstractC166987dD.A1L("form_session_id", c62620SJd.A06.A05), AbstractC166987dD.A1L("experiments", AbstractC31175DnJ.A0d(AbstractC63231Sfj.A00(c62620SJd, c63024Sau.A01))), AbstractC166987dD.A1L("user_credentials_status", AbstractC58321PtD.A0u(c62620SJd.A0E)), AbstractC166987dD.A1L("has_helium", String.valueOf(AbstractC167007dF.A1W(AbstractC83633o6.A01))), AbstractC166987dD.A1L("all_fields", AbstractC61723Rse.A00(qIl.A03)), AbstractC166987dD.A1L("origin_host", c26061Bfo.A09)));
    }

    public final void A01(Bundle bundle, C26061Bfo c26061Bfo, Integer num, String str) {
        String str2;
        AbstractC167017dG.A1N(str, num);
        switch (num.intValue()) {
            case 0:
                str2 = "CONTACT_AUTOFILL";
                break;
            case 1:
                str2 = "PAYMENT_AUTOFILL";
                break;
            case 2:
            case 3:
            default:
                str2 = "CONTACT_AND_PAYMENT_AUTOFILL";
                break;
            case 4:
                str2 = "SYSTEM_AUTOFILL";
                break;
            case 5:
                str2 = "LOGIN_AUTOFILL";
                break;
        }
        A00(bundle, this, c26061Bfo, str, str2);
    }
}
