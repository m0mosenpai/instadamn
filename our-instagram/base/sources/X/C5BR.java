package X;

import android.view.View;
import android.view.autofill.AutofillManager;

/* renamed from: X.5BR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5BR implements C5BS {
    public final View A00;
    public final AutofillManager A01;
    public final C5BI A02;

    public C5BR(View view, C5BI c5bi) {
        this.A00 = view;
        this.A02 = c5bi;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.A01 = autofillManager;
            view.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.");
    }
}
