package X;

import android.os.SystemClock;

/* renamed from: X.4Ua, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96174Ua {
    public Exception A00;
    public long A01;

    public final void A00(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Exception exc2 = this.A00;
        if (exc2 == null) {
            this.A00 = exc;
            exc2 = exc;
            this.A01 = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.A01) {
            if (exc2 != exc) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(exc2, exc);
            }
            Exception exc3 = this.A00;
            this.A00 = null;
            throw exc3;
        }
    }
}
