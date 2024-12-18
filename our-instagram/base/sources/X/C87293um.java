package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3um, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87293um implements InterfaceC87303un {
    public final Fragment A00;
    public final C675432t A01;
    public final UserSession A02;
    public final C1GL A03;
    public final InterfaceC60442pS A04;
    public final InterfaceC65282xQ A05;

    public C87293um(Fragment fragment, C675432t c675432t, UserSession userSession, C1GL c1gl, InterfaceC60442pS interfaceC60442pS, InterfaceC65282xQ interfaceC65282xQ) {
        C14360o3.A0B(c1gl, 3);
        C14360o3.A0B(c675432t, 6);
        this.A02 = userSession;
        this.A00 = fragment;
        this.A03 = c1gl;
        this.A05 = interfaceC65282xQ;
        this.A04 = interfaceC60442pS;
        this.A01 = c675432t;
    }

    @Override // X.InterfaceC87303un
    public final void D6F(C84923qg c84923qg, C38321qM c38321qM, C75113Zb c75113Zb) {
        C1ON A01;
        C19280xC A00;
        String str;
        boolean z = c84923qg.A0O;
        UserSession userSession = this.A02;
        String str2 = c84923qg.A0G;
        String moduleName = this.A04.getModuleName();
        boolean z2 = c75113Zb.A2U;
        int position = c75113Zb.getPosition();
        int i = c75113Zb.A03;
        if (z) {
            A01 = AbstractC55152OdF.A02(userSession, c38321qM, str2, moduleName, position, i, z2, true);
        } else {
            A01 = AbstractC55152OdF.A01(userSession, c38321qM, str2, moduleName, position, i, z2, true);
        }
        A01.A00 = new N9M(this, c84923qg, c38321qM);
        this.A03.schedule(A01);
        A00(this, c84923qg, c38321qM);
        C675432t c675432t = this.A01;
        int i2 = c75113Zb.A03;
        int position2 = c75113Zb.getPosition();
        if (z) {
            UserSession userSession2 = c675432t.A03;
            InterfaceC60442pS interfaceC60442pS = c675432t.A04;
            String A002 = AbstractC111324zv.A00(4153);
            C82713mZ A03 = AbstractC82703mY.A03(userSession2, c38321qM, interfaceC60442pS, A002);
            A03.A4u = c84923qg.A0G;
            User user = c84923qg.A08;
            if (user != null) {
                str = user.getId();
            } else {
                str = null;
            }
            A03.A4w = str;
            A03.A6r = c84923qg.A0d;
            A03.A6Q = c84923qg.A0F;
            A03.A80 = c84923qg.A0L;
            A03.A1f = Boolean.valueOf(interfaceC60442pS.isOrganicEligible());
            if (!C5I7.A00(userSession2, A03, interfaceC60442pS, C05F.A01)) {
                A00 = C675432t.A00(c675432t, c84923qg, c38321qM, A002);
                AbstractC40564Hyk.A00(A00, userSession2, c38321qM.BQN(), i2, position2, AbstractC75423a9.A02(c38321qM, interfaceC60442pS));
            } else {
                return;
            }
        } else {
            A00 = C675432t.A00(c675432t, c84923qg, c38321qM, AbstractC111324zv.A00(2162));
            C38321qM BQN = c38321qM.BQN();
            AbstractC40564Hyk.A00(A00, c675432t.A03, BQN, i2, position2, AbstractC75423a9.A02(c38321qM, c675432t.A04));
            String loggingInfoToken = BQN.A0C.getLoggingInfoToken();
            if (loggingInfoToken != null) {
                A00.A0C("ranking_info_token", loggingInfoToken);
            }
        }
        c675432t.A01.EHW(A00);
    }

    public static final void A00(C87293um c87293um, C84923qg c84923qg, C38321qM c38321qM) {
        AnonymousClass548.A00();
        UserSession userSession = c87293um.A02;
        if (c84923qg.A0O) {
            AbstractC55029OXl.A02(userSession, c84923qg, c38321qM);
            C84923qg A00 = AbstractC55029OXl.A00(c84923qg, c38321qM);
            if (A00 != null && A00 != c84923qg) {
                AbstractC55029OXl.A02(userSession, A00, c38321qM);
            }
            C84923qg A002 = c38321qM.A1Z().A00(c84923qg.A0G);
            if (A002 != null && A002 != c84923qg) {
                AbstractC55029OXl.A02(userSession, A002, c38321qM);
            }
        } else {
            AbstractC55029OXl.A01(userSession, c84923qg, c38321qM);
            C84923qg A003 = AbstractC55029OXl.A00(c84923qg, c38321qM);
            if (A003 != null && A003 != c84923qg) {
                AbstractC55029OXl.A01(userSession, A003, c38321qM);
            }
            C84923qg A004 = c38321qM.A1Z().A00(c84923qg.A0G);
            if (A004 != null && A004 != c84923qg) {
                AbstractC55029OXl.A01(userSession, A004, c38321qM);
            }
        }
        if (c87293um.A00.isVisible()) {
            c87293um.A05.CtR(c38321qM);
        }
    }
}
