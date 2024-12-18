package com.google.android.material.progressindicator;

import X.AbstractC65702TsY;
import X.AbstractC66307U8g;
import X.AbstractC69573Vrc;
import X.AbstractC69617VsK;
import X.C0f9;
import X.C67757UxY;
import X.C67758UxZ;
import X.C67759Uxa;
import X.C67762Uxd;
import X.C67763Uxe;
import X.UCo;
import X.VK3;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class LinearProgressIndicator extends UCo {
    @Override // X.UCo
    public final void A01(int i, boolean z) {
        AbstractC69617VsK abstractC69617VsK = this.A03;
        if (abstractC69617VsK != null && ((C67757UxY) abstractC69617VsK).A00 == 0 && isIndeterminate()) {
            return;
        }
        super.A01(i, z);
    }

    public int getIndeterminateAnimationType() {
        return ((C67757UxY) this.A03).A00;
    }

    public int getIndicatorDirection() {
        return ((C67757UxY) this.A03).A01;
    }

    public void setIndeterminateAnimationType(int i) {
        AbstractC69573Vrc c67763Uxe;
        C67757UxY c67757UxY = (C67757UxY) this.A03;
        if (c67757UxY.A00 != i) {
            if (A02() && isIndeterminate()) {
                throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            }
            c67757UxY.A00 = i;
            c67757UxY.A00();
            C67758UxZ indeterminateDrawable = getIndeterminateDrawable();
            if (i == 0) {
                c67763Uxe = new C67762Uxd(c67757UxY);
            } else {
                Property property = C67763Uxe.A08;
                c67763Uxe = new C67763Uxe(getContext(), c67757UxY);
            }
            indeterminateDrawable.A01 = c67763Uxe;
            c67763Uxe.A00 = indeterminateDrawable;
            invalidate();
        }
    }

    public void setIndicatorDirection(int i) {
        C67757UxY c67757UxY = (C67757UxY) this.A03;
        c67757UxY.A01 = i;
        boolean z = true;
        if (i != 1 && ((getLayoutDirection() != 1 || c67757UxY.A01 != 2) && (getLayoutDirection() != 0 || i != 3))) {
            z = false;
        }
        c67757UxY.A02 = z;
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.U8g, android.graphics.drawable.Drawable, X.UxZ] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.VKG, X.Uxb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.VKG, X.Uxb, java.lang.Object] */
    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        AbstractC69573Vrc c67763Uxe;
        Context context2 = getContext();
        C67757UxY c67757UxY = (C67757UxY) this.A03;
        Property property = AbstractC66307U8g.A0A;
        ?? obj = new Object();
        obj.A00 = c67757UxY;
        obj.A02 = 300.0f;
        if (c67757UxY.A00 == 0) {
            c67763Uxe = new C67762Uxd(c67757UxY);
        } else {
            c67763Uxe = new C67763Uxe(context2, c67757UxY);
        }
        ?? abstractC66307U8g = new AbstractC66307U8g(context2, c67757UxY);
        abstractC66307U8g.A00 = obj;
        obj.A01 = abstractC66307U8g;
        abstractC66307U8g.A01 = c67763Uxe;
        c67763Uxe.A00 = abstractC66307U8g;
        setIndeterminateDrawable(abstractC66307U8g);
        VK3 vk3 = C67759Uxa.A05;
        ?? obj2 = new Object();
        obj2.A00 = c67757UxY;
        obj2.A02 = 300.0f;
        setProgressDrawable(new C67759Uxa(context2, c67757UxY, obj2));
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C67757UxY c67757UxY = (C67757UxY) this.A03;
        boolean z2 = true;
        if (c67757UxY.A01 != 1 && ((getLayoutDirection() != 1 || c67757UxY.A01 != 2) && (getLayoutDirection() != 0 || c67757UxY.A01 != 3))) {
            z2 = false;
        }
        c67757UxY.A02 = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(1747534472);
        int A062 = i - AbstractC65702TsY.A06(this);
        int A09 = i2 - AbstractC65702TsY.A09(this);
        C67758UxZ indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, A062, A09);
        }
        C67759Uxa progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, A062, A09);
        }
        C0f9.A0D(925142165, A06);
    }

    @Override // X.UCo
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        this.A03.A00();
    }

    @Override // X.UCo
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        this.A03.A00();
        invalidate();
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context) {
        this(context, null);
    }
}
