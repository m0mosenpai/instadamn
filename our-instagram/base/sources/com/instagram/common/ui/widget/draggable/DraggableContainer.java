package com.instagram.common.ui.widget.draggable;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25225BEi;
import X.AbstractC54340Nzy;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.JQ0;
import X.MSW;
import X.OXL;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class DraggableContainer extends FrameLayout implements Animation.AnimationListener {
    public float A00;
    public float A01;
    public Rect A02;
    public RoundedCornerImageView A03;
    public float A04;
    public float A05;
    public final Rect A06;
    public final Rect A07;
    public final int[] A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A08 = new int[2];
        this.A06 = AbstractC166987dD.A0U();
        this.A07 = AbstractC166987dD.A0U();
        this.A02 = AbstractC166987dD.A0U();
        RoundedCornerImageView roundedCornerImageView = new RoundedCornerImageView(AbstractC166997dE.A0L(this));
        this.A03 = roundedCornerImageView;
        roundedCornerImageView.setVisibility(4);
        RoundedCornerImageView roundedCornerImageView2 = this.A03;
        if (roundedCornerImageView2 == null) {
            C14360o3.A0F("draggableView");
            throw C00O.createAndThrow();
        }
        addView(roundedCornerImageView2);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        boolean A06 = AbstractC54340Nzy.A00.A06();
        if (A06) {
            this.A04 = motionEvent.getRawX();
            this.A05 = motionEvent.getRawY();
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                onAnimationEnd(null);
            }
        }
        return A06;
    }

    public static final void A02(DraggableContainer draggableContainer) {
        RoundedCornerImageView roundedCornerImageView = draggableContainer.A03;
        if (roundedCornerImageView == null) {
            C14360o3.A0F("draggableView");
            throw C00O.createAndThrow();
        }
        ViewGroup.LayoutParams layoutParams = roundedCornerImageView.getLayoutParams();
        C14360o3.A0C(layoutParams, AbstractC111324zv.A00(5));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = (int) draggableContainer.A00;
        marginLayoutParams.topMargin = (int) draggableContainer.A01;
        roundedCornerImageView.setLayoutParams(marginLayoutParams);
    }

    public final float getDragCenterX() {
        float f = this.A06.left + this.A00;
        if (this.A03 == null) {
            C14360o3.A0F("draggableView");
            throw C00O.createAndThrow();
        }
        return f + (r0.getWidth() / 2);
    }

    public final float getDragCenterY() {
        float f = this.A06.top + this.A01;
        if (this.A03 == null) {
            C14360o3.A0F("draggableView");
            throw C00O.createAndThrow();
        }
        return f + MSW.A03(r0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        RoundedCornerImageView roundedCornerImageView = this.A03;
        if (roundedCornerImageView == null) {
            C14360o3.A0F("draggableView");
            throw C00O.createAndThrow();
        }
        roundedCornerImageView.setVisibility(4);
        OXL oxl = AbstractC54340Nzy.A00;
        oxl.A05(A03());
        oxl.A00 = null;
    }

    public static final /* synthetic */ float A00(DraggableContainer draggableContainer) {
        return draggableContainer.getDragCenterX();
    }

    public static final /* synthetic */ float A01(DraggableContainer draggableContainer) {
        return draggableContainer.getDragCenterY();
    }

    private final boolean A03() {
        View findViewById = findViewById(R.id.drag_target);
        if (findViewById != null && findViewById.isShown()) {
            if (this.A02.isEmpty()) {
                findViewById.getGlobalVisibleRect(this.A02);
            }
            RoundedCornerImageView roundedCornerImageView = this.A03;
            if (roundedCornerImageView == null) {
                C14360o3.A0F("draggableView");
                throw C00O.createAndThrow();
            }
            Rect rect = this.A07;
            roundedCornerImageView.getGlobalVisibleRect(rect);
            return this.A02.contains(rect);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(1671160262);
        super.onAttachedToWindow();
        AbstractC54340Nzy.A00.A01 = AbstractC25225BEi.A16(this);
        C0f9.A0D(-1598039035, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(1001398252);
        super.onDetachedFromWindow();
        AbstractC54340Nzy.A00.A00 = null;
        C0f9.A0D(-652822441, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        if (r6 != 3) goto L73;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.draggable.DraggableContainer.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DraggableContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DraggableContainer(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ DraggableContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
