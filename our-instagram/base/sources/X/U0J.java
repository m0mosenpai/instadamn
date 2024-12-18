package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class U0J {
    public U2P A00;
    public String A01;
    public List A02;
    public List A03 = new ArrayList();
    public final int A04;
    public final C66081TzI A05;
    public final UserSession A06;
    public final boolean A07;

    public U0J(UserSession userSession) {
        this.A06 = userSession;
        C06090Tz A0U = AbstractC166997dE.A0U(userSession);
        this.A04 = (int) C18U.A01(A0U, userSession, 36602557405205179L);
        this.A07 = C18U.A06(A0U, userSession, 36321082428368010L);
        this.A05 = new C66081TzI(this, 35);
    }
}
