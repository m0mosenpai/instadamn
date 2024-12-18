package com.instagram.creation.capture;

import X.AbstractC167007dF;
import X.AbstractC25231BEo;
import X.C00O;
import X.C14360o3;
import X.C70850WiG;
import X.InterfaceC17990uc;
import X.JQ0;
import X.X8L;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.ui.base.IgFrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class DragToDismissView extends IgFrameLayout implements InterfaceC17990uc {
    public View A00;
    public X8L A01;
    public float A02;
    public boolean A03;
    public final float A04;
    public final int A05;
    public final long A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragToDismissView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A06 = 250L;
        this.A04 = AbstractC167007dF.A0K(context).heightPixels * 0.15f;
        this.A05 = 2500;
    }

    @Override // X.InterfaceC17990uc
    public final void DVE(View view, int[] iArr, int i, int i2, int i3) {
        AbstractC167007dF.A1E(view, 0, iArr);
        if ((view instanceof RecyclerView) && !view.canScrollVertically(-1) && i2 < 0) {
            this.A03 = true;
            this.A02 = getDragFrameView().getTranslationY() - i2;
            getDragFrameView().setTranslationY(this.A02);
        }
        if (this.A03 && i2 > 0) {
            float f = i2;
            if (getDragFrameView().getTranslationY() - f > 0.0f) {
                this.A02 = getDragFrameView().getTranslationY() - f;
                getDragFrameView().setTranslationY(this.A02);
            }
        }
        if (this.A03) {
            iArr[1] = i2;
        }
    }

    @Override // X.InterfaceC17990uc
    public final void DVF(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // X.InterfaceC17990uc
    public final void DVH(View view, View view2, int i, int i2) {
    }

    @Override // X.InterfaceC17990uc
    public final boolean Do4(View view, View view2, int i, int i2) {
        return i2 == 0 && (i & 2) != 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return 0;
    }

    public final void setDismissListener(X8L x8l) {
        C14360o3.A0B(x8l, 0);
        this.A01 = x8l;
    }

    public final void setDragFrameView(View view) {
        C14360o3.A0B(view, 0);
        this.A00 = view;
    }

    @Override // X.InterfaceC17990uc
    public final void Dow(View view, int i) {
        if (this.A03) {
            float f = this.A02;
            float f2 = this.A04;
            if (f >= f2) {
                A00();
                AbstractC25231BEo.A16(((C70850WiG) getDismissListener()).A00);
            } else if (getDragFrameView().getTranslationY() < f2) {
                getDragFrameView().animate().setDuration(this.A06).translationY(0.0f).start();
            }
            this.A03 = false;
        }
    }

    public final X8L getDismissListener() {
        X8L x8l = this.A01;
        if (x8l != null) {
            return x8l;
        }
        C14360o3.A0F("dismissListener");
        throw C00O.createAndThrow();
    }

    public final View getDragFrameView() {
        View view = this.A00;
        if (view != null) {
            return view;
        }
        C14360o3.A0F("dragFrameView");
        throw C00O.createAndThrow();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (this.A03 && Math.abs(f2) > this.A05) {
            A00();
            AbstractC25231BEo.A16(((C70850WiG) getDismissListener()).A00);
            return true;
        }
        return false;
    }

    private final void A00() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getDragFrameView(), "translationY", getDragFrameView().getHeight());
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.setDuration(this.A06);
        ofFloat.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DragToDismissView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ DragToDismissView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DragToDismissView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
