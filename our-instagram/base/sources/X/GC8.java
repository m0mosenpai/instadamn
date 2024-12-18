package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public final class GC8 implements C5OV {
    public final UserSession A00;
    public final boolean A01;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        UserSession userSession = this.A00;
        List A04 = C23031Ai.A04(AbstractC23021Ah.A00(userSession), "parenting_accounts_followed");
        if (A04.isEmpty()) {
            A04 = AbstractC166987dD.A1E();
        }
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        C16930sl c16930sl = C16930sl.A00;
        C14360o3.A0B(c16930sl, 0);
        C23031Ai.A06(A00, "parenting_accounts_followed", c16930sl);
        if ((!A04.isEmpty()) == this.A01) {
            return true;
        }
        return false;
    }

    public GC8(UserSession userSession, boolean z) {
        this.A00 = userSession;
        this.A01 = z;
    }
}
