package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.GqD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38146GqD extends C31D {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final C31A A02;
    public final String A03;
    public final boolean A04;
    public final AnonymousClass318 A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38146GqD(UserSession userSession, AnonymousClass318 anonymousClass318, InterfaceC60442pS interfaceC60442pS, C31A c31a, String str) {
        super(userSession, anonymousClass318, interfaceC60442pS, null, c31a, str, null);
        C14360o3.A0B(str, 3);
        this.A00 = userSession;
        this.A01 = interfaceC60442pS;
        this.A03 = str;
        this.A05 = anonymousClass318;
        this.A02 = c31a;
        this.A04 = C18U.A06(C06090Tz.A05, userSession, 36322383803459797L);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1ux, X.Gem] */
    @Override // X.C31E
    public final /* bridge */ /* synthetic */ void Ci9(InterfaceC42381xS interfaceC42381xS, Object obj) {
        C1PZ c1pz = (C1PZ) obj;
        AbstractC167007dF.A1K(interfaceC42381xS, c1pz);
        C206259Bi c206259Bi = (C206259Bi) interfaceC42381xS.BUM();
        C38321qM A00 = ((C130455uq) c206259Bi.A02).A00();
        String str = null;
        if (A00 != null) {
            ?? abstractC40901ux = new AbstractC40901ux();
            abstractC40901ux.A0L = A00;
            C671831j c671831j = (C671831j) c206259Bi.A04;
            abstractC40901ux.A00 = c671831j;
            C37469Gen A01 = abstractC40901ux.A01();
            InterfaceC60442pS interfaceC60442pS = this.A01;
            C82713mZ A04 = AbstractC82703mY.A04(A01, interfaceC60442pS, "insertion_success");
            UserSession userSession = this.A00;
            A04.A0K(userSession, A01);
            A04.A7R = "ad";
            A04.A4y = interfaceC60442pS.getModuleName();
            A04.A7X = this.A03;
            A04.A07(interfaceC42381xS.BoB());
            AbstractC37302Gc3.A1S(A04, c1pz);
            A04.A2x = interfaceC42381xS.Byg();
            A04.A3M = AbstractC31171DnF.A0V(c1pz.A02);
            A04.A4S = super.A00;
            A04.A1G = Boolean.valueOf(AbstractC23021Ah.A00(userSession).A1k());
            C38321qM c38321qM = A01.A0K;
            A04.A8J = AbstractC41071vF.A0R(userSession, c38321qM);
            AbstractC37300Gc1.A10(userSession, A04);
            A04.A08 = c1pz.A03;
            A04.A02 = c1pz.A00;
            if (c671831j != null) {
                str = c671831j.A08;
            }
            A04.A7E = str;
            if (this.A04) {
                C3YM.A00(userSession).A05(interfaceC60442pS, Integer.valueOf(c1pz.A03));
            }
            AbstractC37303Gc4.A1D(userSession, A04);
            AbstractC37303Gc4.A1H(A04, c1pz, AbstractC166987dD.A1b(c1pz.A00()) ? 1 : 0);
            int A0n = c38321qM.A0n();
            if (A0n != -1) {
                A04.A2q = Integer.valueOf(A0n);
            }
            String A2w = c38321qM.A2w();
            if (A2w.length() > 0) {
                A04.A6J = A2w;
            }
            C32U.A0H(userSession, A04, interfaceC60442pS);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1ux, X.Gem] */
    @Override // X.C31F
    public final /* bridge */ /* synthetic */ void CiA(C1PZ c1pz, Long l, Object obj, String str, String str2, String str3, String str4, Collection collection, Collection collection2, Map map, Map map2, boolean z) {
        Integer num;
        String str5;
        C206259Bi c206259Bi = (C206259Bi) obj;
        AbstractC167027dH.A0a(0, c206259Bi, str, collection, collection2);
        C14360o3.A0B(c1pz, 11);
        C130455uq c130455uq = (C130455uq) c206259Bi.A02;
        C38321qM A00 = c130455uq.A00();
        String str6 = null;
        if (A00 != null) {
            ?? abstractC40901ux = new AbstractC40901ux();
            abstractC40901ux.A0L = A00;
            C40861ut c40861ut = (C40861ut) c206259Bi.A04;
            abstractC40901ux.A00 = c40861ut;
            C37469Gen A01 = abstractC40901ux.A01();
            C42545IsO c42545IsO = new C42545IsO(0, A01, c206259Bi, this);
            UserSession userSession = this.A00;
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36319265657396339L);
            InterfaceC60442pS interfaceC60442pS = this.A01;
            ArrayList A1F = AbstractC166987dD.A1F(collection);
            ArrayList A1F2 = AbstractC166987dD.A1F(collection2);
            String str7 = super.A00;
            HashMap hashMap = (HashMap) map;
            if (A06 && map2 != null) {
                Iterator A15 = AbstractC166997dE.A15(map2);
                while (true) {
                    if (!A15.hasNext()) {
                        break;
                    }
                    Map.Entry A1K = AbstractC166987dD.A1K(A15);
                    Object key = A1K.getKey();
                    C5I4 c5i4 = (C5I4) A1K.getValue();
                    C38321qM A002 = c130455uq.A00();
                    if (A002 == null || (str5 = A002.A2W()) == null) {
                        str5 = "";
                    }
                    if (C14360o3.A0K(key, str5)) {
                        Integer Awh = c5i4.Awh();
                        Integer num2 = (Integer) c206259Bi.A01;
                        if (Awh != null && num2 != null) {
                            str6 = AnonymousClass001.A0g(AbstractC37798GkD.A00(Awh), "_then_", AbstractC37798GkD.A00(num2));
                            break;
                        }
                    }
                }
            }
            C38321qM c38321qM = A01.A0K;
            C32U.A0M(userSession, c42545IsO, A01, interfaceC60442pS, Integer.valueOf(c38321qM.A0n()), l, str, str2, str3, str4, str7, str6, null, c38321qM.A2w(), hashMap, A1F, A1F2, z);
            if (this.A04) {
                C3YO A003 = C3YM.A00(userSession);
                if (c40861ut != null) {
                    num = Integer.valueOf(c40861ut.A09());
                } else {
                    num = null;
                }
                A003.A06(interfaceC60442pS, num);
            }
        }
    }
}
