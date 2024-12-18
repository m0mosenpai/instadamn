package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.JTd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43669JTd {
    public static void A00(AnonymousClass182 anonymousClass182, C1OW c1ow) {
        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c1ow.A05);
        anonymousClass182.A0R("created_at_ms", c1ow.A01);
        C14360o3.A07(Collections.unmodifiableSet(c1ow.A08));
        C16V.A03(anonymousClass182, "tags");
        java.util.Set<String> unmodifiableSet = Collections.unmodifiableSet(c1ow.A08);
        C14360o3.A07(unmodifiableSet);
        for (String str : unmodifiableSet) {
            if (str != null) {
                anonymousClass182.A0u(str);
            }
        }
        anonymousClass182.A0Z();
        String str2 = c1ow.A06;
        if (str2 != null) {
            anonymousClass182.A0S("lifecycle_state", str2);
        }
        String str3 = c1ow.A07;
        if (str3 != null) {
            anonymousClass182.A0S("send_attempt_channel", str3);
        }
        if (c1ow.A04 != null) {
            anonymousClass182.A0r("send_error");
            LCV.A00(anonymousClass182, c1ow.A04);
        }
        anonymousClass182.A0Q("send_retry_count", c1ow.A00);
        if (c1ow.A03 != null) {
            anonymousClass182.A0r("previous_send_error_for_automatic_retry");
            LCV.A00(anonymousClass182, c1ow.A03);
        }
        anonymousClass182.A0r("basic_info");
        JTa jTa = c1ow.A02;
        anonymousClass182.A0d();
        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, jTa.A03);
        anonymousClass182.A0T("is_sampled_for_e2e_logging", jTa.A09);
        anonymousClass182.A0T("is_in_shh_mode", jTa.A07);
        anonymousClass182.A0T("send_silently", jTa.A0A);
        anonymousClass182.A0T("is_moment", jTa.A08);
        anonymousClass182.A0T("hide_future_requests", jTa.A06);
        String str4 = jTa.A04;
        if (str4 != null) {
            anonymousClass182.A0S("mutation_attribution", str4);
        }
        String str5 = jTa.A05;
        if (str5 != null) {
            anonymousClass182.A0S("power_up_data", str5);
        }
        String str6 = jTa.A02;
        if (str6 != null) {
            anonymousClass182.A0S("ad_id", str6);
        }
        L1W l1w = jTa.A00;
        if (l1w != null) {
            anonymousClass182.A0r("ephemerality_params");
            anonymousClass182.A0d();
            EnumC46242KdI enumC46242KdI = l1w.A00;
            if (enumC46242KdI != null) {
                anonymousClass182.A0S("product_type", enumC46242KdI.A00);
            }
            Long l = l1w.A01;
            if (l != null) {
                anonymousClass182.A0R("ephemeral_duration_sec", l.longValue());
            }
            Long l2 = l1w.A02;
            if (l2 != null) {
                anonymousClass182.A0R("ephemeral_view_duration_sec", l2.longValue());
            }
            anonymousClass182.A0a();
        }
        Boolean bool = jTa.A01;
        if (bool != null) {
            anonymousClass182.A0T("should_xpost", bool.booleanValue());
        }
        anonymousClass182.A0a();
    }

    public static void A01(C16L c16l, C1OW c1ow, String str) {
        HashSet hashSet = null;
        if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(str)) {
            String A0m = AbstractC167017dG.A0m(c16l);
            C14360o3.A0B(A0m, 0);
            c1ow.A05 = A0m;
            return;
        }
        if ("created_at_ms".equals(str)) {
            c1ow.A01 = c16l.A0y();
            return;
        }
        if ("tags".equals(str)) {
            if (c16l.A11() == C16R.A0C) {
                hashSet = AbstractC166987dD.A1H();
                while (c16l.A1J() != C16R.A08) {
                    AbstractC167027dH.A0w(c16l, hashSet);
                }
            }
            C14360o3.A0B(hashSet, 0);
            c1ow.A08 = hashSet;
            return;
        }
        if ("lifecycle_state".equals(str)) {
            String A0m2 = AbstractC167017dG.A0m(c16l);
            C14360o3.A0B(A0m2, 0);
            c1ow.A06 = A0m2;
            return;
        }
        if ("send_attempt_channel".equals(str)) {
            String A0m3 = AbstractC167017dG.A0m(c16l);
            C14360o3.A0B(A0m3, 0);
            c1ow.A07 = A0m3;
        } else {
            if ("send_error".equals(str)) {
                c1ow.A04 = LCV.parseFromJson(c16l);
                return;
            }
            if ("send_retry_count".equals(str)) {
                c1ow.A00 = c16l.A1D();
                return;
            }
            if ("previous_send_error_for_automatic_retry".equals(str)) {
                c1ow.A03 = LCV.parseFromJson(c16l);
            } else {
                if (!"basic_info".equals(str)) {
                    return;
                }
                JTa parseFromJson = AbstractC46880KoN.parseFromJson(c16l);
                C14360o3.A0B(parseFromJson, 0);
                c1ow.A02 = parseFromJson;
            }
        }
    }
}
