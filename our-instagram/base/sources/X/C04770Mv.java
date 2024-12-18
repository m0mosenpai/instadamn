package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.0Mv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04770Mv {
    public static C0Mq A00;
    public static Executor A01;
    public static List A02;
    public static final C0Mq A03;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Mq, java.lang.Object] */
    static {
        ?? obj = new Object();
        A03 = obj;
        A00 = obj;
        A01 = Executors.newSingleThreadExecutor();
        A02 = new ArrayList();
    }

    public static synchronized void A00(final C0Mq c0Mq) {
        synchronized (C04770Mv.class) {
            if (A00 != c0Mq) {
                A00 = c0Mq;
                List<InterfaceC04760Mu> list = A02;
                for (final InterfaceC04760Mu interfaceC04760Mu : list) {
                    A01.execute(new Runnable() { // from class: X.0Ms
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC04760Mu interfaceC04760Mu2 = interfaceC04760Mu;
                            C0Mq c0Mq2 = c0Mq;
                            C0Mq c0Mq3 = C04770Mv.A03;
                            interfaceC04760Mu2.Dl2(c0Mq2);
                        }
                    });
                }
                list.clear();
            }
        }
    }

    public static synchronized void A01(final InterfaceC04760Mu interfaceC04760Mu) {
        synchronized (C04770Mv.class) {
            final C0Mq c0Mq = A00;
            if (c0Mq != A03) {
                A01.execute(new Runnable() { // from class: X.0Mr
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC04760Mu interfaceC04760Mu2 = interfaceC04760Mu;
                        C0Mq c0Mq2 = c0Mq;
                        C0Mq c0Mq3 = C04770Mv.A03;
                        interfaceC04760Mu2.Dl2(c0Mq2);
                    }
                });
            } else {
                A02.add(interfaceC04760Mu);
            }
        }
    }
}
