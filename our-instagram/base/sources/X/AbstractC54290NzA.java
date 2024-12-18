package X;

import com.facebook.location.platform.api.Location;
import java.io.IOException;

/* renamed from: X.NzA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54290NzA {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.OUX, java.lang.Object] */
    public static OUX parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    obj.A06 = AbstractC167017dG.A0m(c16l);
                } else if (Location.LATITUDE.equals(A0q)) {
                    obj.A00 = (float) c16l.A0U();
                } else if ("longitude".equals(A0q)) {
                    obj.A01 = (float) c16l.A0U();
                } else if ("timestamp".equals(A0q)) {
                    obj.A04 = c16l.A0y();
                } else if ("status_update_timestamp".equals(A0q)) {
                    obj.A03 = c16l.A0y();
                } else if ("location".equals(A0q)) {
                    obj.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("device".equals(A0q)) {
                    obj.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("is_current".equals(A0q)) {
                    obj.A0A = c16l.A0d();
                } else if (MSZ.A0p().equals(A0q)) {
                    obj.A08 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
