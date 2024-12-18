package X;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;

/* renamed from: X.00L, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C00L {
    public static final OnBackInvokedCallback A00(final InterfaceC16820sZ interfaceC16820sZ, final InterfaceC16820sZ interfaceC16820sZ2, final InterfaceC16660sJ interfaceC16660sJ, final InterfaceC16660sJ interfaceC16660sJ2) {
        return new OnBackAnimationCallback() { // from class: X.00K
            @Override // android.window.OnBackAnimationCallback
            public final void onBackProgressed(BackEvent backEvent) {
                C14360o3.A0B(backEvent, 0);
                interfaceC16660sJ2.invoke(new AnonymousClass002(backEvent));
            }

            @Override // android.window.OnBackAnimationCallback
            public final void onBackStarted(BackEvent backEvent) {
                C14360o3.A0B(backEvent, 0);
                interfaceC16660sJ.invoke(new AnonymousClass002(backEvent));
            }

            @Override // android.window.OnBackAnimationCallback
            public final void onBackCancelled() {
                interfaceC16820sZ2.invoke();
            }

            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                interfaceC16820sZ.invoke();
            }
        };
    }
}
