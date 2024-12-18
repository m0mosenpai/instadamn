package X;

import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.KeyListener;
import com.facebook.primitive.textinput.TextInputView;

/* loaded from: classes5.dex */
public final class BXE {
    public static final boolean A02(int i) {
        int i2 = i & 4095;
        return i2 == 129 || i2 == 225 || i2 == 18 || i2 == 145;
    }

    public static final boolean A03(TextInputView textInputView) {
        Editable text = textInputView.getText();
        if (text == null) {
            return false;
        }
        Rect rect = new Rect();
        textInputView.getPaint().getTextBounds(text.toString(), 0, text.length(), rect);
        if (rect.width() <= (textInputView.getWidth() - textInputView.getPaddingLeft()) - textInputView.getPaddingRight()) {
            return false;
        }
        return true;
    }

    public static final boolean A01() {
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        return true;
    }

    public static final void A00(TextUtils.TruncateAt truncateAt, BX7 bx7, TextInputView textInputView) {
        if (textInputView.getEllipsize() != truncateAt) {
            KeyListener keyListener = textInputView.getKeyListener();
            if (keyListener == null) {
                C44246Jgq c44246Jgq = bx7.A03;
                if (c44246Jgq != null) {
                    keyListener = c44246Jgq.A0H;
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            bx7.A00 = keyListener;
            textInputView.setKeyListener(null);
            textInputView.setEllipsize(truncateAt);
        }
    }

    public final boolean A04(TextInputView textInputView) {
        Editable text = textInputView.getText();
        if (text == null || text.length() == 0 || textInputView.getWidth() == 0 || textInputView.getLineCount() > 1 || (textInputView.getInputType() & 131087) == 131073 || A02(textInputView.getInputType())) {
            return false;
        }
        return true;
    }
}
