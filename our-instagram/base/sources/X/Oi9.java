package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;

/* loaded from: classes9.dex */
public final class Oi9 implements TextWatcher {
    public boolean A00 = false;
    public boolean A01 = false;
    public final O2J A02;
    public final InterfaceC190488c6 A03;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z = this.A00;
        if (z && this.A01) {
            return;
        }
        IgAutoCompleteTextView igAutoCompleteTextView = this.A02.A00.A07;
        if (igAutoCompleteTextView == null) {
            C14360o3.A0F("editText");
            throw C00O.createAndThrow();
        }
        if (!z && C7OR.A04(igAutoCompleteTextView, igAutoCompleteTextView.A05, 1, false)) {
            this.A03.Cle();
            this.A00 = true;
        }
        if (this.A01) {
            return;
        }
        String A03 = C7OR.A03(igAutoCompleteTextView, igAutoCompleteTextView.A05, false);
        if (TextUtils.isEmpty(A03) || A03.length() <= 1) {
            return;
        }
        this.A03.Clg();
        this.A01 = true;
    }

    public Oi9(O2J o2j, InterfaceC190488c6 interfaceC190488c6) {
        this.A02 = o2j;
        this.A03 = interfaceC190488c6;
    }
}
