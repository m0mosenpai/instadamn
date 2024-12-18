package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.G2m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36360G2m implements InterfaceC37156GYt {
    public final UserSession A00;
    public final E70 A01;

    public C36360G2m(UserSession userSession, E70 e70) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = e70;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.GHa, java.lang.Object] */
    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        boolean A00 = AbstractC31234DoH.A00(this.A00, this.A01.A0B);
        C35745Fqd c35745Fqd = new C35745Fqd(this, 24);
        ?? obj = new Object();
        obj.A04 = 2131959155;
        obj.A01 = 2131959154;
        obj.A0D = A00;
        obj.A08 = c35745Fqd;
        return AbstractC166987dD.A1J(obj);
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        E70 e70 = this.A01;
        UserSession userSession = this.A00;
        if (e70.A0v && !E70.A05(e70) && !e70.A0B() && !AbstractC31171DnF.A0n(e70.A0c).isEmpty() && !C4GR.A04(e70.A09)) {
            InterfaceC83733oI interfaceC83733oI = e70.A0L;
            C14360o3.A0B(interfaceC83733oI, 0);
            if ((interfaceC83733oI instanceof C83693oE) && AbstractC31177DnL.A1U(C06090Tz.A05, userSession, 36324389553189005L)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
