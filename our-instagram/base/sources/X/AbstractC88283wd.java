package X;

import com.instagram.api.schemas.MediaCroppingCoordinates;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.3wd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC88283wd {
    public static MediaCroppingCoordinates parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Float f = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Float f2 = null;
            Float f3 = null;
            Float f4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("crop_bottom".equals(A0q)) {
                    f = Float.valueOf((float) c16l.A0U());
                } else if ("crop_left".equals(A0q)) {
                    f2 = Float.valueOf((float) c16l.A0U());
                } else if ("crop_right".equals(A0q)) {
                    f3 = Float.valueOf((float) c16l.A0U());
                } else if ("crop_top".equals(A0q)) {
                    f4 = Float.valueOf((float) c16l.A0U());
                }
                c16l.A0z();
            }
            if (f == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("crop_bottom", "MediaCroppingCoordinates");
            } else if (f2 != null || !(c16l instanceof C07950bF)) {
                if (f3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("crop_right", "MediaCroppingCoordinates");
                } else if (f4 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("crop_top", "MediaCroppingCoordinates");
                } else {
                    return new MediaCroppingCoordinates(f.floatValue(), f2.floatValue(), f3.floatValue(), f4.floatValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("crop_left", "MediaCroppingCoordinates");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static String A00(MediaCroppingCoordinates mediaCroppingCoordinates) {
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        A01(A0A, mediaCroppingCoordinates);
        A0A.close();
        return stringWriter.toString();
    }

    public static void A01(AnonymousClass182 anonymousClass182, MediaCroppingCoordinates mediaCroppingCoordinates) {
        anonymousClass182.A0d();
        anonymousClass182.A0P("crop_bottom", mediaCroppingCoordinates.A00);
        anonymousClass182.A0P("crop_left", mediaCroppingCoordinates.A01);
        anonymousClass182.A0P("crop_right", mediaCroppingCoordinates.A02);
        anonymousClass182.A0P("crop_top", mediaCroppingCoordinates.A03);
        anonymousClass182.A0a();
    }
}
