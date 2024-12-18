package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.Vwf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69854Vwf {
    public static C109854xD parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            Integer num2 = null;
            Boolean bool = null;
            String str2 = null;
            C109874xF c109874xF = null;
            Boolean bool2 = null;
            String str3 = null;
            URQ urq = null;
            String str4 = null;
            URQ urq2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("action".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("action_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("button_type".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("has_chevron".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC111324zv.A00(975).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ICON.equals(A0s)) {
                    c109874xF = AbstractC69868Vwt.parseFromJson(c16l);
                } else if ("is_text_centered".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("secondary_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("secondary_text_color".equals(A0s)) {
                    urq = VPC.parseFromJson(c16l);
                } else if ("text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("text_color".equals(A0s)) {
                    urq2 = VPC.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C109854xD(c109874xF, urq, urq2, bool, bool2, num, num2, str, str2, str3, str4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C109854xD c109854xD) {
        anonymousClass182.A0d();
        Integer num = c109854xD.A05;
        if (num != null) {
            anonymousClass182.A0Q("action", num.intValue());
        }
        String str = c109854xD.A07;
        if (str != null) {
            anonymousClass182.A0S("action_url", str);
        }
        Integer num2 = c109854xD.A06;
        if (num2 != null) {
            anonymousClass182.A0Q("button_type", num2.intValue());
        }
        Boolean bool = c109854xD.A03;
        if (bool != null) {
            anonymousClass182.A0T("has_chevron", bool.booleanValue());
        }
        String str2 = c109854xD.A08;
        if (str2 != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(975), str2);
        }
        C109874xF c109874xF = c109854xD.A00;
        if (c109874xF != null) {
            anonymousClass182.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
            AbstractC69868Vwt.A00(anonymousClass182, c109874xF);
        }
        Boolean bool2 = c109854xD.A04;
        if (bool2 != null) {
            anonymousClass182.A0T("is_text_centered", bool2.booleanValue());
        }
        String str3 = c109854xD.A09;
        if (str3 != null) {
            anonymousClass182.A0S("secondary_text", str3);
        }
        InterfaceC31126Dm9 interfaceC31126Dm9 = c109854xD.A01;
        if (interfaceC31126Dm9 != null) {
            anonymousClass182.A0r("secondary_text_color");
            URQ F35 = interfaceC31126Dm9.F35();
            anonymousClass182.A0d();
            String str4 = F35.A00;
            if (str4 != null) {
                anonymousClass182.A0S("dark", str4);
            }
            String str5 = F35.A01;
            if (str5 != null) {
                anonymousClass182.A0S("light", str5);
            }
            anonymousClass182.A0a();
        }
        AbstractC37301Gc2.A1E(anonymousClass182, c109854xD.A0A);
        InterfaceC31126Dm9 interfaceC31126Dm92 = c109854xD.A02;
        if (interfaceC31126Dm92 != null) {
            anonymousClass182.A0r("text_color");
            URQ F352 = interfaceC31126Dm92.F35();
            anonymousClass182.A0d();
            String str6 = F352.A00;
            if (str6 != null) {
                anonymousClass182.A0S("dark", str6);
            }
            String str7 = F352.A01;
            if (str7 != null) {
                anonymousClass182.A0S("light", str7);
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
