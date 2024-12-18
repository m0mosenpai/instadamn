package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.CjO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28583CjO implements TextWatcher {
    public int A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final CSS A05;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        CSS css;
        EditText editText;
        int i;
        Number valueOf;
        C14360o3.A0B(editable, 0);
        if (!this.A04 && editable.length() > 0 && (editText = (css = this.A05).A03) != null) {
            this.A04 = true;
            if (this.A03) {
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
            if (css.A03 != null) {
                String A00 = new C11L("\\D").A00(editable.toString(), "");
                while (true) {
                    i = 1;
                    if (A00.charAt(0) != '0' || A00.length() <= 1) {
                        break;
                    }
                    A00 = A00.substring(1);
                    C14360o3.A07(A00);
                }
                if (A00.length() == 0) {
                    valueOf = 0;
                } else {
                    valueOf = Double.valueOf(Double.parseDouble(A00));
                }
                Number number = valueOf;
                if (number.doubleValue() >= 1.0E17d) {
                    EditText editText2 = css.A03;
                    C14360o3.A0A(editText2);
                    editText2.setSelection(0);
                    EditText editText3 = css.A03;
                    C14360o3.A0A(editText3);
                    editText3.setText(this.A01);
                    EditText editText4 = css.A03;
                    C14360o3.A0A(editText4);
                    editText4.setSelection(this.A01.length() - this.A00);
                } else if (number.doubleValue() >= 0.0d) {
                    NumberFormat numberFormat = css.A04;
                    if (numberFormat == null) {
                        EditText editText5 = css.A03;
                        C14360o3.A0A(editText5);
                        Locale locale = AbstractC25228BEl.A0M(editText5).getConfiguration().locale;
                        C14360o3.A0A(locale);
                        numberFormat = AbstractC68395VPd.A00(locale);
                        css.A04 = numberFormat;
                    }
                    C14360o3.A0A(numberFormat);
                    String format = numberFormat.format(number);
                    EditText editText6 = css.A03;
                    C14360o3.A0A(editText6);
                    editText6.setSelection(0);
                    EditText editText7 = css.A03;
                    C14360o3.A0A(editText7);
                    editText7.setText(format);
                    if (number.doubleValue() != 0.0d) {
                        boolean z = this.A02;
                        Pattern pattern = AbstractC13670mt.A00;
                        if (z) {
                            if (format != null) {
                                for (int length = format.length() - 1; -1 < length; length--) {
                                    if (Character.isDigit(format.charAt(length))) {
                                        i = length + 1;
                                        break;
                                    }
                                }
                            }
                            i = 0;
                        } else {
                            i = AbstractC167007dF.A0A(format) - this.A00;
                        }
                    }
                    EditText editText8 = css.A03;
                    C14360o3.A0A(editText8);
                    int max = Math.max(i, 0);
                    EditText editText9 = css.A03;
                    C14360o3.A0A(editText9);
                    editText8.setSelection(Math.min(max, editText9.getText().length()));
                    EditText editText10 = css.A03;
                    C14360o3.A0A(editText10);
                    css.A01 = editText10.getSelectionStart();
                    EditText editText11 = css.A03;
                    C14360o3.A0A(editText11);
                    css.A00 = editText11.getSelectionEnd();
                } else {
                    editable.clear();
                    css.A01 = 0;
                    css.A00 = 0;
                }
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
        throw new UnsupportedOperationException("Method not decompiled: X.C28583CjO.beforeTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C28583CjO(C6FG c6fg, C102884kP c102884kP) {
        CSS css = (CSS) AnonymousClass634.A06(c6fg, c102884kP);
        if (css != null) {
            this.A05 = css;
            this.A01 = "";
            return;
        }
        throw AbstractC166987dD.A14("Extension mapper missing for 13713");
    }
}
