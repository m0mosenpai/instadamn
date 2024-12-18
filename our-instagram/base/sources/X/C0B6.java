package X;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.SystemClock;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.process.instagram.InstagramApplicationForMainProcess;
import com.instagram.uxlogging.navigation.NavigationObserver$start$1;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0B6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0B6 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;
    public final /* synthetic */ InstagramApplicationForMainProcess A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0B6(C211211o c211211o, InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A01 = instagramApplicationForMainProcess;
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final Context context = this.A01.appContext;
        final C211211o c211211o = this.A00;
        return new AbstractC211911v(context, c211211o) { // from class: X.14i
            public final Context A00;
            public final C211211o A01;

            {
                C14360o3.A0B(context, 1);
                this.A00 = context;
                this.A01 = c211211o;
            }

            @Override // X.AbstractC211911v
            public final String A06() {
                return "UXLoggingInitializer";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                ConnectivityManager connectivityManager;
                AbstractC12990ll A08 = ((AnonymousClass122) this.A01.A00()).A08();
                C06090Tz c06090Tz = C06090Tz.A05;
                boolean A06 = C18U.A06(c06090Tz, A08, 36319007959554888L);
                long A01 = C18U.A01(c06090Tz, A08, 36600482936590227L);
                long A012 = C18U.A01(c06090Tz, A08, 36600482936328082L);
                String A04 = C18U.A04(c06090Tz, A08, 36881957913493930L);
                long A013 = C18U.A01(c06090Tz, A08, 36600482937180052L);
                long A014 = C18U.A01(c06090Tz, A08, 36600482937245589L);
                String A042 = C18U.A04(c06090Tz, A08, 36881957914345899L);
                boolean A062 = C18U.A06(c06090Tz, A08, 2342162017174690647L);
                boolean A063 = C18U.A06(c06090Tz, A08, 36319007963683706L);
                boolean A064 = C18U.A06(c06090Tz, A08, 36329333061533976L);
                boolean A065 = C18U.A06(c06090Tz, A08, 36329333061599513L);
                boolean A066 = C18U.A06(c06090Tz, A08, 36329333061665050L);
                String A043 = C18U.A04(c06090Tz, A08, 36881957917491628L);
                int A015 = (int) C18U.A01(c06090Tz, A08, 36600482941046681L);
                if (A015 < 1) {
                    A015 = 1;
                } else if (A015 > 50) {
                    A015 = 50;
                }
                final C51232Ww c51232Ww = new C51232Ww(A04, A042, A043, A015, A01, A012, A013, A014, A06, A062, A063, A064, A065, A066, C18U.A06(c06090Tz, A08, 36329333061861659L), C18U.A06(c06090Tz, A08, 36329333061927196L));
                boolean z = C1KM.A08;
                C12L c12l = C12L.A00;
                C14360o3.A0B(c12l, 1);
                C1KT.A05 = true;
                C1KM.A01 = c51232Ww;
                C1KM.A07 = AnonymousClass194.A02(c12l.AOT(1562465960, 3).A00(1));
                C1KM.A00 = new C51542Yc(c51232Ww.A00);
                C1KM.A08 = true;
                C51562Ye c51562Ye = C51562Ye.A00;
                if (DialogC51582Yg.A0L == null) {
                    DialogC51582Yg.A0L = c51562Ye;
                    if (C18U.A06(c06090Tz, A08, 36329333060813075L)) {
                        C51622Yk.A0M = true;
                    }
                    boolean z2 = C218914p.A05;
                    InterfaceC12870lZ interfaceC12870lZ = new InterfaceC12870lZ() { // from class: X.2Ym
                        @Override // X.InterfaceC12870lZ
                        public final void onAppBackgrounded() {
                            int A03 = C0f9.A03(572128999);
                            boolean z3 = C1KM.A08;
                            if (C1KT.A05) {
                                String str = ((C1KP) C1KT.A02).A01;
                                long uptimeMillis = SystemClock.uptimeMillis();
                                C1KO c1ko = new C1KO(str, uptimeMillis, uptimeMillis);
                                C1KT.A02(c1ko);
                                C1KS c1ks = C1KT.A02;
                                C1KT.A01(new C1KQ(c1ko, ((C1KP) c1ks).A01, c1ks.A03, null, "app background", SystemClock.uptimeMillis()));
                            }
                            if (C1KM.A08) {
                                String str2 = ((C1KP) C1KM.A00()).A01;
                                C1KM.A00();
                                long uptimeMillis2 = SystemClock.uptimeMillis();
                                C1KO c1ko2 = new C1KO(str2, uptimeMillis2, uptimeMillis2);
                                C1KM.A06(c1ko2);
                                C1KM.A05(new C1KQ(c1ko2, ((C1KP) C1KM.A00()).A01, C1KM.A00().A03, null, "app background", SystemClock.uptimeMillis()));
                            }
                            C0f9.A0A(1285476173, A03);
                        }

                        /* JADX WARN: Type inference failed for: r7v0, types: [X.1KO, X.3JH] */
                        @Override // X.InterfaceC12870lZ
                        public final void onAppForegrounded() {
                            long uptimeMillis;
                            long uptimeMillis2;
                            int A03 = C0f9.A03(2049590677);
                            boolean z3 = C1KM.A08;
                            if (C1KT.A05) {
                                if (C1KM.A01() instanceof C1KV) {
                                    uptimeMillis2 = ((C1KP) C1KM.A01()).A00;
                                } else {
                                    uptimeMillis2 = SystemClock.uptimeMillis();
                                }
                                String str = ((C1KP) C1KM.A00()).A01;
                                C1KM.A00();
                                ?? c1ko = new C1KO(str, uptimeMillis2, uptimeMillis2);
                                Intent intent = C1KT.A01;
                                if (intent != null && c1ko.A00 - C1KT.A00 < 1000) {
                                    c1ko.A00 = intent;
                                }
                                C1KT.A01 = null;
                                C1KT.A00 = 0L;
                                C1KT.A02(c1ko);
                            }
                            if (C1KM.A08) {
                                if (C1KM.A01() instanceof C1KV) {
                                    uptimeMillis = ((C1KP) C1KM.A01()).A00;
                                } else {
                                    uptimeMillis = SystemClock.uptimeMillis();
                                }
                                String str2 = ((C1KP) C1KM.A00()).A01;
                                C1KM.A00();
                                C1KM.A06(new C1KO(str2, uptimeMillis, uptimeMillis));
                            }
                            C0f9.A0A(-933688589, A03);
                        }
                    };
                    EnumC220415e enumC220415e = EnumC220415e.A02;
                    C218914p.A04(enumC220415e, interfaceC12870lZ, true, true);
                    if (C18U.A06(c06090Tz, A08, 36323616459402667L)) {
                        AbstractC26621Qr.A00 = true;
                    }
                    if (C18U.A06(c06090Tz, A08, 36323616459074986L)) {
                        long A016 = C18U.A01(c06090Tz, A08, 36605091435844814L);
                        long A017 = C18U.A01(c06090Tz, A08, 36605091435910351L);
                        long A018 = C18U.A01(c06090Tz, A08, 36605091436369108L);
                        boolean A067 = C18U.A06(c06090Tz, A08, 2342166625673424301L);
                        boolean A068 = C18U.A06(c06090Tz, A08, 36323616459795886L);
                        Context context2 = this.A00;
                        C51652Yn.A00(context2, (int) A016, (int) A017, (int) A018, A067, A068);
                        boolean A069 = C18U.A06(c06090Tz, A08, 36330299429241646L);
                        C14360o3.A0B(context2, 0);
                        Object systemService = context2.getSystemService("connectivity");
                        if ((systemService instanceof ConnectivityManager) && (connectivityManager = (ConnectivityManager) systemService) != null) {
                            try {
                                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), new ConnectivityManager.NetworkCallback() { // from class: X.2Yu
                                    @Override // android.net.ConnectivityManager.NetworkCallback
                                    public final void onAvailable(Network network) {
                                        C51652Yn.A03(true);
                                    }

                                    @Override // android.net.ConnectivityManager.NetworkCallback
                                    public final void onLost(Network network) {
                                        C51652Yn.A03(false);
                                    }

                                    @Override // android.net.ConnectivityManager.NetworkCallback
                                    public final void onUnavailable() {
                                        C51652Yn.A03(false);
                                    }
                                });
                            } catch (SecurityException unused) {
                            }
                        }
                        C1TU A019 = C1TU.A01();
                        if (A019 != null) {
                            A019.A93(new InterfaceC18530vf() { // from class: X.2ZA
                                @Override // X.InterfaceC18530vf
                                public final void Drh(C0TY c0ty) {
                                    boolean z3 = false;
                                    if (c0ty == C0TY.RED) {
                                        z3 = true;
                                    }
                                    C9BC c9bc = C51652Yn.A01;
                                    if (c9bc.A03 != z3) {
                                        c9bc = new C9BC(c9bc.A01, c9bc.A02, z3, 2);
                                    }
                                    C51652Yn.A01 = c9bc;
                                }
                            });
                            A019.A93(new InterfaceC18490vb() { // from class: X.2ZB
                                @Override // X.InterfaceC18490vb
                                public final void DO4(C0TY c0ty) {
                                    boolean z3 = false;
                                    if (c0ty == C0TY.RED) {
                                        z3 = true;
                                    }
                                    C9BC c9bc = C51652Yn.A01;
                                    if (c9bc.A02 != z3) {
                                        c9bc = new C9BC(c9bc.A01, z3, c9bc.A03, 2);
                                    }
                                    C51652Yn.A01 = c9bc;
                                }
                            });
                        }
                        if (A069) {
                            AbstractC25061Kk.A00().EDS(new InterfaceC220315d() { // from class: X.9GP
                                @Override // X.InterfaceC220315d
                                public final void F8d(C1KJ c1kj) {
                                    if (c1kj != null) {
                                        AbstractC166987dD.A1Z(new C206629Ct(c1kj, null, 44), C51652Yn.A06);
                                    }
                                }
                            });
                        }
                        long A0110 = C18U.A01(c06090Tz, A08, 36605091436041425L);
                        C25131Kr.A00 = (int) C18U.A01(c06090Tz, A08, 36605091435975888L);
                        C25131Kr.A01 = (int) A0110;
                    }
                    if (C18U.A06(c06090Tz, A08, 36319007959554888L)) {
                        final C2ZC c2zc = new C2ZC(c12l, c51232Ww);
                        C2ZD.A00 = c51232Ww;
                        C2ZD.A03 = c2zc;
                        C2ZD.A05 = AnonymousClass194.A02(c12l.CPG(85705359, 3).A00(1));
                        C2ZD.A04 = AnonymousClass194.A02(c12l.CPG(509851799, 3).A00(1));
                        C2ZD.A07 = C0JE.A01(new C9DM(null));
                        C2ZD.A08 = true;
                        C2ZE.A00 = c51232Ww;
                        C2ZE.A02 = true;
                        C2ZE.A01 = AnonymousClass194.A02(c12l.AOT(377414294, 3).A00(1));
                        C218914p.A04(enumC220415e, new InterfaceC12870lZ() { // from class: X.2ZG
                            @Override // X.InterfaceC12870lZ
                            public final void onAppBackgrounded() {
                                int A03 = C0f9.A03(107670417);
                                AnonymousClass195 anonymousClass195 = C2ZD.A06;
                                if (anonymousClass195 != null) {
                                    anonymousClass195.AGH(null);
                                }
                                C0f9.A0A(330303224, A03);
                            }

                            @Override // X.InterfaceC12870lZ
                            public final void onAppForegrounded() {
                                int A03 = C0f9.A03(234030517);
                                if (C2ZD.A08 && C1KM.A08) {
                                    AnonymousClass195 anonymousClass195 = C2ZD.A06;
                                    if (anonymousClass195 != null) {
                                        anonymousClass195.AGH(null);
                                    }
                                    long uptimeMillis = SystemClock.uptimeMillis();
                                    C19L c19l = C2ZD.A05;
                                    if (c19l == null) {
                                        C14360o3.A0F("scope");
                                        throw C00O.createAndThrow();
                                    }
                                    NavigationObserver$start$1 navigationObserver$start$1 = new NavigationObserver$start$1(null, uptimeMillis);
                                    C2ZD.A06 = AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, navigationObserver$start$1, c19l);
                                }
                                C0f9.A0A(813981640, A03);
                            }
                        }, true, false);
                        if (C18U.A06(c06090Tz, A08, 2342162017173445450L)) {
                            C1J3 c1j3 = C1J3.A06;
                            c1j3.A01 = true;
                            QuickPerformanceLogger quickPerformanceLogger = c1j3.A00;
                            if (quickPerformanceLogger != null) {
                                quickPerformanceLogger.updateListenerMarkers();
                            }
                        }
                        C2ZI.A00 = new C2ZI(c51232Ww, c2zc) { // from class: X.2ZH
                            public final C51232Ww A00;
                            public final C2ZC A01;

                            @Override // X.C2ZI
                            public final void A01(int i, String str) {
                                C14360o3.A0B(str, 1);
                                A00(i, new C207409Ft(str, this, 8));
                            }

                            @Override // X.C2ZI
                            public final void A03(int i, String str, int i2) {
                                A00(i, new C207449Fx(this, str, i2, 1));
                            }

                            @Override // X.C2ZI
                            public final void A04(int i, String str, long j) {
                                A00(i, new C207439Fw(this, str, 1, j));
                            }

                            @Override // X.C2ZI
                            public final void A05(int i, String str, long j) {
                                C14360o3.A0B(str, 1);
                                A00(i, new C207439Fw(this, str, 2, j));
                            }

                            @Override // X.C2ZI
                            public final void A06(int i, String str, String str2) {
                                C14360o3.A0B(str, 1);
                                A00(i, new C9GD(this, str, str2, 2));
                            }

                            @Override // X.C2ZI
                            public final void A07(int i, String str, String str2, long j) {
                                C14360o3.A0B(str, 1);
                                A00(i, new C140226Wa(this, str, j));
                            }

                            @Override // X.C2ZI
                            public final void A08(int i, String str, boolean z3) {
                                C14360o3.A0B(str, 1);
                                A00(i, new C207459Fy(this, str, 3, z3));
                            }

                            @Override // X.C2ZI
                            public final void A0A(String str, String str2) {
                                C14360o3.A0B(str, 0);
                                C14360o3.A0B(str2, 1);
                                C2ZE.A00(new C3DR(str, str2, null, SystemClock.uptimeMillis()));
                            }

                            @Override // X.C2ZI
                            public final void A0B(String str, String str2, int i) {
                                C14360o3.A0B(str2, 1);
                                C2ZE.A00(new C5Q5(str, Integer.valueOf(i), str2));
                            }

                            @Override // X.C2ZI
                            public final void A0C(String str, String str2, String str3) {
                                C14360o3.A0B(str, 0);
                                C14360o3.A0B(str2, 1);
                                C2ZE.A00(new C5Q5(str, str3, str2));
                            }

                            @Override // X.C2ZI
                            public final void A0D(String str, String str2, boolean z3) {
                                long j;
                                C14360o3.A0B(str, 0);
                                if (C1KM.A08) {
                                    C2ZC c2zc2 = this.A01;
                                    boolean z4 = this.A00.A0E;
                                    C1KO A0111 = C1KM.A01();
                                    if (z4) {
                                        j = ((C1KP) A0111).A00;
                                    } else {
                                        j = A0111.A00;
                                    }
                                    C09530e4 c09530e4 = new C09530e4(str, Long.valueOf(j));
                                    ReentrantLock reentrantLock = c2zc2.A02;
                                    reentrantLock.lock();
                                    try {
                                        Map map = c2zc2.A00;
                                        if (map.get(c09530e4) == null && (z3 || c2zc2.A01.add(str))) {
                                            map.put(c09530e4, new C170967jn(str, str2, AbstractC170987jp.A00(str, j, true), j, SystemClock.uptimeMillis()));
                                            reentrantLock.unlock();
                                            C19L c19l = c2zc2.A03;
                                            C9D4 c9d4 = new C9D4(c09530e4, c2zc2, (InterfaceC23621Ds) null, 36);
                                            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d4, c19l);
                                        }
                                    } finally {
                                        reentrantLock.unlock();
                                    }
                                }
                            }

                            @Override // X.C2ZI
                            public final void A0E(String str, String str2, boolean z3) {
                                C14360o3.A0B(str2, 1);
                                C2ZE.A00(new C5Q5(str, Boolean.valueOf(z3), str2));
                            }

                            private final void A00(int i, InterfaceC16660sJ interfaceC16660sJ) {
                                Object obj;
                                Map map = this.A00.A06;
                                if (map != null && (obj = map.get(Integer.valueOf(i))) != null) {
                                    interfaceC16660sJ.invoke(obj);
                                }
                            }

                            @Override // X.C2ZI
                            public final void A02(int i, String str, double d) {
                                A00(i, new C138206Ob(this, str, d));
                            }

                            {
                                this.A00 = c51232Ww;
                                this.A01 = c2zc;
                            }

                            @Override // X.C2ZI
                            public final void A09(int i, String str, String[] strArr) {
                                A00(i, new C9G1(this, strArr, "remaining_components", 12));
                            }
                        };
                        if (C18U.A06(c06090Tz, A08, 36319007964142462L)) {
                            C26641Qt.A03 = true;
                        }
                    }
                    if (C18U.A06(c06090Tz, A08, 36320120355758162L)) {
                        C19L c19l = C2ZJ.A07;
                        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new C206589Cp(2, null), c19l);
                    }
                    if (C18U.A06(c06090Tz, A08, 36320120355692625L)) {
                        C2ZK.A01 = true;
                        C19L c19l2 = C2ZM.A02;
                        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new C206589Cp(3, null), c19l2);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("touch listener cannot be set more than once");
            }
        };
    }
}
