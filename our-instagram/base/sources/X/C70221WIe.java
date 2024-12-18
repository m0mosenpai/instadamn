package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.TextUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.common.locale.Country;
import com.facebook.forker.Process;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.models.Distance;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.IncentiveItem;
import com.facebookpay.common.recyclerview.adapteritems.IncentiveSummaryItem;
import com.facebookpay.common.recyclerview.adapteritems.InlineBackButtonItem;
import com.facebookpay.common.recyclerview.adapteritems.InlineFormItem;
import com.facebookpay.common.recyclerview.adapteritems.InvisibleHeaderItem;
import com.facebookpay.common.recyclerview.adapteritems.PayButtonItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxAccordionItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxBannerItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxContactItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxEntityItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxFulfillmentOptionItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxPriceTableItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxReceiverHeaderItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxTermsConditionItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionIncentiveEmbeddedBloksItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionNameViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionOfferViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPickupFulfillmentOptionItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPromoCodeViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionShippingFulfillmentOptionItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionTextViewItem;
import com.facebookpay.confirmation.model.ECPConfirmationParams;
import com.facebookpay.confirmation.model.ECPConfirmationUpsellAction;
import com.facebookpay.confirmation.model.ECPConfirmationUpsellSection;
import com.facebookpay.expresscheckout.logging.ComponentLoggingData;
import com.facebookpay.expresscheckout.models.APMConfiguration;
import com.facebookpay.expresscheckout.models.AuthScreenStyle;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.CheckoutPayloadKeyValue;
import com.facebookpay.expresscheckout.models.CheckoutResponse;
import com.facebookpay.expresscheckout.models.CheckoutSetupKeyValue;
import com.facebookpay.expresscheckout.models.DefaultCreditCardFields;
import com.facebookpay.expresscheckout.models.DefaultPaymentMethodFields;
import com.facebookpay.expresscheckout.models.ECPAvailabilityRequestParams;
import com.facebookpay.expresscheckout.models.ECPAvailabilityResponseParams;
import com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration;
import com.facebookpay.expresscheckout.models.ECPOffer;
import com.facebookpay.expresscheckout.models.ECPPaymentConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.expresscheckout.models.ECPPreselectedFBPayData;
import com.facebookpay.expresscheckout.models.EcpNuxLearnMoreScreenStyle;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;
import com.facebookpay.expresscheckout.models.FulfillmentOption;
import com.facebookpay.expresscheckout.models.FulfillmentOptions;
import com.facebookpay.expresscheckout.models.ItemDetails;
import com.facebookpay.expresscheckout.models.KnownData;
import com.facebookpay.expresscheckout.models.OffersList;
import com.facebookpay.expresscheckout.models.PaymentHandledResponseData;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.models.PickupFulfillmentOption;
import com.facebookpay.expresscheckout.models.PickupInfo;
import com.facebookpay.expresscheckout.models.PriceInfo;
import com.facebookpay.expresscheckout.models.PromoCodeList;
import com.facebookpay.expresscheckout.models.ShippingOption;
import com.facebookpay.expresscheckout.models.ShippingOptions;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.form.cell.address.AddressCellParams;
import com.facebookpay.form.cell.address.BriefAddressCellParams;
import com.facebookpay.form.cell.addresslist.AddressListCellParams;
import com.facebookpay.form.cell.addresslist.AddressListHeaderCellParams;
import com.facebookpay.form.cell.apm.APMLinkCellParams;
import com.facebookpay.form.cell.checkbox.CheckboxCellParams;
import com.facebookpay.form.cell.contactinfo.ContactInfoCellParams;
import com.facebookpay.form.cell.creditcard.CardScannerCellParams;
import com.facebookpay.form.cell.creditcard.CreditCardCellParams;
import com.facebookpay.form.cell.fulfillmentoption.FulfillmentOptionCellParams;
import com.facebookpay.form.cell.label.LabelCellParams;
import com.facebookpay.form.cell.label.paymentmethod.PaymentMethodLabelCellParams;
import com.facebookpay.form.cell.label.paymentmethod.SupportedLogosCellParams;
import com.facebookpay.form.cell.logging.FormCellFocusEvents;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.facebookpay.form.cell.selector.SelectorCellParams;
import com.facebookpay.form.cell.text.TextCellParams;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.facebookpay.form.cell.text.formatter.CreditCardFormatter;
import com.facebookpay.form.cell.text.formatter.DateFormatter;
import com.facebookpay.form.cell.text.formatter.NameFormatter;
import com.facebookpay.form.cell.text.formatter.PhoneFormatter;
import com.facebookpay.form.cell.text.formatter.UpperCaseFormatter;
import com.facebookpay.form.cell.text.util.CvvTextFieldHandler;
import com.facebookpay.form.cell.toggle.SwitchCellParams;
import com.facebookpay.form.fragment.model.FeatureConfiguration;
import com.facebookpay.form.fragment.model.FormClickEvent;
import com.facebookpay.form.fragment.model.FormDisplayEvent;
import com.facebookpay.form.fragment.model.FormLoggingEvents;
import com.facebookpay.form.fragment.model.FormMutationEvent;
import com.facebookpay.form.fragment.model.FormParams;
import com.facebookpay.form.fragment.model.ListCellParams;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.form.model.FormCountry;
import com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.logging.LoggingPolicy;
import com.facebookpay.otc.models.OtcInput;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.google.common.collect.ImmutableMap;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: X.WIe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70221WIe implements Parcelable.Creator {
    public final int A00;

    public static VG3 A00(Parcel parcel) {
        C14360o3.A0B(parcel, 0);
        return VG3.valueOf(parcel.readString());
    }

    public C70221WIe(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Type inference failed for: r8v73, types: [com.facebookpay.form.cell.CellParams, java.lang.Object, com.facebookpay.form.cell.addresslist.AddressListCellParams] */
    /* JADX WARN: Type inference failed for: r8v74, types: [com.facebookpay.form.cell.CellParams, com.facebookpay.form.cell.addresslist.AddressListHeaderCellParams, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v76, types: [com.facebookpay.form.cell.CellParams, java.lang.Object, com.facebookpay.form.cell.checkbox.CheckboxCellParams] */
    /* JADX WARN: Type inference failed for: r8v80, types: [com.facebookpay.form.cell.CellParams, com.facebookpay.form.cell.fulfillmentoption.FulfillmentOptionCellParams, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v83, types: [com.facebookpay.form.cell.CellParams, com.facebookpay.form.cell.label.paymentmethod.SupportedLogosCellParams, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        EnumC68202VFu valueOf;
        Integer A00;
        Integer A002;
        ArrayList arrayList;
        Integer num;
        EnumC61212RhC valueOf2;
        EnumC61219RhJ valueOf3;
        Boolean valueOf4;
        Integer A0U;
        Object createFromParcel;
        EnumC68202VFu valueOf5;
        EnumC68202VFu valueOf6;
        Boolean valueOf7;
        Boolean valueOf8;
        Boolean valueOf9;
        Boolean valueOf10;
        Boolean valueOf11;
        Boolean valueOf12;
        Integer A003;
        Boolean valueOf13;
        Boolean valueOf14;
        Integer A004;
        EnumC61219RhJ valueOf15;
        Object createFromParcel2;
        Object createFromParcel3;
        Object createFromParcel4;
        LinkedHashMap linkedHashMap;
        Object createFromParcel5;
        Object createFromParcel6;
        Object createFromParcel7;
        Object createFromParcel8;
        LinkedHashSet linkedHashSet;
        EnumC72407Xcu valueOf16;
        Long valueOf17;
        Object createFromParcel9;
        Integer num2;
        VE5 valueOf18;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object createFromParcel10;
        Object createFromParcel11;
        Object createFromParcel12;
        Integer A005;
        EnumC61219RhJ enumC61219RhJ;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Object createFromParcel13;
        Object createFromParcel14;
        Object createFromParcel15;
        ArrayList arrayList6;
        ArrayList arrayList7;
        Object createFromParcel16;
        Integer A0U2;
        Integer A0U3;
        Object createFromParcel17;
        VET valueOf19;
        Object createFromParcel18;
        Object createFromParcel19;
        Integer A0U4;
        ArrayList arrayList8;
        Integer num3;
        EnumC61219RhJ valueOf20;
        switch (this.A00) {
            case 0:
                return new IncentiveItem(A00(parcel), parcel.createStringArrayList(), parcel.readInt(), AbstractC37304Gc5.A1V(parcel));
            case 1:
                return new IncentiveSummaryItem(A00(parcel), parcel.createStringArrayList(), parcel.readInt());
            case 2:
                return new InlineBackButtonItem(A00(parcel), parcel.readString());
            case 3:
                return new InlineFormItem(A00(parcel), (FormParams) AbstractC37304Gc5.A04(parcel, InlineFormItem.class), parcel.readString());
            case 4:
                return new InvisibleHeaderItem(A00(parcel));
            case 5:
                return new PayButtonItem((CurrencyAmount) AbstractC37304Gc5.A04(parcel, PayButtonItem.class), A00(parcel), parcel.readString(), AbstractC37304Gc5.A1V(parcel));
            case 6:
                VG3 A006 = A00(parcel);
                C63406Sjd c63406Sjd = (C63406Sjd) AbstractC58321PtD.A0n(parcel, PuxAccordionItem.class);
                int readInt = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList9.add(AbstractC58321PtD.A0n(parcel, PuxAccordionItem.class));
                }
                return new PuxAccordionItem(A006, (C69333Vlf) AbstractC58321PtD.A0n(parcel, PuxAccordionItem.class), c63406Sjd, arrayList9, AbstractC37304Gc5.A1V(parcel));
            case 7:
                VG3 A007 = A00(parcel);
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = EnumC68202VFu.valueOf(parcel.readString());
                }
                return new PuxBannerItem((R0Z) AbstractC58321PtD.A0n(parcel, PuxBannerItem.class), A007, valueOf, (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), readString, AbstractC37304Gc5.A1V(parcel));
            case 8:
                return new PuxContactItem(A00(parcel), AbstractC37304Gc5.A0V(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), AbstractC37304Gc5.A1V(parcel));
            case 9:
                return new PuxEntityItem((CurrencyAmount) AbstractC37304Gc5.A04(parcel, PuxEntityItem.class), A00(parcel), (ItemDetails) AbstractC37304Gc5.A04(parcel, PuxEntityItem.class), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 10:
                VG3 A008 = A00(parcel);
                FulfillmentOptionComponent fulfillmentOptionComponent = (FulfillmentOptionComponent) AbstractC37304Gc5.A04(parcel, PuxFulfillmentOptionItem.class);
                boolean z = false;
                boolean A1M = AbstractC167007dF.A1M(parcel.readInt());
                if (parcel.readInt() != 0) {
                    z = true;
                }
                Integer num4 = null;
                if (parcel.readInt() == 0) {
                    A00 = null;
                } else {
                    A00 = AbstractC69841VwR.A00(parcel.readString());
                }
                if (parcel.readInt() != 0) {
                    num4 = AbstractC69840VwQ.A00(parcel.readString());
                }
                return new PuxFulfillmentOptionItem(A008, fulfillmentOptionComponent, A00, num4, A1M, z);
            case 11:
                return new PuxOrderSummaryItem((CurrencyAmount) AbstractC37304Gc5.A04(parcel, PuxOrderSummaryItem.class), (CurrencyAmount) AbstractC37304Gc5.A04(parcel, PuxOrderSummaryItem.class), A00(parcel), (ItemDetails) AbstractC37304Gc5.A04(parcel, PuxOrderSummaryItem.class), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt(), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new PuxPaymentMethodItem(A00(parcel), (PaymentMethod) AbstractC37304Gc5.A04(parcel, PuxPaymentMethodItem.class), AbstractC37304Gc5.A0V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                VG3 A009 = A00(parcel);
                Integer num5 = null;
                if (parcel.readInt() == 0) {
                    A002 = null;
                } else {
                    A002 = AbstractC69841VwR.A00(parcel.readString());
                }
                if (parcel.readInt() != 0) {
                    num5 = AbstractC69840VwQ.A00(parcel.readString());
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    AbstractC37304Gc5.A0r(parcel, PuxPriceTableItem.class, arrayList10);
                }
                return new PuxPriceTableItem(A009, A002, num5, arrayList10);
            case 14:
                return new PuxReceiverHeaderItem(A00(parcel), parcel.readString(), parcel.readString());
            case Process.SIGTERM /* 15 */:
                return new PuxShippingAddressItem(A00(parcel), (ShippingAddress) AbstractC37304Gc5.A04(parcel, PuxShippingAddressItem.class), parcel.readString(), parcel.readString(), parcel.readString(), AbstractC37304Gc5.A1V(parcel));
            case 16:
                VG3 A0010 = A00(parcel);
                String readString2 = parcel.readString();
                R0Z r0z = (R0Z) AbstractC58321PtD.A0n(parcel, PuxTermsConditionItem.class);
                String readString3 = parcel.readString();
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                R0Z r0z2 = (R0Z) AbstractC58321PtD.A0n(parcel, PuxTermsConditionItem.class);
                R0Z r0z3 = (R0Z) AbstractC58321PtD.A0n(parcel, PuxTermsConditionItem.class);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt3 = parcel.readInt();
                    arrayList = new ArrayList(readInt3);
                    for (int i3 = 0; i3 != readInt3; i3++) {
                        arrayList.add(AbstractC58321PtD.A0n(parcel, PuxTermsConditionItem.class));
                    }
                }
                return new PuxTermsConditionItem(r0z, r0z2, r0z3, (R0Z) AbstractC58321PtD.A0n(parcel, PuxTermsConditionItem.class), A0010, readString2, readString3, createStringArrayList, arrayList, AbstractC37304Gc5.A1V(parcel));
            case 17:
                VG3 A0011 = A00(parcel);
                Integer num6 = null;
                if (parcel.readInt() != 0) {
                    num6 = AbstractC37304Gc5.A0U(parcel);
                }
                return new SelectionActionViewItem(A0011, num6, AbstractC37304Gc5.A0X(parcel), parcel.readString(), parcel.readString());
            case 18:
                VG3 A0012 = A00(parcel);
                Integer A0013 = AbstractC69837VwN.A00(parcel.readString());
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                boolean z2 = false;
                boolean A1M2 = AbstractC167007dF.A1M(parcel.readInt());
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                return new SelectionEmailViewItem(A0012, A0013, readString4, readString5, readString6, parcel.readString(), A1M2, z2);
            case Process.SIGSTOP /* 19 */:
                return new SelectionFulfillmentOptionItem((CurrencyAmount) AbstractC37304Gc5.A04(parcel, SelectionFulfillmentOptionItem.class), A00(parcel), AbstractC69837VwN.A00(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
            case 20:
                VG3 A0014 = A00(parcel);
                String readString7 = parcel.readString();
                Integer A0V = AbstractC37304Gc5.A0V(parcel);
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                if (readString9.equals("CREDENTIAL_TYPE_HEADER")) {
                    num = C05F.A00;
                } else if (readString9.equals("SECTION_HEADER")) {
                    num = C05F.A01;
                } else if (readString9.equals("ACCORDION_HEADER")) {
                    num = C05F.A0C;
                } else if (readString9.equals("ACCORDION_HEADER_NO_RIGHT_ADDON")) {
                    num = C05F.A0N;
                } else if (readString9.equals("PICKUP_CONTACT_HEADER")) {
                    num = C05F.A0Y;
                } else if (readString9.equals("ORDER_SUMMARY_HEADER_WITH_PICKUP")) {
                    num = C05F.A0j;
                } else {
                    throw new IllegalArgumentException(readString9);
                }
                return new SelectionHeaderItem(A0014, A0V, num, readString7, readString8);
            case 21:
                VG3 A0015 = A00(parcel);
                XGq xGq = (XGq) AbstractC58321PtD.A0n(parcel, SelectionIncentiveEmbeddedBloksItem.class);
                int readInt4 = parcel.readInt();
                ArrayList arrayList11 = new ArrayList(readInt4);
                for (int i4 = 0; i4 != readInt4; i4++) {
                    int readInt5 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt5);
                    for (int i5 = 0; i5 != readInt5; i5++) {
                        linkedHashMap2.put(parcel.readString(), AbstractC58321PtD.A0n(parcel, SelectionIncentiveEmbeddedBloksItem.class));
                    }
                    arrayList11.add(linkedHashMap2);
                }
                return new SelectionIncentiveEmbeddedBloksItem(xGq, A0015, arrayList11, parcel.createStringArrayList(), (InterfaceC16660sJ) parcel.readSerializable(), (InterfaceC16660sJ) parcel.readSerializable(), AbstractC37304Gc5.A1V(parcel));
            case 22:
                return new SelectionNameViewItem(A00(parcel), AbstractC69837VwN.A00(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
            case 23:
                return new SelectionOfferViewItem(A00(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), AbstractC37304Gc5.A1V(parcel));
            case 24:
                VG3 A0016 = A00(parcel);
                Integer A0017 = AbstractC69837VwN.A00(parcel.readString());
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Integer num7 = null;
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = EnumC61212RhC.valueOf(parcel.readString());
                }
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                XJm xJm = (XJm) AbstractC58321PtD.A0n(parcel, SelectionPaymentMethodItem.class);
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = EnumC61219RhJ.valueOf(parcel.readString());
                }
                String readString15 = parcel.readString();
                Integer A0Y = AbstractC37304Gc5.A0Y(parcel);
                UWg uWg = (UWg) AbstractC58321PtD.A0n(parcel, SelectionPaymentMethodItem.class);
                EnumC72407Xcu valueOf21 = EnumC72407Xcu.valueOf(parcel.readString());
                String readString16 = parcel.readString();
                if (parcel.readInt() != 0) {
                    num7 = AbstractC37304Gc5.A0U(parcel);
                }
                return new SelectionPaymentMethodItem(uWg, A0016, xJm, valueOf21, valueOf2, valueOf3, A0017, A0Y, num7, readString10, readString11, readString12, readString13, readString14, readString15, readString16, parcel.readString(), parcel.readString(), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case 25:
                VG3 A0018 = A00(parcel);
                Integer A0019 = AbstractC69837VwN.A00(parcel.readString());
                String readString17 = parcel.readString();
                String readString18 = parcel.readString();
                String readString19 = parcel.readString();
                boolean z3 = false;
                boolean A1M3 = AbstractC167007dF.A1M(parcel.readInt());
                if (parcel.readInt() != 0) {
                    z3 = true;
                }
                return new SelectionPhoneNumberViewItem(A0018, A0019, readString17, readString18, readString19, parcel.readString(), A1M3, z3);
            case 26:
                VG3 A0020 = A00(parcel);
                Integer A0021 = AbstractC69837VwN.A00(parcel.readString());
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                CurrencyAmount currencyAmount = (CurrencyAmount) AbstractC37304Gc5.A04(parcel, SelectionPickupFulfillmentOptionItem.class);
                String readString22 = parcel.readString();
                Date date = (Date) parcel.readSerializable();
                Date date2 = (Date) parcel.readSerializable();
                ShippingAddress shippingAddress = (ShippingAddress) AbstractC37304Gc5.A04(parcel, SelectionPickupFulfillmentOptionItem.class);
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                return new SelectionPickupFulfillmentOptionItem(currencyAmount, (Distance) AbstractC37304Gc5.A04(parcel, SelectionPickupFulfillmentOptionItem.class), A0020, shippingAddress, valueOf4, A0021, readString20, readString21, readString22, date, date2, AbstractC37304Gc5.A1V(parcel));
            case 27:
                return new SelectionPromoCodeViewItem(A00(parcel), parcel.readString());
            case 28:
                VG3 A0022 = A00(parcel);
                Integer A0023 = AbstractC69837VwN.A00(parcel.readString());
                String readString23 = parcel.readString();
                String readString24 = parcel.readString();
                String readString25 = parcel.readString();
                String readString26 = parcel.readString();
                String readString27 = parcel.readString();
                String readString28 = parcel.readString();
                String readString29 = parcel.readString();
                String readString30 = parcel.readString();
                String readString31 = parcel.readString();
                String readString32 = parcel.readString();
                String readString33 = parcel.readString();
                String readString34 = parcel.readString();
                ArrayList arrayList12 = null;
                if (parcel.readInt() == 0) {
                    A0U = null;
                } else {
                    A0U = AbstractC37304Gc5.A0U(parcel);
                }
                String readString35 = parcel.readString();
                boolean A1V = AbstractC37304Gc5.A1V(parcel);
                String readString36 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt6 = parcel.readInt();
                    arrayList12 = new ArrayList(readInt6);
                    for (int i6 = 0; i6 != readInt6; i6++) {
                        arrayList12.add(VDs.valueOf(parcel.readString()));
                    }
                }
                return new SelectionShippingAddressItem(A0022, A0023, A0U, readString23, readString24, readString25, readString26, readString27, readString28, readString29, readString30, readString31, readString32, readString33, readString34, readString35, readString36, arrayList12, A1V);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new SelectionShippingFulfillmentOptionItem((CurrencyAmount) AbstractC37304Gc5.A04(parcel, SelectionShippingFulfillmentOptionItem.class), A00(parcel), AbstractC69837VwN.A00(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), (Date) parcel.readSerializable(), (Date) parcel.readSerializable());
            case 30:
                return new SelectionTextViewItem(A00(parcel), AbstractC37304Gc5.A0V(parcel), parcel.readString(), AbstractC37304Gc5.A1V(parcel));
            case 31:
                String A0d = AbstractC37304Gc5.A0d(parcel);
                String readString37 = parcel.readString();
                String readString38 = parcel.readString();
                String readString39 = parcel.readString();
                String readString40 = parcel.readString();
                if (parcel.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = ECPConfirmationUpsellSection.CREATOR.createFromParcel(parcel);
                }
                return new ECPConfirmationParams((ECPConfirmationUpsellSection) createFromParcel, A0d, readString37, readString38, readString39, readString40, parcel.readString());
            case 32:
                return new ECPConfirmationUpsellAction(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 33:
                String A0d2 = AbstractC37304Gc5.A0d(parcel);
                int readInt7 = parcel.readInt();
                ArrayList arrayList13 = new ArrayList(readInt7);
                int i7 = 0;
                while (i7 != readInt7) {
                    i7 = AbstractC37304Gc5.A01(parcel, ECPConfirmationUpsellAction.CREATOR, arrayList13, i7);
                }
                return new ECPConfirmationUpsellSection(A0d2, arrayList13);
            case 34:
                return new ComponentLoggingData((ImmutableMap) parcel.readSerializable(), AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 35:
                return new AuthScreenStyle(AbstractC37304Gc5.A00(parcel));
            case 36:
                String A0d3 = AbstractC37304Gc5.A0d(parcel);
                int readInt8 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt8);
                boolean z4 = false;
                for (int i8 = 0; i8 != readInt8; i8++) {
                    linkedHashSet2.add(VDD.valueOf(parcel.readString()));
                }
                int readInt9 = parcel.readInt();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(readInt9);
                for (int i9 = 0; i9 != readInt9; i9++) {
                    linkedHashSet3.add(VD7.valueOf(parcel.readString()));
                }
                String readString41 = parcel.readString();
                boolean A1V2 = AbstractC37304Gc5.A1V(parcel);
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    valueOf5 = null;
                } else {
                    valueOf5 = EnumC68202VFu.valueOf(parcel.readString());
                }
                if (parcel.readInt() == 0) {
                    valueOf6 = null;
                } else {
                    valueOf6 = EnumC68202VFu.valueOf(parcel.readString());
                }
                if (parcel.readInt() == 0) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                if (parcel.readInt() == 0) {
                    valueOf8 = null;
                } else {
                    valueOf8 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                if (parcel.readInt() == 0) {
                    valueOf9 = null;
                } else {
                    valueOf9 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                if (parcel.readInt() == 0) {
                    valueOf10 = null;
                } else {
                    valueOf10 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                APMConfiguration aPMConfiguration = (APMConfiguration) AbstractC37304Gc5.A04(parcel, CheckoutConfiguration.class);
                String readString42 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf11 = null;
                } else {
                    valueOf11 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                if (parcel.readInt() == 0) {
                    valueOf12 = null;
                } else {
                    valueOf12 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                if (parcel.readInt() == 0) {
                    A003 = null;
                } else {
                    A003 = AbstractC69840VwQ.A00(parcel.readString());
                }
                if (parcel.readInt() == 0) {
                    valueOf13 = null;
                } else {
                    valueOf13 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                int readInt10 = parcel.readInt();
                boolean A1V3 = AbstractC37304Gc5.A1V(parcel);
                if (parcel.readInt() == 0) {
                    valueOf14 = null;
                } else {
                    valueOf14 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                boolean A1V4 = AbstractC37304Gc5.A1V(parcel);
                if (parcel.readInt() != 0) {
                    if (parcel.readInt() != 0) {
                        z4 = true;
                    }
                    bool = Boolean.valueOf(z4);
                }
                return new CheckoutConfiguration(aPMConfiguration, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, bool, A003, A0d3, readString41, readString42, linkedHashSet2, linkedHashSet3, readInt10, A1V2, A1V3, A1V4);
            case 37:
                return new CheckoutPayloadKeyValue(EnumC68194VFm.valueOf(AbstractC37304Gc5.A0d(parcel)), parcel.readString());
            case 38:
                String A0d4 = AbstractC37304Gc5.A0d(parcel);
                Object obj = null;
                if (parcel.readInt() == 0) {
                    A004 = null;
                } else {
                    A004 = W6X.A00(parcel.readString());
                }
                String readString43 = parcel.readString();
                if (parcel.readInt() != 0) {
                    obj = ECPPaymentResponseParams.CREATOR.createFromParcel(parcel);
                }
                return new CheckoutResponse((ECPPaymentResponseParams) obj, A004, A0d4, readString43);
            case 39:
                return new CheckoutSetupKeyValue(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 40:
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    valueOf15 = null;
                } else {
                    valueOf15 = EnumC61219RhJ.valueOf(parcel.readString());
                }
                return new DefaultCreditCardFields(valueOf15, parcel.readString());
            case Seq.NULL_REFNUM /* 41 */:
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    createFromParcel2 = null;
                } else {
                    createFromParcel2 = DefaultCreditCardFields.CREATOR.createFromParcel(parcel);
                }
                return new DefaultPaymentMethodFields((DefaultCreditCardFields) createFromParcel2);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                String A0d5 = AbstractC37304Gc5.A0d(parcel);
                String readString44 = parcel.readString();
                int readInt11 = parcel.readInt();
                PaymentReceiverInfo paymentReceiverInfo = (PaymentReceiverInfo) PaymentReceiverInfo.CREATOR.createFromParcel(parcel);
                String readString45 = parcel.readString();
                String readString46 = parcel.readString();
                int readInt12 = parcel.readInt();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet(readInt12);
                for (int i10 = 0; i10 != readInt12; i10++) {
                    linkedHashSet4.add(VDD.valueOf(parcel.readString()));
                }
                int readInt13 = parcel.readInt();
                LinkedHashSet linkedHashSet5 = new LinkedHashSet(readInt13);
                for (int i11 = 0; i11 != readInt13; i11++) {
                    linkedHashSet5.add(VD7.valueOf(parcel.readString()));
                }
                return new ECPAvailabilityRequestParams((ECPPaymentConfiguration) ECPPaymentConfiguration.CREATOR.createFromParcel(parcel), paymentReceiverInfo, (LoggingPolicy) AbstractC37304Gc5.A04(parcel, ECPAvailabilityRequestParams.class), A0d5, readString44, readString45, readString46, linkedHashSet4, linkedHashSet5, readInt11, AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case 43:
                int A0024 = AbstractC37304Gc5.A00(parcel);
                boolean z5 = true;
                boolean A1M4 = AbstractC167007dF.A1M(parcel.readInt());
                if (parcel.readInt() == 0) {
                    z5 = false;
                }
                if (parcel.readInt() == 0) {
                    createFromParcel3 = null;
                } else {
                    createFromParcel3 = DefaultPaymentMethodFields.CREATOR.createFromParcel(parcel);
                }
                return new ECPAvailabilityResponseParams((DefaultPaymentMethodFields) createFromParcel3, A0024, A1M4, z5);
            case 44:
                C14360o3.A0B(parcel, 0);
                return new ECPConfirmationConfiguration((ECPConfirmationUpsellSection) AbstractC37304Gc5.A04(parcel, ECPConfirmationConfiguration.class), parcel.readString());
            case 45:
                return new ECPOffer(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                VDU valueOf22 = VDU.valueOf(AbstractC37304Gc5.A0d(parcel));
                String readString47 = parcel.readString();
                String readString48 = parcel.readString();
                int readInt14 = parcel.readInt();
                ArrayList arrayList14 = new ArrayList(readInt14);
                for (int i12 = 0; i12 != readInt14; i12++) {
                    arrayList14.add(EnumC68131VCp.valueOf(parcel.readString()));
                }
                CurrencyAmount currencyAmount2 = (CurrencyAmount) AbstractC37304Gc5.A04(parcel, ECPPaymentConfiguration.class);
                int readInt15 = parcel.readInt();
                ArrayList arrayList15 = new ArrayList(readInt15);
                for (int i13 = 0; i13 != readInt15; i13++) {
                    arrayList15.add(VEM.valueOf(parcel.readString()));
                }
                LinkedHashSet linkedHashSet6 = null;
                if (parcel.readInt() == 0) {
                    createFromParcel4 = null;
                } else {
                    createFromParcel4 = KnownData.CREATOR.createFromParcel(parcel);
                }
                KnownData knownData = (KnownData) createFromParcel4;
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt16 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt16);
                    for (int i14 = 0; i14 != readInt16; i14++) {
                        linkedHashMap.put(VEM.valueOf(parcel.readString()), parcel.readBundle(ECPPaymentConfiguration.class.getClassLoader()));
                    }
                }
                if (parcel.readInt() != 0) {
                    int readInt17 = parcel.readInt();
                    linkedHashSet6 = new LinkedHashSet(readInt17);
                    for (int i15 = 0; i15 != readInt17; i15++) {
                        linkedHashSet6.add(EnumC68119VCc.valueOf(parcel.readString()));
                    }
                }
                return new ECPPaymentConfiguration(currencyAmount2, knownData, valueOf22, readString47, readString48, arrayList14, arrayList15, createStringArrayList2, linkedHashMap, linkedHashSet6);
            case 47:
                String A0d6 = AbstractC37304Gc5.A0d(parcel);
                String readString49 = parcel.readString();
                EcpUIConfiguration ecpUIConfiguration = (EcpUIConfiguration) EcpUIConfiguration.CREATOR.createFromParcel(parcel);
                String readString50 = parcel.readString();
                String readString51 = parcel.readString();
                int readInt18 = parcel.readInt();
                Object obj2 = null;
                if (parcel.readInt() == 0) {
                    createFromParcel5 = null;
                } else {
                    createFromParcel5 = PaymentReceiverInfo.CREATOR.createFromParcel(parcel);
                }
                PaymentReceiverInfo paymentReceiverInfo2 = (PaymentReceiverInfo) createFromParcel5;
                if (parcel.readInt() == 0) {
                    createFromParcel6 = null;
                } else {
                    createFromParcel6 = CheckoutConfiguration.CREATOR.createFromParcel(parcel);
                }
                CheckoutConfiguration checkoutConfiguration = (CheckoutConfiguration) createFromParcel6;
                if (parcel.readInt() == 0) {
                    createFromParcel7 = null;
                } else {
                    createFromParcel7 = ECPPaymentConfiguration.CREATOR.createFromParcel(parcel);
                }
                ECPPaymentConfiguration eCPPaymentConfiguration = (ECPPaymentConfiguration) createFromParcel7;
                LoggingPolicy loggingPolicy = (LoggingPolicy) AbstractC37304Gc5.A04(parcel, ECPPaymentRequest.class);
                if (parcel.readInt() != 0) {
                    obj2 = ECPConfirmationConfiguration.CREATOR.createFromParcel(parcel);
                }
                return new ECPPaymentRequest(checkoutConfiguration, (ECPConfirmationConfiguration) obj2, eCPPaymentConfiguration, ecpUIConfiguration, paymentReceiverInfo2, loggingPolicy, A0d6, readString49, readString50, readString51, readInt18, AbstractC37304Gc5.A1V(parcel));
            case 48:
                String A0d7 = AbstractC37304Gc5.A0d(parcel);
                int readInt19 = parcel.readInt();
                String readString52 = parcel.readString();
                String readString53 = parcel.readString();
                String readString54 = parcel.readString();
                String readString55 = parcel.readString();
                String readString56 = parcel.readString();
                String readString57 = parcel.readString();
                String readString58 = parcel.readString();
                String readString59 = parcel.readString();
                String readString60 = parcel.readString();
                String readString61 = parcel.readString();
                String readString62 = parcel.readString();
                String readString63 = parcel.readString();
                String readString64 = parcel.readString();
                ShippingAddress shippingAddress2 = (ShippingAddress) AbstractC37304Gc5.A04(parcel, ECPPaymentResponseParams.class);
                ShippingAddress shippingAddress3 = (ShippingAddress) AbstractC37304Gc5.A04(parcel, ECPPaymentResponseParams.class);
                if (parcel.readInt() == 0) {
                    createFromParcel8 = null;
                } else {
                    createFromParcel8 = ShippingOption.CREATOR.createFromParcel(parcel);
                }
                ShippingOption shippingOption = (ShippingOption) createFromParcel8;
                FulfillmentOption fulfillmentOption = (FulfillmentOption) AbstractC37304Gc5.A04(parcel, ECPPaymentResponseParams.class);
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int readInt20 = parcel.readInt();
                    linkedHashSet = new LinkedHashSet(readInt20);
                    for (int i16 = 0; i16 != readInt20; i16++) {
                        linkedHashSet.add(VD7.valueOf(parcel.readString()));
                    }
                }
                String readString65 = parcel.readString();
                String readString66 = parcel.readString();
                String readString67 = parcel.readString();
                String readString68 = parcel.readString();
                OtcInput otcInput = (OtcInput) AbstractC37304Gc5.A04(parcel, ECPPaymentResponseParams.class);
                int readInt21 = parcel.readInt();
                ArrayList arrayList16 = new ArrayList(readInt21);
                int i17 = 0;
                while (i17 != readInt21) {
                    i17 = AbstractC37304Gc5.A01(parcel, ECPOffer.CREATOR, arrayList16, i17);
                }
                TransactionInfo transactionInfo = (TransactionInfo) TransactionInfo.CREATOR.createFromParcel(parcel);
                String readString69 = parcel.readString();
                boolean A1V5 = AbstractC37304Gc5.A1V(parcel);
                if (parcel.readInt() == 0) {
                    valueOf16 = null;
                } else {
                    valueOf16 = EnumC72407Xcu.valueOf(parcel.readString());
                }
                if (parcel.readInt() == 0) {
                    valueOf17 = null;
                } else {
                    valueOf17 = Long.valueOf(parcel.readLong());
                }
                return new ECPPaymentResponseParams(fulfillmentOption, shippingOption, transactionInfo, valueOf16, otcInput, shippingAddress2, shippingAddress3, valueOf17, A0d7, readString52, readString53, readString54, readString55, readString56, readString57, readString58, readString59, readString60, readString61, readString62, readString63, readString64, readString65, readString66, readString67, readString68, readString69, parcel.readString(), arrayList16, linkedHashSet, readInt19, A1V5);
            case 49:
                return new ECPPreselectedFBPayData(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                C14360o3.A0B(parcel, 0);
                return new EcpNuxLearnMoreScreenStyle((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            case 51:
                VEY valueOf23 = VEY.valueOf(AbstractC37304Gc5.A0d(parcel));
                VEY valueOf24 = VEY.valueOf(parcel.readString());
                VEY valueOf25 = VEY.valueOf(parcel.readString());
                VEY valueOf26 = VEY.valueOf(parcel.readString());
                VEY valueOf27 = VEY.valueOf(parcel.readString());
                VEY valueOf28 = VEY.valueOf(parcel.readString());
                ItemDetails itemDetails = (ItemDetails) ItemDetails.CREATOR.createFromParcel(parcel);
                Object obj3 = null;
                if (parcel.readInt() == 0) {
                    createFromParcel9 = null;
                } else {
                    createFromParcel9 = AuthScreenStyle.CREATOR.createFromParcel(parcel);
                }
                AuthScreenStyle authScreenStyle = (AuthScreenStyle) createFromParcel9;
                if (parcel.readInt() != 0) {
                    obj3 = EcpNuxLearnMoreScreenStyle.CREATOR.createFromParcel(parcel);
                }
                return new EcpUIConfiguration(authScreenStyle, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, VEY.valueOf(parcel.readString()), (EcpNuxLearnMoreScreenStyle) obj3, itemDetails);
            case 52:
                return new FulfillmentOption((CurrencyAmount) AbstractC37304Gc5.A04(parcel, FulfillmentOption.class), AbstractC37304Gc5.A0d(parcel), parcel.readString(), (Date) parcel.readSerializable(), (Date) parcel.readSerializable());
            case 53:
                String A0d8 = AbstractC37304Gc5.A0d(parcel);
                int readInt22 = parcel.readInt();
                ArrayList arrayList17 = new ArrayList(readInt22);
                for (int i18 = 0; i18 != readInt22; i18++) {
                    AbstractC37304Gc5.A0r(parcel, FulfillmentOptions.class, arrayList17);
                }
                return new FulfillmentOptions(A0d8, arrayList17);
            case 54:
                String A0d9 = AbstractC37304Gc5.A0d(parcel);
                if (A0d9.equals("DEFAULT")) {
                    num2 = C05F.A00;
                } else if (A0d9.equals("RESELLER")) {
                    num2 = C05F.A01;
                } else {
                    throw new IllegalArgumentException(A0d9);
                }
                return new ItemDetails(num2, parcel.readString());
            case 55:
                return new KnownData((ShippingAddress) AbstractC37304Gc5.A04(parcel, KnownData.class), AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            case 56:
                int A0025 = AbstractC37304Gc5.A00(parcel);
                ArrayList arrayList18 = new ArrayList(A0025);
                int i19 = 0;
                while (i19 != A0025) {
                    i19 = AbstractC37304Gc5.A01(parcel, ECPOffer.CREATOR, arrayList18, i19);
                }
                return new OffersList(arrayList18);
            case 57:
                String A0d10 = AbstractC37304Gc5.A0d(parcel);
                if (A0d10.equals("SUBMIT_CONTAINER")) {
                    return new PaymentHandledResponseData(C05F.A00, parcel.readString());
                }
                throw new IllegalArgumentException(A0d10);
            case 58:
                return new PaymentReceiverInfo(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            case 59:
                String A0d11 = AbstractC37304Gc5.A0d(parcel);
                String readString70 = parcel.readString();
                return new PickupFulfillmentOption((CurrencyAmount) AbstractC37304Gc5.A04(parcel, PickupFulfillmentOption.class), (Distance) AbstractC37304Gc5.A04(parcel, PickupFulfillmentOption.class), (ShippingAddress) AbstractC37304Gc5.A04(parcel, PickupFulfillmentOption.class), A0d11, readString70, (Date) parcel.readSerializable(), (Date) parcel.readSerializable(), AbstractC37304Gc5.A1V(parcel));
            case 60:
                return new PickupInfo(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 61:
                C14360o3.A0B(parcel, 0);
                CurrencyAmount currencyAmount3 = (CurrencyAmount) AbstractC37304Gc5.A04(parcel, PriceInfo.class);
                String readString71 = parcel.readString();
                VDV vdv = null;
                if (parcel.readInt() == 0) {
                    valueOf18 = null;
                } else {
                    valueOf18 = VE5.valueOf(parcel.readString());
                }
                if (parcel.readInt() != 0) {
                    vdv = VDV.valueOf(parcel.readString());
                }
                return new PriceInfo(currencyAmount3, vdv, valueOf18, AbstractC37304Gc5.A0W(parcel), readString71, parcel.readString(), parcel.readString(), parcel.readString());
            case 62:
                C14360o3.A0B(parcel, 0);
                return new PromoCodeList(parcel.createStringArrayList());
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new ShippingOption((CurrencyAmount) AbstractC37304Gc5.A04(parcel, ShippingOption.class), AbstractC69841VwR.A00(parcel.readString()), AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString());
            case 64:
                String A0d12 = AbstractC37304Gc5.A0d(parcel);
                int readInt23 = parcel.readInt();
                ArrayList arrayList19 = new ArrayList(readInt23);
                int i20 = 0;
                while (i20 != readInt23) {
                    i20 = AbstractC37304Gc5.A01(parcel, ShippingOption.CREATOR, arrayList19, i20);
                }
                return new ShippingOptions(A0d12, arrayList19);
            case 65:
                String A0d13 = AbstractC37304Gc5.A0d(parcel);
                String readString72 = parcel.readString();
                int i21 = 0;
                Object obj4 = null;
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt24 = parcel.readInt();
                    arrayList2 = new ArrayList(readInt24);
                    int i22 = 0;
                    while (i22 != readInt24) {
                        i22 = AbstractC37304Gc5.A01(parcel, PriceInfo.CREATOR, arrayList2, i22);
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList3 = null;
                } else {
                    int readInt25 = parcel.readInt();
                    arrayList3 = new ArrayList(readInt25);
                    while (i21 != readInt25) {
                        i21 = AbstractC37304Gc5.A01(parcel, PriceInfo.CREATOR, arrayList3, i21);
                    }
                }
                if (parcel.readInt() == 0) {
                    createFromParcel10 = null;
                } else {
                    createFromParcel10 = ShippingOptions.CREATOR.createFromParcel(parcel);
                }
                ShippingOptions shippingOptions = (ShippingOptions) createFromParcel10;
                if (parcel.readInt() == 0) {
                    createFromParcel11 = null;
                } else {
                    createFromParcel11 = FulfillmentOptions.CREATOR.createFromParcel(parcel);
                }
                FulfillmentOptions fulfillmentOptions = (FulfillmentOptions) createFromParcel11;
                if (parcel.readInt() == 0) {
                    createFromParcel12 = null;
                } else {
                    createFromParcel12 = PromoCodeList.CREATOR.createFromParcel(parcel);
                }
                PromoCodeList promoCodeList = (PromoCodeList) createFromParcel12;
                ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
                String readString73 = parcel.readString();
                if (parcel.readInt() == 0) {
                    A005 = null;
                } else {
                    A005 = AbstractC69841VwR.A00(parcel.readString());
                }
                if (parcel.readInt() != 0) {
                    obj4 = PickupInfo.CREATOR.createFromParcel(parcel);
                }
                return new TransactionInfo(fulfillmentOptions, (PickupInfo) obj4, promoCodeList, shippingOptions, A005, A0d13, readString72, readString73, arrayList2, arrayList3, createStringArrayList3);
            case 66:
                C14360o3.A0B(parcel, 0);
                return new AddressCellParams(parcel);
            case 67:
                C14360o3.A0B(parcel, 0);
                return new BriefAddressCellParams(parcel);
            case 68:
                C14360o3.A0B(parcel, 0);
                ?? cellParams = new CellParams(parcel);
                ArrayList arrayList20 = new ArrayList();
                cellParams.A03 = arrayList20;
                AbstractC65702TsY.A0z(parcel, SelectionShippingAddressItem.class, arrayList20);
                Parcelable A04 = AbstractC37304Gc5.A04(parcel, BaseCheckoutItem.class);
                if (A04 != null) {
                    cellParams.A01 = (BaseCheckoutItem) A04;
                    cellParams.A00 = parcel.readInt();
                    Parcelable A042 = AbstractC37304Gc5.A04(parcel, LoggingContext.class);
                    if (A042 != null) {
                        cellParams.A02 = (LoggingContext) A042;
                        cellParams.A04 = AbstractC58320PtC.A1T(parcel);
                        return cellParams;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            case 69:
                C14360o3.A0B(parcel, 0);
                ?? cellParams2 = new CellParams(parcel);
                boolean z6 = true;
                cellParams2.A03 = AbstractC167007dF.A1M(parcel.readByte());
                if (parcel.readByte() == 0) {
                    z6 = false;
                }
                cellParams2.A04 = z6;
                cellParams2.A01 = parcel.readInt();
                cellParams2.A00 = parcel.readInt();
                cellParams2.A02 = AbstractC37304Gc5.A0U(parcel);
                return cellParams2;
            case 70:
                C14360o3.A0B(parcel, 0);
                return new APMLinkCellParams(parcel);
            case 71:
                C14360o3.A0B(parcel, 0);
                ?? cellParams3 = new CellParams(parcel);
                cellParams3.A03 = AbstractC37304Gc5.A1X(parcel);
                cellParams3.A01 = parcel.readInt();
                cellParams3.A00 = parcel.readInt();
                cellParams3.A04 = AbstractC58320PtC.A1T(parcel);
                cellParams3.A02 = parcel.readString();
                return cellParams3;
            case 72:
                C14360o3.A0B(parcel, 0);
                return new CellParams(parcel);
            case 73:
                return new CardScannerCellParams(AbstractC37304Gc5.A00(parcel), AbstractC37304Gc5.A1V(parcel));
            case 74:
                C14360o3.A0B(parcel, 0);
                return new CreditCardCellParams(parcel);
            case 75:
                C14360o3.A0B(parcel, 0);
                ?? cellParams4 = new CellParams(parcel);
                cellParams4.A00 = parcel.readInt();
                cellParams4.A01 = parcel.readInt();
                return cellParams4;
            case 76:
                return new LabelCellParams(parcel);
            case 77:
                int A0026 = AbstractC37304Gc5.A00(parcel);
                int readInt26 = parcel.readInt();
                int readInt27 = parcel.readInt();
                int readInt28 = parcel.readInt();
                int readInt29 = parcel.readInt();
                int readInt30 = parcel.readInt();
                ArrayList arrayList21 = new ArrayList(readInt30);
                for (int i23 = 0; i23 != readInt30; i23++) {
                    AbstractC166997dE.A1W(arrayList21, parcel.readInt());
                }
                return new PaymentMethodLabelCellParams(arrayList21, A0026, readInt26, readInt27, readInt28, readInt29);
            case 78:
                C14360o3.A0B(parcel, 0);
                ?? cellParams5 = new CellParams(parcel);
                ArrayList arrayList22 = new ArrayList();
                cellParams5.A00 = arrayList22;
                AbstractC65702TsY.A0z(parcel, Integer.TYPE, arrayList22);
                return cellParams5;
            case 79:
                return new FormCellFocusEvents(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            case 80:
                C14360o3.A0B(parcel, 0);
                return new FormCellLoggingEvents((FormCellFocusEvents) FormCellFocusEvents.CREATOR.createFromParcel(parcel));
            case 81:
            case 82:
            default:
                C14360o3.A0B(parcel, 0);
                return new SelectorCellParams(parcel);
            case 83:
                C14360o3.A0B(parcel, 0);
                return new TextCellParams(parcel);
            case 84:
                C14360o3.A0B(parcel, 0);
                return new TextValidatorParams(parcel);
            case 85:
                C14360o3.A0B(parcel, 0);
                return new Object();
            case 86:
                return new Object();
            case 87:
                return new Object();
            case 88:
                return new PhoneNumberFormattingTextWatcher();
            case 89:
                return new Object();
            case 90:
                String A0d14 = AbstractC37304Gc5.A0d(parcel);
                if (A0d14 != null) {
                    enumC61219RhJ = EnumC61219RhJ.valueOf(A0d14);
                } else {
                    enumC61219RhJ = null;
                }
                return new CvvTextFieldHandler(enumC61219RhJ);
            case 91:
                return new SwitchCellParams(parcel);
            case 92:
                boolean z7 = true;
                boolean A1M5 = AbstractC167007dF.A1M(AbstractC37304Gc5.A00(parcel));
                boolean A1V6 = AbstractC37304Gc5.A1V(parcel);
                if (parcel.readInt() == 0) {
                    z7 = false;
                }
                return new FeatureConfiguration(A1M5, A1V6, z7);
            case 93:
                return new FormClickEvent(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 94:
                return new FormDisplayEvent(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString());
            case 95:
                int i24 = 0;
                Object obj5 = null;
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    arrayList4 = null;
                } else {
                    int readInt31 = parcel.readInt();
                    arrayList4 = new ArrayList(readInt31);
                    int i25 = 0;
                    while (i25 != readInt31) {
                        i25 = AbstractC37304Gc5.A01(parcel, FormDisplayEvent.CREATOR, arrayList4, i25);
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList5 = null;
                } else {
                    int readInt32 = parcel.readInt();
                    arrayList5 = new ArrayList(readInt32);
                    int i26 = 0;
                    while (i26 != readInt32) {
                        i26 = AbstractC37304Gc5.A01(parcel, FormClickEvent.CREATOR, arrayList5, i26);
                    }
                }
                if (parcel.readInt() == 0) {
                    createFromParcel13 = null;
                } else {
                    createFromParcel13 = FormClickEvent.CREATOR.createFromParcel(parcel);
                }
                FormClickEvent formClickEvent = (FormClickEvent) createFromParcel13;
                if (parcel.readInt() == 0) {
                    createFromParcel14 = null;
                } else {
                    createFromParcel14 = FormClickEvent.CREATOR.createFromParcel(parcel);
                }
                FormClickEvent formClickEvent2 = (FormClickEvent) createFromParcel14;
                if (parcel.readInt() == 0) {
                    createFromParcel15 = null;
                } else {
                    createFromParcel15 = FormClickEvent.CREATOR.createFromParcel(parcel);
                }
                FormClickEvent formClickEvent3 = (FormClickEvent) createFromParcel15;
                if (parcel.readInt() == 0) {
                    arrayList6 = null;
                } else {
                    int readInt33 = parcel.readInt();
                    arrayList6 = new ArrayList(readInt33);
                    int i27 = 0;
                    while (i27 != readInt33) {
                        i27 = AbstractC37304Gc5.A01(parcel, FormMutationEvent.CREATOR, arrayList6, i27);
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList7 = null;
                } else {
                    int readInt34 = parcel.readInt();
                    arrayList7 = new ArrayList(readInt34);
                    while (i24 != readInt34) {
                        i24 = AbstractC37304Gc5.A01(parcel, FormMutationEvent.CREATOR, arrayList7, i24);
                    }
                }
                if (parcel.readInt() == 0) {
                    createFromParcel16 = null;
                } else {
                    createFromParcel16 = FormMutationEvent.CREATOR.createFromParcel(parcel);
                }
                FormMutationEvent formMutationEvent = (FormMutationEvent) createFromParcel16;
                if (parcel.readInt() != 0) {
                    obj5 = FormMutationEvent.CREATOR.createFromParcel(parcel);
                }
                return new FormLoggingEvents(formClickEvent, formClickEvent2, formClickEvent3, formMutationEvent, (FormMutationEvent) obj5, arrayList4, arrayList5, arrayList6, arrayList7);
            case 96:
                return new FormMutationEvent(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 97:
                int A0027 = AbstractC37304Gc5.A00(parcel);
                String readString74 = parcel.readString();
                int readInt35 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    A0U2 = null;
                } else {
                    A0U2 = AbstractC37304Gc5.A0U(parcel);
                }
                if (parcel.readInt() == 0) {
                    A0U3 = null;
                } else {
                    A0U3 = AbstractC37304Gc5.A0U(parcel);
                }
                int readInt36 = parcel.readInt();
                ArrayList arrayList23 = new ArrayList(readInt36);
                for (int i28 = 0; i28 != readInt36; i28++) {
                    AbstractC37304Gc5.A0r(parcel, FormParams.class, arrayList23);
                }
                if (parcel.readInt() == 0) {
                    createFromParcel17 = null;
                } else {
                    createFromParcel17 = FormLoggingEvents.CREATOR.createFromParcel(parcel);
                }
                FormLoggingEvents formLoggingEvents = (FormLoggingEvents) createFromParcel17;
                if (parcel.readInt() == 0) {
                    valueOf19 = null;
                } else {
                    valueOf19 = VET.valueOf(parcel.readString());
                }
                int readInt37 = parcel.readInt();
                int readInt38 = parcel.readInt();
                int readInt39 = parcel.readInt();
                int readInt40 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    createFromParcel18 = null;
                } else {
                    createFromParcel18 = ListCellParams.CREATOR.createFromParcel(parcel);
                }
                ListCellParams listCellParams = (ListCellParams) createFromParcel18;
                if (parcel.readInt() == 0) {
                    createFromParcel19 = null;
                } else {
                    createFromParcel19 = FeatureConfiguration.CREATOR.createFromParcel(parcel);
                }
                FeatureConfiguration featureConfiguration = (FeatureConfiguration) createFromParcel19;
                if (parcel.readInt() == 0) {
                    A0U4 = null;
                } else {
                    A0U4 = AbstractC37304Gc5.A0U(parcel);
                }
                if (parcel.readInt() == 0) {
                    arrayList8 = null;
                } else {
                    int readInt41 = parcel.readInt();
                    arrayList8 = new ArrayList(readInt41);
                    for (int i29 = 0; i29 != readInt41; i29++) {
                        AbstractC166997dE.A1W(arrayList8, parcel.readInt());
                    }
                }
                CellParams cellParams6 = (CellParams) AbstractC37304Gc5.A04(parcel, FormParams.class);
                if (parcel.readInt() == 0) {
                    num3 = null;
                } else {
                    String readString75 = parcel.readString();
                    if (readString75.equals("ECP_ADD_ADDRESS")) {
                        num3 = C05F.A00;
                    } else if (readString75.equals("ECP_EDIT_ADDRESS")) {
                        num3 = C05F.A01;
                    } else {
                        throw new IllegalArgumentException(readString75);
                    }
                }
                int readInt42 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    valueOf20 = null;
                } else {
                    valueOf20 = EnumC61219RhJ.valueOf(parcel.readString());
                }
                return new FormParams(cellParams6, featureConfiguration, formLoggingEvents, listCellParams, valueOf19, valueOf20, A0U2, A0U3, A0U4, num3, readString74, arrayList23, arrayList8, (InterfaceC16660sJ) parcel.readSerializable(), A0027, readInt35, readInt37, readInt38, readInt39, readInt40, readInt42, AbstractC37304Gc5.A1V(parcel));
            case 98:
                return new ListCellParams(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString());
            case 99:
                C14360o3.A0B(parcel, 0);
                Country country = (Country) AbstractC37304Gc5.A04(parcel, AddressFormFieldsConfig.class);
                int readInt43 = parcel.readInt();
                ArrayList arrayList24 = new ArrayList(readInt43);
                int i30 = 0;
                while (i30 != readInt43) {
                    i30 = AbstractC37304Gc5.A01(parcel, FormCountry.CREATOR, arrayList24, i30);
                }
                return new AddressFormFieldsConfig(country, arrayList24);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new IncentiveItem[i];
            case 1:
                return new IncentiveSummaryItem[i];
            case 2:
                return new InlineBackButtonItem[i];
            case 3:
                return new InlineFormItem[i];
            case 4:
                return new InvisibleHeaderItem[i];
            case 5:
                return new PayButtonItem[i];
            case 6:
                return new PuxAccordionItem[i];
            case 7:
                return new PuxBannerItem[i];
            case 8:
                return new PuxContactItem[i];
            case 9:
                return new PuxEntityItem[i];
            case 10:
                return new PuxFulfillmentOptionItem[i];
            case 11:
                return new PuxOrderSummaryItem[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new PuxPaymentMethodItem[i];
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new PuxPriceTableItem[i];
            case 14:
                return new PuxReceiverHeaderItem[i];
            case Process.SIGTERM /* 15 */:
                return new PuxShippingAddressItem[i];
            case 16:
                return new PuxTermsConditionItem[i];
            case 17:
                return new SelectionActionViewItem[i];
            case 18:
                return new SelectionEmailViewItem[i];
            case Process.SIGSTOP /* 19 */:
                return new SelectionFulfillmentOptionItem[i];
            case 20:
                return new SelectionHeaderItem[i];
            case 21:
                return new SelectionIncentiveEmbeddedBloksItem[i];
            case 22:
                return new SelectionNameViewItem[i];
            case 23:
                return new SelectionOfferViewItem[i];
            case 24:
                return new SelectionPaymentMethodItem[i];
            case 25:
                return new SelectionPhoneNumberViewItem[i];
            case 26:
                return new SelectionPickupFulfillmentOptionItem[i];
            case 27:
                return new SelectionPromoCodeViewItem[i];
            case 28:
                return new SelectionShippingAddressItem[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new SelectionShippingFulfillmentOptionItem[i];
            case 30:
                return new SelectionTextViewItem[i];
            case 31:
                return new ECPConfirmationParams[i];
            case 32:
                return new ECPConfirmationUpsellAction[i];
            case 33:
                return new ECPConfirmationUpsellSection[i];
            case 34:
                return new ComponentLoggingData[i];
            case 35:
                return new AuthScreenStyle[i];
            case 36:
                return new CheckoutConfiguration[i];
            case 37:
                return new CheckoutPayloadKeyValue[i];
            case 38:
                return new CheckoutResponse[i];
            case 39:
                return new CheckoutSetupKeyValue[i];
            case 40:
                return new DefaultCreditCardFields[i];
            case Seq.NULL_REFNUM /* 41 */:
                return new DefaultPaymentMethodFields[i];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new ECPAvailabilityRequestParams[i];
            case 43:
                return new ECPAvailabilityResponseParams[i];
            case 44:
                return new ECPConfirmationConfiguration[i];
            case 45:
                return new ECPOffer[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new ECPPaymentConfiguration[i];
            case 47:
                return new ECPPaymentRequest[i];
            case 48:
                return new ECPPaymentResponseParams[i];
            case 49:
                return new ECPPreselectedFBPayData[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return new EcpNuxLearnMoreScreenStyle[i];
            case 51:
                return new EcpUIConfiguration[i];
            case 52:
                return new FulfillmentOption[i];
            case 53:
                return new FulfillmentOptions[i];
            case 54:
                return new ItemDetails[i];
            case 55:
                return new KnownData[i];
            case 56:
                return new OffersList[i];
            case 57:
                return new PaymentHandledResponseData[i];
            case 58:
                return new PaymentReceiverInfo[i];
            case 59:
                return new PickupFulfillmentOption[i];
            case 60:
                return new PickupInfo[i];
            case 61:
                return new PriceInfo[i];
            case 62:
                return new PromoCodeList[i];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new ShippingOption[i];
            case 64:
                return new ShippingOptions[i];
            case 65:
                return new TransactionInfo[i];
            case 66:
                return new AddressCellParams[i];
            case 67:
                return new BriefAddressCellParams[i];
            case 68:
                return new AddressListCellParams[i];
            case 69:
                return new AddressListHeaderCellParams[i];
            case 70:
                return new APMLinkCellParams[i];
            case 71:
                return new CheckboxCellParams[i];
            case 72:
                return new ContactInfoCellParams[i];
            case 73:
                return new CardScannerCellParams[i];
            case 74:
                return new CreditCardCellParams[i];
            case 75:
                return new FulfillmentOptionCellParams[i];
            case 76:
                return new LabelCellParams[i];
            case 77:
                return new PaymentMethodLabelCellParams[i];
            case 78:
                return new SupportedLogosCellParams[i];
            case 79:
                return new FormCellFocusEvents[i];
            case 80:
                return new FormCellLoggingEvents[i];
            case 81:
            case 82:
            default:
                return new SelectorCellParams[i];
            case 83:
                return new TextCellParams[i];
            case 84:
                return new TextValidatorParams[i];
            case 85:
                return new CreditCardFormatter[i];
            case 86:
                return new DateFormatter[i];
            case 87:
                return new NameFormatter[i];
            case 88:
                return new PhoneFormatter[i];
            case 89:
                return new UpperCaseFormatter[i];
            case 90:
                return new CvvTextFieldHandler[i];
            case 91:
                return new SwitchCellParams[i];
            case 92:
                return new FeatureConfiguration[i];
            case 93:
                return new FormClickEvent[i];
            case 94:
                return new FormDisplayEvent[i];
            case 95:
                return new FormLoggingEvents[i];
            case 96:
                return new FormMutationEvent[i];
            case 97:
                return new FormParams[i];
            case 98:
                return new ListCellParams[i];
            case 99:
                return new AddressFormFieldsConfig[i];
        }
    }
}
