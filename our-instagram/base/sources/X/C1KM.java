package X;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.instagram.common.typedurl.ImageUrl;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1KM */
/* loaded from: classes.dex */
public final class C1KM {
    public static C51542Yc A00;
    public static C51232Ww A01;
    public static C1KS A02;
    public static C1KQ A03;
    public static C1KO A04;
    public static InterfaceC16660sJ A06;
    public static C19L A07;
    public static boolean A08;
    public static final C1KM A09 = new Object();
    public static final AtomicInteger A0A = new AtomicInteger(0);
    public static String A05 = "cold_start";
    public static final InterfaceC09390do A0B = AbstractC09440dt.A01(C1KN.A00);

    public static final void A03(MotionEvent motionEvent) {
        C1KO A002;
        C1KO A003;
        C14360o3.A0B(motionEvent, 0);
        if (C1KT.A05 && (A003 = AbstractC106894rq.A00(motionEvent, ((C1KP) C1KT.A02).A01)) != null) {
            C1KT.A02(A003);
        }
        if (A08 && (A002 = AbstractC106894rq.A00(motionEvent, A05)) != null) {
            A06(A002);
        }
    }

    public static final void A04(InterfaceC11380iw interfaceC11380iw) {
        String str;
        C14360o3.A0B(interfaceC11380iw, 0);
        if (A08) {
            C51232Ww c51232Ww = A01;
            if (c51232Ww == null) {
                str = "qeParams";
            } else if (c51232Ww.A0C) {
                C919049s c919049s = new C919049s(interfaceC11380iw.getModuleName(), interfaceC11380iw.hashCode());
                InterfaceC16660sJ interfaceC16660sJ = A06;
                if (interfaceC16660sJ != null) {
                    interfaceC16660sJ.invoke(c919049s);
                }
                C19L c19l = A07;
                if (c19l == null) {
                    str = "scope";
                } else {
                    C206649Cv c206649Cv = new C206649Cv(c919049s, null, 40);
                    AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206649Cv, c19l);
                    return;
                }
            } else {
                return;
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public final void A0C(Rect rect, ImageUrl imageUrl, String str, WeakReference weakReference) {
        C14360o3.A0B(str, 1);
        if (C1KT.A05) {
            C1KT.A01(new C3QY(rect, imageUrl, C1KT.A04, str, weakReference, SystemClock.uptimeMillis()));
        }
        if (A08) {
            A05(new C3QY(rect, imageUrl, A01(), str, weakReference, SystemClock.uptimeMillis()));
        }
    }

    public final void A0F(ImageUrl imageUrl, String str) {
        C14360o3.A0B(str, 1);
        if (C1KT.A05) {
            C1KO c1ko = C1KT.A04;
            long uptimeMillis = SystemClock.uptimeMillis();
            String url = imageUrl.getUrl();
            C14360o3.A07(url);
            C1KT.A01(new C1KR(c1ko, url, str, uptimeMillis));
        }
        if (A08) {
            C1KO A012 = A01();
            long uptimeMillis2 = SystemClock.uptimeMillis();
            String url2 = imageUrl.getUrl();
            C14360o3.A07(url2);
            A05(new C1KR(A012, url2, str, uptimeMillis2));
        }
    }

    public final void A0G(ImageUrl imageUrl, String str) {
        C14360o3.A0B(str, 1);
        if (C1KT.A05) {
            C1KO c1ko = C1KT.A04;
            long uptimeMillis = SystemClock.uptimeMillis();
            String url = imageUrl.getUrl();
            C14360o3.A07(url);
            C1KT.A01(new C1KR(c1ko, url, str, uptimeMillis));
        }
        if (A08) {
            C1KO A012 = A01();
            long uptimeMillis2 = SystemClock.uptimeMillis();
            String url2 = imageUrl.getUrl();
            C14360o3.A07(url2);
            A05(new C1KR(A012, url2, str, uptimeMillis2));
        }
    }

    public final void A0H(ImageUrl imageUrl, String str, String str2) {
        C14360o3.A0B(str, 1);
        if (C1KT.A05) {
            C1KT.A01(new C73063Ph(imageUrl, C1KT.A04, str, str2, SystemClock.uptimeMillis()));
        }
        if (A08) {
            A05(new C73063Ph(imageUrl, A01(), str, str2, SystemClock.uptimeMillis()));
        }
    }

    public final void A0I(String str, String str2) {
        C14360o3.A0B(str2, 1);
        if (C1KT.A05) {
            C1KT.A01(new C1KR(C1KT.A04, str, str2, SystemClock.uptimeMillis()));
        }
        if (A08) {
            A05(new C1KR(A01(), str, str2, SystemClock.uptimeMillis()));
        }
    }

    public final void A0J(String str, String str2) {
        C14360o3.A0B(str2, 1);
        if (C1KT.A05) {
            C1KT.A01(new C74583Wq(C1KT.A04, str, str2, SystemClock.uptimeMillis()));
        }
        if (A08) {
            A05(new C74583Wq(A01(), str, str2, SystemClock.uptimeMillis()));
        }
    }

    public final void A0K(String str, String str2) {
        C14360o3.A0B(str, 0);
        if (C1KT.A05) {
            C1KT.A01(new C4NC(C1KT.A04, str, str2, SystemClock.uptimeMillis()));
        }
        if (A08) {
            A05(new C4NC(A01(), str, str2, SystemClock.uptimeMillis()));
        }
    }

    public final void A0L(String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        if (C1KT.A05) {
            C1KT.A01(new C93714Jb(C1KT.A04, str, str3, str2, SystemClock.uptimeMillis()));
        }
        if (A08) {
            A05(new C93714Jb(A01(), str, str3, str2, SystemClock.uptimeMillis()));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1KM, java.lang.Object] */
    static {
        long uptimeMillis = SystemClock.uptimeMillis();
        A04 = new C1KO("open_app", uptimeMillis, uptimeMillis);
        long uptimeMillis2 = SystemClock.uptimeMillis();
        A03 = new C1KQ(new C1KO("kill_app", uptimeMillis2, uptimeMillis2), "app_terminated", "app_terminated", null, "kill_app", SystemClock.uptimeMillis());
        C1KO A012 = A01();
        C1KQ c1kq = A03;
        if (c1kq == null) {
            C14360o3.A0F("previousExitModuleEvent");
            throw C00O.createAndThrow();
        }
        A02 = new C1KS(c1kq, A012, null, -408413369, "cold_start", "cold_start", null, SystemClock.uptimeMillis());
    }

    public static final C1KS A00() {
        C1KS c1ks = A02;
        if (c1ks != null) {
            return c1ks;
        }
        C14360o3.A0F("previousEnterModuleEvent");
        throw C00O.createAndThrow();
    }

    public static final C1KO A01() {
        C1KO c1ko = A04;
        if (c1ko != null) {
            return c1ko;
        }
        C14360o3.A0F("previousInteraction");
        throw C00O.createAndThrow();
    }

    public static final void A05(C1KR c1kr) {
        if (A08) {
            c1kr.toString();
            InterfaceC16660sJ interfaceC16660sJ = A06;
            if (interfaceC16660sJ != null) {
                interfaceC16660sJ.invoke(c1kr);
            }
            C19L c19l = A07;
            if (c19l == null) {
                C14360o3.A0F("scope");
                throw C00O.createAndThrow();
            }
            C206649Cv c206649Cv = new C206649Cv(c1kr, null, 41);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206649Cv, c19l);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A06(C1KO c1ko) {
        if (A08) {
            c1ko.toString();
            InterfaceC16660sJ interfaceC16660sJ = A06;
            if (interfaceC16660sJ != null) {
                interfaceC16660sJ.invoke(c1ko);
            }
            if (!(c1ko instanceof C3JI) || !C5I0.A00((C3JI) c1ko)) {
                A04 = c1ko;
            }
            C19L c19l = A07;
            if (c19l == null) {
                C14360o3.A0F("scope");
                throw C00O.createAndThrow();
            }
            C206649Cv c206649Cv = new C206649Cv(c1ko, null, 42);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206649Cv, c19l);
        }
    }

    public final void A0B() {
        if (C1KT.A05) {
            C1KT.A01(new C1KR(C1KT.A04, "NO_ID", ((C1KP) C1KT.A02).A01, SystemClock.uptimeMillis()));
        }
        if (A08) {
            A05(new C1KR(A01(), "NO_ID", ((C1KP) A00()).A01, SystemClock.uptimeMillis()));
        }
    }

    public final void A0D(InterfaceC11380iw interfaceC11380iw) {
        if (A08) {
            C51232Ww c51232Ww = A01;
            if (c51232Ww == null) {
                C14360o3.A0F("qeParams");
                throw C00O.createAndThrow();
            }
            if (!c51232Ww.A0C && C14360o3.A0K(((C1KR) A00()).A00, A01())) {
                return;
            }
            A0A(((C1KP) A00()).A01, A00().A03, null, "unknown");
            A07(null, Integer.valueOf(interfaceC11380iw.hashCode()), interfaceC11380iw.getModuleName(), A02(interfaceC11380iw), null);
        }
    }

    public final void A0E(InterfaceC11380iw interfaceC11380iw, String str, String str2) {
        if (A08) {
            C51232Ww c51232Ww = A01;
            if (c51232Ww == null) {
                C14360o3.A0F("qeParams");
                throw C00O.createAndThrow();
            }
            if (!c51232Ww.A0C) {
                if (((C1KP) A00()).A00 > ((C1KP) A01()).A00 && C14360o3.A0K(((C1KP) A00()).A01, interfaceC11380iw.getModuleName())) {
                    return;
                }
                A0A(interfaceC11380iw.getModuleName(), A02(interfaceC11380iw), str, str2);
            }
        }
    }

    public final void A0M(boolean z) {
        boolean z2 = C1KT.A05;
        C1KT.A01(new C4NF(A01(), ((C1KP) A00()).A01, SystemClock.uptimeMillis(), z));
        A0A.incrementAndGet();
        if (A08) {
            A05(new C4NF(A01(), ((C1KP) A00()).A01, SystemClock.uptimeMillis(), z));
        }
    }

    public static final String A02(InterfaceC11380iw interfaceC11380iw) {
        String moduleName = interfaceC11380iw.getModuleName();
        if (interfaceC11380iw instanceof InterfaceC11390ix) {
            String moduleNameV2 = ((InterfaceC11390ix) interfaceC11380iw).getModuleNameV2();
            if (moduleNameV2 == null) {
                return interfaceC11380iw.getModuleName();
            }
            return moduleNameV2;
        }
        return moduleName;
    }

    public static final void A07(Boolean bool, Integer num, String str, String str2, String str3) {
        C1KO A012 = A01();
        A00();
        C1KQ c1kq = A03;
        if (c1kq == null) {
            C14360o3.A0F("previousExitModuleEvent");
            throw C00O.createAndThrow();
        }
        C1KS c1ks = new C1KS(c1kq, A012, bool, num, str, str2, str3, SystemClock.uptimeMillis());
        A05(c1ks);
        A02 = c1ks;
    }

    public static /* synthetic */ void A08(String str) {
        String str2 = ((C1KP) A00()).A01;
        C14360o3.A0B(str, 0);
        if (C1KT.A05) {
            C1KT.A01(new C1KR(C1KT.A04, str, str2, SystemClock.uptimeMillis()));
        }
        if (A08) {
            A05(new C1KR(A01(), str, str2, SystemClock.uptimeMillis()));
        }
    }

    public static /* synthetic */ void A09(String str) {
        String str2 = ((C1KP) A00()).A01;
        C14360o3.A0B(str, 0);
        if (C1KT.A05) {
            C1KT.A01(new C123355iA(C1KT.A04, str, str2, SystemClock.uptimeMillis()));
        }
        if (A08) {
            A05(new C123355iA(A01(), str, str2, SystemClock.uptimeMillis()));
        }
    }

    public static final void A0A(String str, String str2, String str3, String str4) {
        C1KQ c1kq = new C1KQ(A01(), str, str2, str3, str4, SystemClock.uptimeMillis());
        A05(c1kq);
        A03 = c1kq;
    }
}
