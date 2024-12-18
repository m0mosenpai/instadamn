package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Kld, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46720Kld {
    public static final boolean A00(UserSession userSession, DirectThreadKey directThreadKey) {
        C14360o3.A0B(userSession, 0);
        if (directThreadKey == null || (directThreadKey.A01 == null && directThreadKey.A00 == null)) {
            return true;
        }
        return AbstractC159387Cy.A04(userSession, directThreadKey, C05F.A09).A00();
    }
}
