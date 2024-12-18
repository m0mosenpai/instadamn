package X;

import java.util.concurrent.locks.LockSupport;

/* renamed from: X.2ST, reason: invalid class name */
/* loaded from: classes.dex */
public abstract /* synthetic */ class C2ST {
    public static final Object A00(C12W c12w, InterfaceC16620sF interfaceC16620sF) {
        AnonymousClass130 anonymousClass130;
        C2SW c2sw;
        long j;
        Thread currentThread = Thread.currentThread();
        if (c12w.get(C12X.A00) == null) {
            anonymousClass130 = C2SU.A00();
            c2sw = C2SW.A00;
            c12w = c12w.plus(anonymousClass130);
        } else {
            anonymousClass130 = (AnonymousClass130) C2SU.A00.get();
            c2sw = C2SW.A00;
        }
        C2SX c2sx = new C2SX(currentThread, AbstractC23651Dv.A01(c12w, c2sw), anonymousClass130);
        c2sx.A0W(C05F.A00, c2sx, interfaceC16620sF);
        AnonymousClass130 anonymousClass1302 = c2sx.A00;
        C1JW c1jw = null;
        if (anonymousClass1302 != null) {
            anonymousClass1302.A00++;
            anonymousClass1302.A02 = true;
        }
        while (!Thread.interrupted()) {
            try {
                if (anonymousClass1302 == null) {
                    j = Long.MAX_VALUE;
                } else {
                    j = anonymousClass1302.A06();
                }
                if (!(!(c2sx.A0C() instanceof C19B))) {
                    LockSupport.parkNanos(c2sx, j);
                } else {
                    Object A00 = AnonymousClass199.A00(c2sx.A0C());
                    if (A00 instanceof C1JW) {
                        c1jw = (C1JW) A00;
                    }
                    if (c1jw == null) {
                        return A00;
                    }
                    throw c1jw.A00;
                }
            } finally {
                if (anonymousClass1302 != null) {
                    anonymousClass1302.A09(false);
                }
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c2sx.A0T(interruptedException);
        throw interruptedException;
    }
}
