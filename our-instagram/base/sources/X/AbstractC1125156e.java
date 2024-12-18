package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.56e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1125156e {
    public static C1125256f parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C1125256f c1125256f = new C1125256f();
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0q = c16l.A0q();
                    c16l.A1J();
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    ArrayList arrayList = null;
                    ArrayList arrayList2 = null;
                    ArrayList arrayList3 = null;
                    ArrayList arrayList4 = null;
                    HashMap hashMap = null;
                    ArrayList arrayList5 = null;
                    ArrayList arrayList6 = null;
                    String str4 = null;
                    String str5 = null;
                    if ("filter_model_class".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        C14360o3.A0B(str2, 0);
                        c1125256f.A0L = str2;
                    } else if ("filter_name".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str3 = c16l.A1P();
                        }
                        C14360o3.A0B(str3, 0);
                        c1125256f.A0M = str3;
                    } else if ("texture_transform".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                arrayList.add(new Float(c16l.A0U()));
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        c1125256f.A0S = arrayList;
                    } else if ("content_transform".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList2 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                arrayList2.add(new Float(c16l.A0U()));
                            }
                        }
                        C14360o3.A0B(arrayList2, 0);
                        c1125256f.A0R = arrayList2;
                    } else if ("is_enabled".equals(A0q)) {
                        c1125256f.A0X = c16l.A0d();
                    } else if ("strength".equals(A0q)) {
                        c1125256f.A0B = (float) c16l.A0U();
                    } else if ("brightness".equals(A0q)) {
                        c1125256f.A00 = (float) c16l.A0U();
                    } else if ("contrast".equals(A0q)) {
                        c1125256f.A01 = (float) c16l.A0U();
                    } else if ("saturation".equals(A0q)) {
                        c1125256f.A07 = (float) c16l.A0U();
                    } else if ("temperature".equals(A0q)) {
                        c1125256f.A0C = (float) c16l.A0U();
                    } else if ("fade".equals(A0q)) {
                        c1125256f.A03 = (float) c16l.A0U();
                    } else if ("vignette".equals(A0q)) {
                        c1125256f.A0F = (float) c16l.A0U();
                    } else if ("highlights".equals(A0q)) {
                        c1125256f.A04 = (float) c16l.A0U();
                    } else if ("shadows".equals(A0q)) {
                        c1125256f.A08 = (float) c16l.A0U();
                    } else if ("sharpen".equals(A0q)) {
                        c1125256f.A09 = (float) c16l.A0U();
                    } else if ("tint_shadows_intensity".equals(A0q)) {
                        c1125256f.A0E = (float) c16l.A0U();
                    } else if ("tint_shadows_color".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList3 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                arrayList3.add(new Float(c16l.A0U()));
                            }
                        }
                        c1125256f.A0U = arrayList3;
                    } else if ("tint_highlights_intensity".equals(A0q)) {
                        c1125256f.A0D = (float) c16l.A0U();
                    } else if ("tint_highlights_color".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList4 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                arrayList4.add(new Float(c16l.A0U()));
                            }
                        }
                        c1125256f.A0T = arrayList4;
                    } else if ("isBlendEnabled".equals(A0q)) {
                        c1125256f.A0W = c16l.A0d();
                    } else if ("usedForLayout".equals(A0q)) {
                        c1125256f.A0Y = c16l.A0d();
                    } else if ("filter_map".equals(A0q)) {
                        if (c16l.A11() == c16r) {
                            HashMap hashMap2 = new HashMap();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    hashMap2.put(A1P, null);
                                } else {
                                    C1125256f parseFromJson = parseFromJson(c16l);
                                    if (parseFromJson != null) {
                                        hashMap2.put(A1P, parseFromJson);
                                    }
                                }
                            }
                            hashMap = hashMap2;
                        }
                        c1125256f.A0P = hashMap;
                    } else if ("top_color".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList5 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                arrayList5.add(new Float(c16l.A0U()));
                            }
                        }
                        c1125256f.A0V = arrayList5;
                    } else if ("bottom_color".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList6 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                arrayList6.add(new Float(c16l.A0U()));
                            }
                        }
                        c1125256f.A0Q = arrayList6;
                    } else if ("input_width".equals(A0q)) {
                        c1125256f.A06 = (float) c16l.A0U();
                    } else if ("input_height".equals(A0q)) {
                        c1125256f.A05 = (float) c16l.A0U();
                    } else if ("corner_radius".equals(A0q)) {
                        c1125256f.A02 = (float) c16l.A0U();
                    } else if ("split".equals(A0q)) {
                        c1125256f.A0A = (float) c16l.A0U();
                    } else if ("left_filter".equals(A0q)) {
                        c1125256f.A0I = parseFromJson(c16l);
                    } else if ("right_filter".equals(A0q)) {
                        c1125256f.A0J = parseFromJson(c16l);
                    } else if ("externalRenderKey".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str4 = c16l.A1P();
                        }
                        c1125256f.A0K = str4;
                    } else if ("transform_matrix_params".equals(A0q)) {
                        c1125256f.A0H = C55c.A00(c16l);
                    } else if ("glsl_shader_string".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str5 = c16l.A1P();
                        }
                        c1125256f.A0N = str5;
                    } else if ("json".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c1125256f.A0O = str;
                    } else if (!"typed_parameter_map".equals(A0q)) {
                        continue;
                    } else if (C14360o3.A0K(c16l.A0q(), "typed_parameter_map")) {
                        c16l.A12();
                        C44S c44s = new C44S(null);
                        Object A0C = c44s.A0C(new C60573R8o(), c16l.A1Q());
                        C14360o3.A07(A0C);
                        c16l.A12();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : ((Map) A0C).entrySet()) {
                            linkedHashMap.put(entry.getKey(), Float.valueOf((float) ((Number) entry.getValue()).doubleValue()));
                        }
                        Object A0C2 = c44s.A0C(new C60572R8n(), c16l.A1Q());
                        C14360o3.A07(A0C2);
                        c16l.A12();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry2 : ((Map) A0C2).entrySet()) {
                            linkedHashMap2.put(entry2.getKey(), AbstractC001800i.A0w((Collection) entry2.getValue()));
                        }
                        Object A0C3 = c44s.A0C(new C60574R8p(), c16l.A1Q());
                        C14360o3.A07(A0C3);
                        c16l.A12();
                        Object A0C4 = c44s.A0C(new C60571R8m(), c16l.A1Q());
                        C14360o3.A07(A0C4);
                        c16l.A12();
                        Object A0C5 = c44s.A0C(new C60575R8q(), c16l.A1Q());
                        C14360o3.A07(A0C5);
                        c16l.A12();
                        Object A0C6 = c44s.A0C(new C60575R8q(), c16l.A1Q());
                        C14360o3.A07(A0C6);
                        c16l.A12();
                        c1125256f.A0G = new TypedParameterMap(linkedHashMap, linkedHashMap2, (Map) A0C3, (Map) A0C4, (Map) A0C5, (Map) A0C6, new LinkedHashMap());
                    } else {
                        throw new IOException(AnonymousClass001.A0g("Trying to parse ", c16l.A0q(), " as TypedParameterMap"));
                    }
                    c16l.A0z();
                } else {
                    return c1125256f;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C1125256f c1125256f) {
        anonymousClass182.A0d();
        String str = c1125256f.A0L;
        if (str != null) {
            anonymousClass182.A0S("filter_model_class", str);
            c1125256f.A00();
            anonymousClass182.A0S("filter_name", c1125256f.A00());
            C16V.A03(anonymousClass182, "texture_transform");
            for (Number number : c1125256f.A0S) {
                if (number != null) {
                    anonymousClass182.A0g(number.floatValue());
                }
            }
            anonymousClass182.A0Z();
            C16V.A03(anonymousClass182, "content_transform");
            for (Number number2 : c1125256f.A0R) {
                if (number2 != null) {
                    anonymousClass182.A0g(number2.floatValue());
                }
            }
            anonymousClass182.A0Z();
            anonymousClass182.A0T("is_enabled", c1125256f.A0X);
            anonymousClass182.A0P("strength", c1125256f.A0B);
            anonymousClass182.A0P("brightness", c1125256f.A00);
            anonymousClass182.A0P("contrast", c1125256f.A01);
            anonymousClass182.A0P("saturation", c1125256f.A07);
            anonymousClass182.A0P("temperature", c1125256f.A0C);
            anonymousClass182.A0P("fade", c1125256f.A03);
            anonymousClass182.A0P("vignette", c1125256f.A0F);
            anonymousClass182.A0P("highlights", c1125256f.A04);
            anonymousClass182.A0P("shadows", c1125256f.A08);
            anonymousClass182.A0P("sharpen", c1125256f.A09);
            anonymousClass182.A0P("tint_shadows_intensity", c1125256f.A0E);
            if (c1125256f.A0U != null) {
                C16V.A03(anonymousClass182, "tint_shadows_color");
                for (Number number3 : c1125256f.A0U) {
                    if (number3 != null) {
                        anonymousClass182.A0g(number3.floatValue());
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0P("tint_highlights_intensity", c1125256f.A0D);
            if (c1125256f.A0T != null) {
                C16V.A03(anonymousClass182, "tint_highlights_color");
                for (Number number4 : c1125256f.A0T) {
                    if (number4 != null) {
                        anonymousClass182.A0g(number4.floatValue());
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0T("isBlendEnabled", c1125256f.A0W);
            anonymousClass182.A0T("usedForLayout", c1125256f.A0Y);
            if (c1125256f.A0P != null) {
                anonymousClass182.A0r("filter_map");
                anonymousClass182.A0d();
                for (Map.Entry entry : c1125256f.A0P.entrySet()) {
                    if (!C16V.A04(anonymousClass182, entry)) {
                        A00(anonymousClass182, (C1125256f) entry.getValue());
                    }
                }
                anonymousClass182.A0a();
            }
            if (c1125256f.A0V != null) {
                C16V.A03(anonymousClass182, "top_color");
                for (Number number5 : c1125256f.A0V) {
                    if (number5 != null) {
                        anonymousClass182.A0g(number5.floatValue());
                    }
                }
                anonymousClass182.A0Z();
            }
            if (c1125256f.A0Q != null) {
                C16V.A03(anonymousClass182, "bottom_color");
                for (Number number6 : c1125256f.A0Q) {
                    if (number6 != null) {
                        anonymousClass182.A0g(number6.floatValue());
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0P("input_width", c1125256f.A06);
            anonymousClass182.A0P("input_height", c1125256f.A05);
            anonymousClass182.A0P("corner_radius", c1125256f.A02);
            anonymousClass182.A0P("split", c1125256f.A0A);
            if (c1125256f.A0I != null) {
                anonymousClass182.A0r("left_filter");
                A00(anonymousClass182, c1125256f.A0I);
            }
            if (c1125256f.A0J != null) {
                anonymousClass182.A0r("right_filter");
                A00(anonymousClass182, c1125256f.A0J);
            }
            String str2 = c1125256f.A0K;
            if (str2 != null) {
                anonymousClass182.A0S("externalRenderKey", str2);
            }
            C55c.A01(c1125256f.A0H, anonymousClass182);
            String str3 = c1125256f.A0N;
            if (str3 != null) {
                anonymousClass182.A0S("glsl_shader_string", str3);
            }
            String str4 = c1125256f.A0O;
            if (str4 != null) {
                anonymousClass182.A0S("json", str4);
            }
            TypedParameterMap typedParameterMap = c1125256f.A0G;
            if (typedParameterMap != null) {
                anonymousClass182.A0r("typed_parameter_map");
                anonymousClass182.A0d();
                C44S c44s = new C44S(null);
                anonymousClass182.A0S("float_map", c44s.A0F(typedParameterMap.A02));
                anonymousClass182.A0S("float_array_map", c44s.A0F(typedParameterMap.A01));
                anonymousClass182.A0S("int_map", c44s.A0F(typedParameterMap.A03));
                anonymousClass182.A0S("bool_map", c44s.A0F(typedParameterMap.A00));
                anonymousClass182.A0S("string_map", c44s.A0F(typedParameterMap.A04));
                anonymousClass182.A0S("texture_path_map", c44s.A0F(typedParameterMap.A05));
                anonymousClass182.A0a();
            }
            anonymousClass182.A0a();
            return;
        }
        C14360o3.A0F("filterModelClass");
        throw C00O.createAndThrow();
    }
}
