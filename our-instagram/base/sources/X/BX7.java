package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import com.facebook.primitive.textinput.TextInputView;

/* loaded from: classes5.dex */
public final class BX7 {
    public KeyListener A00;
    public BX8 A01 = new BX8();
    public TextInputView A02;
    public C44246Jgq A03;
    public CharSequence A04;
    public CharSequence A05;
    public C09530e4 A06;

    public final void A01() {
        String str = null;
        AbstractC79383gk.A02(null);
        TextInputView textInputView = this.A02;
        if (textInputView == null) {
            str = "";
        } else {
            Editable text = textInputView.getText();
            if (text != null) {
                text.clear();
            }
        }
        this.A04 = str;
    }

    public final void A02() {
        AbstractC79383gk.A02(null);
        TextInputView textInputView = this.A02;
        if (textInputView != null) {
            textInputView.clearFocus();
            new C03U(textInputView).A00.A01();
        }
    }

    public final void A03() {
        AbstractC79383gk.A02(null);
        TextInputView textInputView = this.A02;
        if (textInputView != null && textInputView.requestFocus()) {
            new C03U(textInputView).A00.A02();
        }
    }

    public final void A04(TextWatcher textWatcher) {
        AbstractC79383gk.A02(null);
        this.A01.A02.add(textWatcher);
    }

    public final void A05(TextWatcher textWatcher) {
        AbstractC79383gk.A02(null);
        this.A01.A02.remove(textWatcher);
    }

    public final void A06(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        boolean z = true;
        AbstractC79383gk.A02(null);
        TextInputView textInputView = this.A02;
        this.A04 = null;
        if (textInputView == null) {
            this.A04 = charSequence;
            return;
        }
        int length = textInputView.getText().length() - textInputView.getSelectionEnd();
        if (textInputView.getSelectionEnd() != 0) {
            z = false;
        }
        textInputView.setText(charSequence);
        if (z) {
            return;
        }
        int length2 = charSequence.length();
        int length3 = charSequence.length();
        if (length2 >= length) {
            length3 -= length;
        }
        textInputView.setSelection(length3);
    }

    public final CharSequence A00() {
        CharSequence charSequence;
        TextInputView textInputView = this.A02;
        if (textInputView == null || (charSequence = textInputView.getText()) == null) {
            CharSequence charSequence2 = this.A05;
            if (charSequence2 != null) {
                return charSequence2;
            }
            charSequence = "";
        }
        return charSequence;
    }
}
