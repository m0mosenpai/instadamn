package X;

import android.text.Editable;
import android.text.TextWatcher;

/* loaded from: classes11.dex */
public final class WKc implements TextWatcher {
    public final /* synthetic */ C6QR A00;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Object value;
        C14360o3.A0B(editable, 0);
        UFT A01 = C6QR.A01(this.A00);
        String obj = editable.toString();
        C14360o3.A0B(obj, 0);
        C05A c05a = A01.A02.A01;
        do {
            value = c05a.getValue();
        } while (!c05a.AIi(value, UQJ.A00(null, null, (UQJ) value, obj, null, null, null, 0, 0, 1021, false)));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public WKc(C6QR c6qr) {
        this.A00 = c6qr;
    }
}
