package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.55j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1123255j {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.55k, java.lang.Object] */
    public static C1123355k parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("font_size".equals(A0q)) {
                    obj.A02 = (float) c16l.A0U();
                } else if ("scale".equals(A0q)) {
                    obj.A05 = (float) c16l.A0U();
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    obj.A06 = (float) c16l.A0U();
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    obj.A03 = (float) c16l.A0U();
                } else if ("x".equals(A0q)) {
                    obj.A00 = (float) c16l.A0U();
                } else if ("y".equals(A0q)) {
                    obj.A01 = (float) c16l.A0U();
                } else if ("rotation".equals(A0q)) {
                    obj.A04 = (float) c16l.A0U();
                } else {
                    String str = null;
                    String str2 = null;
                    ArrayList arrayList = null;
                    ArrayList arrayList2 = null;
                    String str3 = null;
                    String str4 = null;
                    if ("format_type".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        obj.A09 = str2;
                    } else if ("effects".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                    arrayList.add(A1P2);
                                }
                            }
                        }
                        obj.A0C = arrayList;
                    } else if ("colors".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList2 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                    arrayList2.add(A1P);
                                }
                            }
                        }
                        obj.A0B = arrayList2;
                    } else if ("alignment".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str3 = c16l.A1P();
                        }
                        obj.A07 = str3;
                    } else if ("animation".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str4 = c16l.A1P();
                        }
                        obj.A08 = str4;
                    } else if ("graphic_effect".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        obj.A0A = str;
                    }
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C1123355k c1123355k) {
        anonymousClass182.A0d();
        anonymousClass182.A0P("font_size", c1123355k.A02);
        anonymousClass182.A0P("scale", c1123355k.A05);
        anonymousClass182.A0P(IgReactMediaPickerNativeModule.WIDTH, c1123355k.A06);
        anonymousClass182.A0P(IgReactMediaPickerNativeModule.HEIGHT, c1123355k.A03);
        anonymousClass182.A0P("x", c1123355k.A00);
        anonymousClass182.A0P("y", c1123355k.A01);
        anonymousClass182.A0P("rotation", c1123355k.A04);
        String str = c1123355k.A09;
        if (str != null) {
            anonymousClass182.A0S("format_type", str);
        }
        if (c1123355k.A0C != null) {
            C16V.A03(anonymousClass182, "effects");
            for (String str2 : c1123355k.A0C) {
                if (str2 != null) {
                    anonymousClass182.A0u(str2);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c1123355k.A0B != null) {
            C16V.A03(anonymousClass182, "colors");
            for (String str3 : c1123355k.A0B) {
                if (str3 != null) {
                    anonymousClass182.A0u(str3);
                }
            }
            anonymousClass182.A0Z();
        }
        String str4 = c1123355k.A07;
        if (str4 != null) {
            anonymousClass182.A0S("alignment", str4);
        }
        String str5 = c1123355k.A08;
        if (str5 != null) {
            anonymousClass182.A0S("animation", str5);
        }
        String str6 = c1123355k.A0A;
        if (str6 != null) {
            anonymousClass182.A0S("graphic_effect", str6);
        }
        anonymousClass182.A0a();
    }
}
