package X;

import com.facebook.systrace.Systrace;

/* renamed from: X.5g0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122085g0 extends AbstractRunnableC14200nk {
    public final /* synthetic */ C11R A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C122085g0(C11R c11r, int i, int i2, boolean z, boolean z2) {
        super(i, i2, z, z2);
        this.A00 = c11r;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11R c11r = this.A00;
        c11r.getName();
        if (Systrace.A0E(1L)) {
            C0fO.A01(AnonymousClass001.A0R("run ", c11r.getName()), 1078929841);
        }
        try {
            c11r.run();
            if (Systrace.A0E(1L)) {
                C0fO.A00(478072121);
            }
            AbstractC24641Ih.A03.EpA(new AbstractC18280vF() { // from class: X.5jL
                {
                    super("onTaskFinish", -9);
                }

                @Override // X.AbstractC18280vF
                public final void loggedRun() {
                    if (Systrace.A0E(1L)) {
                        C0fO.A01(AnonymousClass001.A0R(C122085g0.this.A00.getName(), " onFinish"), -993616731);
                    }
                    C11R c11r2 = C122085g0.this.A00;
                    c11r2.getName();
                    try {
                        c11r2.onFinish();
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(950995482);
                        }
                    } catch (Throwable th) {
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(-1293483285);
                        }
                        throw th;
                    }
                }
            });
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1920899816);
            }
            throw th;
        }
    }

    public final String toString() {
        return this.A00.toString();
    }
}
