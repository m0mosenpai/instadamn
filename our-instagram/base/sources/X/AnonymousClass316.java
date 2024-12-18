package X;

import com.google.common.collect.ImmutableSet;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.316, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass316 extends C1I7 implements InterfaceC669530m {
    public int A00;
    public InterfaceC669830p A01;
    public InterfaceC670130s A02;
    public final UserSession A03;
    public final C65192xH A04;
    public final C669430l A05;
    public final AnonymousClass315 A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final C670330u A0B;
    public final C670730y A0C;
    public final C61842rl A0D;
    public final java.util.Set A0E;

    @Override // X.InterfaceC669530m
    public final boolean A7S(AnonymousClass320 anonymousClass320, final InterfaceC669830p interfaceC669830p, InterfaceC670130s interfaceC670130s) {
        C14360o3.A0B(interfaceC670130s, 0);
        C14360o3.A0B(interfaceC669830p, 1);
        C14360o3.A0B(anonymousClass320, 2);
        this.A02 = interfaceC670130s;
        this.A01 = interfaceC669830p;
        C669430l c669430l = this.A05;
        if (c669430l != null) {
            c669430l.A0A = new C32W(this.A03, interfaceC670130s);
            c669430l.A09 = new InterfaceC669830p(interfaceC669830p) { // from class: X.32X
                public final InterfaceC669830p A00;

                @Override // X.InterfaceC669830p
                public final void CtS() {
                }

                @Override // X.InterfaceC669830p
                public final void DrF(String str) {
                    C14360o3.A0B(str, 0);
                    this.A00.DrF(str);
                }

                @Override // X.InterfaceC669830p
                public final int AuR() {
                    return this.A00.AuR();
                }

                @Override // X.InterfaceC669830p
                public final void DGn(C85633rs c85633rs) {
                    this.A00.DGn(c85633rs);
                }

                @Override // X.InterfaceC669830p
                public final void DrH() {
                    this.A00.DrH();
                }

                {
                    this.A00 = interfaceC669830p;
                }
            };
        }
        C670330u c670330u = this.A0B;
        if (c670330u != null) {
            c670330u.A06 = new C32Y(interfaceC670130s);
        }
        C670730y c670730y = this.A0C;
        if (c670730y != null) {
            c670730y.A7S(anonymousClass320, interfaceC669830p, interfaceC670130s);
        }
        CCV.A00(this.A03).Eco(interfaceC670130s);
        return true;
    }

    @Override // X.InterfaceC669630n
    public final String B5L() {
        return "FEED_EAGER_REFRESH";
    }

    @Override // X.InterfaceC669530m
    public final int BX5() {
        return 0;
    }

    @Override // X.InterfaceC669530m
    public final int Bg5() {
        return 0;
    }

    @Override // X.InterfaceC669630n
    public final void CKM(C206209Bd c206209Bd, List list) {
        C65192xH c65192xH;
        C38321qM c38321qM;
        boolean z;
        C1XV c1xv;
        Boolean bool;
        String str;
        String str2;
        C38321qM A02;
        C14360o3.A0B(c206209Bd, 0);
        C14360o3.A0B(list, 1);
        C9BW c9bw = (C9BW) AbstractC001800i.A0N(list);
        if (c9bw != null && Bts().contains(c206209Bd)) {
            C61842rl c61842rl = this.A0D;
            C9CQ c9cq = (C9CQ) ((C9C7) c9bw.A01).A02;
            String str3 = c9cq.A01;
            String str4 = c9cq.A04;
            String str5 = ((AnonymousClass317) c206209Bd.A01).A01;
            C14360o3.A0B(str3, 0);
            C14360o3.A0B(str4, 1);
            C14360o3.A0B(str5, 2);
            C31T c31t = c61842rl.A04;
            if ((c31t != null && c31t.A06 == C05F.A01) || (c65192xH = c61842rl.A06) == null) {
                return;
            }
            int BK6 = c65192xH.BK6(str3);
            if (BK6 == -1) {
                BK6 = c65192xH.BK6(str4);
            }
            C61882rp c61882rp = c61842rl.A0W;
            C006802i c006802i = c61882rp.A00;
            UserSession userSession = c61882rp.A01;
            C06090Tz c06090Tz = C06090Tz.A06;
            c006802i.A0f(976041859, (int) C18U.A01(c06090Tz, userSession, 36604692004148336L));
            c006802i.markerAnnotate(976041859, "asl_session_id", C0L6.A01());
            c006802i.markerAnnotate(976041859, "refresh_type", "rti");
            c006802i.markerAnnotate(976041859, "trigger_type", str5);
            c006802i.markerAnnotate(976041859, "rti_seed_media_id", str4);
            c006802i.markerAnnotate(976041859, "rti_seed_media_position", BK6);
            c006802i.markerPoint(976041859, "start");
            C3XG A04 = c65192xH.A04(BK6);
            if (A04 != null) {
                c38321qM = C3XH.A02(A04.A05);
            } else {
                c38321qM = null;
            }
            C32S c32s = c61842rl.A0C;
            if (c32s == null) {
                return;
            }
            int i = c32s.A00;
            int i2 = BK6 + 1;
            C3XG A042 = c65192xH.A04(i2);
            if (A042 != null && (A02 = C3XH.A02(A042.A05)) != null) {
                z = A02.CdW();
            } else {
                z = false;
            }
            C3XG A043 = c65192xH.A04(i2);
            if (A043 != null) {
                c1xv = A043.A06;
            } else {
                c1xv = null;
            }
            boolean z2 = false;
            if (c1xv == C1XV.A06) {
                z2 = true;
            }
            if (c38321qM != null) {
                bool = Boolean.valueOf(c61842rl.A0Y.BRZ(c38321qM).A2L);
            } else {
                bool = null;
            }
            boolean A044 = C3XH.A04(c65192xH.A07());
            C31T c31t2 = c61842rl.A04;
            if (c31t2 != null) {
                UserSession userSession2 = c61842rl.A0Q;
                if (c38321qM == null) {
                    str2 = "NULL_SEED_AD";
                } else if (AbstractC41071vF.A0O(userSession2, c38321qM) && C18U.A06(c06090Tz, userSession2, 36323217027181648L)) {
                    str2 = "MULTI_ADS_ELIGIBLE_SEED_AD";
                } else if (z) {
                    str2 = "FIRST_AD_IN_BACK_TO_BACK_ADS";
                } else if (z2) {
                    str2 = "NEXT_ITEM_AFI";
                } else {
                    C06090Tz c06090Tz2 = C06090Tz.A05;
                    if (i < ((int) C18U.A01(c06090Tz2, userSession2, 36604692004279409L)) + BK6) {
                        str2 = "MIN_SEEN_INDEX_THRESHOLD";
                    } else if (i > BK6 + ((int) C18U.A01(c06090Tz2, userSession2, 36604692003951726L))) {
                        str2 = "MAX_SEEN_INDEX_THRESHOLD";
                    } else if (C14360o3.A0K(bool, true)) {
                        str2 = "SEED_AD_ALREADY_TRIGGERED_FEED_EAGER_REFRESH";
                    } else if (c31t2.A02 >= ((int) C18U.A01(c06090Tz, userSession2, 36604692004082799L))) {
                        str2 = "RATE_LIMIT";
                    } else if (C3YV.A08(c38321qM)) {
                        str2 = "SEED_AD_IN_FEED_RECS";
                    } else if (A044) {
                        str2 = "EOF_DEMARCATOR_IN_FEED";
                    }
                }
                c006802i.withMarker(976041859).pointEditor("skip").addPointData("invalidation_reason", str2).markerEditingCompleted();
                c006802i.markerEnd(976041859, (short) 3376);
                return;
            }
            C31T c31t3 = c61842rl.A04;
            if (c31t3 != null) {
                c31t3.A06 = C05F.A01;
            }
            int max = Math.max(i, BK6);
            if (c31t3 != null) {
                c31t3.A00 = max;
            }
            if (c38321qM != null && c31t3 != null) {
                c31t3.A03 = c61842rl.A0Y.BRZ(c38321qM);
            }
            C31T c31t4 = c61842rl.A04;
            if (c31t4 != null) {
                c31t4.A07 = c65192xH.A07();
            }
            C31T c31t5 = c61842rl.A04;
            if (c31t5 != null) {
                c31t5.A01 = BK6;
                c31t5.A08 = c65192xH.BRE().subList(max + 1, c65192xH.BRE().size());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C31T c31t6 = c61842rl.A04;
            if (c31t6 == null || (str = c31t6.A01()) == null) {
                str = "";
            }
            linkedHashMap.put("unseen_media_ids", str);
            linkedHashMap.put("is_feed_eager_refresh", "true");
            c61842rl.A0X.A00 = c61842rl.A04;
            c61842rl.A0A(C1EN.A0H, null, linkedHashMap);
        }
    }

    @Override // X.InterfaceC669530m
    public final boolean CUl() {
        return false;
    }

    @Override // X.InterfaceC669530m
    public final void Co5() {
    }

    @Override // X.InterfaceC669530m
    public final void CoL(AnonymousClass320 anonymousClass320, EnumC37671p4 enumC37671p4, boolean z) {
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ void CoM(C9C3 c9c3, AnonymousClass320 anonymousClass320, EnumC37671p4 enumC37671p4, String str, String str2, double d, boolean z) {
        C14360o3.A0B(anonymousClass320, 1);
        C14360o3.A0B(enumC37671p4, 3);
    }

    @Override // X.InterfaceC669530m
    public final void CoN(int i) {
    }

    @Override // X.InterfaceC669530m
    public final boolean D7a(int i, int i2) {
        return true;
    }

    @Override // X.InterfaceC669530m
    public final void Dtv(int i) {
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ boolean AFs() {
        return false;
    }

    @Override // X.InterfaceC669530m
    public final C51G AND() {
        return new C51G() { // from class: X.51H
            @Override // X.C51G
            public final void EDk(C3HZ c3hz) {
                c3hz.A00(AnonymousClass316.this);
            }

            @Override // X.C51G
            public final void F9i(C3HZ c3hz) {
                c3hz.A01(AnonymousClass316.this);
            }
        };
    }

    @Override // X.InterfaceC669630n
    public final java.util.Set Bts() {
        Boolean bool;
        UserSession userSession = this.A03;
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A06, userSession, 36323217027116111L)) {
            java.util.Set set = this.A0E;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((AnonymousClass317) it.next()).A01);
            }
            ArrayList A0U = AbstractC001800i.A0U(arrayList);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(A0U, 10));
            Iterator it2 = A0U.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                AnonymousClass317[] values = AnonymousClass317.values();
                int i = 0;
                int length = values.length;
                while (true) {
                    bool = null;
                    if (i < length) {
                        AnonymousClass317 anonymousClass317 = values[i];
                        if (C14360o3.A0K(anonymousClass317.A01, AbstractC001900j.A0B(str).toString())) {
                            bool = Boolean.valueOf(linkedHashSet.add(new C206209Bd(EnumC64262vl.A05, anonymousClass317, EnumC64222vh.A06)));
                            break;
                        }
                        i++;
                    }
                }
                arrayList2.add(bool);
            }
            ImmutableSet A03 = ImmutableSet.A03(linkedHashSet);
            C14360o3.A0A(A03);
            return A03;
        }
        return C16910sj.A00;
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ void Cnx(boolean z) {
        throw new UnsupportedOperationException(AbstractC111324zv.A00(53));
    }

    @Override // X.InterfaceC669530m
    public final void deactivate() {
        C670730y c670730y = this.A0C;
        if (c670730y != null) {
            c670730y.deactivate();
        }
        UserSession userSession = this.A03;
        if (C18U.A06(C06090Tz.A05, userSession, 36327812642126724L)) {
            CCV.A00(userSession).EGE();
        }
    }

    public AnonymousClass316(UserSession userSession, C65192xH c65192xH, C670330u c670330u, C670730y c670730y, C669430l c669430l, AnonymousClass315 anonymousClass315, C61842rl c61842rl) {
        this.A05 = c669430l;
        this.A0B = c670330u;
        this.A0C = c670730y;
        this.A06 = anonymousClass315;
        this.A03 = userSession;
        this.A04 = c65192xH;
        this.A0D = c61842rl;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A08 = C18U.A06(c06090Tz, userSession, 36314541193169586L);
        this.A07 = C18U.A06(c06090Tz, userSession, 36313944193042767L);
        this.A09 = C18U.A06(c06090Tz, userSession, 36314541193235123L);
        this.A0A = C18U.A06(c06090Tz, userSession, 36320567032292013L);
        this.A0E = AbstractC16830sb.A06(AnonymousClass317.A08, AnonymousClass317.A0J);
    }

    @Override // X.C1I7, X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int i6;
        InterfaceC38381qS interfaceC38381qS;
        C38321qM A02;
        int A03 = C0f9.A03(-1901483539);
        C14360o3.A0B(c3fq, 0);
        if (!this.A07) {
            i6 = -613352810;
        } else {
            InterfaceC65242xM AZU = c3fq.AZU();
            C14360o3.A0C(AZU, "null cannot be cast to non-null type com.instagram.mainfeed.adapter.MainFeedAdapter");
            C65192xH c65192xH = (C65192xH) AZU;
            Object item = c65192xH.getItem(c3fq.BM3());
            if (item != null) {
                int B5m = c65192xH.B5m();
                for (int i7 = 0; i7 < B5m; i7++) {
                    C3XG A032 = c65192xH.A03(i7);
                    if (A032 != null && (((interfaceC38381qS = A032.A05) != null && interfaceC38381qS.equals(item)) || ((A02 = C3XH.A02(A032.A05)) != null && A02.equals(item)))) {
                        this.A00 = Math.max(this.A00, i7);
                    }
                }
            }
            i6 = -1726528586;
        }
        C0f9.A0A(i6, A03);
    }
}
