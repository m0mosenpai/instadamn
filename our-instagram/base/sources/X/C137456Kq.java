package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* renamed from: X.6Kq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137456Kq extends ViewGroup {
    public final HashMap A00;
    public final HashMap A01;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final HashMap getHolderToLayoutNode() {
        return this.A00;
    }

    public final HashMap getLayoutNodeToHolder() {
        return this.A01;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (ViewGroup viewGroup : this.A00.keySet()) {
            viewGroup.layout(viewGroup.getLeft(), viewGroup.getTop(), viewGroup.getRight(), viewGroup.getBottom());
        }
    }

    public C137456Kq(Context context) {
        super(context);
        setClipChildren(false);
        this.A00 = new HashMap();
        this.A01 = new HashMap();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        String str;
        int i3;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                for (BT9 bt9 : this.A00.keySet()) {
                    int i4 = bt9.A01;
                    if (i4 != Integer.MIN_VALUE && (i3 = bt9.A00) != Integer.MIN_VALUE) {
                        bt9.measure(i4, i3);
                    }
                }
                return;
            }
            str = "heightMeasureSpec should be EXACTLY";
        } else {
            str = "widthMeasureSpec should be EXACTLY";
        }
        AbstractC28290Cdc.A00(str);
        throw C00O.createAndThrow();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AnonymousClass599 anonymousClass599 = (AnonymousClass599) this.A00.get(childAt);
            if (childAt.isLayoutRequested() && anonymousClass599 != null) {
                anonymousClass599.A0a(false, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }
}
