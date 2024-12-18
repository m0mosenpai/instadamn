package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes7.dex */
public final class HEM extends C7E1 implements InterfaceC65242xM, InterfaceC65252xN, InterfaceC152956uP {
    public final UserSession A00;
    public final C155946zO A01;
    public final C38333GtS A02;
    public final C55101ObE A03;
    public final HFL A04;
    public final InterfaceC62602sz A05;
    public final C65842yM A06;
    public final InterfaceC16660sJ A07;
    public final Context A08;
    public final Map A09;

    public HEM(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38333GtS c38333GtS, C55101ObE c55101ObE, C38U c38u, InterfaceC62602sz interfaceC62602sz, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC25233BEq.A0w(2, userSession, interfaceC62602sz, c38u);
        C14360o3.A0B(c38333GtS, 6);
        this.A08 = context;
        this.A00 = userSession;
        this.A05 = interfaceC62602sz;
        this.A02 = c38333GtS;
        this.A03 = c55101ObE;
        this.A07 = interfaceC16660sJ;
        this.A01 = new C155946zO(null, c38u, C05F.A01);
        this.A09 = AbstractC166987dD.A1G();
        HFL hfl = new HFL(context, interfaceC11380iw, userSession, new C42609ItS(this), new C42611ItU(this), true, false, true);
        this.A04 = hfl;
        C65842yM c65842yM = new C65842yM(context);
        this.A06 = c65842yM;
        A0B(hfl, c65842yM);
    }

    @Override // X.InterfaceC152956uP
    public final C153336v2 BQs(String str) {
        C14360o3.A0B(str, 0);
        Map map = this.A09;
        C153336v2 c153336v2 = (C153336v2) map.get(str);
        if (c153336v2 == null) {
            C153336v2 c153336v22 = new C153336v2();
            c153336v22.A03 = true;
            map.put(str, c153336v22);
            return c153336v22;
        }
        return c153336v2;
    }

    @Override // X.InterfaceC65252xN
    public final void EVk(int i) {
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public final void A0C() {
        A06();
        C155946zO c155946zO = this.A01;
        c155946zO.A06();
        int A02 = c155946zO.A02();
        for (int i = 0; i < A02; i++) {
            Object A0F = c155946zO.A0F(i);
            C153336v2 BQs = BQs(AbstractC166997dE.A0u(A0F));
            boolean z = true;
            if (this.A05.CLJ() || i != c155946zO.A02() - 1) {
                z = false;
            }
            BQs.A00(i, z);
            A09(this.A04, A0F, BQs);
        }
        InterfaceC62602sz interfaceC62602sz = this.A05;
        if (interfaceC62602sz.CLJ()) {
            A08(this.A06, interfaceC62602sz);
        }
        A07();
    }
}
