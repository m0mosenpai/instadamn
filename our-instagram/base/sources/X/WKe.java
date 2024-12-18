package X;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: classes11.dex */
public final class WKe implements TextWatcher {
    public EditText A00;
    public C6FG A01;
    public C102884kP A02;
    public InterfaceC103384lE A03;
    public boolean A04;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C14360o3.A0B(editable, 0);
        if (!this.A04) {
            this.A04 = true;
            if (this.A02 != null && this.A00 != null && this.A03 != null && this.A01 != null) {
                String obj = editable.toString();
                C102884kP c102884kP = this.A02;
                InterfaceC103384lE interfaceC103384lE = this.A03;
                String str = (String) C131845xK.A00(C6FQ.A01(this.A01, interfaceC103384lE, c102884kP.A0A), AbstractC58320PtC.A0g(obj), interfaceC103384lE);
                if (str != null) {
                    if (!C14360o3.A0K(obj, str)) {
                        InputFilter[] filters = editable.getFilters();
                        editable.setFilters(new InputFilter[0]);
                        editable.replace(0, editable.length(), str);
                        editable.setFilters(filters);
                        EditText editText = this.A00;
                        C14360o3.A0A(editText);
                        editText.setSelection(editable.length());
                    }
                } else {
                    AbstractC25241Le.A00(this.A01, "ExpressionMask", "Format expression returned null. Ignoring.", null);
                }
            }
            this.A04 = false;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
