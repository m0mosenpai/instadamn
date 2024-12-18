package com.instagram.creation.video.ui;

import X.AbstractC55922hc;
import X.C44059Jdk;
import X.C44275JhR;
import X.C44414Jk9;
import X.MRD;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Iterator;

/* loaded from: classes8.dex */
public class ClipStackView extends LinearLayout implements MRD {
    public final Drawable A00;
    public final Drawable A01;

    public ClipStackView(Context context) {
        this(context, null);
    }

    @Override // X.MRD
    public final void D4m(C44059Jdk c44059Jdk, Integer num) {
    }

    @Override // X.MRD
    public final void D4n(C44059Jdk c44059Jdk) {
    }

    @Override // X.MRD
    public final void D4t() {
    }

    @Override // X.MRD
    public final void Dgq() {
    }

    private void A00(C44059Jdk c44059Jdk) {
        Context context = getContext();
        Drawable.ConstantState constantState = this.A00.getConstantState();
        constantState.getClass();
        Drawable newDrawable = constantState.newDrawable();
        Drawable.ConstantState constantState2 = this.A01.getConstantState();
        constantState2.getClass();
        addView(new C44414Jk9(context, newDrawable, constantState2.newDrawable(), c44059Jdk));
    }

    @Override // X.MRD
    public final void D4s(C44059Jdk c44059Jdk) {
        View findViewWithTag = findViewWithTag(c44059Jdk);
        if (findViewWithTag != null) {
            c44059Jdk.A08.remove(findViewWithTag);
            removeView(findViewWithTag);
        }
    }

    public void setClipStack(C44275JhR c44275JhR) {
        Iterator it = c44275JhR.iterator();
        while (it.hasNext()) {
            A00((C44059Jdk) it.next());
        }
    }

    @Override // X.MRD
    public final void D4l(C44059Jdk c44059Jdk) {
        A00(c44059Jdk);
    }

    public ClipStackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC55922hc.A0G, 0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        drawable.getClass();
        this.A00 = drawable;
        Drawable drawable2 = obtainStyledAttributes.getDrawable(1);
        drawable2.getClass();
        this.A01 = drawable2;
        obtainStyledAttributes.recycle();
    }

    public ClipStackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
