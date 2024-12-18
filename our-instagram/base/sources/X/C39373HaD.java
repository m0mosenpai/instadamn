package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HaD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39373HaD extends C31D {
    public final UserSession A00;
    public final C38018Go6 A01;
    public final InterfaceC60442pS A02;
    public final AnonymousClass318 A03;
    public final C31A A04;

    public C39373HaD(UserSession userSession, C38018Go6 c38018Go6, AnonymousClass318 anonymousClass318, InterfaceC60442pS interfaceC60442pS, C31A c31a) {
        super(userSession, anonymousClass318, interfaceC60442pS, null, c31a, "session_id_not_defined_for_Discovery_Chaining", null);
        this.A00 = userSession;
        this.A02 = interfaceC60442pS;
        this.A03 = anonymousClass318;
        this.A04 = c31a;
        this.A01 = c38018Go6;
    }

    private final void A00(InterfaceC42381xS interfaceC42381xS, C1PZ c1pz, String str) {
        String str2;
        Integer num;
        String str3;
        Integer num2;
        List list;
        UserSession userSession = this.A00;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36317006504399633L);
        Object BUM = interfaceC42381xS.BUM();
        InterfaceC60442pS interfaceC60442pS = this.A02;
        C82713mZ A04 = AbstractC82703mY.A04((C1NI) BUM, interfaceC60442pS, str);
        C40971v4 c40971v4 = (C40971v4) BUM;
        AbstractC37303Gc4.A1E(userSession, A04, c40971v4, interfaceC42381xS);
        AbstractC37302Gc3.A1S(A04, c1pz);
        AbstractC37303Gc4.A1G(A04, this, interfaceC42381xS, c1pz);
        A04.A1G = Boolean.valueOf(AbstractC23021Ah.A00(userSession).A1k());
        C38321qM c38321qM = c40971v4.A0K;
        A04.A8J = AbstractC41071vF.A0R(userSession, c38321qM);
        AbstractC37300Gc1.A10(userSession, A04);
        AbstractC37303Gc4.A1D(userSession, A04);
        Integer num3 = C05F.A00;
        Integer num4 = c1pz.A0C;
        if (num3 == num4) {
            A04.A0G = c1pz.A03;
            if (A06) {
                C3YO A00 = C3YM.A00(userSession);
                Integer A01 = A00.A01(interfaceC60442pS);
                Integer A02 = A00.A02(interfaceC60442pS);
                AbstractC37302Gc3.A1O(interfaceC60442pS, A04, A00);
                A04.A31 = A01;
                A04.A32 = A02;
                A00.A06(interfaceC60442pS, Integer.valueOf(c1pz.A03));
            }
        } else if (C05F.A01 == num4) {
            A04.A08 = c1pz.A03;
            A04.A02 = c1pz.A00;
            if (A06) {
                C3YM.A00(userSession).A05(interfaceC60442pS, Integer.valueOf(c1pz.A03));
            }
            String A0U = AbstractC37303Gc4.A0U(A04, c38321qM);
            if (A0U.length() > 0) {
                A04.A6J = A0U;
            }
        }
        AbstractC37303Gc4.A1H(A04, c1pz, AbstractC166987dD.A1b(c1pz.A00()) ? 1 : 0);
        Integer valueOf = Integer.valueOf(c1pz.A03);
        if (c38321qM != null && valueOf != null) {
            Integer A2N = c38321qM.A2N();
            int intValue = valueOf.intValue();
            int i = intValue - 1;
            List list2 = null;
            if (i >= 0) {
                C38018Go6 c38018Go6 = this.A01;
                if (i < AbstractC31172DnG.A19(((C42748Ivm) ((AbstractC65202xI) c38018Go6).A00).A01).size()) {
                    C38321qM A022 = C3XH.A02(c38018Go6.A04(i));
                    if (A022 != null) {
                        str3 = A022.getId();
                        num2 = A022.A2M();
                        list = A022.A0e;
                    } else {
                        str3 = null;
                        num2 = null;
                        list = null;
                    }
                    String A002 = AbstractC77343dK.A00(list);
                    if (str3 != null) {
                        A04.A6L = str3;
                    }
                    if (num2 != null) {
                        A04.A0D = num2.intValue();
                    }
                    if (A002 != null) {
                        A04.A59 = A002;
                    }
                }
            }
            if (c1pz.A0C == C05F.A01) {
                intValue++;
            }
            if (intValue >= 0) {
                C38018Go6 c38018Go62 = this.A01;
                if (intValue < AbstractC31172DnG.A19(((C42748Ivm) ((AbstractC65202xI) c38018Go62).A00).A01).size()) {
                    C38321qM A023 = C3XH.A02(c38018Go62.A04(intValue));
                    if (A023 != null) {
                        str2 = A023.getId();
                        num = A023.A2M();
                        list2 = A023.A0e;
                    } else {
                        str2 = null;
                        num = null;
                    }
                    String A003 = AbstractC77343dK.A00(list2);
                    if (str2 != null) {
                        A04.A6K = str2;
                    }
                    if (num != null) {
                        A04.A0C = num.intValue();
                    }
                    if (A003 != null) {
                        A04.A58 = A003;
                    }
                }
            }
            if (A2N != null) {
                A04.A0E = A2N.intValue();
            }
        }
        C32U.A0H(userSession, A04, interfaceC60442pS);
    }

    @Override // X.C31D, X.C31E
    public final /* bridge */ /* synthetic */ void Ci7(Integer num, Object obj) {
        C40971v4 c40971v4 = (C40971v4) obj;
        AbstractC167017dG.A1N(c40971v4, num);
        InterfaceC60442pS interfaceC60442pS = this.A02;
        C82713mZ A04 = AbstractC82703mY.A04(c40971v4, interfaceC60442pS, "delivery");
        A04.A7R = "ad";
        UserSession userSession = this.A00;
        A04.A0K(userSession, c40971v4);
        A04.A2x = num;
        A04.A4S = super.A00;
        AbstractC37300Gc1.A10(userSession, A04);
        AbstractC37303Gc4.A1D(userSession, A04);
        C32U.A0H(userSession, A04, interfaceC60442pS);
    }

    @Override // X.C31D, X.C31E
    public final /* bridge */ /* synthetic */ void Ci8(InterfaceC42381xS interfaceC42381xS, Object obj) {
        C1PZ c1pz = (C1PZ) obj;
        AbstractC167017dG.A1N(interfaceC42381xS, c1pz);
        A00(interfaceC42381xS, c1pz, "invalidation");
    }

    @Override // X.C31E
    public final /* bridge */ /* synthetic */ void Ci9(InterfaceC42381xS interfaceC42381xS, Object obj) {
        C1PZ c1pz = (C1PZ) obj;
        AbstractC167017dG.A1N(interfaceC42381xS, c1pz);
        A00(interfaceC42381xS, c1pz, "insertion_success");
    }

    @Override // X.C31F
    public final /* bridge */ /* synthetic */ void CiA(C1PZ c1pz, Long l, Object obj, String str, String str2, String str3, String str4, Collection collection, Collection collection2, Map map, Map map2, boolean z) {
        C40971v4 c40971v4 = (C40971v4) obj;
        AbstractC167027dH.A0a(0, c40971v4, str, collection, collection2);
        C14360o3.A0B(c1pz, 11);
        C42543IsM c42543IsM = new C42543IsM(0, this, c40971v4);
        UserSession userSession = this.A00;
        InterfaceC60442pS interfaceC60442pS = this.A02;
        ArrayList A1F = AbstractC166987dD.A1F(collection);
        ArrayList A1F2 = AbstractC166987dD.A1F(collection2);
        C38321qM c38321qM = c40971v4.A0K;
        C32U.A0M(userSession, c42543IsM, c40971v4, interfaceC60442pS, Integer.valueOf(c38321qM.A0n()), l, str, str2, str3, str4, super.A00, null, null, c38321qM.A2w(), (HashMap) map, A1F, A1F2, z);
    }

    @Override // X.C31D, X.C31E
    public final /* bridge */ /* synthetic */ void Cit(InterfaceC42381xS interfaceC42381xS, Object obj, String str) {
        C1PZ c1pz = (C1PZ) obj;
        AbstractC167017dG.A1N(interfaceC42381xS, c1pz);
        InterfaceC60442pS interfaceC60442pS = this.A02;
        C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS, "ad_exit_pool");
        UserSession userSession = this.A00;
        c82713mZ.A0K(userSession, (C40971v4) interfaceC42381xS.BUM());
        c82713mZ.A7R = "ad";
        AbstractC37302Gc3.A1S(c82713mZ, c1pz);
        c82713mZ.A4S = super.A00;
        C32U.A0H(userSession, c82713mZ, interfaceC60442pS);
    }

    @Override // X.C31D, X.C31E
    public final void CkJ(InterfaceC42381xS interfaceC42381xS) {
        C0w9.A03("logInvalidContent: Discovery Chaining unit is not an ad", AbstractC37305Gc6.A02(this, interfaceC42381xS));
    }
}
