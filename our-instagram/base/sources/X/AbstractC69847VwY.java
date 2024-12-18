package X;

import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.models.Distance;
import com.facebookpay.expresscheckout.models.FulfillmentOption;
import com.facebookpay.expresscheckout.models.FulfillmentOptions;
import com.facebookpay.expresscheckout.models.PickupFulfillmentOption;
import com.facebookpay.expresscheckout.models.PickupInfo;
import com.facebookpay.expresscheckout.models.PriceInfo;
import com.facebookpay.expresscheckout.models.PromoCodeList;
import com.facebookpay.expresscheckout.models.ShippingOption;
import com.facebookpay.expresscheckout.models.ShippingOptions;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.offsite.models.message.PaymentDetails;
import com.facebookpay.offsite.models.message.PaymentDistance;
import com.facebookpay.offsite.models.message.PaymentFulfillmentOption;
import com.facebookpay.offsite.models.message.PaymentItem;
import com.facebookpay.offsite.models.message.PaymentOffer;
import com.facebookpay.offsite.models.message.PaymentPickupInfo;
import com.facebookpay.offsite.models.message.PaymentPickupOption;
import com.facebookpay.offsite.models.message.PaymentShippingOption;
import com.facebookpay.offsite.models.message.SummaryPaymentItem;
import com.facebookpay.offsite.models.message.W3CShippingAddress;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.VwY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69847VwY {
    public static final TransactionInfo A00(PaymentDetails paymentDetails, String str, String str2) {
        ShippingOptions shippingOptions;
        FulfillmentOptions fulfillmentOptions;
        ArrayList arrayList;
        Integer num;
        Parcelable fulfillmentOption;
        String str3;
        String str4;
        Integer num2;
        String str5 = str2;
        PaymentItem paymentItem = paymentDetails.total;
        if (paymentItem != null) {
            ArrayList<PaymentShippingOption> arrayList2 = paymentDetails.shippingOptions;
            PickupInfo pickupInfo = null;
            if (arrayList2 != null && (!arrayList2.isEmpty())) {
                String str6 = paymentDetails.shippingOptionId;
                if (str6 == null) {
                    str6 = arrayList2.get(0).id;
                }
                ArrayList A0i = AbstractC167007dF.A0i(arrayList2);
                Iterator<PaymentShippingOption> it = arrayList2.iterator();
                while (it.hasNext()) {
                    PaymentShippingOption next = it.next();
                    C14360o3.A0B(next, 0);
                    String str7 = next.id;
                    String str8 = str;
                    if (str == null) {
                        str8 = "SHIPPING";
                    }
                    Integer A00 = AbstractC69841VwR.A00(AbstractC65702TsY.A0f(str8));
                    String str9 = next.label;
                    CurrencyAmount A002 = WDw.A00(next.amount);
                    String str10 = next.secondaryLabel;
                    if (str10 == null) {
                        str10 = "";
                    }
                    A0i.add(new ShippingOption(A002, A00, str7, str9, str10));
                }
                shippingOptions = new ShippingOptions(str6, A0i);
            } else {
                shippingOptions = null;
            }
            ArrayList<PaymentFulfillmentOption> arrayList3 = paymentDetails.fulfillmentOptions;
            if (arrayList3 != null && (!arrayList3.isEmpty())) {
                String str11 = paymentDetails.fulfillmentOptionId;
                if (str11 == null) {
                    str11 = arrayList3.get(0).id;
                }
                ArrayList A0i2 = AbstractC167007dF.A0i(arrayList3);
                Iterator<PaymentFulfillmentOption> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    PaymentFulfillmentOption next2 = it2.next();
                    C14360o3.A0B(next2, 0);
                    if (next2 instanceof PaymentPickupOption) {
                        String str12 = next2.id;
                        String str13 = next2.label;
                        CurrencyAmount A003 = WDw.A00(next2.amount);
                        Date date = next2.dateTimeRangeStart;
                        Date date2 = next2.dateTimeRangeEnd;
                        PaymentPickupOption paymentPickupOption = (PaymentPickupOption) next2;
                        W3CShippingAddress w3CShippingAddress = paymentPickupOption.pickupLocationAddress;
                        C14360o3.A0B(w3CShippingAddress, 0);
                        String str14 = w3CShippingAddress.organization;
                        String str15 = w3CShippingAddress.recipient;
                        ArrayList<String> arrayList4 = w3CShippingAddress.addressLine;
                        if (arrayList4 != null) {
                            str3 = (String) AbstractC001800i.A0O(arrayList4, 0);
                        } else {
                            str3 = null;
                        }
                        ArrayList<String> arrayList5 = w3CShippingAddress.addressLine;
                        if (arrayList5 != null) {
                            str4 = (String) AbstractC001800i.A0O(arrayList5, 1);
                        } else {
                            str4 = null;
                        }
                        Distance distance = null;
                        ShippingAddress shippingAddress = new ShippingAddress(null, str14, str15, str3, str4, w3CShippingAddress.city, w3CShippingAddress.region, w3CShippingAddress.country, w3CShippingAddress.postalCode, null, false, false, false, false, true);
                        boolean z = paymentPickupOption.pickupStoreAvailability;
                        PaymentDistance paymentDistance = paymentPickupOption.pickupStoreDistance;
                        if (paymentDistance != null) {
                            double d = paymentDistance.value;
                            String A0f = AbstractC65702TsY.A0f(paymentDistance.unit);
                            if (A0f.equals("MILES")) {
                                num2 = C05F.A00;
                            } else if (A0f.equals("KILOMETERS")) {
                                num2 = C05F.A01;
                            } else {
                                throw new IllegalArgumentException(A0f);
                            }
                            distance = new Distance(num2, d);
                        }
                        fulfillmentOption = new PickupFulfillmentOption(A003, distance, shippingAddress, str12, str13, date, date2, z);
                    } else {
                        fulfillmentOption = new FulfillmentOption(WDw.A00(next2.amount), next2.id, next2.label, next2.dateTimeRangeStart, next2.dateTimeRangeEnd);
                    }
                    A0i2.add(fulfillmentOption);
                }
                fulfillmentOptions = new FulfillmentOptions(str11, A0i2);
            } else {
                fulfillmentOptions = null;
            }
            if (str == null) {
                str = "SHIPPING";
            }
            Integer A004 = AbstractC69841VwR.A00(AbstractC65702TsY.A0f(str));
            if (str2 == null && (str5 = Locale.getDefault().getCountry()) == null) {
                str5 = Locale.US.getCountry();
            }
            String str16 = paymentItem.amount.currency;
            ArrayList<SummaryPaymentItem> arrayList6 = paymentDetails.summaryItems;
            ArrayList A0i3 = AbstractC167007dF.A0i(arrayList6);
            Iterator<SummaryPaymentItem> it3 = arrayList6.iterator();
            while (it3.hasNext()) {
                SummaryPaymentItem next3 = it3.next();
                CurrencyAmount A005 = WDw.A00(next3.amount);
                String str17 = next3.label;
                String str18 = next3.summaryItemType;
                C14360o3.A0B(str18, 0);
                VE5 ve5 = (VE5) VE5.A01.get(str18);
                if (ve5 != null) {
                    A0i3.add(new PriceInfo(A005, VDV.A05, ve5, null, str17, null, null, null));
                } else {
                    throw AbstractC167007dF.A0c("PriceInfoType is not found for identifier => ", str18);
                }
            }
            CurrencyAmount A006 = WDw.A00(paymentItem.amount);
            String str19 = paymentItem.label;
            VE5 ve52 = VE5.A0B;
            A0i3.add(new PriceInfo(A006, VDV.A04, ve52, null, str19, null, null, null));
            ArrayList<PaymentItem> arrayList7 = paymentDetails.displayItems;
            ArrayList A0i4 = AbstractC167007dF.A0i(arrayList7);
            Iterator<PaymentItem> it4 = arrayList7.iterator();
            while (it4.hasNext()) {
                PaymentItem next4 = it4.next();
                C14360o3.A0B(next4, 0);
                CurrencyAmount A007 = WDw.A00(next4.amount);
                String str20 = next4.label;
                VDV vdv = VDV.A05;
                String str21 = next4.quantity;
                if (str21 != null) {
                    num = AbstractC003100w.A0i(str21);
                } else {
                    num = null;
                }
                A0i4.add(new PriceInfo(A007, vdv, ve52, num, str20, null, next4.secondaryLabel, next4.imageURI));
            }
            List<PaymentOffer> list = paymentDetails.offers;
            if (list != null) {
                arrayList = AbstractC167007dF.A0i(list);
                Iterator<PaymentOffer> it5 = list.iterator();
                while (it5.hasNext()) {
                    arrayList.add(it5.next().code);
                }
            } else {
                arrayList = new ArrayList();
            }
            PromoCodeList promoCodeList = new PromoCodeList(arrayList);
            C16930sl c16930sl = C16930sl.A00;
            PaymentPickupInfo paymentPickupInfo = paymentDetails.pickupInfo;
            if (paymentPickupInfo != null) {
                pickupInfo = new PickupInfo(paymentPickupInfo.pickupRadiusZipCode, paymentPickupInfo.pickupName, paymentPickupInfo.pickupEmail, paymentPickupInfo.pickupPhone, paymentPickupInfo.pickupNotes);
            }
            return new TransactionInfo(fulfillmentOptions, pickupInfo, promoCodeList, shippingOptions, A004, str16, str5, null, A0i3, A0i4, c16930sl);
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0262 A[LOOP:7: B:124:0x025c->B:126:0x0262, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebookpay.offsite.models.message.PaymentDetails A01(com.facebookpay.expresscheckout.models.TransactionInfo r32, com.facebookpay.shippingaddress.model.ShippingAddress r33, com.facebookpay.shippingaddress.model.ShippingAddress r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.util.List r41) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC69847VwY.A01(com.facebookpay.expresscheckout.models.TransactionInfo, com.facebookpay.shippingaddress.model.ShippingAddress, com.facebookpay.shippingaddress.model.ShippingAddress, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):com.facebookpay.offsite.models.message.PaymentDetails");
    }
}
