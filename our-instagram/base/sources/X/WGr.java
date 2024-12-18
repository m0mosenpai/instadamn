package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.intent.IntentModule;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.CheckoutPayloadKeyValue;
import com.facebookpay.expresscheckout.models.ECPPaymentConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.expresscheckout.models.FulfillmentOption;
import com.facebookpay.expresscheckout.models.PickupFulfillmentOption;
import com.facebookpay.expresscheckout.models.PriceInfo;
import com.facebookpay.expresscheckout.models.PromoCodeList;
import com.facebookpay.expresscheckout.models.ShippingOption;
import com.facebookpay.expresscheckout.models.ShippingOptions;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.logging.ClientSuppressionPolicy;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.logging.LoggingPolicy;
import com.facebookpay.offsite.models.message.OffsiteShippingType$Companion;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.facebookpay.otc.models.OtcInput;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class WGr {
    public static final Be9 A00(ECPPaymentResponseParams eCPPaymentResponseParams, String str) {
        boolean z;
        String str2;
        CurrencyAmount currencyAmount;
        String str3;
        String str4;
        C04060Jx c04060Jx = null;
        C0CA c0ca = null;
        ShippingAddress shippingAddress = eCPPaymentResponseParams.A07;
        C2JO c2jo = null;
        if (shippingAddress != null && (str4 = shippingAddress.A04) != null) {
            c04060Jx = GraphQlCallInput.A02;
            C0CA A0T = AbstractC25227BEk.A0T(c04060Jx, true, "is_default");
            C0CA.A00(A0T, shippingAddress.A05, "label");
            C0CA.A00(A0T, shippingAddress.A00, "care_of");
            C0CA.A00(A0T, shippingAddress.A08, "street_1");
            C0CA.A00(A0T, shippingAddress.A09, "street_2");
            C0CA.A00(A0T, shippingAddress.A01, ServerW3CShippingAddressConstants.CITY);
            C0CA.A00(A0T, shippingAddress.A07, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
            C0CA.A00(A0T, shippingAddress.A06, "postal_code");
            C0CA.A00(A0T, shippingAddress.A02, "country_code");
            C0CA.A00(A0T, true, "provide_suggestion");
            c0ca = c04060Jx.A02();
            c0ca.A0E(A0T, "address");
            C0CA.A00(c0ca, str4, "address_id");
            z = true;
        } else {
            z = false;
        }
        C04060Jx c04060Jx2 = GraphQlCallInput.A02;
        C0CA c0ca2 = null;
        String str5 = eCPPaymentResponseParams.A0G;
        if (str5 != null) {
            c0ca2 = c04060Jx2.A02();
            C0CA.A00(c0ca2, str5, "payer_name");
        }
        String str6 = eCPPaymentResponseParams.A0F;
        if (str6 != null) {
            if (c0ca2 == null) {
                c0ca2 = c04060Jx2.A02();
            }
            C0CA.A00(c0ca2, str6, "payer_email");
        }
        String str7 = eCPPaymentResponseParams.A0H;
        if (str7 != null) {
            if (c0ca2 == null) {
                c0ca2 = c04060Jx2.A02();
            }
            C0CA.A00(c0ca2, str7, "payer_phone");
        }
        if (z) {
            if (c0ca2 == null) {
                c0ca2 = c04060Jx2.A02();
            }
            if (c0ca == null) {
                c0ca = c04060Jx.A02();
            }
            c0ca2.A0E(c0ca, "shipping_address_details");
        }
        ShippingOption shippingOption = eCPPaymentResponseParams.A02;
        if (shippingOption != null) {
            C0CA A0T2 = AbstractC25227BEk.A0T(c04060Jx2, shippingOption.A03, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int intValue = shippingOption.A01.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    str3 = "PICKUP";
                } else {
                    str3 = OffsiteShippingType$Companion.DELIVERY;
                }
            } else {
                str3 = "SHIPPING";
            }
            C0CA.A00(A0T2, str3, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            C0CA.A00(A0T2, shippingOption.A04, "label");
            C2JO c2jo2 = new C2JO();
            CurrencyAmount currencyAmount2 = shippingOption.A00;
            c2jo2.A09(currencyAmount2.A01, "amount");
            c2jo2.A09(currencyAmount2.A00, "currency_code");
            A0T2.A0E(c2jo2.A02(), "price");
            C0CA.A00(A0T2, shippingOption.A02, DevServerEntity.COLUMN_DESCRIPTION);
            if (c0ca2 == null) {
                c0ca2 = c04060Jx2.A02();
            }
            c0ca2.A0E(A0T2, "selected_shipping_option");
        }
        FulfillmentOption fulfillmentOption = eCPPaymentResponseParams.A01;
        if (fulfillmentOption != null) {
            C0CA A0T3 = AbstractC25227BEk.A0T(c04060Jx2, fulfillmentOption.A00(), PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            boolean z2 = fulfillmentOption instanceof PickupFulfillmentOption;
            if (z2) {
                str2 = ((PickupFulfillmentOption) fulfillmentOption).A04;
            } else {
                str2 = fulfillmentOption.A01;
            }
            C0CA.A00(A0T3, str2, "label");
            C2JO c2jo3 = new C2JO();
            if (z2) {
                currencyAmount = ((PickupFulfillmentOption) fulfillmentOption).A00;
            } else {
                currencyAmount = fulfillmentOption.A00;
            }
            c2jo3.A09(currencyAmount.A01, "amount");
            c2jo3.A09(currencyAmount.A00, "currency_code");
            A0T3.A0E(c2jo3.A02(), "price");
            if (c0ca2 == null) {
                c0ca2 = c04060Jx2.A02();
            }
            c0ca2.A0E(A0T3, "selected_shipping_option");
        }
        Boolean valueOf = Boolean.valueOf(eCPPaymentResponseParams.A0T);
        if (c0ca2 == null) {
            c0ca2 = c04060Jx2.A02();
        }
        C0CA.A00(c0ca2, valueOf, "email_optin_checkbox_value");
        Be9 be9 = new Be9();
        be9.A07(eCPPaymentResponseParams.A0R, AbstractC63083Sc6.A00());
        C2JO c2jo4 = new C2JO();
        if (str == null) {
            str = eCPPaymentResponseParams.A0E;
        }
        c2jo4.A09(str, "order_id");
        c2jo4.A09(eCPPaymentResponseParams.A0P, "receiver_id");
        c2jo4.A09(eCPPaymentResponseParams.A0O, "product_id");
        c2jo4.A09(eCPPaymentResponseParams.A0Q, TraceFieldType.RequestID);
        c2jo4.A09(eCPPaymentResponseParams.A0B, "payment_container_id");
        AbstractC31173DnH.A1M(c0ca2, c2jo4, "return_fields");
        be9.A05("submit_payment_container_input_list", AbstractC166987dD.A1J(c2jo4));
        be9.A07(String.valueOf(AbstractC62320S6q.A00.getAndIncrement()), "client_mutation_id");
        OtcInput otcInput = eCPPaymentResponseParams.A05;
        if (otcInput != null) {
            c2jo = AbstractC63060Sbh.A00(otcInput);
        }
        be9.A06(c2jo, AbstractC58317Pt9.A00(325));
        return be9;
    }

    public static final VDD A05(EnumC129485tD enumC129485tD) {
        int A05 = AbstractC25227BEk.A05(enumC129485tD, 0);
        if (A05 != 28) {
            if (A05 != 29) {
                if (A05 != 17) {
                    if (A05 != 16) {
                        if (A05 != 12) {
                            return null;
                        }
                        return VDD.A08;
                    }
                    return VDD.A02;
                }
                return VDD.A03;
            }
            return VDD.A06;
        }
        return VDD.A0D;
    }

    public static final VD7 A06(EnumC68157VEb enumC68157VEb) {
        int A05 = AbstractC25227BEk.A05(enumC68157VEb, 0);
        if (A05 != 6) {
            if (A05 != 4) {
                if (A05 != 8) {
                    if (A05 != 2) {
                        return null;
                    }
                    return VD7.A02;
                }
                return VD7.A05;
            }
            return VD7.A03;
        }
        return VD7.A04;
    }

    public static final CheckoutConfiguration A07(C67523UnN c67523UnN, boolean z) {
        ImmutableList A0E = c67523UnN.A0E();
        C14360o3.A07(A0E);
        LinkedHashSet A0H = A0H(A0E);
        ImmutableList requiredCompactedEnumListField = c67523UnN.getRequiredCompactedEnumListField(3, "request_fields", EnumC68157VEb.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        C14360o3.A07(requiredCompactedEnumListField);
        LinkedHashSet A0I = A0I(requiredCompactedEnumListField);
        String A07 = c67523UnN.A07("checkout_button_label");
        boolean coercedBooleanField = c67523UnN.getCoercedBooleanField(1, "full_billing_required");
        Boolean valueOf = Boolean.valueOf(z);
        return new CheckoutConfiguration(null, null, null, valueOf, valueOf, valueOf, null, null, null, null, null, false, null, null, A07, null, A0H, A0I, 1, coercedBooleanField, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebookpay.expresscheckout.models.CheckoutResponse A08(X.C69379VmP r7) {
        /*
            r3 = 0
            if (r7 == 0) goto L6c
            X.UXY r1 = r7.A01
            r2 = 0
            java.lang.String r0 = "is_ecp_available"
            java.lang.Boolean r5 = X.AbstractC31174DnI.A0o(r1, r0, r2)
            X.UXn r1 = r7.A02
            if (r1 == 0) goto L6d
            java.lang.String r0 = "is_link_available"
            java.lang.Boolean r4 = X.AbstractC31174DnI.A0o(r1, r0, r2)
        L16:
            X.UXn r6 = r7.A02
            if (r6 == 0) goto L63
            java.lang.Class<X.UXm> r2 = X.C66676UXm.class
            java.lang.String r1 = "link_unavailable_reason"
            r0 = -1861959087(0xffffffff9104c251, float:-1.0472842E-28)
            X.2JS r2 = r6.A02(r2, r1, r0)
            if (r2 == 0) goto L63
            java.lang.Class<X.UX3> r1 = X.UX3.class
            r0 = 289198793(0x113cd2c9, float:1.4895538E-28)
            X.2JS r6 = r2.A01(r1, r0)
            if (r6 == 0) goto L63
            java.lang.Class<X.QRV> r2 = X.QRV.class
            java.lang.String r1 = "user_facing_error"
            r0 = 563395528(0x2194bbc8, float:1.0078575E-18)
            X.2JS r2 = r6.A03(r2, r1, r0)
            if (r2 == 0) goto L63
            java.lang.Class<X.QWW> r1 = X.QWW.class
            r0 = 736683160(0x2be8e498, float:1.6548039E-12)
            X.2JS r1 = r2.A01(r1, r0)
            if (r1 == 0) goto L63
            java.lang.String r0 = "error_description"
            java.lang.String r2 = r1.A0C(r0)
            if (r2 == 0) goto L63
        L52:
            java.lang.Boolean r1 = X.AbstractC166997dE.A0a()
            boolean r0 = X.C14360o3.A0K(r5, r1)
            if (r0 != 0) goto L72
            boolean r0 = X.C14360o3.A0K(r4, r1)
            if (r0 != 0) goto L72
            return r3
        L63:
            X.UXY r1 = r7.A01
            java.lang.String r0 = "ecp_availability_reason"
            java.lang.String r2 = r1.A08(r0)
            goto L52
        L6c:
            r5 = r3
        L6d:
            r4 = r3
            if (r7 != 0) goto L16
            r2 = r3
            goto L52
        L72:
            r0 = 66
            java.lang.String r1 = X.AbstractC58317Pt9.A00(r0)
            com.facebookpay.expresscheckout.models.CheckoutResponse r0 = new com.facebookpay.expresscheckout.models.CheckoutResponse
            r0.<init>(r3, r3, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WGr.A08(X.VmP):com.facebookpay.expresscheckout.models.CheckoutResponse");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final TransactionInfo A0B(C66670UXg c66670UXg, TransactionInfo transactionInfo) {
        String str;
        C2JS c2js;
        ShippingOptions shippingOptions;
        Object obj;
        ?? r0;
        List list;
        ArrayList<ShippingOption> arrayList;
        ShippingOption shippingOption;
        ImmutableList requiredCompactedStringListField;
        C2JS reinterpretIfFulfillsType;
        C2JS optionalTreeField;
        ImmutableList requiredCompactedTreeListField;
        String A08;
        String optionalStringField;
        C14360o3.A0B(c66670UXg, 0);
        C2JS optionalTreeField2 = ((C2JS) c66670UXg.getRequiredCompactedTreeListField(1, "price_items", C66668UXe.class, 1908452541).get(0)).reinterpretRequired(0, QT6.class, 754339802).getOptionalTreeField(0, "amount", C66671UXh.class, -298466489);
        if (optionalTreeField2 != null) {
            str = optionalTreeField2.getOptionalStringField(0, "currency");
        } else {
            str = null;
        }
        if (str != null) {
            ArrayList arrayList2 = new ArrayList();
            ImmutableList requiredCompactedTreeListField2 = c66670UXg.getRequiredCompactedTreeListField(1, "price_items", C66668UXe.class, 1908452541);
            if (requiredCompactedTreeListField2 != null) {
                C1LC A0I = AbstractC43592JPx.A0I(requiredCompactedTreeListField2);
                while (A0I.hasNext()) {
                    QT6 qt6 = (QT6) ((C2JS) A0I.next()).reinterpretRequired(0, QT6.class, 754339802);
                    C14360o3.A07(qt6);
                    A0J(qt6, arrayList2);
                }
                C2JS A04 = c66670UXg.A04(C66669UXf.class, "shipping_options", 419976308);
                if (A04 != null) {
                    c2js = A04.reinterpretRequired(0, C66675UXl.class, 1977287373);
                } else {
                    c2js = null;
                }
                ArrayList arrayList3 = new ArrayList();
                if (c2js != null) {
                    C1LC A0I2 = AbstractC43592JPx.A0I(c2js.getRequiredCompactedTreeListField(1, "shipping_options", C66674UXk.class, -1606485828));
                    while (A0I2.hasNext()) {
                        C2JS reinterpretRequired = ((C2JS) A0I2.next()).reinterpretRequired(0, C66673UXj.class, 678135786);
                        String optionalStringField2 = reinterpretRequired.getOptionalStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        if (optionalStringField2 != null) {
                            Integer A00 = AbstractC69841VwR.A00(String.valueOf(reinterpretRequired.getOptionalEnumField(1, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, EnumC68161VEf.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)));
                            String A09 = reinterpretRequired.A09("label");
                            if (A09 != null) {
                                C2JS optionalTreeField3 = reinterpretRequired.getOptionalTreeField(3, "price", C66672UXi.class, -1977525879);
                                if (optionalTreeField3 != null && (A08 = optionalTreeField3.A08("currency_code")) != null) {
                                    C2JS optionalTreeField4 = reinterpretRequired.getOptionalTreeField(3, "price", C66672UXi.class, -1977525879);
                                    if (optionalTreeField4 != null && (optionalStringField = optionalTreeField4.getOptionalStringField(0, "amount")) != null) {
                                        CurrencyAmount currencyAmount = new CurrencyAmount(A08, optionalStringField);
                                        String A0B = reinterpretRequired.A0B(DevServerEntity.COLUMN_DESCRIPTION);
                                        if (A0B != null) {
                                            arrayList3.add(new ShippingOption(currencyAmount, A00, optionalStringField2, A09, A0B));
                                        } else {
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    shippingOptions = new ShippingOptions(c2js.getOptionalStringField(0, "default_selection_id"), arrayList3);
                } else {
                    shippingOptions = null;
                }
                ImmutableList requiredCompactedTreeListField3 = c66670UXg.getRequiredCompactedTreeListField(5, "components", C66666UXc.class, 1421538184);
                C14360o3.A07(requiredCompactedTreeListField3);
                Iterator it = requiredCompactedTreeListField3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((C2JS) obj).getOptionalEnumField(0, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, EnumC129485tD.A0M) == EnumC129485tD.A08) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                C2JS c2js2 = (C2JS) obj;
                if (c2js2 != null && (reinterpretIfFulfillsType = c2js2.reinterpretIfFulfillsType(1, AbstractC58317Pt9.A00(194), C66665UXb.class, 943059052)) != null && (optionalTreeField = reinterpretIfFulfillsType.getOptionalTreeField(0, "all_eligible_incentives", C66664UXa.class, 101418297)) != null && (requiredCompactedTreeListField = optionalTreeField.getRequiredCompactedTreeListField(0, "incentives", UXZ.class, 187178854)) != null) {
                    r0 = new ArrayList();
                    Iterator it2 = requiredCompactedTreeListField.iterator();
                    while (it2.hasNext()) {
                        String optionalStringField3 = ((C2JS) it2.next()).getOptionalStringField(0, "promo_code");
                        if (optionalStringField3 != null) {
                            r0.add(optionalStringField3);
                        }
                    }
                } else {
                    r0 = C16930sl.A00;
                }
                String str2 = transactionInfo.A05;
                ArrayList<PriceInfo> arrayList4 = transactionInfo.A07;
                PromoCodeList promoCodeList = new PromoCodeList(r0);
                C2JS optionalTreeField5 = c66670UXg.getOptionalTreeField(4, "offer_credential_ids", C66667UXd.class, 2025254103);
                if (optionalTreeField5 != null && (requiredCompactedStringListField = optionalTreeField5.getRequiredCompactedStringListField(0, "credential_ids")) != null) {
                    list = AbstractC001800i.A0a(requiredCompactedStringListField);
                } else {
                    list = C16930sl.A00;
                }
                String str3 = transactionInfo.A06;
                Integer num = transactionInfo.A04;
                if (num == null) {
                    if (shippingOptions != null && (arrayList = shippingOptions.A01) != null && (shippingOption = (ShippingOption) AbstractC001800i.A0J(arrayList)) != null) {
                        num = shippingOption.A01;
                    } else {
                        num = null;
                    }
                }
                return new TransactionInfo(null, null, promoCodeList, shippingOptions, num, str, str2, str3, arrayList2, arrayList4, list);
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final TransactionInfo A0C(UYB uyb, String str) {
        List list;
        String A07;
        C2JS A01;
        String A072;
        C2JS A012;
        String A08;
        VDV vdv;
        if (str != null) {
            list = AbstractC166987dD.A1J(str);
        } else {
            list = C16930sl.A00;
        }
        PromoCodeList promoCodeList = new PromoCodeList(list);
        ArrayList arrayList = new ArrayList();
        ImmutableList requiredCompactedTreeListField = uyb.getRequiredCompactedTreeListField(2, "price_items", UY6.class, -984404767);
        if (requiredCompactedTreeListField != null) {
            C1LC A0I = AbstractC43592JPx.A0I(requiredCompactedTreeListField);
            while (A0I.hasNext()) {
                QT6 qt6 = (QT6) ((C2JS) A0I.next()).A01(QT6.class, 754339802);
                C14360o3.A07(qt6);
                A0J(qt6, arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            ImmutableList requiredCompactedTreeListField2 = uyb.getRequiredCompactedTreeListField(3, AbstractC43591JPw.A00(90), UY8.class, 1127336367);
            if (requiredCompactedTreeListField2 != null) {
                C1LC A0I2 = AbstractC43592JPx.A0I(requiredCompactedTreeListField2);
                while (A0I2.hasNext()) {
                    C2JS c2js = (C2JS) A0I2.next();
                    C2JS A03 = c2js.A03(UY7.class, "amount", -506729295);
                    if (A03 != null && (A01 = A03.A01(UX0.class, 98567921)) != null && (A072 = A01.A07("currency")) != null) {
                        C2JS A032 = c2js.A03(UY7.class, "amount", -506729295);
                        if (A032 != null && (A012 = A032.A01(UX0.class, 98567921)) != null && (A08 = A012.A08("amount")) != null) {
                            CurrencyAmount currencyAmount = new CurrencyAmount(A072, A08);
                            try {
                                EnumC68159VEd enumC68159VEd = EnumC68159VEd.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                                if (c2js.getOptionalEnumField(3, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, enumC68159VEd) != null) {
                                    String valueOf = String.valueOf(c2js.getOptionalEnumField(3, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, enumC68159VEd));
                                    C14360o3.A0B(valueOf, 0);
                                    vdv = (VDV) VDV.A01.get(valueOf);
                                    if (vdv == null) {
                                        throw AbstractC167007dF.A0c("PriceInfoStatus is not found for identifier => ", valueOf);
                                        break;
                                    }
                                } else {
                                    vdv = null;
                                }
                            } catch (IllegalArgumentException unused) {
                                vdv = null;
                            }
                            String A082 = c2js.A08("label");
                            if (A082 != null) {
                                arrayList2.add(new PriceInfo(currencyAmount, vdv, null, AbstractC37304Gc5.A0Z(c2js, "quantity", 5), A082, null, c2js.A09(DevServerEntity.COLUMN_DESCRIPTION), c2js.A0B("icon_uri")));
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                C2JS A02 = uyb.A02(UY5.class, "currency_amount", -1520792753);
                if (A02 != null && (A07 = A02.A07("currency")) != null) {
                    return new TransactionInfo(null, null, promoCodeList, null, null, A07, uyb.A07("country_code"), null, arrayList, arrayList2, new ArrayList());
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final boolean A0K(C67521UnL c67521UnL) {
        C67550Uno A0E;
        UWk A0F;
        C2JS A01;
        C67550Uno A0E2;
        UWi A0E3;
        C67523UnN c67523UnN;
        ImmutableList A0E4;
        if (c67521UnL != null && (A0E = c67521UnL.A0E()) != null && (A0F = A0E.A0F()) != null && (A01 = A0F.A01(UXY.class, -633919572)) != null && A01.getCoercedBooleanField(0, "is_ecp_available") && (A0E2 = c67521UnL.A0E()) != null && (A0E3 = A0E2.A0E()) != null && (c67523UnN = (C67523UnN) A0E3.A01(C67523UnN.class, -1333706087)) != null && (A0E4 = c67523UnN.A0E()) != null) {
            EnumC129485tD enumC129485tD = EnumC129485tD.A0B;
            Iterator<E> it = A0E4.iterator();
            while (it.hasNext()) {
                if (it.next() == enumC129485tD) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x001a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0M(com.facebookpay.expresscheckout.models.ECPPaymentRequest r6, X.EnumC129485tD r7) {
        /*
            r0 = 1
            r5 = 28
            X.C14360o3.A0B(r7, r0)
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r6.A01
            r3 = 0
            if (r0 == 0) goto L51
            java.util.Set<X.VDD> r4 = r0.A0H
            java.util.Set<X.VD7> r3 = r0.A0I
        Lf:
            int r2 = r7.ordinal()
            r1 = 1
            if (r2 == r5) goto L5d
            r0 = 29
            if (r2 == r0) goto L58
            switch(r2) {
                case 6: goto L34;
                case 9: goto L58;
                case 12: goto L62;
                case 22: goto L1e;
                case 25: goto L53;
                default: goto L1d;
            }
        L1d:
            return r1
        L1e:
            r1 = 0
            if (r3 == 0) goto L1d
            X.VD7 r0 = X.VD7.A07
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L4f
            X.VD7 r0 = X.VD7.A06
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L4f
            X.VD7 r0 = X.VD7.A08
            goto L49
        L34:
            r1 = 0
            if (r3 == 0) goto L1d
            X.VD7 r0 = X.VD7.A04
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L4f
            X.VD7 r0 = X.VD7.A03
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L4f
            X.VD7 r0 = X.VD7.A05
        L49:
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L1d
        L4f:
            r1 = 1
            return r1
        L51:
            r4 = r3
            goto Lf
        L53:
            if (r4 == 0) goto L6b
            X.VDD r0 = X.VDD.A0B
            goto L66
        L58:
            if (r4 == 0) goto L6b
            X.VDD r0 = X.VDD.A06
            goto L66
        L5d:
            if (r4 == 0) goto L6b
            X.VDD r0 = X.VDD.A0D
            goto L66
        L62:
            if (r4 == 0) goto L6b
            X.VDD r0 = X.VDD.A08
        L66:
            boolean r1 = r4.contains(r0)
            return r1
        L6b:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WGr.A0M(com.facebookpay.expresscheckout.models.ECPPaymentRequest, X.5tD):boolean");
    }

    public static final Be9 A01(C69478Vo1 c69478Vo1) {
        String str;
        C2JO c2jo = new C2JO();
        c2jo.A09("UPDATE_CHECKOUT", "request_type");
        ShippingAddress shippingAddress = c69478Vo1.A01;
        if (shippingAddress != null) {
            C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, true, "is_default");
            C0CA.A00(A0T, shippingAddress.A05, "label");
            C0CA.A00(A0T, shippingAddress.A00, "care_of");
            C0CA.A00(A0T, shippingAddress.A08, "street_1");
            C0CA.A00(A0T, shippingAddress.A09, "street_2");
            C0CA.A00(A0T, shippingAddress.A01, ServerW3CShippingAddressConstants.CITY);
            C0CA.A00(A0T, shippingAddress.A07, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
            C0CA.A00(A0T, shippingAddress.A06, "postal_code");
            C0CA.A00(A0T, shippingAddress.A02, "country_code");
            C0CA.A00(A0T, true, "provide_suggestion");
            AbstractC31173DnH.A1M(A0T, c2jo, "shipping_address");
            ShippingAddress shippingAddress2 = c69478Vo1.A01;
            if (shippingAddress2 != null) {
                str = shippingAddress2.A04;
            } else {
                str = null;
            }
            c2jo.A09(str, AbstractC58317Pt9.A00(12));
        }
        String str2 = c69478Vo1.A0A;
        if (str2 != null) {
            C2JO c2jo2 = new C2JO();
            c2jo2.A09(str2, "selected_shipping_option_id");
            c2jo2.A09(c69478Vo1.A0A, "shipping_option_group_id");
            c2jo.A05("shipping_options_snapshot", AbstractC166987dD.A1J(c2jo2));
        }
        String str3 = c69478Vo1.A0G;
        if (str3 != null) {
            c2jo.A09(str3, "receiver_id");
        }
        String str4 = c69478Vo1.A0F;
        if (str4 != null) {
            c2jo.A09(str4, "order_id");
        }
        String str5 = c69478Vo1.A05;
        if (str5 != null) {
            c2jo.A09(str5, "email_id");
        }
        String str6 = c69478Vo1.A08;
        if (str6 != null) {
            c2jo.A09(str6, "selected_phone_id");
        }
        List<String> list = c69478Vo1.A0C;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        for (String str7 : list) {
            C2JO c2jo3 = new C2JO();
            c2jo3.A09(str7, "selected_coupon_code");
            c2jo3.A09("PROMO_CODE", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            A0q.add(c2jo3);
        }
        c2jo.A05("incentives_snapshot", A0q);
        ArrayList arrayList = new ArrayList();
        String str8 = c69478Vo1.A04;
        if (str8 != null) {
            arrayList.add(str8);
        }
        arrayList.addAll(c69478Vo1.A0B);
        if (!arrayList.isEmpty()) {
            c2jo.A05("credential_ids", arrayList);
        }
        Be9 be9 = new Be9();
        LoggingContext loggingContext = c69478Vo1.A0E;
        be9.A07(loggingContext.A02, AbstractC63083Sc6.A00());
        be9.A07(String.valueOf(loggingContext.A00), "product_id");
        be9.A05(AbstractC58317Pt9.A00(795), AbstractC166987dD.A1J(c2jo));
        be9.A07(String.valueOf(AbstractC62320S6q.A00.getAndIncrement()), "client_mutation_id");
        return be9;
    }

    public static final CurrencyAmount A02(CurrencyAmount currencyAmount, C63406Sjd c63406Sjd) {
        ArrayList<PriceInfo> arrayList;
        float parseFloat = Float.parseFloat(currencyAmount.A01);
        TransactionInfo transactionInfo = (TransactionInfo) c63406Sjd.A01;
        if (transactionInfo != null && (arrayList = transactionInfo.A08) != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<PriceInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                PriceInfo next = it.next();
                VE5 ve5 = next.A01;
                if (ve5 == VE5.A04 || ve5 == VE5.A07) {
                    arrayList2.add(next);
                }
            }
            ArrayList A0q = AbstractC167017dG.A0q(arrayList2);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                parseFloat -= Float.parseFloat(((PriceInfo) it2.next()).A00.A01);
                A0q.add(C0eB.A00);
            }
        }
        String str = currencyAmount.A00;
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%.2f", Float.valueOf(parseFloat));
        C14360o3.A07(formatStrLocaleSafe);
        return new CurrencyAmount(str, formatStrLocaleSafe);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r2 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        return r2.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r2 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebookpay.common.models.CurrencyAmount A03(com.facebookpay.expresscheckout.models.TransactionInfo r5) {
        /*
            java.util.ArrayList<com.facebookpay.expresscheckout.models.PriceInfo> r0 = r5.A08
            r4 = 0
            if (r0 == 0) goto L25
            java.util.Iterator r3 = r0.iterator()
        L9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.facebookpay.expresscheckout.models.PriceInfo r0 = (com.facebookpay.expresscheckout.models.PriceInfo) r0
            X.VE5 r1 = r0.A01
            X.VE5 r0 = X.VE5.A0B
            if (r1 != r0) goto L9
        L1c:
            com.facebookpay.expresscheckout.models.PriceInfo r2 = (com.facebookpay.expresscheckout.models.PriceInfo) r2
            if (r2 == 0) goto L25
        L20:
            com.facebookpay.common.models.CurrencyAmount r0 = r2.A00
            return r0
        L23:
            r2 = r4
            goto L1c
        L25:
            java.util.ArrayList<com.facebookpay.expresscheckout.models.PriceInfo> r0 = r5.A07
            if (r0 == 0) goto L47
            java.util.Iterator r3 = r0.iterator()
        L2d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.facebookpay.expresscheckout.models.PriceInfo r0 = (com.facebookpay.expresscheckout.models.PriceInfo) r0
            X.VE5 r1 = r0.A01
            X.VE5 r0 = X.VE5.A0B
            if (r1 != r0) goto L2d
            r4 = r2
        L41:
            r2 = r4
            com.facebookpay.expresscheckout.models.PriceInfo r2 = (com.facebookpay.expresscheckout.models.PriceInfo) r2
            if (r2 == 0) goto L47
            goto L20
        L47:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WGr.A03(com.facebookpay.expresscheckout.models.TransactionInfo):com.facebookpay.common.models.CurrencyAmount");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r10 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        r0 = r4.A06;
        r3 = X.AbstractC167007dF.A0i(r0);
        r1 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r1.hasNext() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        r3.add(r1.next().name());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        r11 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
    
        if (r11 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
    
        r11 = com.google.common.collect.ImmutableList.of();
        X.C14360o3.A07(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        r0 = r17.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ab, code lost:
    
        if (r0 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ad, code lost:
    
        r1 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
    
        r1 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        return new X.C63019Saj(r5, r16, null, r18, r9, r10, r11, r12, r13, r14, r15, r21, r1, r19, null, r17.A07);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c9, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        if (r4 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x004b, code lost:
    
        if (r4 == null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C63019Saj A04(X.C2JO r16, com.facebookpay.expresscheckout.models.ECPPaymentRequest r17, com.facebookpay.otc.models.OtcInput r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            r13 = r20
            r0 = 0
            r2 = r17
            X.C14360o3.A0B(r2, r0)
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r4 = r2.A03
            r7 = 0
            if (r4 == 0) goto L6b
            com.facebookpay.common.models.CurrencyAmount r0 = r4.A00
            if (r0 == 0) goto L6b
            java.lang.String r3 = r0.A01
            java.lang.String r1 = r0.A00
            if (r3 == 0) goto L6b
            if (r1 == 0) goto L6b
            X.2JO r5 = new X.2JO
            r5.<init>()
            java.lang.String r0 = "amount"
            r5.A09(r3, r0)
            java.lang.String r0 = "currency_code"
            r5.A09(r1, r0)
        L28:
            java.lang.String r12 = r2.A0A
            if (r20 != 0) goto L36
            java.util.concurrent.atomic.AtomicLong r0 = X.AbstractC62320S6q.A00
            long r0 = r0.getAndIncrement()
            java.lang.String r13 = java.lang.String.valueOf(r0)
        L36:
            java.lang.String r14 = r2.A08
            com.google.common.collect.ImmutableList r9 = com.google.common.collect.ImmutableList.of()
            X.C14360o3.A07(r9)
            if (r4 == 0) goto L47
            X.VDU r0 = r4.A02
            java.lang.String r15 = r0.A00
            if (r15 != 0) goto L4d
        L47:
            X.VDU r0 = X.VDU.A04
            java.lang.String r15 = r0.A00
            if (r4 == 0) goto L74
        L4d:
            java.util.ArrayList<X.VEM> r0 = r4.A07
            if (r0 == 0) goto L74
            java.util.ArrayList r3 = X.AbstractC167007dF.A0i(r0)
            java.util.Iterator r1 = r0.iterator()
        L59:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r1.next()
            X.VEM r0 = (X.VEM) r0
            java.lang.String r0 = r0.A01
            r3.add(r0)
            goto L59
        L6b:
            r5 = r7
            goto L28
        L6d:
            com.google.common.collect.ImmutableList r10 = com.google.common.collect.ImmutableList.copyOf(r3)
            if (r10 == 0) goto L74
            goto L7d
        L74:
            com.google.common.collect.ImmutableList r10 = com.google.common.collect.ImmutableList.of()
            X.C14360o3.A07(r10)
            if (r4 == 0) goto La2
        L7d:
            java.util.ArrayList<X.VCp> r0 = r4.A06
            java.util.ArrayList r3 = X.AbstractC167007dF.A0i(r0)
            java.util.Iterator r1 = r0.iterator()
        L87:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r1.next()
            X.VCp r0 = (X.EnumC68131VCp) r0
            java.lang.String r0 = r0.name()
            r3.add(r0)
            goto L87
        L9b:
            com.google.common.collect.ImmutableList r11 = com.google.common.collect.ImmutableList.copyOf(r3)
            if (r11 == 0) goto La2
            goto La9
        La2:
            com.google.common.collect.ImmutableList r11 = com.google.common.collect.ImmutableList.of()
            X.C14360o3.A07(r11)
        La9:
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r2.A05
            if (r0 == 0) goto Lc9
            java.lang.String r1 = r0.A00
            if (r1 != 0) goto Lb3
            java.lang.String r1 = r0.A02
        Lb3:
            java.lang.String r0 = r2.A07
            X.Saj r4 = new X.Saj
            r6 = r16
            r8 = r18
            r18 = r19
            r16 = r21
            r17 = r1
            r19 = r7
            r20 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r4
        Lc9:
            r1 = r7
            goto Lb3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WGr.A04(X.2JO, com.facebookpay.expresscheckout.models.ECPPaymentRequest, com.facebookpay.otc.models.OtcInput, java.lang.String, java.lang.String, java.lang.String):X.Saj");
    }

    public static final ECPPaymentConfiguration A0A(UY3 uy3, TransactionInfo transactionInfo, String str) {
        VDU vdu;
        CurrencyAmount currencyAmount;
        EnumC68119VCc enumC68119VCc;
        int ordinal;
        ImmutableList requiredCompactedEnumListField = uy3.getRequiredCompactedEnumListField(1, "supported_container_types", EnumC68165VEj.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        C14360o3.A07(requiredCompactedEnumListField);
        ArrayList A0F = A0F(requiredCompactedEnumListField);
        EnumC68164VEi enumC68164VEi = (EnumC68164VEi) uy3.getOptionalEnumField(3, "payment_mode", EnumC68164VEi.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        if (enumC68164VEi != null && (ordinal = enumC68164VEi.ordinal()) != 1 && ordinal == 2) {
            vdu = VDU.A05;
        } else {
            vdu = VDU.A04;
        }
        String A07 = uy3.A07("security_origin");
        ImmutableList requiredCompactedEnumListField2 = uy3.getRequiredCompactedEnumListField(2, "payment_action_types", EnumC68163VEh.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        C14360o3.A07(requiredCompactedEnumListField2);
        ArrayList A0G = A0G(requiredCompactedEnumListField2);
        if (transactionInfo != null) {
            currencyAmount = A03(transactionInfo);
        } else {
            currencyAmount = null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = A0F.iterator();
        while (it.hasNext()) {
            int ordinal2 = ((VEM) it.next()).ordinal();
            if (ordinal2 != 0 && ordinal2 != 1 && ordinal2 != 5 && ordinal2 != 2) {
                if (ordinal2 == 4) {
                    enumC68119VCc = EnumC68119VCc.A03;
                }
            } else {
                enumC68119VCc = EnumC68119VCc.A02;
            }
            arrayList.add(enumC68119VCc);
        }
        return new ECPPaymentConfiguration(currencyAmount, null, vdu, str, A07, A0G, A0F, null, null, AbstractC001800i.A0k(arrayList));
    }

    public static final LoggingPolicy A0E(C66679UXp c66679UXp) {
        String A07 = c66679UXp.A07(AbstractC58317Pt9.A00(309));
        if (A07 != null) {
            ImmutableList requiredCompactedTreeListField = c66679UXp.getRequiredCompactedTreeListField(1, AbstractC58317Pt9.A00(244), C66678UXo.class, -1598475777);
            ArrayList A10 = AbstractC31174DnI.A10(requiredCompactedTreeListField);
            Iterator<E> it = requiredCompactedTreeListField.iterator();
            while (it.hasNext()) {
                C2JS c2js = (C2JS) it.next();
                EnumC61210RhA enumC61210RhA = (EnumC61210RhA) c2js.getOptionalEnumField(2, "suppression_mode", EnumC61210RhA.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                if (enumC61210RhA != null) {
                    A10.add(new ClientSuppressionPolicy(enumC61210RhA, (EnumC72401Xco) c2js.getOptionalEnumField(1, "payload_field", EnumC72401Xco.A02), c2js.A07("event_name")));
                }
            }
            ArrayList arrayList = new ArrayList();
            AbstractC001800i.A0r(A10, arrayList);
            return new LoggingPolicy(A07, arrayList);
        }
        return null;
    }

    public static final LinkedHashSet A0H(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VDD A05 = A05((EnumC129485tD) it.next());
            if (A05 != null) {
                linkedHashSet.add(A05);
            }
        }
        return linkedHashSet;
    }

    public static final LinkedHashSet A0I(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VD7 A06 = A06((EnumC68157VEb) it.next());
            if (A06 != null) {
                linkedHashSet.add(A06);
            }
        }
        return linkedHashSet;
    }

    public static final void A0J(QT6 qt6, ArrayList arrayList) {
        String str;
        String A08;
        VDV vdv;
        C2JS optionalTreeField = qt6.getOptionalTreeField(0, "amount", C66671UXh.class, -298466489);
        if (optionalTreeField != null) {
            str = optionalTreeField.getOptionalStringField(0, "currency");
        } else {
            str = null;
        }
        if (str != null) {
            C2JS optionalTreeField2 = qt6.getOptionalTreeField(0, "amount", C66671UXh.class, -298466489);
            if (optionalTreeField2 != null && (A08 = optionalTreeField2.A08("amount")) != null) {
                CurrencyAmount currencyAmount = new CurrencyAmount(str, A08);
                EnumC68159VEd enumC68159VEd = EnumC68159VEd.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                if (qt6.getOptionalEnumField(4, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, enumC68159VEd) != null) {
                    String valueOf = String.valueOf(qt6.getOptionalEnumField(4, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, enumC68159VEd));
                    C14360o3.A0B(valueOf, 0);
                    vdv = (VDV) VDV.A01.get(valueOf);
                    if (vdv == null) {
                        throw AbstractC167007dF.A0c("PriceInfoStatus is not found for identifier => ", valueOf);
                    }
                } else {
                    vdv = null;
                }
                String A082 = qt6.A08("label");
                if (A082 != null) {
                    String valueOf2 = String.valueOf(qt6.getOptionalEnumField(3, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, EnumC68160VEe.UNSET_OR_UNRECOGNIZED_ENUM_VALUE));
                    C14360o3.A0B(valueOf2, 0);
                    VE5 ve5 = (VE5) VE5.A01.get(valueOf2);
                    if (ve5 != null) {
                        arrayList.add(new PriceInfo(currencyAmount, vdv, ve5, null, A082, null, null, null));
                        return;
                    }
                    throw AbstractC167007dF.A0c("PriceInfoType is not found for identifier => ", valueOf2);
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final boolean A0L(ECPPaymentRequest eCPPaymentRequest) {
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            int i = checkoutConfiguration.A00;
            if (i == 0 || i == 8) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A0N(TransactionInfo transactionInfo) {
        ArrayList<PriceInfo> arrayList = transactionInfo.A08;
        if (arrayList != null) {
            Iterator<PriceInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                PriceInfo next = it.next();
                VE5 ve5 = next.A01;
                if (ve5 == VE5.A04 || ve5 == VE5.A07) {
                    if (next != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public static final C69379VmP A09(C67550Uno c67550Uno) {
        UXY uxy;
        UY4 A0E;
        C67523UnN c67523UnN;
        UY3 uy3;
        C66677UXn c66677UXn;
        String A08;
        C2JS A03;
        UWk A0F = c67550Uno.A0F();
        XGq xGq = null;
        if (A0F != null) {
            uxy = (UXY) A0F.A01(UXY.class, -633919572);
        } else {
            uxy = null;
        }
        if (uxy != null) {
            C67520UnK A0I = c67550Uno.A0I();
            if (A0I != null && (A0E = A0I.A0E()) != null) {
                UWi A0E2 = c67550Uno.A0E();
                if (A0E2 != null && (c67523UnN = (C67523UnN) A0E2.A01(C67523UnN.class, -1333706087)) != null) {
                    UWq A0H = c67550Uno.A0H();
                    if (A0H != null && (uy3 = (UY3) A0H.A01(UY3.class, 1367251747)) != null) {
                        C2JS optionalTreeField = c67550Uno.getOptionalTreeField(8, "link_availability", UWo.class, 2014570284);
                        if (optionalTreeField != null) {
                            c66677UXn = (C66677UXn) optionalTreeField.A01(C66677UXn.class, 1435096333);
                        } else {
                            c66677UXn = null;
                        }
                        C2JS optionalTreeField2 = c67550Uno.getOptionalTreeField(10, "embedded_bloks_apm_buttons", UWn.class, -803301311);
                        if (optionalTreeField2 != null && (A03 = optionalTreeField2.A03(UWm.class, "component", 356680169)) != null) {
                            xGq = (XGq) A03.A01(R1Z.class, -708877377);
                        }
                        ImmutableList A0K = c67550Uno.A0K();
                        ArrayList A10 = AbstractC31174DnI.A10(A0K);
                        Iterator<E> it = A0K.iterator();
                        while (it.hasNext()) {
                            C2JS c2js = (C2JS) it.next();
                            EnumC68194VFm enumC68194VFm = (EnumC68194VFm) c2js.getOptionalEnumField(0, "key", EnumC68194VFm.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                            if (enumC68194VFm != null && (A08 = c2js.A08(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)) != null) {
                                A10.add(new CheckoutPayloadKeyValue(enumC68194VFm, A08));
                            }
                        }
                        return new C69379VmP(c67523UnN, uxy, c66677UXn, uy3, A0E, xGq, new ArrayList(A10));
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final EnumC72407Xcu A0D(R1R r1r) {
        EnumC72407Xcu enumC72407Xcu;
        EnumC72407Xcu enumC72407Xcu2 = null;
        if (r1r.A0E() != null) {
            QVX A0E = r1r.A0E();
            if (A0E == null || (enumC72407Xcu2 = (EnumC72407Xcu) A0E.getOptionalEnumField(3, "credential_type", EnumC72407Xcu.A09)) == null) {
                throw new IllegalStateException("Required value was null.");
            }
        } else if (r1r.A0F() != null) {
            QVZ A0F = r1r.A0F();
            if (A0F != null && (enumC72407Xcu = (EnumC72407Xcu) A0F.getOptionalEnumField(1, "credential_type", EnumC72407Xcu.A09)) != null) {
                return enumC72407Xcu;
            }
            throw new IllegalStateException("Required value was null.");
        }
        return enumC72407Xcu2;
    }

    public static final ArrayList A0F(List list) {
        VEM vem;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            switch (((EnumC68165VEj) it.next()).ordinal()) {
                case 1:
                    vem = VEM.A05;
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unrecognized GraphQLPaymentContainerTypes");
                case 3:
                    vem = VEM.A06;
                    break;
                case 4:
                    vem = VEM.A07;
                    break;
                case 5:
                    vem = VEM.A08;
                    break;
                case 6:
                    vem = VEM.A09;
                    break;
                case 7:
                    vem = VEM.A0A;
                    break;
            }
            A0q.add(vem);
        }
        ArrayList arrayList = new ArrayList();
        AbstractC001800i.A0r(A0q, arrayList);
        return arrayList;
    }

    public static final ArrayList A0G(List list) {
        EnumC68131VCp enumC68131VCp;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int ordinal = ((EnumC68163VEh) it.next()).ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        enumC68131VCp = EnumC68131VCp.A04;
                    } else {
                        throw new IllegalArgumentException("Unrecognized GraphQLPaymentContainerActionType");
                    }
                } else {
                    enumC68131VCp = EnumC68131VCp.A03;
                }
            } else {
                enumC68131VCp = EnumC68131VCp.A02;
            }
            A0q.add(enumC68131VCp);
        }
        ArrayList arrayList = new ArrayList();
        AbstractC001800i.A0r(A0q, arrayList);
        return arrayList;
    }
}
