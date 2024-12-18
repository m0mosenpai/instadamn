package androidx.window.area.reflectionguard;

import android.app.Activity;
import androidx.window.extensions.core.util.function.Consumer;

/* loaded from: classes11.dex */
public interface WindowAreaComponentApi2Requirements {
    void addRearDisplayStatusListener(Consumer consumer);

    void endRearDisplaySession();

    void removeRearDisplayStatusListener(Consumer consumer);

    void startRearDisplaySession(Activity activity, Consumer consumer);
}
