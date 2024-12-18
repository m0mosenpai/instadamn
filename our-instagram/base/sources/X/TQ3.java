package X;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes10.dex */
public final class TQ3 implements Runnable {
    public final /* synthetic */ LifecycleCallback A00;
    public final /* synthetic */ Q86 A01;
    public final /* synthetic */ String A02;

    public TQ3(LifecycleCallback lifecycleCallback, Q86 q86, String str) {
        this.A01 = q86;
        this.A00 = lifecycleCallback;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        Q86 q86 = this.A01;
        if (q86.A00 > 0) {
            LifecycleCallback lifecycleCallback = this.A00;
            Bundle bundle2 = q86.A01;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(this.A02);
            } else {
                bundle = null;
            }
            lifecycleCallback.A04(bundle);
        }
        if (q86.A00 >= 2) {
            this.A00.A06();
        }
        if (q86.A00 >= 3) {
            this.A00.A02();
        }
        if (q86.A00 >= 4) {
            this.A00.A07();
        }
    }
}
