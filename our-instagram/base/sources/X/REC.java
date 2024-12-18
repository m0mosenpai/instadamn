package X;

import android.os.Bundle;
import com.facebook.R;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebookpay.logging.FBPayLoggerData;
import com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;

/* loaded from: classes10.dex */
public final class REC extends Q8X {
    public FBPayLoggerData A00;
    public final C2GS A01 = AbstractC58318PtA.A0J();

    @Override // X.Q8X
    public final void A05(Bundle bundle) {
        super.A05(bundle);
        if (bundle != null) {
            if (bundle.getSerializable("payout_methods") != null) {
                ImmutableCollection immutableCollection = (ImmutableCollection) bundle.getSerializable("payout_methods");
                FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) bundle.getParcelable("logger_data");
                if (fBPayLoggerData != null) {
                    this.A00 = fBPayLoggerData;
                    C2GS c2gs = this.A01;
                    ImmutableList.Builder builder = new ImmutableList.Builder();
                    C14360o3.A0A(immutableCollection);
                    if (!immutableCollection.isEmpty()) {
                        RDq rDq = new RDq();
                        rDq.A02 = 2131969433;
                        RDz.A00(rDq, builder);
                        C1LC A0I = AbstractC43592JPx.A0I(immutableCollection);
                        while (A0I.hasNext()) {
                            FbPayPaymentMethod fbPayPaymentMethod = (FbPayPaymentMethod) A0I.next();
                            RDs rDs = new RDs(0);
                            String str = fbPayPaymentMethod.A06;
                            rDs.A0G = StringFormatUtil.formatStrLocaleSafe("%s • %s", str, fbPayPaymentMethod.A07);
                            rDs.A0F = str;
                            rDs.A02 = R.drawable.bank_icon_border;
                            rDs.A01 = R.drawable.payment_bank_on_file_hub;
                            rDs.A08 = new ViewOnClickListenerC63509Soc(23, this, fbPayPaymentMethod);
                            SW2.A00(rDs);
                            builder.add((Object) new RDx(rDs));
                        }
                    }
                    ImmutableList build = builder.build();
                    C14360o3.A07(build);
                    c2gs.A0B(build);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
