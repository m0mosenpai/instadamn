package X;

import android.app.Activity;
import android.widget.Toast;

/* loaded from: classes6.dex */
public final class GL1 implements Runnable {
    public final /* synthetic */ Activity A00;

    public GL1(Activity activity) {
        this.A00 = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast A01 = C9GR.A01(this.A00.getApplicationContext(), null, 2131955113, 1);
        if (A01 != null) {
            A01.show();
        }
    }
}
