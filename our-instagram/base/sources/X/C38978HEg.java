package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.HEg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38978HEg extends C2US implements InterfaceC65242xM, InterfaceC65272xP {
    public boolean A00;
    public final C37443GeN A01;
    public final C155946zO A02;
    public final HF7 A03;
    public final Context A04;
    public final UserSession A05;
    public final InterfaceC60442pS A06;
    public final InterfaceC62602sz A07;
    public final C65842yM A08;
    public final Map A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38978HEg(FragmentActivity fragmentActivity, C61142qc c61142qc, C60972qL c60972qL, JPp jPp, InterfaceC62602sz interfaceC62602sz) {
        super(false);
        AbstractC25233BEq.A0w(2, c60972qL, c61142qc, interfaceC62602sz);
        this.A07 = interfaceC62602sz;
        Context context = c60972qL.A00;
        this.A04 = context;
        UserSession userSession = c60972qL.A01;
        this.A05 = userSession;
        InterfaceC60442pS interfaceC60442pS = c60972qL.A02;
        this.A06 = interfaceC60442pS;
        C37443GeN c37443GeN = new C37443GeN(fragmentActivity, fragmentActivity, c61142qc, c60972qL, true, true);
        this.A01 = c37443GeN;
        HF7 hf7 = new HF7(interfaceC60442pS, userSession, jPp);
        this.A03 = hf7;
        C65842yM c65842yM = new C65842yM(context);
        this.A08 = c65842yM;
        this.A02 = new C155946zO(null, C38U.A00, C05F.A00);
        this.A09 = AbstractC166987dD.A1G();
        init(c65842yM, c37443GeN, hf7);
    }

    public final void A00() {
        this.A00 = true;
        clear();
        C155946zO c155946zO = this.A02;
        c155946zO.A06();
        if (!isEmpty()) {
            c155946zO.A01 = false;
            int A02 = c155946zO.A02();
            for (int i = 0; i < A02; i++) {
                C38321qM c38321qM = (C38321qM) ((AbstractC65332xV) c155946zO).A01.get(i);
                C75113Zb BRZ = BRZ(c38321qM);
                BRZ.A0D(i);
                addModel(c38321qM, BRZ, this.A01);
                InterfaceC43546JLg A03 = AbstractC82403m3.A03(c38321qM);
                if (A03 != null) {
                    addModel(AbstractC166987dD.A1L(c38321qM, A03), C0eB.A00, this.A03);
                }
            }
        }
        InterfaceC62602sz interfaceC62602sz = this.A07;
        if (interfaceC62602sz.CLJ() || interfaceC62602sz.CUG() || interfaceC62602sz.isLoading()) {
            addModel(interfaceC62602sz, this.A08);
        }
        notifyDataSetChanged();
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ void A8q(Object obj, int i) {
    }

    @Override // X.InterfaceC61772re, X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        Map map = this.A09;
        Object obj = map.get(c38321qM);
        Object obj2 = obj;
        if (obj == null) {
            C75113Zb A0E = AbstractC37303Gc4.A0E(c38321qM);
            A0E.A0A(AbstractC76283bY.A00(c38321qM));
            map.put(c38321qM, A0E);
            obj2 = A0E;
        }
        return (C75113Zb) obj2;
    }

    @Override // X.InterfaceC65282xQ
    public final void Ct5() {
        this.A00 = false;
    }

    @Override // X.InterfaceC65272xP
    public final void ETA(InterfaceC686036x interfaceC686036x) {
        C14360o3.A0B(interfaceC686036x, 0);
        this.A01.A03(interfaceC686036x);
    }

    @Override // X.InterfaceC65272xP
    public final void EUR(C33P c33p) {
        C14360o3.A0B(c33p, 0);
        this.A01.A03 = c33p;
    }

    @Override // X.InterfaceC65282xQ
    public final boolean CSO() {
        return this.A00;
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    @Override // X.C2UT, android.widget.Adapter
    public final boolean isEmpty() {
        if (this.A02.A02() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC65282xQ
    public final void AVK() {
        A00();
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ List CCN() {
        return AbstractC166987dD.A1E();
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ int BK6(String str) {
        return -1;
    }

    @Override // X.InterfaceC65232xL
    public final void CtR(C38321qM c38321qM) {
        A00();
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ Object EFR(int i) {
        return null;
    }
}
