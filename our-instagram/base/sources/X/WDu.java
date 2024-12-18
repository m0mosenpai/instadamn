package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebookpay.apm.APMConfigurationImpl;
import com.facebookpay.common.recyclerview.adapteritems.PuxTermsConditionItem;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class WDu {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.facebookpay.expresscheckout.models.APMConfiguration] */
    public static final ECPPaymentRequest A01(C69379VmP c69379VmP, ECPPaymentRequest eCPPaymentRequest, TransactionInfo transactionInfo) {
        String str;
        java.util.Set set;
        java.util.Set set2;
        CheckoutConfiguration checkoutConfiguration;
        UY4 uy4 = c69379VmP.A04;
        String optionalStringField = uy4.getOptionalStringField(0, "strong_id__");
        String A08 = uy4.A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        String A09 = uy4.A09("image");
        PaymentReceiverInfo paymentReceiverInfo = eCPPaymentRequest.A05;
        APMConfigurationImpl aPMConfigurationImpl = null;
        if (paymentReceiverInfo != null) {
            str = paymentReceiverInfo.A00;
        } else {
            str = null;
        }
        PaymentReceiverInfo paymentReceiverInfo2 = new PaymentReceiverInfo(optionalStringField, A08, A09, str);
        C67523UnN c67523UnN = c69379VmP.A00;
        ImmutableList A0E = c67523UnN.A0E();
        if (A0E != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = A0E.iterator();
            while (it.hasNext()) {
                EnumC129485tD enumC129485tD = (EnumC129485tD) it.next();
                C14360o3.A0A(enumC129485tD);
                VDD A05 = WGr.A05(enumC129485tD);
                if (A05 != null) {
                    arrayList.add(A05);
                }
            }
            set = AbstractC001800i.A0k(arrayList);
        } else {
            set = null;
        }
        ImmutableList requiredCompactedEnumListField = c67523UnN.getRequiredCompactedEnumListField(3, "request_fields", EnumC68157VEb.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        if (requiredCompactedEnumListField != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = requiredCompactedEnumListField.iterator();
            while (it2.hasNext()) {
                EnumC68157VEb enumC68157VEb = (EnumC68157VEb) it2.next();
                C14360o3.A0A(enumC68157VEb);
                VD7 A06 = WGr.A06(enumC68157VEb);
                if (A06 != null) {
                    arrayList2.add(A06);
                }
            }
            set2 = AbstractC001800i.A0k(arrayList2);
        } else {
            set2 = null;
        }
        CheckoutConfiguration checkoutConfiguration2 = eCPPaymentRequest.A01;
        if (checkoutConfiguration2 != null) {
            ?? r1 = checkoutConfiguration2.A01;
            if (r1 == 0) {
                XGq xGq = c69379VmP.A05;
                if (xGq != null) {
                    aPMConfigurationImpl = new APMConfigurationImpl(xGq);
                }
            } else {
                aPMConfigurationImpl = r1;
            }
            java.util.Set<VDD> set3 = checkoutConfiguration2.A0H;
            C16910sj c16910sj = C16910sj.A00;
            java.util.Set A0n = AbstractC001800i.A0n(c16910sj, set3);
            if (set == null) {
                set = c16910sj;
            }
            java.util.Set A0n2 = AbstractC001800i.A0n(A0n, set);
            java.util.Set A0n3 = AbstractC001800i.A0n(c16910sj, checkoutConfiguration2.A0I);
            if (set2 == null) {
                set2 = c16910sj;
            }
            java.util.Set A0n4 = AbstractC001800i.A0n(A0n3, set2);
            String str2 = checkoutConfiguration2.A0E;
            boolean z = checkoutConfiguration2.A0J;
            String str3 = checkoutConfiguration2.A0G;
            EnumC68202VFu enumC68202VFu = checkoutConfiguration2.A02;
            EnumC68202VFu enumC68202VFu2 = checkoutConfiguration2.A03;
            Boolean bool = checkoutConfiguration2.A09;
            Boolean bool2 = checkoutConfiguration2.A0A;
            Boolean bool3 = checkoutConfiguration2.A05;
            Boolean bool4 = checkoutConfiguration2.A0C;
            String str4 = checkoutConfiguration2.A0F;
            Boolean bool5 = checkoutConfiguration2.A04;
            Boolean bool6 = checkoutConfiguration2.A06;
            Integer num = checkoutConfiguration2.A0D;
            Boolean bool7 = checkoutConfiguration2.A08;
            int i = checkoutConfiguration2.A00;
            boolean z2 = checkoutConfiguration2.A0K;
            Boolean bool8 = checkoutConfiguration2.A07;
            boolean z3 = checkoutConfiguration2.A0L;
            Boolean bool9 = checkoutConfiguration2.A0B;
            AbstractC167017dG.A1P(A0n2, A0n4);
            checkoutConfiguration = new CheckoutConfiguration(aPMConfigurationImpl, enumC68202VFu, enumC68202VFu2, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, num, str3, str2, str4, A0n2, A0n4, i, z, z2, z3);
        } else {
            checkoutConfiguration = null;
        }
        ECPPaymentConfiguration eCPPaymentConfiguration = eCPPaymentRequest.A03;
        if (eCPPaymentConfiguration == null) {
            UY3 uy3 = c69379VmP.A03;
            if (transactionInfo != null) {
                String str5 = eCPPaymentRequest.A07;
                if (str5 != null) {
                    eCPPaymentConfiguration = WGr.A0A(uy3, transactionInfo, str5);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        String str6 = eCPPaymentRequest.A0A;
        String str7 = eCPPaymentRequest.A08;
        EcpUIConfiguration ecpUIConfiguration = eCPPaymentRequest.A04;
        String str8 = eCPPaymentRequest.A07;
        return new ECPPaymentRequest(checkoutConfiguration, eCPPaymentRequest.A02, eCPPaymentConfiguration, ecpUIConfiguration, paymentReceiverInfo2, eCPPaymentRequest.A06, str6, str7, eCPPaymentRequest.A09, str8, eCPPaymentRequest.A00, false);
    }

    public static final PuxTermsConditionItem A00(C66731UZp c66731UZp) {
        R0Z r0z;
        R0Z r0z2;
        R0Z r0z3;
        ArrayList arrayList;
        if (c66731UZp != null) {
            R0Z r0z4 = null;
            String A07 = c66731UZp.A07("body_text");
            C2JS optionalTreeField = c66731UZp.getOptionalTreeField(5, "cta_text", C59078QWk.class, -2098970173);
            if (optionalTreeField != null) {
                r0z = (R0Z) optionalTreeField.A01(R0Z.class, 1825808236);
            } else {
                r0z = null;
            }
            String A08 = c66731UZp.A08("sheet_header");
            ImmutableList requiredCompactedStringListField = c66731UZp.getRequiredCompactedStringListField(2, "sheet_body_text");
            C2JS optionalTreeField2 = c66731UZp.getOptionalTreeField(3, "payments_terms", C59079QWl.class, 281542544);
            if (optionalTreeField2 != null) {
                r0z2 = (R0Z) optionalTreeField2.A01(R0Z.class, 1825808236);
            } else {
                r0z2 = null;
            }
            C2JS optionalTreeField3 = c66731UZp.getOptionalTreeField(4, AbstractC58317Pt9.A00(343), C59080QWm.class, 1178531916);
            if (optionalTreeField3 != null) {
                r0z3 = (R0Z) optionalTreeField3.A01(R0Z.class, 1825808236);
            } else {
                r0z3 = null;
            }
            ImmutableList requiredCompactedTreeListField = c66731UZp.getRequiredCompactedTreeListField(6, "terms_actions", C59081QWn.class, 934810415);
            C14360o3.A0A(requiredCompactedTreeListField);
            if (!requiredCompactedTreeListField.isEmpty()) {
                arrayList = AbstractC167017dG.A0q(requiredCompactedTreeListField);
                Iterator<E> it = requiredCompactedTreeListField.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C2JS) it.next()).A01(R0Z.class, 1825808236));
                }
            } else {
                arrayList = null;
            }
            C2JS optionalTreeField4 = c66731UZp.getOptionalTreeField(7, "body_text_with_multiple_actions", C59077QWj.class, -424149810);
            if (optionalTreeField4 != null) {
                r0z4 = (R0Z) optionalTreeField4.A01(R0Z.class, 1825808236);
            }
            return new PuxTermsConditionItem(r0z, r0z2, r0z3, r0z4, VG3.A0m, A07, A08, requiredCompactedStringListField, arrayList, false);
        }
        return new PuxTermsConditionItem(null, null, null, null, VG3.A0m, null, null, null, null, false);
    }

    public static final ShippingAddress A02(C66718UZc c66718UZc, boolean z) {
        boolean z2;
        String str;
        if (c66718UZc != null) {
            String A07 = c66718UZc.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            String A08 = c66718UZc.A08("label");
            String A09 = c66718UZc.A09("care_of");
            String A0A = c66718UZc.A0A("street1");
            String A0B = c66718UZc.A0B("street2");
            String A0C = c66718UZc.A0C("city_name");
            String optionalStringField = c66718UZc.getOptionalStringField(6, "state_name");
            String optionalStringField2 = c66718UZc.getOptionalStringField(7, "country_name");
            String optionalStringField3 = c66718UZc.getOptionalStringField(9, "postal_code");
            boolean hasFieldValue = c66718UZc.hasFieldValue("verified");
            boolean coercedBooleanField = c66718UZc.getCoercedBooleanField(8, "verified");
            boolean coercedBooleanField2 = c66718UZc.getCoercedBooleanField(10, "is_default");
            C2JS reinterpretIfFulfillsType = c66718UZc.reinterpretIfFulfillsType(11, "ExternalMailingAddress", UXP.class, 1012555557);
            if (reinterpretIfFulfillsType != null) {
                z2 = reinterpretIfFulfillsType.getCoercedBooleanField(0, "is_editable");
            } else {
                z2 = true;
            }
            C2JS reinterpretIfFulfillsType2 = c66718UZc.reinterpretIfFulfillsType(11, "ExternalMailingAddress", UXP.class, 1012555557);
            if (reinterpretIfFulfillsType2 != null) {
                str = reinterpretIfFulfillsType2.A08(AbstractC58317Pt9.A00(274));
            } else {
                str = null;
            }
            return new ShippingAddress(A07, A08, A09, A0A, A0B, A0C, optionalStringField, optionalStringField2, optionalStringField3, str, hasFieldValue, coercedBooleanField, coercedBooleanField2, z, z2);
        }
        throw new IllegalStateException("Cannot convert null object to a valid shipping address");
    }

    public static final boolean A03(EnumC129485tD enumC129485tD, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == enumC129485tD) {
                return true;
            }
        }
        return false;
    }
}
