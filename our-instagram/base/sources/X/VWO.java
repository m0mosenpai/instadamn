package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VWO {
    public static C68839Vcv parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68839Vcv c68839Vcv = new C68839Vcv();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("thumbnail_uri".equals(AbstractC166997dE.A0s(c16l))) {
                    SimpleImageUrl A00 = AbstractC222616c.A00(c16l);
                    C14360o3.A0B(A00, 0);
                    c68839Vcv.A00 = A00;
                }
                c16l.A0z();
            }
            return c68839Vcv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
