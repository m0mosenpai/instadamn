package X;

import com.instagram.model.direct.DirectThreadKey;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class FV4 {
    public static C33891ip parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C33891ip c33891ip = new C33891ip();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c33891ip.A05 = AbstractC31172DnG.A0o(c16l);
                } else if ("prompt_type".equals(A0q)) {
                    c33891ip.A00 = c16l.A1D();
                } else if ("prompt_text".equals(A0q)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c33891ip.A09 = A0m;
                } else if ("button_text".equals(A0q)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c33891ip.A07 = A0m2;
                } else if ("recurring_cadence".equals(A0q)) {
                    c33891ip.A01 = c16l.A1D();
                } else if ("optimistic_countdown_timestamp_ms".equals(A0q)) {
                    c33891ip.A06 = AbstractC31173DnH.A0h(c16l);
                } else if ("optimistic_admin_text".equals(A0q)) {
                    c33891ip.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("timezone".equals(A0q)) {
                    c33891ip.A0A = AbstractC167017dG.A0m(c16l);
                } else if ("thread_subtype".equals(A0q)) {
                    c33891ip.A03 = c16l.A1D();
                } else if ("thread_audience".equals(A0q)) {
                    c33891ip.A02 = c16l.A1D();
                } else if ("trending_prompt_id".equals(A0q)) {
                    c33891ip.A0B = AbstractC167017dG.A0m(c16l);
                } else if ("challenge_prompt_data".equals(A0q)) {
                    c33891ip.A04 = FUQ.parseFromJson(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c33891ip, A0q);
                }
                c16l.A0z();
            }
            return c33891ip;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C33891ip c33891ip) {
        String str;
        anonymousClass182.A0d();
        if (c33891ip.A05 != null) {
            anonymousClass182.A0r("thread_key");
            DirectThreadKey directThreadKey = c33891ip.A05;
            if (directThreadKey != null) {
                AbstractC83623o5.A00(anonymousClass182, directThreadKey);
                anonymousClass182.A0Q("prompt_type", c33891ip.A00);
                c33891ip.A07();
                anonymousClass182.A0S("prompt_text", c33891ip.A07());
                String str2 = c33891ip.A07;
                if (str2 != null) {
                    anonymousClass182.A0S("button_text", str2);
                    anonymousClass182.A0Q("recurring_cadence", c33891ip.A01);
                    Long l = c33891ip.A06;
                    if (l != null) {
                        anonymousClass182.A0R("optimistic_countdown_timestamp_ms", l.longValue());
                    }
                    String str3 = c33891ip.A08;
                    if (str3 != null) {
                        anonymousClass182.A0S("optimistic_admin_text", str3);
                    }
                    String str4 = c33891ip.A0A;
                    if (str4 != null) {
                        anonymousClass182.A0S("timezone", str4);
                    }
                    anonymousClass182.A0Q("thread_subtype", c33891ip.A03);
                    anonymousClass182.A0Q("thread_audience", c33891ip.A02);
                    String str5 = c33891ip.A0B;
                    if (str5 != null) {
                        anonymousClass182.A0S("trending_prompt_id", str5);
                    }
                    if (c33891ip.A04 != null) {
                        anonymousClass182.A0r("challenge_prompt_data");
                        FUQ.A00(c33891ip.A04, anonymousClass182);
                    }
                    AbstractC47856LCb.A00(anonymousClass182, c33891ip);
                    anonymousClass182.A0a();
                    return;
                }
                str = "buttonText";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
        str = "key";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
