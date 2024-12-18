package X;

import android.text.Editable;
import com.facebook.primitive.textinput.TextInputView;

/* loaded from: classes5.dex */
public abstract class CC0 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        BX7 bx7;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP = (C102884kP) A03;
        Object A02 = c6fw.A02();
        AbstractC25225BEi.A1S(A02);
        String str = (String) A02;
        C6FG c6fg = c6fq.A03;
        if (c6fg != null && (bx7 = (BX7) AnonymousClass634.A06(c6fg, c102884kP)) != null) {
            C14360o3.A0B(str, 0);
            AbstractC79383gk.A02(null);
            TextInputView textInputView = bx7.A02;
            if (textInputView != null) {
                int selectionStart = textInputView.getSelectionStart();
                int selectionEnd = textInputView.getSelectionEnd();
                Editable text = textInputView.getText();
                if (selectionStart != selectionEnd) {
                    text.replace(selectionStart, selectionEnd, str);
                } else {
                    text.insert(selectionStart, str);
                }
                textInputView.setText(text);
                textInputView.setSelection(selectionStart + str.length());
                return null;
            }
            return null;
        }
        return null;
    }
}
