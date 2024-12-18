package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.87T, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C87T extends AbstractC52922bZ implements C87U {
    public A82 A00;
    public C47903LDx A01;
    public C1824587k A02;
    public AnonymousClass859 A03;
    public AnonymousClass858 A04;
    public C1810281e A05;
    public String A06;
    public List A07;
    public AnonymousClass195 A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final C87R A0C;
    public final MiniGalleryService A0D;
    public final UserSession A0E;
    public final C86K A0F;
    public final String A0G;
    public final HashSet A0H;
    public final List A0I;
    public final AtomicBoolean A0J;
    public final AtomicBoolean A0K;
    public final AtomicBoolean A0L;
    public final AtomicBoolean A0M;
    public final C05A A0N;
    public final C05A A0O;
    public final C05A A0P;
    public final C1824487j A0Q;
    public final C86G A0R;
    public final C86H A0S;
    public final C142246bh A0T;

    public C87T(C87R c87r, MiniGalleryService miniGalleryService, AnonymousClass858 anonymousClass858, C142246bh c142246bh, UserSession userSession, String str, List list, boolean z) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(anonymousClass858, 3);
        C14360o3.A0B(c142246bh, 4);
        C14360o3.A0B(c87r, 7);
        this.A0E = userSession;
        this.A0D = miniGalleryService;
        this.A04 = anonymousClass858;
        this.A0T = c142246bh;
        this.A0I = list;
        this.A0G = str;
        this.A0C = c87r;
        this.A0J = new AtomicBoolean(false);
        this.A0L = new AtomicBoolean(true);
        this.A0M = new AtomicBoolean(false);
        this.A0K = new AtomicBoolean(true);
        this.A0H = new HashSet();
        this.A0O = new C008002u(EnumC1824287h.A02);
        this.A0N = new C008002u(0);
        this.A0P = new C008002u(EnumC1824387i.A02);
        this.A0F = new C86K();
        this.A0Q = new C1824487j();
        this.A0R = C86G.A00;
        this.A0S = new C86H(z);
        this.A03 = AnonymousClass859.A08;
        this.A02 = new C1824587k();
        this.A07 = C16930sl.A00;
    }

    public final void A08(String str) {
        C14360o3.A0B(str, 0);
        String obj = UUID.randomUUID().toString();
        C14360o3.A0B(obj, 0);
        this.A06 = obj;
        C87R c87r = this.A0C;
        c87r.A02.set(false);
        AtomicLong atomicLong = c87r.A03;
        C24Q c24q = c87r.A01;
        atomicLong.set(c24q.A04(Integer.valueOf(obj.hashCode()), null, 17638221, c87r.A00));
        c24q.A0B(atomicLong.get(), "product_id", str, true);
    }

    public final void A0A(String str) {
        C14360o3.A0B(str, 0);
        this.A04.A01.Egh(new C9CB(this.A03, str));
    }

    public static final String A00(C87T c87t) {
        return ((C9CB) c87t.A04.A01.getValue()).A02;
    }

    public static final void A01(C87T c87t) {
        if (!c87t.A07.isEmpty()) {
            if (c87t.A0B) {
                c87t.A02.A00.A0B(c87t.A07);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : c87t.A07) {
                if (!C14360o3.A0K(((C9CD) obj).A02, "MULTIPEER")) {
                    arrayList.add(obj);
                }
            }
            c87t.A02.A00.A0B(arrayList);
        }
    }

    public static final void A02(C87T c87t, String str) {
        AnonymousClass858 anonymousClass858 = c87t.A04;
        anonymousClass858.A00.Egh(new C189118Zc(C85B.A0B, str, "mini_gallery", null, null, null, null, -1, false));
    }

    public final C173767oU A04() {
        EnumC190378bv enumC190378bv;
        C1824487j c1824487j = this.A0Q;
        C86G c86g = this.A0R;
        C86H c86h = this.A0S;
        if (this.A0L.get()) {
            enumC190378bv = EnumC190378bv.A07;
        } else {
            enumC190378bv = EnumC190378bv.A05;
        }
        return new C173767oU(c1824487j, c86g, c86h, enumC190378bv, this.A0E);
    }

    public final void A05() {
        C87R c87r = this.A0C;
        if (!c87r.A02.getAndSet(true)) {
            AtomicLong atomicLong = c87r.A03;
            atomicLong.set(c87r.A01.A07("category_content_fetch_failed", "", 17638221, atomicLong.get()));
        }
    }

    public final void A06() {
        C05A c05a = this.A0O;
        if (c05a.getValue() == EnumC1824287h.A03) {
            if (this.A06 != null) {
                C4T6 A00 = C4T4.A00(this.A0E);
                String str = this.A06;
                if (str != null) {
                    A00.Cj8(str);
                } else {
                    C14360o3.A0F("discoverySessionId");
                    throw C00O.createAndThrow();
                }
            }
            c05a.Egh(EnumC1824287h.A02);
            AnonymousClass195 anonymousClass195 = this.A08;
            if (anonymousClass195 != null) {
                anonymousClass195.AGH(null);
            }
            this.A0H.clear();
            C87R c87r = this.A0C;
            if (!c87r.A02.getAndSet(true)) {
                C24Q c24q = c87r.A01;
                AtomicLong atomicLong = c87r.A03;
                if (c24q.A0E(17638221, atomicLong.get())) {
                    atomicLong.set(c24q.A06(CancelReason.USER_CANCELLED, "Mini Gallery Closed", 17638221, atomicLong.get()));
                    return;
                }
                int hashCode = UUID.randomUUID().hashCode();
                c24q.A06(CancelReason.USER_CANCELLED, AnonymousClass001.A0R("Mini Gallery Closed", AbstractC43591JPw.A00(1452)), 17638221, c24q.A04(Integer.valueOf(hashCode), null, 17638221, c87r.A00));
            }
        }
    }

    public final void A07(String str) {
        if (this.A04.A02(str)) {
            this.A04.A01(C85B.A0B);
            return;
        }
        A02(this, str);
        String str2 = this.A02.A03;
        if (str2.length() <= 0) {
            return;
        }
        C47903LDx c47903LDx = this.A01;
        if (c47903LDx == null) {
            C14360o3.A0F("searchCacheRepository");
            throw C00O.createAndThrow();
        }
        U08 A00 = U07.A00(c47903LDx.A00);
        synchronized (A00) {
            A00.A00.A04(str2);
        }
    }

    public final void A09(String str) {
        EnumC1824687l enumC1824687l;
        C1824587k c1824587k = this.A02;
        c1824587k.A03 = str;
        if (str.length() > 0) {
            enumC1824687l = EnumC1824687l.A03;
        } else {
            enumC1824687l = EnumC1824687l.A05;
        }
        c1824587k.A01.A0B(enumC1824687l);
    }

    public final void A0B(String str, List list) {
        String str2;
        EnumC50631MWs enumC50631MWs;
        C1824587k c1824587k = this.A02;
        Integer num = c1824587k.A02;
        C9CD c9cd = null;
        if (num != null) {
            int intValue = num.intValue();
            List list2 = (List) c1824587k.A00.A02();
            if (list2 != null) {
                c9cd = (C9CD) list2.get(intValue);
            }
        }
        if (c9cd != null) {
            str2 = c9cd.A02;
        } else {
            str2 = null;
        }
        if (str.equals(str2)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C46520KiJ c46520KiJ = (C46520KiJ) it.next();
                if (c46520KiJ.A09) {
                    A82 a82 = this.A00;
                    if (a82 == null) {
                        C14360o3.A0F("miniGalleryImpressionLogger");
                        throw C00O.createAndThrow();
                    }
                    String str3 = c46520KiJ.A05;
                    C14360o3.A07(str3);
                    int i = c46520KiJ.A00;
                    String A01 = c46520KiJ.A01();
                    boolean z = this.A0L.get();
                    HashSet hashSet = a82.A02.A00;
                    if (!hashSet.contains(str3)) {
                        hashSet.add(str3);
                        if (z) {
                            enumC50631MWs = EnumC50631MWs.A0J;
                        } else {
                            enumC50631MWs = EnumC50631MWs.A0I;
                        }
                        AnonymousClass229.A01(a82.A01).A13(a82.A00, enumC50631MWs, str3, str, A01, AbstractC16850sd.A0M(new C09530e4(str3, String.valueOf(i))), null, -1, 1, false, false);
                    }
                }
            }
        }
    }

    @Override // X.C87U
    public final void DAo(int i) {
        C47903LDx c47903LDx = this.A01;
        if (c47903LDx == null) {
            C14360o3.A0F("searchCacheRepository");
            throw C00O.createAndThrow();
        }
        U08 A00 = U07.A00(c47903LDx.A00);
        String A002 = C47903LDx.A00(A00, i);
        if (A002 != null) {
            synchronized (A00) {
                A00.A00.A05(A002);
            }
        }
    }

    @Override // X.C87U
    public final void DdD(int i) {
        C47903LDx c47903LDx = this.A01;
        if (c47903LDx == null) {
            C14360o3.A0F("searchCacheRepository");
            throw C00O.createAndThrow();
        }
        String A00 = C47903LDx.A00(U07.A00(c47903LDx.A00), i);
        if (A00 != null) {
            A09(A00);
        }
    }

    public final int A03() {
        if (C14360o3.A0K(A00(this), "search")) {
            return 0;
        }
        List<C9CD> list = (List) this.A02.A00.A02();
        if (list != null) {
            String A00 = A00(this);
            int i = 0;
            for (C9CD c9cd : list) {
                i++;
                if (C14360o3.A0K(A00, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE") && c9cd.A03) {
                    return i;
                }
                if (C14360o3.A0K(c9cd.A02, A00)) {
                    return i;
                }
            }
        }
        return 2;
    }
}
