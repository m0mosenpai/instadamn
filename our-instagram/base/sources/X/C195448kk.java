package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.metagallery.MetaGalleryRepository$special$$inlined$map$1$2;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.8kk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195448kk implements InterfaceC11380iw, InterfaceC13000lm {
    public static final String __redex_internal_original_name = "MetaGalleryRepository";
    public final C2GT A00;
    public final UserSession A01;
    public final C05A A02;
    public final C05A A03;
    public final C05A A04;
    public final C0UO A05;
    public final C0UO A06;
    public final C0UO A07;
    public final C30T A08;
    public final C30T A09;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.30T] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.30T] */
    public C195448kk(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A08 = new Object();
        this.A09 = new Object();
        C008002u A00 = C10E.A00(C16930sl.A00);
        this.A03 = A00;
        this.A06 = AbstractC208910l.A02(A00);
        C008002u A002 = C10E.A00(AbstractC06930Yk.A0E());
        this.A02 = A002;
        this.A05 = AbstractC208910l.A02(A002);
        C008002u A003 = C10E.A00(A00(this));
        this.A04 = A003;
        final AnonymousClass059 A02 = AbstractC208910l.A02(A003);
        this.A07 = A02;
        this.A00 = AbstractC58232lf.A00(AnonymousClass191.A00, new InterfaceC19390xP() { // from class: X.8ko
            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = InterfaceC19390xP.this.collect(new MetaGalleryRepository$special$$inlined$map$1$2(interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        });
    }

    public final void A03(String str) {
        UserSession userSession = this.A01;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36316645727474238L)) {
            this.A08.A00(new C9G2(this, null, str, 13), C18U.A01(c06090Tz, userSession, 36598120704248942L));
            return;
        }
        A01(this, str, null);
    }

    public final void A04(String str) {
        UserSession userSession = this.A01;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36316645727998531L)) {
            this.A09.A00(new C9G2(this, null, str, 14), C18U.A01(c06090Tz, userSession, 36598120704773233L));
            return;
        }
        A02(this, str, null);
    }

    public final void A05(String str, String str2, InterfaceC16660sJ interfaceC16660sJ) {
        Iterator it = ((Iterable) this.A03.getValue()).iterator();
        while (true) {
            String str3 = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (C14360o3.A0K(((C9CO) next).A04, str)) {
                if (next != null) {
                    C195478kn c195478kn = (C195478kn) ((Map) this.A02.getValue()).get(str);
                    if (c195478kn != null && !c195478kn.A03) {
                        return;
                    }
                    UserSession userSession = this.A01;
                    int A01 = (int) C18U.A01(C06090Tz.A05, userSession, 36601178720702595L);
                    if (c195478kn != null) {
                        str3 = c195478kn.A00;
                    }
                    C40701ud A012 = AbstractC40691uc.A01(userSession);
                    C2JM c2jm = new C2JM();
                    C2JM c2jm2 = new C2JM();
                    c2jm.A04("albumType", str);
                    Integer valueOf = Integer.valueOf(A01);
                    c2jm.A03("first", valueOf);
                    boolean z = false;
                    if (valueOf != null) {
                        z = true;
                    }
                    c2jm.A04("after", str3);
                    C18C.A0E(z);
                    C2JQ c2jq = PandoGraphQLRequest.Companion;
                    C1Dk maxToleratedCacheAgeMs = new PandoGraphQLRequest(AbstractC40511uK.A00(), "MetaGalleryAlbumMedia", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C67539Und.class, false, null, 0, null, "meta_gallery", new ArrayList()).setFreshCacheAgeMs(0L).setMaxToleratedCacheAgeMs(0L);
                    A012.ATV(new C23358AXh(this, str2, str, interfaceC16660sJ), new C70443WVv(this), maxToleratedCacheAgeMs);
                    return;
                }
            }
        }
        AbstractC208329Jr.A09(this, this.A01, "error_logging", str2, AbstractC06930Yk.A06(new C09530e4("album_type", str), new C09530e4("error_message", "Media fetch called for unknown album"), new C09530e4("error_type", "album_not_found"), new C09530e4("is_network", "non_network")));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "meta_gallery_repository";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final C195478kn A00(C195448kk c195448kk) {
        ?? r8;
        C195468km c195468km = AbstractC195458kl.A00;
        UserSession userSession = c195448kk.A01;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        String str = (String) A00.A6X.CES(A00, C23031Ai.A8c[475]);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36316645727670848L) && str != null) {
            Type type = new RSb().A00;
            C14360o3.A07(type);
            try {
                Object A09 = new Gson().A09(str, type);
                C14360o3.A07(A09);
                ArrayList arrayList = new ArrayList();
                for (Object obj : (Iterable) A09) {
                    if (((C66621UPi) obj).A04 != null) {
                        arrayList.add(obj);
                    }
                }
                r8 = new ArrayList();
                for (Object obj2 : arrayList) {
                    C66621UPi c66621UPi = (C66621UPi) obj2;
                    long A01 = C18U.A01(c06090Tz, userSession, 36598120705952884L);
                    if (A01 == -1 || (System.currentTimeMillis() / 1000) - c66621UPi.A00 < A01) {
                        r8.add(obj2);
                    }
                }
            } catch (Exception e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                AbstractC208329Jr.A09(c195468km, userSession, "error_logging", null, AbstractC06930Yk.A06(new C09530e4("error_message", message), new C09530e4("error_type", "recents_cache_read"), new C09530e4("is_network", "non_network")));
            }
            return new C195478kn(null, null, AbstractC001800i.A0k(r8), false);
        }
        r8 = C16930sl.A00;
        return new C195478kn(null, null, AbstractC001800i.A0k(r8), false);
    }

    public static final void A01(C195448kk c195448kk, String str, InterfaceC16660sJ interfaceC16660sJ) {
        UserSession userSession = c195448kk.A01;
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        int A012 = (int) C18U.A01(c06090Tz, userSession, 36601178720637058L);
        int A013 = (int) C18U.A01(c06090Tz, userSession, 36601178720768132L);
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        Integer valueOf = Integer.valueOf(A012);
        c2jm.A03("first", valueOf);
        boolean z = false;
        if (valueOf != null) {
            z = true;
        }
        Integer valueOf2 = Integer.valueOf(A013);
        c2jm.A03("assets_first", valueOf2);
        boolean z2 = false;
        if (valueOf2 != null) {
            z2 = true;
        }
        C18C.A0E(z);
        C18C.A0E(z2);
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        C1Dk maxToleratedCacheAgeMs = new PandoGraphQLRequest(AbstractC40511uK.A00(), "MetaGalleryAlbums", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C66923UdH.class, false, null, 0, null, "meta_gallery", new ArrayList()).setFreshCacheAgeMs(0L).setMaxToleratedCacheAgeMs(0L);
        A01.ATV(new C23356AXf(c195448kk, str, interfaceC16660sJ), new C70442WVu(c195448kk), maxToleratedCacheAgeMs);
    }

    public static final void A02(C195448kk c195448kk, String str, InterfaceC16660sJ interfaceC16660sJ) {
        UserSession userSession = c195448kk.A01;
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        int A012 = (int) C18U.A01(C06090Tz.A05, userSession, 36601178720833669L);
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        Integer valueOf = Integer.valueOf(A012);
        c2jm.A03("first", valueOf);
        boolean z = false;
        if (valueOf != null) {
            z = true;
        }
        C18C.A0E(z);
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        C1Dk maxToleratedCacheAgeMs = new PandoGraphQLRequest(AbstractC40511uK.A00(), "MetaGalleryRecentsQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C66928UdM.class, false, null, 0, null, "meta_gallery", new ArrayList()).setFreshCacheAgeMs(0L).setMaxToleratedCacheAgeMs(0L);
        A01.ATV(new C23357AXg(c195448kk, str, interfaceC16660sJ), new C70444WVw(c195448kk), maxToleratedCacheAgeMs);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A03.Egh(C16930sl.A00);
        this.A02.Egh(AbstractC06930Yk.A0E());
        this.A04.Egh(new C195478kn(null, null, C16910sj.A00, false));
    }
}
