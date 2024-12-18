package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class CUJ {
    public int A00;
    public InterfaceC16820sZ A01;
    public InterfaceC16820sZ A02;
    public InterfaceC16820sZ A03;
    public InterfaceC16660sJ A04;
    public final List A05 = AbstractC166987dD.A1E();
    public final UserSession A06;

    public final void A00(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            Iterator it = this.A05.iterator();
            while (it.hasNext()) {
                ((InterfaceC16660sJ) it.next()).invoke(Integer.valueOf(i));
            }
        }
    }

    public CUJ(UserSession userSession) {
        this.A06 = userSession;
        this.A00 = (int) C18U.A00(C06090Tz.A06, userSession, 37167281180115393L);
    }
}
