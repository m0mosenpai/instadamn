package com.google.android.material.snackbar;

import X.C68234VIu;
import X.C70194WFy;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes11.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior {
    public final C68234VIu A00;

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        C68234VIu c68234VIu = this.A00;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                C70194WFy.A00().A06(c68234VIu.A00);
            }
        } else if (coordinatorLayout.A0G(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            C70194WFy.A00().A05(c68234VIu.A00);
        }
        return super.A0L(motionEvent, view, coordinatorLayout);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.VIu, java.lang.Object] */
    public BaseTransientBottomBar$Behavior() {
        ?? obj = new Object();
        this.A01 = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        super.A00 = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.A02 = 0;
        this.A00 = obj;
    }
}
