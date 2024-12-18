package androidx.appcompat.widget;

import X.AbstractC53402cO;
import X.C0f9;
import X.YM1;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class ViewStubCompat extends View {
    public LayoutInflater A00;
    public int A01;
    public int A02;
    public YM1 A03;
    public WeakReference A04;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public int getInflatedId() {
        return this.A01;
    }

    public LayoutInflater getLayoutInflater() {
        return this.A00;
    }

    public int getLayoutResource() {
        return this.A02;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.A04;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i != 0 && i != 4) {
            return;
        }
        A00();
    }

    public final View A00() {
        Throwable illegalStateException;
        int i;
        int A03 = C0f9.A03(1504530888);
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.A02 != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.A00;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.A02, viewGroup, false);
                int i2 = this.A01;
                if (i2 != -1) {
                    inflate.setId(i2);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.A04 = new WeakReference(inflate);
                C0f9.A0A(-1902474706, A03);
                return inflate;
            }
            illegalStateException = new IllegalArgumentException("ViewStub must have a valid layoutResource");
            i = 1567170971;
        } else {
            illegalStateException = new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
            i = 1643734244;
        }
        C0f9.A0A(i, A03);
        throw illegalStateException;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C0f9.A0A(-215613566, C0f9.A03(-1876331023));
    }

    public void setInflatedId(int i) {
        this.A01 = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.A00 = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.A02 = i;
    }

    public void setOnInflateListener(YM1 ym1) {
        this.A03 = ym1;
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC53402cO.A0R, i, 0);
        this.A01 = obtainStyledAttributes.getResourceId(2, -1);
        this.A02 = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
