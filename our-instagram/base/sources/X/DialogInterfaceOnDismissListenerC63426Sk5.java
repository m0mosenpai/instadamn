package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.facebook.browser.lite.extensions.autofill.instagram.AutofillController$5;
import com.facebook.smartcapture.logging.CancelReason;
import com.facebook.smartcapture.view.IdCaptureBaseActivity;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.paypal.model.PaypalConsentLaunchParams;

/* renamed from: X.Sk5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class DialogInterfaceOnDismissListenerC63426Sk5 implements DialogInterface.OnDismissListener {
    public final int A00;
    public final Object A01;

    public DialogInterfaceOnDismissListenerC63426Sk5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        String str;
        switch (this.A00) {
            case 0:
                C58883QEt c58883QEt = ((AutofillController$5) this.A01).A01;
                InterfaceC172727mi interfaceC172727mi = ((AbstractC63223SfY) c58883QEt).A04;
                interfaceC172727mi.getClass();
                c58883QEt.A0G(interfaceC172727mi.C9a());
                return;
            case 1:
            case 2:
            default:
                ((XQ3) this.A01).A03 = false;
                return;
            case 3:
                IdCaptureBaseActivity idCaptureBaseActivity = (IdCaptureBaseActivity) this.A01;
                idCaptureBaseActivity.setResult(0);
                idCaptureBaseActivity.finish();
                idCaptureBaseActivity.A02().logFlowCancel(CancelReason.ENCRYPTION_FAILURE);
                return;
            case 4:
                Wap A0H = AbstractC43592JPx.A0H();
                C58762Q7r c58762Q7r = (C58762Q7r) this.A01;
                LoggingContext loggingContext = c58762Q7r.A05;
                if (loggingContext == null) {
                    str = "loggingContext";
                } else {
                    PaypalConsentLaunchParams paypalConsentLaunchParams = c58762Q7r.A06;
                    if (paypalConsentLaunchParams == null) {
                        str = "launchParams";
                    } else {
                        A0H.A0Q(loggingContext, "cancel", Long.parseLong(paypalConsentLaunchParams.A05));
                        C63406Sjd.A0E(c58762Q7r.A09, null, new RuntimeException());
                        Fragment fragment = c58762Q7r.mParentFragment;
                        C14360o3.A0C(fragment, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
                        ((C0SG) fragment).onDismiss(dialogInterface);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
        }
    }
}
