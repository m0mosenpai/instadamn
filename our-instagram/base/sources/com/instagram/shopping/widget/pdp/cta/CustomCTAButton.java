package com.instagram.shopping.widget.pdp.cta;

import X.AbstractC99734dr;
import X.C14360o3;
import X.EnumC99704do;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes2.dex */
public final class CustomCTAButton extends IgdsButton {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomCTAButton(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
    }

    public final void setCustomRenderer(AbstractC99734dr abstractC99734dr) {
        C14360o3.A0B(abstractC99734dr, 0);
        this.A01 = abstractC99734dr;
        setStyle(EnumC99704do.A08);
        A01();
    }

    public final int getCalculatedTextWidth() {
        TextView textView = this.A0A;
        CharSequence text = textView.getText();
        if (text == null) {
            return 0;
        }
        return (int) textView.getPaint().measureText(text.toString());
    }

    public final void setTextScale(float f) {
        TextView textView = this.A0A;
        textView.setScaleX(f);
        textView.setScaleY(f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomCTAButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(attributeSet, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomCTAButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(attributeSet, 2);
    }
}
