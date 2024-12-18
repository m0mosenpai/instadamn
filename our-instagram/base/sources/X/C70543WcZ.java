package X;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.WcZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70543WcZ implements InterfaceC71914X9y {
    public final /* synthetic */ C67776Uxs A00;

    public C70543WcZ(C67776Uxs c67776Uxs) {
        this.A00 = c67776Uxs;
    }

    @Override // X.InterfaceC71914X9y
    public final void DDc(TextInputLayout textInputLayout, int i) {
        EditText editText = textInputLayout.A0F;
        if (editText != null && i == 2) {
            editText.post(new RunnableC71465WuR(editText, this));
            if (editText.getOnFocusChangeListener() == this.A00.A03) {
                editText.setOnFocusChangeListener(null);
            }
        }
    }
}
