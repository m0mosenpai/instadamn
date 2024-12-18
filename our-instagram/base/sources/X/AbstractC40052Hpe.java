package X;

import com.instagram.api.schemas.LoyaltyToplineInfoDictImpl;
import java.io.IOException;

/* renamed from: X.Hpe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40052Hpe {
    public static LoyaltyToplineInfoDictImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(461).equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC111324zv.A00(469).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new LoyaltyToplineInfoDictImpl(str, bool);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
