package X;

import android.os.Handler;
import com.facebook.systrace.Systrace;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.KMb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45724KMb extends AbstractRunnableC14200nk {
    public final /* synthetic */ C48533LdW A00;
    public final /* synthetic */ C11R A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45724KMb(C48533LdW c48533LdW, C11R c11r, int i, int i2, boolean z, boolean z2) {
        super(i, i2, z, z2);
        this.A01 = c11r;
        this.A00 = c48533LdW;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        C11R c11r = this.A01;
        c11r.getName();
        C48533LdW c48533LdW = this.A00;
        if (Systrace.A0E(1L)) {
            C0fO.A01(AnonymousClass001.A0R("run ", c11r.getName()), -1778486092);
        }
        try {
            AtomicBoolean atomicBoolean = c48533LdW.A01;
            if (!atomicBoolean.get()) {
                c11r.getName();
                ((Handler) C1GR.A00.getValue()).post(new RunnableC49848Lzt(c11r));
                if (Systrace.A0E(1L)) {
                    i = -2114238131;
                } else {
                    return;
                }
            } else {
                c11r.run();
                if (!atomicBoolean.get()) {
                    c11r.getName();
                    ((Handler) C1GR.A00.getValue()).post(new RunnableC49849Lzu(c11r));
                    if (Systrace.A0E(1L)) {
                        i = 1580526768;
                    } else {
                        return;
                    }
                } else {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-2087252022);
                    }
                    ((Handler) C1GR.A00.getValue()).post(new M39(c48533LdW, c11r));
                    return;
                }
            }
            C0fO.A00(i);
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1423339236);
            }
            throw th;
        }
    }

    public final String toString() {
        return this.A01.toString();
    }
}
