package android.view;

import X.C00O;
import android.os.Looper;

/* loaded from: classes11.dex */
public abstract class InputEventReceiver {
    public abstract void dispose();

    public abstract void onInputEvent(InputEvent inputEvent);

    public InputEventReceiver(InputChannel inputChannel, Looper looper) {
        throw C00O.createAndThrow();
    }
}
