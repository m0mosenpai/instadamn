package X;

import android.view.View;
import android.widget.Adapter;
import com.instagram.common.session.UserSession;

/* renamed from: X.42H, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C42H implements InterfaceC62892tS {
    @Override // X.InterfaceC62892tS
    public /* synthetic */ void DXP(int i, int i2) {
    }

    @Override // X.InterfaceC62892tS
    public /* synthetic */ void DXb(int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC62892tS
    public /* synthetic */ void Diq(C3VZ c3vz, float f, float f2) {
    }

    @Override // X.InterfaceC62892tS
    public /* synthetic */ void Diy(C3VZ c3vz, C3VZ c3vz2) {
    }

    @Override // X.InterfaceC62892tS
    public /* synthetic */ void DrZ(int i, int i2) {
    }

    @Override // X.InterfaceC62892tS
    public /* synthetic */ void E0r(View view) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ boolean CtU() {
        return false;
    }

    @Override // X.InterfaceC62892tS
    public /* synthetic */ void DyE(int i, float f) {
        if (this instanceof C42G) {
            C42G c42g = (C42G) this;
            C41J c41j = c42g.A00;
            C41H c41h = c42g.A01;
            C41A c41a = c41j.A02;
            C38321qM c38321qM = c41h.A0C;
            C75113Zb c75113Zb = c41h.A0E;
            C14360o3.A0B(c38321qM, 0);
            C14360o3.A0B(c75113Zb, 1);
            UserSession userSession = c41a.A01;
            if (!c38321qM.CdW() && c38321qM.A4d() && c38321qM.A0p() < c38321qM.A14() && C18U.A06(C06090Tz.A05, userSession, 36316632842572337L)) {
                AbstractC85053qt.A00(userSession, c38321qM, c75113Zb);
            }
            if (f > 0.0f) {
                C3W3 c3w3 = c42g.A04;
                Adapter adapter = c3w3.A09.getAdapter();
                if (adapter != null) {
                    if (adapter.getCount() == i + 1 && !c3w3.A04) {
                        c3w3.A04 = true;
                        InterfaceC60442pS interfaceC60442pS = c42g.A05;
                        UserSession userSession2 = c41j.A01;
                        C82713mZ A04 = AbstractC82703mY.A04(c38321qM, interfaceC60442pS, "gesture");
                        A04.A0G(userSession2, c38321qM);
                        A04.A08(i);
                        A04.A7T = "swipe_left_on_last_card";
                        boolean CdW = c38321qM.CdW();
                        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession2);
                        if (CdW) {
                            Xik.A00(A01, A04, interfaceC60442pS);
                            return;
                        } else {
                            XN2.A00(A01, A04, interfaceC60442pS);
                            return;
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }
}
