package X;

import android.content.Context;
import android.os.MessageQueue;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes8.dex */
public final class JZS implements MessageQueue.IdleHandler {
    public final /* synthetic */ JR2 A00;

    public JZS(JR2 jr2) {
        this.A00 = jr2;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        JR2 jr2 = this.A00;
        List A0F = AbstractC43592JPx.A0g(jr2).A0C.A0F(jr2.A0u());
        if (!A0F.isEmpty()) {
            Context A0O = AbstractC166987dD.A0O(jr2.A1L.requireActivity());
            UserSession A0p = jr2.A0p();
            java.util.Set set = JZM.A04;
            C14360o3.A0B(A0p, 2);
            if (JZM.A00 == null) {
                C58504PwY c58504PwY = new C58504PwY(A0O, A0p, A0F);
                C14120nc.A00().ATO(c58504PwY);
                JZM.A00 = c58504PwY;
                return false;
            }
            return false;
        }
        return false;
    }
}
