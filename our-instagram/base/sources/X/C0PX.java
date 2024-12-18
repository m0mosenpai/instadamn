package X;

/* renamed from: X.0PX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0PX {
    public final void A00(C0LE c0le) {
        synchronized (C03G.class) {
        }
        C03G A00 = C03G.A00();
        String str = c0le.A00;
        synchronized (A00.A00) {
            A00.A02.remove(str);
        }
    }

    public final void A01(C0LE c0le, String str) {
        synchronized (C03G.class) {
        }
        C03G.A00().A02(c0le.A00, str);
    }

    public final void A02(C0LE c0le, InterfaceC08830cm interfaceC08830cm) {
        synchronized (C03G.class) {
        }
        C03G A00 = C03G.A00();
        String str = c0le.A00;
        C008703b c008703b = new C008703b(A00, interfaceC08830cm);
        if (C03G.A04.containsKey(str) && !str.equals("mobileconfig_canary")) {
            synchronized (A00.A00) {
                A00.A01.put(str, c008703b);
            }
        }
    }
}
