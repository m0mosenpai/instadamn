package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: X.Pv7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58428Pv7 {
    public final Object A03 = AbstractC58318PtA.A0b();
    public boolean A02 = false;
    public Object A01 = null;
    public Exception A00 = null;
    public final ArrayList A04 = AbstractC166987dD.A1E();

    private void A00() {
        synchronized (this.A03) {
            if (!A06()) {
                throw new IllegalStateException("task has not completed");
            }
        }
    }

    public static void A01(C58428Pv7 c58428Pv7) {
        synchronized (c58428Pv7.A03) {
            if (c58428Pv7.A06()) {
                throw AbstractC166987dD.A14("task has already completed");
            }
        }
    }

    public static void A02(final C58428Pv7 c58428Pv7) {
        synchronized (c58428Pv7.A03) {
            if (c58428Pv7.A06()) {
                ArrayList arrayList = c58428Pv7.A04;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    final C58430Pv9 c58430Pv9 = (C58430Pv9) it.next();
                    synchronized (c58430Pv9.A01) {
                        if (c58430Pv9.A00 != null) {
                            c58430Pv9.A02.execute(new Runnable() { // from class: X.5tQ
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C58430Pv9 c58430Pv92 = C58430Pv9.this;
                                    synchronized (c58430Pv92.A01) {
                                        InterfaceC65376Tj9 interfaceC65376Tj9 = c58430Pv92.A00;
                                        if (interfaceC65376Tj9 != null) {
                                            interfaceC65376Tj9.D6g(c58428Pv7);
                                        }
                                    }
                                }
                            });
                        }
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final Exception A03() {
        Exception exc;
        synchronized (this.A03) {
            A00();
            exc = this.A00;
        }
        return exc;
    }

    public final Object A04() {
        Object obj;
        synchronized (this.A03) {
            A00();
            obj = this.A01;
        }
        return obj;
    }

    public final void A05(InterfaceC65376Tj9 interfaceC65376Tj9, Executor executor) {
        C58430Pv9 c58430Pv9 = new C58430Pv9(interfaceC65376Tj9, executor);
        synchronized (this.A03) {
            this.A04.add(c58430Pv9);
            A02(this);
        }
    }

    public final boolean A06() {
        boolean z;
        synchronized (this.A03) {
            z = this.A02;
        }
        return z;
    }

    public final boolean A07() {
        boolean A1Z;
        synchronized (this.A03) {
            A00();
            A1Z = AbstractC25229BEm.A1Z(this.A00);
        }
        return A1Z;
    }
}
