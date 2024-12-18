package com.google.android.material.bottomappbar;

import X.ViewOnLayoutChangeListenerC66124U0h;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public class BottomAppBar$Behavior extends HideBottomViewOnScrollBehavior {
    public WeakReference A00;
    public final Rect A01;
    public final View.OnLayoutChangeListener A02;

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final /* bridge */ /* synthetic */ boolean A0Q(View view, CoordinatorLayout coordinatorLayout, int i) {
        this.A00 = new WeakReference(null);
        throw new NullPointerException("findDependentView");
    }

    public BottomAppBar$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = new ViewOnLayoutChangeListenerC66124U0h(this, 0);
        this.A01 = new Rect();
    }

    public BottomAppBar$Behavior() {
        this.A02 = new ViewOnLayoutChangeListenerC66124U0h(this, 0);
        this.A01 = new Rect();
    }
}
