package X;

import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.Wcb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70545Wcb implements InterfaceC71914X9y {
    public final /* synthetic */ C67775Uxr A00;

    public C70545Wcb(C67775Uxr c67775Uxr) {
        this.A00 = c67775Uxr;
    }

    @Override // X.InterfaceC71914X9y
    public final void DDc(TextInputLayout textInputLayout, int i) {
        EditText editText = textInputLayout.A0F;
        if (editText != null && i == 1) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new RunnableC71468WuU(editText, this));
        }
    }
}
