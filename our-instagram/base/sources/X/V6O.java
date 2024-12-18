package X;

import android.view.View;
import android.view.WindowManager;

/* loaded from: classes11.dex */
public final class V6O extends AbstractRunnableC14200nk {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C3I8 A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6O(View view, C3I8 c3i8) {
        super(891571284, 1, false, false);
        this.A01 = c3i8;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            WindowManager windowManager = this.A01.A07;
            if (windowManager != null) {
                windowManager.removeView(this.A00);
            }
        } catch (Throwable unused) {
        }
    }
}
