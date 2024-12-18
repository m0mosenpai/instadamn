package X;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.common.locale.Country;
import com.facebook.forker.Process;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.models.Distance;
import com.facebookpay.form.model.CardFormFieldConfig;
import com.facebookpay.form.model.FormCountry;
import com.facebookpay.form.model.FormField;
import com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent;
import com.facebookpay.fulfillmentoption.model.PickupFulfillmentOptionComponent;
import com.facebookpay.fulfillmentoption.model.ShippingFulfillmentOptionComponent;
import com.facebookpay.incentives.model.ECPOffsiteOffer;
import com.facebookpay.incentives.model.ECPOnsiteOffer;
import com.facebookpay.incentives.model.FeaturedIncentiveDetails;
import com.facebookpay.incentives.model.IncentiveCredentialList;
import com.facebookpay.incentives.model.IncentiveList;
import com.facebookpay.logging.ClientSuppressionPolicy;
import com.facebookpay.logging.FBPayLoggerData;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.logging.LoggingPolicy;
import com.facebookpay.msc.logging.LoggingData;
import com.facebookpay.otc.models.OtcInput;
import com.facebookpay.otc.models.OtcOptionState;
import com.facebookpay.paymentmethod.model.APMCredential;
import com.facebookpay.paymentmethod.model.CreditCard;
import com.facebookpay.paymentmethod.model.PayPalCredential;
import com.facebookpay.paymentmethod.model.TokenizedCard;
import com.facebookpay.paypal.model.LinkableTextParams;
import com.facebookpay.paypal.model.PaypalConsentLaunchParams;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.fbpay.hub.common.link.LinkParams;
import com.fbpay.hub.contactinfo.address.api.FBPayAddress;
import com.fbpay.hub.form.params.FormDialogParams;
import com.fbpay.hub.form.params.FormLogEvents;
import com.fbpay.hub.form.params.FormParams;
import com.fbpay.hub.merchantinfo.api.MerchantInfo;
import com.fbpay.hub.orders.api.FBPayOrder;
import com.fbpay.hub.paymentmethods.api.FbPayAdditionalField;
import com.fbpay.hub.paymentmethods.api.FbPayBankAccount;
import com.fbpay.hub.paymentmethods.api.FbPayCreditCard;
import com.fbpay.hub.paymentmethods.api.FbPayNewCreditCardOption;
import com.fbpay.hub.paymentmethods.api.FbPayNewPayPalOption;
import com.fbpay.hub.paymentmethods.api.FbPayPayPal;
import com.fbpay.hub.paymentmethods.api.FbPayPaymentDefaultInfo;
import com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod;
import com.fbpay.hub.paymentmethods.api.FbPayShopPay;
import com.fbpay.hub.riskenforcement.api.FBPayHubRiskEnforcementData;
import com.fbpay.hub.transactions.api.UpcomingPayout;
import com.fbpay.theme.FBPayIcon;
import com.fbpay.util.tooltip.TooltipInfo;
import com.fbpay.w3c.Address;
import com.fbpay.w3c.CardDetails;
import com.fbpay.w3c.Contact;
import com.fbpay.w3c.Email;
import com.fbpay.w3c.Phone;
import com.fbpay.w3c.W3CCardDetail;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.flac.VorbisComment;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import com.google.android.exoplayer2.metadata.vr.CameraMotionData;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.flexbox.FlexboxLayout$LayoutParams;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzo;
import com.google.android.gms.auth.api.accounttransfer.zzs;
import com.google.android.gms.auth.api.accounttransfer.zzu;
import com.google.android.gms.auth.api.accounttransfer.zzw;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: X.SlB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63470SlB implements Parcelable.Creator {
    public final int A00;

    public C63470SlB(int i) {
        this.A00 = i;
    }

    public static C63470SlB A00(int i) {
        return new C63470SlB(i);
    }

    /* JADX WARN: Type inference failed for: r7v85, types: [android.view.ViewGroup$MarginLayoutParams, com.google.android.flexbox.FlexboxLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r7v87, types: [X.3OP, com.google.android.flexbox.FlexboxLayoutManager$LayoutParams] */
    /* JADX WARN: Type inference failed for: r7v88, types: [com.google.android.flexbox.FlexboxLayoutManager$SavedState, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Boolean valueOf;
        EnumC72401Xco valueOf2;
        Object createFromParcel;
        Object createFromParcel2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        switch (this.A00) {
            case 0:
                int A00 = AbstractC37304Gc5.A00(parcel);
                ArrayList A17 = AbstractC25225BEi.A17(A00);
                int i2 = 0;
                while (i2 != A00) {
                    i2 = AbstractC37304Gc5.A01(parcel, FormField.CREATOR, A17, i2);
                }
                return new CardFormFieldConfig(A17);
            case 1:
                C14360o3.A0B(parcel, 0);
                Country country = (Country) AbstractC37304Gc5.A04(parcel, FormCountry.class);
                int readInt = parcel.readInt();
                ArrayList A172 = AbstractC25225BEi.A17(readInt);
                int i3 = 0;
                while (i3 != readInt) {
                    i3 = AbstractC37304Gc5.A01(parcel, FormField.CREATOR, A172, i3);
                }
                return new FormCountry(country, A172);
            case 2:
                String A0d = AbstractC37304Gc5.A0d(parcel);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                boolean A1M = AbstractC167007dF.A1M(parcel.readInt());
                int readInt2 = parcel.readInt();
                ArrayList A173 = AbstractC25225BEi.A17(readInt2);
                for (int i4 = 0; i4 != readInt2; i4++) {
                    AbstractC37304Gc5.A0r(parcel, FormField.class, A173);
                }
                return new FormField(AbstractC69844VwU.A00(parcel.readString()), A0d, readString, readString2, readString3, A173, A1M);
            case 3:
                return new FulfillmentOptionComponent((CurrencyAmount) AbstractC37304Gc5.A04(parcel, FulfillmentOptionComponent.class), AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString());
            case 4:
                String A0d2 = AbstractC37304Gc5.A0d(parcel);
                String readString4 = parcel.readString();
                CurrencyAmount currencyAmount = (CurrencyAmount) AbstractC37304Gc5.A04(parcel, PickupFulfillmentOptionComponent.class);
                String readString5 = parcel.readString();
                Date date = (Date) parcel.readSerializable();
                Date date2 = (Date) parcel.readSerializable();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                return new PickupFulfillmentOptionComponent(currencyAmount, (Distance) AbstractC37304Gc5.A04(parcel, PickupFulfillmentOptionComponent.class), (ShippingAddress) AbstractC37304Gc5.A04(parcel, PickupFulfillmentOptionComponent.class), valueOf, A0d2, readString4, readString5, date, date2, AbstractC37304Gc5.A1V(parcel));
            case 5:
                return new ShippingFulfillmentOptionComponent((CurrencyAmount) AbstractC37304Gc5.A04(parcel, ShippingFulfillmentOptionComponent.class), AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), (Date) parcel.readSerializable(), (Date) parcel.readSerializable());
            case 6:
                String A0d3 = AbstractC37304Gc5.A0d(parcel);
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                return new ECPOffsiteOffer((CurrencyAmount) AbstractC37304Gc5.A04(parcel, ECPOffsiteOffer.class), VFP.valueOf(parcel.readString()), A0d3, readString6, readString7, readString8, parcel.readString(), AbstractC37304Gc5.A1V(parcel));
            case 7:
                String A0d4 = AbstractC37304Gc5.A0d(parcel);
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                return new ECPOnsiteOffer((CurrencyAmount) AbstractC37304Gc5.A04(parcel, ECPOnsiteOffer.class), VFP.valueOf(parcel.readString()), A0d4, readString9, readString10, parcel.readString(), parcel.readString(), AbstractC37304Gc5.A1V(parcel));
            case 8:
                C14360o3.A0B(parcel, 0);
                return new FeaturedIncentiveDetails((R0Z) AbstractC58321PtD.A0n(parcel, FeaturedIncentiveDetails.class), parcel.readString());
            case 9:
                C14360o3.A0B(parcel, 0);
                return new IncentiveCredentialList(parcel.createStringArrayList());
            case 10:
                int A002 = AbstractC37304Gc5.A00(parcel);
                ArrayList A174 = AbstractC25225BEi.A17(A002);
                for (int i5 = 0; i5 != A002; i5++) {
                    AbstractC37304Gc5.A0r(parcel, IncentiveList.class, A174);
                }
                return new IncentiveList(A174);
            case 11:
                String A0d5 = AbstractC37304Gc5.A0d(parcel);
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = EnumC72401Xco.valueOf(parcel.readString());
                }
                return new ClientSuppressionPolicy(EnumC61210RhA.valueOf(parcel.readString()), valueOf2, A0d5);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new FBPayLoggerData(parcel);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                String A0d6 = AbstractC37304Gc5.A0d(parcel);
                long readLong = parcel.readLong();
                if (parcel.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = LoggingPolicy.CREATOR.createFromParcel(parcel);
                }
                LoggingPolicy loggingPolicy = (LoggingPolicy) createFromParcel;
                int readInt3 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt3);
                for (int i6 = 0; i6 != readInt3; i6++) {
                    linkedHashSet.add(parcel.readString());
                }
                int readInt4 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt4);
                for (int i7 = 0; i7 != readInt4; i7++) {
                    linkedHashSet2.add(parcel.readString());
                }
                return new LoggingContext(loggingPolicy, A0d6, linkedHashSet, linkedHashSet2, readLong, AbstractC37304Gc5.A1V(parcel));
            case 14:
                String A0d7 = AbstractC37304Gc5.A0d(parcel);
                int readInt5 = parcel.readInt();
                ArrayList A175 = AbstractC25225BEi.A17(readInt5);
                int i8 = 0;
                while (i8 != readInt5) {
                    i8 = AbstractC37304Gc5.A01(parcel, ClientSuppressionPolicy.CREATOR, A175, i8);
                }
                return new LoggingPolicy(A0d7, A175);
            case Process.SIGTERM /* 15 */:
                return new LoggingData(AbstractC37304Gc5.A0d(parcel));
            case 16:
                return new OtcInput(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 17:
                String A0d8 = AbstractC37304Gc5.A0d(parcel);
                int readInt6 = parcel.readInt();
                LinkedHashMap A18 = AbstractC25225BEi.A18(readInt6);
                int i9 = 0;
                while (true) {
                    String readString11 = parcel.readString();
                    if (i9 != readInt6) {
                        A18.put(EnumC129485tD.valueOf(readString11), EnumC68133VCr.valueOf(parcel.readString()));
                        i9++;
                    } else {
                        return new OtcOptionState(EnumC68133VCr.valueOf(readString11), A0d8, parcel.readString(), A18);
                    }
                }
            case 18:
                C14360o3.A0B(parcel, 0);
                return new APMCredential((QQe) AbstractC58321PtD.A0n(parcel, APMCredential.class), EnumC72407Xcu.valueOf(parcel.readString()), AbstractC37304Gc5.A1V(parcel));
            case Process.SIGSTOP /* 19 */:
                C14360o3.A0B(parcel, 0);
                return new CreditCard((QRL) AbstractC58321PtD.A0n(parcel, CreditCard.class), AbstractC167007dF.A1M(parcel.readInt()), AbstractC37304Gc5.A1W(parcel));
            case 20:
                C14360o3.A0B(parcel, 0);
                return new PayPalCredential((QWM) AbstractC58321PtD.A0n(parcel, PayPalCredential.class), parcel.readString(), AbstractC37304Gc5.A1V(parcel));
            case 21:
                C14360o3.A0B(parcel, 0);
                return new TokenizedCard((QRL) AbstractC58321PtD.A0n(parcel, TokenizedCard.class), (C59083QWp) AbstractC58321PtD.A0n(parcel, TokenizedCard.class), AbstractC167007dF.A1M(parcel.readInt()), AbstractC37304Gc5.A1W(parcel));
            case 22:
                return new LinkableTextParams(AbstractC37304Gc5.A0d(parcel), parcel.readInt(), parcel.readInt(), parcel.readString());
            case 23:
                String A0d9 = AbstractC37304Gc5.A0d(parcel);
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                LoggingPolicy loggingPolicy2 = (LoggingPolicy) AbstractC37304Gc5.A04(parcel, PaypalConsentLaunchParams.class);
                String readString14 = parcel.readString();
                if (parcel.readInt() == 0) {
                    createFromParcel2 = null;
                } else {
                    createFromParcel2 = LinkableTextParams.CREATOR.createFromParcel(parcel);
                }
                return new PaypalConsentLaunchParams(loggingPolicy2, (LinkableTextParams) createFromParcel2, A0d9, readString12, readString13, readString14, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), AbstractC37304Gc5.A1V(parcel));
            case 24:
                return new ShippingAddress(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case 25:
                return new LinkParams(parcel);
            case 26:
                return new FBPayAddress(parcel);
            case 27:
                return new FormDialogParams(parcel);
            case 28:
                return new FormLogEvents(parcel);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new FormParams(parcel);
            case 30:
                return new MerchantInfo(parcel);
            case 31:
                return new FBPayOrder(parcel);
            case 32:
                return new FbPayAdditionalField(parcel);
            case 33:
                return new FbPayBankAccount(parcel);
            case 34:
                return new FbPayCreditCard(parcel);
            case 35:
                return new FbPayNewCreditCardOption(parcel);
            case 36:
                return new FbPayNewPayPalOption(parcel);
            case 37:
                return new FbPayPayPal(parcel);
            case 38:
                return new FbPayPaymentDefaultInfo(parcel);
            case 39:
                return new FbPayPaymentMethod(parcel);
            case 40:
                return new FbPayShopPay(parcel);
            case Seq.NULL_REFNUM /* 41 */:
                return new FBPayHubRiskEnforcementData(parcel);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new UpcomingPayout(parcel);
            case 43:
                return FBPayIcon.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 44:
                return new TooltipInfo(AbstractC37304Gc5.A00(parcel), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 45:
                return new Address(parcel);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new CardDetails(parcel);
            case 47:
                return new Contact(parcel);
            case 48:
                return new Email(parcel);
            case 49:
                return new Phone(parcel);
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return new W3CCardDetail(parcel);
            case 51:
                return new DrmInitData(parcel);
            case 52:
                return new DrmInitData.SchemeData(parcel);
            case 53:
                String readString15 = parcel.readString();
                readString15.getClass();
                return new AppInfoTable(parcel.readInt(), readString15);
            case 54:
                return new EventMessage(parcel);
            case 55:
                return new PictureFrame(parcel);
            case 56:
                return new VorbisComment(parcel);
            case 57:
                return new IcyHeaders(parcel);
            case 58:
                return new IcyInfo(parcel);
            case 59:
                return new ApicFrame(parcel);
            case 60:
                return new BinaryFrame(parcel);
            case 61:
                return new ChapterFrame(parcel);
            case 62:
                return new ChapterTocFrame(parcel);
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new CommentFrame(parcel);
            case 64:
                return new GeobFrame(parcel);
            case 65:
                return new InternalFrame(parcel);
            case 66:
                return new MlltFrame(parcel);
            case 67:
                return new PrivFrame(parcel);
            case 68:
                String readString16 = parcel.readString();
                readString16.getClass();
                String readString17 = parcel.readString();
                String[] createStringArray = parcel.createStringArray();
                createStringArray.getClass();
                Object[] copyOf = Arrays.copyOf(createStringArray, createStringArray.length);
                return new TextInformationFrame(readString16, readString17, AbstractC166987dD.A1F(AbstractC16960so.A1Q(Arrays.copyOf(copyOf, copyOf.length))));
            case 69:
                return new UrlLinkFrame(parcel);
            case 70:
                return new MdtaMetadataEntry(parcel);
            case 71:
                return new MotionPhotoMetadata(parcel);
            case 72:
                ArrayList A1E = AbstractC166987dD.A1E();
                parcel.readList(A1E, SlowMotionData.Segment.class.getClassLoader());
                return new SlowMotionData(A1E);
            case 73:
                return new SlowMotionData.Segment(parcel.readLong(), parcel.readLong(), parcel.readInt());
            case 74:
                return new SmtaMetadataEntry(parcel);
            case 75:
                return new PrivateCommand(parcel);
            case 76:
                return new SpliceInsertCommand(parcel);
            case 77:
                return new Object();
            case 78:
                return new SpliceScheduleCommand(parcel);
            case 79:
                return new TimeSignalCommand(parcel.readLong(), parcel.readLong());
            case 80:
                return new VorbisComment(parcel);
            case 81:
                return new CameraMotionData(parcel);
            case 82:
                return new DownloadRequest(parcel);
            case 83:
                return new StreamKey(parcel);
            case 84:
                return new Requirements(parcel.readInt());
            case 85:
                boolean z = false;
                ?? marginLayoutParams2 = new ViewGroup.MarginLayoutParams(0, 0);
                marginLayoutParams2.A08 = 1;
                marginLayoutParams2.A02 = 1.0f;
                marginLayoutParams2.A03 = -1;
                marginLayoutParams2.A00 = -1.0f;
                marginLayoutParams2.A05 = 16777215;
                marginLayoutParams2.A04 = 16777215;
                marginLayoutParams2.A08 = parcel.readInt();
                marginLayoutParams2.A01 = parcel.readFloat();
                marginLayoutParams2.A02 = parcel.readFloat();
                marginLayoutParams2.A03 = parcel.readInt();
                marginLayoutParams2.A00 = parcel.readFloat();
                marginLayoutParams2.A07 = parcel.readInt();
                marginLayoutParams2.A06 = parcel.readInt();
                marginLayoutParams2.A05 = parcel.readInt();
                marginLayoutParams2.A04 = parcel.readInt();
                if (parcel.readByte() != 0) {
                    z = true;
                }
                marginLayoutParams2.A09 = z;
                marginLayoutParams = marginLayoutParams2;
                break;
            case 86:
                ?? c3op = new C3OP(-2, -2);
                c3op.A01 = 0.0f;
                c3op.A02 = 1.0f;
                c3op.A03 = -1;
                c3op.A00 = -1.0f;
                c3op.A05 = 16777215;
                c3op.A04 = 16777215;
                c3op.A01 = parcel.readFloat();
                c3op.A02 = parcel.readFloat();
                c3op.A03 = parcel.readInt();
                c3op.A00 = parcel.readFloat();
                c3op.A07 = parcel.readInt();
                c3op.A06 = parcel.readInt();
                c3op.A05 = parcel.readInt();
                c3op.A04 = parcel.readInt();
                c3op.A08 = AbstractC37304Gc5.A1X(parcel);
                marginLayoutParams = c3op;
                break;
            case 87:
                ?? obj = new Object();
                obj.A01 = parcel.readInt();
                obj.A00 = parcel.readInt();
                return obj;
            case 88:
                int A003 = AbstractC125725mK.A00(parcel);
                HashSet A1H = AbstractC166987dD.A1H();
                ArrayList arrayList = null;
                zzs zzsVar = null;
                int i10 = 0;
                int i11 = 0;
                while (parcel.dataPosition() < A003) {
                    int readInt7 = parcel.readInt();
                    char c = (char) readInt7;
                    int i12 = 1;
                    if (c != 1) {
                        i12 = 2;
                        if (c != 2) {
                            i12 = 3;
                            if (c != 3) {
                                i12 = 4;
                                if (c != 4) {
                                    AbstractC125725mK.A0C(parcel, readInt7);
                                } else {
                                    zzsVar = (zzs) AbstractC125725mK.A04(parcel, zzs.CREATOR, readInt7);
                                }
                            } else {
                                i11 = AbstractC58321PtD.A0A(parcel, readInt7);
                            }
                        } else {
                            arrayList = AbstractC125725mK.A0A(parcel, zzu.CREATOR, readInt7);
                        }
                    } else {
                        i10 = AbstractC58321PtD.A0A(parcel, readInt7);
                    }
                    AbstractC166997dE.A1W(A1H, i12);
                }
                if (parcel.dataPosition() == A003) {
                    return new zzo(zzsVar, arrayList, A1H, i10, i11);
                }
                throw new C64853TXd(parcel, AnonymousClass001.A0O("Overread allowed size end=", A003));
            case 89:
                int A004 = AbstractC125725mK.A00(parcel);
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = null;
                ArrayList arrayList4 = null;
                ArrayList arrayList5 = null;
                ArrayList arrayList6 = null;
                int i13 = 0;
                while (parcel.dataPosition() < A004) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            i13 = AbstractC58321PtD.A0A(parcel, readInt8);
                            break;
                        case 2:
                            arrayList2 = AbstractC125725mK.A09(parcel, readInt8);
                            break;
                        case 3:
                            arrayList3 = AbstractC125725mK.A09(parcel, readInt8);
                            break;
                        case 4:
                            arrayList4 = AbstractC125725mK.A09(parcel, readInt8);
                            break;
                        case 5:
                            arrayList5 = AbstractC125725mK.A09(parcel, readInt8);
                            break;
                        case 6:
                            arrayList6 = AbstractC125725mK.A09(parcel, readInt8);
                            break;
                        default:
                            AbstractC125725mK.A0C(parcel, readInt8);
                            break;
                    }
                }
                AbstractC125725mK.A0B(parcel, A004);
                return new zzs(arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, i13);
            case 90:
                int A005 = AbstractC125725mK.A00(parcel);
                HashSet A1H2 = AbstractC166987dD.A1H();
                zzw zzwVar = null;
                int i14 = 0;
                String str = null;
                String str2 = null;
                String str3 = null;
                while (parcel.dataPosition() < A005) {
                    int readInt9 = parcel.readInt();
                    char c2 = (char) readInt9;
                    int i15 = 1;
                    if (c2 != 1) {
                        i15 = 2;
                        if (c2 != 2) {
                            i15 = 3;
                            if (c2 != 3) {
                                i15 = 4;
                                if (c2 != 4) {
                                    i15 = 5;
                                    if (c2 != 5) {
                                        AbstractC125725mK.A0C(parcel, readInt9);
                                    } else {
                                        str3 = AbstractC125725mK.A08(parcel, readInt9);
                                    }
                                } else {
                                    str2 = AbstractC125725mK.A08(parcel, readInt9);
                                }
                            } else {
                                str = AbstractC125725mK.A08(parcel, readInt9);
                            }
                        } else {
                            zzwVar = (zzw) AbstractC125725mK.A04(parcel, zzw.CREATOR, readInt9);
                        }
                    } else {
                        i14 = AbstractC58321PtD.A0A(parcel, readInt9);
                    }
                    AbstractC166997dE.A1W(A1H2, i15);
                }
                if (parcel.dataPosition() == A005) {
                    return new zzu(zzwVar, str, str2, str3, A1H2, i14);
                }
                throw new C64853TXd(parcel, AnonymousClass001.A0O("Overread allowed size end=", A005));
            case 91:
                int A006 = AbstractC125725mK.A00(parcel);
                HashSet A1H3 = AbstractC166987dD.A1H();
                String str4 = null;
                byte[] bArr = null;
                PendingIntent pendingIntent = null;
                DeviceMetaData deviceMetaData = null;
                int i16 = 0;
                int i17 = 0;
                while (parcel.dataPosition() < A006) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            i16 = AbstractC58321PtD.A0A(parcel, readInt10);
                            i = 1;
                            break;
                        case 2:
                            str4 = AbstractC125725mK.A08(parcel, readInt10);
                            i = 2;
                            break;
                        case 3:
                            i17 = AbstractC58321PtD.A0A(parcel, readInt10);
                            i = 3;
                            break;
                        case 4:
                            bArr = AbstractC125725mK.A0H(parcel, readInt10);
                            i = 4;
                            break;
                        case 5:
                            pendingIntent = (PendingIntent) AbstractC125725mK.A04(parcel, PendingIntent.CREATOR, readInt10);
                            i = 5;
                            break;
                        case 6:
                            deviceMetaData = (DeviceMetaData) AbstractC125725mK.A04(parcel, DeviceMetaData.CREATOR, readInt10);
                            i = 6;
                            break;
                        default:
                            AbstractC125725mK.A0C(parcel, readInt10);
                            continue;
                    }
                    AbstractC166997dE.A1W(A1H3, i);
                }
                if (parcel.dataPosition() == A006) {
                    return new zzw(pendingIntent, deviceMetaData, str4, A1H3, bArr, i16, i17);
                }
                throw new C64853TXd(parcel, AnonymousClass001.A0O("Overread allowed size end=", A006));
            case 92:
                int A007 = AbstractC125725mK.A00(parcel);
                long j = 0;
                int i18 = 0;
                boolean z2 = false;
                boolean z3 = false;
                while (parcel.dataPosition() < A007) {
                    int readInt11 = parcel.readInt();
                    char c3 = (char) readInt11;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            if (c3 != 3) {
                                if (c3 != 4) {
                                    AbstractC125725mK.A0C(parcel, readInt11);
                                } else {
                                    z3 = AbstractC125725mK.A0G(parcel, readInt11);
                                }
                            } else {
                                j = AbstractC58322PtE.A0D(parcel, readInt11);
                            }
                        } else {
                            z2 = AbstractC125725mK.A0G(parcel, readInt11);
                        }
                    } else {
                        i18 = AbstractC58321PtD.A0A(parcel, readInt11);
                    }
                }
                AbstractC125725mK.A0B(parcel, A007);
                return new DeviceMetaData(i18, j, z2, z3);
            case 93:
                int A008 = AbstractC125725mK.A00(parcel);
                String str5 = null;
                String str6 = null;
                android.net.Uri uri = null;
                ArrayList arrayList7 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                while (parcel.dataPosition() < A008) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            str5 = AbstractC125725mK.A08(parcel, readInt12);
                            break;
                        case 2:
                            str6 = AbstractC125725mK.A08(parcel, readInt12);
                            break;
                        case 3:
                            uri = (android.net.Uri) AbstractC125725mK.A04(parcel, android.net.Uri.CREATOR, readInt12);
                            break;
                        case 4:
                            arrayList7 = AbstractC125725mK.A0A(parcel, IdToken.CREATOR, readInt12);
                            break;
                        case 5:
                            str7 = AbstractC125725mK.A08(parcel, readInt12);
                            break;
                        case 6:
                            str8 = AbstractC125725mK.A08(parcel, readInt12);
                            break;
                        case 7:
                        case '\b':
                        default:
                            AbstractC125725mK.A0C(parcel, readInt12);
                            break;
                        case '\t':
                            str9 = AbstractC125725mK.A08(parcel, readInt12);
                            break;
                        case '\n':
                            str10 = AbstractC125725mK.A08(parcel, readInt12);
                            break;
                    }
                }
                AbstractC125725mK.A0B(parcel, A008);
                return new Credential(uri, str5, str6, str7, str8, str9, str10, arrayList7);
            case 94:
                int A009 = AbstractC125725mK.A00(parcel);
                int i19 = 0;
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                int i20 = 0;
                while (parcel.dataPosition() < A009) {
                    int readInt13 = parcel.readInt();
                    char c4 = (char) readInt13;
                    if (c4 != 1) {
                        if (c4 != 2) {
                            if (c4 != 3) {
                                if (c4 != 4) {
                                    if (c4 != 1000) {
                                        AbstractC125725mK.A0C(parcel, readInt13);
                                    } else {
                                        i19 = AbstractC58321PtD.A0B(parcel, readInt13);
                                    }
                                } else {
                                    i20 = AbstractC58321PtD.A0B(parcel, readInt13);
                                }
                            } else {
                                z6 = AbstractC125725mK.A0G(parcel, readInt13);
                            }
                        } else {
                            z5 = AbstractC125725mK.A0G(parcel, readInt13);
                        }
                    } else {
                        z4 = AbstractC125725mK.A0G(parcel, readInt13);
                    }
                }
                AbstractC125725mK.A0B(parcel, A009);
                return new CredentialPickerConfig(i19, i20, z4, z5, z6);
            case 95:
                int A0010 = AbstractC125725mK.A00(parcel);
                String[] strArr = null;
                CredentialPickerConfig credentialPickerConfig = null;
                CredentialPickerConfig credentialPickerConfig2 = null;
                String str11 = null;
                String str12 = null;
                int i21 = 0;
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                while (parcel.dataPosition() < A0010) {
                    int readInt14 = parcel.readInt();
                    char c5 = (char) readInt14;
                    if (c5 != 1000) {
                        switch (c5) {
                            case 1:
                                z7 = AbstractC125725mK.A0G(parcel, readInt14);
                                break;
                            case 2:
                                strArr = AbstractC125725mK.A0K(parcel, readInt14);
                                break;
                            case 3:
                                credentialPickerConfig = (CredentialPickerConfig) AbstractC125725mK.A04(parcel, CredentialPickerConfig.CREATOR, readInt14);
                                break;
                            case 4:
                                credentialPickerConfig2 = (CredentialPickerConfig) AbstractC125725mK.A04(parcel, CredentialPickerConfig.CREATOR, readInt14);
                                break;
                            case 5:
                                z8 = AbstractC125725mK.A0G(parcel, readInt14);
                                break;
                            case 6:
                                str11 = AbstractC125725mK.A08(parcel, readInt14);
                                break;
                            case 7:
                                str12 = AbstractC125725mK.A08(parcel, readInt14);
                                break;
                            case '\b':
                                z9 = AbstractC125725mK.A0G(parcel, readInt14);
                                break;
                            default:
                                AbstractC125725mK.A0C(parcel, readInt14);
                                break;
                        }
                    } else {
                        i21 = AbstractC58321PtD.A0A(parcel, readInt14);
                    }
                }
                AbstractC125725mK.A0B(parcel, A0010);
                return new CredentialRequest(credentialPickerConfig, credentialPickerConfig2, str11, str12, strArr, i21, z7, z8, z9);
            case 96:
                int A0011 = AbstractC125725mK.A00(parcel);
                CredentialPickerConfig credentialPickerConfig3 = null;
                String[] strArr2 = null;
                String str13 = null;
                String str14 = null;
                int i22 = 0;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                while (parcel.dataPosition() < A0011) {
                    int readInt15 = parcel.readInt();
                    char c6 = (char) readInt15;
                    if (c6 != 1000) {
                        switch (c6) {
                            case 1:
                                credentialPickerConfig3 = (CredentialPickerConfig) AbstractC125725mK.A04(parcel, CredentialPickerConfig.CREATOR, readInt15);
                                break;
                            case 2:
                                z10 = AbstractC125725mK.A0G(parcel, readInt15);
                                break;
                            case 3:
                                z11 = AbstractC125725mK.A0G(parcel, readInt15);
                                break;
                            case 4:
                                strArr2 = AbstractC125725mK.A0K(parcel, readInt15);
                                break;
                            case 5:
                                z12 = AbstractC125725mK.A0G(parcel, readInt15);
                                break;
                            case 6:
                                str13 = AbstractC125725mK.A08(parcel, readInt15);
                                break;
                            case 7:
                                str14 = AbstractC125725mK.A08(parcel, readInt15);
                                break;
                            default:
                                AbstractC125725mK.A0C(parcel, readInt15);
                                break;
                        }
                    } else {
                        i22 = AbstractC58321PtD.A0A(parcel, readInt15);
                    }
                }
                AbstractC125725mK.A0B(parcel, A0011);
                return new HintRequest(credentialPickerConfig3, str13, str14, strArr2, i22, z10, z11, z12);
            case 97:
                int A0012 = AbstractC125725mK.A00(parcel);
                String str15 = null;
                String str16 = null;
                while (parcel.dataPosition() < A0012) {
                    int readInt16 = parcel.readInt();
                    char c7 = (char) readInt16;
                    if (c7 != 1) {
                        str16 = AbstractC58323PtF.A0o(parcel, str16, c7, readInt16);
                    } else {
                        str15 = AbstractC125725mK.A08(parcel, readInt16);
                    }
                }
                AbstractC125725mK.A0B(parcel, A0012);
                return new IdToken(str15, str16);
            case 98:
                int A0013 = AbstractC125725mK.A00(parcel);
                ArrayList arrayList8 = null;
                String str17 = null;
                Account account = null;
                String str18 = null;
                String str19 = null;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                while (parcel.dataPosition() < A0013) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 1:
                            arrayList8 = AbstractC125725mK.A0A(parcel, Scope.CREATOR, readInt17);
                            break;
                        case 2:
                            str17 = AbstractC125725mK.A08(parcel, readInt17);
                            break;
                        case 3:
                            z13 = AbstractC125725mK.A0G(parcel, readInt17);
                            break;
                        case 4:
                            z14 = AbstractC125725mK.A0G(parcel, readInt17);
                            break;
                        case 5:
                            account = (Account) AbstractC125725mK.A04(parcel, Account.CREATOR, readInt17);
                            break;
                        case 6:
                            str18 = AbstractC125725mK.A08(parcel, readInt17);
                            break;
                        case 7:
                            str19 = AbstractC125725mK.A08(parcel, readInt17);
                            break;
                        case '\b':
                            z15 = AbstractC125725mK.A0G(parcel, readInt17);
                            break;
                        default:
                            AbstractC125725mK.A0C(parcel, readInt17);
                            break;
                    }
                }
                AbstractC125725mK.A0B(parcel, A0013);
                return new AuthorizationRequest(account, str17, str18, str19, arrayList8, z13, z14, z15);
            default:
                int A0014 = AbstractC125725mK.A00(parcel);
                String str20 = null;
                String str21 = null;
                String str22 = null;
                ArrayList arrayList9 = null;
                GoogleSignInAccount googleSignInAccount = null;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < A0014) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 1:
                            str20 = AbstractC125725mK.A08(parcel, readInt18);
                            break;
                        case 2:
                            str21 = AbstractC125725mK.A08(parcel, readInt18);
                            break;
                        case 3:
                            str22 = AbstractC125725mK.A08(parcel, readInt18);
                            break;
                        case 4:
                            arrayList9 = AbstractC125725mK.A09(parcel, readInt18);
                            break;
                        case 5:
                            googleSignInAccount = (GoogleSignInAccount) AbstractC125725mK.A04(parcel, GoogleSignInAccount.CREATOR, readInt18);
                            break;
                        case 6:
                            pendingIntent2 = (PendingIntent) AbstractC125725mK.A04(parcel, PendingIntent.CREATOR, readInt18);
                            break;
                        default:
                            AbstractC125725mK.A0C(parcel, readInt18);
                            break;
                    }
                }
                AbstractC125725mK.A0B(parcel, A0014);
                return new AuthorizationResult(pendingIntent2, googleSignInAccount, str20, str21, str22, arrayList9);
        }
        marginLayoutParams.bottomMargin = parcel.readInt();
        marginLayoutParams.leftMargin = parcel.readInt();
        marginLayoutParams.rightMargin = parcel.readInt();
        marginLayoutParams.topMargin = parcel.readInt();
        ((ViewGroup.LayoutParams) marginLayoutParams).height = parcel.readInt();
        ((ViewGroup.LayoutParams) marginLayoutParams).width = parcel.readInt();
        return marginLayoutParams;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new CardFormFieldConfig[i];
            case 1:
                return new FormCountry[i];
            case 2:
                return new FormField[i];
            case 3:
                return new FulfillmentOptionComponent[i];
            case 4:
                return new PickupFulfillmentOptionComponent[i];
            case 5:
                return new ShippingFulfillmentOptionComponent[i];
            case 6:
                return new ECPOffsiteOffer[i];
            case 7:
                return new ECPOnsiteOffer[i];
            case 8:
                return new FeaturedIncentiveDetails[i];
            case 9:
                return new IncentiveCredentialList[i];
            case 10:
                return new IncentiveList[i];
            case 11:
                return new ClientSuppressionPolicy[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new FBPayLoggerData[i];
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new LoggingContext[i];
            case 14:
                return new LoggingPolicy[i];
            case Process.SIGTERM /* 15 */:
                return new LoggingData[i];
            case 16:
                return new OtcInput[i];
            case 17:
                return new OtcOptionState[i];
            case 18:
                return new APMCredential[i];
            case Process.SIGSTOP /* 19 */:
                return new CreditCard[i];
            case 20:
                return new PayPalCredential[i];
            case 21:
                return new TokenizedCard[i];
            case 22:
                return new LinkableTextParams[i];
            case 23:
                return new PaypalConsentLaunchParams[i];
            case 24:
                return new ShippingAddress[i];
            case 25:
                return new LinkParams[i];
            case 26:
                return new FBPayAddress[i];
            case 27:
                return new FormDialogParams[i];
            case 28:
                return new FormLogEvents[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new FormParams[i];
            case 30:
                return new MerchantInfo[i];
            case 31:
                return new FBPayOrder[i];
            case 32:
                return new FbPayAdditionalField[i];
            case 33:
                return new FbPayBankAccount[i];
            case 34:
                return new FbPayCreditCard[i];
            case 35:
                return new FbPayNewCreditCardOption[i];
            case 36:
                return new FbPayNewPayPalOption[i];
            case 37:
                return new FbPayPayPal[i];
            case 38:
                return new FbPayPaymentDefaultInfo[i];
            case 39:
                return new FbPayPaymentMethod[i];
            case 40:
                return new FbPayShopPay[i];
            case Seq.NULL_REFNUM /* 41 */:
                return new FBPayHubRiskEnforcementData[i];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new UpcomingPayout[i];
            case 43:
                return new FBPayIcon[i];
            case 44:
                return new TooltipInfo[i];
            case 45:
                return new Address[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new CardDetails[i];
            case 47:
                return new Contact[i];
            case 48:
                return new Email[i];
            case 49:
                return new Phone[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return new W3CCardDetail[i];
            case 51:
                return new DrmInitData[i];
            case 52:
                return new DrmInitData.SchemeData[i];
            case 53:
                return new AppInfoTable[i];
            case 54:
                return new EventMessage[i];
            case 55:
                return new PictureFrame[i];
            case 56:
                return new VorbisComment[i];
            case 57:
                return new IcyHeaders[i];
            case 58:
                return new IcyInfo[i];
            case 59:
                return new ApicFrame[i];
            case 60:
                return new BinaryFrame[i];
            case 61:
                return new ChapterFrame[i];
            case 62:
                return new ChapterTocFrame[i];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new CommentFrame[i];
            case 64:
                return new GeobFrame[i];
            case 65:
                return new InternalFrame[i];
            case 66:
                return new MlltFrame[i];
            case 67:
                return new PrivFrame[i];
            case 68:
                return new TextInformationFrame[i];
            case 69:
                return new UrlLinkFrame[i];
            case 70:
                return new MdtaMetadataEntry[i];
            case 71:
                return new MotionPhotoMetadata[i];
            case 72:
                return new SlowMotionData[i];
            case 73:
                return new SlowMotionData.Segment[i];
            case 74:
                return new SmtaMetadataEntry[i];
            case 75:
                return new PrivateCommand[i];
            case 76:
                return new SpliceInsertCommand[i];
            case 77:
                return new SpliceNullCommand[i];
            case 78:
                return new SpliceScheduleCommand[i];
            case 79:
                return new TimeSignalCommand[i];
            case 80:
                return new com.google.android.exoplayer2.metadata.vorbis.VorbisComment[i];
            case 81:
                return new CameraMotionData[i];
            case 82:
                return new DownloadRequest[i];
            case 83:
                return new StreamKey[i];
            case 84:
                return new Requirements[i];
            case 85:
                return new FlexboxLayout$LayoutParams[i];
            case 86:
                return new FlexboxLayoutManager.LayoutParams[i];
            case 87:
                return new FlexboxLayoutManager.SavedState[i];
            case 88:
                return new zzo[i];
            case 89:
                return new zzs[i];
            case 90:
                return new zzu[i];
            case 91:
                return new zzw[i];
            case 92:
                return new DeviceMetaData[i];
            case 93:
                return new Credential[i];
            case 94:
                return new CredentialPickerConfig[i];
            case 95:
                return new CredentialRequest[i];
            case 96:
                return new HintRequest[i];
            case 97:
                return new IdToken[i];
            case 98:
                return new AuthorizationRequest[i];
            default:
                return new AuthorizationResult[i];
        }
    }
}
