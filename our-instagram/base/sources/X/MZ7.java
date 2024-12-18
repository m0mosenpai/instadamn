package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.keyword.Keyword;
import java.io.IOException;

/* loaded from: classes9.dex */
public abstract class MZ7 {
    public static Keyword parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Keyword keyword = new Keyword();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    keyword.A03 = str;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    C14360o3.A0B(str, 0);
                    keyword.A04 = str;
                } else if ("media_count".equals(A0q)) {
                    keyword.A00 = c16l.A0y();
                } else if ("profile_pic_url".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    keyword.A05 = str;
                } else if ("search_result_subtitle".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    keyword.A06 = str;
                } else if ("header_title".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    keyword.A02 = str;
                } else if ("score".equals(A0q)) {
                    keyword.A01 = Double.valueOf(c16l.A0U());
                } else if ("is_popular".equals(A0q)) {
                    keyword.A0A = c16l.A0d();
                } else if ("subtitle".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    keyword.A08 = str;
                } else if ("style".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    keyword.A07 = str;
                } else if ("is_echo".equals(A0q)) {
                    keyword.A09 = c16l.A0d();
                }
                c16l.A0z();
            }
            return keyword;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, Keyword keyword) {
        anonymousClass182.A0d();
        String str = keyword.A03;
        if (str != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        String str2 = keyword.A04;
        if (str2 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str2);
        }
        anonymousClass182.A0R("media_count", keyword.A00);
        String str3 = keyword.A05;
        if (str3 != null) {
            anonymousClass182.A0S("profile_pic_url", str3);
        }
        String str4 = keyword.A06;
        if (str4 != null) {
            anonymousClass182.A0S("search_result_subtitle", str4);
        }
        String str5 = keyword.A02;
        if (str5 != null) {
            anonymousClass182.A0S("header_title", str5);
        }
        Double d = keyword.A01;
        if (d != null) {
            anonymousClass182.A0O("score", d.doubleValue());
        }
        anonymousClass182.A0T("is_popular", keyword.A0A);
        String str6 = keyword.A08;
        if (str6 != null) {
            anonymousClass182.A0S("subtitle", str6);
        }
        String str7 = keyword.A07;
        if (str7 != null) {
            anonymousClass182.A0S("style", str7);
        }
        anonymousClass182.A0T("is_echo", keyword.A09);
        anonymousClass182.A0a();
    }
}
