package com.instagram.ui.widget.expandingtextview;

import X.AbstractC166987dD;
import X.AbstractC55922hc;
import X.C46074KaV;
import X.C46h;
import X.C4JK;
import X.C4JL;
import X.EnumC46132KbW;
import X.InterfaceC43395JFk;
import X.J1A;
import X.LMA;
import X.ViewOnClickListenerC48073LPy;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes8.dex */
public class ExpandingEllipsizingTextView extends EllipsizingTextView {
    public int A00;
    public int A01;
    public int A02;
    public ValueAnimator A03;
    public EnumC46132KbW A04;
    public C46h A05;
    public boolean A06;
    public final ValueAnimator.AnimatorUpdateListener A07;

    @Override // com.instagram.ui.widget.expandingtextview.EllipsizingTextView, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A01 = 0;
        this.A02 = 0;
        super.onTextChanged(charSequence, i, i2, i3);
    }

    private void A00() {
        if (this.A02 > 0 && this.A01 > 0) {
            return;
        }
        StaticLayout staticLayout = new StaticLayout(super.A02, getPaint(), (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight(), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
        this.A02 = staticLayout.getHeight() + getCompoundPaddingBottom() + getCompoundPaddingTop();
        this.A01 = staticLayout.getLineTop(Math.min(this.A00, staticLayout.getLineCount())) + getCompoundPaddingTop() + getCompoundPaddingBottom();
    }

    private void A01(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A0X);
        this.A06 = obtainStyledAttributes.getBoolean(0, false);
        int integer = obtainStyledAttributes.getInteger(4, 0);
        this.A00 = integer;
        if (integer == 0) {
            this.A06 = false;
        }
        setIncludeFontPadding(false);
        obtainStyledAttributes.recycle();
        this.A04 = EnumC46132KbW.COLLAPSED;
        this.A05 = C4JK.A00;
        setMaxLines(this.A00);
        super.setOnClickListener(new ViewOnClickListenerC48073LPy(this, 54));
    }

    public final void A03(boolean z) {
        C46h c46h;
        EnumC46132KbW enumC46132KbW = this.A04;
        EnumC46132KbW enumC46132KbW2 = EnumC46132KbW.COLLAPSED;
        if (enumC46132KbW != enumC46132KbW2) {
            if (this.A06 && z) {
                int height = getHeight();
                A00();
                int i = this.A01;
                if (height != i) {
                    ValueAnimator valueAnimator = this.A03;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        valueAnimator.removeAllUpdateListeners();
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(height, i);
                    this.A03 = ofInt;
                    ofInt.addUpdateListener(this.A07);
                    this.A03.addListener(new C46074KaV(this, 8));
                    this.A03.start();
                    c46h = this.A05;
                    if ((c46h instanceof C4JL) && z) {
                        ((J1A) ((InterfaceC43395JFk) c46h.A03())).A00.A01.A01.invoke();
                    }
                    this.A04 = enumC46132KbW2;
                }
            }
            super.setMaxLines(this.A00);
            c46h = this.A05;
            if (c46h instanceof C4JL) {
                ((J1A) ((InterfaceC43395JFk) c46h.A03())).A00.A01.A01.invoke();
            }
            this.A04 = enumC46132KbW2;
        }
    }

    public final void A04(boolean z) {
        C46h c46h;
        EnumC46132KbW enumC46132KbW = this.A04;
        EnumC46132KbW enumC46132KbW2 = EnumC46132KbW.EXPANDED;
        if (enumC46132KbW != enumC46132KbW2) {
            if (this.A06 && z) {
                int height = getHeight();
                A00();
                int i = this.A02;
                if (height != i) {
                    ValueAnimator valueAnimator = this.A03;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        valueAnimator.removeAllUpdateListeners();
                        valueAnimator.cancel();
                    }
                    super.setMaxLines(Integer.MAX_VALUE);
                    ValueAnimator ofInt = ValueAnimator.ofInt(height, i);
                    this.A03 = ofInt;
                    ofInt.addUpdateListener(this.A07);
                    this.A03.start();
                    c46h = this.A05;
                    if ((c46h instanceof C4JL) && z) {
                        ((J1A) ((InterfaceC43395JFk) c46h.A03())).A00.A01.A01.invoke();
                    }
                    this.A04 = enumC46132KbW2;
                }
            }
            super.setMaxLines(Integer.MAX_VALUE);
            c46h = this.A05;
            if (c46h instanceof C4JL) {
                ((J1A) ((InterfaceC43395JFk) c46h.A03())).A00.A01.A01.invoke();
            }
            this.A04 = enumC46132KbW2;
        }
    }

    public EnumC46132KbW getExpandState() {
        return this.A04;
    }

    public void setExpandState(EnumC46132KbW enumC46132KbW) {
        EnumC46132KbW enumC46132KbW2 = this.A04;
        if (enumC46132KbW2 != enumC46132KbW) {
            if (enumC46132KbW2 == EnumC46132KbW.EXPANDED) {
                A03(false);
            } else {
                A04(false);
            }
        }
    }

    @Override // com.instagram.ui.widget.expandingtextview.EllipsizingTextView, com.instagram.common.ui.base.IgTextView, android.widget.TextView
    public void setMaxLines(int i) {
        this.A00 = i;
        super.setMaxLines(i);
    }

    @Override // com.instagram.common.ui.base.IgTextView, android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        throw AbstractC166987dD.A1D("Can't override the onClickListener for this viewTry using EllipsizingTextView instead");
    }

    public ExpandingEllipsizingTextView(Context context) {
        super(context);
        this.A07 = new LMA(this, 35);
        A01(context, null);
    }

    private int getCollapsedStateHeight() {
        A00();
        return this.A01;
    }

    private int getExpandedStateHeight() {
        A00();
        return this.A02;
    }

    public void setOnExpandedStateChangeListener(InterfaceC43395JFk interfaceC43395JFk) {
        this.A05 = C46h.A00(interfaceC43395JFk);
    }

    private void setEllipsizedMaxLines(int i) {
        super.setMaxLines(i);
    }

    public ExpandingEllipsizingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A07 = new LMA(this, 35);
        A01(context, attributeSet);
    }

    public ExpandingEllipsizingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A07 = new LMA(this, 35);
        A01(context, attributeSet);
    }
}
