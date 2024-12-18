package X;

import com.facebook.R;
import com.fbpay.hub.paymentmethods.api.FbPayNewCreditCardOption;
import com.fbpay.hub.paymentmethods.api.FbPayNewPayPalOption;
import com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod;
import com.fbpay.hub.paymentmethods.api.FbPayShopPay;
import com.google.common.collect.ImmutableList;

/* loaded from: classes10.dex */
public final class TW2 implements InterfaceC09250da, InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final String A02;

    public TW2(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.S1z, java.lang.Object] */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        java.util.Set set;
        int i;
        SMH smh;
        FbPayNewPayPalOption fbPayNewPayPalOption;
        if (this.A00 != 0) {
            return C164447Xj.A01((C164447Xj) this.A01, this.A02, (InterfaceC23621Ds) obj);
        }
        C63406Sjd c63406Sjd = (C63406Sjd) obj;
        if (C63406Sjd.A0J(c63406Sjd)) {
            Object obj2 = c63406Sjd.A01;
            obj2.getClass();
            SO4 so4 = (SO4) obj2;
            REI rei = (REI) this.A01;
            FbPayNewCreditCardOption fbPayNewCreditCardOption = so4.A01;
            rei.A05 = fbPayNewCreditCardOption;
            java.util.Set set2 = rei.A0G;
            EnumC61116RfW enumC61116RfW = EnumC61116RfW.CREDIT_CARD;
            if (set2.contains(enumC61116RfW) && fbPayNewCreditCardOption != null) {
                set = rei.A0F;
                set.add(enumC61116RfW);
            } else {
                set = rei.A0F;
                set.remove(enumC61116RfW);
            }
            EnumC61116RfW enumC61116RfW2 = EnumC61116RfW.PAYPAL;
            if (set2.contains(enumC61116RfW2) && (fbPayNewPayPalOption = so4.A02) != null) {
                rei.A08 = fbPayNewPayPalOption.A00;
                set.add(enumC61116RfW2);
            } else {
                set.remove(enumC61116RfW2);
            }
            EnumC61116RfW enumC61116RfW3 = EnumC61116RfW.SHOP_PAY;
            if (set2.contains(enumC61116RfW3) && so4.A03 != null && (smh = rei.A07) != null) {
                String A00 = rei.A04.A00();
                A00.getClass();
                smh.A00(A00);
                set.add(enumC61116RfW3);
            } else {
                set.remove(enumC61116RfW3);
            }
            rei.A03 = so4.A00;
            ImmutableList immutableList = so4.A04;
            String str = this.A02;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            RDq rDq = new RDq();
            rDq.A02 = 2131969402;
            RDz.A00(rDq, builder);
            C1LC it = immutableList.iterator();
            while (it.hasNext()) {
                FbPayPaymentMethod fbPayPaymentMethod = (FbPayPaymentMethod) it.next();
                RDs rDs = new RDs(0);
                rDs.A0G = fbPayPaymentMethod.A07;
                rDs.A0F = fbPayPaymentMethod.A06;
                rDs.A0B = new Object();
                rDs.A08 = new ViewOnClickListenerC63505SoY(rei, fbPayPaymentMethod, str, 1);
                android.net.Uri uri = fbPayPaymentMethod.A01;
                if (uri != null) {
                    rDs.A0E = uri.toString();
                } else {
                    int i2 = fbPayPaymentMethod.A00;
                    if (i2 == 1) {
                        i = R.drawable.payment_paypal_hub;
                    } else if (i2 == 2) {
                        i = R.drawable.rectangular_bank;
                    } else if (i2 == 3) {
                        rDs.A00 = R.attr.fbpay_shop_pay_hub_icon;
                        FbPayShopPay fbPayShopPay = fbPayPaymentMethod.A05;
                        if (fbPayShopPay != null && fbPayShopPay.A02) {
                            rDs.A05 = R.attr.fbpay_error_text_color;
                        }
                    }
                    rDs.A02 = i;
                }
                SW2.A00(rDs);
                builder.add((Object) new RDx(rDs));
            }
            RDn rDn = new RDn();
            rDn.A00 = 2131969401;
            rDn.A01 = ViewOnClickListenerC63508Sob.A00(rei, 56);
            RDy.A00(rDn, builder);
            return builder.build();
        }
        return ImmutableList.of();
    }
}
