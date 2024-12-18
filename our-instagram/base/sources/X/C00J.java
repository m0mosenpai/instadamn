package X;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* renamed from: X.00J, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C00J {
    public static final void A01(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) obj2);
    }

    public static /* synthetic */ void A03(InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 0);
        interfaceC16820sZ.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.00I] */
    public static final C00I A00(final InterfaceC16820sZ interfaceC16820sZ) {
        return new OnBackInvokedCallback() { // from class: X.00I
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                C00J.A03(InterfaceC16820sZ.this);
            }
        };
    }

    public static final void A02(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
