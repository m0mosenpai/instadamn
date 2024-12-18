package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: classes9.dex */
public final class Oi8 implements TextWatcher {
    public String A00;
    public final /* synthetic */ EditText A01;
    public final /* synthetic */ InterfaceC57919PmP A02;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C14360o3.A0B(editable, 0);
        String str = this.A00;
        if (str != null) {
            String obj = editable.toString();
            int length = obj.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                int i2 = length;
                if (!z) {
                    i2 = i;
                }
                boolean A19 = AbstractC167027dH.A19(obj, i2);
                if (!z) {
                    if (!A19) {
                        z = true;
                    } else {
                        i++;
                    }
                } else if (!A19) {
                    break;
                } else {
                    length--;
                }
            }
            String A0g = AbstractC31177DnL.A0g(obj, length, i);
            if (!str.equals(A0g)) {
                if (Character.codePointCount(A0g, 0, A0g.length()) > 16) {
                    EditText editText = this.A01;
                    editText.setText(str);
                    AbstractC167017dG.A18(editText);
                } else {
                    str = A0g;
                }
                InterfaceC57919PmP interfaceC57919PmP = this.A02;
                if (interfaceC57919PmP != null) {
                    interfaceC57919PmP.AB2(str);
                    return;
                }
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C14360o3.A0B(charSequence, 0);
        this.A00 = charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public Oi8(EditText editText, InterfaceC57919PmP interfaceC57919PmP) {
        this.A01 = editText;
        this.A02 = interfaceC57919PmP;
    }
}
