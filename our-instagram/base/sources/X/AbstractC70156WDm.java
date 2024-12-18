package X;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.facebook.common.dextricks.DexStore;

/* renamed from: X.WDm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70156WDm {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.WPG] */
    public static WPG A01(final Runnable runnable) {
        return new OnBackInvokedCallback() { // from class: X.WPG
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                runnable.run();
            }
        };
    }

    public static void A02(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(DexStore.MS_IN_NS, (OnBackInvokedCallback) obj2);
    }

    public static void A03(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    public static OnBackInvokedDispatcher A00(View view) {
        return view.findOnBackInvokedDispatcher();
    }
}
