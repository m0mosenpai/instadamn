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
import kotlin.Deprecated;

@Deprecated(message = "Please copy all changes to SponsoredContentLoggerKtImpl. They're being AB tested.")
/* renamed from: X.31K, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C31K implements C31E {
    public final C31B A00;
    public final C451225r A01;
    public final String A02;
    public final UserSession A03;
    public final C31N A04;
    public final C31A A05;
    public final C31E A06;
    public final C31P A07;

    @Override // X.C31G
    public final void CiD(int i, boolean z, long j) {
        CiE(null, i, j, z);
    }

    @Override // X.C31G
    public final void CiG(C85633rs c85633rs, List list, int i, long j, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        HashMap hashMap = new HashMap(arrayList.size());
        for (Object obj : list) {
            C31A c31a = this.A05;
            arrayList.add(c31a.ATy(obj));
            Collection AU1 = c31a.AU1(obj);
            AU1.getClass();
            hashMap.put(c31a.ATy(obj), TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, AU1));
        }
        this.A06.CiG(C85633rs.A0D, list, i, j, z);
        this.A01.A00("acp_item_finish_request_success", TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, arrayList), null, null);
    }

    @Override // X.C31G
    public final void Ci6(String str, String str2, String str3) {
        this.A06.Ci6(str, str2, str3);
    }

    @Override // X.C31E
    public final void Ci7(Integer num, Object obj) {
        this.A06.Ci7(num, obj);
        C451225r c451225r = this.A01;
        C31A c31a = this.A05;
        c451225r.A00("acp_ad_delivery", c31a.ATy(obj), c31a.AUH(obj), null);
        AbstractC63422uP.A00(this.A03).A04(C05F.A0C, c31a.ATy(obj), c31a.AUH(obj), c31a.AUe(obj), this.A00.A00);
    }

    @Override // X.C31E
    public final void Ci8(InterfaceC42381xS interfaceC42381xS, Object obj) {
        this.A06.Ci8(interfaceC42381xS, obj);
        C451225r c451225r = this.A01;
        String A00 = AbstractC111324zv.A00(1883);
        C31A c31a = this.A05;
        Object BUM = interfaceC42381xS.BUM();
        c451225r.A00(A00, c31a.ATy(BUM), c31a.AUH(BUM), null);
        UserSession userSession = this.A03;
        C3ZC A002 = AbstractC85763s5.A00(userSession);
        C1PZ c1pz = (C1PZ) obj;
        C14360o3.A0B(c1pz, 0);
        A002.A00(c1pz.A0B, this.A00.A00, c31a.ATy(BUM), c31a.AUH(BUM));
        AbstractC63422uP.A00(userSession).A01(C05F.A0C, c1pz.A0B, c31a.ATy(BUM));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C31E
    public final void Ci9(InterfaceC42381xS interfaceC42381xS, Object obj) {
        C39368Ha8 c39368Ha8;
        this.A06.Ci9(interfaceC42381xS, obj);
        C63432uQ A00 = AbstractC63422uP.A00(this.A03);
        C31A c31a = this.A05;
        Object BUM = interfaceC42381xS.BUM();
        A00.A03(C05F.A0C, c31a.ATy(BUM));
        this.A01.A00("acp_ad_insertion_success", c31a.ATy(BUM), c31a.AUH(BUM), null);
        C31N c31n = this.A04;
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

    @Override // X.C31F
    public final void CiA(C1PZ c1pz, Long l, Object obj, String str, String str2, String str3, String str4, Collection collection, Collection collection2, Map map, Map map2, boolean z) {
        this.A06.CiA(c1pz, l, obj, str, str2, str3, str4, collection, collection2, map, map2, z);
        UserSession userSession = this.A03;
        C3ZC A00 = AbstractC85763s5.A00(userSession);
        String str5 = this.A00.A00;
        C31A c31a = this.A05;
        A00.A02(str, str5, c31a.ATy(obj), c31a.AUH(obj));
        AbstractC63422uP.A00(userSession).A05(c31a.ATy(obj), C05F.A0C, str);
        this.A01.A00(AbstractC111324zv.A00(1884), c31a.ATy(obj), c31a.AUH(obj), str);
    }

    @Override // X.C31E
    public final void CiB(Iterable iterable, String str, String str2) {
        this.A06.CiB(iterable, "hp0_unavailable", str2);
    }

    @Override // X.C31I
    public final void CiC(C38321qM c38321qM, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, HashMap hashMap, List list, List list2, List list3, float f, int i) {
        this.A06.CiC(c38321qM, num, num2, num3, num4, str, str2, str3, str4, str5, hashMap, list, list2, list3, f, i);
    }

    @Override // X.C31G
    public final void CiE(String str, int i, long j, boolean z) {
        this.A06.CiE(str, i, j, z);
        this.A01.A00(AbstractC111324zv.A00(1885), null, null, AnonymousClass001.A0Q("latency", j));
        AbstractC85763s5.A00(this.A03).A01(this.A00.A00, i, j, z);
    }

    @Override // X.C31G
    public final void CiF(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.A06.CiF(str, str2, str3, str4, z, z2);
    }

    @Override // X.C31G
    public final void CiH(C85633rs c85633rs, Iterable iterable) {
        this.A06.CiH(c85633rs, iterable);
        this.A01.A00("acp_item_request", null, null, null);
    }

    @Override // X.C31E
    public final void Cit(InterfaceC42381xS interfaceC42381xS, Object obj, String str) {
        this.A06.Cit(interfaceC42381xS, obj, str);
    }

    @Override // X.C31E
    public final void CkJ(InterfaceC42381xS interfaceC42381xS) {
        this.A06.CkJ(interfaceC42381xS);
    }

    @Override // X.C31E
    public final void CkN(String str, String str2) {
        this.A06.CkN(str, str2);
        AbstractC63422uP.A00(this.A03).A02(AbstractC114975Hn.A00(str2), str);
    }

    @Override // X.C31E
    public final void CkO(InterfaceC42381xS interfaceC42381xS, Iterable iterable) {
        this.A06.CkO(interfaceC42381xS, iterable);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.A05.ATy(((InterfaceC42381xS) it.next()).BUM()));
        }
        this.A01.A00("acp_item_exit_pool", TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, arrayList), null, null);
    }

    @Override // X.C31E
    public final void Cke(Object obj) {
        this.A06.Cke(obj);
        C451225r c451225r = this.A01;
        C31A c31a = this.A05;
        c451225r.A00("acp_netego_delivery", c31a.AUP(obj), c31a.AUH(obj), null);
        AbstractC63422uP.A00(this.A03).A04(C05F.A0N, c31a.AUP(obj), c31a.AUH(obj), c31a.AUe(obj), this.A00.A00);
    }

    @Override // X.C31E
    public final void Ckf(InterfaceC42381xS interfaceC42381xS, Object obj) {
        this.A06.Ckf(interfaceC42381xS, obj);
        this.A01.A00(AbstractC111324zv.A00(1886), null, null, null);
        C63432uQ A00 = AbstractC63422uP.A00(this.A03);
        String AUP = this.A05.AUP(interfaceC42381xS.BUM());
        Integer num = C05F.A0N;
        C1PZ c1pz = (C1PZ) obj;
        C14360o3.A0B(c1pz, 0);
        A00.A01(num, c1pz.A0B, AUP);
    }

    @Override // X.C31E
    public final void Ckg(InterfaceC42381xS interfaceC42381xS, Object obj) {
        this.A06.Ckg(interfaceC42381xS, obj);
        AbstractC63422uP.A00(this.A03).A03(C05F.A0N, this.A05.AUP(interfaceC42381xS.BUM()));
        this.A01.A00("acp_netego_insertion_success", null, null, null);
    }

    @Override // X.C31F
    public final void Ckh(Object obj, String str, Collection collection) {
        this.A06.Ckh(obj, str, collection);
        C451225r c451225r = this.A01;
        String A00 = AbstractC111324zv.A00(1887);
        C31A c31a = this.A05;
        c451225r.A00(A00, c31a.ATy(obj), c31a.AUH(obj), str);
        AbstractC63422uP.A00(this.A03).A05(c31a.AUP(obj), C05F.A0N, str);
    }

    @Override // X.C31H
    public final void Ckx(Integer num, Object obj, String str, List list) {
        this.A06.Ckx(num, obj, str, list);
    }

    @Override // X.C31H
    public final void Cky(C9B3 c9b3, String str, long j, long j2, long j3) {
        this.A06.Cky(c9b3, "feed_tbi", j, 0L, j3);
    }

    @Override // X.C31E
    public final void Cm0(C3ZB c3zb) {
        this.A06.Cm0(c3zb);
    }

    @Override // X.C31E
    public final void DrI(C3ZB c3zb) {
        this.A06.DrI(c3zb);
    }

    @Override // X.C31E
    public final void ERS(String str) {
        this.A06.ERS(str);
    }

    @Override // X.C31E
    public final void ETt(int i) {
        this.A06.ETt(i);
        C451225r c451225r = this.A01;
        String str = this.A00.A00;
        String str2 = this.A02;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        c451225r.A00 = str;
        c451225r.A01 = str2;
    }

    public C31K(UserSession userSession, C31N c31n, C31A c31a, C31B c31b, C31E c31e, C31P c31p, C451225r c451225r, String str) {
        this.A03 = userSession;
        this.A00 = c31b;
        this.A02 = str;
        this.A06 = c31e;
        this.A01 = c451225r;
        this.A05 = c31a;
        this.A04 = c31n;
        this.A07 = c31p;
    }
}
