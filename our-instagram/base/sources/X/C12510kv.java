package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0kv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12510kv extends C17970ua {
    public View A00;

    public static /* synthetic */ void A00(AtomicBoolean atomicBoolean, int i) {
        boolean z = false;
        if ((i & 8) != 0) {
            z = true;
        }
        atomicBoolean.set(z);
    }

    @Override // X.C17970ua, X.C03T
    public final void A01() {
        WindowInsetsController windowInsetsController;
        View view = this.A00;
        if (view != null && (windowInsetsController = view.getWindowInsetsController()) != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: X.03S
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                    C12510kv.A00(atomicBoolean, i);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get()) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
            return;
        }
        super.A01();
    }

    @Override // X.C17970ua, X.C03T
    public final void A02() {
        View view = this.A00;
        if (view != null) {
            if (Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
        }
        super.A02();
    }

    public C12510kv(View view) {
        super(view);
        this.A00 = view;
    }
}
