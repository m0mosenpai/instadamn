package X;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* renamed from: X.TNq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64634TNq implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ String A01;

    public RunnableC64634TNq(Activity activity, String str) {
        this.A00 = activity;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Window window = this.A00.getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT > 30) {
                WindowInsetsController insetsController = window.getInsetsController();
                if (insetsController != null) {
                    if ("dark-content".equals(this.A01)) {
                        insetsController.setSystemBarsAppearance(8, 8);
                        return;
                    } else {
                        insetsController.setSystemBarsAppearance(0, 8);
                        return;
                    }
                }
                return;
            }
            View decorView = window.getDecorView();
            C14360o3.A07(decorView);
            int systemUiVisibility = decorView.getSystemUiVisibility();
            int i = systemUiVisibility & (-8193);
            if ("dark-content".equals(this.A01)) {
                i = systemUiVisibility | 8192;
            }
            decorView.setSystemUiVisibility(i);
        }
    }
}
