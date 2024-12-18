package X;

import android.view.KeyEvent;

/* loaded from: classes5.dex */
public abstract class CBJ {
    public static final int A00(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return AbstractC25235BEs.A1U(action, 1) ? 1 : 0;
        }
        return 2;
    }
}
