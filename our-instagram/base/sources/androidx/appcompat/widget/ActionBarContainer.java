package androidx.appcompat.widget;

import X.AbstractC167007dF;
import X.C0f9;
import X.UC7;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;

/* loaded from: classes11.dex */
public class ActionBarContainer extends FrameLayout {
    public Drawable A00;
    public Drawable A01;
    public Drawable A02;
    public View A03;
    public boolean A04;
    public boolean A05;
    public int A06;
    public View A07;
    public View A08;
    public boolean A09;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public View getTabContainer() {
        return this.A03;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.A09 && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.view.View r0 = r6.A07
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 != r3) goto L1c
            int r1 = r6.A06
            if (r1 < 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getSize(r8)
            int r0 = java.lang.Math.min(r1, r0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
        L1c:
            super.onMeasure(r7, r8)
            android.view.View r0 = r6.A07
            if (r0 == 0) goto L7f
            int r4 = android.view.View.MeasureSpec.getMode(r8)
            android.view.View r0 = r6.A03
            if (r0 == 0) goto L7f
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 == r0) goto L7f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L7f
            android.view.View r2 = r6.A07
            if (r2 == 0) goto L84
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 == r0) goto L84
            int r0 = r2.getMeasuredHeight()
            if (r0 == 0) goto L84
            android.view.View r0 = r6.A07
        L4b:
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r1 = r0.getMeasuredHeight()
            int r0 = r2.topMargin
            int r1 = r1 + r0
            int r0 = r2.bottomMargin
            int r1 = r1 + r0
        L5b:
            if (r4 != r3) goto L80
            int r5 = android.view.View.MeasureSpec.getSize(r8)
        L61:
            int r4 = r6.getMeasuredWidth()
            android.view.View r0 = r6.A03
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            int r2 = r0.getMeasuredHeight()
            int r0 = r3.topMargin
            int r2 = r2 + r0
            int r0 = r3.bottomMargin
            int r2 = r2 + r0
            int r1 = r1 + r2
            int r0 = java.lang.Math.min(r1, r5)
            r6.setMeasuredDimension(r4, r0)
        L7f:
            return
        L80:
            r5 = 2147483647(0x7fffffff, float:NaN)
            goto L61
        L84:
            android.view.View r2 = r6.A08
            if (r2 == 0) goto L99
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 == r0) goto L99
            int r0 = r2.getMeasuredHeight()
            if (r0 == 0) goto L99
            android.view.View r0 = r6.A08
            goto L4b
        L99:
            r1 = 0
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r0 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setPrimaryBackground(android.graphics.drawable.Drawable r6) {
        /*
            r5 = this;
            android.graphics.drawable.Drawable r1 = r5.A00
            if (r1 == 0) goto Ld
            r0 = 0
            r1.setCallback(r0)
            android.graphics.drawable.Drawable r0 = r5.A00
            r5.unscheduleDrawable(r0)
        Ld:
            r5.A00 = r6
            if (r6 == 0) goto L33
            r6.setCallback(r5)
            android.view.View r0 = r5.A07
            if (r0 == 0) goto L33
            android.graphics.drawable.Drawable r4 = r5.A00
            int r3 = r0.getLeft()
            android.view.View r0 = r5.A07
            int r2 = r0.getTop()
            android.view.View r0 = r5.A07
            int r1 = r0.getRight()
            android.view.View r0 = r5.A07
            int r0 = r0.getBottom()
            r4.setBounds(r3, r2, r1, r0)
        L33:
            boolean r0 = r5.A04
            r1 = 1
            if (r0 == 0) goto L46
            android.graphics.drawable.Drawable r0 = r5.A01
        L3a:
            if (r0 != 0) goto L4d
        L3c:
            r5.setWillNotDraw(r1)
            r5.invalidate()
            r5.invalidateOutline()
            return
        L46:
            android.graphics.drawable.Drawable r0 = r5.A00
            if (r0 != 0) goto L4d
            android.graphics.drawable.Drawable r0 = r5.A02
            goto L3a
        L4d:
            r1 = 0
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.setPrimaryBackground(android.graphics.drawable.Drawable):void");
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4 = this.A01;
        if (drawable4 != null) {
            drawable4.setCallback(null);
            unscheduleDrawable(this.A01);
        }
        this.A01 = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.A04 && (drawable3 = this.A01) != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (this.A04) {
            drawable2 = this.A01;
        } else {
            if (this.A00 == null) {
                drawable2 = this.A02;
            }
            setWillNotDraw(z);
            invalidate();
            invalidateOutline();
        }
        if (drawable2 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r0 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStackedBackground(android.graphics.drawable.Drawable r6) {
        /*
            r5 = this;
            android.graphics.drawable.Drawable r1 = r5.A02
            if (r1 == 0) goto Ld
            r0 = 0
            r1.setCallback(r0)
            android.graphics.drawable.Drawable r0 = r5.A02
            r5.unscheduleDrawable(r0)
        Ld:
            r5.A02 = r6
            if (r6 == 0) goto L37
            r6.setCallback(r5)
            boolean r0 = r5.A05
            if (r0 == 0) goto L37
            android.graphics.drawable.Drawable r4 = r5.A02
            if (r4 == 0) goto L37
            android.view.View r0 = r5.A03
            int r3 = r0.getLeft()
            android.view.View r0 = r5.A03
            int r2 = r0.getTop()
            android.view.View r0 = r5.A03
            int r1 = r0.getRight()
            android.view.View r0 = r5.A03
            int r0 = r0.getBottom()
            r4.setBounds(r3, r2, r1, r0)
        L37:
            boolean r0 = r5.A04
            r1 = 1
            if (r0 == 0) goto L4a
            android.graphics.drawable.Drawable r0 = r5.A01
        L3e:
            if (r0 != 0) goto L51
        L40:
            r5.setWillNotDraw(r1)
            r5.invalidate()
            r5.invalidateOutline()
            return
        L4a:
            android.graphics.drawable.Drawable r0 = r5.A00
            if (r0 != 0) goto L51
            android.graphics.drawable.Drawable r0 = r5.A02
            goto L3e
        L51:
            r1 = 0
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.setStackedBackground(android.graphics.drawable.Drawable):void");
    }

    public void setTabContainer(UC7 uc7) {
        View view = this.A03;
        if (view != null) {
            removeView(view);
        }
        this.A03 = uc7;
        if (uc7 != null) {
            addView(uc7);
            throw new NullPointerException("getLayoutParams");
        }
    }

    public void setTransitioning(boolean z) {
        this.A09 = z;
        int i = Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED;
        if (z) {
            i = 393216;
        }
        setDescendantFocusability(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if ((drawable != this.A00 || this.A04) && ((drawable != this.A02 || !this.A05) && ((drawable != this.A01 || !this.A04) && !super.verifyDrawable(drawable)))) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A00;
        if (drawable != null && drawable.isStateful()) {
            this.A00.setState(getDrawableState());
        }
        Drawable drawable2 = this.A02;
        if (drawable2 != null && drawable2.isStateful()) {
            this.A02.setState(getDrawableState());
        }
        Drawable drawable3 = this.A01;
        if (drawable3 != null && drawable3.isStateful()) {
            this.A01.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.A02;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.A01;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        int A06 = C0f9.A06(-1241433528);
        super.onFinishInflate();
        this.A07 = findViewById(R.id.action_bar);
        this.A08 = findViewById(R.id.action_context_bar);
        C0f9.A0D(-38538374, A06);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        r2 = r7.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r2 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        r2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        invalidate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if (r7.A00 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r7.A07.getVisibility() != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r6 = r7.A00;
        r4 = r7.A07.getLeft();
        r2 = r7.A07.getTop();
        r1 = r7.A07.getRight();
        r0 = r7.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        r6.setBounds(r4, r2, r1, r0.getBottom());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
    
        r0 = r7.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        if (r0 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (r0.getVisibility() != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
    
        r6 = r7.A00;
        r4 = r7.A08.getLeft();
        r2 = r7.A08.getTop();
        r1 = r7.A08.getRight();
        r0 = r7.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
    
        r7.A00.setBounds(0, 0, 0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        r7.A05 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        if (r3 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        r4 = r7.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        if (r4 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        r4.setBounds(r5.getLeft(), r5.getTop(), r5.getRight(), r5.getBottom());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b5, code lost:
    
        if (r6 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0012, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r5.getVisibility() == 8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r5.getVisibility() == 8) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        r4 = getMeasuredHeight();
        r2 = (android.view.ViewGroup.MarginLayoutParams) r5.getLayoutParams();
        r1 = r4 - r5.getMeasuredHeight();
        r0 = r2.bottomMargin;
        r5.layout(r9, r1 - r0, r11, r4 - r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (r7.A04 == false) goto L18;
     */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            super.onLayout(r8, r9, r10, r11, r12)
            android.view.View r5 = r7.A03
            r1 = 8
            r6 = 0
            if (r5 == 0) goto L11
            int r0 = r5.getVisibility()
            r3 = 1
            if (r0 != r1) goto L14
        L11:
            r3 = 0
            if (r5 == 0) goto L31
        L14:
            int r0 = r5.getVisibility()
            if (r0 == r1) goto L31
            int r4 = r7.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r0 = r5.getMeasuredHeight()
            int r1 = r4 - r0
            int r0 = r2.bottomMargin
            int r1 = r1 - r0
            int r4 = r4 - r0
            r5.layout(r9, r1, r11, r4)
        L31:
            boolean r0 = r7.A04
            if (r0 == 0) goto L48
            android.graphics.drawable.Drawable r2 = r7.A01
            if (r2 == 0) goto L47
            int r1 = r7.getMeasuredWidth()
            int r0 = r7.getMeasuredHeight()
            r2.setBounds(r6, r6, r1, r0)
        L44:
            r7.invalidate()
        L47:
            return
        L48:
            android.graphics.drawable.Drawable r0 = r7.A00
            if (r0 == 0) goto L72
            android.view.View r0 = r7.A07
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L8e
            android.graphics.drawable.Drawable r6 = r7.A00
            android.view.View r0 = r7.A07
            int r4 = r0.getLeft()
            android.view.View r0 = r7.A07
            int r2 = r0.getTop()
            android.view.View r0 = r7.A07
            int r1 = r0.getRight()
            android.view.View r0 = r7.A07
        L6a:
            int r0 = r0.getBottom()
            r6.setBounds(r4, r2, r1, r0)
        L71:
            r6 = 1
        L72:
            r7.A05 = r3
            if (r3 == 0) goto Lb5
            android.graphics.drawable.Drawable r4 = r7.A02
            if (r4 == 0) goto Lb5
            int r3 = r5.getLeft()
            int r2 = r5.getTop()
            int r1 = r5.getRight()
            int r0 = r5.getBottom()
            r4.setBounds(r3, r2, r1, r0)
            goto L44
        L8e:
            android.view.View r0 = r7.A08
            if (r0 == 0) goto Laf
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Laf
            android.graphics.drawable.Drawable r6 = r7.A00
            android.view.View r0 = r7.A08
            int r4 = r0.getLeft()
            android.view.View r0 = r7.A08
            int r2 = r0.getTop()
            android.view.View r0 = r7.A08
            int r1 = r0.getRight()
            android.view.View r0 = r7.A08
            goto L6a
        Laf:
            android.graphics.drawable.Drawable r0 = r7.A00
            r0.setBounds(r6, r6, r6, r6)
            goto L71
        Lb5:
            if (r6 == 0) goto L47
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(875077784);
        super.onTouchEvent(motionEvent);
        C0f9.A0C(1595383232, A05);
        return true;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean A1N = AbstractC167007dF.A1N(i);
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setVisible(A1N, false);
        }
        Drawable drawable2 = this.A02;
        if (drawable2 != null) {
            drawable2.setVisible(A1N, false);
        }
        Drawable drawable3 = this.A01;
        if (drawable3 != null) {
            drawable3.setVisible(A1N, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0043, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ActionBarContainer(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            r4.<init>(r5, r6)
            X.U8L r0 = new X.U8L
            r0.<init>(r4)
            r4.setBackground(r0)
            int[] r0 = X.AbstractC53402cO.A00
            android.content.res.TypedArray r3 = r5.obtainStyledAttributes(r6, r0)
            r0 = 0
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            r4.A00 = r0
            r0 = 2
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            r4.A02 = r0
            r1 = 13
            r0 = -1
            int r0 = r3.getDimensionPixelSize(r1, r0)
            r4.A06 = r0
            int r2 = r4.getId()
            r0 = 2131441668(0x7f0b3804, float:1.8505354E38)
            r1 = 1
            if (r2 != r0) goto L3a
            r4.A04 = r1
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r1)
            r4.A01 = r0
        L3a:
            r3.recycle()
            boolean r0 = r4.A04
            if (r0 == 0) goto L49
            android.graphics.drawable.Drawable r0 = r4.A01
        L43:
            if (r0 != 0) goto L50
        L45:
            r4.setWillNotDraw(r1)
            return
        L49:
            android.graphics.drawable.Drawable r0 = r4.A00
            if (r0 != 0) goto L50
            android.graphics.drawable.Drawable r0 = r4.A02
            goto L43
        L50:
            r1 = 0
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.<init>(android.content.Context, android.util.AttributeSet):void");
    }
}
