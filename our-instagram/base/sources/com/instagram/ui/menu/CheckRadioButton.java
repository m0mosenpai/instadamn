package com.instagram.ui.menu;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25231BEo;
import X.AbstractC53242c7;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsRadioButton;

/* loaded from: classes6.dex */
public class CheckRadioButton extends IgdsRadioButton {
    public Drawable A00;

    public CheckRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        Context context = getContext();
        Drawable drawable = context.getDrawable(R.drawable.instagram_circle_check_pano_filled_24);
        this.A00 = drawable;
        AbstractC25231BEo.A0x(context, drawable.mutate(), R.color.badge_color);
        setCompoundDrawablePadding(AbstractC167017dG.A05(context));
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        int A07;
        Drawable drawable;
        super.setChecked(z);
        Context context = getContext();
        if (z) {
            A07 = R.color.badge_color;
        } else {
            A07 = AbstractC53242c7.A07(context);
        }
        AbstractC166987dD.A1O(context, this, A07);
        Drawable[] compoundDrawables = getCompoundDrawables();
        Drawable drawable2 = compoundDrawables[0];
        Drawable drawable3 = compoundDrawables[1];
        if (z) {
            drawable = this.A00;
        } else {
            drawable = null;
        }
        setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable3, drawable, compoundDrawables[3]);
    }

    public CheckRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public CheckRadioButton(Context context) {
        super(context);
        A00();
    }
}
