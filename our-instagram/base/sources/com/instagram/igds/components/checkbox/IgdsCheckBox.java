package com.instagram.igds.components.checkbox;

import X.AbstractC53182c0;
import X.C14360o3;
import X.InterfaceC85983sV;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.R;
import com.instagram.common.ui.base.IgCheckBox;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* loaded from: classes6.dex */
public class IgdsCheckBox extends IgCheckBox implements InterfaceC85983sV {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
    }

    @Override // com.instagram.common.ui.base.IgCheckBox
    public final void A01() {
        if (this.A00) {
            Context context = getContext();
            boolean A01 = AbstractC53182c0.A01(true);
            int i = R.drawable.prism_checkbox_state_selector;
            if (A01) {
                i = R.drawable.prism_checkbox_state_selector_ax_fix;
            }
            Drawable drawable = context.getDrawable(i);
            if (drawable != null) {
                super.setBackground(drawable);
            }
        }
    }

    @Override // android.view.View
    @Deprecated(message = "Background is set by IGDSCheckbox and should not be changed", replaceWith = @ReplaceWith(expression = "Unit", imports = {}))
    public void setBackground(Drawable drawable) {
        if (!this.A00) {
            super.setBackground(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsCheckBox(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsCheckBox(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
    }
}
