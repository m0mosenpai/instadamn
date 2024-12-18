package X;

import android.content.Context;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.flashmedia.FlashMediaRepository;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Gj1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37726Gj1 extends AbstractC37623GhI implements InterfaceC43071ya {
    public List A00;
    public AnonymousClass195 A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final C37521Gfd A05;
    public final C153696ve A06;
    public final ClipsViewerSource A07;
    public final UserSession A08;
    public final InterfaceC43545JLf A09;
    public final EnumC37328GcW A0A;
    public final C28091Xn A0B;
    public final C124245je A0C;
    public final C37546Gg2 A0D;
    public final C37705Gig A0E;
    public final C37659Ghs A0F;
    public final String A0G;
    public final Map A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final C19L A0K;
    public final C37794Gk9 A0L;
    public final C37586Ggh A0M;

    public static final C120985dq A00(C37726Gj1 c37726Gj1, List list, List list2) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C38321qM c38321qM = (C38321qM) it.next();
                if (!c38321qM.CdW()) {
                    if (!c38321qM.A66() && !c37726Gj1.A0B.A03(c38321qM.getId())) {
                        String A2u = c38321qM.A2u();
                        if (A2u != null) {
                            C57782kr A00 = C57782kr.A00(c37726Gj1.A08);
                            if (!A00.A0L().contains(A2u)) {
                                if (A00.A04.contains(A2u)) {
                                }
                            }
                        }
                        if ((c38321qM.A3j() == null || !(!r0.isEmpty())) && !A03(c38321qM, c37726Gj1)) {
                            C120985dq A02 = C128085qc.A02(c38321qM);
                            UserSession userSession = c37726Gj1.A08;
                            C14360o3.A0B(userSession, 0);
                            if (!C18U.A06(C06090Tz.A05, userSession, 36328151946640645L)) {
                                A02.A0E(C05F.A01);
                            }
                            if (!c37726Gj1.A0D.A0A.A0b(A02)) {
                                return A02;
                            }
                        }
                    }
                    list2.add(c38321qM);
                }
            }
        }
        return null;
    }

    public static final boolean A02(C120985dq c120985dq, C37726Gj1 c37726Gj1, boolean z) {
        Integer num;
        List list;
        if (c120985dq == null) {
            return false;
        }
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null && (list = c37726Gj1.A00) != null) {
            list.remove(c38321qM);
        }
        UserSession userSession = c37726Gj1.A08;
        if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36328151946640645L)) {
            c120985dq.A0E(C05F.A01);
        }
        C37546Gg2 c37546Gg2 = c37726Gj1.A0D;
        if (z) {
            c37546Gg2.A0D(AbstractC166987dD.A1J(c120985dq), true);
        } else {
            AbstractC37552Gg8 abstractC37552Gg8 = c37546Gg2.A0A;
            int A0B = abstractC37552Gg8.A0B() - 1;
            if (A0B < 0) {
                A0B = 0;
            }
            abstractC37552Gg8.A0c(c120985dq, A0B);
        }
        C37695GiW c37695GiW = (C37695GiW) c37726Gj1.A0I.getValue();
        if (c37695GiW != null) {
            String id = c120985dq.getId();
            if (!c37695GiW.A00) {
                C0XJ c0xj = new C0XJ();
                C37695GiW.A00(c0xj, c37695GiW, "media_id", id, 1).markerPoint(976032351, 0, 7, "flash_cache_insertion", c0xj, System.currentTimeMillis(), TimeUnit.MILLISECONDS, 0);
            }
        }
        if (AbstractC31178DnM.A1a(c37726Gj1.A0J)) {
            C3YO A00 = C3YM.A00(userSession);
            C3YP c3yp = C3YP.A06;
            if (z) {
                num = C05F.A15;
            } else {
                num = C05F.A0u;
            }
            int A002 = C37546Gg2.A00(c37546Gg2);
            if (!z) {
                A002--;
            }
            A00.A07(new C25615BUc(c3yp, num, Integer.valueOf(A002), null, null, null, null, c120985dq.getId()));
        }
        return true;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C38321qM c38321qM;
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        Integer CFq = interfaceC57162jr.CFq(c59062n7);
        Integer num = C05F.A00;
        if (CFq == num && (c38321qM = ((C120985dq) c59062n7.A03).A02) != null) {
            this.A09.EFk(c38321qM, this.A0A);
            C124245je c124245je = this.A0C;
            List singletonList = Collections.singletonList(c38321qM);
            C14360o3.A07(singletonList);
            c124245je.A00(EnumC124255jf.A03, num, singletonList);
        }
    }

    public static final void A01(C37752GjR c37752GjR, C37726Gj1 c37726Gj1) {
        Integer num;
        UserSession userSession = c37726Gj1.A08;
        C06090Tz A0j = AbstractC25225BEi.A0j(userSession, 0);
        if (C18U.A06(A0j, userSession, 36325845548021183L) && C1BU.A00().A02()) {
            return;
        }
        C14360o3.A0B(userSession, 0);
        if ((C18U.A06(A0j, userSession, 36325845548086720L) && C1BU.A00().A03()) || !c37726Gj1.A02 || c37726Gj1.A0D.A0A.A0a() || (num = c37752GjR.A00) == C05F.A01) {
            return;
        }
        if ((C18U.A06(A0j, userSession, 36328151946312962L) && num == C05F.A00) || C18U.A06(A0j, userSession, 36317835433481849L) || c37726Gj1.A03) {
            return;
        }
        C153696ve c153696ve = c37726Gj1.A06;
        if (c153696ve != null) {
            C153696ve.A02(c153696ve, C05F.A0N);
        }
        c37726Gj1.A0B(new BQP(c37726Gj1, 22), new BQP(c37726Gj1, 23), true);
        c37726Gj1.A02 = false;
    }

    public final void A0B(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, boolean z) {
        C29708D8b c29708D8b = new C29708D8b(10, interfaceC16820sZ2, interfaceC16820sZ, this, z);
        if ((!C18U.A06(C06090Tz.A05, this.A08, 36323358761036987L) || !z) && this.A00 != null) {
            c29708D8b.invoke();
            return;
        }
        C37803GkI c37803GkI = new C37803GkI(2, this, c29708D8b);
        this.A09.B6V(new C37764Gjf(this.A06), c37803GkI, this.A0A);
    }

    public C37726Gj1(Context context, C153696ve c153696ve, ClipsViewerSource clipsViewerSource, UserSession userSession, C37546Gg2 c37546Gg2, C37705Gig c37705Gig, C37586Ggh c37586Ggh, C37659Ghs c37659Ghs, String str, C19L c19l, boolean z) {
        FlashMediaRepository flashMediaRepository;
        AbstractC25234BEr.A1P(context, userSession, c37586Ggh);
        AbstractC167007dF.A1I(c37659Ghs, 5, clipsViewerSource);
        C14360o3.A0B(c37705Gig, 11);
        this.A04 = context;
        this.A08 = userSession;
        this.A0D = c37546Gg2;
        this.A0M = c37586Ggh;
        this.A0F = c37659Ghs;
        this.A06 = c153696ve;
        this.A0G = str;
        this.A07 = clipsViewerSource;
        this.A0K = c19l;
        this.A0E = c37705Gig;
        EnumC37328GcW enumC37328GcW = EnumC37328GcW.A04;
        this.A0A = enumC37328GcW;
        this.A09 = C37327GcV.A00(userSession, enumC37328GcW);
        this.A0C = AbstractC124235jd.A00(userSession);
        C28091Xn A0Q = AbstractC37302Gc3.A0Q(userSession);
        C14360o3.A07(A0Q);
        this.A0B = A0Q;
        this.A02 = AbstractC167007dF.A1X(clipsViewerSource, ClipsViewerSource.A0g);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0J = AbstractC09440dt.A00(enumC09460dv, new BQP(this, 21));
        this.A0I = AbstractC09440dt.A00(enumC09460dv, new BQP(this, 20));
        EnumMap enumMap = new EnumMap(EnumC37735GjA.class);
        enumMap.put((EnumMap) EnumC37735GjA.A06, (EnumC37735GjA) AbstractC166997dE.A0b());
        UserSession userSession2 = this.A08;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession2, 36319746693537418L)) {
            enumMap.put((EnumMap) EnumC37735GjA.A07, (EnumC37735GjA) AbstractC166997dE.A0c(c06090Tz, userSession2, 36319746693799566L));
            enumMap.put((EnumMap) EnumC37735GjA.A08, (EnumC37735GjA) AbstractC166997dE.A0c(c06090Tz, userSession2, 36319746693865103L));
            enumMap.put((EnumMap) EnumC37735GjA.A03, (EnumC37735GjA) AbstractC166997dE.A0c(c06090Tz, userSession2, 36319746693734029L));
            enumMap.put((EnumMap) EnumC37735GjA.A04, (EnumC37735GjA) AbstractC166997dE.A0c(c06090Tz, userSession2, 36319746693602955L));
            enumMap.put((EnumMap) EnumC37735GjA.A05, (EnumC37735GjA) AbstractC166997dE.A0c(c06090Tz, userSession2, 36319746693668492L));
        }
        this.A0H = enumMap;
        this.A05 = new C37521Gfd(this, 5);
        C37794Gk9 c37794Gk9 = new C37794Gk9(this);
        this.A0L = c37794Gk9;
        c37586Ggh.A03(c37794Gk9);
        if (C26341Pp.A02 && C18U.A06(C06090Tz.A06, userSession, 36331012393157747L)) {
            UserSession userSession3 = this.A08;
            C14360o3.A0B(userSession3, 0);
            if (C18U.A06(c06090Tz, userSession3, 36325845548021183L) && C1BU.A00().A02()) {
                return;
            }
            if ((C18U.A06(c06090Tz, userSession3, 36325845548086720L) && C1BU.A00().A03()) || z || !this.A02 || this.A0D.A0A.A0a()) {
                return;
            }
            C226418s A01 = C226218q.A01(AbstractC12960li.A00);
            A01.A0P(A01.A02, "REELS_TAB_FLASH_CACHE_INSERTION_STARTED");
            InterfaceC43545JLf interfaceC43545JLf = this.A09;
            if (!(interfaceC43545JLf instanceof FlashMediaRepository) || (flashMediaRepository = (FlashMediaRepository) interfaceC43545JLf) == null) {
                return;
            }
            ILG ilg = new ILG(this);
            flashMediaRepository.A01 = ilg;
            if (!flashMediaRepository.A06) {
                return;
            }
            ilg.A00(flashMediaRepository.A00);
            flashMediaRepository.A01 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6.A08, 36328521312255586L) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A03(X.C38321qM r5, X.C37726Gj1 r6) {
        /*
            X.3x9 r0 = X.AbstractC25226BEj.A0u(r5)
            r4 = 1
            if (r0 == 0) goto L42
            java.lang.Boolean r0 = r0.Ay0()
            boolean r2 = X.AbstractC166997dE.A1Z(r0, r4)
        Lf:
            java.util.Set r1 = X.AbstractC37655Gho.A02
            java.util.Set r0 = X.AbstractC37655Gho.A00
            java.util.LinkedHashSet r1 = X.AnonymousClass090.A00(r0, r1)
            X.GjA r0 = X.AbstractC37655Gho.A00(r5)
            boolean r0 = r1.contains(r0)
            if (r2 == 0) goto L44
            if (r0 == 0) goto L32
            com.instagram.common.session.UserSession r3 = r6.A08
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36328521312255586(0x81109900083e62, double:3.037641388859694E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L41
        L32:
            com.instagram.common.session.UserSession r3 = r6.A08
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323109653457916(0x810bad00082bfc, double:3.0342190340450464E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L44
        L41:
            return r4
        L42:
            r2 = 0
            goto Lf
        L44:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37726Gj1.A03(X.1qM, X.Gj1):boolean");
    }

    @Override // X.AbstractC37623GhI, X.InterfaceC60602pj
    public final void onDestroyView() {
        super.onDestroyView();
        C37556GgC c37556GgC = super.A02;
        if (c37556GgC != null) {
            c37556GgC.A0H(this.A05);
        }
    }
}
