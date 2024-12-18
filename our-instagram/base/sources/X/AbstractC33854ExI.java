package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;

/* renamed from: X.ExI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33854ExI {
    public static final C0eB A00(C6FQ c6fq, C6FW c6fw) {
        UserSession A0S = AbstractC31177DnL.A0S(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        InterfaceC11380iw A08 = C6BQ.A08(c6fq);
        Object A03 = c6fw.A03(0);
        String A0f = AbstractC31171DnF.A0f(A03);
        String str = (String) A03;
        String A0o = AbstractC31176DnK.A0o(c6fw, A0f, 1);
        C6WQ c6wq = new C6WQ(A04, true);
        AbstractC31176DnK.A13(A04, c6wq);
        C0fJ.A00(c6wq);
        LL3.A03(A0S, ThreadFetchReason.OPEN_BROADCAST_CHANNEL, new C36456G6g(A04, A08, A0S, c6wq, A0o, str), 20, str, false);
        return C0eB.A00;
    }
}
