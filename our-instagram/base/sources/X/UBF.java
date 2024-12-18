package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* loaded from: classes11.dex */
public class UBF extends Button {
    public C3WJ A00;
    public final C3WT A01;
    public final C3WU A02;

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

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

    public void setSupportAllCaps(boolean z) {
        C3WU c3wu = this.A02;
        if (c3wu != null) {
            c3wu.A0B.setAllCaps(z);
        }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UBF(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getResources();
        context.getResources();
        C3WR.A03(this, getContext());
        C3WT c3wt = new C3WT(this);
        this.A01 = c3wt;
        c3wt.A07(attributeSet, i);
        C3WU c3wu = new C3WU(this);
        this.A02 = c3wu;
        c3wu.A08(attributeSet, i);
        c3wu.A04();
        getEmojiTextViewHelper().A00(attributeSet, i);
    }

    @Override // android.widget.TextView, android.view.View
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
    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().A01(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    @Override // android.view.View
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().A02(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().A00.A00.A04(inputFilterArr));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C3WU c3wu = this.A02;
        if (c3wu != null) {
            c3wu.A05(context, i);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
