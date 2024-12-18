package X;

import android.view.ContextThemeWrapper;
import android.widget.TextView;
import com.facebookpay.common.recyclerview.adapteritems.CheckoutOptionalityItem;
import com.facebookpay.logging.LoggingContext;

/* loaded from: classes11.dex */
public final class UuS extends UGL {
    public final ContextThemeWrapper A00;

    public UuS(ContextThemeWrapper contextThemeWrapper, LoggingContext loggingContext) {
        super(VG3.A0D, loggingContext, false);
        this.A00 = contextThemeWrapper;
    }

    public final void A08(C66462UIm c66462UIm, C63406Sjd c63406Sjd) {
        AbstractC167017dG.A1N(c63406Sjd, c66462UIm);
        CheckoutOptionalityItem checkoutOptionalityItem = (CheckoutOptionalityItem) c63406Sjd.A01;
        if (checkoutOptionalityItem != null) {
            TextView textView = c66462UIm.A00;
            textView.setText(checkoutOptionalityItem.A00);
            WF7.A02(textView, VEP.A0E);
            C0fQ.A00(super.A00, textView);
        }
    }
}
