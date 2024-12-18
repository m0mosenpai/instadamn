package X;

import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes8.dex */
public final class LR4 implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ C7W4 A00;

    public LR4(C7W4 c7w4) {
        this.A00 = c7w4;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        FragmentActivity activity = this.A00.A0U.getActivity();
        if (activity != null && activity.getWindow() != null) {
            Window window = activity.getWindow();
            C162317Ot A00 = C162317Ot.A02.A00();
            if (z) {
                A00.A02(window, "DirectThreadController");
            } else {
                A00.A01(window, "DirectThreadController");
            }
        }
    }
}
