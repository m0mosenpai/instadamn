package X;

import android.content.Context;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* renamed from: X.3W1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3W1 extends FrameLayout {
    public boolean A00;
    public final ViewTreeObserver.OnScrollChangedListener A01;
    public final boolean A02;

    public C3W1(Context context, boolean z) {
        super(context);
        this.A02 = z;
        this.A00 = true;
        this.A01 = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.3W2
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                C3W1 c3w1 = C3W1.this;
                if (c3w1.A00) {
                    AbstractC87343us.A03(null, c3w1);
                }
            }
        };
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-531461624);
        super.onAttachedToWindow();
        if (this.A02) {
            getViewTreeObserver().addOnScrollChangedListener(this.A01);
        }
        C0f9.A0D(-1863031934, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-116752463);
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.A01);
        C0f9.A0D(-1861158321, A06);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        if (this.A02 && this.A00) {
            AbstractC87343us.A03(null, this);
        }
    }

    public final void setPropagationEnabled(boolean z) {
        this.A00 = z;
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
    }
}
