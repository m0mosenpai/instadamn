package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.fx.access.sso.FxSsoViewModel;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.BkR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26320BkR extends AbstractC51572Yf {
    public final FoaUserSession A00;
    public final String A01;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        ComponentActivity componentActivity;
        InterfaceC16820sZ c29724D8u;
        InterfaceC16820sZ mec;
        C14360o3.A0B(c76223bS, 0);
        C2XE c2xe = c76223bS.A05;
        Object A06 = c2xe.A06(CWZ.class);
        if (A06 != null) {
            C75933ay c75933ay = C51722Yv.A02;
            long A0F = AbstractC25229BEm.A0F();
            long A0N = AbstractC25230BEn.A0N();
            C51722Yv A00 = C9CU.A00(null, C05F.A0E, 0, A0F);
            Integer num = C05F.A08;
            C51722Yv A0E = AbstractC25234BEr.A0E(A00, AbstractC25225BEi.A0n(num, 0, A0F), 0, A0N);
            C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
            String A0F2 = AbstractC77623dm.A0F(A0P, 2131977152);
            Integer num2 = C05F.A01;
            Integer num3 = C05F.A00;
            Activity A002 = C51362Xj.A00(AbstractC77363dM.A00(A0P));
            FoaUserSession foaUserSession = this.A00;
            String str = this.A01;
            AbstractC167007dF.A1D(foaUserSession, 1, str);
            if (A002 == null) {
                c29724D8u = DEG.A00;
            } else {
                UserSession A003 = AbstractC28057CYl.A00(foaUserSession);
                InterfaceC02900Bo A004 = C0BQ.A00(A003);
                Activity A005 = C51362Xj.A00(A002);
                if (A005 instanceof ComponentActivity) {
                    componentActivity = (ComponentActivity) A005;
                } else {
                    componentActivity = null;
                }
                Bundle bundle = A004.AEY(A002, null, A003, str, false).A00;
                if (componentActivity != null) {
                    C35020Fbt c35020Fbt = new C35020Fbt(componentActivity, A003, true);
                    if (c35020Fbt.A02()) {
                        FxSsoViewModel fxSsoViewModel = (FxSsoViewModel) new C52942bb(componentActivity).A00(FxSsoViewModel.class);
                        fxSsoViewModel.A03(componentActivity, bundle, A003);
                        ((C2GT) fxSsoViewModel.A03.getValue()).A06(componentActivity, new C35762Fqz(3, bundle, c35020Fbt));
                    }
                }
                c29724D8u = new C29724D8u(A003, A06, A002, bundle, str, AbstractC111324zv.A00(822), 1);
            }
            EnumC27424C8r enumC27424C8r = EnumC27424C8r.FILLED;
            C28138Cal c28138Cal = C28138Cal.A00;
            A0P.A00(new C26499BnK(enumC27424C8r, null, c28138Cal, A0F2, num2, num3, num3, c29724D8u, true));
            String A0F3 = AbstractC77623dm.A0F(A0P, 2131977150);
            C51722Yv A006 = new C51722Yv(null, null).A00(C9CU.A00(null, num, 0, AbstractC25230BEn.A0L()));
            Activity A007 = C51362Xj.A00(AbstractC77363dM.A00(A0P));
            if (A007 == null) {
                mec = DEF.A00;
            } else {
                UserSession A008 = AbstractC28057CYl.A00(foaUserSession);
                InterfaceC02900Bo A009 = C0BQ.A00(A008);
                A009.AEY(A007, null, A008, str, true);
                mec = new MEC(A009, A06, A008, A007, str, 7);
            }
            return AbstractC25227BEk.A0V(new C26499BnK(enumC27424C8r, A006, c28138Cal, A0F3, num2, num2, num3, mec, true), A0P, c76223bS, A0E);
        }
        throw AbstractC166997dE.A0g();
    }

    public C26320BkR(FoaUserSession foaUserSession, String str) {
        this.A00 = foaUserSession;
        this.A01 = str;
    }
}
