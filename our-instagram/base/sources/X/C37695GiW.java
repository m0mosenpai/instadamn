package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.GiW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37695GiW implements C31E, InterfaceC12870lZ, InterfaceC13000lm {
    public boolean A00;
    public boolean A01;
    public final UserSession A02;
    public final InterfaceC09390do A03;

    public C37695GiW(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = AbstractC09440dt.A00(EnumC09460dv.A02, new J8Z(this, 9));
    }

    public final void A05(C120985dq c120985dq, String str, int i, boolean z) {
        C14360o3.A0B(str, 0);
        if (!this.A00) {
            C0XJ c0xj = new C0XJ();
            c0xj.A00("analytics_module", str, 1);
            c0xj.A00("client_position", String.valueOf(i), 2);
            c0xj.A00("delivery_flags", AbstractC37799GkE.A00(c120985dq.A03), 1);
            c0xj.A00("clips_item_type", c120985dq.A01.toString(), 1);
            c0xj.A00("media_id", String.valueOf(AbstractC25231BEo.A0s(c120985dq.A02)), 1);
            A00(c0xj, this, "is_sub_imp", String.valueOf(z), 8).markerPoint(976032351, 0, 7, "organic_impressed", c0xj, System.currentTimeMillis(), TimeUnit.MILLISECONDS, 0);
        }
    }

    public final void A06(C120985dq c120985dq, String str, String str2, int i, boolean z, boolean z2) {
        C14360o3.A0B(str, 0);
        if (!this.A00) {
            C0XJ c0xj = new C0XJ();
            c0xj.A00("analytics_module", str, 1);
            c0xj.A00("client_position", String.valueOf(i), 2);
            c0xj.A00("global_position", String.valueOf(AbstractC37654Ghn.A00(c120985dq)), 2);
            c0xj.A00("delivery_flags", AbstractC37799GkE.A00(c120985dq.A03), 1);
            c0xj.A00("clips_item_type", c120985dq.A01.toString(), 1);
            c0xj.A00("ad_id", c120985dq.getId(), 1);
            c0xj.A00("is_sub_imp", String.valueOf(z), 8);
            c0xj.A00("is_sync", String.valueOf(z2), 8);
            A00(c0xj, this, "delivery_context", str2, 1).markerPoint(976032351, 0, 7, "ad_impressed", c0xj, System.currentTimeMillis(), TimeUnit.MILLISECONDS, 0);
        }
    }

    @Override // X.C31G
    public final void Ci6(String str, String str2, String str3) {
        throw C00O.createAndThrow();
    }

    @Override // X.C31E
    public final void CiB(Iterable iterable, String str, String str2) {
    }

    @Override // X.C31G
    public final void CiD(int i, boolean z, long j) {
    }

    @Override // X.C31G
    public final void CiE(String str, int i, long j, boolean z) {
    }

    @Override // X.C31G
    public final void CiF(String str, String str2, String str3, String str4, boolean z, boolean z2) {
    }

    @Override // X.C31G
    public final void CiG(C85633rs c85633rs, List list, int i, long j, boolean z) {
        String str;
        int i2;
        int A08 = AbstractC25230BEn.A08(0, list, c85633rs);
        if (!this.A00) {
            C0XJ c0xj = new C0XJ();
            c0xj.A00("is_sync", String.valueOf(c85633rs.A0B), 8);
            c0xj.A00("analytics_module", c85633rs.A03, 1);
            Integer num = c85633rs.A00;
            String str2 = null;
            if (num != null) {
                str = AbstractC37798GkD.A01(num);
            } else {
                str = null;
            }
            c0xj.A00("delivery_context", str, 1);
            c0xj.A00("ad_count", String.valueOf(list.size()), 2);
            c0xj.A00("existing_post_count", String.valueOf(c85633rs.A01), 2);
            ArrayList A0i = AbstractC167007dF.A0i(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C120985dq c120985dq = (C120985dq) ((C206239Bg) it.next()).A03;
                C14360o3.A0B(c120985dq, 0);
                A0i.add(c120985dq.getId());
            }
            c0xj.A00("ad_ids", A0i.toString(), A08);
            ArrayList A0i2 = AbstractC167007dF.A0i(list);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C40861ut c40861ut = (C40861ut) ((C206239Bg) it2.next()).A04;
                if (c40861ut != null) {
                    i2 = c40861ut.A09();
                } else {
                    i2 = -1;
                }
                A0i2.add(Integer.valueOf(i2));
            }
            c0xj.A00("ad_target_positions", A0i2.toString(), A08);
            c0xj.A00("target_position_offset", String.valueOf(c85633rs.A02), 2);
            c0xj.A00("organic_ids", c85633rs.A08.toString(), A08);
            String str3 = c85633rs.A07;
            if (str3 != null) {
                str2 = str3;
            }
            c0xj.A00("response_module", str2, 1);
            A00(c0xj, this, "is_cached_response", String.valueOf(c85633rs.A09), 8).markerPoint(976032351, 0, 7, "received_ad", c0xj, System.currentTimeMillis(), TimeUnit.MILLISECONDS, 0);
        }
    }

    @Override // X.C31G
    public final void CiH(C85633rs c85633rs, Iterable iterable) {
        String str;
        C14360o3.A0B(c85633rs, 0);
        if (!this.A00) {
            C0XJ c0xj = new C0XJ();
            String str2 = c85633rs.A06;
            String str3 = null;
            if (str2 != null) {
                str = new C11L("[{}\"\\s]").A00(str2, "");
            } else {
                str = null;
            }
            c0xj.A00("page_token", str, 1);
            c0xj.A00("is_sync", String.valueOf(c85633rs.A0B), 8);
            c0xj.A00("analytics_module", c85633rs.A03, 1);
            Integer num = c85633rs.A00;
            if (num != null) {
                str3 = AbstractC37798GkD.A01(num);
            }
            c0xj.A00("delivery_context", str3, 1);
            c0xj.A00("existing_post_count", String.valueOf(c85633rs.A01), 2);
            c0xj.A00("organic_ids", c85633rs.A08.toString(), 4);
            c0xj.A00("use_network_cache", String.valueOf(c85633rs.A0A), 8);
            c0xj.A00("cache_key_used", c85633rs.A04, 1);
            A00(c0xj, this, CacheBehaviorLogger.CACHE_POLICY, c85633rs.A05, 1).markerPoint(976032351, 0, 7, "ad_request_start", c0xj, System.currentTimeMillis(), TimeUnit.MILLISECONDS, 0);
        }
    }

    @Override // X.C31E
    public final void CkJ(InterfaceC42381xS interfaceC42381xS) {
    }

    @Override // X.C31E
    public final void CkN(String str, String str2) {
    }

    @Override // X.C31E
    public final void CkO(InterfaceC42381xS interfaceC42381xS, Iterable iterable) {
    }

    @Override // X.C31H
    public final void Cky(C9B3 c9b3, String str, long j, long j2, long j3) {
    }

    @Override // X.C31E
    public final void Cm0(C3ZB c3zb) {
        C14360o3.A0B(c3zb, 0);
        if (!this.A00) {
            C0XJ c0xj = new C0XJ();
            A00(c0xj, this, "poolz_size", String.valueOf(c3zb.A00), 2).markerPoint(976032351, 0, 7, "on_surface_destroyed", c0xj, System.currentTimeMillis(), TimeUnit.MILLISECONDS, 0);
        }
    }

    @Override // X.C31E
    public final /* synthetic */ void DrI(C3ZB c3zb) {
    }

    @Override // X.C31E
    public final void ERS(String str) {
    }

    @Override // X.C31E
    public final void ETt(int i) {
    }

    public static final C006802i A01(C37695GiW c37695GiW) {
        return (C006802i) AbstractC166987dD.A17(c37695GiW.A03);
    }

    private final void A02(C206239Bg c206239Bg, Integer num, String str, String str2) {
        int i;
        String str3;
        if (!this.A00) {
            C0XJ c0xj = new C0XJ();
            c0xj.A00("analytics_module", str, 1);
            C40861ut c40861ut = (C40861ut) c206239Bg.A04;
            if (c40861ut != null) {
                i = c40861ut.A09();
            } else {
                i = -1;
            }
            c0xj.A00("client_position", String.valueOf(i), 2);
            C120985dq c120985dq = (C120985dq) c206239Bg.A03;
            c0xj.A00("global_position", String.valueOf(AbstractC37654Ghn.A00(c120985dq)), 2);
            c0xj.A00(TraceFieldType.FailureReason, str2, 1);
            String str4 = null;
            if (num != null) {
                str3 = num.toString();
            } else {
                str3 = null;
            }
            c0xj.A00("max_seen_index", str3, 2);
            C14360o3.A0B(c120985dq, 0);
            c0xj.A00("ad_id", c120985dq.getId(), 1);
            Integer num2 = (Integer) c206239Bg.A00;
            if (num2 != null) {
                str4 = AbstractC37798GkD.A01(num2);
            }
            c0xj.A00("delivery_context", str4, 1);
            A00(c0xj, this, "is_sync", String.valueOf(c206239Bg.A01), 8).markerPoint(976032351, 0, 7, "ad_insertion_fail", c0xj, System.currentTimeMillis(), TimeUnit.MILLISECONDS, 0);
        }
    }

    public static final void A04(C37695GiW c37695GiW) {
        if (!c37695GiW.A01 && !c37695GiW.A00) {
            A01(c37695GiW).markerStart(976032351, 0, System.currentTimeMillis(), TimeUnit.MILLISECONDS);
            c37695GiW.A01 = true;
            C218914p.A05(c37695GiW);
        }
    }

    public final /* bridge */ /* synthetic */ void A07(Object obj, boolean z) {
        String str;
        C120985dq c120985dq = (C120985dq) obj;
        if (!this.A00) {
            A04(this);
            C0XJ c0xj = new C0XJ();
            c0xj.A00("cache_seen_state", String.valueOf(z), 8);
            if (c120985dq != null) {
                str = c120985dq.getId();
            } else {
                str = null;
            }
            A00(c0xj, this, "item_id", String.valueOf(str), 1).markerPoint(976032351, 0, 7, "mark_cache_as_seen", c0xj, System.currentTimeMillis(), TimeUnit.MILLISECONDS, 0);
        }
    }

    @Override // X.C31E
    public final /* bridge */ /* synthetic */ void Ci8(InterfaceC42381xS interfaceC42381xS, Object obj) {
        C1PZ c1pz = (C1PZ) obj;
        AbstractC167017dG.A1N(interfaceC42381xS, c1pz);
        String str = c1pz.A0E;
        String str2 = c1pz.A0F;
        A02((C206239Bg) interfaceC42381xS.BUM(), Integer.valueOf(c1pz.A02), str, str2);
    }

    @Override // X.C31E
    public final /* bridge */ /* synthetic */ void Ci9(InterfaceC42381xS interfaceC42381xS, Object obj) {
        int i;
        String str;
        C1PZ c1pz = (C1PZ) obj;
        boolean A1R = AbstractC167007dF.A1R(0, interfaceC42381xS, c1pz);
        if (!this.A00) {
            C0XJ c0xj = new C0XJ();
            c0xj.A00("analytics_module", c1pz.A0E, A1R ? 1 : 0);
            C206239Bg c206239Bg = (C206239Bg) interfaceC42381xS.BUM();
            C40861ut c40861ut = (C40861ut) c206239Bg.A04;
            if (c40861ut != null) {
                i = c40861ut.A09();
            } else {
                i = -1;
            }
            c0xj.A00("client_position", String.valueOf(i), 2);
            C120985dq c120985dq = (C120985dq) c206239Bg.A03;
            c0xj.A00("global_position", String.valueOf(AbstractC37654Ghn.A00(c120985dq)), 2);
            C14360o3.A0B(c120985dq, 0);
            c0xj.A00("ad_id", c120985dq.getId(), A1R ? 1 : 0);
            Integer num = (Integer) c206239Bg.A00;
            if (num != null) {
                str = AbstractC37798GkD.A01(num);
            } else {
                str = null;
            }
            c0xj.A00("delivery_context", str, A1R ? 1 : 0);
            A00(c0xj, this, "is_sync", String.valueOf(c206239Bg.A01), 8).markerPoint(976032351, 0, 7, "ad_insertion_success", c0xj, System.currentTimeMillis(), TimeUnit.MILLISECONDS, 0);
        }
    }

    @Override // X.C31F
    public final /* bridge */ /* synthetic */ void CiA(C1PZ c1pz, Long l, Object obj, String str, String str2, String str3, String str4, Collection collection, Collection collection2, Map map, Map map2, boolean z) {
        C206239Bg c206239Bg = (C206239Bg) obj;
        AbstractC167017dG.A1O(c206239Bg, str);
        C14360o3.A0B(c1pz, 11);
        A02(c206239Bg, Integer.valueOf(c1pz.A02), c1pz.A0E, str);
    }

    public static C006802i A00(C0XJ c0xj, C37695GiW c37695GiW, String str, String str2, int i) {
        c0xj.A00(str, str2, i);
        return A01(c37695GiW);
    }

    public static void A03(C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC11380iw interfaceC11380iw, C37695GiW c37695GiW, boolean z) {
        c37695GiW.A06(c120985dq, interfaceC11380iw.getModuleName(), c37644Ghd.A0K, c37644Ghd.A06(), z, c37644Ghd.A0O);
    }

    @Override // X.C31I
    public final void CiC(C38321qM c38321qM, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, HashMap hashMap, List list, List list2, List list3, float f, int i) {
        AbstractC167027dH.A12(list, list2, list3);
        AbstractC167007dF.A1G(str, 3, str2);
        AbstractC167007dF.A1I(str3, 7, hashMap);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(1915858380);
        if (!this.A00) {
            A01(this).markerEnd(976032351, 0, (short) 2);
            this.A00 = true;
            C218914p.A06(this);
        }
        C0f9.A0A(1607902724, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(58549009, C0f9.A03(-1498508335));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C218914p.A06(this);
        this.A01 = false;
        this.A00 = false;
    }

    @Override // X.C31E
    public final /* bridge */ /* synthetic */ void Ci7(Integer num, Object obj) {
    }

    @Override // X.C31E
    public final /* bridge */ /* synthetic */ void Cit(InterfaceC42381xS interfaceC42381xS, Object obj, String str) {
    }

    @Override // X.C31E
    public final /* bridge */ /* synthetic */ void Cke(Object obj) {
    }

    @Override // X.C31E
    public final /* bridge */ /* synthetic */ void Ckf(InterfaceC42381xS interfaceC42381xS, Object obj) {
    }

    @Override // X.C31E
    public final /* bridge */ /* synthetic */ void Ckg(InterfaceC42381xS interfaceC42381xS, Object obj) {
    }

    @Override // X.C31F
    public final /* bridge */ /* synthetic */ void Ckh(Object obj, String str, Collection collection) {
    }

    @Override // X.C31H
    public final /* bridge */ /* synthetic */ void Ckx(Integer num, Object obj, String str, List list) {
    }
}
