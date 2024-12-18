package X;

import java.io.IOException;
import java.util.List;

/* renamed from: X.44D, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C44D {
    public static C44H parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            C44F c44f = null;
            String str2 = null;
            String str3 = null;
            Boolean bool2 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("can_viewer_donate".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("currency".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("donation_amount_config".equals(A0q)) {
                    c44f = C44E.parseFromJson(c16l);
                } else if ("donation_disabled_message".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("donation_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("has_viewer_donated".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("privacy_disclaimer".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("profile_fundraiser_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("you_donated_message".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C44H(c44f, bool, bool2, str, str2, str3, str4, str5, str6);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C44H c44h) {
        anonymousClass182.A0d();
        Boolean bool = c44h.A01;
        if (bool != null) {
            anonymousClass182.A0T("can_viewer_donate", bool.booleanValue());
        }
        String str = c44h.A03;
        if (str != null) {
            anonymousClass182.A0S("currency", str);
        }
        C44G c44g = c44h.A00;
        if (c44g != null) {
            anonymousClass182.A0r("donation_amount_config");
            C44F F57 = c44g.F57();
            anonymousClass182.A0d();
            Integer num = F57.A00;
            if (num != null) {
                anonymousClass182.A0Q("default_selected_donation_value", num.intValue());
            }
            List<Number> list = F57.A05;
            if (list != null) {
                C16V.A03(anonymousClass182, "donation_amount_selector_values");
                for (Number number : list) {
                    if (number != null) {
                        anonymousClass182.A0h(number.intValue());
                    }
                }
                anonymousClass182.A0Z();
            }
            Integer num2 = F57.A01;
            if (num2 != null) {
                anonymousClass182.A0Q("maximum_donation_amount", num2.intValue());
            }
            Integer num3 = F57.A02;
            if (num3 != null) {
                anonymousClass182.A0Q("minimum_donation_amount", num3.intValue());
            }
            Integer num4 = F57.A03;
            if (num4 != null) {
                anonymousClass182.A0Q("prefill_amount", num4.intValue());
            }
            String str2 = F57.A04;
            if (str2 != null) {
                anonymousClass182.A0S("user_currency", str2);
            }
            anonymousClass182.A0a();
        }
        String str3 = c44h.A04;
        if (str3 != null) {
            anonymousClass182.A0S("donation_disabled_message", str3);
        }
        String str4 = c44h.A05;
        if (str4 != null) {
            anonymousClass182.A0S("donation_url", str4);
        }
        Boolean bool2 = c44h.A02;
        if (bool2 != null) {
            anonymousClass182.A0T("has_viewer_donated", bool2.booleanValue());
        }
        String str5 = c44h.A06;
        if (str5 != null) {
            anonymousClass182.A0S("privacy_disclaimer", str5);
        }
        String str6 = c44h.A07;
        if (str6 != null) {
            anonymousClass182.A0S("profile_fundraiser_id", str6);
        }
        String str7 = c44h.A08;
        if (str7 != null) {
            anonymousClass182.A0S("you_donated_message", str7);
        }
        anonymousClass182.A0a();
    }
}
