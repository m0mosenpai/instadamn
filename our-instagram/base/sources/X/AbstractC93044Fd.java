package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ClipsTextAlignment;
import com.instagram.api.schemas.ClipsTextEmphasisMode;
import com.instagram.api.schemas.ClipsTextFormatType;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Fd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC93044Fd {
    public static C93094Fl parseFromJson(C16L c16l) {
        C0KX c0kx;
        String str;
        String A1P;
        String A1P2;
        String A1P3;
        C14360o3.A0B(c16l, 0);
        try {
            Float f = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Float f2 = null;
            ClipsTextAlignment clipsTextAlignment = null;
            ArrayList arrayList = null;
            Float f3 = null;
            String str2 = null;
            Integer num = null;
            Float f4 = null;
            Float f5 = null;
            Float f6 = null;
            Float f7 = null;
            Float f8 = null;
            String str3 = null;
            ClipsTextEmphasisMode clipsTextEmphasisMode = null;
            ClipsTextFormatType clipsTextFormatType = null;
            Float f9 = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("alignment".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P3 = null;
                    } else {
                        A1P3 = c16l.A1P();
                    }
                    ClipsTextAlignment clipsTextAlignment2 = (ClipsTextAlignment) ClipsTextAlignment.A01.get(A1P3);
                    clipsTextAlignment = clipsTextAlignment2;
                    if (clipsTextAlignment2 == null) {
                        clipsTextAlignment = ClipsTextAlignment.A07;
                    }
                } else if ("colors".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C93064Fg parseFromJson = AbstractC93054Ff.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("end_time_ms".equals(A0q)) {
                    f = Float.valueOf((float) c16l.A0U());
                } else if ("font_size".equals(A0q)) {
                    f2 = Float.valueOf((float) c16l.A0U());
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    f3 = Float.valueOf((float) c16l.A0U());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("is_animated".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("offset_x".equals(A0q)) {
                    f4 = Float.valueOf((float) c16l.A0U());
                } else if ("offset_y".equals(A0q)) {
                    f5 = Float.valueOf((float) c16l.A0U());
                } else if ("rotation_degree".equals(A0q)) {
                    f6 = Float.valueOf((float) c16l.A0U());
                } else if ("scale".equals(A0q)) {
                    f7 = Float.valueOf((float) c16l.A0U());
                } else if ("start_time_ms".equals(A0q)) {
                    f8 = Float.valueOf((float) c16l.A0U());
                } else if ("text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("text_emphasis_mode".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    ClipsTextEmphasisMode clipsTextEmphasisMode2 = (ClipsTextEmphasisMode) ClipsTextEmphasisMode.A01.get(A1P2);
                    clipsTextEmphasisMode = clipsTextEmphasisMode2;
                    if (clipsTextEmphasisMode2 == null) {
                        clipsTextEmphasisMode = ClipsTextEmphasisMode.A0A;
                    }
                } else if ("text_format_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    clipsTextFormatType = AbstractC93084Fj.A00(A1P);
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    f9 = Float.valueOf((float) c16l.A0U());
                } else if ("z_index".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            if (clipsTextAlignment == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("alignment", "ClipsTextInfo");
            } else if (arrayList != null || !(c16l instanceof C07950bF)) {
                if (f == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("end_time_ms", "ClipsTextInfo");
                } else if (f2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("font_size", "ClipsTextInfo");
                } else if (f3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(IgReactMediaPickerNativeModule.HEIGHT, "ClipsTextInfo");
                } else if (str2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "ClipsTextInfo");
                } else if (num == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("is_animated", "ClipsTextInfo");
                } else if (f4 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("offset_x", "ClipsTextInfo");
                } else if (f5 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("offset_y", "ClipsTextInfo");
                } else if (f6 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("rotation_degree", "ClipsTextInfo");
                } else if (f7 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("scale", "ClipsTextInfo");
                } else if (f8 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("start_time_ms", "ClipsTextInfo");
                } else {
                    if (str3 == null && (c16l instanceof C07950bF)) {
                        c0kx = ((C07950bF) c16l).A03;
                        str = "text";
                    } else if (clipsTextEmphasisMode != null || !(c16l instanceof C07950bF)) {
                        if (clipsTextFormatType == null && (c16l instanceof C07950bF)) {
                            c0kx = ((C07950bF) c16l).A03;
                            str = "text_format_type";
                        } else if (f9 == null && (c16l instanceof C07950bF)) {
                            c0kx = ((C07950bF) c16l).A03;
                            str = IgReactMediaPickerNativeModule.WIDTH;
                        } else if (num2 == null && (c16l instanceof C07950bF)) {
                            c0kx = ((C07950bF) c16l).A03;
                            str = "z_index";
                        } else {
                            return new C93094Fl(clipsTextAlignment, clipsTextEmphasisMode, clipsTextFormatType, str2, str3, arrayList, f.floatValue(), f2.floatValue(), f3.floatValue(), f4.floatValue(), f5.floatValue(), f6.floatValue(), f7.floatValue(), f8.floatValue(), f9.floatValue(), num.intValue(), num2.intValue());
                        }
                    } else {
                        c0kx = ((C07950bF) c16l).A03;
                        str = "text_emphasis_mode";
                    }
                    c0kx.A00(str, "ClipsTextInfo");
                }
            } else {
                ((C07950bF) c16l).A03.A00("colors", "ClipsTextInfo");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C93094Fl c93094Fl) {
        anonymousClass182.A0d();
        ClipsTextAlignment clipsTextAlignment = c93094Fl.A0B;
        if (clipsTextAlignment != null) {
            anonymousClass182.A0S("alignment", clipsTextAlignment.A00);
        }
        List<C93064Fg> list = c93094Fl.A0G;
        if (list != null) {
            C16V.A03(anonymousClass182, "colors");
            for (C93064Fg c93064Fg : list) {
                if (c93064Fg != null) {
                    anonymousClass182.A0d();
                    anonymousClass182.A0Q("count", c93064Fg.A00);
                    String str = c93064Fg.A01;
                    if (str != null) {
                        anonymousClass182.A0S("hex_rgba_color", str);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0P("end_time_ms", c93094Fl.A00);
        anonymousClass182.A0P("font_size", c93094Fl.A01);
        anonymousClass182.A0P(IgReactMediaPickerNativeModule.HEIGHT, c93094Fl.A02);
        String str2 = c93094Fl.A0E;
        if (str2 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
        }
        anonymousClass182.A0Q("is_animated", c93094Fl.A09);
        anonymousClass182.A0P("offset_x", c93094Fl.A03);
        anonymousClass182.A0P("offset_y", c93094Fl.A04);
        anonymousClass182.A0P("rotation_degree", c93094Fl.A05);
        anonymousClass182.A0P("scale", c93094Fl.A06);
        anonymousClass182.A0P("start_time_ms", c93094Fl.A07);
        String str3 = c93094Fl.A0F;
        if (str3 != null) {
            anonymousClass182.A0S("text", str3);
        }
        ClipsTextEmphasisMode clipsTextEmphasisMode = c93094Fl.A0C;
        if (clipsTextEmphasisMode != null) {
            anonymousClass182.A0S("text_emphasis_mode", clipsTextEmphasisMode.A00);
        }
        ClipsTextFormatType clipsTextFormatType = c93094Fl.A0D;
        if (clipsTextFormatType != null) {
            anonymousClass182.A0S("text_format_type", clipsTextFormatType.A00);
        }
        anonymousClass182.A0P(IgReactMediaPickerNativeModule.WIDTH, c93094Fl.A08);
        anonymousClass182.A0Q("z_index", c93094Fl.A0A);
        anonymousClass182.A0a();
    }
}
