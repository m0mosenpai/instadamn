package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.Xp8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72852Xp8 {
    public boolean A00;
    public final Object A01;
    public final InterfaceC16820sZ A02;
    public final Runnable A03;
    public final List A04;
    public final Executor A05;

    public C72852Xp8(Executor executor, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(executor, 1);
        this.A05 = executor;
        this.A02 = interfaceC16820sZ;
        this.A01 = AbstractC58318PtA.A0b();
        this.A04 = AbstractC166987dD.A1E();
        this.A03 = new Runnable() { // from class: X.YG6
            @Override // java.lang.Runnable
            public final void run() {
                C72852Xp8 c72852Xp8 = C72852Xp8.this;
                C14360o3.A0B(c72852Xp8, 0);
                synchronized (c72852Xp8.A01) {
                    if (!c72852Xp8.A00) {
                        c72852Xp8.A02.invoke();
                        c72852Xp8.A00();
                    }
                }
            }
        };
    }

    public final void A00() {
        synchronized (this.A01) {
            this.A00 = true;
            List list = this.A04;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC16820sZ) it.next()).invoke();
            }
            list.clear();
        }
    }

    public final boolean A01() {
        boolean z;
        synchronized (this.A01) {
            z = this.A00;
        }
        return z;
    }
}
