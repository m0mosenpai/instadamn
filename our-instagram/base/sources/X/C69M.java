package X;

import com.instagram.model.showreel.IgShowreelCompositionImpl;
import java.io.IOException;

/* renamed from: X.69M, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C69M {
    public static C114565Fc parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            IgShowreelCompositionImpl igShowreelCompositionImpl = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            H5B h5b = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("showreel_composition".equals(A0q)) {
                    igShowreelCompositionImpl = AbstractC105404p6.parseFromJson(c16l);
                } else if ("showreel_native_animation".equals(A0q)) {
                    h5b = AbstractC40243Ht9.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C114565Fc(h5b, igShowreelCompositionImpl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
