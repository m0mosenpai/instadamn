package X;

/* renamed from: X.QDy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58875QDy extends C63193Sev {
    public C58875QDy() {
        super("ACTION_GO_FORWARD");
    }

    public static void A00(C63193Sev c63193Sev, InterfaceC172727mi interfaceC172727mi) {
        C63193Sev c63193Sev2 = new C63193Sev("navigation");
        c63193Sev.A04(c63193Sev2);
        C58870QDt c58870QDt = new C58870QDt();
        c58870QDt.A05 = interfaceC172727mi.canGoBack();
        c63193Sev2.A04(c58870QDt);
        C58875QDy c58875QDy = new C58875QDy();
        c58875QDy.A05 = interfaceC172727mi.canGoForward();
        c63193Sev2.A04(c58875QDy);
    }
}
