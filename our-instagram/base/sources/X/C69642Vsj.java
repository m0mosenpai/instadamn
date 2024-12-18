package X;

import androidx.fragment.app.FragmentActivity;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.CheckoutSetupKeyValue;
import com.facebookpay.expresscheckout.models.ECPPaymentConfiguration;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;
import com.facebookpay.expresscheckout.models.FulfillmentOption;
import com.facebookpay.expresscheckout.models.FulfillmentOptions;
import com.facebookpay.expresscheckout.models.KnownData;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.models.PriceInfo;
import com.facebookpay.expresscheckout.models.PromoCodeList;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.expresscheckout.sample.SampleECPLaunch$launchECP$1;
import com.facebookpay.logging.LoggingPolicy;
import com.facebookpay.offsite.models.message.AvailabilityInitiator$Companion;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: X.Vsj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69642Vsj {
    public final C69641Vsi A00;
    public final FragmentActivity A03;
    public final FulfillmentOptions A04;
    public final ArrayList A05;
    public final ArrayList A06;
    public final List A07;
    public final InterfaceC09390do A02 = AbstractC09440dt.A00(EnumC09460dv.A02, X3k.A00);
    public final String A01 = AbstractC25231BEo.A0p();

    public final void A00(EcpUIConfiguration ecpUIConfiguration, String str) {
        PaymentReceiverInfo paymentReceiverInfo = new PaymentReceiverInfo("3945555168888728", null, null, null);
        CurrencyAmount currencyAmount = new CurrencyAmount("USD", "0.70");
        VE5 ve5 = VE5.A0A;
        VDV vdv = VDV.A05;
        TransactionInfo transactionInfo = new TransactionInfo(this.A04, null, new PromoCodeList(this.A05), null, null, "USD", "US", null, AbstractC16960so.A1M(new PriceInfo(currencyAmount, vdv, ve5, null, "Tax", null, null, null), new PriceInfo(new CurrencyAmount("USD", "10.00"), vdv, VE5.A09, null, "Subtotal", null, null, null), new PriceInfo(new CurrencyAmount("USD", "10.70"), vdv, VE5.A0B, null, "Total", null, null, null)), AbstractC16960so.A1M(new PriceInfo(new CurrencyAmount("USD", "7.77"), vdv, ve5, 1, "Item Name", null, "Size: L", "https://cdn.shopify.com/s/files/1/0059/8835/2052/products/Kieffer-Pear-Tree-450w_901dda52-964c-41f7-a282-44e3a667ac6e_1024x1024.jpg?v=1603108180")), this.A07);
        VDD[] vddArr = {VDD.A06, VDD.A0D, VDD.A0B};
        C14360o3.A0B(vddArr, 0);
        java.util.Set A0K = AbstractC009903n.A0K(vddArr);
        VD7[] vd7Arr = {VD7.A03, VD7.A05, VD7.A04, VD7.A02};
        C14360o3.A0B(vd7Arr, 0);
        CheckoutConfiguration checkoutConfiguration = new CheckoutConfiguration(null, EnumC68202VFu.META_PAY_BANNER, null, true, true, null, null, null, null, null, null, false, null, null, null, null, A0K, AbstractC009903n.A0K(vd7Arr), 1, false, false, false);
        VDU vdu = VDU.A04;
        ArrayList A1M = AbstractC16960so.A1M(EnumC68131VCp.A04);
        ECPPaymentConfiguration eCPPaymentConfiguration = new ECPPaymentConfiguration(new CurrencyAmount("USD", "100"), new KnownData(new ShippingAddress(null, null, "Jamie Wilson", "1 Hacker Way", null, "Menlo Park", "CA", "US", "94025", null, false, false, false, false, true), "Jamie Wilson", "jamie@email.com", "6505051234", AvailabilityInitiator$Companion.INITIATOR_IAW), vdu, "1234", "https://www.fbpaytesting.com", A1M, AbstractC16960so.A1M(VEM.A05), null, null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CheckoutSetupKeyValue("CLIENT_RECEIVER_ID", "PSP_LIVE_TEST_1::LIVE_TEST_MERCHANT_1"));
        arrayList.add(new CheckoutSetupKeyValue("SECURITY_ORIGIN", "https://www.fbpaytesting.com"));
        arrayList.add(new CheckoutSetupKeyValue("PROCESSING_MODE", "LIVE"));
        String A02 = AbstractC58442PvL.A02();
        LoggingPolicy loggingPolicy = new LoggingPolicy("payments_offsite_partners", new ArrayList());
        C19L c19l = (C19L) this.A02.getValue();
        AbstractC23641Du.A05(AnonymousClass191.A00, new SampleECPLaunch$launchECP$1(checkoutConfiguration, eCPPaymentConfiguration, ecpUIConfiguration, paymentReceiverInfo, transactionInfo, this, loggingPolicy, A02, "742725890006429", str, arrayList, null), c19l);
    }

    public C69642Vsj(FragmentActivity fragmentActivity) {
        this.A03 = fragmentActivity;
        this.A00 = new C69641Vsi(null, fragmentActivity, null);
        ArrayList A1M = AbstractC16960so.A1M(new FulfillmentOption(new CurrencyAmount("USD", "19.99"), "prty-usps", "Priority USPS", new Date(2023, 12, 30), new Date(2023, 12, 31)), new FulfillmentOption(new CurrencyAmount("USD", "29.99"), "ovrn-fedex", "Overnight FedEx", null, null));
        this.A06 = A1M;
        this.A04 = new FulfillmentOptions(((FulfillmentOption) A1M.get(0)).A00(), A1M);
        this.A05 = new ArrayList();
        this.A07 = new ArrayList();
    }
}
