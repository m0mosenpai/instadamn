package X;

import com.instagram.api.schemas.CameraTool;
import java.io.IOException;

/* renamed from: X.5JA, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5JA {
    public static C5JB parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            CameraTool cameraTool = null;
            Float f = null;
            Float f2 = null;
            Float f3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("segment_index".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("camera_tool".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    cameraTool = C51T.A00(A1P);
                } else if ("duration_selector_seconds".equals(A0q)) {
                    f = new Float(c16l.A0U());
                } else if ("speed_selector".equals(A0q)) {
                    f2 = new Float(c16l.A0U());
                } else if ("timer_selector_seconds".equals(A0q)) {
                    f3 = new Float(c16l.A0U());
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("segment_index", "CameraToolInfoWithSegmentIndex");
            } else if (cameraTool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("camera_tool", "CameraToolInfoWithSegmentIndex");
            } else {
                return new C5JB(cameraTool, f, f2, f3, num.intValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C5JB c5jb) {
        anonymousClass182.A0d();
        anonymousClass182.A0Q("segment_index", c5jb.A00);
        CameraTool cameraTool = c5jb.A01;
        if (cameraTool != null) {
            anonymousClass182.A0S("camera_tool", cameraTool.A00);
        }
        Float f = c5jb.A02;
        if (f != null) {
            anonymousClass182.A0P("duration_selector_seconds", f.floatValue());
        }
        Float f2 = c5jb.A03;
        if (f2 != null) {
            anonymousClass182.A0P("speed_selector", f2.floatValue());
        }
        Float f3 = c5jb.A04;
        if (f3 != null) {
            anonymousClass182.A0P("timer_selector_seconds", f3.floatValue());
        }
        anonymousClass182.A0a();
    }
}
