package X;

import com.instagram.model.hashtag.HashtagImpl;
import java.io.IOException;

/* renamed from: X.I5z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40797I5z {
    public static C68090V9z parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68090V9z c68090V9z = new C68090V9z();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("hashtag".equals(A0s)) {
                    HashtagImpl parseFromJson = AbstractC109614wn.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c68090V9z.A00 = parseFromJson;
                } else {
                    AbstractC37930GmS.A01(c16l, c68090V9z, A0s);
                }
                c16l.A0z();
            }
            return c68090V9z;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
