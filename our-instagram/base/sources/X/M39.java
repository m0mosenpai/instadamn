package X;

import com.facebook.systrace.Systrace;

/* loaded from: classes8.dex */
public final class M39 implements Runnable {
    public final /* synthetic */ C48533LdW A00;
    public final /* synthetic */ C11R A01;

    public M39(C48533LdW c48533LdW, C11R c11r) {
        this.A01 = c11r;
        this.A00 = c48533LdW;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11R c11r = this.A01;
        C48533LdW c48533LdW = this.A00;
        if (Systrace.A0E(1L)) {
            C0fO.A01(AnonymousClass001.A0R(c11r.getName(), " onFinish"), 636123605);
        }
        try {
            c11r.getName();
            if (c48533LdW.A01.get()) {
                c11r.onFinish();
            } else {
                c11r.getName();
                c11r.onCancel();
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(1475198767);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1173788204);
            }
            throw th;
        }
    }
}
