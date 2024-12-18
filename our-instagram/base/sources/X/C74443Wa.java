package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* renamed from: X.3Wa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C74443Wa extends EditText implements C03N {
    public C68648VZg A00;
    public final C3WT A01;
    public final SPY A02;
    public final C3Wb A03;
    public final C3WU A04;
    public final C63595Sq2 A05;

    private C68648VZg getSuperCaller() {
        C68648VZg c68648VZg = this.A00;
        if (c68648VZg == null) {
            C68648VZg c68648VZg2 = new C68648VZg(this);
            this.A00 = c68648VZg2;
            return c68648VZg2;
        }
        return c68648VZg;
    }

    @Override // X.C03N
    public final C006302d DdA(C006302d c006302d) {
        return this.A05.Dd9(this, c006302d);
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
        C69182VjB c69182VjB = this.A04.A08;
        if (c69182VjB != null) {
            return c69182VjB.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C69182VjB c69182VjB = this.A04.A08;
        if (c69182VjB != null) {
            return c69182VjB.A01;
        }
        return null;
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.A02.A03(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.A02.A00(keyListener));
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
        C3WU c3wu = this.A04;
        c3wu.A06(colorStateList);
        c3wu.A04();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C3WU c3wu = this.A04;
        c3wu.A07(mode);
        c3wu.A04();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.3Wb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.Sq2, java.lang.Object] */
    public C74443Wa(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getResources();
        context.getResources();
        C3WR.A03(this, getContext());
        C3WT c3wt = new C3WT(this);
        this.A01 = c3wt;
        c3wt.A07(attributeSet, i);
        C3WU c3wu = new C3WU(this);
        this.A04 = c3wu;
        c3wu.A08(attributeSet, i);
        c3wu.A04();
        ?? obj = new Object();
        obj.A00 = this;
        this.A03 = obj;
        this.A05 = new Object();
        SPY spy = new SPY(this);
        this.A02 = spy;
        spy.A02(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener A00 = spy.A00(keyListener);
            if (A00 != keyListener) {
                super.setKeyListener(A00);
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
        C3WT c3wt = this.A01;
        if (c3wt != null) {
            c3wt.A02();
        }
        C3WU c3wu = this.A04;
        if (c3wu != null) {
            c3wu.A04();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] A0M;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C3WU.A03(editorInfo, onCreateInputConnection, this);
        VKN.A00(this, editorInfo, onCreateInputConnection);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (A0M = AbstractC010103p.A0M(this)) != null) {
            editorInfo.contentMimeTypes = A0M;
            onCreateInputConnection = new C05L(onCreateInputConnection, new C14560oU(this));
        }
        return this.A02.A01(editorInfo, onCreateInputConnection);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        int A06 = C0f9.A06(338090376);
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i < 33) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
        C0f9.A0D(-684443196, A06);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        if (SQL.A00(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (SQL.A01(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
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
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3WU c3wu = this.A04;
        if (c3wu != null) {
            c3wu.A04();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3WU c3wu = this.A04;
        if (c3wu != null) {
            c3wu.A04();
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C3WU c3wu = this.A04;
        if (c3wu != null) {
            c3wu.A05(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }
}
