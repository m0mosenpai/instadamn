package X;

import com.instagram.discovery.refinement.model.QueryInformation;
import java.io.IOException;

/* renamed from: X.Hzb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40617Hzb {
    public static QueryInformation parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("query_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(1200).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            QueryInformation queryInformation = new QueryInformation();
            if (str != null) {
                queryInformation.A00 = str;
            }
            if (str2 != null) {
                queryInformation.A01 = str2;
            }
            return queryInformation;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
