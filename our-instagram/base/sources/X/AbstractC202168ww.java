package X;

import java.io.IOException;

/* renamed from: X.8ww, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC202168ww {
    public static C206169Az parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C206169Az c206169Az = new C206169Az(3);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("scale".equals(A0q)) {
                    c206169Az.A02 = (float) c16l.A0U();
                } else if ("left_percentage".equals(A0q)) {
                    c206169Az.A00 = (float) c16l.A0U();
                } else if ("top_percentage".equals(A0q)) {
                    c206169Az.A03 = (float) c16l.A0U();
                } else if ("rotation_degrees".equals(A0q)) {
                    c206169Az.A01 = (float) c16l.A0U();
                }
                c16l.A0z();
            }
            return c206169Az;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(C206169Az c206169Az, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        anonymousClass182.A0P("scale", c206169Az.A02);
        anonymousClass182.A0P("left_percentage", c206169Az.A00);
        anonymousClass182.A0P("top_percentage", c206169Az.A03);
        anonymousClass182.A0P("rotation_degrees", c206169Az.A01);
        anonymousClass182.A0a();
    }
}
