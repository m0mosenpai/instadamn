package com.google.android.material.progressindicator;

import X.AbstractC66307U8g;
import X.AbstractC69573Vrc;
import X.AbstractC69617VsK;
import X.C67756UxX;
import X.C67759Uxa;
import X.C67764Uxf;
import X.UCo;
import X.VK3;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class CircularProgressIndicator extends UCo {
    public int getIndicatorDirection() {
        return ((C67756UxX) this.A03).A00;
    }

    public int getIndicatorInset() {
        return ((C67756UxX) this.A03).A01;
    }

    public int getIndicatorSize() {
        return ((C67756UxX) this.A03).A02;
    }

    public void setIndicatorDirection(int i) {
        ((C67756UxX) this.A03).A00 = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        C67756UxX c67756UxX = (C67756UxX) this.A03;
        if (c67756UxX.A01 != i) {
            c67756UxX.A01 = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        AbstractC69617VsK abstractC69617VsK = this.A03;
        int max = Math.max(i, abstractC69617VsK.A04 * 2);
        C67756UxX c67756UxX = (C67756UxX) abstractC69617VsK;
        if (c67756UxX.A02 != max) {
            c67756UxX.A02 = max;
            invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.U8g, android.graphics.drawable.Drawable, X.UxZ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.VKG, X.Uxc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.VKG, X.Uxc, java.lang.Object] */
    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        Context context2 = getContext();
        C67756UxX c67756UxX = (C67756UxX) this.A03;
        Property property = AbstractC66307U8g.A0A;
        ?? obj = new Object();
        obj.A00 = c67756UxX;
        obj.A03 = 1;
        C67764Uxf c67764Uxf = new C67764Uxf(c67756UxX);
        ?? abstractC66307U8g = new AbstractC66307U8g(context2, c67756UxX);
        abstractC66307U8g.A00 = obj;
        obj.A01 = abstractC66307U8g;
        abstractC66307U8g.A01 = c67764Uxf;
        ((AbstractC69573Vrc) c67764Uxf).A00 = abstractC66307U8g;
        setIndeterminateDrawable(abstractC66307U8g);
        VK3 vk3 = C67759Uxa.A05;
        ?? obj2 = new Object();
        obj2.A00 = c67756UxX;
        obj2.A03 = 1;
        setProgressDrawable(new C67759Uxa(context2, c67756UxX, obj2));
    }

    @Override // X.UCo
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context) {
        this(context, null);
    }
}
