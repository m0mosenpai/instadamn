package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.1Ut, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC27401Ut {
    public static AbstractC27401Ut A00;

    public abstract void addMemoryInfoToEvent(C19280xC c19280xC);

    public abstract S5C getFragmentFactory();

    public abstract InterfaceC65674Tr4 getPerformanceLogger(AbstractC12990ll abstractC12990ll);

    public abstract boolean maybeRequestOverlayPermissions(Context context, Integer num);

    public abstract void navigateToReactNativeApp(AbstractC18680vv abstractC18680vv, String str, Bundle bundle);

    public abstract AbstractC60962Rck newIgReactDelegate(Fragment fragment);

    public abstract InterfaceC65532Tm2 newReactNativeLauncher(AbstractC12990ll abstractC12990ll);

    public abstract InterfaceC65532Tm2 newReactNativeLauncher(AbstractC12990ll abstractC12990ll, String str);

    public abstract void preloadReactNativeBridge(AbstractC18680vv abstractC18680vv);

    public static synchronized AbstractC27401Ut getInstance() {
        AbstractC27401Ut abstractC27401Ut;
        synchronized (AbstractC27401Ut.class) {
            abstractC27401Ut = A00;
        }
        return abstractC27401Ut;
    }

    public static void maybeAddMemoryInfoToEvent(C19280xC c19280xC) {
    }

    public static void setInstance(AbstractC27401Ut abstractC27401Ut) {
        A00 = abstractC27401Ut;
    }
}
