package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.Jh0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnTouchListenerC44256Jh0 implements View.OnTouchListener {
    public final int A00;

    public ViewOnTouchListenerC44256Jh0(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        switch (this.A00) {
            case 2:
                boolean A1a = AbstractC167017dG.A1a(view, motionEvent);
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != A1a) {
                        return false;
                    }
                    f = 1.0f;
                    view.setAlpha(f);
                    return false;
                }
                f = 0.7f;
                view.setAlpha(f);
                return false;
            case 3:
                int action2 = motionEvent.getAction();
                if (action2 != 0) {
                    if (action2 != 1 && action2 != 3) {
                        return false;
                    }
                    f = 1.0f;
                    view.setAlpha(f);
                    return false;
                }
                f = 0.5f;
                view.setAlpha(f);
                return false;
            default:
                return true;
        }
    }
}
