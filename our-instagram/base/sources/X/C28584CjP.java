package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.facebook.primitive.textinput.TextInputView;

/* renamed from: X.CjP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28584CjP implements TextWatcher {
    public int A00;
    public final TextInputView A01;
    public final InterfaceC16620sF A02;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void A00(C28584CjP c28584CjP) {
        TextInputView textInputView = c28584CjP.A01;
        int lineCount = textInputView.getLineCount();
        int i = c28584CjP.A00;
        if (lineCount != i) {
            AbstractC25227BEk.A1P(Integer.valueOf(i), c28584CjP.A02, textInputView.getLineCount());
            c28584CjP.A00 = textInputView.getLineCount();
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputView textInputView = this.A01;
        if (textInputView.getLayout() == null) {
            textInputView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC28670ClI(this, 1));
        } else {
            A00(this);
        }
    }

    public C28584CjP(TextInputView textInputView, InterfaceC16620sF interfaceC16620sF) {
        this.A01 = textInputView;
        this.A02 = interfaceC16620sF;
        this.A00 = textInputView.getLineCount();
    }
}
