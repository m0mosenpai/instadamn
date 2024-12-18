package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.NrQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53836NrQ {
    public static final Object A00(C6FQ c6fq) {
        UserSession A0S = AbstractC31177DnL.A0S(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        ArrayList A1F = AbstractC166987dD.A1F(AbstractC001800i.A0X(AbstractC23021Ah.A00(A0S).A0I("reel")));
        boolean A25 = AbstractC23021Ah.A00(A0S).A25("reel");
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            AbstractC54896OPr.A01(c6fg.A00, A04, A0S, A1F, A25);
            return null;
        }
        throw AbstractC166997dE.A0g();
    }
}
