package X;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.facebook.common.dextricks.DexStore;

/* renamed from: X.2bv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC53132bv {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.window.OnBackInvokedCallback, X.WPF] */
    public static WPF A01(final LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4, Object obj) {
        ?? r1 = new OnBackInvokedCallback() { // from class: X.WPF
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                LayoutInflaterFactory2C52042a4.this.A0a();
            }
        };
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(DexStore.MS_IN_NS, r1);
        return r1;
    }

    public static void A02(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    public static OnBackInvokedDispatcher A00(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }
}
