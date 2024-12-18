package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.ArrayList;

/* renamed from: X.CjM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28581CjM implements TextWatcher {
    public boolean A00;
    public boolean A01;
    public final String A02;
    public final ArrayList A03 = AbstractC166987dD.A1E();
    public final EditText A04;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C14360o3.A0B(editable, 0);
        EditText editText = this.A04;
        int selectionStart = editText.getSelectionStart();
        if (!this.A01) {
            this.A01 = true;
            if (this.A00 && this.A03.contains(Integer.valueOf(selectionStart))) {
                while (true) {
                    if (selectionStart <= 0) {
                        break;
                    }
                    int i = selectionStart - 1;
                    if (this.A02.charAt(i) != '#') {
                        editable.delete(i, selectionStart);
                        selectionStart--;
                    } else {
                        editable.delete(i, selectionStart);
                        selectionStart = i;
                        break;
                    }
                }
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
                String str = this.A02;
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
                    A1C2.append(str.charAt(i5));
                    if (i4 <= i2) {
                        i6++;
                    }
                }
                i5++;
            }
            String substring = this.A02.substring(i5);
            C14360o3.A07(substring);
            int length2 = substring.length();
            if (length2 > 0 && !AbstractC001900j.A0a(substring, String.valueOf('#'), false)) {
                A1C2.append(substring);
                if (i4 <= i2) {
                    i6 += length2;
                }
            }
            editable.replace(0, editable.length(), A1C2);
            editText.setSelection(i6);
            this.A01 = false;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C28581CjM(EditText editText, String str) {
        this.A04 = editText;
        this.A02 = str;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != '#') {
                AbstractC166997dE.A1W(this.A03, i);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A00 = AbstractC167007dF.A1Q(i3, i2);
    }
}
