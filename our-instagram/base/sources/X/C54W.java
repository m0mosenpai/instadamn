package X;

import com.instagram.model.mediasize.GifUrlImpl;
import java.io.IOException;

/* renamed from: X.54W, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C54W {
    public static C9BH parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            GifUrlImpl gifUrlImpl = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("fixed_height".equals(A0q)) {
                    gifUrlImpl = C54X.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (gifUrlImpl == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("fixed_height", "DirectAnimatedMediaResponseItemImageBundle");
                throw C00O.createAndThrow();
            }
            return new C9BH(gifUrlImpl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
