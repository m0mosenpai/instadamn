package X;

import com.instagram.model.mediasize.ImageInfoImpl;
import java.io.IOException;

/* renamed from: X.4qu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC106404qu {
    public static C106414qv parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ImageInfoImpl imageInfoImpl = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("image_versions2".equals(A0q)) {
                    imageInfoImpl = AbstractC39101rj.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (imageInfoImpl == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("image_versions2", "ThreadImage");
                throw C00O.createAndThrow();
            }
            return new C106414qv(imageInfoImpl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
