package X;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebookpay.common.recyclerview.adapteritems.InlineBackButtonItem;
import com.facebookpay.logging.LoggingContext;

/* loaded from: classes11.dex */
public final class UuT extends UGL {
    public final Context A00;

    public UuT(Context context, LoggingContext loggingContext) {
        super(VG3.A0L, loggingContext, false);
        this.A00 = context;
    }

    public final void A08(UJB ujb, C63406Sjd c63406Sjd) {
        AbstractC167017dG.A1N(c63406Sjd, ujb);
        InlineBackButtonItem inlineBackButtonItem = (InlineBackButtonItem) c63406Sjd.A01;
        if (inlineBackButtonItem != null) {
            LinearLayout linearLayout = ujb.A01;
            C0fQ.A00(super.A00, linearLayout);
            TextView textView = ujb.A02;
            textView.setText(inlineBackButtonItem.A00);
            WF7.A02(textView, VEP.A0N);
            Context context = this.A00;
            C70161WEa.A01(context, linearLayout, VD0.A02);
            W5t A0A = C2FP.A0A();
            VET vet = VET.A0A;
            ujb.A00.setImageDrawable(A0A.A04(context, vet.A00, vet.A01));
        }
    }
}
