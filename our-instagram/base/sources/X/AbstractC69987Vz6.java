package X;

import android.graphics.PointF;
import java.io.IOException;

/* renamed from: X.Vz6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69987Vz6 {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.XnD, java.lang.Object] */
    public static C72792XnD parseFromJson(C16L c16l) {
        String A1P;
        Integer num;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("stroke_type".equals(A0s)) {
                    String A1Q = c16l.A1Q();
                    Integer[] A00 = C05F.A00(4);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            if (C14360o3.A0K(VXA.A00(num), A1Q)) {
                                break;
                            }
                            i++;
                        } else {
                            num = null;
                            break;
                        }
                    }
                    obj.A03 = num;
                } else if ("brush_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    obj.A04 = A1P;
                } else if ("brush_color".equals(A0s)) {
                    obj.A01 = c16l.A1D();
                } else if ("brush_size".equals(A0s)) {
                    obj.A00 = (float) c16l.A0U();
                } else if ("touch_sample".equals(A0s)) {
                    obj.A02 = VXB.parseFromJson(c16l);
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

    public static void A00(AnonymousClass182 anonymousClass182, C72792XnD c72792XnD) {
        anonymousClass182.A0d();
        Integer num = c72792XnD.A03;
        if (num != null) {
            anonymousClass182.A0S("stroke_type", VXA.A00(num));
        }
        String str = c72792XnD.A04;
        if (str != null) {
            anonymousClass182.A0S("brush_name", str);
        }
        anonymousClass182.A0Q("brush_color", c72792XnD.A01);
        anonymousClass182.A0P("brush_size", c72792XnD.A00);
        if (c72792XnD.A02 != null) {
            anonymousClass182.A0r("touch_sample");
            W92 w92 = c72792XnD.A02;
            anonymousClass182.A0d();
            PointF pointF = w92.A04;
            if (pointF != null) {
                anonymousClass182.A0r("position");
                anonymousClass182.A0c();
                anonymousClass182.A0g(pointF.x);
                anonymousClass182.A0g(pointF.y);
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0R("time", w92.A03);
            anonymousClass182.A0P("pressure", w92.A00);
            anonymousClass182.A0P("radius", w92.A01);
            anonymousClass182.A0Q("pos", w92.A02);
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
