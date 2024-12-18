package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class HGU extends C1P1 {
    public final UserSession A00;
    public final C85773s6 A01;
    public final AbstractC82033lP A02;
    public final java.util.Set A03;
    public final boolean A04;

    public HGU(UserSession userSession, C85773s6 c85773s6, AbstractC82033lP abstractC82033lP, java.util.Set set, boolean z) {
        this.A00 = userSession;
        this.A01 = c85773s6;
        this.A03 = set;
        this.A02 = abstractC82033lP;
        this.A04 = z;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -54371696);
        java.util.Set set = this.A03;
        C40791um c40791um = (C40791um) abstractC115105If.A00();
        if (c40791um != null && c40791um.mStatusCode == 429) {
            C1OR.A00(this.A00).A07.put("reels_media", AbstractC31173DnH.A0g());
        }
        AbstractC71703Jt.A00(this.A00).A03(abstractC115105If, this.A01);
        this.A02.A03(set);
        C0f9.A0A(-1349728730, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1871360190);
        AbstractC71703Jt.A00(this.A00).A05(this.A01);
        C0f9.A0A(1451590076, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-2105800126);
        AbstractC71703Jt.A00(this.A00).A04(this.A01);
        C0f9.A0A(217136528, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(387716781);
        C40741uh c40741uh = (C40741uh) obj;
        int A032 = C0f9.A03(1099468416);
        C14360o3.A0B(c40741uh, 0);
        UserSession userSession = this.A00;
        AbstractC71703Jt.A00(userSession).A06(this.A01, c40741uh);
        HashMap A033 = c40741uh.A03(userSession);
        C14360o3.A07(A033);
        HashMap A1G = AbstractC166987dD.A1G();
        Iterator A0l = AbstractC167007dF.A0l(A033);
        while (true) {
            boolean z = true;
            if (!A0l.hasNext()) {
                break;
            }
            Object next = A0l.next();
            C37771pE c37771pE = (C37771pE) A033.get(next);
            if (c37771pE != null) {
                C1NB A01 = AbstractC37741pB.A01(userSession, c37771pE);
                if (A01 == null || A01.CBs() != C05F.A01 || !C14360o3.A0K(AbstractC166987dD.A10(userSession), A01.CDj())) {
                    z = false;
                }
                Reel A0I = ReelStore.A03(userSession).A0I(c37771pE, z);
                A0I.A0Y(false);
                A1G.put(next, A0I);
            }
        }
        A1G.keySet();
        AbstractC82033lP abstractC82033lP = this.A02;
        abstractC82033lP.A02(A1G);
        HashSet hashSet = new HashSet(this.A03);
        hashSet.removeAll(A1G.keySet());
        if (AbstractC25226BEj.A1b(hashSet)) {
            if (this.A04) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Reel A0I2 = AbstractC37301Gc2.A0I(userSession, AbstractC166987dD.A1B(it));
                    if (A0I2 != null) {
                        C16930sl c16930sl = C16930sl.A00;
                        A0I2.A0t = AbstractC166987dD.A1F(c16930sl);
                        A0I2.A0u = AbstractC166987dD.A1F(c16930sl);
                        A0I2.A0X(c16930sl);
                    }
                }
            }
            abstractC82033lP.A04(hashSet);
        }
        C0f9.A0A(-2058007612, A032);
        C0f9.A0A(-821274313, A03);
    }
}
