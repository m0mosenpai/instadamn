package kotlinx.coroutines.android;

import X.AnonymousClass134;
import X.AnonymousClass135;
import X.AnonymousClass137;
import X.C14360o3;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.List;

/* loaded from: classes.dex */
public final class AndroidDispatcherFactory {
    public int getLoadPriority() {
        return 1073741823;
    }

    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    public AnonymousClass137 createDispatcher(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            Choreographer choreographer = AnonymousClass134.choreographer;
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, mainLooper);
            C14360o3.A0C(invoke, "null cannot be cast to non-null type android.os.Handler");
            return new AnonymousClass135((Handler) invoke, null, false);
        }
        throw new IllegalStateException("The main looper is not available");
    }
}
