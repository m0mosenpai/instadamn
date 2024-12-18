package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Ggm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37591Ggm extends AbstractC37623GhI implements C38Y {
    public final C37546Gg2 A00;
    public final Context A01;
    public final FragmentActivity A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;

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

    public static final void A00(C37591Ggm c37591Ggm) {
        int A03;
        C120985dq A0F;
        C38321qM c38321qM;
        C37556GgC c37556GgC = ((AbstractC37623GhI) c37591Ggm).A02;
        if (c37556GgC != null && (A03 = c37556GgC.A03()) >= 0) {
            AbstractC37552Gg8 abstractC37552Gg8 = c37591Ggm.A00.A0A;
            if (A03 < abstractC37552Gg8.A0B() && (A0F = abstractC37552Gg8.A0F(A03)) != null) {
                Context context = c37591Ggm.A01;
                FragmentActivity fragmentActivity = c37591Ggm.A02;
                UserSession userSession = c37591Ggm.A04;
                InterfaceC11380iw interfaceC11380iw = c37591Ggm.A03;
                C14360o3.A0B(context, 0);
                AbstractC25233BEq.A0v(1, fragmentActivity, userSession, interfaceC11380iw);
                String str = null;
                User A09 = A0F.A09(userSession);
                if (A09 != null) {
                    str = A09.getId();
                }
                if (C14360o3.A0K(str, userSession.userId) && AbstractC37907Gm4.A00(userSession, A0F.A02) && (c38321qM = A0F.A02) != null) {
                    InterfaceC19630xq A032 = C1AT.A01(userSession).A03(C1AV.A0m);
                    if (!A032.contains(c38321qM.getId())) {
                        InterfaceC19610xo ARD = A032.ARD();
                        ARD.E77(c38321qM.getId(), true);
                        ARD.apply();
                        C38321qM c38321qM2 = A0F.A02;
                        if (c38321qM2 != null) {
                            fragmentActivity.runOnUiThread(new RunnableC36974GQr(fragmentActivity, context, interfaceC11380iw, userSession, c38321qM2));
                        }
                    }
                }
            }
        }
    }

    public C37591Ggm(Context context, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C37546Gg2 c37546Gg2) {
        AbstractC37302Gc3.A1U(userSession, interfaceC11380iw);
        this.A01 = context;
        this.A02 = fragmentActivity;
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A00 = c37546Gg2;
    }

    @Override // X.C38Y
    public final void DXa(int i, int i2) {
        A00(this);
    }
}
