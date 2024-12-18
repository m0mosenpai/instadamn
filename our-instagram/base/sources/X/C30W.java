package X;

import com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.30W, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C30W {
    public static final C30X A02 = new Object();
    public final UserSession A00;
    public final C1M1 A01;

    public C30W(UserSession userSession, C1M1 c1m1) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = c1m1;
    }

    public final C82713mZ A03(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, int i, int i2) {
        String str2;
        if (AbstractC75423a9.A00(c38321qM, interfaceC60442pS)) {
            UserSession userSession = this.A00;
            C82713mZ A04 = AbstractC82703mY.A04(c38321qM, interfaceC60442pS, AnonymousClass001.A0R("carousel_", str));
            A04.A0G(userSession, c38321qM);
            A04.A09(i2);
            A04.A07 = -1;
            String str3 = C1QM.A00.A02.A00;
            if (str3 != null) {
                A04.A6C = str3;
            }
            A04.A2B = true;
            C30X.A01(A04);
            C30X.A00(userSession, A04, c38321qM, interfaceC60442pS.getModuleName());
            C30X.A02(A04, c38321qM.A1e(i));
            A04.A5H = c38321qM.A3B(i);
            C38321qM A1e = c38321qM.A1e(i);
            if (A1e != null) {
                str2 = A1e.A0C.Azz();
            } else {
                str2 = null;
            }
            A04.A5G = str2;
            return A04;
        }
        return null;
    }

    public final C82713mZ A04(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, int i, int i2) {
        C14360o3.A0B(c38321qM, 2);
        C82713mZ A022 = AbstractC82703mY.A02(this.A00, c38321qM, interfaceC60442pS, this.A01, Integer.valueOf(i), Integer.valueOf(i2), str);
        A00(this, A022, c38321qM, interfaceC60442pS);
        return A022;
    }

    public static final void A00(C30W c30w, C82713mZ c82713mZ, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS) {
        InterfaceC39271s5 AaR;
        InterfaceC39271s5 AaR2;
        InterfaceC39541sb injected;
        InterfaceC104874ny BFf;
        IGFormatLiquidityUseCaseEnum B80;
        if (c82713mZ != null) {
            c82713mZ.A5u = C218914p.A01();
            UserSession userSession = c30w.A00;
            c82713mZ.A5x = C55772hI.A00(userSession).A03();
            boolean z = false;
            if (C55772hI.A00(userSession).A03 != null) {
                z = true;
            }
            c82713mZ.A1j = Boolean.valueOf(z);
            HashMap hashMap = new HashMap();
            if (C32U.A03(c38321qM) != null) {
                hashMap.put("product_collection_id", C32U.A03(c38321qM));
            }
            c82713mZ.A8D = hashMap;
            C30X.A01(c82713mZ);
            C30X.A00(userSession, c82713mZ, c38321qM, interfaceC60442pS.getModuleName());
            C30X.A02(c82713mZ, c38321qM);
            if (c38321qM != null && (injected = c38321qM.A0C.getInjected()) != null && (BFf = injected.BFf()) != null && (B80 = BFf.B80()) != null) {
                c82713mZ.A5Q = B80.A00;
            }
            C14360o3.A0B(c38321qM, 1);
            if (c38321qM.CdW()) {
                InterfaceC39541sb injected2 = c38321qM.A0C.getInjected();
                InterfaceC106394qt interfaceC106394qt = null;
                if (injected2 != null && (AaR2 = injected2.AaR()) != null) {
                    interfaceC106394qt = AaR2.B5r();
                }
                boolean z2 = true;
                boolean z3 = false;
                if (interfaceC106394qt != null) {
                    z3 = true;
                }
                InterfaceC39541sb injected3 = c38321qM.A0C.getInjected();
                if (injected3 == null || (AaR = injected3.AaR()) == null || AaR.B5h() == null) {
                    z2 = false;
                }
                c82713mZ.A1E = Boolean.valueOf(z3);
                c82713mZ.A1F = Boolean.valueOf(z2);
            }
        }
    }

    public final C82713mZ A01(C82413m5 c82413m5, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, int i, long j) {
        C14360o3.A0B(c38321qM, 2);
        UserSession userSession = this.A00;
        String A0H = AbstractC41071vF.A0H(userSession, c38321qM.getId());
        C82713mZ A04 = AbstractC82703mY.A04(c38321qM, interfaceC60442pS, "time_spent");
        A04.A0G(userSession, c38321qM);
        A04.A09(i);
        A04.A5e = A0H;
        A04.A0B(j);
        if (c82413m5 != null) {
            A04.A0v = c82413m5;
        }
        C1M1 c1m1 = this.A01;
        if (c1m1 != null) {
            A04.A70 = c1m1.getSessionId();
        }
        return A04;
    }

    public final C82713mZ A02(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, int i) {
        UserSession userSession = this.A00;
        C82713mZ A022 = AbstractC82703mY.A02(userSession, c38321qM, interfaceC60442pS, this.A01, Integer.valueOf(i), -1, "sub_impression");
        C30X.A01(A022);
        C30X.A00(userSession, A022, c38321qM, interfaceC60442pS.getModuleName());
        return A022;
    }

    public final C82713mZ A05(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, int i, int i2) {
        C82713mZ A022 = AbstractC82703mY.A02(this.A00, c38321qM, interfaceC60442pS, this.A01, Integer.valueOf(i), Integer.valueOf(i2), str);
        C30X.A01(A022);
        return A022;
    }

    public final C82713mZ A06(InterfaceC60442pS interfaceC60442pS, C40971v4 c40971v4, String str, int i) {
        C82713mZ A01 = AbstractC82703mY.A01(this.A00, null, interfaceC60442pS, c40971v4, this.A01, Integer.valueOf(i), str);
        A00(this, A01, c40971v4.A0K, interfaceC60442pS);
        return A01;
    }
}
