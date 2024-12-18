package X;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import com.facebook.primitive.textinput.TextInputView;

/* renamed from: X.Jgp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44245Jgp {
    public static final C44246Jgq A00(TextInputView textInputView) {
        Drawable drawable;
        if (Build.VERSION.SDK_INT >= 29) {
            drawable = textInputView.getTextCursorDrawable();
        } else {
            drawable = null;
        }
        float letterSpacing = textInputView.getLetterSpacing();
        boolean showSoftInputOnFocus = textInputView.getShowSoftInputOnFocus();
        int highlightColor = textInputView.getHighlightColor();
        Editable text = textInputView.getText();
        float textSize = textInputView.getTextSize();
        ColorStateList textColors = textInputView.getTextColors();
        CharSequence hint = textInputView.getHint();
        ColorStateList hintTextColors = textInputView.getHintTextColors();
        int gravity = textInputView.getGravity();
        Rect A0V = AbstractC166987dD.A0V(textInputView.getPaddingLeft(), textInputView.getPaddingTop(), textInputView.getPaddingRight(), textInputView.getPaddingBottom());
        C66248U5s c66248U5s = new C66248U5s(textInputView.getShadowDx(), textInputView.getShadowDy(), textInputView.getShadowRadius(), textInputView.getShadowColor(), 1);
        float lineSpacingExtra = textInputView.getLineSpacingExtra();
        float lineSpacingMultiplier = textInputView.getLineSpacingMultiplier();
        Drawable background = textInputView.getBackground();
        int imeOptions = textInputView.getImeOptions();
        int inputType = textInputView.getInputType();
        KeyListener keyListener = textInputView.getKeyListener();
        boolean A00 = textInputView.A00();
        return new C44246Jgq(textColors, hintTextColors, A0V, textInputView.getTypeface(), drawable, background, text, textInputView.getEllipsize(), keyListener, c66248U5s, hint, textSize, lineSpacingExtra, lineSpacingMultiplier, letterSpacing, highlightColor, gravity, imeOptions, inputType, textInputView.getMaxLines(), A00, showSoftInputOnFocus);
    }
}
