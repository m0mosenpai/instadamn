package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class HY8 extends AbstractC82033lP {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C39173HMb A01;

    @Override // X.AbstractC82033lP
    public final void A02(Map map) {
        C38321qM A1e;
        List<Reel> A0a = AbstractC001800i.A0a(map.values());
        HashMap A1G = AbstractC166987dD.A1G();
        for (Reel reel : A0a) {
            if (reel.A1A(this.A00)) {
                java.util.Set A0Q = reel.A0Q();
                C14360o3.A07(A0Q);
                if (AbstractC31171DnF.A1b(A0Q)) {
                    A1G.put(reel.getId(), A0Q);
                }
            }
        }
        C82113lX c82113lX = C82103lW.A02;
        UserSession userSession = this.A00;
        c82113lX.A01(userSession, A1G);
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator it = A0a.iterator();
        while (it.hasNext()) {
            List A0O = ((Reel) it.next()).A0O(userSession);
            C14360o3.A07(A0O);
            int size = A0O.size();
            for (int i = 0; i < size; i++) {
                C38321qM c38321qM = ((C41181vS) A0O.get(i)).A0b;
                if (c38321qM != null) {
                    ExtendedImageUrl A1q = c38321qM.A1q(AbstractC25225BEi.A0F(userSession));
                    if (A1q != null) {
                        C1OG A0J = C25821No.A00().A0J(A1q, "notification_prefetch");
                        A0J.A0I = true;
                        c38321qM.A18();
                        A0J.A0F = false;
                        A1E.add(A0J.A00());
                    }
                    if ((c38321qM.Cff() || (c38321qM.A5M() && (A1e = c38321qM.A1e(c38321qM.A0x())) != null && A1e.Cff())) && (!c38321qM.A5M() || (c38321qM = c38321qM.A1e(c38321qM.A0x())) != null)) {
                        A1E2.add(new C4AD(c38321qM.CFR(), "notification_prefetch"));
                    }
                }
            }
        }
        Iterator it2 = A1E.iterator();
        while (it2.hasNext()) {
            C25821No.A00().A0N((InterfaceC59502nt) it2.next());
        }
        Iterator it3 = A1E2.iterator();
        while (it3.hasNext()) {
            C4AG.A00(userSession).A01((C4AD) it3.next());
        }
    }

    public HY8(UserSession userSession, C39173HMb c39173HMb) {
        this.A00 = userSession;
        this.A01 = c39173HMb;
    }
}
