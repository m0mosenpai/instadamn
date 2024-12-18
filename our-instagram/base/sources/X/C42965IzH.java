package X;

import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.IzH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42965IzH implements C31E {
    public final C31B A00;
    public final C31E A01;
    public final C451225r A02;
    public final String A03;
    public final UserSession A04;
    public final C31N A05;
    public final C31A A06;
    public final InterfaceC43390JFf A07;

    public C42965IzH(UserSession userSession, C31N c31n, C31A c31a, C31B c31b, C31E c31e, InterfaceC43390JFf interfaceC43390JFf, C451225r c451225r, String str) {
        AbstractC167007dF.A1G(str, 3, c451225r);
        this.A00 = c31b;
        this.A04 = userSession;
        this.A03 = str;
        this.A01 = c31e;
        this.A02 = c451225r;
        this.A06 = c31a;
        this.A05 = c31n;
        this.A07 = interfaceC43390JFf;
    }

    public static C31E A00(C42965IzH c42965IzH, Object obj) {
        C14360o3.A0B(obj, 0);
        return c42965IzH.A01;
    }

    @Override // X.C31E
    public final void Ci7(Integer num, Object obj) {
        C14360o3.A0B(num, 1);
        this.A01.Ci7(num, obj);
        C451225r c451225r = this.A02;
        C31A c31a = this.A06;
        c451225r.A00("acp_ad_delivery", c31a.ATy(obj), c31a.AUH(obj), null);
        AbstractC63422uP.A00(this.A04).A04(C05F.A0C, c31a.ATy(obj), c31a.AUH(obj), c31a.AUe(obj), this.A00.A00);
    }

    @Override // X.C31E
    public final void Ci8(InterfaceC42381xS interfaceC42381xS, Object obj) {
        C14360o3.A0B(interfaceC42381xS, 0);
        this.A01.Ci8(interfaceC42381xS, obj);
        C451225r c451225r = this.A02;
        String A00 = AbstractC111324zv.A00(1883);
        C31A c31a = this.A06;
        Object BUM = interfaceC42381xS.BUM();
        c451225r.A00(A00, c31a.ATy(BUM), c31a.AUH(BUM), null);
        UserSession userSession = this.A04;
        C3ZC A002 = AbstractC85763s5.A00(userSession);
        C1PZ c1pz = (C1PZ) obj;
        C14360o3.A0B(c1pz, 0);
        A002.A00(c1pz.A0B, this.A00.A00, c31a.ATy(BUM), c31a.AUH(BUM));
        AbstractC63422uP.A00(userSession).A01(C05F.A0C, c1pz.A0B, c31a.ATy(BUM));
    }

    @Override // X.C31F
    public final void CiA(C1PZ c1pz, Long l, Object obj, String str, String str2, String str3, String str4, Collection collection, Collection collection2, Map map, Map map2, boolean z) {
        AbstractC25233BEq.A0w(2, str, collection, collection2);
        C14360o3.A0B(c1pz, 11);
        this.A01.CiA(c1pz, l, obj, str, str2, str3, str4, collection, collection2, map, map2, z);
        UserSession userSession = this.A04;
        C3ZC A00 = AbstractC85763s5.A00(userSession);
        String str5 = this.A00.A00;
        C31A c31a = this.A06;
        A00.A02(str, str5, c31a.ATy(obj), c31a.AUH(obj));
        AbstractC63422uP.A00(userSession).A05(c31a.ATy(obj), C05F.A0C, str);
        this.A02.A00(AbstractC111324zv.A00(1884), c31a.ATy(obj), c31a.AUH(obj), str);
    }

    @Override // X.C31G
    public final void CiD(int i, boolean z, long j) {
        CiE(null, i, j, z);
    }

    @Override // X.C31G
    public final void CiG(C85633rs c85633rs, List list, int i, long j, boolean z) {
        C14360o3.A0B(list, 0);
        ArrayList A0q = AbstractC25230BEn.A0q(list);
        HashMap hashMap = new HashMap(A0q.size());
        for (Object obj : list) {
            C31A c31a = this.A06;
            A0q.add(c31a.ATy(obj));
            Collection AU1 = c31a.AU1(obj);
            String ATy = c31a.ATy(obj);
            String join = TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, AU1);
            C14360o3.A07(join);
            hashMap.put(ATy, join);
        }
        this.A01.CiG(C85633rs.A0D, list, i, j, z);
        C451225r c451225r = this.A02;
        String join2 = TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A0q);
        C14360o3.A07(join2);
        c451225r.A00("acp_item_finish_request_success", join2, null, null);
    }

    @Override // X.C31E
    public final void Ckf(InterfaceC42381xS interfaceC42381xS, Object obj) {
        this.A01.Ckf(interfaceC42381xS, obj);
        this.A02.A00(AbstractC111324zv.A00(1886), null, null, null);
        C63432uQ A00 = AbstractC63422uP.A00(this.A04);
        String AUP = this.A06.AUP(interfaceC42381xS.BUM());
        Integer num = C05F.A0N;
        C1PZ c1pz = (C1PZ) obj;
        C14360o3.A0B(c1pz, 0);
        A00.A01(num, c1pz.A0B, AUP);
    }

    @Override // X.C31E
    public final void CiB(Iterable iterable, String str, String str2) {
        AbstractC167027dH.A12("hp0_unavailable", str2, iterable);
        this.A01.CiB(iterable, "hp0_unavailable", str2);
    }

    @Override // X.C31I
    public final void CiC(C38321qM c38321qM, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, HashMap hashMap, List list, List list2, List list3, float f, int i) {
        AbstractC167027dH.A12(list, list2, list3);
        AbstractC167007dF.A1G(str, 3, str2);
        AbstractC167007dF.A1I(str3, 7, hashMap);
        this.A01.CiC(c38321qM, num, num2, num3, num4, str, str2, str3, str4, str5, hashMap, list, list2, list3, f, i);
    }

    @Override // X.C31G
    public final void CiE(String str, int i, long j, boolean z) {
        this.A01.CiE(str, i, j, z);
        this.A02.A00(AbstractC111324zv.A00(1885), null, null, AnonymousClass001.A0Q("latency", j));
        AbstractC85763s5.A00(this.A04).A01(this.A00.A00, i, j, z);
    }

    @Override // X.C31G
    public final void CiF(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.A01.CiF(str, str2, str3, str4, z, z2);
    }

    @Override // X.C31E
    public final void Cke(Object obj) {
        this.A01.Cke(obj);
        C451225r c451225r = this.A02;
        C31A c31a = this.A06;
        c451225r.A00("acp_netego_delivery", c31a.AUP(obj), c31a.AUH(obj), null);
        AbstractC63422uP.A00(this.A04).A04(C05F.A0N, c31a.AUP(obj), c31a.AUH(obj), c31a.AUe(obj), this.A00.A00);
    }

    @Override // X.C31H
    public final void Cky(C9B3 c9b3, String str, long j, long j2, long j3) {
        C14360o3.A0B(c9b3, 3);
        this.A01.Cky(c9b3, "feed_tbi", j, 0L, j3);
    }

    @Override // X.C31E
    public final void ETt(int i) {
        this.A01.ETt(i);
        C451225r c451225r = this.A02;
        String str = this.A00.A00;
        String str2 = this.A03;
        C14360o3.A0B(str, 0);
        c451225r.A00 = str;
        c451225r.A01 = str2;
    }

    @Override // X.C31G
    public final void Ci6(String str, String str2, String str3) {
        A00(this, str).Ci6(str, str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C31E
    public final void Ci9(InterfaceC42381xS interfaceC42381xS, Object obj) {
        C39368Ha8 c39368Ha8;
        A00(this, interfaceC42381xS).Ci9(interfaceC42381xS, obj);
        C63432uQ A00 = AbstractC63422uP.A00(this.A04);
        C31A c31a = this.A06;
        Object BUM = interfaceC42381xS.BUM();
        A00.A03(C05F.A0C, c31a.ATy(BUM));
        this.A02.A00("acp_ad_insertion_success", c31a.ATy(BUM), c31a.AUH(BUM), null);
        C31N c31n = this.A05;
        if (c31n.isEnabled()) {
            EnumC39531Hcy enumC39531Hcy = EnumC39531Hcy.A02;
            if (c31a.ATy(BUM) != null) {
                c39368Ha8 = new Object();
            } else {
                c39368Ha8 = C39368Ha8.A00;
            }
            c31n.FAv(c39368Ha8, enumC39531Hcy);
        }
    }

    @Override // X.C31G
    public final void CiH(C85633rs c85633rs, Iterable iterable) {
        AbstractC167017dG.A1N(c85633rs, iterable);
        this.A01.CiH(c85633rs, iterable);
        this.A02.A00("acp_item_request", null, null, null);
    }

    @Override // X.C31E
    public final void Cit(InterfaceC42381xS interfaceC42381xS, Object obj, String str) {
        A00(this, interfaceC42381xS).Cit(interfaceC42381xS, obj, str);
    }

    @Override // X.C31E
    public final void CkJ(InterfaceC42381xS interfaceC42381xS) {
        A00(this, interfaceC42381xS).CkJ(interfaceC42381xS);
    }

    @Override // X.C31E
    public final void CkN(String str, String str2) {
        A00(this, str).CkN(str, str2);
        AbstractC63422uP.A00(this.A04).A02(AbstractC114975Hn.A00(str2), str);
    }

    @Override // X.C31E
    public final void CkO(InterfaceC42381xS interfaceC42381xS, Iterable iterable) {
        AbstractC167017dG.A1N(interfaceC42381xS, iterable);
        this.A01.CkO(interfaceC42381xS, iterable);
        ArrayList A0q = AbstractC167017dG.A0q(iterable);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            A0q.add(this.A06.ATy(((InterfaceC42381xS) it.next()).BUM()));
        }
        C451225r c451225r = this.A02;
        String join = TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A0q);
        C14360o3.A07(join);
        c451225r.A00("acp_item_exit_pool", join, null, null);
    }

    @Override // X.C31E
    public final void Ckg(InterfaceC42381xS interfaceC42381xS, Object obj) {
        A00(this, interfaceC42381xS).Ckg(interfaceC42381xS, obj);
        AbstractC63422uP.A00(this.A04).A03(C05F.A0N, this.A06.AUP(interfaceC42381xS.BUM()));
        this.A02.A00("acp_netego_insertion_success", null, null, null);
    }

    @Override // X.C31F
    public final void Ckh(Object obj, String str, Collection collection) {
        AbstractC167017dG.A1P(str, collection);
        this.A01.Ckh(obj, str, collection);
        C451225r c451225r = this.A02;
        String A00 = AbstractC111324zv.A00(1887);
        C31A c31a = this.A06;
        c451225r.A00(A00, c31a.ATy(obj), c31a.AUH(obj), str);
        AbstractC63422uP.A00(this.A04).A05(c31a.AUP(obj), C05F.A0N, str);
    }

    @Override // X.C31H
    public final void Ckx(Integer num, Object obj, String str, List list) {
        AbstractC167017dG.A1N(str, list);
        this.A01.Ckx(num, obj, str, list);
    }

    @Override // X.C31E
    public final void Cm0(C3ZB c3zb) {
        A00(this, c3zb).Cm0(c3zb);
    }

    @Override // X.C31E
    public final void DrI(C3ZB c3zb) {
        A00(this, c3zb).DrI(c3zb);
    }

    @Override // X.C31E
    public final void ERS(String str) {
        A00(this, str).ERS(str);
    }
}
