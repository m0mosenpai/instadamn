package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Ghw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37663Ghw implements C38Y, InterfaceC43071ya {
    public boolean A00;
    public final UserSession A01;
    public final C37560GgG A02;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        JIM jim;
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        C75113Zb c75113Zb = ((C37644Ghd) c59062n7.A04).A0E;
        if (c75113Zb != null) {
            int position = c75113Zb.getPosition();
            float CGk = interfaceC57162jr.CGk(c59062n7);
            if (CGk != 1.0f) {
                C120985dq c120985dq = (C120985dq) c59062n7.A03;
                int A01 = AbstractC37301Gc2.A01(c59062n7, interfaceC57162jr);
                if (A01 != 0 && A01 == A1R) {
                    UserSession userSession = this.A01;
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (C18U.A06(c06090Tz, userSession, 36326421072983923L)) {
                        if (CGk > ((float) C18U.A00(c06090Tz, userSession, 37170846002971161L)) && c120985dq.CdW()) {
                            C37560GgG c37560GgG = this.A02;
                            if (!c37560GgG.A0e(c120985dq.getId())) {
                                c37560GgG.A0X(false);
                                c37560GgG.A0M(c120985dq, position);
                                String id = c120985dq.getId();
                                Map map = c37560GgG.A0H.A00;
                                for (Object obj : map.keySet()) {
                                    C14360o3.A0B(obj, 0);
                                    JIM jim2 = (JIM) map.get(obj);
                                    if (!obj.equals(id) && jim2 != null && jim2.Cfm() == A1R && (jim = (JIM) map.get(obj)) != null) {
                                        jim.E3c("percent_visibility");
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (C18U.A06(c06090Tz, userSession, 36326421072787313L)) {
                        if (CGk > ((float) C18U.A00(c06090Tz, userSession, 37170846002971161L))) {
                            C37560GgG c37560GgG2 = this.A02;
                            if (!c37560GgG2.A0e(c120985dq.getId())) {
                                c37560GgG2.A0X(false);
                                c37560GgG2.A0M(c120985dq, position);
                                return;
                            }
                            return;
                        }
                        if (CGk < ((float) C18U.A00(c06090Tz, userSession, 37170846002971161L))) {
                            C14360o3.A0A(c120985dq);
                            C37560GgG c37560GgG3 = this.A02;
                            if (c37560GgG3.A0e(c120985dq.getId())) {
                                c37560GgG3.A0S(c120985dq, "percent_visibility", false, false);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXc(int i, int i2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DY0() {
    }

    @Override // X.C38Y
    public final void Dj0(Integer num) {
        C14360o3.A0B(num, 0);
        if (num.intValue() == 0 && this.A00) {
            this.A02.A0H();
            this.A00 = false;
        }
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrV() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrY(C120985dq c120985dq, int i) {
    }

    @Override // X.C38Y
    public final void DXR(int i) {
        this.A02.A0X(false);
    }

    @Override // X.C38Y
    public final void DXS(int i) {
        C37560GgG c37560GgG = this.A02;
        c37560GgG.A0X(false);
        c37560GgG.A0N(null, i);
    }

    @Override // X.C38Y
    public final void DXa(int i, int i2) {
        if (i == i2) {
            this.A00 = true;
        }
    }

    public C37663Ghw(UserSession userSession, C37560GgG c37560GgG) {
        this.A01 = userSession;
        this.A02 = c37560GgG;
    }

    @Override // X.C38Y
    public final void Dim(float f, float f2) {
    }
}
