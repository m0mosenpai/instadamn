package X;

import android.os.Handler;
import com.facebook.systrace.Systrace;

/* renamed from: X.1GR, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1GR {
    public static final InterfaceC09390do A00 = AbstractC09440dt.A01(C1GS.A00);

    public static final void A00(final C11R c11r, InterfaceC14020nS interfaceC14020nS, final int i, final int i2, final boolean z, final boolean z2) {
        if (Systrace.A0E(1L)) {
            C0fO.A01(AnonymousClass001.A0R(c11r.getName(), " ExecutorScheduler::scheduleOnExecutor()"), -429297590);
        }
        try {
            c11r.onStart();
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1742366107);
            }
            interfaceC14020nS.ATO(new AbstractRunnableC14200nk(i, i2, z, z2) { // from class: X.1GT
                @Override // java.lang.Runnable
                public final void run() {
                    final C11R c11r2 = C11R.this;
                    c11r2.getName();
                    if (Systrace.A0E(1L)) {
                        C0fO.A01(AnonymousClass001.A0R("run ", c11r2.getName()), 276071757);
                    }
                    try {
                        c11r2.run();
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(52569728);
                        }
                        ((Handler) C1GR.A00.getValue()).post(new Runnable() { // from class: X.1Hl
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (Systrace.A0E(1L)) {
                                    C0fO.A01(AnonymousClass001.A0R(C11R.this.getName(), " onFinish"), -818630428);
                                }
                                C11R c11r3 = C11R.this;
                                c11r3.getName();
                                try {
                                    c11r3.onFinish();
                                    if (Systrace.A0E(1L)) {
                                        C0fO.A00(612206371);
                                    }
                                } catch (Throwable th) {
                                    if (Systrace.A0E(1L)) {
                                        C0fO.A00(1924287728);
                                    }
                                    throw th;
                                }
                            }
                        });
                    } catch (Throwable th) {
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(1056247054);
                        }
                        throw th;
                    }
                }

                public final String toString() {
                    return C11R.this.toString();
                }
            });
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(477793265);
            }
            throw th;
        }
    }
}
