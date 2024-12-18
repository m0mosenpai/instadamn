package X;

import com.instagram.api.schemas.OpenInspirationHubCommandImpl;
import com.instagram.api.schemas.XDTCreatorInspirationHubType;
import java.io.IOException;

/* renamed from: X.Hqq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40123Hqq {
    public static OpenInspirationHubCommandImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            XDTCreatorInspirationHubType xDTCreatorInspirationHubType = null;
            while (c16l.A1J() != C16R.A09) {
                if ("target_tab".equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    xDTCreatorInspirationHubType = (XDTCreatorInspirationHubType) XDTCreatorInspirationHubType.A01.get(A1P);
                    if (xDTCreatorInspirationHubType == null) {
                        xDTCreatorInspirationHubType = XDTCreatorInspirationHubType.A06;
                    }
                }
                c16l.A0z();
            }
            return new OpenInspirationHubCommandImpl(xDTCreatorInspirationHubType);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
