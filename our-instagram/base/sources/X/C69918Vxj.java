package X;

import com.instagram.business.promote.model.PromoteCreateAudienceResponse;
import java.io.IOException;

/* renamed from: X.Vxj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69918Vxj {
    /* JADX WARN: Type inference failed for: r0v3, types: [com.instagram.business.promote.model.PromoteCreateAudienceResponse, X.1um, X.1ul] */
    public static PromoteCreateAudienceResponse parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("created_audience_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c40791um.A01 = A1P;
                } else if ("audience_creation_success".equals(A0s)) {
                    c40791um.A02 = c16l.A0d();
                } else if ("error".equals(A0s)) {
                    c40791um.A00 = AbstractC40190HsA.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
