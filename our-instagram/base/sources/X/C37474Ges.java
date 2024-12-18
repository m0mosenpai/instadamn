package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Ges, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37474Ges extends C31D {
    public final int A00;
    public final UserSession A01;
    public final AnonymousClass318 A02;
    public final C3GC A03;
    public final InterfaceC60442pS A04;

    public C37474Ges(UserSession userSession, AnonymousClass318 anonymousClass318, InterfaceC60442pS interfaceC60442pS, C31A c31a, String str, int i) {
        super(userSession, anonymousClass318, interfaceC60442pS, null, c31a, str, null);
        this.A01 = userSession;
        this.A04 = interfaceC60442pS;
        this.A02 = anonymousClass318;
        this.A00 = i;
        C3GC c3gc = C3GC.A02;
        C14360o3.A07(c3gc);
        this.A03 = c3gc;
    }

    @Override // X.C31D, X.C31E
    public final void CkJ(InterfaceC42381xS interfaceC42381xS) {
        C14360o3.A0B(interfaceC42381xS, 0);
        C40971v4 c40971v4 = (C40971v4) interfaceC42381xS.BUM();
        C0w9.A03("logInvalidContent: Search Feed Ad item is not an ad", AnonymousClass001.A17("ad_id: [", c40971v4.A0S, "] tracking_token: [", c40971v4.A0j, "] media_id: [", c40971v4.A0K.getId(), "] ad_client_delivery_session_id: [", super.A00, ']'));
    }

    @Override // X.C31D, X.C31E
    public final /* bridge */ /* synthetic */ void Ci7(Integer num, Object obj) {
        C40971v4 c40971v4 = (C40971v4) obj;
        boolean A1a = AbstractC167017dG.A1a(c40971v4, num);
        InterfaceC60442pS interfaceC60442pS = this.A04;
        C82713mZ A04 = AbstractC82703mY.A04(c40971v4, interfaceC60442pS, "delivery");
        A04.A7R = "ad";
        UserSession userSession = this.A01;
        A04.A0K(userSession, c40971v4);
        A04.A2x = num;
        A04.A4S = super.A00;
        A04.A8J = AbstractC41071vF.A0R(userSession, c40971v4.A0K);
        A04.A8I = A1a;
        A04.A5e = c40971v4.A0c;
        A04.A4y = interfaceC60442pS.getModuleName();
        AbstractC37300Gc1.A10(userSession, A04);
        AnonymousClass318 anonymousClass318 = this.A02;
        Integer num2 = anonymousClass318.A0F;
        if (num2 != null) {
            A04.A07(num2.intValue());
        }
        Integer num3 = anonymousClass318.A0E;
        if (num3 != null) {
            A04.A3O = AbstractC25229BEm.A0n(num3);
        }
        A04.A4D = AbstractC31171DnF.A0V(this.A00);
        AbstractC37303Gc4.A1D(userSession, A04);
        C32U.A0H(userSession, A04, interfaceC60442pS);
    }

    @Override // X.C31E
    public final /* bridge */ /* synthetic */ void Ci9(InterfaceC42381xS interfaceC42381xS, Object obj) {
        C1PZ c1pz = (C1PZ) obj;
        boolean A1R = AbstractC167007dF.A1R(0, interfaceC42381xS, c1pz);
        Object BUM = interfaceC42381xS.BUM();
        InterfaceC60442pS interfaceC60442pS = this.A04;
        C82713mZ A04 = AbstractC82703mY.A04((C1NI) BUM, interfaceC60442pS, "insertion_success");
        UserSession userSession = this.A01;
        C40971v4 c40971v4 = (C40971v4) BUM;
        AbstractC37303Gc4.A1E(userSession, A04, c40971v4, interfaceC42381xS);
        A04.A2x = interfaceC42381xS.Byg();
        A04.A3M = AbstractC31171DnF.A0V(c1pz.A02);
        A04.A4S = super.A00;
        C38321qM c38321qM = c40971v4.A0K;
        A04.A8J = AbstractC41071vF.A0R(userSession, c38321qM);
        A04.A8I = A1R;
        A04.A5e = c40971v4.A0c;
        A04.A4y = interfaceC60442pS.getModuleName();
        AbstractC37300Gc1.A10(userSession, A04);
        Integer num = c40971v4.A0P;
        if (num != null) {
            A04.A4D = AbstractC25229BEm.A0n(num);
        }
        AbstractC37302Gc3.A1S(A04, c1pz);
        C40861ut c40861ut = ((C37469Gen) BUM).A00;
        if (c40861ut != null) {
            A04.A0O(c40861ut);
            A04.A3m = AbstractC31171DnF.A0V(c40861ut.A07());
            Long A0T = AbstractC37302Gc3.A0T();
            A04.A3o = A0T;
            A04.A3n = A0T;
            A04.A3p = A0T;
        }
        AbstractC37303Gc4.A1D(userSession, A04);
        Integer num2 = C05F.A00;
        Integer num3 = c1pz.A0C;
        if (num2 == num3) {
            A04.A0G = c1pz.A03;
        } else if (C05F.A01 == num3) {
            AbstractC37303Gc4.A1H(A04, c1pz, AbstractC166987dD.A1b(c1pz.A00()) ? 1 : 0);
            A04.A02 = c1pz.A00;
            int i = c1pz.A03;
            A04.A08 = i;
            C3GC c3gc = this.A03;
            A04.A0Q(Integer.valueOf(c3gc.A00(C5Hq.AD, i)));
            A04.A0S(Integer.valueOf(c3gc.A00(C5Hq.NETEGO, c1pz.A03)));
            String A0U = AbstractC37303Gc4.A0U(A04, c38321qM);
            if (A0U.length() > 0) {
                A04.A6J = A0U;
            }
        }
        C32U.A0H(userSession, A04, interfaceC60442pS);
    }

    @Override // X.C31F
    public final /* bridge */ /* synthetic */ void CiA(C1PZ c1pz, Long l, Object obj, String str, String str2, String str3, String str4, Collection collection, Collection collection2, Map map, Map map2, boolean z) {
        C40971v4 c40971v4 = (C40971v4) obj;
        AbstractC167027dH.A0a(0, c40971v4, str, collection, collection2);
        C14360o3.A0B(c1pz, 11);
        C42543IsM c42543IsM = new C42543IsM(1, this, c40971v4);
        UserSession userSession = this.A01;
        InterfaceC60442pS interfaceC60442pS = this.A04;
        ArrayList A1F = AbstractC166987dD.A1F(collection);
        ArrayList A1F2 = AbstractC166987dD.A1F(collection2);
        C38321qM c38321qM = c40971v4.A0K;
        C32U.A0M(userSession, c42543IsM, c40971v4, interfaceC60442pS, Integer.valueOf(c38321qM.A0n()), l, str, str2, str3, str4, super.A00, null, null, c38321qM.A2w(), (HashMap) map, A1F, A1F2, z);
    }
}
