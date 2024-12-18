package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes5.dex */
public final class BPM implements JIH {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    @Override // X.JIH
    public final void E1V() {
    }

    public BPM(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = z;
        this.A01 = obj;
    }

    @Override // X.JIH
    public final void Dby(C120985dq c120985dq, int i, int i2, boolean z) {
        if (this.A00 != 0 && this.A04) {
            float f = i / i2;
            C51762Yz c51762Yz = (C51762Yz) this.A01;
            C26556BoF c26556BoF = (C26556BoF) this.A03;
            C120985dq c120985dq2 = (C120985dq) this.A02;
            c51762Yz.A03(new DHY(c120985dq2, c26556BoF, f, 13));
            InterfaceC16660sJ interfaceC16660sJ = c26556BoF.A03;
            boolean z2 = false;
            if (c26556BoF.A00.A06() == 0 && c120985dq2 != null) {
                double d = f;
                UserSession userSession = c26556BoF.A01;
                if (d >= C18U.A00(AbstractC25225BEi.A0j(userSession, 0), userSession, 37173586192499295L)) {
                    z2 = true;
                }
            }
            interfaceC16660sJ.invoke(Boolean.valueOf(z2));
        }
    }

    @Override // X.JIH
    public final void DzC(C120985dq c120985dq, int i, int i2) {
        if (this.A00 != 0) {
            if (!this.A04) {
                C51762Yz c51762Yz = (C51762Yz) this.A01;
                C26556BoF c26556BoF = (C26556BoF) this.A03;
                Object obj = this.A02;
                c51762Yz.A03(new C30171DRb(i2, 17, obj, c26556BoF));
                InterfaceC16660sJ interfaceC16660sJ = c26556BoF.A03;
                boolean z = true;
                if (c26556BoF.A00.A06() != 0 || obj == null || i2 < 1) {
                    z = false;
                }
                AbstractC25227BEk.A1Q(interfaceC16660sJ, z);
                return;
            }
            return;
        }
        C14360o3.A0B(c120985dq, 0);
        C120985dq c120985dq2 = (C120985dq) this.A02;
        UserSession userSession = ((BPL) this.A03).A03;
        boolean z2 = this.A04;
        AbstractC167007dF.A1D(c120985dq2, 0, userSession);
        if (!AbstractC37760GjZ.A00(c120985dq2, c120985dq, userSession, i2, z2)) {
            return;
        }
        ((C51762Yz) this.A01).A00();
    }

    @Override // X.JIH
    public final void DzP(C120985dq c120985dq, Integer num, int i) {
    }

    @Override // X.JIH
    public final void E1U(C120985dq c120985dq, InterfaceC31077DlK interfaceC31077DlK, boolean z) {
    }

    @Override // X.JIH
    public final void D8r(C120985dq c120985dq, List list) {
    }

    @Override // X.JIH
    public final void Dbv(C25370BKn c25370BKn, boolean z) {
    }

    @Override // X.JIH
    public final void DzJ(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzL(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzO(C120985dq c120985dq, C37644Ghd c37644Ghd, C37563GgJ c37563GgJ, C25370BKn c25370BKn, boolean z) {
    }
}
