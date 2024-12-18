package X;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import androidx.preference.ListPreference;
import com.facebook.react.uimanager.UIManagerHelper;

/* renamed from: X.WOe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70259WOe implements AdapterView.OnItemSelectedListener {
    public final int A00;
    public final Object A01;

    public C70259WOe(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C66360UCh c66360UCh;
        switch (this.A00) {
            case 0:
                if (i == -1 || (c66360UCh = ((WPW) this.A01).A0A) == null) {
                    return;
                }
                c66360UCh.A07 = false;
                return;
            case 1:
                ((SearchView) this.A01).A0E(i);
                return;
            case 2:
                if (i < 0) {
                    return;
                }
                ListPreference listPreference = (ListPreference) this.A01;
                String charSequence = listPreference.A02[i].toString();
                if (charSequence.equals(listPreference.A00)) {
                    return;
                }
                listPreference.A0O(charSequence);
                return;
            default:
                X7N x7n = ((UDc) this.A01).A00;
                if (x7n != null) {
                    WVC wvc = (WVC) x7n;
                    X9J x9j = wvc.A01;
                    UDc uDc = wvc.A00;
                    x9j.APn(new C67618Usp(UIManagerHelper.A01(uDc), uDc.getId(), i));
                    return;
                }
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        X7N x7n;
        if (3 - this.A00 == 0 && (x7n = ((UDc) this.A01).A00) != null) {
            WVC wvc = (WVC) x7n;
            X9J x9j = wvc.A01;
            UDc uDc = wvc.A00;
            x9j.APn(new C67618Usp(UIManagerHelper.A01(uDc), uDc.getId(), -1));
        }
    }
}
