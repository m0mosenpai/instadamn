package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.55l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1123455l {
    public static C55m parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            C55m c55m = new C55m();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                String str2 = null;
                String str3 = null;
                ArrayList arrayList = null;
                ArrayList arrayList2 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                if ("text".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    c55m.A09 = str2;
                } else if ("is_quick_caption".equals(A0q)) {
                    c55m.A0C = c16l.A0d();
                } else if ("position_data".equals(A0q)) {
                    c55m.A01 = AbstractC1123555n.parseFromJson(c16l);
                } else if ("scale".equals(A0q)) {
                    c55m.A03 = new Float(c16l.A0U());
                } else if ("font_size".equals(A0q)) {
                    c55m.A02 = new Float(c16l.A0U());
                } else if ("format_type".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str3 = c16l.A1P();
                    }
                    c55m.A06 = str3;
                } else if ("effects".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                arrayList.add(A1P2);
                            }
                        }
                    }
                    c55m.A0B = arrayList;
                } else if ("colors".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                arrayList2.add(A1P);
                            }
                        }
                    }
                    c55m.A0A = arrayList2;
                } else if ("alignment".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str4 = c16l.A1P();
                    }
                    c55m.A04 = str4;
                } else if ("animation".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str5 = c16l.A1P();
                    }
                    c55m.A05 = str5;
                } else if ("graphic_effect".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str6 = c16l.A1P();
                    }
                    c55m.A07 = str6;
                } else if ("template_sticker_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c55m.A08 = str;
                } else if ("sticker_id".equals(A0q)) {
                    c55m.A00 = c16l.A1D();
                }
                c16l.A0z();
            }
            return c55m;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C55m c55m) {
        anonymousClass182.A0d();
        String str = c55m.A09;
        if (str != null) {
            anonymousClass182.A0S("text", str);
        }
        anonymousClass182.A0T("is_quick_caption", c55m.A0C);
        if (c55m.A01 != null) {
            anonymousClass182.A0r("position_data");
            C1123655o c1123655o = c55m.A01;
            anonymousClass182.A0d();
            Float f = c1123655o.A03;
            if (f != null) {
                anonymousClass182.A0P("x", f.floatValue());
            }
            Float f2 = c1123655o.A04;
            if (f2 != null) {
                anonymousClass182.A0P("y", f2.floatValue());
            }
            Integer num = c1123655o.A05;
            if (num != null) {
                anonymousClass182.A0Q("z", num.intValue());
            }
            Float f3 = c1123655o.A00;
            if (f3 != null) {
                anonymousClass182.A0P(IgReactMediaPickerNativeModule.HEIGHT, f3.floatValue());
            }
            Float f4 = c1123655o.A02;
            if (f4 != null) {
                anonymousClass182.A0P(IgReactMediaPickerNativeModule.WIDTH, f4.floatValue());
            }
            Float f5 = c1123655o.A01;
            if (f5 != null) {
                anonymousClass182.A0P("rotation", f5.floatValue());
            }
            anonymousClass182.A0a();
        }
        Float f6 = c55m.A03;
        if (f6 != null) {
            anonymousClass182.A0P("scale", f6.floatValue());
        }
        Float f7 = c55m.A02;
        if (f7 != null) {
            anonymousClass182.A0P("font_size", f7.floatValue());
        }
        String str2 = c55m.A06;
        if (str2 != null) {
            anonymousClass182.A0S("format_type", str2);
        }
        if (c55m.A0B != null) {
            C16V.A03(anonymousClass182, "effects");
            for (String str3 : c55m.A0B) {
                if (str3 != null) {
                    anonymousClass182.A0u(str3);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c55m.A0A != null) {
            C16V.A03(anonymousClass182, "colors");
            for (String str4 : c55m.A0A) {
                if (str4 != null) {
                    anonymousClass182.A0u(str4);
                }
            }
            anonymousClass182.A0Z();
        }
        String str5 = c55m.A04;
        if (str5 != null) {
            anonymousClass182.A0S("alignment", str5);
        }
        String str6 = c55m.A05;
        if (str6 != null) {
            anonymousClass182.A0S("animation", str6);
        }
        String str7 = c55m.A07;
        if (str7 != null) {
            anonymousClass182.A0S("graphic_effect", str7);
        }
        String str8 = c55m.A08;
        if (str8 != null) {
            anonymousClass182.A0S("template_sticker_id", str8);
        }
        anonymousClass182.A0Q("sticker_id", c55m.A00);
        anonymousClass182.A0a();
    }
}
