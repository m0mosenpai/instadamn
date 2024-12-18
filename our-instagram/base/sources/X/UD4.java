package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* loaded from: classes11.dex */
public final class UD4 extends ToggleButton {
    public C3WJ A00;
    public final C3WT A01;
    public final C3WU A02;

    private C3WJ getEmojiTextViewHelper() {
        C3WJ c3wj = this.A00;
        if (c3wj == null) {
            C3WJ c3wj2 = new C3WJ(this);
            this.A00 = c3wj2;
            return c3wj2;
        }
        return c3wj;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3WT c3wt = this.A01;
        if (c3wt != null) {
            return c3wt.A00();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3WT c3wt = this.A01;
        if (c3wt != null) {
            return c3wt.A01();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C69182VjB c69182VjB = this.A02.A08;
        if (c69182VjB != null) {
            return c69182VjB.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C69182VjB c69182VjB = this.A02.A08;
        if (c69182VjB != null) {
            return c69182VjB.A01;
        }
        return null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3WT c3wt = this.A01;
        if (c3wt != null) {
            c3wt.A05(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3WT c3wt = this.A01;
        if (c3wt != null) {
            c3wt.A06(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C3WU c3wu = this.A02;
        c3wu.A06(colorStateList);
        c3wu.A04();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C3WU c3wu = this.A02;
        c3wu.A07(mode);
        c3wu.A04();
    }

    public UD4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        C3WR.A03(this, getContext());
        C3WT c3wt = new C3WT(this);
        this.A01 = c3wt;
        c3wt.A07(attributeSet, R.attr.buttonStyleToggle);
        C3WU c3wu = new C3WU(this);
        this.A02 = c3wu;
        c3wu.A08(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().A00(attributeSet, R.attr.buttonStyleToggle);
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C3WT c3wt = this.A01;
        if (c3wt != null) {
            c3wt.A02();
        }
        C3WU c3wu = this.A02;
        if (c3wu != null) {
            c3wu.A04();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().A01(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3WT c3wt = this.A01;
        if (c3wt != null) {
            c3wt.A03();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3WT c3wt = this.A01;
        if (c3wt != null) {
            c3wt.A04(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3WU c3wu = this.A02;
        if (c3wu != null) {
            c3wu.A04();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3WU c3wu = this.A02;
        if (c3wu != null) {
            c3wu.A04();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().A02(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().A00.A00.A04(inputFilterArr));
    }
}
