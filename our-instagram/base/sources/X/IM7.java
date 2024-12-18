package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class IM7 {
    public C70873Fz A00;
    public final UserSession A01;
    public final List A02;
    public final List A03;
    public final InterfaceC11380iw A04;

    public IM7(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A04 = interfaceC11380iw;
        this.A02 = AbstractC166987dD.A1E();
        this.A03 = AbstractC166987dD.A1E();
    }

    public final void A00(List list) {
        C14360o3.A0B(list, 0);
        if (AbstractC166987dD.A1b(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Reel reel = (Reel) it.next();
                if (!reel.A15(this.A01) || !AbstractC166987dD.A1b(reel.A0y)) {
                    this.A02.add(AbstractC37301Gc2.A0i(reel));
                    this.A03.add(reel);
                }
            }
            this.A00 = new C70873Fz(this.A01, list);
        }
    }
}
