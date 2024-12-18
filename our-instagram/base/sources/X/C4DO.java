package X;

import java.lang.ref.ReferenceQueue;

/* renamed from: X.4DO, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4DO {
    public static final Thread A03;
    public static final C4DP A01 = new C4DP();
    public static final ReferenceQueue A02 = new ReferenceQueue();
    public static final C4DQ A00 = new C4DQ();

    static {
        Thread thread = new Thread() { // from class: X.4DS
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                while (true) {
                    try {
                        C4DQ c4dq = C4DO.A00;
                        C4DN c4dn = (C4DN) C4DO.A02.remove();
                        c4dn.destruct();
                        if (c4dn.A01 == null) {
                            C4DN c4dn2 = (C4DN) C4DO.A01.A00.getAndSet(null);
                            while (c4dn2 != null) {
                                C4DN c4dn3 = c4dn2.A00;
                                C4DN c4dn4 = C4DO.A00.A00;
                                c4dn2.A00 = c4dn4.A00;
                                c4dn4.A00 = c4dn2;
                                c4dn2.A00.A01 = c4dn2;
                                c4dn2.A01 = c4dn4;
                                c4dn2 = c4dn3;
                            }
                        }
                        C4DN c4dn5 = c4dn.A00;
                        c4dn5.A01 = c4dn.A01;
                        c4dn.A01.A00 = c4dn5;
                    } catch (InterruptedException unused) {
                    }
                }
            }
        };
        A03 = thread;
        thread.start();
    }
}
