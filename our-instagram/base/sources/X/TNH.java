package X;

import android.text.TextUtils;
import com.facebook.browser.lite.extensions.autofill.instagram.AutofillController$InstagramAutofillOptOutCallbackHandler;

/* loaded from: classes10.dex */
public final class TNH implements Runnable {
    public final /* synthetic */ AutofillController$InstagramAutofillOptOutCallbackHandler A00;
    public final /* synthetic */ String A01;

    public TNH(AutofillController$InstagramAutofillOptOutCallbackHandler autofillController$InstagramAutofillOptOutCallbackHandler, String str) {
        this.A00 = autofillController$InstagramAutofillOptOutCallbackHandler;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.A01;
        AutofillController$InstagramAutofillOptOutCallbackHandler autofillController$InstagramAutofillOptOutCallbackHandler = this.A00;
        QF6 qf6 = autofillController$InstagramAutofillOptOutCallbackHandler.A02;
        if (TextUtils.equals(str, AbstractC63387Sj3.A02(qf6.A05()))) {
            autofillController$InstagramAutofillOptOutCallbackHandler.A01.A0E(qf6);
        }
    }
}
