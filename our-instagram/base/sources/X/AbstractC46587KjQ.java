package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.KjQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46587KjQ {
    public static C45055Jwk parseFromJson(C16L c16l) {
        C26068Bfw c26068Bfw;
        C26068Bfw c26068Bfw2;
        C14360o3.A0B(c16l, 0);
        try {
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            Integer num = null;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            String str = null;
            String str2 = null;
            HashMap hashMap = null;
            HashMap hashMap2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J == c16r2) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("accessibility_description".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("gif_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("gift_animation".equals(A0s)) {
                    if (c16l.A11() == c16r) {
                        hashMap = AbstractC166987dD.A1G();
                        while (c16l.A1J() != c16r2) {
                            String A1P = c16l.A1P();
                            c16l.A1J();
                            if (c16l.A11() == C16R.A0G) {
                                c26068Bfw2 = null;
                            } else {
                                c26068Bfw2 = AbstractC46586KjP.parseFromJson(c16l);
                                if (c26068Bfw2 != null) {
                                }
                            }
                            hashMap.put(A1P, c26068Bfw2);
                        }
                    } else {
                        hashMap = null;
                    }
                } else if ("gift_image".equals(A0s)) {
                    if (c16l.A11() == c16r) {
                        hashMap2 = AbstractC166987dD.A1G();
                        while (c16l.A1J() != c16r2) {
                            String A1P2 = c16l.A1P();
                            c16l.A1J();
                            if (c16l.A11() == C16R.A0G) {
                                c26068Bfw = null;
                            } else {
                                c26068Bfw = AbstractC46586KjP.parseFromJson(c16l);
                                if (c26068Bfw != null) {
                                }
                            }
                            hashMap2.put(A1P2, c26068Bfw);
                        }
                    } else {
                        hashMap2 = null;
                    }
                } else if ("gift_price".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("image_url".equals(A0s)) {
                    str3 = AbstractC167017dG.A0m(c16l);
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    str4 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("accessibility_description", c16l, "ContentAppreciationGift");
            } else if (str2 != null || !(c16l instanceof C07950bF)) {
                if (num == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("gift_price", c16l, "ContentAppreciationGift");
                } else if (l == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c16l, "ContentAppreciationGift");
                } else if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("image_url", c16l, "ContentAppreciationGift");
                } else if (str4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(DialogModule.KEY_TITLE, c16l, "ContentAppreciationGift");
                } else {
                    return new C45055Jwk(str, str2, str3, str4, hashMap, hashMap2, num.intValue(), l.longValue());
                }
            } else {
                AbstractC166997dE.A1V("gif_url", c16l, "ContentAppreciationGift");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
