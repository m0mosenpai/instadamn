package X;

import java.util.List;

/* renamed from: X.3EH, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3EH implements Runnable {
    public final C49182Nr A00 = new Object();

    public abstract List A00();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.A00.A07(A00());
        } catch (Throwable th) {
            this.A00.A08(th);
        }
    }
}
