package com.instagram.common.ui.colorfilter;

import X.AbstractC55922hc;
import X.AbstractC56832jG;
import X.C02R;
import X.C3DY;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.util.AttributeSet;
import android.widget.ImageView;

@Deprecated
/* loaded from: classes2.dex */
public class ColorFilterAlphaImageView extends ImageView {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Integer A04;
    public Integer A05;

    private void A02() {
        Integer num = this.A05;
        if (num != null) {
            int intValue = num.intValue();
            Integer num2 = this.A04;
            if (num2 == null) {
                num2 = num;
            }
            AbstractC56832jG.A01(this, intValue, num2.intValue(), this.A01, this.A02, this.A03, this.A00);
        }
    }

    private void A01() {
        C02R.A01(this.A01, 0, "normal alpha", 255);
        C02R.A01(this.A02, 0, "active alpha", 255);
        C02R.A01(this.A03, 0, "pressed alpha", 255);
        C02R.A01(this.A00, 0, "disabled alpha", 255);
    }

    private void A03(Context context, AttributeSet attributeSet) {
        int intValue;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A0H);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            setContentDescription(context.getText(resourceId));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            this.A05 = Integer.valueOf(obtainStyledAttributes.getColor(4, 0));
            if (obtainStyledAttributes.hasValue(1)) {
                intValue = obtainStyledAttributes.getColor(1, 0);
            } else {
                intValue = this.A05.intValue();
            }
            this.A04 = Integer.valueOf(intValue);
        }
        this.A01 = obtainStyledAttributes.getInt(5, 255);
        this.A02 = obtainStyledAttributes.getInt(2, 255);
        this.A03 = obtainStyledAttributes.getInt(2, 255);
        this.A00 = obtainStyledAttributes.getInt(3, 77);
        A01();
        obtainStyledAttributes.recycle();
        A02();
    }

    public ColorFilter getActiveColorFilter() {
        Integer num = this.A04;
        if (num == null) {
            return null;
        }
        return C3DY.A00(num.intValue());
    }

    public int getDisabledAlpha() {
        return this.A00;
    }

    public ColorFilter getNormalColorFilter() {
        Integer num = this.A05;
        if (num == null) {
            return null;
        }
        return C3DY.A00(num.intValue());
    }

    public void setActiveAlpha(int i) {
        this.A02 = i;
        A01();
        A02();
    }

    public void setActiveColor(int i) {
        Integer valueOf;
        if (i == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(i);
        }
        this.A04 = valueOf;
        A02();
    }

    public void setDisabledAlpha(int i) {
        this.A00 = i;
        A01();
        A02();
    }

    public void setNormalAlpha(int i) {
        this.A01 = i;
        A01();
        A02();
    }

    public void setNormalColor(int i) {
        Integer valueOf;
        if (i == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(i);
        }
        this.A05 = valueOf;
        A02();
    }

    public void setPressedAlpha(int i) {
        this.A03 = i;
        A01();
        A02();
    }

    public ColorFilterAlphaImageView(Context context) {
        super(context);
        this.A01 = 255;
        this.A02 = 255;
        this.A03 = 255;
        this.A00 = 77;
    }

    public final void A04(int i, int i2) {
        setNormalColor(i);
        setActiveColor(i2);
        A01();
        A02();
    }

    @Override // android.widget.ImageView
    public void setImageAlpha(int i) {
        super.setImageAlpha(i);
        this.A00 = Math.max(this.A00, i);
        this.A01 = Math.max(this.A01, i);
        this.A02 = Math.max(this.A02, i);
        this.A03 = Math.max(this.A03, i);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        A01();
        A02();
    }

    public ColorFilterAlphaImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = 255;
        this.A02 = 255;
        this.A03 = 255;
        this.A00 = 77;
        A03(context, attributeSet);
    }

    public ColorFilterAlphaImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = 255;
        this.A02 = 255;
        this.A03 = 255;
        this.A00 = 77;
        A03(context, attributeSet);
    }
}
