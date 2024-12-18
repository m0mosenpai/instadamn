package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Ggx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37602Ggx extends AbstractC37623GhI implements JIH, C38Y {
    public int A00;
    public Runnable A01;
    public final C37560GgG A02;
    public final UserSession A03;

    public C37602Ggx(UserSession userSession, C37560GgG c37560GgG) {
        C14360o3.A0B(c37560GgG, 2);
        this.A03 = userSession;
        this.A02 = c37560GgG;
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXR(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXS(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXc(int i, int i2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DY0() {
    }

    @Override // X.JIH
    public final void Dbv(C25370BKn c25370BKn, boolean z) {
        C14360o3.A0B(c25370BKn, 0);
        if (z) {
            if (c25370BKn.A0E.CGb() != 0) {
                RunnableC38234Grd runnableC38234Grd = new RunnableC38234Grd(c25370BKn);
                C11T.A04(runnableC38234Grd, 1000L);
                this.A01 = runnableC38234Grd;
                return;
            }
            return;
        }
        Runnable runnable = this.A01;
        if (runnable != null) {
            C11T.A01(runnable);
        }
        c25370BKn.A0E.setVisibility(8);
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dim(float f, float f2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dj0(Integer num) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrV() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrY(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void E1V() {
    }

    @Override // X.JIH
    public final void D8r(C120985dq c120985dq, List list) {
    }

    @Override // X.C38Y
    public final void DXa(int i, int i2) {
        this.A00 = i;
    }

    @Override // X.JIH
    public final void DzC(C120985dq c120985dq, int i, int i2) {
    }

    @Override // X.JIH
    public final void DzJ(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzL(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzP(C120985dq c120985dq, Integer num, int i) {
    }

    @Override // X.JIH
    public final void E1U(C120985dq c120985dq, InterfaceC31077DlK interfaceC31077DlK, boolean z) {
    }

    @Override // X.JIH
    public final void Dby(C120985dq c120985dq, int i, int i2, boolean z) {
    }

    @Override // X.JIH
    public final void DzO(C120985dq c120985dq, C37644Ghd c37644Ghd, C37563GgJ c37563GgJ, C25370BKn c25370BKn, boolean z) {
    }
}
