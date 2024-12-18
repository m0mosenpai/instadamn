package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Ez0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33960Ez0 {
    public static final Object A00(C6FQ c6fq) {
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        User A10 = AbstractC166987dD.A10(A0W);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        if (A04 != null) {
            AbstractC31177DnL.A0w(null, AbstractC31412DrH.A01().CsL(A0W, AbstractC31565Dtq.A00(EnumC31556Dtg.A04, A10.getId(), null, false)), A04, A0W);
        }
        return null;
    }
}
