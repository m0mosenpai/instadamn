package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.logging.LoggingPolicy;
import com.facebookpay.paypal.model.PaypalConsentLaunchParams;

/* renamed from: X.S1o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62193S1o {
    public static C58252li A00(AbstractC10360h2 abstractC10360h2, PaypalConsentLaunchParams paypalConsentLaunchParams) {
        java.util.Set set;
        java.util.Set set2;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putInt("STYLE_RES", R.style.FBPayUIWidget_BottomSheets);
        String str = paypalConsentLaunchParams.A09;
        long parseLong = Long.parseLong(paypalConsentLaunchParams.A07);
        LoggingPolicy loggingPolicy = paypalConsentLaunchParams.A00;
        if (loggingPolicy != null) {
            set = AbstractC63059Sbg.A01(loggingPolicy);
        } else {
            set = C16910sj.A00;
        }
        if (loggingPolicy != null) {
            set2 = AbstractC63059Sbg.A02(loggingPolicy);
        } else {
            set2 = C16910sj.A00;
        }
        LoggingContext loggingContext = new LoggingContext(loggingPolicy, str, set, set2, parseLong, paypalConsentLaunchParams.A0B);
        A0b.putParcelable("PAYPAL_CONSENT_LAUNCH_PARAMS", paypalConsentLaunchParams);
        A0b.putParcelable("logging_context", loggingContext);
        Fragment A01 = C2FP.A01().A01(A0b, "paypal_consent_fragment");
        C14360o3.A0C(A01, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.ecp.ECPPayPalConsentContentFragment");
        C58762Q7r c58762Q7r = (C58762Q7r) A01;
        C67752UxP c67752UxP = new C67752UxP();
        c67752UxP.setArguments(A0b);
        c67752UxP.A0J(c58762Q7r, abstractC10360h2, "PAYPAL_CONSENT_FRAGMENT_TAG");
        return c58762Q7r.A09;
    }
}
