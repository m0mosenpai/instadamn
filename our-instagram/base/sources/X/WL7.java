package X;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public final class WL7 implements View.OnAttachStateChangeListener {
    public final C5O0 A00;
    public final WeakReference A01;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C14360o3.A0B(view, 0);
        view.removeOnAttachStateChangeListener(this);
        Activity activity = (Activity) this.A01.get();
        IBinder A00 = AbstractC94714Ny.A00(activity);
        if (activity != null && A00 != null) {
            this.A00.A02(activity, A00);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public WL7(Activity activity, C5O0 c5o0) {
        this.A00 = c5o0;
        this.A01 = new WeakReference(activity);
    }
}
