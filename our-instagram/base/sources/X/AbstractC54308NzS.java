package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.NzS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54308NzS {
    public static final Object A00(UserSession userSession, C37845Gkz c37845Gkz, InterfaceC23621Ds interfaceC23621Ds) {
        C26136BhN c26136BhN;
        C54734OFl c54734OFl;
        C38663Gz4 A07;
        List list = c37845Gkz.A00;
        if (list != null && (c54734OFl = (C54734OFl) AbstractC001800i.A0J(list)) != null && (A07 = C55214Oeb.A00.A07(AbstractC25225BEi.A0F(userSession), userSession, c54734OFl)) != null) {
            return A07;
        }
        List list2 = c37845Gkz.A01;
        if (list2 != null && (c26136BhN = (C26136BhN) AbstractC001800i.A0J(list2)) != null) {
            return C55214Oeb.A00.A08(AbstractC25225BEi.A0F(userSession), c26136BhN, userSession, interfaceC23621Ds);
        }
        return null;
    }
}
