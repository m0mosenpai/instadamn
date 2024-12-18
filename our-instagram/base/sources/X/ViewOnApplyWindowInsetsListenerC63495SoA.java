package X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.SoA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnApplyWindowInsetsListenerC63495SoA implements View.OnApplyWindowInsetsListener {
    public static final ViewOnApplyWindowInsetsListenerC63495SoA A00 = new ViewOnApplyWindowInsetsListenerC63495SoA();

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        AbstractC167007dF.A1K(view, windowInsets);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        return onApplyWindowInsets.replaceSystemWindowInsets(onApplyWindowInsets.getSystemWindowInsetLeft(), 0, onApplyWindowInsets.getSystemWindowInsetRight(), onApplyWindowInsets.getSystemWindowInsetBottom());
    }
}
