package com.instagram.igds.components.button;

import X.AbstractC53182c0;
import X.C14360o3;
import X.InterfaceC85983sV;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.R;
import com.instagram.common.ui.base.IgRadioButton;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* loaded from: classes6.dex */
public class IgdsRadioButton extends IgRadioButton implements InterfaceC85983sV {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
    }

    @Override // com.instagram.common.ui.base.IgRadioButton
    public final void A01() {
        if (this.A00) {
            super.setBackground(null);
            super.setButtonDrawable((Drawable) null);
            Context context = getContext();
            boolean A01 = AbstractC53182c0.A01(true);
            int i = R.drawable.prism_radio_button_state_selector;
            if (A01) {
                i = R.drawable.prism_radio_button_state_selector_ax_fix;
            }
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, context.getDrawable(i), (Drawable) null);
        }
    }

    @Override // android.view.View
    @Deprecated(message = "Background is set by IGDSRadioButton and should not be changed", replaceWith = @ReplaceWith(expression = "Unit", imports = {}))
    public void setBackground(Drawable drawable) {
        if (!this.A00) {
            super.setBackground(drawable);
        }
    }

    @Override // android.widget.CompoundButton
    @Deprecated(message = "Button Drawable is set by IGDSRadioButton and should not be changed", replaceWith = @ReplaceWith(expression = "Unit", imports = {}))
    public void setButtonDrawable(int i) {
        if (!this.A00) {
            super.setButtonDrawable(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
    }

    @Override // android.widget.CompoundButton
    @Deprecated(message = "Button Drawable is set by IGDSRadioButton and should not be changed", replaceWith = @ReplaceWith(expression = "Unit", imports = {}))
    public void setButtonDrawable(Drawable drawable) {
        if (!this.A00) {
            super.setButtonDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsRadioButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsRadioButton(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
    }
}
