package com.instagram.ui.widget.progressbutton;

import X.AbstractC13880nE;
import X.AbstractC166997dE;
import X.AbstractC25228BEl;
import X.AbstractC55922hc;
import X.AbstractC56952jT;
import X.C14360o3;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class ProgressButton extends FrameLayout {
    public Drawable A00;
    public Integer A01;
    public boolean A02;
    public final ProgressBar A03;
    public final TextView A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        AbstractC25228BEl.A0P(this).inflate(R.layout.reg_next, this);
        TextView A0T = AbstractC166997dE.A0T(this, R.id.button_text);
        this.A04 = A0T;
        this.A03 = (ProgressBar) findViewById(R.id.button_progress);
        AbstractC56952jT.A01(A0T);
        A00(attributeSet);
    }

    private final void setTextSize(int i) {
        this.A04.setTextSize(0, i);
    }

    public final void A00(AttributeSet attributeSet) {
        if (attributeSet != null) {
            Context context = getContext();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A1q);
            C14360o3.A07(obtainStyledAttributes);
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                setText(context.getText(resourceId));
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
            if (dimensionPixelSize == -1) {
                dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material);
            }
            setTextSize(dimensionPixelSize);
            if (obtainStyledAttributes.getBoolean(4, false)) {
                TextView textView = this.A04;
                textView.setSingleLine();
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            if (dimensionPixelSize2 != -1) {
                TextView textView2 = this.A04;
                AbstractC13880nE.A0l(textView2, dimensionPixelSize2, textView2.getPaddingTop(), dimensionPixelSize2, textView2.getPaddingBottom());
            }
            setBackground(obtainStyledAttributes.getDrawable(2));
            if (obtainStyledAttributes.hasValue(6)) {
                setProgressBarColor(obtainStyledAttributes.getColor(6, -65536));
            }
            if (obtainStyledAttributes.hasValue(5)) {
                setProgressBackgroundResource(obtainStyledAttributes.getResourceId(5, -1));
            }
            if (obtainStyledAttributes.hasValue(0)) {
                setEnabled(obtainStyledAttributes.getBoolean(0, true));
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void setProgressBarColor(int i) {
        AbstractC166997dE.A1F(this.A03.getIndeterminateDrawable().mutate(), i);
    }

    public final void setShowProgressBar(boolean z) {
        if (this.A02 != z) {
            this.A02 = z;
            ProgressBar progressBar = this.A03;
            int i = 0;
            int i2 = 4;
            if (z) {
                i2 = 0;
            }
            progressBar.setVisibility(i2);
            TextView textView = this.A04;
            if (z) {
                i = 4;
            }
            textView.setVisibility(i);
            if (this.A01 != null) {
                if (z) {
                    this.A00 = getBackground();
                    Integer num = this.A01;
                    C14360o3.A0A(num);
                    setBackgroundResource(num.intValue());
                    return;
                }
                setBackground(this.A00);
                Drawable drawable = this.A00;
                if (drawable != null) {
                    drawable.jumpToCurrentState();
                }
                this.A00 = null;
            }
        }
    }

    public final void setText(int i) {
        this.A04.setText(i);
    }

    public final void setTextColor(int i) {
        this.A04.setTextColor(i);
    }

    public final void setTypeface(int i) {
        this.A04.setTypeface(null, i);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.A04.setEnabled(z);
    }

    public final void setProgressBackgroundResource(int i) {
        this.A01 = Integer.valueOf(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        AbstractC25228BEl.A0P(this).inflate(R.layout.reg_next, this);
        TextView A0T = AbstractC166997dE.A0T(this, R.id.button_text);
        this.A04 = A0T;
        this.A03 = (ProgressBar) findViewById(R.id.button_progress);
        AbstractC56952jT.A01(A0T);
        A00(attributeSet);
    }

    public final void setText(CharSequence charSequence) {
        this.A04.setText(charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressButton(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        AbstractC25228BEl.A0P(this).inflate(R.layout.reg_next, this);
        TextView A0T = AbstractC166997dE.A0T(this, R.id.button_text);
        this.A04 = A0T;
        this.A03 = (ProgressBar) findViewById(R.id.button_progress);
        AbstractC56952jT.A01(A0T);
    }
}
