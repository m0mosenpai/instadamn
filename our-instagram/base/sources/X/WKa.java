package X;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.Iterator;

/* loaded from: classes11.dex */
public abstract class WKa implements TextWatcher {
    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this instanceof VBA) {
            C14360o3.A0B(charSequence, 0);
            Iterator it = ((VBA) this).A00.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).beforeTextChanged(charSequence, i, i2, i3);
            }
        }
    }
}
