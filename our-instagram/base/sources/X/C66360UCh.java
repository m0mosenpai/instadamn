package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.facebook.R;

/* renamed from: X.UCh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C66360UCh extends ListView {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public RunnableC71208Wpz A05;
    public boolean A06;
    public boolean A07;
    public C66310U8j A08;
    public WO7 A09;
    public boolean A0A;
    public final Rect A0B;

    private void setSelectorEnabled(boolean z) {
        C66310U8j c66310U8j = this.A08;
        if (c66310U8j != null) {
            c66310U8j.A01 = z;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r14 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01(android.view.MotionEvent r18, int r19) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66360UCh.A01(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.A0B;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.A05 == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            Drawable selector = getSelector();
            if (selector != null && this.A06 && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        if (!this.A0A && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        if (!this.A0A && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        if (!this.A0A && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        if ((!this.A0A || !this.A07) && !super.isInTouchMode()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.graphics.drawable.Drawable$Callback, android.graphics.drawable.Drawable, X.U8j] */
    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C66310U8j c66310U8j;
        if (drawable != 0) {
            ?? drawable2 = new Drawable();
            Drawable drawable3 = drawable2.A00;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            drawable2.A00 = drawable;
            drawable.setCallback(drawable2);
            drawable2.A01 = true;
            c66310U8j = drawable2;
        } else {
            c66310U8j = null;
        }
        this.A08 = c66310U8j;
        super.setSelector(c66310U8j);
        Rect rect = new Rect();
        if (drawable != 0) {
            drawable.getPadding(rect);
        }
        this.A02 = rect.left;
        this.A04 = rect.top;
        this.A03 = rect.right;
        this.A01 = rect.bottom;
    }

    public C66360UCh(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.A0B = new Rect();
        this.A02 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A01 = 0;
        this.A0A = z;
        setCacheColorHint(0);
    }

    public final int A00(int i, int i2) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i3 = listPaddingTop + listPaddingBottom;
        if (adapter != null) {
            if (dividerHeight <= 0 || divider == null) {
                dividerHeight = 0;
            }
            int count = adapter.getCount();
            View view = null;
            int i4 = 0;
            for (int i5 = 0; i5 < count; i5++) {
                int itemViewType = adapter.getItemViewType(i5);
                if (itemViewType != i4) {
                    view = null;
                    i4 = itemViewType;
                }
                view = adapter.getView(i5, view, this);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = generateDefaultLayoutParams();
                    view.setLayoutParams(layoutParams);
                }
                int i6 = layoutParams.height;
                if (i6 > 0) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                }
                view.measure(i, makeMeasureSpec);
                view.forceLayout();
                if (i5 > 0) {
                    i3 += dividerHeight;
                }
                i3 += view.getMeasuredHeight();
                if (i3 >= i2) {
                    return i2;
                }
            }
        }
        return i3;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(1921099090);
        this.A05 = null;
        super.onDetachedFromWindow();
        C0f9.A0D(1743956562, A06);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.A05 == null) {
            RunnableC71208Wpz runnableC71208Wpz = new RunnableC71208Wpz(this);
            this.A05 = runnableC71208Wpz;
            runnableC71208Wpz.A00.post(runnableC71208Wpz);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (Build.VERSION.SDK_INT >= 30 && AbstractC70146W8m.A01()) {
                        AbstractC70146W8m.A00(childAt, this, pointToPosition);
                    } else {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.A06 && isPressed()) {
                    selector.setState(getDrawableState());
                    return onHoverEvent;
                }
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(-1984569987);
        if (motionEvent.getAction() == 0) {
            this.A00 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC71208Wpz runnableC71208Wpz = this.A05;
        if (runnableC71208Wpz != null) {
            C66360UCh c66360UCh = runnableC71208Wpz.A00;
            c66360UCh.A05 = null;
            c66360UCh.removeCallbacks(runnableC71208Wpz);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        C0f9.A0C(562774048, A05);
        return onTouchEvent;
    }

    public void setListSelectionHidden(boolean z) {
        this.A07 = z;
    }
}
