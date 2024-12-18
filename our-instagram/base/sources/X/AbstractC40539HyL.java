package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.business.promote.model.PromoteIntegrityCheckMessage;
import java.io.IOException;

/* renamed from: X.HyL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40539HyL {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.instagram.business.promote.model.PromoteIntegrityCheckMessage] */
    public static PromoteIntegrityCheckMessage parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("display_text_with_entities".equals(A0s)) {
                    obj.A01 = AbstractC40571Hyr.parseFromJson(c16l);
                } else if (AbstractC37300Gc1.A1E(A0s)) {
                    obj.A00 = PromoteIntegrityCheckMessage.Type.valueOf(c16l.A1Q());
                } else if (TraceFieldType.ErrorCode.equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("error_info".equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
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
