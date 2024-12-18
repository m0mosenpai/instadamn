package X;

import android.view.accessibility.AccessibilityManager;

/* loaded from: classes11.dex */
public final class U3r implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ C25644BVg A00;

    public U3r(C25644BVg c25644BVg) {
        this.A00 = c25644BVg;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.A00.A00.Egh(Boolean.valueOf(z));
    }
}
