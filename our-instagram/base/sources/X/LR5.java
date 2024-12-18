package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes8.dex */
public final class LR5 implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final int A00;
    public final Object A01;

    public LR5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        View view;
        switch (this.A00) {
            case 0:
                if (!z) {
                    return;
                }
                view = (View) this.A01;
                if (view.isFocused()) {
                    AbstractC13880nE.A0N(view);
                }
                view.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
                return;
            case 1:
                FragmentActivity activity = ((JR2) this.A01).A1L.getActivity();
                if (activity == null || activity.getWindow() == null) {
                    return;
                }
                Window window = activity.getWindow();
                C162317Ot A00 = C162317Ot.A02.A00();
                if (z) {
                    A00.A02(window, "DirectInboxController");
                    return;
                } else {
                    A00.A01(window, "DirectInboxController");
                    return;
                }
            default:
                if (z) {
                    view = (View) this.A01;
                    if (view.isFocused()) {
                        AbstractC13880nE.A0R(view);
                    }
                    view.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
                    return;
                }
                return;
        }
    }
}
