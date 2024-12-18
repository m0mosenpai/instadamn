package X;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.3OJ, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3OJ extends AbstractC56322iM {
    public boolean A00;
    public boolean A01;

    public abstract void A0B(C3OI layout, int widthMeasureSpec, int heightMeasureSpec);

    @Override // X.AbstractC56322iM
    public void A06(AttributeSet attrs) {
        super.A06(attrs);
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, AbstractC56282iH.A01);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.A01 = true;
                } else if (index == 22) {
                    this.A00 = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // X.AbstractC56322iM, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-422508771);
        super.onAttachedToWindow();
        if (this.A01 || this.A00) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < super.A00; i++) {
                    View view = (View) constraintLayout.A08.get(this.A05[i]);
                    if (view != null) {
                        if (this.A01) {
                            view.setVisibility(visibility);
                        }
                        if (this.A00 && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
        C0f9.A0D(1246072323, A06);
    }

    @Override // android.view.View
    public void setElevation(float elevation) {
        super.setElevation(elevation);
        A05();
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        A05();
    }
}
