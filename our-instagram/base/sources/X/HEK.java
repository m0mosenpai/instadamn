package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.adshistory.fragment.RecentAdActivityFragment;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class HEK extends C7E1 implements InterfaceC61782rf, InterfaceC65272xP, C3CQ {
    public boolean A00;
    public final C65322xU A01;
    public final C38996HEy A02;
    public final RecentAdActivityFragment A03;
    public final C37443GeN A04;
    public final C60972qL A05;
    public final InterfaceC62602sz A06;
    public final C65842yM A07;
    public final Map A08;

    public HEK(FragmentActivity fragmentActivity, C38996HEy c38996HEy, RecentAdActivityFragment recentAdActivityFragment, C61142qc c61142qc, C60972qL c60972qL, InterfaceC62602sz interfaceC62602sz) {
        AbstractC37302Gc3.A1U(c61142qc, interfaceC62602sz);
        this.A05 = c60972qL;
        this.A06 = interfaceC62602sz;
        this.A02 = c38996HEy;
        this.A03 = recentAdActivityFragment;
        this.A01 = new C65322xU();
        this.A08 = AbstractC166987dD.A1G();
        C37443GeN c37443GeN = new C37443GeN(fragmentActivity, fragmentActivity, c61142qc, c60972qL, true, true);
        this.A04 = c37443GeN;
        C65842yM c65842yM = new C65842yM(c60972qL.A00);
        this.A07 = c65842yM;
        ArrayList A1F = AbstractC166987dD.A1F(AbstractC16960so.A1Q(c37443GeN, c65842yM));
        A1F.add(c38996HEy);
        A0A(A1F);
    }

    public final void A0C() {
        this.A00 = true;
        C65322xU c65322xU = this.A01;
        UserSession userSession = this.A05.A01;
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator A13 = AbstractC166997dE.A13(((AbstractC65332xV) c65322xU).A02);
        while (A13.hasNext()) {
            Object next = A13.next();
            if (C3YR.A00(userSession, (C3XG) next)) {
                A1E2.add(next);
            } else {
                A1E.add(next);
            }
        }
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            c65322xU.A0D(it.next());
        }
        AbstractC37302Gc3.A1Q(c65322xU, A1E2);
        A06();
        RecentAdActivityFragment recentAdActivityFragment = this.A03;
        if (recentAdActivityFragment != null) {
            Object obj = recentAdActivityFragment.A02;
            if (obj != null) {
                A09(this.A02, obj, null);
            }
            int size = ((AbstractC65332xV) c65322xU).A01.size();
            for (int i = 0; i < size; i++) {
                C3XG c3xg = (C3XG) ((AbstractC65332xV) c65322xU).A01.get(i);
                if (c3xg.A06.ordinal() == 1) {
                    C38321qM A0E = AbstractC37300Gc1.A0E(c3xg);
                    if (A0E != null) {
                        C75113Zb BRZ = BRZ(A0E);
                        BRZ.A0D(i);
                        A09(this.A04, A0E, BRZ);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
            }
            InterfaceC62602sz interfaceC62602sz = this.A06;
            if (interfaceC62602sz.CLJ()) {
                A08(this.A07, interfaceC62602sz);
            }
            A07();
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ void A8q(Object obj, int i) {
    }

    @Override // X.C3CQ
    public final boolean AJk(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        return this.A01.A0F(c38321qM);
    }

    @Override // X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        Map map = this.A08;
        C75113Zb c75113Zb = (C75113Zb) map.get(c38321qM);
        if (c75113Zb == null) {
            C75113Zb A0E = AbstractC37303Gc4.A0E(c38321qM);
            AnonymousClass341 anonymousClass341 = AnonymousClass341.A03;
            C14360o3.A0B(anonymousClass341, 0);
            A0E.A0o = anonymousClass341;
            map.put(c38321qM, A0E);
            return A0E;
        }
        return c75113Zb;
    }

    @Override // X.InterfaceC65282xQ
    public final void Ct5() {
        this.A00 = false;
    }

    @Override // X.InterfaceC65272xP
    public final void ETA(InterfaceC686036x interfaceC686036x) {
        C14360o3.A0B(interfaceC686036x, 0);
        this.A04.A03(interfaceC686036x);
    }

    @Override // X.InterfaceC65272xP
    public final void EUR(C33P c33p) {
        C14360o3.A0B(c33p, 0);
        this.A04.A03 = c33p;
    }

    @Override // X.InterfaceC65282xQ
    public final boolean CSO() {
        return this.A00;
    }

    @Override // X.InterfaceC65282xQ
    public final void AVK() {
        A0C();
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ List CCN() {
        return AbstractC166987dD.A1E();
    }

    @Override // X.InterfaceC65232xL
    public final void CtR(C38321qM c38321qM) {
        C0fA.A00(this, -235484333);
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        A0C();
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ int BK6(String str) {
        return -1;
    }

    @Override // X.C3CQ
    public final void DSP(C38321qM c38321qM) {
        A0C();
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ Object EFR(int i) {
        return null;
    }
}
