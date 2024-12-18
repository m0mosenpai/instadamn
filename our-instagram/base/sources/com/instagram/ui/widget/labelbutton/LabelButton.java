package com.instagram.ui.widget.labelbutton;

import X.AbstractC31172DnG;
import X.AbstractC55922hc;
import X.AbstractC56922jQ;
import X.C14360o3;
import X.JQ0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class LabelButton extends IgLinearLayout {
    public final IgSimpleImageView A00;
    public final IgTextView A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        setOrientation(1);
        setGravity(1);
        View.inflate(context, R.layout.layout_label_button, this);
        this.A00 = (IgSimpleImageView) findViewById(R.id.label_button_icon);
        this.A01 = AbstractC31172DnG.A0Y(this, R.id.label_button_text);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A1f, i, 0);
            C14360o3.A07(obtainStyledAttributes);
            setLabelText(AbstractC56922jQ.A00(context, obtainStyledAttributes, 1));
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                setImageResource(resourceId);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void setLabelText(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            IgTextView igTextView = this.A01;
            igTextView.setText(charSequence);
            igTextView.setVisibility(0);
            return;
        }
        this.A01.setVisibility(8);
    }

    public final void setImageDrawable(Drawable drawable) {
        this.A00.setImageDrawable(drawable);
    }

    public final void setImageResource(int i) {
        this.A00.setImageResource(i);
    }

    public final void setImageTintList(ColorStateList colorStateList) {
        this.A00.setImageTintList(colorStateList);
    }

    public final void setSize(int i) {
        this.A00.setLayoutParams(new LinearLayout.LayoutParams(i, i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LabelButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public final void setLabelText(int i) {
        setLabelText(getContext().getString(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LabelButton(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ LabelButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
