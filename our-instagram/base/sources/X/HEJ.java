package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes7.dex */
public final class HEJ extends C7E1 implements InterfaceC65232xL, C3CQ, InterfaceC152956uP {
    public final C155946zO A00;
    public final C155376yQ A01;
    public final C152976uR A02;
    public final AnonymousClass341 A03;
    public final InterfaceC62602sz A04;
    public final C65842yM A05;
    public final Map A06 = AbstractC166987dD.A1G();
    public final Map A07 = AbstractC166987dD.A1G();

    public HEJ(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C155376yQ c155376yQ, C38N c38n, AnonymousClass341 anonymousClass341, C38U c38u, InterfaceC62602sz interfaceC62602sz) {
        this.A01 = c155376yQ;
        this.A04 = interfaceC62602sz;
        this.A03 = anonymousClass341;
        AbstractC167007dF.A1G(userSession, 1, c38u);
        C152976uR c152976uR = new C152976uR(interfaceC11380iw, userSession, null, c38n, c38u, null, null);
        this.A02 = c152976uR;
        c152976uR.A01 = null;
        C65842yM c65842yM = new C65842yM(context);
        this.A05 = c65842yM;
        A0B(c152976uR, c65842yM);
        this.A00 = new C155946zO(new C155936zN(context, interfaceC11380iw, userSession), c38u, C05F.A01);
    }

    @Override // X.C3CQ
    public final boolean AJk(C38321qM c38321qM) {
        return this.A00.A0C(c38321qM);
    }

    @Override // X.InterfaceC152956uP
    public final C153336v2 BQs(String str) {
        return AbstractC37304Gc5.A0G(str, this.A06);
    }

    @Override // X.InterfaceC61772re, X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        Map map = this.A07;
        C75113Zb c75113Zb = (C75113Zb) map.get(c38321qM);
        if (c75113Zb == null) {
            C75113Zb A0E = AbstractC37303Gc4.A0E(c38321qM);
            AnonymousClass341 anonymousClass341 = this.A03;
            C14360o3.A0B(anonymousClass341, 0);
            A0E.A0o = anonymousClass341;
            map.put(c38321qM, A0E);
            return A0E;
        }
        return c75113Zb;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean isEmpty() {
        if (this.A00.A02() != 0) {
            return false;
        }
        return true;
    }

    public final void A0C() {
        A06();
        C155946zO c155946zO = this.A00;
        c155946zO.A08(this.A01);
        for (int i = 0; i < c155946zO.A02(); i++) {
            Object A0F = c155946zO.A0F(i);
            C153336v2 A0G = AbstractC37304Gc5.A0G(AbstractC166997dE.A0u(A0F), this.A06);
            boolean z = true;
            if (this.A04.CLJ() || i != c155946zO.A02() - 1) {
                z = false;
            }
            A0G.A00(i, z);
            A09(this.A02, A0F, A0G);
        }
        InterfaceC62602sz interfaceC62602sz = this.A04;
        if (interfaceC62602sz.CLJ() || interfaceC62602sz.CUG()) {
            A08(this.A05, interfaceC62602sz);
        }
        A07();
    }

    @Override // X.InterfaceC65232xL
    public final void CtR(C38321qM c38321qM) {
        C0fA.A00(this, -1570034876);
    }

    @Override // X.C3CQ
    public final void DSP(C38321qM c38321qM) {
        A0C();
    }
}
