package X;

import android.os.Build;
import android.os.CancellationSignal;

/* renamed from: X.8hU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193498hU {
    public AbstractRunnableC14200nk A00;
    public final CancellationSignal A01;

    public C193498hU() {
        CancellationSignal cancellationSignal;
        if (Build.VERSION.SDK_INT >= 29) {
            cancellationSignal = new CancellationSignal();
        } else {
            cancellationSignal = null;
        }
        this.A01 = cancellationSignal;
    }
}
