package X;

import android.graphics.RectF;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.CellInfo;
import com.facebook.android.maps.model.CameraPosition;
import com.facebook.blescan.parcelable.ParcelableBleScanResult;
import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.cellinfo.parcelable.ParcelableGeneralCellInfo;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.facebook.iabadscontext.Availability;
import com.facebook.iabadscontext.CheckoutSetupPayload;
import com.facebook.iabadscontext.DisclaimerBodyUrlRanges;
import com.facebook.iabadscontext.DisclaimerText;
import com.facebook.iabadscontext.IABAdsBwIntegrationExtension;
import com.facebook.iabadscontext.IABAdsContext;
import com.facebook.iabadscontext.IABAdsMetaCheckoutDataExtension;
import com.facebook.iabadscontext.IABAdsMetaCheckoutPaymentsSDKDataExtension;
import com.facebook.iabadscontext.IABBwPayPalExtension;
import com.facebook.iabadscontext.IABDummyContext;
import com.facebook.iabadscontext.IABOrganicContext;
import com.facebook.iabadscontext.IABPostClickPersonalizationDataExtension;
import com.facebook.iabadscontext.IABWatchAndBrowseWebToWAExtension;
import com.facebook.iabadscontext.IabAdCreativeOptimizationConfigByType;
import com.facebook.iabadscontext.IgPromoAdsExtension;
import com.facebook.iabadscontext.IgPromoAdsPromoCode;
import com.facebook.iabadscontext.MessagingExtensionType;
import com.facebook.iabadscontext.MetaCheckoutExperienceType;
import com.facebook.iabadscontext.PaymentConfig;
import com.facebook.iabadscontext.ReceiverInfo;
import com.facebook.iabbwpextension.IABBwPContext;
import com.facebook.iabbwpextension.IABBwPExtension;
import com.facebook.iabeventlogging.model.IABChangeViewModeEvent;
import com.facebook.iabeventlogging.model.IABCopyLinkEvent;
import com.facebook.iabeventlogging.model.IABDropPixelsEvent;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABFirstContentfulPaintEvent;
import com.facebook.iabeventlogging.model.IABFirstPauseEvent;
import com.facebook.iabeventlogging.model.IABHistoryDataWriterEvent;
import com.facebook.iabeventlogging.model.IABHistoryEvent;
import com.facebook.iabeventlogging.model.IABHistoryInteractionEvent;
import com.facebook.iabeventlogging.model.IABIPAMatchKeyEvent;
import com.facebook.iabeventlogging.model.IABLandingPageFinishedEvent;
import com.facebook.iabeventlogging.model.IABLandingPageInteractiveEvent;
import com.facebook.iabeventlogging.model.IABLandingPageStartedEvent;
import com.facebook.iabeventlogging.model.IABLandingPageViewEndedEvent;
import com.facebook.iabeventlogging.model.IABLaunchEvent;
import com.facebook.iabeventlogging.model.IABNonViewableEvent;
import com.facebook.iabeventlogging.model.IABOpenExternalEvent;
import com.facebook.iabeventlogging.model.IABOpenSecureInfoPopupEvent;
import com.facebook.iabeventlogging.model.IABReactivatePixelsEvent;
import com.facebook.iabeventlogging.model.IABRefreshEvent;
import com.facebook.iabeventlogging.model.IABReportStartEvent;
import com.facebook.iabeventlogging.model.IABScreenshotImpressionEvent;
import com.facebook.iabeventlogging.model.IABShareEvent;
import com.facebook.iabeventlogging.model.IABUnifiedEvent;
import com.facebook.iabeventlogging.model.IABViewableEvent;
import com.facebook.iabeventlogging.model.IABWebviewEndEvent;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.interstitial.triggers.InterstitialTriggerContext;
import com.facebook.location.logging.MaxImpressionsPerInterval;
import com.facebook.location.parcelable.ParcelableCoordinates;
import com.facebook.location.parcelable.ParcelableFbLocationContinuousListenerParams;
import com.facebook.location.parcelable.ParcelableFbLocationOperationParams;
import com.facebook.location.parcelable.ParcelableGeofenceResult;
import com.facebook.location.parcelable.ParcelableImmutableLocation;
import com.facebook.location.signalpackage.ParcelableVisitStateAlgorithmVersion;
import com.facebook.location.signalpackage.parcelable.ParcelableActivityRecognitionResult;
import com.facebook.location.signalpackage.parcelable.ParcelableDetectedActivity;
import com.facebook.location.signalpackage.parcelable.ParcelableLocationSignalPackage;
import com.facebook.locationsharing.core.models.Address;
import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.facebook.locationsharing.core.models.LiveLocationSharer;
import com.facebook.locationsharing.core.models.LocationSharingPresenterState;
import com.facebook.locationsharing.core.models.Place;
import com.facebook.locationsharing.core.models.PointOfInterest;
import com.facebook.locationsharing.core.models.PointOfInterestViewModel;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import com.facebook.maps.delegate.common.interfaces.MapOptions;
import com.facebook.mqtt.service.ipc.SubscriptionParcelable;
import com.facebook.neko.directinstall.installer.DirectInstallDownloadEvent;
import com.facebook.notifications.constants.push.NotificationType;
import com.facebook.oxygen.preloads.integration.install.bottomsheet.BottomSheetFeatures;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeParcelable;
import com.facebook.privacy.zone.api.ZonedValue;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.facebook.push.constants.PushProperty;
import com.facebook.push.fbpushtokencommon.RegisterPushTokenParams;
import com.facebook.reportaproblem.base.bugreport.file.BugReportFile;
import com.facebook.rti.mqtt.protocol.messages.GqlsTopicExtraInfo;
import com.facebook.sensors.parcelable.ParcelableSensorEventClone;
import com.facebook.smartcapture.camera.DialogTexts;
import com.facebook.smartcapture.camera.sizesetter.FixedSizes;
import com.facebook.smartcapture.camera.sizesetter.Size;
import com.facebook.smartcapture.capture.DefaultEvidenceRecorderProvider;
import com.facebook.smartcapture.capture.SelfieEvidence;
import com.facebook.smartcapture.config.ChallengeProvider;
import com.facebook.smartcapture.download.IgVoltronAndNmlModulesDownloader;
import com.facebook.smartcapture.flow.IdCaptureConfig;
import com.facebook.smartcapture.flow.SelfieCaptureConfig;
import com.facebook.smartcapture.ig.logging.IgSmartCaptureLoggerProvider;
import com.facebook.smartcapture.ui.consent.ResolvedConsentTextsProvider;
import com.facebook.spherical.model.PanoBounds;
import com.facebook.ui.emoji.model.BasicEmoji;
import com.facebook.ui.emoji.model.DrawableBackedEmoji;
import com.facebook.ui.emoji.model.Emoji;
import com.facebook.ui.emoji.model.EmojiSet;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.heroplayer.ipc.FirstDataSegmentCacheCheckEndEvent;
import com.facebook.video.heroplayer.ipc.FirstDataSegmentCacheCheckStartEvent;
import com.facebook.video.heroplayer.ipc.PrefetchTaskDataFetchCompletedEvent;
import com.facebook.video.heroplayer.ipc.PrefetchTaskDataFetchIssuedEvent;
import com.facebook.video.heroplayer.ipc.SpatialAudioFocusParams;
import com.facebook.video.heroplayer.ipc.VideoProtocolProps;
import com.facebook.videolite.transcoder.base.SphericalMetadata;
import com.facebook.wearable.applinks.AppLinkDeviceConnectionStatus;
import com.facebook.wearable.applinks.AppLinkDeviceHardwareState;
import com.facebook.wearable.applinks.AppLinkDeviceMountState;
import com.facebook.wearable.applinks.AppLinkDevicePeakPowerState;
import com.facebook.wifiscan.parcelable.ParcelableWifiScanResult;
import com.facebookpay.apm.APMConfigurationImpl;
import com.facebookpay.bloks.nativeprops.APMBloksNativeProps;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.models.Distance;
import com.facebookpay.common.models.ErrorDialogContent;
import com.facebookpay.common.recyclerview.adapteritems.APMButtonsItem;
import com.facebookpay.common.recyclerview.adapteritems.AnonCheckoutPuxLink;
import com.facebookpay.common.recyclerview.adapteritems.AnonCheckoutToggleItem;
import com.facebookpay.common.recyclerview.adapteritems.AutoAdvanceButtonItem;
import com.facebookpay.common.recyclerview.adapteritems.CheckoutOptionalityItem;
import com.facebookpay.common.recyclerview.adapteritems.ConfirmationPaymentSectionItem;
import com.facebookpay.common.recyclerview.adapteritems.ConfirmationProductUpsellItem;
import com.facebookpay.common.recyclerview.adapteritems.ConfirmationProductUpsellSectionHeaderItem;
import com.facebookpay.common.recyclerview.adapteritems.EmailOptInItem;
import com.facebookpay.expresscheckout.models.APMConfiguration;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* renamed from: X.SlE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63473SlE implements Parcelable.Creator {
    public final int A00;

    public C63473SlE(int i) {
        this.A00 = i;
    }

    public static ZonedValue A00(Parcel parcel, Object obj) {
        Parcelable.Creator creator = IABEvent.CREATOR;
        C14360o3.A0B(obj, 0);
        ZonedValue zonedValue = (ZonedValue) parcel.readParcelable(ZonedValue.class.getClassLoader());
        if (zonedValue == null) {
            return new ZonedValue(ZonePolicy.A05, "");
        }
        return zonedValue;
    }

    public static C63473SlE A01(int i) {
        return new C63473SlE(i);
    }

    /* JADX WARN: Type inference failed for: r7v34, types: [java.lang.Object, X.Rpt] */
    /* JADX WARN: Type inference failed for: r7v47, types: [com.facebook.maps.delegate.common.interfaces.MapOptions, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v48, types: [com.facebook.mqtt.service.ipc.SubscriptionParcelable, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        ArrayList A17;
        Integer num;
        Integer num2;
        Long A0j;
        Integer A0U;
        Object createFromParcel2;
        Object createFromParcel3;
        Object createFromParcel4;
        Object createFromParcel5;
        Object createFromParcel6;
        Object createFromParcel7;
        Object createFromParcel8;
        Integer num3;
        VHa vHa;
        EnumC223299tM enumC223299tM;
        VHa vHa2;
        EnumC39621HeV enumC39621HeV;
        RiS riS;
        RiS[] values;
        int length;
        int i;
        RiS riS2;
        RiS[] values2;
        int length2;
        int i2;
        EnumC223219t5 enumC223219t5;
        Integer num4;
        Long valueOf;
        Long valueOf2;
        Integer num5;
        Long A0j2;
        Integer num6;
        Enum valueOf3;
        Integer num7;
        ClassLoader classLoader;
        Integer num8;
        Integer A0U2;
        VEJ valueOf4;
        VEJ valueOf5;
        Boolean valueOf6;
        C103804lz c103804lz;
        ImmutableList A01;
        ImmutableList A012;
        ImmutableList A013;
        Integer A0U3;
        ImmutableList A03;
        Integer A0U4;
        Float valueOf7;
        Integer A0U5;
        ImmutableList A014;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(parcel, 0);
                PaymentConfig paymentConfig = (PaymentConfig) PaymentConfig.CREATOR.createFromParcel(parcel);
                Availability availability = (Availability) Availability.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = ReceiverInfo.CREATOR.createFromParcel(parcel);
                }
                return new CheckoutSetupPayload(availability, paymentConfig, (ReceiverInfo) createFromParcel);
            case 1:
                return new DisclaimerBodyUrlRanges(AbstractC37304Gc5.A00(parcel), parcel.readInt(), parcel.readString());
            case 2:
                String A0d = AbstractC37304Gc5.A0d(parcel);
                if (parcel.readInt() == 0) {
                    A17 = null;
                } else {
                    int readInt = parcel.readInt();
                    A17 = AbstractC25225BEi.A17(readInt);
                    int i3 = 0;
                    while (i3 != readInt) {
                        i3 = AbstractC37304Gc5.A01(parcel, DisclaimerBodyUrlRanges.CREATOR, A17, i3);
                    }
                }
                return new DisclaimerText(A0d, A17);
            case 3:
                String A0d2 = AbstractC37304Gc5.A0d(parcel);
                if (A0d2.equals("UNSET_OR_UNRECOGNIZED_ENUM_VALUE")) {
                    num = C05F.A00;
                } else if (A0d2.equals("CUSTOM_IAB_FOR_1P_BWP")) {
                    num = C05F.A01;
                } else if (A0d2.equals("STANDARD_IAB")) {
                    num = C05F.A0C;
                } else if (A0d2.equals("BWI_STANDARD_IAB")) {
                    num = C05F.A0N;
                } else {
                    throw AbstractC166987dD.A12(A0d2);
                }
                String readString = parcel.readString();
                if (readString.equals("UNSET_OR_UNRECOGNIZED_ENUM_VALUE")) {
                    num2 = C05F.A00;
                } else if (readString.equals("AMAZON")) {
                    num2 = C05F.A01;
                } else if (readString.equals("JEST_E2E_AMAZON")) {
                    num2 = C05F.A0C;
                } else if (readString.equals("SHOPEE_TH")) {
                    num2 = C05F.A0N;
                } else if (readString.equals("WALMART")) {
                    num2 = C05F.A0Y;
                } else {
                    throw AbstractC166987dD.A12(readString);
                }
                String readString2 = parcel.readString();
                Integer num9 = null;
                if (parcel.readInt() == 0) {
                    A0j = null;
                } else {
                    A0j = AbstractC58322PtE.A0j(parcel);
                }
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                if (parcel.readInt() != 0) {
                    num9 = AbstractC37304Gc5.A0U(parcel);
                }
                return new IABAdsBwIntegrationExtension(num, num2, num9, A0j, readString2, readString3, readString4, parcel.readString(), parcel.readString());
            case 4:
                Object obj = null;
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    A0U = null;
                } else {
                    A0U = AbstractC37304Gc5.A0U(parcel);
                }
                ImmutableList immutableList = (ImmutableList) parcel.readSerializable();
                String readString5 = parcel.readString();
                int readInt2 = parcel.readInt();
                LinkedHashMap A18 = AbstractC25225BEi.A18(readInt2);
                for (int i4 = 0; i4 != readInt2; i4++) {
                    A18.put(EnumC39621HeV.valueOf(parcel.readString()), DisclaimerText.CREATOR.createFromParcel(parcel));
                }
                String readString6 = parcel.readString();
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                IABAdsMetaCheckoutDataExtension iABAdsMetaCheckoutDataExtension = (IABAdsMetaCheckoutDataExtension) IABAdsMetaCheckoutDataExtension.CREATOR.createFromParcel(parcel);
                IABBwPExtension iABBwPExtension = (IABBwPExtension) AbstractC37304Gc5.A04(parcel, IABAdsContext.class);
                if (parcel.readInt() == 0) {
                    createFromParcel2 = null;
                } else {
                    createFromParcel2 = IgPromoAdsExtension.CREATOR.createFromParcel(parcel);
                }
                IgPromoAdsExtension igPromoAdsExtension = (IgPromoAdsExtension) createFromParcel2;
                if (parcel.readInt() == 0) {
                    createFromParcel3 = null;
                } else {
                    createFromParcel3 = IABAdsMetaCheckoutPaymentsSDKDataExtension.CREATOR.createFromParcel(parcel);
                }
                IABAdsMetaCheckoutPaymentsSDKDataExtension iABAdsMetaCheckoutPaymentsSDKDataExtension = (IABAdsMetaCheckoutPaymentsSDKDataExtension) createFromParcel3;
                if (parcel.readInt() == 0) {
                    createFromParcel4 = null;
                } else {
                    createFromParcel4 = IABWatchAndBrowseWebToWAExtension.CREATOR.createFromParcel(parcel);
                }
                IABWatchAndBrowseWebToWAExtension iABWatchAndBrowseWebToWAExtension = (IABWatchAndBrowseWebToWAExtension) createFromParcel4;
                if (parcel.readInt() == 0) {
                    createFromParcel5 = null;
                } else {
                    createFromParcel5 = IABAdsBwIntegrationExtension.CREATOR.createFromParcel(parcel);
                }
                IABAdsBwIntegrationExtension iABAdsBwIntegrationExtension = (IABAdsBwIntegrationExtension) createFromParcel5;
                if (parcel.readInt() == 0) {
                    createFromParcel6 = null;
                } else {
                    createFromParcel6 = IABPostClickPersonalizationDataExtension.CREATOR.createFromParcel(parcel);
                }
                IABPostClickPersonalizationDataExtension iABPostClickPersonalizationDataExtension = (IABPostClickPersonalizationDataExtension) createFromParcel6;
                if (parcel.readInt() != 0) {
                    obj = IABBwPayPalExtension.CREATOR.createFromParcel(parcel);
                }
                return new IABAdsContext(iABAdsBwIntegrationExtension, iABAdsMetaCheckoutDataExtension, iABAdsMetaCheckoutPaymentsSDKDataExtension, (IABBwPayPalExtension) obj, iABPostClickPersonalizationDataExtension, iABWatchAndBrowseWebToWAExtension, igPromoAdsExtension, iABBwPExtension, immutableList, A0U, readString5, readString6, parcel.readString(), createStringArrayList, A18);
            case 5:
                C14360o3.A0B(parcel, 0);
                return new IABAdsMetaCheckoutDataExtension((MetaCheckoutExperienceType) MetaCheckoutExperienceType.CREATOR.createFromParcel(parcel));
            case 6:
                C14360o3.A0B(parcel, 0);
                return new IABAdsMetaCheckoutPaymentsSDKDataExtension((CheckoutSetupPayload) CheckoutSetupPayload.CREATOR.createFromParcel(parcel), parcel.readString());
            case 7:
                return new IABBwPayPalExtension(parcel.readString(), parcel.readString(), AbstractC167007dF.A1M(AbstractC37304Gc5.A00(parcel)), AbstractC37304Gc5.A1W(parcel));
            case 8:
                C14360o3.A0B(parcel, 0);
                return new IABDummyContext((ImmutableList) parcel.readSerializable(), parcel.createStringArrayList());
            case 9:
                C14360o3.A0B(parcel, 0);
                return new IABOrganicContext((ImmutableList) parcel.readSerializable(), parcel.createStringArrayList());
            case 10:
                int A00 = AbstractC37304Gc5.A00(parcel);
                ArrayList A172 = AbstractC25225BEi.A17(A00);
                for (int i5 = 0; i5 != A00; i5++) {
                    if (parcel.readInt() == 0) {
                        createFromParcel7 = null;
                    } else {
                        createFromParcel7 = IabAdCreativeOptimizationConfigByType.CREATOR.createFromParcel(parcel);
                    }
                    A172.add(createFromParcel7);
                }
                return new IABPostClickPersonalizationDataExtension(A172);
            case 11:
                C14360o3.A0B(parcel, 0);
                return new IABWatchAndBrowseWebToWAExtension((MessagingExtensionType) MessagingExtensionType.CREATOR.createFromParcel(parcel));
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new IabAdCreativeOptimizationConfigByType(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                String A0d3 = AbstractC37304Gc5.A0d(parcel);
                int readInt3 = parcel.readInt();
                ArrayList A173 = AbstractC25225BEi.A17(readInt3);
                boolean z = false;
                int i6 = 0;
                while (i6 != readInt3) {
                    i6 = AbstractC37304Gc5.A01(parcel, IgPromoAdsPromoCode.CREATOR, A173, i6);
                }
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new IgPromoAdsExtension(A173, z, A0d3, parcel.readString());
            case 14:
                return new IgPromoAdsPromoCode(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case Process.SIGTERM /* 15 */:
                return MessagingExtensionType.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 16:
                return MetaCheckoutExperienceType.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 17:
                C14360o3.A0B(parcel, 0);
                return new PaymentConfig(parcel.createStringArrayList(), parcel.readString());
            case 18:
                return new ReceiverInfo(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.createStringArrayList());
            case Process.SIGSTOP /* 19 */:
                C14360o3.A0B(parcel, 0);
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                ImmutableList immutableList2 = (ImmutableList) parcel.readSerializable();
                if (parcel.readInt() == 0) {
                    createFromParcel8 = null;
                } else {
                    createFromParcel8 = IABBwPExtension.CREATOR.createFromParcel(parcel);
                }
                return new IABBwPContext((IABBwPExtension) createFromParcel8, immutableList2, createStringArrayList2);
            case 20:
                String A0d4 = AbstractC37304Gc5.A0d(parcel);
                if (A0d4.equals("UNSET_OR_UNRECOGNIZED_ENUM_VALUE")) {
                    num3 = C05F.A00;
                } else if (A0d4.equals("CUSTOM_IAB_FOR_1P")) {
                    num3 = C05F.A01;
                } else if (A0d4.equals("CUSTOM_IAB_FOR_DTC")) {
                    num3 = C05F.A0C;
                } else if (A0d4.equals("STANDARD_IAB")) {
                    num3 = C05F.A0N;
                } else {
                    throw AbstractC166987dD.A12(A0d4);
                }
                return new IABBwPExtension(num3, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
            case 21:
                EnumC61218RhI enumC61218RhI = (EnumC61218RhI) EnumC61218RhI.A01.get(parcel.readString());
                if (enumC61218RhI == null) {
                    enumC61218RhI = EnumC61218RhI.EMPTY;
                }
                String readString7 = parcel.readString();
                long readLong = parcel.readLong();
                long readLong2 = parcel.readLong();
                switch (enumC61218RhI.ordinal()) {
                    case 0:
                        return IABWebviewEndEvent.A00(parcel, readString7, readLong, readLong2);
                    case 1:
                        Parcelable.Creator creator = IABEvent.CREATOR;
                        ZonedValue zonedValue = (ZonedValue) AbstractC37304Gc5.A04(parcel, ZonedValue.class);
                        if (zonedValue == null) {
                            zonedValue = new ZonedValue(ZonePolicy.A05, "");
                        }
                        long readLong3 = parcel.readLong();
                        String readString8 = parcel.readString();
                        long readLong4 = parcel.readLong();
                        String[] createStringArray = parcel.createStringArray();
                        ArrayList A174 = AbstractC25225BEi.A17(createStringArray.length);
                        for (String str : createStringArray) {
                            if (str != null && str.length() != 0) {
                                EnumC39621HeV[] values3 = EnumC39621HeV.values();
                                int length3 = values3.length;
                                for (int i7 = 0; i7 < length3; i7++) {
                                    enumC39621HeV = values3[i7];
                                    if (!C14360o3.A0K(enumC39621HeV.A00, str)) {
                                    }
                                }
                            }
                            enumC39621HeV = EnumC39621HeV.A0E;
                            A174.add(enumC39621HeV);
                        }
                        return new IABLaunchEvent((IabCommonTrait) AbstractC37304Gc5.A04(parcel, IabCommonTrait.class), (IABViewModeLaunchConfig) AbstractC37304Gc5.A04(parcel, IABViewModeLaunchConfig.class), zonedValue, readString7, readString8, parcel.readString(), A174, readLong, readLong2, readLong3, readLong4);
                    case 2:
                        return new IABLandingPageStartedEvent(A00(parcel, readString7), readString7, readLong, readLong2, AbstractC167007dF.A1P(parcel.readByte(), 1));
                    case 3:
                        return new IABLandingPageInteractiveEvent(A00(parcel, readString7), readString7, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), readLong, readLong2, parcel.readLong(), AbstractC167007dF.A1P(parcel.readByte(), 1));
                    case 4:
                        ZonedValue A002 = A00(parcel, readString7);
                        String readString9 = parcel.readString();
                        ArrayList readArrayList = parcel.readArrayList(EnumC39621HeV.class.getClassLoader());
                        if (readArrayList == null) {
                            readArrayList = null;
                        }
                        return new IABLandingPageFinishedEvent(A002, readString7, readString9, readArrayList, readLong, readLong2);
                    case 5:
                        return new IABLandingPageViewEndedEvent(A00(parcel, readString7), readString7, readLong, readLong2);
                    case 6:
                        Parcelable.Creator creator2 = IABEvent.CREATOR;
                        return new IABOpenExternalEvent(readString7, parcel.readString(), parcel.readString(), readLong, readLong2);
                    case 7:
                        Parcelable.Creator creator3 = IABEvent.CREATOR;
                        return new IABCopyLinkEvent(readLong, readString7, readLong2, parcel.readString());
                    case 8:
                        return new IABEvent(EnumC61218RhI.IAB_OPEN_MENU, readString7, readLong, readLong2);
                    case 9:
                        Parcelable.Creator creator4 = IABEvent.CREATOR;
                        C14360o3.A0B(readString7, 0);
                        String readString10 = parcel.readString();
                        String readString11 = parcel.readString();
                        if (readString11 == null) {
                            readString11 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                        }
                        VHg valueOf8 = VHg.valueOf(readString11);
                        String readString12 = parcel.readString();
                        if (readString12 == null) {
                            readString12 = "";
                        }
                        return new IABScreenshotImpressionEvent(valueOf8, readString7, readString10, readString12, readLong);
                    case 10:
                        Parcelable.Creator creator5 = IABEvent.CREATOR;
                        return new IABShareEvent(readString7, parcel.readString(), parcel.readString(), readLong, readLong2);
                    case 11:
                        Parcelable.Creator creator6 = IABEvent.CREATOR;
                        String readString13 = parcel.readString();
                        ZonedValue zonedValue2 = (ZonedValue) AbstractC37304Gc5.A04(parcel, ZonedValue.class);
                        String readString14 = parcel.readString();
                        String str2 = "";
                        String str3 = "";
                        if (readString13 != null) {
                            str3 = readString13;
                        }
                        if (zonedValue2 == null) {
                            zonedValue2 = new ZonedValue(ZonePolicy.A05, "");
                        }
                        if (readString14 != null) {
                            str2 = readString14;
                        }
                        return new IABReportStartEvent(zonedValue2, readString7, str3, str2, readLong, readLong2);
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        Parcelable.Creator creator7 = IABEvent.CREATOR;
                        return new IABRefreshEvent(readLong, readString7, readLong2, parcel.readString());
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        Parcelable.Creator creator8 = IABEvent.CREATOR;
                        long readLong5 = parcel.readLong();
                        long readLong6 = parcel.readLong();
                        long readLong7 = parcel.readLong();
                        long readLong8 = parcel.readLong();
                        long readLong9 = parcel.readLong();
                        long readLong10 = parcel.readLong();
                        long readLong11 = parcel.readLong();
                        return new IABFirstPauseEvent((ZonedValue) AbstractC37304Gc5.A04(parcel, ZonedValue.class), readString7, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readArrayList(ArrayList.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), readLong, readLong2, readLong5, readLong6, readLong7, readLong8, readLong9, readLong10, readLong11, parcel.readLong(), parcel.readLong(), parcel.readLong(), AbstractC167007dF.A1P(parcel.readByte(), 1), AbstractC58323PtF.A1X(parcel));
                    case 14:
                        Parcelable.Creator creator9 = IABEvent.CREATOR;
                        String readString15 = parcel.readString();
                        String readString16 = parcel.readString();
                        if (readString15 == null) {
                            readString15 = "";
                        }
                        if (readString16 == null) {
                            readString16 = "";
                        }
                        return new IABDropPixelsEvent(readString7, readString15, readString16, readLong, readLong2);
                    case Process.SIGTERM /* 15 */:
                        Parcelable.Creator creator10 = IABEvent.CREATOR;
                        String readString17 = parcel.readString();
                        String readString18 = parcel.readString();
                        if (readString17 == null) {
                            readString17 = "";
                        }
                        if (readString18 == null) {
                            readString18 = "";
                        }
                        return new IABReactivatePixelsEvent(readString7, readString17, readString18, readLong, readLong2);
                    case 16:
                        Parcelable.Creator creator11 = IABEvent.CREATOR;
                        return new IABOpenSecureInfoPopupEvent(readLong, readString7, AbstractC167007dF.A1P(parcel.readByte(), 1), readLong2);
                    case 17:
                        Parcelable.Creator creator12 = IABEvent.CREATOR;
                        String[] createStringArray2 = parcel.createStringArray();
                        if (createStringArray2 == null) {
                            createStringArray2 = new String[0];
                        }
                        long readLong12 = parcel.readLong();
                        long readLong13 = parcel.readLong();
                        long readLong14 = parcel.readLong();
                        boolean A1V = AbstractC37304Gc5.A1V(parcel);
                        Long l = null;
                        if (readLong12 == -1) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(readLong12);
                        }
                        if (readLong13 == -1) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Long.valueOf(readLong13);
                        }
                        if (readLong14 != -1) {
                            l = Long.valueOf(readLong14);
                        }
                        return new IABHistoryEvent(valueOf, valueOf2, l, readString7, createStringArray2, readLong, readLong2, A1V);
                    case 18:
                        Parcelable.Creator creator13 = IABEvent.CREATOR;
                        String readString19 = parcel.readString();
                        long readLong15 = parcel.readLong();
                        long readLong16 = parcel.readLong();
                        String readString20 = parcel.readString();
                        if (readString19 == null) {
                            readString19 = "";
                        }
                        return new IABHistoryDataWriterEvent(readString7, readString19, readString20, readLong, readLong2, readLong15, readLong16);
                    case Process.SIGSTOP /* 19 */:
                        Parcelable.Creator creator14 = IABEvent.CREATOR;
                        String readString21 = parcel.readString();
                        String readString22 = parcel.readString();
                        if (readString22 == null) {
                            readString22 = "";
                        }
                        if (readString21 != null) {
                            if (readString21.equals("SETTINGS_CLEAR_ERROR")) {
                                num5 = C05F.A00;
                            } else if (readString21.equals("SETTINGS_CLEAR_CANCEL_CLICKED")) {
                                num5 = C05F.A01;
                            } else if (readString21.equals("SETTINGS_CLEAR_CLICKED")) {
                                num5 = C05F.A0C;
                            } else if (readString21.equals("SETTINGS_CLEAR_CONFIRM_CLICKED")) {
                                num5 = C05F.A0N;
                            } else if (readString21.equals("SETTINGS_DATA_POLICY_CLICKED")) {
                                num5 = C05F.A0Y;
                            } else if (readString21.equals("SETTINGS_LINK_HISTORY_SWITCH_TOGGLED_OFF_CLICKED")) {
                                num5 = C05F.A0j;
                            } else if (readString21.equals("SETTINGS_LINK_HISTORY_SWITCH_TOGGLED_ON_CLICKED")) {
                                num5 = C05F.A0u;
                            } else if (readString21.equals("VIEW_LINK_HISTORY_OVERFLOW_ITEM_CLICKED")) {
                                num5 = C05F.A15;
                            } else if (readString21.equals("VIEW_LINK_HISTORY_FOOTER_ICON_CLICKED")) {
                                num5 = C05F.A1F;
                            } else if (readString21.equals("OPT_IN_UI_SHOW")) {
                                num5 = C05F.A1I;
                            } else if (readString21.equals("OPT_IN_NUX_UI_SKIP")) {
                                num5 = C05F.A02;
                            } else if (readString21.equals("TOOLTIP_SHOWN")) {
                                num5 = C05F.A03;
                            } else if (readString21.equals("TOOLTIP_DISMISSED")) {
                                num5 = C05F.A04;
                            } else if (readString21.equals("OPT_IN_UI_STATUS_READ_STARTED")) {
                                num5 = C05F.A05;
                            } else if (readString21.equals("OPT_IN_UI_STATUS_READ_FINISHED")) {
                                num5 = C05F.A06;
                            } else if (readString21.equals("OPT_IN_UI_STATUS_READ_ERROR")) {
                                num5 = C05F.A07;
                            } else if (readString21.equals("HISTORY_WRITE_STARTED")) {
                                num5 = C05F.A08;
                            } else if (readString21.equals("HISTORY_WRITE_FINISHED")) {
                                num5 = C05F.A09;
                            } else if (readString21.equals("HISTORY_WRITE_ERROR")) {
                                num5 = C05F.A0A;
                            } else if (!readString21.equals("INCORRECT_TYPE")) {
                                throw AbstractC166987dD.A12(readString21);
                            }
                            return new IABHistoryInteractionEvent(num5, readString7, readString22, readLong, readLong2);
                        }
                        num5 = C05F.A0B;
                        return new IABHistoryInteractionEvent(num5, readString7, readString22, readLong, readLong2);
                    case 20:
                        ZonedValue A003 = A00(parcel, readString7);
                        long readLong17 = parcel.readLong();
                        String readString23 = parcel.readString();
                        long readLong18 = parcel.readLong();
                        try {
                            values = RiS.values();
                            length = values.length;
                        } catch (NoSuchElementException unused) {
                            C0K8.A0E("IABViewableEvent", "IABNVSource enums read from parcel are not valid, this should never happen!");
                            riS = null;
                        }
                        for (i = 0; i < length; i++) {
                            riS = values[i];
                            Long valueOf9 = Long.valueOf(riS.A00);
                            if (valueOf9 != null && valueOf9.longValue() == readLong18) {
                                return new IABViewableEvent(riS, A003, readString7, readString23, readLong, readLong2, readLong17);
                            }
                        }
                        throw new NoSuchElementException(MSV.A00(6));
                    case 21:
                        ZonedValue A004 = A00(parcel, readString7);
                        long readLong19 = parcel.readLong();
                        long readLong20 = parcel.readLong();
                        try {
                            values2 = RiS.values();
                            length2 = values2.length;
                        } catch (NoSuchElementException unused2) {
                            C0K8.A0E("IABNonViewableEvent", "IABNVSource enums read from parcel are not valid, this should never happen!");
                            riS2 = null;
                        }
                        for (i2 = 0; i2 < length2; i2++) {
                            riS2 = values2[i2];
                            Long valueOf10 = Long.valueOf(riS2.A00);
                            if (valueOf10 != null && valueOf10.longValue() == readLong20) {
                                return new IABNonViewableEvent(riS2, A004, readString7, readLong, readLong2, readLong19);
                            }
                        }
                        throw new NoSuchElementException(MSV.A00(6));
                    case 22:
                        Parcelable.Creator creator15 = IABEvent.CREATOR;
                        C14360o3.A0B(readString7, 0);
                        try {
                            String readString24 = parcel.readString();
                            String str4 = "";
                            if (readString24 == null) {
                                readString24 = "";
                            }
                            String readString25 = parcel.readString();
                            if (readString25 == null) {
                                readString25 = "";
                            }
                            String readString26 = parcel.readString();
                            if (readString26 != null) {
                                str4 = readString26;
                            }
                            vHa2 = VHa.valueOf(readString24);
                            vHa = VHa.valueOf(readString25);
                            enumC223299tM = EnumC223299tM.valueOf(str4);
                        } catch (IllegalArgumentException unused3) {
                            C0K8.A0E("IABChangeViewModeEvent", "View mode enums read from parcel are not valid, this should never happen");
                            vHa = VHa.FULL_SCREEN;
                            enumC223299tM = EnumC223299tM.AUTO;
                            vHa2 = vHa;
                        }
                        return new IABChangeViewModeEvent(enumC223299tM, vHa2, vHa, readString7, parcel.readString(), readLong, readLong2);
                    case 23:
                        Parcelable.Creator creator16 = IABEvent.CREATOR;
                        C14360o3.A0B(readString7, 0);
                        String readString27 = parcel.readString();
                        String readString28 = parcel.readString();
                        String readString29 = parcel.readString();
                        long readLong21 = parcel.readLong();
                        long readLong22 = parcel.readLong();
                        String readString30 = parcel.readString();
                        if (readString27 != null && readString28 != null && readString29 != null && readString30 != null) {
                            return new IABIPAMatchKeyEvent(readString7, readString30, new C51u(readString27, readString28, readString29), readLong, readLong2, readLong21, readLong22);
                        }
                        throw AbstractC166987dD.A18("IABIPAMatchKeyEvent missing required fields");
                    case 24:
                        Parcelable.Creator creator17 = IABEvent.CREATOR;
                        C14360o3.A0B(readString7, 0);
                        return new IABFirstContentfulPaintEvent(readString7, readLong, readLong2);
                    case 25:
                        Parcelable.Creator creator18 = IABEvent.CREATOR;
                        int i8 = 0;
                        C14360o3.A0B(readString7, 0);
                        String readString31 = parcel.readString();
                        String readString32 = parcel.readString();
                        String readString33 = parcel.readString();
                        EnumC223219t5[] values4 = EnumC223219t5.values();
                        int length4 = values4.length;
                        int i9 = 0;
                        while (true) {
                            if (i8 < length4) {
                                enumC223219t5 = values4[i8];
                                if (!C14360o3.A0K(enumC223219t5.name(), readString31)) {
                                    i8++;
                                }
                            } else {
                                enumC223219t5 = EnumC223219t5.A1i;
                            }
                        }
                        Integer[] A005 = C05F.A00(5);
                        int length5 = A005.length;
                        while (true) {
                            if (i9 < length5) {
                                num4 = A005[i9];
                                if (!C14360o3.A0K(AbstractC61782Rtc.A00(num4), readString32)) {
                                    i9++;
                                }
                            } else {
                                num4 = C05F.A0Y;
                            }
                        }
                        return new IABUnifiedEvent(enumC223219t5, num4, readString7, readString33, readLong, readLong2);
                    default:
                        return IABEvent.A04;
                }
            case 22:
                C14360o3.A0B(parcel, 0);
                return new InterstitialTrigger(parcel);
            case 23:
                C14360o3.A0B(parcel, 0);
                return new InterstitialTriggerContext(parcel);
            case 24:
                return new MaxImpressionsPerInterval(parcel);
            case 25:
                return new ParcelableCoordinates(parcel);
            case 26:
                Integer A0i = AbstractC58322PtE.A0i(parcel, 4);
                long readLong23 = parcel.readLong();
                long readLong24 = parcel.readLong();
                float readFloat = parcel.readFloat();
                long readLong25 = parcel.readLong();
                if (parcel.readByte() == 0) {
                    A0j2 = null;
                } else {
                    A0j2 = AbstractC58322PtE.A0j(parcel);
                }
                return new AbstractC62605SIj(A0i, A0j2, readFloat, readLong23, readLong24, readLong25);
            case 27:
                String readString34 = parcel.readString();
                if (readString34.equals("LOW_POWER")) {
                    num6 = C05F.A00;
                } else if (readString34.equals("BALANCED_POWER_AND_ACCURACY")) {
                    num6 = C05F.A01;
                } else if (readString34.equals("HIGH_ACCURACY")) {
                    num6 = C05F.A0C;
                } else {
                    throw AbstractC166987dD.A12(readString34);
                }
                Long l2 = null;
                long readLong26 = parcel.readLong();
                float readFloat2 = parcel.readFloat();
                long readLong27 = parcel.readLong();
                Float f = null;
                if (parcel.readInt() != 0) {
                    l2 = AbstractC58322PtE.A0j(parcel);
                }
                if (parcel.readInt() != 0) {
                    f = Float.valueOf(parcel.readFloat());
                }
                return new SJE(f, num6, l2, readFloat2, parcel.readFloat(), readLong26, parcel.readLong(), parcel.readLong(), readLong27);
            case 28:
                return new ParcelableGeofenceResult(parcel);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                Parcelable A04 = AbstractC37304Gc5.A04(parcel, Location.class);
                A04.getClass();
                Location location = (Location) A04;
                byte readByte = parcel.readByte();
                boolean z2 = false;
                if (readByte != 0) {
                    z2 = true;
                    if (readByte != 1) {
                        valueOf6 = null;
                        return new C103804lz(location, valueOf6);
                    }
                }
                valueOf6 = Boolean.valueOf(z2);
                return new C103804lz(location, valueOf6);
            case 30:
                Integer A0p = AbstractC25227BEk.A0p();
                ?? obj2 = new Object();
                obj2.A01 = "";
                obj2.A03 = "";
                obj2.A02 = "";
                obj2.A00 = A0p;
                String readString35 = parcel.readString();
                if (readString35 != null) {
                    obj2.A01 = readString35;
                }
                String readString36 = parcel.readString();
                if (readString36 != null) {
                    obj2.A03 = readString36;
                }
                String readString37 = parcel.readString();
                if (readString37 != null) {
                    obj2.A02 = readString37;
                }
                obj2.A00 = AbstractC37304Gc5.A0U(parcel);
                return obj2;
            case 31:
                long readLong28 = parcel.readLong();
                long readLong29 = parcel.readLong();
                ArrayList A1E = AbstractC166987dD.A1E();
                parcel.readTypedList(A1E, ParcelableDetectedActivity.CREATOR);
                return new AbstractC62536SFn(A1E, readLong28, readLong29);
            case 32:
                return new AbstractC62475SDc(parcel.readInt(), parcel.readInt());
            case 33:
                if (parcel.readByte() == 0) {
                    c103804lz = null;
                } else {
                    double readDouble = parcel.readDouble();
                    double readDouble2 = parcel.readDouble();
                    Boolean bool = null;
                    Location location2 = new Location((String) null);
                    location2.setLatitude(readDouble);
                    location2.setLongitude(readDouble2);
                    String readString38 = parcel.readString();
                    if (readString38 != null) {
                        location2.setProvider(readString38);
                    }
                    if (parcel.readByte() != 0) {
                        long readLong30 = parcel.readLong();
                        if (Long.valueOf(readLong30) != null) {
                            C18C.A0E(AbstractC167007dF.A1M((readLong30 > 0L ? 1 : (readLong30 == 0L ? 0 : -1))));
                            location2.setTime(readLong30);
                        }
                    }
                    if (parcel.readByte() != 0) {
                        long readLong31 = parcel.readLong();
                        if (Long.valueOf(readLong31) != null) {
                            C18C.A0E(AbstractC167007dF.A1M((readLong31 > 0L ? 1 : (readLong31 == 0L ? 0 : -1))));
                            location2.setElapsedRealtimeNanos(readLong31);
                        }
                    }
                    if (parcel.readByte() != 0) {
                        float readFloat3 = parcel.readFloat();
                        if (Float.valueOf(readFloat3) != null) {
                            location2.setAccuracy(readFloat3);
                        }
                    }
                    if (parcel.readByte() != 0) {
                        double readDouble3 = parcel.readDouble();
                        if (Double.valueOf(readDouble3) != null) {
                            location2.setAltitude(readDouble3);
                        }
                    }
                    if (parcel.readByte() != 0) {
                        float readFloat4 = parcel.readFloat();
                        if (Float.valueOf(readFloat4) != null) {
                            location2.setBearing(readFloat4);
                        }
                    }
                    if (parcel.readByte() != 0) {
                        float readFloat5 = parcel.readFloat();
                        if (Float.valueOf(readFloat5) != null) {
                            location2.setSpeed(readFloat5);
                        }
                    }
                    location2.setExtras(parcel.readBundle());
                    Boolean A006 = AbstractC63050SbV.A00(parcel);
                    if (A006 != null) {
                        bool = A006;
                    }
                    c103804lz = new C103804lz(location2, bool);
                }
                String readString39 = parcel.readString();
                Boolean A007 = AbstractC63050SbV.A00(parcel);
                C63282Sgh c63282Sgh = (C63282Sgh) AbstractC37304Gc5.A04(parcel, ParcelableWifiScanResult.class);
                ArrayList createTypedArrayList = parcel.createTypedArrayList(ParcelableWifiScanResult.CREATOR);
                if (createTypedArrayList == null) {
                    A01 = null;
                } else {
                    A01 = AbstractC58576Pxu.A01(AbstractC58576Pxu.A00(createTypedArrayList), 10);
                }
                Boolean A008 = AbstractC63050SbV.A00(parcel);
                C202078wn c202078wn = (C202078wn) AbstractC37304Gc5.A04(parcel, ParcelableGeneralCellInfo.class);
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(CellInfo.CREATOR);
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(ParcelableBleScanResult.CREATOR);
                if (createTypedArrayList3 == null) {
                    A012 = null;
                } else {
                    A012 = AbstractC58576Pxu.A01(AbstractC58576Pxu.A00(createTypedArrayList3), 3);
                }
                Boolean A009 = AbstractC63050SbV.A00(parcel);
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(ParcelableActivityRecognitionResult.CREATOR);
                if (createTypedArrayList4 == null) {
                    A013 = null;
                } else {
                    A013 = AbstractC58576Pxu.A01(AbstractC58576Pxu.A00(createTypedArrayList4), 7);
                }
                if (parcel.readByte() == 0) {
                    A0U3 = null;
                } else {
                    A0U3 = AbstractC37304Gc5.A0U(parcel);
                }
                ArrayList createTypedArrayList5 = parcel.createTypedArrayList(ParcelableSensorEventClone.CREATOR);
                if (createTypedArrayList5 == null) {
                    A03 = null;
                } else {
                    A03 = AbstractC58576Pxu.A00(createTypedArrayList5).A02(new C64285T7u(1, C65046Tcb.A00)).A03();
                }
                String readString40 = parcel.readString();
                String readString41 = parcel.readString();
                String readString42 = parcel.readString();
                Boolean A0010 = AbstractC63050SbV.A00(parcel);
                String readString43 = parcel.readString();
                if (parcel.readByte() == 0) {
                    A0U4 = null;
                } else {
                    A0U4 = AbstractC37304Gc5.A0U(parcel);
                }
                if (parcel.readByte() == 0) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Float.valueOf(parcel.readFloat());
                }
                if (parcel.readByte() == 0) {
                    A0U5 = null;
                } else {
                    A0U5 = AbstractC37304Gc5.A0U(parcel);
                }
                ArrayList createTypedArrayList6 = parcel.createTypedArrayList(ParcelableVisitStateAlgorithmVersion.CREATOR);
                if (createTypedArrayList6 == null) {
                    A014 = null;
                } else {
                    A014 = AbstractC58576Pxu.A01(AbstractC58576Pxu.A00(createTypedArrayList6), 5);
                }
                return ParcelableLocationSignalPackage.A00(new C202098wp(c202078wn, c103804lz, c63282Sgh, A009, A007, A0010, A008, valueOf7, A0U4, A0U5, A0U3, readString40, readString41, readString39, readString43, readString42, A013, A012, createTypedArrayList2, A03, A014, A01));
            case 34:
                return new Address(parcel);
            case 35:
                return new LiveLocationSession(parcel);
            case 36:
                return new LiveLocationSharer(parcel);
            case 37:
                return new com.facebook.locationsharing.core.models.Location(parcel);
            case 38:
                return new LocationSharingPresenterState(parcel);
            case 39:
                return new Place(parcel);
            case 40:
                return new PointOfInterest(parcel);
            case Seq.NULL_REFNUM /* 41 */:
                return new PointOfInterestViewModel(parcel);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new LoginClient$Request(parcel);
            case 43:
                return new LoginClient$Result(parcel);
            case 44:
                ?? obj3 = new Object();
                obj3.A02 = 1;
                obj3.A0E = true;
                obj3.A0J = true;
                obj3.A0C = true;
                obj3.A01 = 2.0f;
                obj3.A00 = 21.0f;
                obj3.A05 = EnumC68183VFb.UNKNOWN;
                obj3.A03 = VGB.BOTTOM_RIGHT;
                obj3.A04 = (CameraPosition) AbstractC37304Gc5.A04(parcel, CameraPosition.class);
                obj3.A09 = AbstractC58320PtC.A1T(parcel);
                obj3.A02 = parcel.readInt();
                obj3.A0D = AbstractC58320PtC.A1T(parcel);
                obj3.A0E = AbstractC58320PtC.A1T(parcel);
                obj3.A0G = AbstractC58320PtC.A1T(parcel);
                obj3.A0H = AbstractC58320PtC.A1T(parcel);
                obj3.A0I = AbstractC58320PtC.A1T(parcel);
                obj3.A0J = AbstractC58320PtC.A1T(parcel);
                obj3.A0C = AbstractC58320PtC.A1T(parcel);
                obj3.A07 = parcel.readString();
                obj3.A01 = parcel.readFloat();
                obj3.A00 = parcel.readFloat();
                obj3.A08 = parcel.readString();
                obj3.A06 = parcel.readString();
                String readString44 = parcel.readString();
                if (readString44 == null) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Enum.valueOf(EnumC68183VFb.class, readString44);
                }
                obj3.A05 = (EnumC68183VFb) valueOf3;
                obj3.A03 = VGB.A00(parcel.readString());
                obj3.A0B = AbstractC58320PtC.A1T(parcel);
                obj3.A0F = AbstractC58320PtC.A1T(parcel);
                obj3.A0A = AbstractC58320PtC.A1T(parcel);
                return obj3;
            case 45:
                C14360o3.A0B(parcel, 0);
                ?? obj4 = new Object();
                obj4.A01 = "";
                String readString45 = parcel.readString();
                if (readString45 == null) {
                    readString45 = "";
                }
                obj4.A01 = readString45;
                obj4.A00 = parcel.readInt();
                return obj4;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new DirectInstallDownloadEvent(parcel);
            case 47:
                C14360o3.A0B(parcel, 0);
                return NotificationType.values()[parcel.readInt()];
            case 48:
                String A0d5 = AbstractC37304Gc5.A0d(parcel);
                if (A0d5.equals("SHOW_ALWAYS")) {
                    num7 = C05F.A00;
                } else if (A0d5.equals("SHOW_NO_WIFI")) {
                    num7 = C05F.A01;
                } else {
                    throw AbstractC166987dD.A12(A0d5);
                }
                return new BottomSheetFeatures(num7);
            case 49:
                try {
                    TreeJNI A0011 = TreeParcelable.A00(parcel);
                    if (A0011 == null) {
                        return null;
                    }
                    return new TreeParcelable(A0011);
                } catch (Exception e) {
                    C0K8.A0Q("TreeParcelable::Creator", "Failed to create Parcelable for the given Pando tree: %s", e.toString());
                    return null;
                }
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                String A0d6 = AbstractC37304Gc5.A0d(parcel);
                if (A0d6 != null) {
                    if (!A0d6.equals("NULL")) {
                        classLoader = Class.forName(A0d6).getClassLoader();
                    } else {
                        classLoader = null;
                    }
                    Object readValue = parcel.readValue(classLoader);
                    Parcelable A042 = AbstractC37304Gc5.A04(parcel, ZonePolicy.class);
                    if (A042 != null) {
                        ZonePolicy zonePolicy = (ZonePolicy) A042;
                        String readString46 = parcel.readString();
                        if (readString46 != null) {
                            return new ZonedValue(zonePolicy, readValue, readString46);
                        }
                        throw AbstractC166987dD.A12("Required value was null.");
                    }
                    throw AbstractC166987dD.A12("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 51:
                return ZonePolicy.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 52:
                C14360o3.A0B(parcel, 0);
                return new PushProperty(parcel);
            case 53:
                C14360o3.A0B(parcel, 0);
                return new RegisterPushTokenParams(parcel);
            case 54:
                return new BugReportFile(parcel);
            case 55:
                return new GqlsTopicExtraInfo(parcel);
            case 56:
                SHZ shz = new SHZ(new float[parcel.readInt()], AbstractC37304Gc5.A00(parcel), parcel.readInt(), parcel.readLong());
                parcel.readFloatArray(shz.A03);
                return shz;
            case 57:
                return new DialogTexts(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 58:
                C14360o3.A0B(parcel, 0);
                Parcelable.Creator creator19 = Size.CREATOR;
                return new FixedSizes((Size) creator19.createFromParcel(parcel), (Size) creator19.createFromParcel(parcel), AbstractC37304Gc5.A1V(parcel));
            case 59:
                return new Size(AbstractC37304Gc5.A00(parcel), parcel.readInt());
            case 60:
                C14360o3.A0B(parcel, 0);
                DefaultEvidenceRecorderProvider defaultEvidenceRecorderProvider = new DefaultEvidenceRecorderProvider();
                defaultEvidenceRecorderProvider.A04 = parcel.readString();
                defaultEvidenceRecorderProvider.A01 = parcel.readLong();
                defaultEvidenceRecorderProvider.A05 = parcel.readString();
                parcel.readStringList(defaultEvidenceRecorderProvider.A06);
                defaultEvidenceRecorderProvider.A00 = parcel.readInt();
                defaultEvidenceRecorderProvider.A03 = AbstractC58322PtE.A0i(parcel, 3);
                defaultEvidenceRecorderProvider.A02 = (RectF) AbstractC37304Gc5.A04(parcel, RectF.class);
                return defaultEvidenceRecorderProvider;
            case 61:
                return new SelfieEvidence(parcel);
            case 62:
                C14360o3.A0B(parcel, 0);
                return new ChallengeProvider(parcel);
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                C14360o3.A0B(parcel, 0);
                return new IgVoltronAndNmlModulesDownloader(parcel);
            case 64:
                return new IdCaptureConfig(parcel);
            case 65:
                return new SelfieCaptureConfig(parcel);
            case 66:
                C14360o3.A0B(parcel, 0);
                return new IgSmartCaptureLoggerProvider(parcel);
            case 67:
                C14360o3.A0B(parcel, 0);
                EnumMap enumMap = new EnumMap(EnumC46185KcN.class);
                AbstractC58321PtD.A1A(parcel, EnumC46185KcN.A09, enumMap);
                AbstractC58321PtD.A1A(parcel, EnumC46185KcN.A08, enumMap);
                AbstractC58321PtD.A1A(parcel, EnumC46185KcN.A0B, enumMap);
                AbstractC58321PtD.A1A(parcel, EnumC46185KcN.A0A, enumMap);
                AbstractC58321PtD.A1A(parcel, EnumC46185KcN.A06, enumMap);
                AbstractC58321PtD.A1A(parcel, EnumC46185KcN.A02, enumMap);
                AbstractC58321PtD.A1A(parcel, EnumC46185KcN.A03, enumMap);
                AbstractC58321PtD.A1A(parcel, EnumC46185KcN.A04, enumMap);
                AbstractC58321PtD.A1A(parcel, EnumC46185KcN.A07, enumMap);
                AbstractC58321PtD.A1A(parcel, EnumC46185KcN.A05, enumMap);
                AbstractC58321PtD.A1A(parcel, EnumC46185KcN.A0I, enumMap);
                AbstractC58321PtD.A1A(parcel, EnumC46185KcN.A0C, enumMap);
                AbstractC58321PtD.A1A(parcel, EnumC46185KcN.A0F, enumMap);
                AbstractC58321PtD.A1A(parcel, EnumC46185KcN.A0D, enumMap);
                AbstractC58321PtD.A1A(parcel, EnumC46185KcN.A0E, enumMap);
                AbstractC58321PtD.A1A(parcel, EnumC46185KcN.A0H, enumMap);
                AbstractC58321PtD.A1A(parcel, EnumC46185KcN.A0G, enumMap);
                return new ResolvedConsentTextsProvider(new L5Q(enumMap));
            case 68:
                return new PanoBounds(parcel);
            case 69:
                return new BasicEmoji(parcel);
            case 70:
                return new DrawableBackedEmoji(parcel);
            case 71:
                return new EmojiSet(parcel);
            case 72:
                return new EmojiSet.Metadata(parcel);
            case 73:
                C14360o3.A0B(parcel, 0);
                return new PlayerOrigin(parcel);
            case 74:
                return new FirstDataSegmentCacheCheckEndEvent(parcel);
            case 75:
                return new FirstDataSegmentCacheCheckStartEvent(parcel);
            case 76:
                return new PrefetchTaskDataFetchCompletedEvent(parcel);
            case 77:
                return new PrefetchTaskDataFetchIssuedEvent(parcel);
            case 78:
                return new SpatialAudioFocusParams(parcel);
            case 79:
                return new VideoProtocolProps(parcel);
            case 80:
                return new SphericalMetadata(parcel);
            case 81:
                return AppLinkDeviceConnectionStatus.values()[parcel.readInt()];
            case 82:
                return AppLinkDeviceHardwareState.values()[parcel.readInt()];
            case 83:
                return AppLinkDeviceMountState.values()[parcel.readInt()];
            case 84:
                return AppLinkDevicePeakPowerState.values()[parcel.readInt()];
            case 85:
                long readLong32 = parcel.readLong();
                return new C63282Sgh((Boolean) AbstractC58321PtD.A0n(parcel, Boolean.class), (Integer) AbstractC58321PtD.A0n(parcel, Integer.class), (Integer) AbstractC58321PtD.A0n(parcel, Integer.class), (Integer) AbstractC58321PtD.A0n(parcel, Integer.class), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), readLong32);
            case 86:
                C14360o3.A0B(parcel, 0);
                C2FP.A0J();
                Object A0012 = TreeParcelable.A00(parcel);
                C14360o3.A0C(A0012, "null cannot be cast to non-null type com.facebookpay.bloks.graphql.FBPayBloksComponent");
                return new APMConfigurationImpl((XGq) A0012);
            case 87:
                return new APMBloksNativeProps(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 88:
                return new CurrencyAmount(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 89:
                C14360o3.A0B(parcel, 0);
                double readDouble4 = parcel.readDouble();
                String readString47 = parcel.readString();
                if (readString47.equals("MILES")) {
                    num8 = C05F.A00;
                } else if (readString47.equals("KILOMETERS")) {
                    num8 = C05F.A01;
                } else {
                    throw AbstractC166987dD.A12(readString47);
                }
                return new Distance(num8, readDouble4);
            case 90:
                String A0d7 = AbstractC37304Gc5.A0d(parcel);
                String readString48 = parcel.readString();
                C69075VhQ c69075VhQ = (C69075VhQ) AbstractC58321PtD.A0n(parcel, ErrorDialogContent.class);
                C69075VhQ c69075VhQ2 = (C69075VhQ) AbstractC58321PtD.A0n(parcel, ErrorDialogContent.class);
                Integer num10 = null;
                if (parcel.readInt() == 0) {
                    A0U2 = null;
                } else {
                    A0U2 = AbstractC37304Gc5.A0U(parcel);
                }
                Integer A0Y = AbstractC37304Gc5.A0Y(parcel);
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = VEJ.valueOf(parcel.readString());
                }
                if (parcel.readInt() == 0) {
                    valueOf5 = null;
                } else {
                    valueOf5 = VEJ.valueOf(parcel.readString());
                }
                Integer A0Y2 = AbstractC37304Gc5.A0Y(parcel);
                if (parcel.readInt() != 0) {
                    String readString49 = parcel.readString();
                    if (readString49.equals("USER_CANCELLATION")) {
                        num10 = C05F.A00;
                    } else if (readString49.equals("SYSTEM_ERROR")) {
                        num10 = C05F.A01;
                    } else if (readString49.equals("CHECKOUT_ERROR_RISK")) {
                        num10 = C05F.A0C;
                    } else if (readString49.equals("PAYMENT_REQUEST_CANCELLED")) {
                        num10 = C05F.A0N;
                    } else if (readString49.equals("USER_OPTIONALITY_SELECTION")) {
                        num10 = C05F.A0Y;
                    } else if (readString49.equals("INTERNAL_ERROR")) {
                        num10 = C05F.A0j;
                    } else {
                        throw AbstractC166987dD.A12(readString49);
                    }
                }
                return new ErrorDialogContent(valueOf4, valueOf5, c69075VhQ, c69075VhQ2, A0U2, A0Y, A0Y2, num10, A0d7, readString48);
            case 91:
                return new APMButtonsItem((APMBloksNativeProps) AbstractC37304Gc5.A04(parcel, APMButtonsItem.class), VG3.valueOf(AbstractC37304Gc5.A0d(parcel)), (APMConfiguration) AbstractC37304Gc5.A04(parcel, APMButtonsItem.class), AbstractC37304Gc5.A0V(parcel));
            case 92:
                return new AnonCheckoutPuxLink((R0Z) AbstractC58321PtD.A0n(parcel, AnonCheckoutPuxLink.class), VG3.valueOf(AbstractC37304Gc5.A0d(parcel)), AbstractC37304Gc5.A1V(parcel));
            case 93:
                return new AnonCheckoutToggleItem((R0Z) AbstractC58321PtD.A0n(parcel, AnonCheckoutToggleItem.class), (R0Z) AbstractC58321PtD.A0n(parcel, AnonCheckoutToggleItem.class), VG3.valueOf(AbstractC37304Gc5.A0d(parcel)), AbstractC37304Gc5.A1V(parcel));
            case 94:
                return new AutoAdvanceButtonItem(VG3.valueOf(AbstractC37304Gc5.A0d(parcel)), parcel.readInt());
            case 95:
                return new CheckoutOptionalityItem(VG3.valueOf(AbstractC37304Gc5.A0d(parcel)), parcel.readString());
            case 96:
                return new ConfirmationPaymentSectionItem(VG3.valueOf(AbstractC37304Gc5.A0d(parcel)), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 97:
                return new ConfirmationProductUpsellItem(VG3.valueOf(AbstractC37304Gc5.A0d(parcel)), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 98:
                return new ConfirmationProductUpsellSectionHeaderItem(VG3.valueOf(AbstractC37304Gc5.A0d(parcel)), parcel.readString());
            default:
                return new EmailOptInItem((R0Z) AbstractC58321PtD.A0n(parcel, EmailOptInItem.class), VG3.valueOf(AbstractC37304Gc5.A0d(parcel)), parcel.readString(), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new CheckoutSetupPayload[i];
            case 1:
                return new DisclaimerBodyUrlRanges[i];
            case 2:
                return new DisclaimerText[i];
            case 3:
                return new IABAdsBwIntegrationExtension[i];
            case 4:
                return new IABAdsContext[i];
            case 5:
                return new IABAdsMetaCheckoutDataExtension[i];
            case 6:
                return new IABAdsMetaCheckoutPaymentsSDKDataExtension[i];
            case 7:
                return new IABBwPayPalExtension[i];
            case 8:
                return new IABDummyContext[i];
            case 9:
                return new IABOrganicContext[i];
            case 10:
                return new IABPostClickPersonalizationDataExtension[i];
            case 11:
                return new IABWatchAndBrowseWebToWAExtension[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new IabAdCreativeOptimizationConfigByType[i];
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new IgPromoAdsExtension[i];
            case 14:
                return new IgPromoAdsPromoCode[i];
            case Process.SIGTERM /* 15 */:
                return new MessagingExtensionType[i];
            case 16:
                return new MetaCheckoutExperienceType[i];
            case 17:
                return new PaymentConfig[i];
            case 18:
                return new ReceiverInfo[i];
            case Process.SIGSTOP /* 19 */:
                return new IABBwPContext[i];
            case 20:
                return new IABBwPExtension[i];
            case 21:
                return new IABEvent[i];
            case 22:
                return new InterstitialTrigger[i];
            case 23:
                return new InterstitialTriggerContext[i];
            case 24:
                return new MaxImpressionsPerInterval[i];
            case 25:
                return new ParcelableCoordinates[i];
            case 26:
                return new ParcelableFbLocationContinuousListenerParams[i];
            case 27:
                return new ParcelableFbLocationOperationParams[i];
            case 28:
                return new ParcelableGeofenceResult[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new ParcelableImmutableLocation[i];
            case 30:
                return new ParcelableVisitStateAlgorithmVersion[i];
            case 31:
                return new ParcelableActivityRecognitionResult[i];
            case 32:
                return new ParcelableDetectedActivity[i];
            case 33:
                return new ParcelableLocationSignalPackage[i];
            case 34:
                return new Address[i];
            case 35:
                return new LiveLocationSession[i];
            case 36:
                return new LiveLocationSharer[i];
            case 37:
                return new com.facebook.locationsharing.core.models.Location[i];
            case 38:
                return new LocationSharingPresenterState[i];
            case 39:
                return new Place[i];
            case 40:
                return new PointOfInterest[i];
            case Seq.NULL_REFNUM /* 41 */:
                return new PointOfInterestViewModel[i];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new LoginClient$Request[i];
            case 43:
                return new LoginClient$Result[i];
            case 44:
                return new MapOptions[i];
            case 45:
                return new SubscriptionParcelable[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new DirectInstallDownloadEvent[i];
            case 47:
                return new NotificationType[i];
            case 48:
                return new BottomSheetFeatures[i];
            case 49:
                return new TreeParcelable[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return new ZonedValue[i];
            case 51:
                return new ZonePolicy[i];
            case 52:
                return new PushProperty[i];
            case 53:
                return new RegisterPushTokenParams[i];
            case 54:
                return new BugReportFile[i];
            case 55:
                return new GqlsTopicExtraInfo[i];
            case 56:
                return new ParcelableSensorEventClone[i];
            case 57:
                return new DialogTexts[i];
            case 58:
                return new FixedSizes[i];
            case 59:
                return new Size[i];
            case 60:
                return new DefaultEvidenceRecorderProvider[i];
            case 61:
                return new SelfieEvidence[i];
            case 62:
                return new ChallengeProvider[i];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new IgVoltronAndNmlModulesDownloader[i];
            case 64:
                return new IdCaptureConfig[i];
            case 65:
                return new SelfieCaptureConfig[i];
            case 66:
                return new IgSmartCaptureLoggerProvider[i];
            case 67:
                return new ResolvedConsentTextsProvider[i];
            case 68:
                return new PanoBounds[i];
            case 69:
            case 70:
            default:
                return new Emoji[i];
            case 71:
                return new EmojiSet[i];
            case 72:
                return new EmojiSet.Metadata[i];
            case 73:
                return new PlayerOrigin[i];
            case 74:
                return new FirstDataSegmentCacheCheckEndEvent[i];
            case 75:
                return new FirstDataSegmentCacheCheckStartEvent[i];
            case 76:
                return new PrefetchTaskDataFetchCompletedEvent[i];
            case 77:
                return new PrefetchTaskDataFetchIssuedEvent[i];
            case 78:
                return new SpatialAudioFocusParams[i];
            case 79:
                return new VideoProtocolProps[i];
            case 80:
                return new SphericalMetadata[i];
            case 81:
                return new AppLinkDeviceConnectionStatus[i];
            case 82:
                return new AppLinkDeviceHardwareState[i];
            case 83:
                return new AppLinkDeviceMountState[i];
            case 84:
                return new AppLinkDevicePeakPowerState[i];
            case 85:
                return new ParcelableWifiScanResult[i];
            case 86:
                return new APMConfiguration[i];
            case 87:
                return new APMBloksNativeProps[i];
            case 88:
                return new CurrencyAmount[i];
            case 89:
                return new Distance[i];
            case 90:
                return new ErrorDialogContent[i];
            case 91:
                return new APMButtonsItem[i];
            case 92:
                return new AnonCheckoutPuxLink[i];
            case 93:
                return new AnonCheckoutToggleItem[i];
            case 94:
                return new AutoAdvanceButtonItem[i];
            case 95:
                return new CheckoutOptionalityItem[i];
            case 96:
                return new ConfirmationPaymentSectionItem[i];
            case 97:
                return new ConfirmationProductUpsellItem[i];
            case 98:
                return new ConfirmationProductUpsellSectionHeaderItem[i];
            case 99:
                return new EmailOptInItem[i];
        }
    }
}
