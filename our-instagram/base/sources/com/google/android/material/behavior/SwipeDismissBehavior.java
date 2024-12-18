package com.google.android.material.behavior;

import X.AbstractC010103p;
import X.C012804r;
import X.C65834Tur;
import X.C66377UEl;
import X.C70198WGk;
import X.InterfaceC71910X9u;
import X.UBZ;
import X.VKH;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;

/* loaded from: classes11.dex */
public class SwipeDismissBehavior extends CoordinatorLayout.Behavior {
    public C70198WGk A03;
    public InterfaceC71910X9u A04;
    public boolean A05;
    public int A02 = 2;
    public float A01 = 0.0f;
    public float A00 = 0.5f;
    public final VKH A06 = new C66377UEl(this);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean A0Q(View view, CoordinatorLayout coordinatorLayout, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            AbstractC010103p.A09(view, 1048576);
            if (!(this instanceof BaseTransientBottomBar$Behavior) || (view instanceof UBZ)) {
                AbstractC010103p.A0E(view, C012804r.A0D, new C65834Tur(this, 2));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        boolean z = this.A05;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.A05 = false;
            }
        } else {
            z = coordinatorLayout.A0G(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.A05 = z;
        }
        if (!z) {
            return false;
        }
        C70198WGk c70198WGk = this.A03;
        if (c70198WGk == null) {
            c70198WGk = new C70198WGk(coordinatorLayout.getContext(), coordinatorLayout, this.A06);
            this.A03 = c70198WGk;
        }
        return c70198WGk.A0J(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean A0M(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        C70198WGk c70198WGk = this.A03;
        if (c70198WGk != null) {
            c70198WGk.A0F(motionEvent);
            return true;
        }
        return false;
    }
}
