package X;

import android.os.Build;
import android.view.View;

/* loaded from: classes6.dex */
public final class GLI implements Runnable {
    public final /* synthetic */ C32285EJx A00;

    public GLI(C32285EJx c32285EJx) {
        this.A00 = c32285EJx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        if (Build.VERSION.SDK_INT >= 30 && (view = this.A00.mView) != null) {
            view.performHapticFeedback(16);
        }
    }
}
