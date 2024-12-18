package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.4G0, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4G0 {
    public static C9CP parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C9CP c9cp = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            C51755Mte c51755Mte = null;
            String str4 = null;
            String str5 = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("cta_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("action_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("platform_token".equals(A0q)) {
                    c51755Mte = F40.parseFromJson(c16l);
                } else if ("platform_xmd".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("xma_action".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("icon_type".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str != null) {
                c9cp = new C9CP(str);
                if (str2 != null) {
                    c9cp.A05 = str2;
                }
                if (str3 != null) {
                    c9cp.A02 = str3;
                }
                if (c51755Mte != null) {
                    c9cp.A01 = c51755Mte;
                }
                if (str4 != null) {
                    c9cp.A03 = str4;
                }
                if (str5 != null) {
                    c9cp.A06 = str5;
                }
                if (num != null) {
                    c9cp.A00 = num;
                }
            }
            return c9cp;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(C9CP c9cp, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        String str = c9cp.A05;
        if (str != null) {
            anonymousClass182.A0S("cta_type", str);
        }
        String str2 = c9cp.A02;
        if (str2 != null) {
            anonymousClass182.A0S("action_url", str2);
        }
        if (c9cp.A01 != null) {
            anonymousClass182.A0r("platform_token");
            C51755Mte c51755Mte = (C51755Mte) c9cp.A01;
            anonymousClass182.A0d();
            C31200Dnj c31200Dnj = (C31200Dnj) c51755Mte.A00;
            if (c31200Dnj != null) {
                anonymousClass182.A0r("postback");
                anonymousClass182.A0d();
                String str3 = c31200Dnj.A00;
                if (str3 != null) {
                    anonymousClass182.A0S("postback_payload", str3);
                }
                anonymousClass182.A0a();
            }
            anonymousClass182.A0a();
        }
        String str4 = c9cp.A03;
        if (str4 != null) {
            anonymousClass182.A0S("platform_xmd", str4);
        }
        String str5 = c9cp.A06;
        if (str5 != null) {
            anonymousClass182.A0S("xma_action", str5);
        }
        Number number = (Number) c9cp.A00;
        if (number != null) {
            anonymousClass182.A0Q("icon_type", number.intValue());
        }
        String str6 = c9cp.A04;
        if (str6 != null) {
            anonymousClass182.A0S(DialogModule.KEY_TITLE, str6);
        }
        anonymousClass182.A0a();
    }
}
