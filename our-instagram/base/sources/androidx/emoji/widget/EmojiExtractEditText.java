package androidx.emoji.widget;

import X.AbstractC62291S5m;
import X.C02R;
import X.C58711Q4b;
import X.C62892SVx;
import X.C63485Snz;
import X.SFI;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.inputmethodservice.ExtractEditText;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* loaded from: classes10.dex */
public class EmojiExtractEditText extends ExtractEditText {
    public SFI A00;
    public boolean A01;

    private void A00(AttributeSet attributeSet, int i, int i2) {
        if (!this.A01) {
            this.A01 = true;
            int i3 = 0;
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC62291S5m.A00, i, i2);
                i3 = obtainStyledAttributes.getInteger(0, Integer.MAX_VALUE);
                obtainStyledAttributes.recycle();
            }
            setMaxEmojiCount(i3);
            setKeyListener(super.getKeyListener());
        }
    }

    private SFI getEmojiEditTextHelper() {
        SFI sfi = this.A00;
        if (sfi == null) {
            SFI sfi2 = new SFI(this);
            this.A00 = sfi2;
            return sfi2;
        }
        return sfi;
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            getEmojiEditTextHelper();
            if (!(keyListener instanceof C63485Snz)) {
                keyListener = new C63485Snz(keyListener);
            }
        }
        super.setKeyListener(keyListener);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(attributeSet, R.attr.editTextStyle, 0);
    }

    public int getEmojiReplaceStrategy() {
        return getEmojiEditTextHelper().A00;
    }

    public int getMaxEmojiCount() {
        return getEmojiEditTextHelper().A01;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        SFI emojiEditTextHelper = getEmojiEditTextHelper();
        if (onCreateInputConnection == null) {
            return null;
        }
        C62892SVx c62892SVx = emojiEditTextHelper.A02;
        if (onCreateInputConnection instanceof C58711Q4b) {
            return onCreateInputConnection;
        }
        return new C58711Q4b(editorInfo, onCreateInputConnection, c62892SVx.A00);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiReplaceStrategy(int i) {
        SFI emojiEditTextHelper = getEmojiEditTextHelper();
        emojiEditTextHelper.A00 = i;
        emojiEditTextHelper.A02.A01.A00 = i;
    }

    public void setMaxEmojiCount(int i) {
        SFI emojiEditTextHelper = getEmojiEditTextHelper();
        C02R.A02(i, "maxEmojiCount should be greater than 0");
        emojiEditTextHelper.A01 = i;
        emojiEditTextHelper.A02.A01.A01 = i;
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(attributeSet, i, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00(attributeSet, i, i2);
    }

    public EmojiExtractEditText(Context context) {
        super(context);
        A00(null, 0, 0);
    }
}
