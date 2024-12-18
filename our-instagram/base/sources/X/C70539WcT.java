package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.WcT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70539WcT implements InterfaceC71912X9w {
    public final /* synthetic */ AbstractC70175WEx A00;

    public C70539WcT(AbstractC70175WEx abstractC70175WEx) {
        this.A00 = abstractC70175WEx;
    }

    @Override // X.InterfaceC71912X9w
    public final void onViewAttachedToWindow(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC70175WEx abstractC70175WEx = this.A00;
            WindowInsets rootWindowInsets = abstractC70175WEx.A09.getRootWindowInsets();
            if (rootWindowInsets != null) {
                abstractC70175WEx.A00 = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                AbstractC70175WEx.A02(abstractC70175WEx);
            }
        }
    }
}
