package X;

import android.graphics.PointF;
import java.io.IOException;

/* renamed from: X.55V, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C55V {
    public static C55W parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C55W c55w = new C55W();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("filter_type".equals(A0q)) {
                    c55w.A0P = Integer.valueOf(c16l.A1D());
                } else if ("filter_strength".equals(A0q)) {
                    c55w.A07 = new Float(c16l.A0U());
                } else if ("border_enabled".equals(A0q)) {
                    c55w.A0N = Integer.valueOf(c16l.A1D());
                } else if ("lux".equals(A0q)) {
                    c55w.A09 = new Float(c16l.A0U());
                } else if ("structure".equals(A0q)) {
                    c55w.A0G = new Float(c16l.A0U());
                } else if ("brightness".equals(A0q)) {
                    c55w.A03 = new Float(c16l.A0U());
                } else if ("contrast".equals(A0q)) {
                    c55w.A04 = new Float(c16l.A0U());
                } else if ("temperature".equals(A0q)) {
                    c55w.A0H = new Float(c16l.A0U());
                } else if ("saturation".equals(A0q)) {
                    c55w.A0D = new Float(c16l.A0U());
                } else if ("highlights".equals(A0q)) {
                    c55w.A08 = new Float(c16l.A0U());
                } else if ("shadows".equals(A0q)) {
                    c55w.A0E = new Float(c16l.A0U());
                } else if ("vignette".equals(A0q)) {
                    c55w.A0M = new Float(c16l.A0U());
                } else if ("fade".equals(A0q)) {
                    c55w.A06 = new Float(c16l.A0U());
                } else if ("tintShadows".equals(A0q)) {
                    c55w.A0L = new Float(c16l.A0U());
                } else if ("tintHighlights".equals(A0q)) {
                    c55w.A0K = new Float(c16l.A0U());
                } else if ("tintShadowsColor".equals(A0q)) {
                    c55w.A0S = Integer.valueOf(c16l.A1D());
                } else if ("tintHighlightsColor".equals(A0q)) {
                    c55w.A0R = Integer.valueOf(c16l.A1D());
                } else if ("sharpen".equals(A0q)) {
                    c55w.A0F = new Float(c16l.A0U());
                } else if ("tiltshift_type".equals(A0q)) {
                    c55w.A0Q = Integer.valueOf(c16l.A1D());
                } else if ("tiltshift_center".equals(A0q)) {
                    c55w.A02 = C55X.A00(c16l);
                } else if ("tiltshift_radius".equals(A0q)) {
                    c55w.A0J = new Float(c16l.A0U());
                } else if ("tiltshift_angle".equals(A0q)) {
                    c55w.A0I = new Float(c16l.A0U());
                } else if ("crop_original_size".equals(A0q)) {
                    c55w.A01 = C55X.A00(c16l);
                } else if ("crop_center".equals(A0q)) {
                    c55w.A00 = C55X.A00(c16l);
                } else if ("crop_zoom".equals(A0q)) {
                    c55w.A05 = new Float(c16l.A0U());
                } else if ("crop_orientation_angle".equals(A0q)) {
                    c55w.A0O = Integer.valueOf(c16l.A1D());
                } else if ("perspective_rotation_x".equals(A0q)) {
                    c55w.A0A = new Float(c16l.A0U());
                } else if ("perspective_rotation_y".equals(A0q)) {
                    c55w.A0B = new Float(c16l.A0U());
                } else if ("perspective_rotation_z".equals(A0q)) {
                    c55w.A0C = new Float(c16l.A0U());
                }
                c16l.A0z();
            }
            return c55w;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C55W c55w) {
        anonymousClass182.A0d();
        Integer num = c55w.A0P;
        if (num != null) {
            anonymousClass182.A0Q("filter_type", num.intValue());
        }
        Float f = c55w.A07;
        if (f != null) {
            anonymousClass182.A0P("filter_strength", f.floatValue());
        }
        Integer num2 = c55w.A0N;
        if (num2 != null) {
            anonymousClass182.A0Q("border_enabled", num2.intValue());
        }
        Float f2 = c55w.A09;
        if (f2 != null) {
            anonymousClass182.A0P("lux", f2.floatValue());
        }
        Float f3 = c55w.A0G;
        if (f3 != null) {
            anonymousClass182.A0P("structure", f3.floatValue());
        }
        Float f4 = c55w.A03;
        if (f4 != null) {
            anonymousClass182.A0P("brightness", f4.floatValue());
        }
        Float f5 = c55w.A04;
        if (f5 != null) {
            anonymousClass182.A0P("contrast", f5.floatValue());
        }
        Float f6 = c55w.A0H;
        if (f6 != null) {
            anonymousClass182.A0P("temperature", f6.floatValue());
        }
        Float f7 = c55w.A0D;
        if (f7 != null) {
            anonymousClass182.A0P("saturation", f7.floatValue());
        }
        Float f8 = c55w.A08;
        if (f8 != null) {
            anonymousClass182.A0P("highlights", f8.floatValue());
        }
        Float f9 = c55w.A0E;
        if (f9 != null) {
            anonymousClass182.A0P("shadows", f9.floatValue());
        }
        Float f10 = c55w.A0M;
        if (f10 != null) {
            anonymousClass182.A0P("vignette", f10.floatValue());
        }
        Float f11 = c55w.A06;
        if (f11 != null) {
            anonymousClass182.A0P("fade", f11.floatValue());
        }
        Float f12 = c55w.A0L;
        if (f12 != null) {
            anonymousClass182.A0P("tintShadows", f12.floatValue());
        }
        Float f13 = c55w.A0K;
        if (f13 != null) {
            anonymousClass182.A0P("tintHighlights", f13.floatValue());
        }
        Integer num3 = c55w.A0S;
        if (num3 != null) {
            anonymousClass182.A0Q("tintShadowsColor", num3.intValue());
        }
        Integer num4 = c55w.A0R;
        if (num4 != null) {
            anonymousClass182.A0Q("tintHighlightsColor", num4.intValue());
        }
        Float f14 = c55w.A0F;
        if (f14 != null) {
            anonymousClass182.A0P("sharpen", f14.floatValue());
        }
        Integer num5 = c55w.A0Q;
        if (num5 != null) {
            anonymousClass182.A0Q("tiltshift_type", num5.intValue());
        }
        PointF pointF = c55w.A02;
        if (pointF != null) {
            C55X.A01(pointF, anonymousClass182, "tiltshift_center");
        }
        Float f15 = c55w.A0J;
        if (f15 != null) {
            anonymousClass182.A0P("tiltshift_radius", f15.floatValue());
        }
        Float f16 = c55w.A0I;
        if (f16 != null) {
            anonymousClass182.A0P("tiltshift_angle", f16.floatValue());
        }
        PointF pointF2 = c55w.A01;
        if (pointF2 != null) {
            C55X.A01(pointF2, anonymousClass182, "crop_original_size");
        }
        PointF pointF3 = c55w.A00;
        if (pointF3 != null) {
            C55X.A01(pointF3, anonymousClass182, "crop_center");
        }
        Float f17 = c55w.A05;
        if (f17 != null) {
            anonymousClass182.A0P("crop_zoom", f17.floatValue());
        }
        Integer num6 = c55w.A0O;
        if (num6 != null) {
            anonymousClass182.A0Q("crop_orientation_angle", num6.intValue());
        }
        Float f18 = c55w.A0A;
        if (f18 != null) {
            anonymousClass182.A0P("perspective_rotation_x", f18.floatValue());
        }
        Float f19 = c55w.A0B;
        if (f19 != null) {
            anonymousClass182.A0P("perspective_rotation_y", f19.floatValue());
        }
        Float f20 = c55w.A0C;
        if (f20 != null) {
            anonymousClass182.A0P("perspective_rotation_z", f20.floatValue());
        }
        anonymousClass182.A0a();
    }
}
