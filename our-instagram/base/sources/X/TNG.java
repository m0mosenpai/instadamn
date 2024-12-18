package X;

import android.widget.Toast;
import com.facebook.browser.lite.extensions.autofill.instagram.AutofillController$InstagramAutofillOptOutCallbackHandler;

/* loaded from: classes10.dex */
public final class TNG implements Runnable {
    public final /* synthetic */ AutofillController$InstagramAutofillOptOutCallbackHandler A00;
    public final /* synthetic */ boolean A01;

    public TNG(AutofillController$InstagramAutofillOptOutCallbackHandler autofillController$InstagramAutofillOptOutCallbackHandler, boolean z) {
        this.A00 = autofillController$InstagramAutofillOptOutCallbackHandler;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(this.A00.A00, AnonymousClass001.A1D("Autofill Opt Out: ", this.A01), 0).show();
    }
}
