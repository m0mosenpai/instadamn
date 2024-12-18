package X;

import com.instagram.common.session.UserSession;
import java.util.Arrays;

/* renamed from: X.30U, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C30U implements C30V {
    public final UserSession A00;
    public final C30W A01;
    public final StringBuilder A02 = new StringBuilder();

    @Override // X.C30V
    public final /* bridge */ /* synthetic */ void Cls(C11520jB c11520jB, C1NI c1ni, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
        C38321qM c38321qM = (C38321qM) c1ni;
        C30W c30w = this.A01;
        C14360o3.A0B(interfaceC60442pS, 1);
        C14360o3.A0B(c38321qM, 2);
        C82713mZ A02 = c30w.A02(c38321qM, interfaceC60442pS, i2);
        if (A02 != null) {
            UserSession userSession = this.A00;
            A02.A8J = AbstractC41071vF.A0R(userSession, c38321qM);
            C30W.A02.A03(userSession, A02, c38321qM, null, this.A02);
            A00(A02, c38321qM, interfaceC60442pS, i2);
            A02.A0E(c11520jB);
            C32U.A0E(userSession, A02, c38321qM, interfaceC60442pS, i);
        }
    }

    @Override // X.C30V
    public final /* bridge */ /* synthetic */ void Clt(C1NI c1ni, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
        C38321qM c38321qM = (C38321qM) c1ni;
        C30W c30w = this.A01;
        String A00 = AbstractC111324zv.A00(1314);
        C14360o3.A0B(c38321qM, 2);
        C82713mZ A05 = c30w.A05(c38321qM, interfaceC60442pS, A00, i2, -1);
        if (A05 != null) {
            C32U.A0E(this.A00, A05, c38321qM, interfaceC60442pS, i);
        }
    }

    @Override // X.C30V
    public final /* bridge */ /* synthetic */ void Cm8(C82413m5 c82413m5, C1NI c1ni, InterfaceC60442pS interfaceC60442pS, int i, int i2, long j) {
        C38321qM c38321qM = (C38321qM) c1ni;
        C32U.A0E(this.A00, this.A01.A01(c82413m5, c38321qM, interfaceC60442pS, i2, j), c38321qM, interfaceC60442pS, i);
    }

    @Override // X.C30V
    public final /* bridge */ /* synthetic */ void CmR(C1NI c1ni, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
        C38321qM c38321qM = (C38321qM) c1ni;
        C30W c30w = this.A01;
        C14360o3.A0B(c38321qM, 2);
        C82713mZ A05 = c30w.A05(c38321qM, interfaceC60442pS, "viewed_impression", i2, -1);
        if (A05 != null) {
            C32U.A0E(this.A00, A05, c38321qM, interfaceC60442pS, i);
        }
    }

    @Override // X.C30V
    public final void Cig(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
        C82713mZ A03 = this.A01.A03(c38321qM, interfaceC60442pS, "impression", i, i2);
        if (A03 != null) {
            UserSession userSession = this.A00;
            A03.A8J = AbstractC41071vF.A0R(userSession, c38321qM);
            C32U.A0F(userSession, A03, c38321qM, interfaceC60442pS, C05F.A01, i, true);
        }
    }

    @Override // X.C30V
    public final void Cih(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
        C82713mZ A03 = this.A01.A03(c38321qM, interfaceC60442pS, "sub_impression", i, i2);
        if (A03 != null) {
            UserSession userSession = this.A00;
            A03.A8J = AbstractC41071vF.A0R(userSession, c38321qM);
            C32U.A0F(userSession, A03, c38321qM, interfaceC60442pS, C05F.A00, i, true);
        }
    }

    @Override // X.C30V
    public final void Cii(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
        C30W c30w = this.A01;
        String A00 = AbstractC111324zv.A00(1314);
        C14360o3.A0B(c38321qM, 2);
        C82713mZ A03 = c30w.A03(c38321qM, interfaceC60442pS, A00, i, i2);
        if (A03 != null) {
            C32U.A0F(this.A00, A03, c38321qM, interfaceC60442pS, C05F.A00, i, true);
        }
    }

    @Override // X.C30V
    public final void Cik(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, int i, int i2, long j) {
        UserSession userSession = this.A01.A00;
        C82713mZ A04 = AbstractC82703mY.A04(c38321qM, interfaceC60442pS, AnonymousClass001.A0R("carousel_", "time_spent"));
        A04.A0G(userSession, c38321qM);
        A04.A09(i2);
        A04.A0B(j);
        C32U.A0F(this.A00, A04, c38321qM, interfaceC60442pS, C05F.A00, i, true);
    }

    @Override // X.C30V
    public final void Cil(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
        C30W c30w = this.A01;
        C14360o3.A0B(c38321qM, 2);
        C82713mZ A03 = c30w.A03(c38321qM, interfaceC60442pS, "viewed_impression", i, i2);
        if (A03 != null) {
            C32U.A0F(this.A00, A03, c38321qM, interfaceC60442pS, C05F.A00, i, true);
        }
    }

    @Override // X.C30V
    public final /* bridge */ /* synthetic */ void Ck5(C11520jB c11520jB, C1NI c1ni, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
        C38321qM c38321qM = (C38321qM) c1ni;
        C30W c30w = this.A01;
        C14360o3.A0B(interfaceC60442pS, 1);
        C14360o3.A0B(c38321qM, 2);
        C82713mZ A04 = c30w.A04(c38321qM, interfaceC60442pS, "impression", i2, -1);
        if (A04 != null) {
            UserSession userSession = this.A00;
            A04.A8J = AbstractC41071vF.A0R(userSession, c38321qM);
            C30W.A02.A03(userSession, A04, c38321qM, null, this.A02);
            A04.A0E(c11520jB);
            A00(A04, c38321qM, interfaceC60442pS, i2);
            C32U.A0F(userSession, A04, c38321qM, interfaceC60442pS, C05F.A01, i, false);
        }
    }

    public C30U(UserSession userSession, C1M1 c1m1) {
        this.A01 = new C30W(userSession, c1m1);
        this.A00 = userSession;
    }

    public static void A00(C82713mZ c82713mZ, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, int i) {
        Integer num;
        if (("feed_timeline".equals(interfaceC60442pS.getModuleName()) || "feed_contextual_chain".equals(interfaceC60442pS.getModuleName()) || "feed_contextual_keyword".equals(interfaceC60442pS.getModuleName())) && c38321qM.CdW()) {
            C3GC c3gc = C3GC.A02;
            c82713mZ.A0Q(Integer.valueOf(c3gc.A00(C5Hq.AD, i)));
            c82713mZ.A0S(Integer.valueOf(c3gc.A00(C5Hq.NETEGO, i)));
            String id = c38321qM.getId();
            C14360o3.A0B(id, 0);
            String str = (String) C5MA.A00.get(id);
            if (str == null) {
                str = "timeline_request";
            }
            c82713mZ.A4Z = str;
            C5Hq c5Hq = C5Hq.STANDALONE_MULTI_AD;
            C5Hq c5Hq2 = C5Hq.PAE_MULTI_AD;
            c82713mZ.A0R(Integer.valueOf(c3gc.A01(Arrays.asList(c5Hq, c5Hq2), i)));
            C5Hq A02 = c3gc.A02(Arrays.asList(c5Hq, c5Hq2), i);
            if (A02 == c5Hq2) {
                num = C05F.A0N;
            } else if (A02 == c5Hq) {
                num = C05F.A0C;
            } else {
                num = C05F.A00;
            }
            c82713mZ.A0U(Integer.valueOf(C5MB.A00(num)));
        }
    }
}
