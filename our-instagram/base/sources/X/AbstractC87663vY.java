package X;

import com.instagram.api.schemas.IGAdCreationOptimizationPayloadDictImpl;
import java.io.IOException;

/* renamed from: X.3vY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC87663vY {
    public static C38716H3d parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            IGAdCreationOptimizationPayloadDictImpl iGAdCreationOptimizationPayloadDictImpl = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("adCreativeOptimizationPayload".equals(A0q)) {
                    iGAdCreationOptimizationPayloadDictImpl = AbstractC39969Hny.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C38716H3d(iGAdCreationOptimizationPayloadDictImpl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
