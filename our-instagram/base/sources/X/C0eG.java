package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.Random;
import java.util.concurrent.Callable;

/* renamed from: X.0eG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0eG {
    public final C0ZS A00;
    public final Callable A01;
    public volatile C08400c3 A02;

    public static /* synthetic */ C08400c3 A00(AwakeTimeSinceBootClock awakeTimeSinceBootClock, C109574wj c109574wj, C0R9 c0r9, ExecutorC19230x5 executorC19230x5, C12090kD c12090kD, Random random, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3, InterfaceC08830cm interfaceC08830cm4, InterfaceC08830cm interfaceC08830cm5, InterfaceC08830cm interfaceC08830cm6) {
        return new C08400c3(awakeTimeSinceBootClock, c109574wj, c0r9, executorC19230x5, c12090kD, random, interfaceC08830cm, interfaceC08830cm2, interfaceC08830cm3, interfaceC08830cm4, interfaceC08830cm5, interfaceC08830cm6);
    }

    public final C08400c3 A01() {
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    try {
                        C08400c3 c08400c3 = (C08400c3) this.A01.call();
                        c08400c3.getClass();
                        this.A02 = c08400c3;
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return this.A02;
    }

    public C0eG(final AwakeTimeSinceBootClock awakeTimeSinceBootClock, final C109574wj c109574wj, final C0R9 c0r9, final ExecutorC19230x5 executorC19230x5, final C12090kD c12090kD, final Random random, final InterfaceC08830cm interfaceC08830cm, final InterfaceC08830cm interfaceC08830cm2, final InterfaceC08830cm interfaceC08830cm3, final InterfaceC08830cm interfaceC08830cm4, final InterfaceC08830cm interfaceC08830cm5, final InterfaceC08830cm interfaceC08830cm6) {
        this.A01 = new Callable() { // from class: X.0ZP
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ExecutorC19230x5 executorC19230x52 = executorC19230x5;
                InterfaceC08830cm interfaceC08830cm7 = interfaceC08830cm;
                InterfaceC08830cm interfaceC08830cm8 = interfaceC08830cm2;
                InterfaceC08830cm interfaceC08830cm9 = interfaceC08830cm3;
                InterfaceC08830cm interfaceC08830cm10 = interfaceC08830cm4;
                InterfaceC08830cm interfaceC08830cm11 = interfaceC08830cm5;
                InterfaceC08830cm interfaceC08830cm12 = interfaceC08830cm6;
                C12090kD c12090kD2 = c12090kD;
                return C0eG.A00(awakeTimeSinceBootClock, c109574wj, c0r9, executorC19230x52, c12090kD2, random, interfaceC08830cm7, interfaceC08830cm8, interfaceC08830cm9, interfaceC08830cm10, interfaceC08830cm11, interfaceC08830cm12);
            }
        };
        A01();
        this.A00 = new C0ZS(c0r9, new C0R1(this, 0));
    }
}
