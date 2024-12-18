package X;

import android.view.View;
import android.view.autofill.AutofillManager;
import com.facebookpay.form.view.BaseAutoCompleteTextView;

/* loaded from: classes11.dex */
public final class UB1 extends AutofillManager.AutofillCallback {
    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public final void onAutofillEvent(View view, int i, int i2) {
        C14360o3.A0B(view, 0);
        onAutofillEvent(view, i2);
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public final void onAutofillEvent(View view, int i) {
        InterfaceC16820sZ interfaceC16820sZ;
        C14360o3.A0B(view, 0);
        if (i == 1 && (view instanceof BaseAutoCompleteTextView) && (interfaceC16820sZ = ((BaseAutoCompleteTextView) view).A03) != null) {
            interfaceC16820sZ.invoke();
        }
    }
}
