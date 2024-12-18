package X;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: X.VMg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68320VMg {
    public static final void A00(View view, Window window) {
        if (Build.VERSION.SDK_INT >= 30) {
            window.setDecorFitsSystemWindows(false);
        } else {
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1280);
        }
        AbstractC008903d.A00(view, new C55540Ola());
    }
}
