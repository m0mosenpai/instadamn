package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class WKb implements TextWatcher {
    public final /* synthetic */ UDV A00;

    public WKb(UDV udv) {
        this.A00 = udv;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ArrayList arrayList;
        UDV udv = this.A00;
        if (!udv.A0G && (arrayList = udv.A0C) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).afterTextChanged(editable);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ArrayList arrayList;
        UDV udv = this.A00;
        if (!udv.A0G && (arrayList = udv.A0C) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).beforeTextChanged(charSequence, i, i2, i3);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ArrayList arrayList;
        KeyListener keyListener = UDV.A0V;
        UDV udv = this.A00;
        if (!udv.A0G && (arrayList = udv.A0C) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).onTextChanged(charSequence, i, i2, i3);
            }
        }
        UDV.A01(udv);
    }
}
