package X;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.Arrays;
import java.util.concurrent.locks.ReadWriteLock;

/* renamed from: X.Snv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63482Snv implements TextWatcher {
    public AbstractC61272Rki A02;
    public final EditText A03;
    public int A01 = Integer.MAX_VALUE;
    public int A00 = 0;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.A03;
        if (!editText.isInEditMode() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int A01 = C63218SfO.A00().A01();
            if (A01 != 0) {
                if (A01 != 1) {
                    if (A01 != 3) {
                        return;
                    }
                } else {
                    C63218SfO.A00().A03(charSequence, i, i + i3, this.A01, this.A00);
                    return;
                }
            }
            C63218SfO A00 = C63218SfO.A00();
            AbstractC61272Rki abstractC61272Rki = this.A02;
            if (abstractC61272Rki == null) {
                abstractC61272Rki = new Q7X(editText);
                this.A02 = abstractC61272Rki;
            }
            ReadWriteLock readWriteLock = A00.A05;
            readWriteLock.writeLock().lock();
            try {
                int i4 = A00.A00;
                if (i4 != 1 && i4 != 2) {
                    A00.A04.add(abstractC61272Rki);
                } else {
                    A00.A01.post(new TPM(null, Arrays.asList(abstractC61272Rki), i4));
                }
            } finally {
                AbstractC58318PtA.A1Y(readWriteLock);
            }
        }
    }

    public C63482Snv(EditText editText) {
        this.A03 = editText;
    }
}
