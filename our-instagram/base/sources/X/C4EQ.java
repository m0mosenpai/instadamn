package X;

import java.util.WeakHashMap;

/* renamed from: X.4EQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4EQ {
    public final C3ND A00;
    public final C4EX A01;
    public final C4EW A02;
    public final C4ET A03;
    public final C4ER A04;
    public final C4EV A05;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.4EV] */
    public C4EQ(C4EA c4ea, C4EH c4eh, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2) {
        C14360o3.A0B(interfaceC08830cm, 2);
        C14360o3.A0B(c4eh, 3);
        C14360o3.A0B(interfaceC08830cm2, 4);
        this.A00 = new C3ND(200);
        final C4ER c4er = new C4ER(c4ea, interfaceC08830cm, interfaceC08830cm2);
        this.A04 = c4er;
        final C4ES c4es = new C4ES(c4ea.A01, c4eh);
        this.A03 = new C4ET(c4er, c4es);
        this.A05 = new C4EU(c4er, c4es) { // from class: X.4EV
            public final C4ER A00;
            public final C4ES A01;
            public final WeakHashMap A02 = new WeakHashMap();

            {
                this.A00 = c4er;
                this.A01 = c4es;
            }
        };
        this.A02 = new C4EW(c4er);
        this.A01 = new C4EX(c4er);
    }
}
