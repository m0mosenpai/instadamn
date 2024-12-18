package X;

import com.instagram.api.schemas.OnImpressionStyle;
import java.io.IOException;

/* renamed from: X.51J, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C51J {
    public static C51L parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            OnImpressionStyle onImpressionStyle = null;
            String str14 = null;
            String str15 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("dismiss_icon".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("negative_confirmation_body".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("negative_confirmation_cta_text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("negative_confirmation_icon".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("negative_confirmation_title".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("negative_icon".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("negative_text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("positive_confirmation_body".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("positive_confirmation_cta_text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if ("positive_confirmation_icon".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str10 = null;
                    } else {
                        str10 = c16l.A1P();
                    }
                } else if ("positive_confirmation_title".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str11 = null;
                    } else {
                        str11 = c16l.A1P();
                    }
                } else if ("positive_icon".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str12 = null;
                    } else {
                        str12 = c16l.A1P();
                    }
                } else if ("positive_text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str13 = null;
                    } else {
                        str13 = c16l.A1P();
                    }
                } else if ("style".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    onImpressionStyle = (OnImpressionStyle) OnImpressionStyle.A01.get(A1P);
                    if (onImpressionStyle == null) {
                        onImpressionStyle = OnImpressionStyle.A0D;
                    }
                } else if ("subtext".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str14 = null;
                    } else {
                        str14 = c16l.A1P();
                    }
                } else if ("text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str15 = null;
                    } else {
                        str15 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C51L(onImpressionStyle, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C51L c51l) {
        anonymousClass182.A0d();
        String str = c51l.A01;
        if (str != null) {
            anonymousClass182.A0S("dismiss_icon", str);
        }
        String str2 = c51l.A02;
        if (str2 != null) {
            anonymousClass182.A0S("negative_confirmation_body", str2);
        }
        String str3 = c51l.A03;
        if (str3 != null) {
            anonymousClass182.A0S("negative_confirmation_cta_text", str3);
        }
        String str4 = c51l.A04;
        if (str4 != null) {
            anonymousClass182.A0S("negative_confirmation_icon", str4);
        }
        String str5 = c51l.A05;
        if (str5 != null) {
            anonymousClass182.A0S("negative_confirmation_title", str5);
        }
        String str6 = c51l.A06;
        if (str6 != null) {
            anonymousClass182.A0S("negative_icon", str6);
        }
        String str7 = c51l.A07;
        if (str7 != null) {
            anonymousClass182.A0S("negative_text", str7);
        }
        String str8 = c51l.A08;
        if (str8 != null) {
            anonymousClass182.A0S("positive_confirmation_body", str8);
        }
        String str9 = c51l.A09;
        if (str9 != null) {
            anonymousClass182.A0S("positive_confirmation_cta_text", str9);
        }
        String str10 = c51l.A0A;
        if (str10 != null) {
            anonymousClass182.A0S("positive_confirmation_icon", str10);
        }
        String str11 = c51l.A0B;
        if (str11 != null) {
            anonymousClass182.A0S("positive_confirmation_title", str11);
        }
        String str12 = c51l.A0C;
        if (str12 != null) {
            anonymousClass182.A0S("positive_icon", str12);
        }
        String str13 = c51l.A0D;
        if (str13 != null) {
            anonymousClass182.A0S("positive_text", str13);
        }
        OnImpressionStyle onImpressionStyle = c51l.A00;
        if (onImpressionStyle != null) {
            anonymousClass182.A0S("style", onImpressionStyle.A00);
        }
        String str14 = c51l.A0E;
        if (str14 != null) {
            anonymousClass182.A0S("subtext", str14);
        }
        String str15 = c51l.A0F;
        if (str15 != null) {
            anonymousClass182.A0S("text", str15);
        }
        anonymousClass182.A0a();
    }
}
