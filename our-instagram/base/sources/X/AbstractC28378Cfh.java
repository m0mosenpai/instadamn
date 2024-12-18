package X;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.facebook.common.dextricks.DexStore;

/* renamed from: X.Cfh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28378Cfh {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.Clv] */
    public static final C28703Clv A00(final InterfaceC16820sZ interfaceC16820sZ) {
        return new OnBackInvokedCallback() { // from class: X.Clv
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                AbstractC28378Cfh.A03(InterfaceC16820sZ.this);
            }
        };
    }

    public static final void A01(View view, Object obj) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if ((obj instanceof OnBackInvokedCallback) && (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(DexStore.MS_IN_NS, (OnBackInvokedCallback) obj);
        }
    }

    public static final void A02(View view, Object obj) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if ((obj instanceof OnBackInvokedCallback) && (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
        }
    }

    public static /* synthetic */ void A03(InterfaceC16820sZ interfaceC16820sZ) {
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
    }
}
