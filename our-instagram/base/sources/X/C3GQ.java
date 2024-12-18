package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3GQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3GQ extends C31D {
    public int A00;
    public String A01;
    public final UserSession A02;
    public final AnonymousClass318 A03;
    public final InterfaceC60442pS A04;
    public final C3G2 A05;
    public final C3GN A06;
    public final InterfaceC114805Gn A07;
    public final InterfaceC62242sP A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    public C3GQ(UserSession userSession, AnonymousClass318 anonymousClass318, InterfaceC60442pS interfaceC60442pS, C3G2 c3g2, C3GN c3gn, InterfaceC114805Gn interfaceC114805Gn, InterfaceC62242sP interfaceC62242sP, C31A c31a, String str, String str2, boolean z) {
        super(userSession, anonymousClass318, interfaceC60442pS, null, c31a, str2, str);
        this.A02 = userSession;
        this.A04 = interfaceC60442pS;
        this.A09 = str;
        this.A0A = str2;
        this.A05 = c3g2;
        this.A03 = anonymousClass318;
        this.A08 = interfaceC62242sP;
        this.A07 = interfaceC114805Gn;
        this.A06 = c3gn;
        this.A0B = z;
    }

    @Override // X.C31D, X.C31G
    public final void CiG(C85633rs c85633rs, List list, int i, long j, boolean z) {
        C14360o3.A0B(list, 0);
        C14360o3.A0B(c85633rs, 4);
        this.A03.A0R = A00(this, this.A06.BeT());
        super.CiG(c85633rs, list, i, j, z);
    }

    @Override // X.C31D, X.C31G
    public final void CiH(C85633rs c85633rs, Iterable iterable) {
        C14360o3.A0B(c85633rs, 0);
        C14360o3.A0B(iterable, 1);
        this.A03.A0R = A00(this, iterable);
        super.CiH(c85633rs, iterable);
    }

    @Override // X.C31D, X.C31E
    public final void Cm0(C3ZB c3zb) {
        C14360o3.A0B(c3zb, 0);
        this.A03.A0R = A00(this, this.A06.BeT());
        super.Cm0(c3zb);
    }

    @Override // X.C31D, X.C31E
    public final void DrI(C3ZB c3zb) {
        C14360o3.A0B(c3zb, 0);
        this.A03.A0R = A00(this, this.A06.BeT());
        super.DrI(c3zb);
    }

    public static final String A00(C3GQ c3gq, Iterable iterable) {
        Integer num;
        String str;
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC42381xS interfaceC42381xS = (InterfaceC42381xS) it.next();
            sb.append("(id:");
            Object BUM = interfaceC42381xS.BUM();
            String id = ((C41551w4) BUM).A0H.getId();
            C14360o3.A07(id);
            sb.append(id);
            sb.append(", type:");
            EnumC26291Pk BYX = c3gq.A08.BYX(BUM);
            if (BYX != null) {
                int ordinal = BYX.ordinal();
                if (ordinal != 1) {
                    if (ordinal == 0 || ordinal == 2) {
                        num = C05F.A0C;
                    }
                } else {
                    num = C05F.A01;
                }
                if (1 - num.intValue() != 0) {
                    str = "AD";
                } else {
                    str = "ORGANIC";
                }
                sb.append(str);
            }
        }
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public static final void A01(C1NI c1ni, C41551w4 c41551w4, C3GQ c3gq, Integer num, String str, int i) {
        InterfaceC60442pS interfaceC60442pS = c3gq.A04;
        if (AbstractC75423a9.A00(c1ni, interfaceC60442pS)) {
            UserSession userSession = c3gq.A02;
            String str2 = c3gq.A09;
            String str3 = c3gq.A0A;
            Reel reel = c41551w4.A0H;
            C130915ve c130915ve = new C130915ve(userSession, reel, str2, str3, i, c41551w4.A0E);
            c130915ve.A0B = reel.A0X;
            c130915ve.A0E = num;
            C82713mZ A01 = C32U.A01(c130915ve, c1ni, interfaceC60442pS, "delivery");
            A01.A4S = ((C31D) c3gq).A00;
            A01.A6s = c41551w4.A0I;
            A01.A6t = c41551w4.A0J;
            A01.A4Y = C32V.A00(userSession);
            A01.A4W = str;
            if (AbstractC61652rS.A02(userSession)) {
                A01.A4d = AbstractC61652rS.A01(AbstractC23021Ah.A00(userSession)).toString();
                A01.A4e = AbstractC61652rS.A00(userSession).toString();
            }
            C32U.A0I(userSession, A01, interfaceC60442pS, C05F.A01);
        }
    }

    @Override // X.C31E
    public final /* bridge */ /* synthetic */ void Ci9(InterfaceC42381xS interfaceC42381xS, Object obj) {
        C1PZ c1pz = (C1PZ) obj;
        C14360o3.A0B(interfaceC42381xS, 0);
        C14360o3.A0B(c1pz, 1);
        AnonymousClass318 anonymousClass318 = this.A03;
        anonymousClass318.A00();
        anonymousClass318.A0S = anonymousClass318.A0d;
        UserSession userSession = this.A02;
        InterfaceC60442pS interfaceC60442pS = this.A04;
        C41551w4 c41551w4 = (C41551w4) interfaceC42381xS.BUM();
        int i = this.A00;
        int BoB = interfaceC42381xS.BoB();
        this.A01 = C3R6.A01(userSession, anonymousClass318, interfaceC60442pS, c41551w4, c1pz, interfaceC42381xS.Byg(), null, null, "insertion_success", super.A00, this.A01, null, i, BoB, interfaceC42381xS.CVy(), this.A0B);
    }

    @Override // X.C31F
    public final /* bridge */ /* synthetic */ void CiA(C1PZ c1pz, Long l, Object obj, String str, String str2, String str3, String str4, Collection collection, Collection collection2, Map map, Map map2, boolean z) {
        HashMap hashMap;
        Integer num;
        String str5;
        C41551w4 c41551w4 = (C41551w4) obj;
        C14360o3.A0B(c41551w4, 0);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(collection, 3);
        C14360o3.A0B(collection2, 4);
        C14360o3.A0B(c1pz, 11);
        UserSession userSession = this.A02;
        String str6 = this.A09;
        String str7 = this.A0A;
        Reel reel = c41551w4.A0H;
        C130915ve c130915ve = new C130915ve(userSession, reel, str6, str7, c41551w4.A01, c41551w4.A0E);
        c130915ve.A0B = reel.A0X;
        List A0U = C1OU.A04(userSession).A0U(false);
        ArrayList arrayList = new ArrayList();
        Iterator it = A0U.iterator();
        while (it.hasNext()) {
            User A0D = ((Reel) it.next()).A0D();
            if (A0D != null) {
                arrayList.add(A0D.getId());
            }
        }
        c130915ve.A0H = arrayList;
        c130915ve.A07 = A0U.size();
        InterfaceC114805Gn interfaceC114805Gn = this.A07;
        if (interfaceC114805Gn != null) {
            c130915ve.A08 = interfaceC114805Gn.getCount();
        }
        c130915ve.A0F = A00(this, this.A06.BeT());
        C41181vS A08 = c41551w4.A08(userSession);
        InterfaceC60442pS interfaceC60442pS = this.A04;
        C1NI A09 = A08.A09();
        if (A09 != null) {
            ArrayList arrayList2 = new ArrayList(collection);
            ArrayList arrayList3 = new ArrayList(collection2);
            String str8 = super.A00;
            if (map != null) {
                hashMap = new HashMap(map);
            } else {
                hashMap = null;
            }
            C38321qM c38321qM = A08.A0b;
            if (c38321qM != null) {
                num = Integer.valueOf(c38321qM.A0n());
                str5 = c38321qM.A2w();
            } else {
                num = null;
                str5 = null;
            }
            C32U.A0M(userSession, c130915ve, A09, interfaceC60442pS, num, l, str, str2, str3, str4, str8, null, null, str5, hashMap, arrayList2, arrayList3, z);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.C31D, X.C31E
    public final void ETt(int i) {
        this.A03.A0R = A00(this, this.A06.BeT());
        super.ETt(i);
        this.A00 = i;
    }
}
