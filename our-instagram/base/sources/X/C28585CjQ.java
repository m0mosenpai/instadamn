package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.ArrayList;

/* renamed from: X.CjQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28585CjQ implements TextWatcher {
    public EditText A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final ArrayList A04 = AbstractC166987dD.A1E();

    public C28585CjQ(String str) {
        this.A01 = str;
        A00(this);
        this.A00 = null;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C14360o3.A0B(editable, 0);
        EditText editText = this.A00;
        if (editText != null) {
            int selectionStart = editText.getSelectionStart();
            if (!this.A03 && !this.A02) {
                this.A02 = true;
            } else if (!this.A02) {
                this.A02 = true;
                if (this.A04.contains(Integer.valueOf(selectionStart))) {
                    while (true) {
                        if (selectionStart <= 0) {
                            break;
                        }
                        int i = selectionStart - 1;
                        if (this.A01.charAt(i) != '#') {
                            editable.delete(i, selectionStart);
                            selectionStart--;
                        } else {
                            editable.delete(i, selectionStart);
                            selectionStart = i;
                            break;
                        }
                    }
                }
            } else {
                return;
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            int length = editable.length();
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (Character.isDigit(editable.charAt(i3))) {
                    A1C.append(editable.charAt(i3));
                    if (i3 < selectionStart) {
                        i2++;
                    }
                }
            }
            StringBuilder A1C2 = AbstractC166987dD.A1C();
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i4 < A1C.length()) {
                String str = this.A01;
                if (i5 >= str.length()) {
                    break;
                }
                if (str.charAt(i5) == '#') {
                    A1C2.append(A1C.charAt(i4));
                    if (i4 < i2) {
                        i6++;
                    }
                    i4++;
                } else {
                    A1C2.append(this.A01.charAt(i5));
                    if (i4 <= i2) {
                        i6++;
                    }
                }
                i5++;
            }
            String substring = this.A01.substring(i5);
            C14360o3.A07(substring);
            int length2 = substring.length();
            if (length2 > 0 && !AbstractC001900j.A0a(substring, "#", false)) {
                A1C2.append(substring);
                if (i4 <= i2) {
                    i6 += length2;
                }
            }
            editText.setText(A1C2);
            editText.setSelection(i6);
            this.A02 = false;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void A00(C28585CjQ c28585CjQ) {
        int length = c28585CjQ.A01.length();
        for (int i = 0; i < length; i++) {
            if (c28585CjQ.A01.charAt(i) != '#') {
                AbstractC166997dE.A1W(c28585CjQ.A04, i);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A03 = AbstractC167007dF.A1Q(i3, i2);
    }
}
