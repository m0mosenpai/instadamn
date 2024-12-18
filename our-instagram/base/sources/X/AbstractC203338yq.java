package X;

import android.graphics.Rect;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.8yq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC203338yq {
    public static C8FC parseFromJson(C16L c16l) {
        C8D0 c221639qS;
        Integer num;
        C14360o3.A0B(c16l, 0);
        try {
            C8FC c8fc = new C8FC();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("tag".equals(A0q)) {
                    c8fc.A0C = c16l.A1Q();
                } else if (CacheBehaviorLogger.SOURCE.equals(A0q)) {
                    Integer A00 = C5QQ.A00(c16l.A1Q());
                    C14360o3.A0B(A00, 0);
                    c8fc.A0A = A00;
                } else if ("bounce_in".equals(A0q)) {
                    c8fc.A0F = c16l.A0d();
                } else if ("fade_in".equals(A0q)) {
                    c8fc.A0N = c16l.A0d();
                } else if ("touch_enabled_by_default".equals(A0q)) {
                    c8fc.A0R = c16l.A0d();
                } else if ("removable_by_trash_can".equals(A0q)) {
                    c8fc.A0Q = c16l.A0d();
                } else if ("fully_visible_onScreen".equals(A0q)) {
                    c8fc.A0P = c16l.A0d();
                } else if ("fully_visible_on_alignment_guide".equals(A0q)) {
                    c8fc.A0O = c16l.A0d();
                } else if ("contour_path_enabled".equals(A0q)) {
                    c8fc.A0G = c16l.A0d();
                } else if ("min_scale_factor".equals(A0q)) {
                    c8fc.A01 = (float) c16l.A0U();
                } else if ("max_scale_factor".equals(A0q)) {
                    c8fc.A00 = (float) c16l.A0U();
                } else {
                    String str = null;
                    ArrayList arrayList = null;
                    if ("starting_offset".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                arrayList.add(new Float(c16l.A0U()));
                            }
                        }
                        c8fc.A0E = arrayList;
                    } else if ("starting_scale_factor".equals(A0q)) {
                        c8fc.A04 = (float) c16l.A0U();
                    } else if ("starting_normalized_width".equals(A0q)) {
                        c8fc.A02 = (float) c16l.A0U();
                    } else if ("starting_rotation".equals(A0q)) {
                        c8fc.A03 = (float) c16l.A0U();
                    } else if ("starting_layer".equals(A0q)) {
                        c8fc.A05 = c16l.A1D();
                    } else if ("enable_rotate_gesture".equals(A0q)) {
                        c8fc.A0K = c16l.A0d();
                    } else if ("enable_scale_gesture".equals(A0q)) {
                        c8fc.A0L = c16l.A0d();
                    } else if ("enable_horizontal_translation".equals(A0q)) {
                        c8fc.A0J = c16l.A0d();
                    } else if ("enable_vertical_translation".equals(A0q)) {
                        c8fc.A0M = c16l.A0d();
                    } else if ("enable_bouncy_press_down".equals(A0q)) {
                        c8fc.A0H = c16l.A0d();
                    } else if (TraceFieldType.StartTime.equals(A0q)) {
                        c8fc.A0B = Integer.valueOf(c16l.A1D());
                    } else if ("end_time".equals(A0q)) {
                        c8fc.A09 = Integer.valueOf(c16l.A1D());
                    } else if ("content_description".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c8fc.A0D = str;
                    } else if ("bounds_spec".equals(A0q)) {
                        AAO parseFromJson = AbstractC22760A2e.parseFromJson(c16l);
                        if (parseFromJson != null && (num = parseFromJson.A08) != null) {
                            int intValue = num.intValue();
                            if (intValue != 0) {
                                if (intValue != 1) {
                                    if (intValue != 2) {
                                        if (intValue != 3) {
                                            if (intValue == 4) {
                                                c221639qS = new C221649qT();
                                            }
                                        } else {
                                            Rect rect = parseFromJson.A07;
                                            rect.getClass();
                                            c221639qS = new C221619qQ(rect);
                                        }
                                    } else {
                                        c221639qS = new C221639qS(parseFromJson.A06, (int) parseFromJson.A02, (int) parseFromJson.A03);
                                    }
                                } else {
                                    c221639qS = new C221629qR(parseFromJson.A04, parseFromJson.A05);
                                }
                            } else {
                                c221639qS = new C183748Cz(parseFromJson.A00, parseFromJson.A01);
                            }
                            c8fc.A06 = c221639qS;
                        }
                        c221639qS = new C221639qS(17, 0.0f, 0.0f);
                        c8fc.A06 = c221639qS;
                    } else if ("enable_bulk_remove_drawables_by_tag".equals(A0q)) {
                        c8fc.A0I = c16l.A0d();
                    } else if ("unlink_drawable_when_removed".equals(A0q)) {
                        c8fc.A0S = c16l.A0d();
                    } else if ("full_screen_config".equals(A0q)) {
                        c8fc.A07 = AbstractC22761A2f.parseFromJson(c16l);
                    }
                }
                c16l.A0z();
            }
            return c8fc;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C8FC c8fc) {
        String str;
        String str2;
        anonymousClass182.A0d();
        Object obj = c8fc.A0C;
        if (obj != null) {
            if (obj instanceof String) {
                str2 = (String) obj;
            } else {
                str2 = "";
            }
            anonymousClass182.A0S("tag", str2);
        }
        anonymousClass182.A0S(CacheBehaviorLogger.SOURCE, C5QR.A00(c8fc.A0A));
        anonymousClass182.A0T("bounce_in", c8fc.A0F);
        anonymousClass182.A0T("fade_in", c8fc.A0N);
        anonymousClass182.A0T("touch_enabled_by_default", c8fc.A0R);
        anonymousClass182.A0T("removable_by_trash_can", c8fc.A0Q);
        anonymousClass182.A0T("fully_visible_onScreen", c8fc.A0P);
        anonymousClass182.A0T("fully_visible_on_alignment_guide", c8fc.A0O);
        anonymousClass182.A0T("contour_path_enabled", c8fc.A0G);
        anonymousClass182.A0P("min_scale_factor", c8fc.A01);
        anonymousClass182.A0P("max_scale_factor", c8fc.A00);
        if (c8fc.A0E != null) {
            C16V.A03(anonymousClass182, "starting_offset");
            for (Number number : c8fc.A0E) {
                if (number != null) {
                    anonymousClass182.A0g(number.floatValue());
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0P("starting_scale_factor", c8fc.A04);
        anonymousClass182.A0P("starting_normalized_width", c8fc.A02);
        anonymousClass182.A0P("starting_rotation", c8fc.A03);
        anonymousClass182.A0Q("starting_layer", c8fc.A05);
        anonymousClass182.A0T("enable_rotate_gesture", c8fc.A0K);
        anonymousClass182.A0T("enable_scale_gesture", c8fc.A0L);
        anonymousClass182.A0T("enable_horizontal_translation", c8fc.A0J);
        anonymousClass182.A0T("enable_vertical_translation", c8fc.A0M);
        anonymousClass182.A0T("enable_bouncy_press_down", c8fc.A0H);
        Integer num = c8fc.A0B;
        if (num != null) {
            anonymousClass182.A0Q(TraceFieldType.StartTime, num.intValue());
        }
        Integer num2 = c8fc.A09;
        if (num2 != null) {
            anonymousClass182.A0Q("end_time", num2.intValue());
        }
        String str3 = c8fc.A0D;
        if (str3 != null) {
            anonymousClass182.A0S("content_description", str3);
        }
        C8D0 c8d0 = c8fc.A06;
        if (c8d0 != null) {
            anonymousClass182.A0r("bounds_spec");
            AAO A01 = c8d0.A01();
            anonymousClass182.A0d();
            Integer num3 = A01.A08;
            if (num3 != null) {
                switch (num3.intValue()) {
                    case 1:
                        str = "NORMALIZED_CENTER";
                        break;
                    case 2:
                        str = "GRAVITY";
                        break;
                    case 3:
                        str = "ABSOLUTE";
                        break;
                    case 4:
                        str = "NO_OVERLAP";
                        break;
                    default:
                        str = "BIAS";
                        break;
                }
                anonymousClass182.A0S("bounds_spec_type", str);
            }
            anonymousClass182.A0P("bias_x", A01.A00);
            anonymousClass182.A0P("bias_y", A01.A01);
            anonymousClass182.A0P("normalized_center_x", A01.A04);
            anonymousClass182.A0P("normalized_center_y", A01.A05);
            anonymousClass182.A0Q("gravity", A01.A06);
            anonymousClass182.A0P("gravity_offset_x", A01.A02);
            anonymousClass182.A0P("gravity_offset_y", A01.A03);
            Rect rect = A01.A07;
            if (rect != null) {
                anonymousClass182.A0S("rect", rect.flattenToString());
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0T("enable_bulk_remove_drawables_by_tag", c8fc.A0I);
        anonymousClass182.A0T("unlink_drawable_when_removed", c8fc.A0S);
        if (c8fc.A07 != null) {
            anonymousClass182.A0r("full_screen_config");
            C8FD c8fd = c8fc.A07;
            anonymousClass182.A0d();
            anonymousClass182.A0P("offset_y", c8fd.A00);
            anonymousClass182.A0P("scale", c8fd.A01);
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
