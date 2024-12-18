package X;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CjK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28579CjK implements TextWatcher {
    public final List A00;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((TextWatcher) it.next()).afterTextChanged(editable);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((TextWatcher) it.next()).beforeTextChanged(charSequence, i, i2, i3);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((TextWatcher) it.next()).onTextChanged(charSequence, i, i2, i3);
        }
    }

    public C28579CjK(List list) {
        this.A00 = AbstractC166987dD.A1F(list);
    }
}
