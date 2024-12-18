package X;

/* renamed from: X.OKa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54806OKa {
    public C54499O6b A00;
    public final C51653Mrk A01;
    public final O6V A02;

    public final void A00(InterfaceC57896Pm0 interfaceC57896Pm0) {
        C54499O6b c54499O6b = this.A00;
        if (c54499O6b == null) {
            MSW.A1J();
            throw C00O.createAndThrow();
        }
        synchronized (c54499O6b) {
            c54499O6b.A01.add(interfaceC57896Pm0);
        }
    }

    public final void A01(InterfaceC57896Pm0 interfaceC57896Pm0) {
        C54499O6b c54499O6b = this.A00;
        if (c54499O6b == null) {
            MSW.A1J();
            throw C00O.createAndThrow();
        }
        synchronized (c54499O6b) {
            c54499O6b.A01.remove(interfaceC57896Pm0);
        }
    }

    public C54806OKa(C51653Mrk c51653Mrk, O6V o6v) {
        this.A02 = o6v;
        this.A01 = c51653Mrk;
    }
}
