package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public final class G3B implements InterfaceC37156GYt {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final C41761wQ A02;
    public final UserSession A03;
    public final InterfaceC37169GZg A04;
    public final E70 A05;
    public final InterfaceC190658cN A06;

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        C81543kP c81543kP;
        List list;
        List list2;
        UserSession userSession = this.A03;
        E70 e70 = this.A05;
        if (C160857It.A01(userSession, e70) && ((c81543kP = e70.A0E) == null || (((list = c81543kP.A0D) == null || list.isEmpty()) && ((list2 = c81543kP.A0E) == null || list2.isEmpty())))) {
            return AbstractC166987dD.A1J(C31335Dq0.A00(2131960025));
        }
        return AbstractC16960so.A1Q(C31335Dq0.A00(2131960025), new C36731GHa(new C35745Fqd(this, 21), this.A06, 2131959961, e70.A0w));
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        int i;
        UserSession userSession = this.A03;
        E70 e70 = this.A05;
        AbstractC167017dG.A1N(userSession, e70);
        if (C98Q.A00(userSession).A00(e70.A0L, 25) && (i = e70.A07) != 6 && i != 8) {
            return true;
        }
        return false;
    }

    public G3B(Context context, InterfaceC11380iw interfaceC11380iw, C41761wQ c41761wQ, UserSession userSession, InterfaceC37169GZg interfaceC37169GZg, E70 e70, InterfaceC190658cN interfaceC190658cN) {
        AbstractC167017dG.A1P(userSession, interfaceC190658cN);
        this.A03 = userSession;
        this.A06 = interfaceC190658cN;
        this.A01 = interfaceC11380iw;
        this.A00 = context;
        this.A05 = e70;
        this.A02 = c41761wQ;
        this.A04 = interfaceC37169GZg;
    }
}
