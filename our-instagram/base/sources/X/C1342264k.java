package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityManager;

/* renamed from: X.64k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1342264k {
    public boolean A00;
    public final Context A01;
    public final C1342364l A02;

    public final void A00(Canvas canvas) {
        if (this.A00) {
            C1342364l c1342364l = this.A02;
            if (c1342364l.A00 != 0.0f) {
                Object systemService = this.A01.getSystemService("accessibility");
                C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
                AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                    return;
                }
                canvas.drawColor(((int) (128.0f * c1342364l.A00)) * 16777216);
            }
        }
    }

    public C1342264k(View view) {
        Context context = view.getContext();
        C14360o3.A07(context);
        this.A01 = context;
        this.A02 = new C1342364l(view);
    }
}
