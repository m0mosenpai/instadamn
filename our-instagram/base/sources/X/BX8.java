package X;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class BX8 implements TextWatcher {
    public TextWatcher A00;
    public boolean A01;
    public final List A02 = AbstractC166987dD.A1E();

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (!this.A01) {
            this.A01 = true;
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).afterTextChanged(editable);
            }
            TextWatcher textWatcher = this.A00;
            if (textWatcher != null) {
                textWatcher.afterTextChanged(editable);
            }
            this.A01 = false;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.A01) {
            this.A01 = true;
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).beforeTextChanged(charSequence, i, i2, i3);
            }
            TextWatcher textWatcher = this.A00;
            if (textWatcher != null) {
                textWatcher.beforeTextChanged(charSequence, i, i2, i3);
            }
            this.A01 = false;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.A01) {
            this.A01 = true;
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).onTextChanged(charSequence, i, i2, i3);
            }
            TextWatcher textWatcher = this.A00;
            if (textWatcher != null) {
                textWatcher.onTextChanged(charSequence, i, i2, i3);
            }
            this.A01 = false;
        }
    }
}
