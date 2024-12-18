package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.R;
import com.facebookpay.logging.FBPayLoggerData;
import com.fbpay.hub.paymentmethods.api.FbPayPayPal;
import com.google.common.collect.ImmutableList;
import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public final class REH extends Q8X {
    public C2GT A00;
    public FBPayLoggerData A01;
    public FbPayPayPal A02;
    public final C2GS A03 = AbstractC58318PtA.A0J();
    public final C2GC A04;
    public final SMF A05;

    public REH(C2GC c2gc, SMF smf) {
        this.A05 = smf;
        this.A04 = c2gc;
    }

    @Override // X.Q8X
    public final void A05(Bundle bundle) {
        super.A05(bundle);
        this.A01 = AbstractC58320PtC.A0Z(bundle);
        Parcelable parcelable = bundle.getParcelable("paypal_credential");
        parcelable.getClass();
        this.A02 = (FbPayPayPal) parcelable;
        C2GS c2gs = this.A03;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        RDs rDs = new RDs(0);
        rDs.A07 = 2131969396;
        rDs.A0F = this.A02.A01;
        rDs.A02 = R.drawable.payment_paypal_hub;
        builder.add((Object) new RDx(rDs));
        RDr rDr = new RDr();
        rDr.A02 = 2131972212;
        rDr.A01 = R.attr.fbpay_error_text_color;
        rDr.A03 = ViewOnClickListenerC63508Sob.A00(this, 53);
        SW2.A00(rDr);
        builder.add((Object) new RE0(rDr));
        c2gs.A0B(builder.build());
        LinkedHashMap A08 = AbstractC58442PvL.A08(this.A01);
        AbstractC58320PtC.A1Q(this.A02.A00, A08);
        this.A04.Chz("fbpay_edit_paypal_display", A08);
    }
}
