package com.instagram.ui.widget.textview;

import X.AbstractC229319v;
import X.AbstractC65977TxW;
import X.AbstractC87333ur;
import X.AnonymousClass051;
import X.C0f9;
import X.C14360o3;
import X.C87313up;
import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

/* loaded from: classes2.dex */
public class IgTextLayoutView extends View {
    public Layout A00;
    public Integer A01;
    public C87313up A02;
    public final int A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgTextLayoutView(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
        this.A02 = new C87313up(this);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        if (this.A02.A05(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        canvas.save();
        Layout layout = this.A00;
        if (layout != null) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
            layout.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        C14360o3.A0B(accessibilityNodeInfo, 0);
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getClass().getName());
        accessibilityNodeInfo.setText(getTextForAccessibility());
    }

    public final void setTextLayout(Layout layout) {
        C14360o3.A0B(layout, 0);
        if (layout.getText() instanceof Spanned) {
            if (AbstractC87333ur.A00()) {
                setLayerType(1, null);
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = getPaddingRight();
            float f = this.A03;
            if (layout.getLineCount() > 0) {
                f += (layout.getLineTop(r2) - layout.getLineTop(r2 - 1)) * (layout.getSpacingMultiplier() - 1.0f);
            }
            setPadding(paddingLeft, paddingTop, paddingRight, (int) (f + layout.getSpacingAdd()));
            this.A00 = layout;
            if (AbstractC229319v.A00()) {
                setContentDescription(getTextForAccessibility());
            }
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("CommentText must be spanned text");
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return (AccessibilityNodeProvider) ((AnonymousClass051) this.A02).A00;
    }

    public final Integer getCarouselIndex() {
        return this.A01;
    }

    public final CharSequence getTextForAccessibility() {
        CharSequence text;
        Layout layout = this.A00;
        if (layout == null || (text = layout.getText()) == null) {
            return "";
        }
        return text;
    }

    public final Layout getTextLayout() {
        return this.A00;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Layout layout = this.A00;
        if (layout != null) {
            setMeasuredDimension(getPaddingLeft() + getPaddingRight() + layout.getWidth(), getPaddingTop() + getPaddingBottom() + layout.getHeight());
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(-1347815446);
        C14360o3.A0B(motionEvent, 0);
        Layout layout = this.A00;
        boolean z = false;
        if (layout == null) {
            C0f9.A0C(-173329971, A05);
            return false;
        }
        if (AbstractC65977TxW.A00(layout, motionEvent, this) || super.onTouchEvent(motionEvent)) {
            z = true;
        }
        C0f9.A0C(1681844219, A05);
        return z;
    }

    public final void setCarouselIndex(Integer num) {
        this.A01 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgTextLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        setFocusable(true);
        this.A03 = getPaddingBottom();
        this.A02 = new C87313up(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgTextLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
        C14360o3.A0B(context, 1);
        this.A02 = new C87313up(this);
    }
}
