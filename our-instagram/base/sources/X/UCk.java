package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* loaded from: classes11.dex */
public final class UCk extends MultiAutoCompleteTextView {
    public static final int[] A03 = {R.attr.popupBackground};
    public final C3WT A00;
    public final SPY A01;
    public final C3WU A02;

    public ColorStateList getSupportBackgroundTintList() {
        C3WT c3wt = this.A00;
        if (c3wt != null) {
            return c3wt.A00();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3WT c3wt = this.A00;
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

    public void setEmojiCompatEnabled(boolean z) {
        this.A01.A03(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.A01.A00(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3WT c3wt = this.A00;
        if (c3wt != null) {
            c3wt.A05(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3WT c3wt = this.A00;
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
    public UCk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.facebook.R.attr.autoCompleteTextViewStyle);
        context.getResources();
        context.getResources();
        Context context2 = getContext();
        C3WR.A03(this, context2);
        C53122bu A00 = C53122bu.A00(context2, attributeSet, A03, com.facebook.R.attr.autoCompleteTextViewStyle, 0);
        TypedArray typedArray = A00.A02;
        if (typedArray.hasValue(0)) {
            setDropDownBackgroundDrawable(A00.A02(0));
        }
        typedArray.recycle();
        C3WT c3wt = new C3WT(this);
        this.A00 = c3wt;
        c3wt.A07(attributeSet, com.facebook.R.attr.autoCompleteTextViewStyle);
        C3WU c3wu = new C3WU(this);
        this.A02 = c3wu;
        c3wu.A08(attributeSet, com.facebook.R.attr.autoCompleteTextViewStyle);
        c3wu.A04();
        SPY spy = new SPY(this);
        this.A01 = spy;
        spy.A02(attributeSet, com.facebook.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener A002 = spy.A00(keyListener);
            if (A002 != keyListener) {
                super.setKeyListener(A002);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C3WT c3wt = this.A00;
        if (c3wt != null) {
            c3wt.A02();
        }
        C3WU c3wu = this.A02;
        if (c3wu != null) {
            c3wu.A04();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        VKN.A00(this, editorInfo, onCreateInputConnection);
        return this.A01.A01(editorInfo, onCreateInputConnection);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3WT c3wt = this.A00;
        if (c3wt != null) {
            c3wt.A03();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3WT c3wt = this.A00;
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

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C71x.A00(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C3WU c3wu = this.A02;
        if (c3wu != null) {
            c3wu.A05(context, i);
        }
    }
}
