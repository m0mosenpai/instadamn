package X;

import android.text.Editable;
import android.widget.EditText;

/* renamed from: X.9qI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221539qI extends WKa {
    public String A00;
    public int A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final EditText A05;

    public C221539qI(EditText editText) {
        C14360o3.A0B(editText, 1);
        this.A05 = editText;
        this.A04 = 3;
        this.A00 = "";
        this.A02 = "";
    }

    public final void A00(String str) {
        C14360o3.A0B(str, 0);
        String str2 = this.A00;
        this.A00 = str;
        EditText editText = this.A05;
        String A0g = AbstractC167007dF.A0g(editText);
        int length = A0g.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A19 = AbstractC167027dH.A19(A0g, i2);
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
        String obj = A0g.subSequence(i, length + 1).toString();
        if (obj == null || obj.length() == 0 || C14360o3.A0K(str2, obj)) {
            A01(this.A00);
            editText.setSelection(this.A00.length());
            Editable text = editText.getText();
            C14360o3.A0A(text);
            C4GL.A05(text, A6G.class);
            text.setSpan(new A6G(this.A00), 0, text.length(), 34);
        }
    }

    @Override // X.WKa, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C14360o3.A0B(editable, 0);
        if (C14360o3.A0K(editable.toString(), this.A00)) {
            this.A01 = this.A05.getLineCount();
        } else if (this.A03) {
            for (A6G a6g : (A6G[]) C4GL.A06(editable, A6G.class)) {
                int spanStart = editable.getSpanStart(a6g);
                int spanEnd = editable.getSpanEnd(a6g);
                String obj = editable.subSequence(spanStart, spanEnd).toString();
                String str = a6g.A00;
                if (AbstractC002300n.A0h(str, obj, false) && !C14360o3.A0K(str, obj)) {
                    editable.delete(spanStart, spanEnd);
                }
                editable.removeSpan(a6g);
            }
        }
        this.A03 = false;
        if (this.A05.getLineCount() > Math.max(this.A04, this.A01)) {
            editable.replace(0, editable.length(), this.A02);
        } else {
            this.A02 = editable.toString();
        }
    }

    @Override // X.WKa, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C14360o3.A0B(charSequence, 0);
        this.A03 = C14360o3.A0K(charSequence.toString(), this.A00);
    }

    public final void A01(String str) {
        Editable text = this.A05.getText();
        text.replace(0, text.length(), str);
    }
}
