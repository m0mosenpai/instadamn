package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.text.NumberFormat;
import java.util.regex.Pattern;

/* renamed from: X.CjN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28582CjN implements TextWatcher {
    public int A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final CSR A05;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i;
        CSR csr;
        EditText editText;
        C14360o3.A0B(editable, 0);
        if (!this.A04) {
            this.A04 = true;
            if (this.A03 && (csr = this.A05) != null && (editText = csr.A03) != null) {
                int selectionStart = editText.getSelectionStart();
                while (true) {
                    if (selectionStart <= 0) {
                        break;
                    }
                    int i2 = selectionStart - 1;
                    if (!Character.isDigit(editable.charAt(i2))) {
                        editable.delete(i2, selectionStart);
                        selectionStart = i2;
                    } else {
                        editable.delete(i2, selectionStart);
                        break;
                    }
                }
            }
            String str = "";
            String A00 = new C11L("\\D").A00(editable.toString(), "");
            Number number = 0;
            if (A00.length() > 0) {
                number = Double.valueOf(Double.parseDouble(A00));
            }
            Number number2 = number;
            if (number2.doubleValue() >= 1.0E17d) {
                CSR csr2 = this.A05;
                EditText editText2 = csr2.A03;
                if (editText2 != null) {
                    editText2.setText(this.A01);
                }
                EditText editText3 = csr2.A03;
                if (editText3 != null) {
                    editText3.setSelection(this.A01.length() - this.A00);
                }
            } else if (number2.doubleValue() > 0.0d) {
                CSR csr3 = this.A05;
                NumberFormat numberFormat = csr3.A04;
                if (numberFormat != null) {
                    str = numberFormat.format(number);
                    EditText editText4 = csr3.A03;
                    if (editText4 != null) {
                        editText4.setText(str);
                    } else {
                        AbstractC25241Le.A02(AbstractC111324zv.A00(694), "EditText is null");
                    }
                }
                boolean z = this.A02;
                Pattern pattern = AbstractC13670mt.A00;
                int A0A = AbstractC167007dF.A0A(str);
                if (z) {
                    int i3 = A0A - 1;
                    while (true) {
                        if (-1 < i3) {
                            if (Character.isDigit(str.charAt(i3))) {
                                i = i3 + 1;
                                break;
                            }
                            i3--;
                        } else {
                            i = 0;
                            break;
                        }
                    }
                } else {
                    i = A0A - this.A00;
                }
                EditText editText5 = csr3.A03;
                if (editText5 != null) {
                    if (i < 0) {
                        i = 0;
                    }
                    editText5.setSelection(i);
                    csr3.A01 = editText5.getSelectionStart();
                    csr3.A00 = editText5.getSelectionEnd();
                }
            } else {
                editable.clear();
                CSR csr4 = this.A05;
                csr4.A01 = 0;
                csr4.A00 = 0;
            }
            this.A04 = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (java.lang.Character.isDigit(r4.charAt(r5)) != false) goto L11;
     */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void beforeTextChanged(java.lang.CharSequence r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            boolean r0 = r3.A04
            if (r0 != 0) goto L34
            java.lang.String r0 = r4.toString()
            r3.A01 = r0
            int r1 = r4.length()
            int r1 = r1 - r5
            r2 = 0
            r0 = 0
            if (r7 != 0) goto L18
            r0 = r6
        L18:
            int r1 = r1 - r0
            r3.A00 = r1
            if (r7 >= r6) goto L28
            char r0 = r4.charAt(r5)
            boolean r1 = java.lang.Character.isDigit(r0)
            r0 = 1
            if (r1 == 0) goto L29
        L28:
            r0 = 0
        L29:
            r3.A03 = r0
            int r0 = r4.length()
            if (r0 != 0) goto L32
            r2 = 1
        L32:
            r3.A02 = r2
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28582CjN.beforeTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C28582CjN(C6FG c6fg, C102884kP c102884kP) {
        Object A06 = AnonymousClass634.A06(c6fg, c102884kP);
        A06.getClass();
        this.A05 = (CSR) A06;
        this.A01 = "";
    }
}
