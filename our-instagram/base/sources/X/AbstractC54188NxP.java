package X;

import com.instagram.model.mapquery.MapQuery;
import java.io.IOException;

/* renamed from: X.NxP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54188NxP {
    public static NUN parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            NUN nun = new NUN();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("map_query".equals(A0s)) {
                    MapQuery parseFromJson = OPT.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    nun.A00 = parseFromJson;
                } else {
                    AbstractC37930GmS.A01(c16l, nun, A0s);
                }
                c16l.A0z();
            }
            return nun;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
