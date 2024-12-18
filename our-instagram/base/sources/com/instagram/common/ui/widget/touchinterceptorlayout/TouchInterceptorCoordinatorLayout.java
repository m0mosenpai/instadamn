package com.instagram.common.ui.widget.touchinterceptorlayout;

import X.C56052hs;
import X.InterfaceC56002hn;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes2.dex */
public class TouchInterceptorCoordinatorLayout extends CoordinatorLayout implements InterfaceC56002hn {
    public final C56052hs A00;

    public TouchInterceptorCoordinatorLayout(Context context) {
        this(context, null);
    }

    @Override // X.InterfaceC56002hn
    public final ViewGroup ACp() {
        return this;
    }

    @Override // X.InterfaceC56002hn
    public final void COs(View.OnTouchListener onTouchListener) {
        C56052hs c56052hs = this.A00;
        c56052hs.A00 = onTouchListener;
        c56052hs.A03.setOnTouchListener(onTouchListener);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.A00.A01(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (!this.A00.A02(z)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setAndSaveInterceptTouchEvent(View.OnTouchListener onTouchListener) {
        this.A00.A00(onTouchListener, onTouchListener);
    }

    @Override // X.InterfaceC56002hn
    public void setKeepObservingAfterRequestDisallowTouchEvent(boolean z) {
        this.A00.A02 = z;
    }

    public TouchInterceptorCoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = new C56052hs(context, attributeSet, this);
    }

    public void setAndSaveInterceptTouchEvent(View.OnTouchListener onTouchListener, View.OnTouchListener onTouchListener2) {
        this.A00.A00(onTouchListener, onTouchListener2);
    }

    public TouchInterceptorCoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
