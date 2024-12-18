package com.instagram.ui.widget.autowidthtogglebutton;

import X.AbstractC55922hc;
import X.AbstractC56922jQ;
import X.C14360o3;
import X.EnumC99704do;
import X.EnumC99774dy;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes7.dex */
public final class AutoWidthToggleButton extends IgdsButton {
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoWidthToggleButton(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    private final void A00(String str) {
        if (str != null) {
            if (this.A04 != null) {
                TextView textView = this.A0A;
                if (Float.compare(textView.getPaint().measureText(str), textView.getPaint().measureText(this.A04)) <= 0) {
                    return;
                }
            }
            this.A04 = str;
        }
    }

    public final String getContentDescriptionOff() {
        return this.A02;
    }

    public final String getContentDescriptionOn() {
        return this.A03;
    }

    public final int getIconOffResId() {
        return this.A00;
    }

    public final int getIconOnResId() {
        return this.A01;
    }

    public final int getMaxWidth() {
        return this.A0A.getMaxWidth();
    }

    public final String getTextOff() {
        return this.A05;
    }

    public final String getTextOn() {
        return this.A06;
    }

    @Override // com.instagram.igds.components.button.IgdsButton, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        String str;
        setText(this.A04);
        super.onMeasure(i, i2);
        if (this.A07) {
            str = this.A06;
        } else {
            str = this.A05;
        }
        setText(str);
    }

    public final void setContentDescriptionOff(String str) {
        this.A02 = str;
        if (!this.A07) {
            setContentDescription(str);
        }
    }

    public final void setContentDescriptionOn(String str) {
        this.A03 = str;
        if (this.A07) {
            setContentDescription(str);
        }
    }

    public final void setIconOffResId(int i) {
        this.A00 = i;
        if (!this.A07) {
            A02(EnumC99774dy.A02, i);
        }
        invalidate();
    }

    public final void setIconOnResId(int i) {
        this.A01 = i;
        if (this.A07) {
            A02(EnumC99774dy.A02, i);
        }
        invalidate();
    }

    public final void setMaxWidth(int i) {
        this.A0A.setMaxWidth(i);
    }

    public final void setTextOff(String str) {
        this.A05 = str;
        if (!this.A07) {
            setText(str);
        }
        A00(str);
        invalidate();
    }

    public final void setTextOn(String str) {
        this.A06 = str;
        if (this.A07) {
            setText(str);
        }
        A00(str);
        invalidate();
    }

    public final void setToggled(boolean z) {
        EnumC99704do enumC99704do;
        String str;
        String str2;
        this.A07 = z;
        if (z) {
            enumC99704do = EnumC99704do.A06;
        } else {
            enumC99704do = EnumC99704do.A03;
        }
        setStyle(enumC99704do);
        if (z) {
            str = this.A06;
        } else {
            str = this.A05;
        }
        setText(str);
        if (z) {
            str2 = this.A03;
        } else {
            str2 = this.A02;
        }
        setContentDescription(str2);
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoWidthToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.getTheme().obtainStyledAttributes(attributeSet, AbstractC55922hc.A02, i, 0);
        try {
            setToggled(obtainStyledAttributes.getBoolean(2, false));
            setTextOn(AbstractC56922jQ.A00(context2, obtainStyledAttributes, 4));
            setTextOff(AbstractC56922jQ.A00(context2, obtainStyledAttributes, 3));
            setContentDescriptionOn(AbstractC56922jQ.A00(context2, obtainStyledAttributes, 1));
            setContentDescriptionOff(AbstractC56922jQ.A00(context2, obtainStyledAttributes, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoWidthToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
