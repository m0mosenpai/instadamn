package X;

import android.view.inputmethod.InputConnectionWrapper;

/* loaded from: classes11.dex */
public final class UB2 extends InputConnectionWrapper {
    public X9J A00;
    public UDV A01;
    public String A02;
    public boolean A03;

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.A03 = true;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        this.A03 = false;
        String str = this.A02;
        if (str != null) {
            A00(str);
            this.A02 = null;
        }
        return super.endBatchEdit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.Usn, X.Sb5] */
    private void A00(String str) {
        if (str.equals("\n")) {
            str = "Enter";
        }
        X9J x9j = this.A00;
        ?? sb5 = new Sb5(-1, this.A01.getId());
        sb5.A00 = str;
        x9j.APn(sb5);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        A00("Backspace");
        return super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        String str;
        UDV udv = this.A01;
        int selectionStart = udv.getSelectionStart();
        int selectionEnd = udv.getSelectionEnd();
        boolean composingText = super.setComposingText(charSequence, i);
        int selectionStart2 = udv.getSelectionStart();
        boolean A1P = AbstractC167007dF.A1P(selectionStart, selectionEnd);
        boolean A1P2 = AbstractC167007dF.A1P(selectionStart2, selectionStart);
        if (selectionStart2 < selectionStart || selectionStart2 <= 0 || (!A1P && A1P2)) {
            str = "Backspace";
        } else {
            str = String.valueOf(udv.getText().charAt(selectionStart2 - 1));
        }
        if (this.A03) {
            this.A02 = str;
            return composingText;
        }
        A00(str);
        return composingText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        String charSequence2 = charSequence.toString();
        if (charSequence2.length() <= 2) {
            if (charSequence2.equals("")) {
                charSequence2 = "Backspace";
            }
            if (this.A03) {
                this.A02 = charSequence2;
            } else {
                A00(charSequence2);
            }
        }
        return super.commitText(charSequence, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r4.getUnicodeChar() <= 47) goto L8;
     */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean sendKeyEvent(android.view.KeyEvent r4) {
        /*
            r3 = this;
            int r0 = r4.getAction()
            if (r0 != 0) goto L25
            int r1 = r4.getUnicodeChar()
            r0 = 58
            if (r1 >= r0) goto L17
            int r1 = r4.getUnicodeChar()
            r0 = 47
            r2 = 1
            if (r1 > r0) goto L18
        L17:
            r2 = 0
        L18:
            int r1 = r4.getKeyCode()
            r0 = 67
            if (r1 != r0) goto L2a
            java.lang.String r0 = "Backspace"
        L22:
            r3.A00(r0)
        L25:
            boolean r0 = super.sendKeyEvent(r4)
            return r0
        L2a:
            int r1 = r4.getKeyCode()
            r0 = 66
            if (r1 != r0) goto L35
            java.lang.String r0 = "Enter"
            goto L22
        L35:
            if (r2 == 0) goto L25
            char r0 = r4.getNumber()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UB2.sendKeyEvent(android.view.KeyEvent):boolean");
    }
}
