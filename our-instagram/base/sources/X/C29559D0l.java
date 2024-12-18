package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.D0l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29559D0l implements JIH {
    public final int A00;
    public final Object A01;
    public final Object A02;

    @Override // X.JIH
    public final void E1V() {
    }

    public C29559D0l(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.JIH
    public final void Dby(C120985dq c120985dq, int i, int i2, boolean z) {
        if (this.A00 != 0) {
            C14360o3.A0B(c120985dq, 0);
            AbstractC25227BEk.A1L((C51762Yz) this.A01, ((C26463Bmk) this.A02).A02.CT2(c120985dq));
        }
    }

    @Override // X.JIH
    public final void DzC(C120985dq c120985dq, int i, int i2) {
        InterfaceC110214xq A1R;
        if (this.A00 == 0) {
            C14360o3.A0B(c120985dq, 0);
            C26495BnG c26495BnG = (C26495BnG) this.A02;
            C120985dq c120985dq2 = c26495BnG.A01;
            if (C14360o3.A0K(c120985dq2.getId(), c120985dq.getId())) {
                EnumC25479BOs enumC25479BOs = c26495BnG.A06;
                if (enumC25479BOs == EnumC25479BOs.A0J || enumC25479BOs == EnumC25479BOs.A0K) {
                    UserSession userSession = c26495BnG.A04;
                    C14360o3.A0B(userSession, 1);
                    if (!AbstractC37760GjZ.A00(c120985dq2, c120985dq, userSession, i2, AbstractC76643c9.A0H(userSession, c120985dq2.A02))) {
                        C38321qM c38321qM = c120985dq2.A02;
                        if ((c38321qM != null && (A1R = c38321qM.A1R()) != null && A1R.BsT() != null && i2 == 2) || i2 == 2) {
                            ((C51762Yz) this.A01).A03(DR7.A00);
                        }
                    }
                }
            }
        }
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
