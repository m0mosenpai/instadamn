package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.quickpromotion.intf.Trigger;
import java.io.IOException;

/* renamed from: X.5Rl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC117025Rl {
    public static C117035Rm parseFromJson(C16L c16l) {
        Long l;
        C14360o3.A0B(c16l, 0);
        try {
            C117035Rm c117035Rm = new C117035Rm();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("node".equals(A0q)) {
                    C117045Rn parseFromJson = AbstractC117075Rq.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c117035Rm.A02 = parseFromJson;
                } else if ("time_range".equals(A0q)) {
                    c117035Rm.A01 = AbstractC117055Ro.parseFromJson(c16l);
                } else if ("is_holdout".equals(A0q)) {
                    c117035Rm.A04 = c16l.A0d();
                } else if ("priority".equals(A0q)) {
                    c117035Rm.A00 = c16l.A1D();
                } else if ("client_ttl_seconds".equals(A0q)) {
                    if (c16l.A11() == C16R.A0I) {
                        l = Long.valueOf(c16l.A0y());
                    } else {
                        l = null;
                    }
                    c117035Rm.A03 = l;
                } else if ("log_eligibility_waterfall".equals(A0q)) {
                    c117035Rm.A05 = c16l.A0d();
                }
                c16l.A0z();
            }
            return c117035Rm;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C117035Rm c117035Rm) {
        anonymousClass182.A0d();
        anonymousClass182.A0r("node");
        C117045Rn c117045Rn = c117035Rm.A02;
        anonymousClass182.A0d();
        String str = c117045Rn.A05;
        if (str != null) {
            anonymousClass182.A0S("promotion_id", str);
        }
        String str2 = c117045Rn.A03;
        if (str2 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
        }
        String str3 = c117045Rn.A04;
        if (str3 != null) {
            anonymousClass182.A0S("logging_data", str3);
        }
        Integer num = c117045Rn.A02;
        if (num != null) {
            anonymousClass182.A0Q("max_impressions", num.intValue());
        }
        if (c117045Rn.A07 != null) {
            C16V.A03(anonymousClass182, "triggers");
            for (Trigger trigger : c117045Rn.A07) {
                if (trigger != null) {
                    anonymousClass182.A0u(trigger.A01);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0T("is_uncancelable", c117045Rn.A0B);
        if (c117045Rn.A06 != null) {
            C16V.A03(anonymousClass182, "creatives");
            for (C4NM c4nm : c117045Rn.A06) {
                if (c4nm != null) {
                    C4NR.A00(anonymousClass182, c4nm);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c117045Rn.A00 != null) {
            anonymousClass182.A0r("contextual_filters");
            C4NY.A00(anonymousClass182, c117045Rn.A00);
        }
        anonymousClass182.A0r("template");
        C4NW.A00(anonymousClass182, c117045Rn.A01);
        anonymousClass182.A0T("is_server_force_pass", c117045Rn.A0A);
        anonymousClass182.A0T("client_side_dry_run", c117045Rn.A08);
        anonymousClass182.A0T("disable_logging_to_qp_tables", c117045Rn.A09);
        anonymousClass182.A0T("bypass_surface_delay", c117045Rn.A0C);
        anonymousClass182.A0a();
        if (c117035Rm.A01 != null) {
            anonymousClass182.A0r("time_range");
            C117065Rp c117065Rp = c117035Rm.A01;
            anonymousClass182.A0d();
            Long l = c117065Rp.A01;
            if (l != null) {
                anonymousClass182.A0R("start", l.longValue());
            }
            Long l2 = c117065Rp.A00;
            if (l2 != null) {
                anonymousClass182.A0R("end", l2.longValue());
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0T("is_holdout", c117035Rm.A04);
        anonymousClass182.A0Q("priority", c117035Rm.A00);
        Long l3 = c117035Rm.A03;
        if (l3 != null) {
            anonymousClass182.A0R("client_ttl_seconds", l3.longValue());
        }
        anonymousClass182.A0T("log_eligibility_waterfall", c117035Rm.A05);
        anonymousClass182.A0a();
    }
}
