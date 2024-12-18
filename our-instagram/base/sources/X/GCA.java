package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public final class GCA implements C5OV {
    public final UserSession A00;
    public final boolean A01;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        UserSession userSession = this.A00;
        List A0G = AbstractC23021Ah.A00(userSession).A0G();
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        C16930sl c16930sl = C16930sl.A00;
        C14360o3.A0B(c16930sl, 0);
        C23031Ai.A06(A00, AbstractC111324zv.A00(2854), c16930sl);
        if ((!A0G.isEmpty()) == this.A01) {
            return true;
        }
        return false;
    }

    public GCA(UserSession userSession, boolean z) {
        this.A00 = userSession;
        this.A01 = z;
    }
}
