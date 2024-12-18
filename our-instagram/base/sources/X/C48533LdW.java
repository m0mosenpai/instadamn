package X;

import com.facebook.systrace.Systrace;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.LdW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48533LdW implements C1GL {
    public final InterfaceC14020nS A00;
    public final AtomicBoolean A01;

    @Override // X.C1GL
    public final void schedule(C11R c11r, int i, int i2, boolean z, boolean z2) {
        if (c11r != null) {
            A00(c11r, this.A00, i, i2, z, z2);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A00(C11R c11r, InterfaceC14020nS interfaceC14020nS, int i, int i2, boolean z, boolean z2) {
        if (Systrace.A0E(1L)) {
            C0fO.A01(AnonymousClass001.A0R(c11r.getName(), " LifecycleAwareExecutorScheduler::scheduleOnExecutor()"), 1446429803);
        }
        try {
            if (!this.A01.get()) {
                c11r.getName();
                if (Systrace.A0E(1L)) {
                    C0fO.A00(1210861167);
                    return;
                }
                return;
            }
            c11r.onStart();
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1234207021);
            }
            interfaceC14020nS.ATO(new C45724KMb(this, c11r, i, i2, z, z2));
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1681558255);
            }
            throw th;
        }
    }

    public C48533LdW(C07X c07x) {
        InterfaceC14020nS A00 = C14120nc.A00();
        C14360o3.A07(A00);
        this.A00 = A00;
        this.A01 = new AtomicBoolean(true);
        C12T c12t = C12P.A00;
        C19K A02 = AnonymousClass194.A02(AnonymousClass131.A00.A06());
        AbstractC166987dD.A1Z(new MC8(c07x, this, A02, null, 32), A02);
    }

    @Override // X.C1GL
    public final void schedule(C11R c11r) {
        if (c11r != null) {
            A00(c11r, this.A00, c11r.getRunnableId(), 3, false, false);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
