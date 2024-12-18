package X;

import com.facebook.systrace.Systrace;

/* loaded from: classes8.dex */
public final class JZF implements Runnable {
    public final /* synthetic */ C11R A00;

    public JZF(C11R c11r) {
        this.A00 = c11r;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11R c11r = this.A00;
        String A0R = AnonymousClass001.A0R(c11r.getName(), " onFinish");
        if (Systrace.A0E(1L)) {
            C0fO.A01(A0R, 1758878738);
        }
        try {
            c11r.onFinish();
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1266704983);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1490835248);
            }
            throw th;
        }
    }
}
