package X;

import android.graphics.PointF;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesCallResult;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.facebook.android.instantexperiences.payment.CanShowPaymentModuleJSBridgeCall;
import com.facebook.android.instantexperiences.payment.CanShowPaymentModuleJSBridgeCallResult;
import com.facebook.android.instantexperiences.payment.PaymentsCheckoutJSBridgeCall;
import com.facebook.android.instantexperiences.payment.PaymentsCheckoutJSBridgeCallResult;
import com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestErrorCall;
import com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestSuccessCall;
import com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestUnknownCall;
import com.facebook.android.maps.model.CameraPosition;
import com.facebook.android.maps.model.LatLng;
import com.facebook.android.maps.model.LatLngBounds;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.avatar.autogen.download.IgModelDownloader;
import com.facebook.avatar.autogen.flow.AESelfieCaptureConfig;
import com.facebook.blescan.parcelable.ParcelableBleScanResult;
import com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.browser.lite.extensions.autofill.model.AutofillSettings;
import com.facebook.browser.lite.extensions.commercecheckout.constant.MetaCheckoutRequest;
import com.facebook.browser.lite.extensions.commercecheckout.models.CommerceMetaCheckoutLogEventRequest;
import com.facebook.browser.lite.extensions.commercecheckout.models.DisclaimerText;
import com.facebook.browser.lite.extensions.igcallextension.IGCallExtensionModel;
import com.facebook.browser.lite.extensions.igleadformextension.IGLeadFormExtensionModel;
import com.facebook.browser.lite.extensions.whatsapp.CTWABrowserCTAExtensionModel;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.browser.lite.ipc.IABExtensionEventHandlerPayload;
import com.facebook.browser.lite.ipc.IABExtensionStatesHandlerPayload;
import com.facebook.browser.lite.ipc.PrefetchCacheEntry;
import com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig;
import com.facebook.businessextension.jscalls.InitJSBridgeCallData;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCallData;
import com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCallData;
import com.facebook.cameracore.ardelivery.model.AREffectAsyncAsset;
import com.facebook.cameracore.ardelivery.model.ARRequestEffect;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.detector.BlurDetectionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.detector.DefectDetectorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenGraphFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ExternalRenderFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapAlphaFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftOverlayFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BasicAdjustTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BlurTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BoxBlurTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BrightnessTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.ChromaticAberrationTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.FadeOutTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.FlareTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.GlitchTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.LinearGradientTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.PanFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.ScreenBlendWithColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.SpinTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.TintTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.TransformTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.WarpTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.ZoomTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.cellinfo.parcelable.ParcelableCdmaCellInfo;
import com.facebook.cellinfo.parcelable.ParcelableGeneralCellInfo;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.common.gcmcompat.OneoffTask;
import com.facebook.common.gcmcompat.PeriodicTask;
import com.facebook.common.gcmcompat.Task;
import com.facebook.common.math.matrix.Matrix3;
import com.facebook.common.math.matrix.Matrix4;
import com.facebook.common.parcels.ParcelableBoolean;
import com.facebook.common.payments.model.Address;
import com.facebook.common.payments.paymentmethods.model.AdditionalFields;
import com.facebook.common.payments.paymentmethods.model.CreditCard;
import com.facebook.common.payments.paymentmethods.model.NewCreditCard;
import com.facebook.common.payments.paymentmethods.model.NewPayPal;
import com.facebook.common.payments.paymentmethods.model.PayPalBillingAgreement;
import com.facebook.common.util.Either;
import com.facebook.common.util.ParcelablePair;
import com.facebook.common.util.Quartet;
import com.facebook.common.util.Triplet;
import com.facebook.dsp.core.ColorData;
import com.facebook.dsp.core.OpacityData;
import com.facebook.exoplayer.ipc.RendererContext;
import com.facebook.exoplayer.ipc.VideoCacheStatus;
import com.facebook.exoplayer.ipc.VideoPlayerServiceEvent;
import com.facebook.exoplayer.ipc.VpsCacheErrorEvent;
import com.facebook.exoplayer.ipc.VpsVideoCacheDatabaseFullEvent;
import com.facebook.facedetection.amlfacetracker.SelfieFaceTrackerProvider;
import com.facebook.fbpay.hub.p2pwidget.api.FbPayP2pFriend;
import com.facebook.fbpay.hub.p2pwidget.api.FbPayP2pWidgetSendRequest;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.forker.Process;
import com.facebook.graphql.error.GraphQLError;
import com.facebook.graphql.modelutil.parcel.ModelParcelHelper$LazyHolder;
import com.facebook.graphql.modelutil.parcel.TreeParcelable;
import com.facebook.http.interfaces.RequestPriority;
import com.facebook.http.protocol.ApiErrorResult;
import com.facebook.iabadscontext.Availability;
import com.facebook.iabadscontext.IABAdsContext;
import com.facebook.iabadscontext.MetaCheckoutExperienceType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import go.Seq;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: X.SlG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63475SlG implements Parcelable.Creator {
    public final int A00;

    public static float A00(Parcel parcel) {
        C14360o3.A0B(parcel, 0);
        return parcel.readFloat();
    }

    public C63475SlG(int i) {
        this.A00 = i;
    }

    public static C63475SlG A02(int i) {
        return new C63475SlG(i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r8v105, types: [com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v24, types: [com.facebook.browser.lite.ipc.IABExtensionEventHandlerPayload, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v26, types: [com.facebook.browser.lite.ipc.IABExtensionStatesHandlerPayload, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v27, types: [java.lang.Object, com.facebook.browser.lite.ipc.PrefetchCacheEntry] */
    /* JADX WARN: Type inference failed for: r8v46, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FitTransformParams, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v47, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestCall, com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestCall, com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestCall, com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v73, types: [com.facebook.common.gcmcompat.Task, com.facebook.common.gcmcompat.OneoffTask, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v74, types: [com.facebook.common.gcmcompat.Task, java.lang.Object, com.facebook.common.gcmcompat.PeriodicTask] */
    /* JADX WARN: Type inference failed for: r8v89, types: [com.facebook.exoplayer.ipc.VideoCacheStatus, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v90, types: [java.lang.Object, com.facebook.exoplayer.ipc.VpsPrefetchCacheEvictEvent] */
    /* JADX WARN: Type inference failed for: r8v92, types: [com.facebook.exoplayer.ipc.VpsPrefetchStartEvent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v94, types: [com.facebook.exoplayer.ipc.VpsManifestParseErrorEvent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v99, types: [com.facebook.fbservice.service.OperationResult, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer num;
        Integer num2;
        int dataPosition;
        int readInt;
        int i;
        BadParcelableException badParcelableException;
        Object obj;
        int i2;
        BadParcelableException badParcelableException2;
        HashMap hashMap;
        HashMap hashMap2;
        Integer num3;
        switch (this.A00) {
            case 0:
                return new InstantExperiencesJSBridgeCall(parcel);
            case 1:
                return new InstantExperiencesCallResult(parcel);
            case 2:
                return new InstantExperiencesJSBridgeCall(parcel);
            case 3:
                return new InstantExperiencesCallResult(parcel);
            case 4:
                ?? instantExperiencesJSBridgeCall = new InstantExperiencesJSBridgeCall(parcel);
                instantExperiencesJSBridgeCall.A00 = parcel.readString();
                return instantExperiencesJSBridgeCall;
            case 5:
                ?? instantExperiencesJSBridgeCall2 = new InstantExperiencesJSBridgeCall(parcel);
                instantExperiencesJSBridgeCall2.A00 = parcel.readString();
                return instantExperiencesJSBridgeCall2;
            case 6:
                ?? instantExperiencesJSBridgeCall3 = new InstantExperiencesJSBridgeCall(parcel);
                instantExperiencesJSBridgeCall3.A00 = parcel.readString();
                return instantExperiencesJSBridgeCall3;
            case 7:
                return new CameraPosition(parcel);
            case 8:
                return new LatLng(parcel);
            case 9:
                return new LatLngBounds(parcel);
            case 10:
                return new ViewerContext(parcel);
            case 11:
                C14360o3.A0B(parcel, 0);
                return new IgModelDownloader((UserSession) AbstractC58321PtD.A0n(parcel, IgModelDownloader.class));
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new AESelfieCaptureConfig(parcel);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                long readLong = parcel.readLong();
                long readLong2 = parcel.readLong();
                return new SI9(parcel.readString(), parcel.readString(), parcel.readInt(), readLong, readLong2);
            case 14:
                C14360o3.A0B(parcel, 0);
                ?? obj2 = new Object();
                String readString = parcel.readString();
                if (readString == null) {
                    return obj2;
                }
                obj2.A01 = readString;
                obj2.A00 = parcel.readBundle();
                return obj2;
            case Process.SIGTERM /* 15 */:
                return new AutofillData(parcel);
            case 16:
                int A00 = AbstractC37304Gc5.A00(parcel);
                boolean A1V = AbstractC37304Gc5.A1V(parcel);
                return new AutofillSettings(parcel.readString(), parcel.readString(), A00, parcel.readInt(), parcel.readInt(), A1V, AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case 17:
                String A0d = AbstractC37304Gc5.A0d(parcel);
                if (A0d.equals("LOAD_URL")) {
                    num = C05F.A00;
                } else if (A0d.equals("IGNORE_META_CHECKOUT")) {
                    num = C05F.A01;
                } else {
                    throw AbstractC166987dD.A12(A0d);
                }
                return new MetaCheckoutRequest(num, parcel.readString());
            case 18:
                String A0d2 = AbstractC37304Gc5.A0d(parcel);
                if (A0d2.equals("CHECKOUT_LOADING_SCREEN_IMPRESSION")) {
                    num2 = C05F.A00;
                } else if (A0d2.equals("ELIGIBILITY_SUCCESS")) {
                    num2 = C05F.A01;
                } else if (A0d2.equals("DISCLAIMER_IMPRESSION")) {
                    num2 = C05F.A0C;
                } else if (A0d2.equals("OPT_OUT")) {
                    num2 = C05F.A0N;
                } else if (A0d2.equals("URL_INTERCEPT_INIT")) {
                    num2 = C05F.A0Y;
                } else if (A0d2.equals("URL_INTERCEPT_SUCCESS")) {
                    num2 = C05F.A0j;
                } else if (A0d2.equals("URL_INTERCEPT_FAIL")) {
                    num2 = C05F.A0u;
                } else if (A0d2.equals("UNKNOWN")) {
                    num2 = C05F.A15;
                } else {
                    throw AbstractC166987dD.A12(A0d2);
                }
                return new CommerceMetaCheckoutLogEventRequest((IABAdsContext) AbstractC37304Gc5.A04(parcel, CommerceMetaCheckoutLogEventRequest.class), (MetaCheckoutExperienceType) AbstractC37304Gc5.A04(parcel, CommerceMetaCheckoutLogEventRequest.class), num2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case Process.SIGSTOP /* 19 */:
                return new DisclaimerText(AbstractC37304Gc5.A0d(parcel), parcel.readInt(), parcel.readInt());
            case 20:
                C14360o3.A0B(parcel, 0);
                return new IGCallExtensionModel(parcel);
            case 21:
                C14360o3.A0B(parcel, 0);
                return new IGLeadFormExtensionModel(parcel);
            case 22:
                C14360o3.A0B(parcel, 0);
                return new CTWABrowserCTAExtensionModel(parcel);
            case 23:
                return new BrowserLiteJSBridgeCall(parcel);
            case 24:
                ?? obj3 = new Object();
                dataPosition = parcel.dataPosition();
                readInt = parcel.readInt();
                try {
                    if (readInt >= 4) {
                        if (parcel.dataPosition() - dataPosition >= readInt) {
                            obj = obj3;
                            if (dataPosition > Integer.MAX_VALUE - readInt) {
                                throw new BadParcelableException("Overflow in the size of parcelable");
                            }
                        } else {
                            obj3.A00 = parcel.readString();
                            if (parcel.dataPosition() - dataPosition >= readInt) {
                                obj = obj3;
                                if (dataPosition > Integer.MAX_VALUE - readInt) {
                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                }
                            } else {
                                obj3.A01 = parcel.readString();
                                if (parcel.dataPosition() - dataPosition >= readInt) {
                                    obj = obj3;
                                    if (dataPosition > Integer.MAX_VALUE - readInt) {
                                        throw new BadParcelableException("Overflow in the size of parcelable");
                                    }
                                } else {
                                    obj3.A02 = parcel.createStringArrayList();
                                    obj = obj3;
                                    if (dataPosition > Integer.MAX_VALUE - readInt) {
                                        throw new BadParcelableException("Overflow in the size of parcelable");
                                    }
                                }
                            }
                        }
                        parcel.setDataPosition(dataPosition + readInt);
                        return obj;
                    }
                    throw new BadParcelableException("Parcelable too small");
                } finally {
                    th = th;
                    if (dataPosition > i) {
                    }
                    parcel.setDataPosition(dataPosition + readInt);
                    throw th;
                }
            case 25:
                ?? obj4 = new Object();
                dataPosition = parcel.dataPosition();
                readInt = parcel.readInt();
                try {
                    if (readInt >= 4) {
                        if (parcel.dataPosition() - dataPosition >= readInt) {
                            obj = obj4;
                            if (dataPosition > Integer.MAX_VALUE - readInt) {
                                throw new BadParcelableException("Overflow in the size of parcelable");
                            }
                        } else {
                            obj4.A01 = parcel.readString();
                            if (parcel.dataPosition() - dataPosition >= readInt) {
                                obj = obj4;
                                if (dataPosition > Integer.MAX_VALUE - readInt) {
                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                }
                            } else {
                                obj4.A02 = parcel.readString();
                                if (parcel.dataPosition() - dataPosition >= readInt) {
                                    obj = obj4;
                                    if (dataPosition > Integer.MAX_VALUE - readInt) {
                                        throw new BadParcelableException("Overflow in the size of parcelable");
                                    }
                                } else {
                                    obj4.A00 = parcel.readString();
                                    if (parcel.dataPosition() - dataPosition >= readInt) {
                                        obj = obj4;
                                        if (dataPosition > Integer.MAX_VALUE - readInt) {
                                            throw new BadParcelableException("Overflow in the size of parcelable");
                                        }
                                    } else {
                                        obj4.A03 = parcel.createStringArrayList();
                                        obj = obj4;
                                        if (dataPosition > Integer.MAX_VALUE - readInt) {
                                            throw new BadParcelableException("Overflow in the size of parcelable");
                                        }
                                    }
                                }
                            }
                        }
                        parcel.setDataPosition(dataPosition + readInt);
                        return obj;
                    }
                    throw new BadParcelableException("Parcelable too small");
                } finally {
                    th = th;
                    if (dataPosition > i2) {
                    }
                    parcel.setDataPosition(dataPosition + readInt);
                    throw th;
                }
            case 26:
                ?? obj5 = new Object();
                obj5.A03 = parcel.readString();
                obj5.A01 = parcel.readString();
                obj5.A02 = parcel.readString();
                obj5.A00 = parcel.readString();
                return obj5;
            case 27:
                JQ0.A0y(parcel);
                return IABViewModeLaunchConfig.FullScreen.A00;
            case 28:
                JQ0.A0y(parcel);
                return IABViewModeLaunchConfig.FullSheet.A00;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                JQ0.A0y(parcel);
                return IABViewModeLaunchConfig.HalfSheet.A00;
            case 30:
                JQ0.A0y(parcel);
                return IABViewModeLaunchConfig.Peek.A00;
            case 31:
                return new InitJSBridgeCallData(parcel);
            case 32:
                return new RequestAutofillJSBridgeCallData(parcel);
            case 33:
                return new SaveAutofillDataJSBridgeCallData(parcel);
            case 34:
                return new AREffectAsyncAsset(parcel);
            case 35:
                return new ARRequestEffect(parcel);
            case 36:
                C14360o3.A0B(parcel, 0);
                Parcelable.Creator creator = BlurDetectionFilter.CREATOR;
                return new BlurDetectionFilter(parcel.readString());
            case 37:
                C14360o3.A0B(parcel, 0);
                Parcelable.Creator creator2 = DefectDetectorFilter.CREATOR;
                return new DefectDetectorFilter(parcel.readString());
            case 38:
                int A002 = AbstractC37304Gc5.A00(parcel);
                LinkedHashMap A18 = AbstractC25225BEi.A18(A002);
                for (int i3 = 0; i3 != A002; i3++) {
                    A18.put(parcel.readString(), Float.valueOf(parcel.readFloat()));
                }
                int readInt2 = parcel.readInt();
                LinkedHashMap A182 = AbstractC25225BEi.A18(readInt2);
                for (int i4 = 0; i4 != readInt2; i4++) {
                    A182.put(parcel.readString(), parcel.createFloatArray());
                }
                int readInt3 = parcel.readInt();
                LinkedHashMap A183 = AbstractC25225BEi.A18(readInt3);
                for (int i5 = 0; i5 != readInt3; i5++) {
                    AbstractC166997dE.A1U(parcel.readString(), A183, parcel.readInt());
                }
                int readInt4 = parcel.readInt();
                LinkedHashMap A184 = AbstractC25225BEi.A18(readInt4);
                for (int i6 = 0; i6 != readInt4; i6++) {
                    AbstractC31173DnH.A1Y(parcel.readString(), A184, AbstractC37304Gc5.A1V(parcel));
                }
                int readInt5 = parcel.readInt();
                LinkedHashMap A185 = AbstractC25225BEi.A18(readInt5);
                for (int i7 = 0; i7 != readInt5; i7++) {
                    AbstractC58321PtD.A1A(parcel, parcel.readString(), A185);
                }
                int readInt6 = parcel.readInt();
                LinkedHashMap A186 = AbstractC25225BEi.A18(readInt6);
                for (int i8 = 0; i8 != readInt6; i8++) {
                    AbstractC58321PtD.A1A(parcel, parcel.readString(), A186);
                }
                int readInt7 = parcel.readInt();
                LinkedHashMap A187 = AbstractC25225BEi.A18(readInt7);
                for (int i9 = 0; i9 != readInt7; i9++) {
                    AbstractC58321PtD.A1A(parcel, parcel.readString(), A187);
                }
                return new TypedParameterMap(A18, A182, A183, A184, A185, A186, A187);
            case 39:
                String A0d3 = AbstractC37304Gc5.A0d(parcel);
                float[] createFloatArray = parcel.createFloatArray();
                float[] createFloatArray2 = parcel.createFloatArray();
                boolean A1V2 = AbstractC37304Gc5.A1V(parcel);
                return new ValueMapFilterModel((TypedParameterMap) TypedParameterMap.CREATOR.createFromParcel(parcel), A01(parcel, ValueMapFilterModel.class), A0d3, createFloatArray, createFloatArray2, A1V2);
            case 40:
                String A0d4 = AbstractC37304Gc5.A0d(parcel);
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    hashMap = null;
                } else {
                    int readInt8 = parcel.readInt();
                    hashMap = new HashMap(readInt8);
                    for (int i10 = 0; i10 != readInt8; i10++) {
                        hashMap.put(parcel.readString(), AbstractC58321PtD.A0n(parcel, DataDrivenFilter.class));
                    }
                }
                return new DataDrivenFilter(A01(parcel, DataDrivenFilter.class), A0d4, readString2, hashMap, parcel.createFloatArray(), parcel.createFloatArray(), AbstractC37304Gc5.A1V(parcel));
            case Seq.NULL_REFNUM /* 41 */:
                String A0d5 = AbstractC37304Gc5.A0d(parcel);
                String readString3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    hashMap2 = null;
                } else {
                    int readInt9 = parcel.readInt();
                    hashMap2 = new HashMap(readInt9);
                    for (int i11 = 0; i11 != readInt9; i11++) {
                        String readString4 = parcel.readString();
                        int readInt10 = parcel.readInt();
                        HashMap hashMap3 = new HashMap(readInt10);
                        for (int i12 = 0; i12 != readInt10; i12++) {
                            hashMap3.put(parcel.readString(), AbstractC58321PtD.A0n(parcel, DataDrivenGraphFilter.class));
                        }
                        hashMap2.put(readString4, hashMap3);
                    }
                }
                return new DataDrivenGraphFilter(A01(parcel, DataDrivenGraphFilter.class), A0d5, readString3, hashMap2, parcel.createFloatArray(), parcel.createFloatArray(), AbstractC37304Gc5.A1V(parcel));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new ExternalRenderFilterModel(A01(parcel, ExternalRenderFilterModel.class), AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.createFloatArray(), parcel.createFloatArray(), AbstractC37304Gc5.A1V(parcel));
            case 43:
                C14360o3.A0B(parcel, 0);
                Parcelable.Creator creator3 = SurfaceCropFilterModel.FullTransform.CREATOR;
                SurfaceCropFilterModel.FullTransform fullTransform = (SurfaceCropFilterModel.FullTransform) creator3.createFromParcel(parcel);
                boolean A1V3 = AbstractC37304Gc5.A1V(parcel);
                SurfaceCropFilterModel.FullTransform fullTransform2 = (SurfaceCropFilterModel.FullTransform) creator3.createFromParcel(parcel);
                boolean A1V4 = AbstractC37304Gc5.A1V(parcel);
                boolean A1V5 = AbstractC37304Gc5.A1V(parcel);
                boolean A1V6 = AbstractC37304Gc5.A1V(parcel);
                int readInt11 = parcel.readInt();
                Matrix4 matrix4 = (Matrix4) AbstractC37304Gc5.A04(parcel, SurfaceCropFilterModel.class);
                Matrix4 matrix42 = (Matrix4) AbstractC37304Gc5.A04(parcel, SurfaceCropFilterModel.class);
                Matrix4 matrix43 = (Matrix4) AbstractC37304Gc5.A04(parcel, SurfaceCropFilterModel.class);
                SurfaceCropFilterModel.TransformSteps transformSteps = (SurfaceCropFilterModel.TransformSteps) SurfaceCropFilterModel.TransformSteps.CREATOR.createFromParcel(parcel);
                float readFloat = parcel.readFloat();
                float readFloat2 = parcel.readFloat();
                float readFloat3 = parcel.readFloat();
                int readInt12 = parcel.readInt();
                int readInt13 = parcel.readInt();
                PointF pointF = (PointF) AbstractC37304Gc5.A04(parcel, SurfaceCropFilterModel.class);
                SurfaceCropFilterModel.FitTransformParams fitTransformParams = (SurfaceCropFilterModel.FitTransformParams) SurfaceCropFilterModel.FitTransformParams.CREATOR.createFromParcel(parcel);
                boolean A1V7 = AbstractC37304Gc5.A1V(parcel);
                boolean A1V8 = AbstractC37304Gc5.A1V(parcel);
                boolean A1V9 = AbstractC37304Gc5.A1V(parcel);
                return new SurfaceCropFilterModel(pointF, fitTransformParams, fullTransform, fullTransform2, transformSteps, A01(parcel, SurfaceCropFilterModel.class), matrix4, matrix42, matrix43, parcel.readString(), parcel.createFloatArray(), parcel.createFloatArray(), readFloat, readFloat2, readFloat3, readInt11, readInt12, readInt13, A1V3, A1V4, A1V5, A1V6, A1V7, A1V8, A1V9, AbstractC37304Gc5.A1V(parcel));
            case 44:
                float A003 = A00(parcel);
                float readFloat4 = parcel.readFloat();
                float readFloat5 = parcel.readFloat();
                ?? obj6 = new Object();
                obj6.A02 = A003;
                obj6.A00 = readFloat4;
                obj6.A01 = readFloat5;
                return obj6;
            case 45:
                float A004 = A00(parcel);
                float readFloat6 = parcel.readFloat();
                float readFloat7 = parcel.readFloat();
                float readFloat8 = parcel.readFloat();
                float readFloat9 = parcel.readFloat();
                float readFloat10 = parcel.readFloat();
                float readFloat11 = parcel.readFloat();
                int readInt14 = parcel.readInt();
                ?? obj7 = new Object();
                obj7.A06 = A004;
                obj7.A00 = readFloat6;
                obj7.A01 = readFloat7;
                obj7.A02 = readFloat8;
                obj7.A03 = readFloat9;
                obj7.A04 = readFloat10;
                obj7.A05 = readFloat11;
                obj7.A07 = readInt14;
                return obj7;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C14360o3.A0B(parcel, 0);
                return new SurfaceCropFilterModel.TransformSteps(AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case 47:
                return new GainmapAlphaFilter(A01(parcel, GainmapAlphaFilter.class), AbstractC37304Gc5.A0d(parcel), parcel.createFloatArray(), parcel.createFloatArray(), AbstractC37304Gc5.A1V(parcel));
            case 48:
                Integer A02 = AbstractC55027OXe.A02(AbstractC37304Gc5.A0d(parcel));
                PointF pointF2 = (PointF) AbstractC37304Gc5.A04(parcel, TiltShiftFilter.class);
                PointF pointF3 = (PointF) AbstractC37304Gc5.A04(parcel, TiltShiftFilter.class);
                float readFloat12 = parcel.readFloat();
                float readFloat13 = parcel.readFloat();
                float readFloat14 = parcel.readFloat();
                boolean A1V10 = AbstractC37304Gc5.A1V(parcel);
                return new TiltShiftFilter(pointF2, pointF3, A01(parcel, TiltShiftFilter.class), A02, parcel.readString(), parcel.createFloatArray(), parcel.createFloatArray(), readFloat12, readFloat13, readFloat14, A1V10);
            case 49:
                Integer A022 = AbstractC55027OXe.A02(AbstractC37304Gc5.A0d(parcel));
                PointF pointF4 = (PointF) AbstractC37304Gc5.A04(parcel, TiltShiftOverlayFilter.class);
                PointF pointF5 = (PointF) AbstractC37304Gc5.A04(parcel, TiltShiftOverlayFilter.class);
                float readFloat15 = parcel.readFloat();
                float readFloat16 = parcel.readFloat();
                float readFloat17 = parcel.readFloat();
                float readFloat18 = parcel.readFloat();
                boolean A1V11 = AbstractC37304Gc5.A1V(parcel);
                return new TiltShiftOverlayFilter(pointF4, pointF5, A01(parcel, TiltShiftOverlayFilter.class), A022, parcel.readString(), parcel.createFloatArray(), parcel.createFloatArray(), readFloat15, readFloat16, readFloat17, readFloat18, A1V11);
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                float A005 = A00(parcel);
                return new BasicAdjustTransitionFilter(A01(parcel, BasicAdjustTransitionFilter.class), parcel.createFloatArray(), parcel.createFloatArray(), A005, AbstractC37304Gc5.A1V(parcel));
            case 51:
                float A006 = A00(parcel);
                float readFloat19 = parcel.readFloat();
                float readFloat20 = parcel.readFloat();
                return new BlurTransitionFilter(A01(parcel, BlurTransitionFilter.class), parcel.createFloatArray(), parcel.createFloatArray(), A006, readFloat19, readFloat20, AbstractC37304Gc5.A1V(parcel));
            case 52:
                float A007 = A00(parcel);
                return new BoxBlurTransitionFilter(A01(parcel, BoxBlurTransitionFilter.class), parcel.createFloatArray(), parcel.createFloatArray(), A007, AbstractC37304Gc5.A1V(parcel));
            case 53:
                float A008 = A00(parcel);
                return new BrightnessTransitionFilter(A01(parcel, BrightnessTransitionFilter.class), parcel.createFloatArray(), parcel.createFloatArray(), A008, AbstractC37304Gc5.A1V(parcel));
            case 54:
                float A009 = A00(parcel);
                return new ChromaticAberrationTransitionFilter(A01(parcel, ChromaticAberrationTransitionFilter.class), parcel.createFloatArray(), parcel.createFloatArray(), A009, AbstractC37304Gc5.A1V(parcel));
            case 55:
                float A0010 = A00(parcel);
                return new FadeOutTransitionFilter(A01(parcel, FadeOutTransitionFilter.class), parcel.createFloatArray(), parcel.createFloatArray(), A0010, AbstractC37304Gc5.A1V(parcel));
            case 56:
                float A0011 = A00(parcel);
                return new FlareTransitionFilter(A01(parcel, FlareTransitionFilter.class), parcel.createFloatArray(), parcel.createFloatArray(), A0011, AbstractC37304Gc5.A1V(parcel));
            case 57:
                float A0012 = A00(parcel);
                return new GlitchTransitionFilter(A01(parcel, GlitchTransitionFilter.class), parcel.createFloatArray(), parcel.createFloatArray(), A0012, AbstractC37304Gc5.A1V(parcel));
            case 58:
                float A0013 = A00(parcel);
                return new LinearGradientTransitionFilter(A01(parcel, LinearGradientTransitionFilter.class), parcel.createFloatArray(), parcel.createFloatArray(), A0013, AbstractC37304Gc5.A1V(parcel));
            case 59:
                return new PanFilter(A01(parcel, PanFilter.class), AbstractC37304Gc5.A0d(parcel), parcel.createFloatArray(), parcel.createFloatArray(), parcel.readFloat(), parcel.readInt(), AbstractC37304Gc5.A1V(parcel));
            case 60:
                float A0014 = A00(parcel);
                return new ScreenBlendWithColorFilter(A01(parcel, ScreenBlendWithColorFilter.class), parcel.createFloatArray(), parcel.createFloatArray(), A0014, AbstractC37304Gc5.A1V(parcel));
            case 61:
                float A0015 = A00(parcel);
                return new SpinTransitionFilter(A01(parcel, SpinTransitionFilter.class), parcel.createFloatArray(), parcel.createFloatArray(), A0015, AbstractC37304Gc5.A1V(parcel));
            case 62:
                float A0016 = A00(parcel);
                return new TintTransitionFilter(A01(parcel, TintTransitionFilter.class), parcel.createFloatArray(), parcel.createFloatArray(), A0016, AbstractC37304Gc5.A1V(parcel));
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                float A0017 = A00(parcel);
                return new TransformTransitionFilter(A01(parcel, TransformTransitionFilter.class), parcel.createFloatArray(), parcel.createFloatArray(), A0017, AbstractC37304Gc5.A1V(parcel));
            case 64:
                float A0018 = A00(parcel);
                return new WarpTransitionFilter(A01(parcel, WarpTransitionFilter.class), parcel.createFloatArray(), parcel.createFloatArray(), A0018, AbstractC37304Gc5.A1V(parcel));
            case 65:
                float A0019 = A00(parcel);
                float readFloat21 = parcel.readFloat();
                float readFloat22 = parcel.readFloat();
                return new ZoomTransitionFilter(A01(parcel, ZoomTransitionFilter.class), parcel.createFloatArray(), parcel.createFloatArray(), A0019, readFloat21, readFloat22, AbstractC37304Gc5.A1V(parcel));
            case 66:
                return new EffectAttribution(parcel);
            case 67:
                return new EffectAttribution.AttributedAsset(parcel);
            case 68:
                return new EffectAttribution.License(parcel);
            case 69:
                return new C202088wo((Double) AbstractC58321PtD.A0n(parcel, Double.class), (Double) AbstractC58321PtD.A0n(parcel, Double.class), parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 70:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean A1X = AbstractC37304Gc5.A1X(parcel);
                return new C202078wn((C202088wo) AbstractC37304Gc5.A04(parcel, ParcelableCdmaCellInfo.class), readString5, readString6, readString7, readString8, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), A1X, AbstractC37304Gc5.A1X(parcel));
            case 71:
                ?? task = new Task(parcel);
                task.A01 = parcel.readLong();
                task.A00 = parcel.readLong();
                return task;
            case 72:
                ?? task2 = new Task(parcel);
                task2.A01 = parcel.readLong();
                task2.A00 = Math.min(parcel.readLong(), task2.A01);
                return task2;
            case 73:
                C14360o3.A0B(parcel, 0);
                return new Matrix3(parcel);
            case 74:
                return new ParcelableBoolean(AbstractC58320PtC.A1T(parcel));
            case 75:
                return new Address(parcel);
            case 76:
                return new AdditionalFields(parcel);
            case 77:
                return new CreditCard(parcel);
            case 78:
                return new NewCreditCard(parcel);
            case 79:
                return new NewPayPal(parcel);
            case 80:
                return new PayPalBillingAgreement(parcel);
            case 81:
                return new Either(AbstractC58321PtD.A0n(parcel, WDp.class), AbstractC58321PtD.A0n(parcel, WDp.class), AbstractC58320PtC.A1T(parcel));
            case 82:
                return new Pair(AbstractC58321PtD.A0n(parcel, C61763RtI.class), AbstractC58321PtD.A0n(parcel, C61763RtI.class));
            case 83:
                return new Quartet(parcel);
            case 84:
                return new Triplet(AbstractC58321PtD.A0n(parcel, C61763RtI.class), AbstractC58321PtD.A0n(parcel, C61763RtI.class), AbstractC58321PtD.A0n(parcel, C61763RtI.class));
            case 85:
                return new ColorData(AbstractC37304Gc5.A00(parcel), parcel.readInt());
            case 86:
                return new OpacityData(A00(parcel), parcel.readFloat());
            case 87:
                return new RendererContext(parcel);
            case 88:
                ?? obj8 = new Object();
                obj8.A00 = parcel.readString();
                obj8.A01 = AbstractC58320PtC.A1T(parcel);
                return obj8;
            case 89:
                int readInt15 = parcel.readInt();
                SparseArray sparseArray = EnumC61171RgX.A01;
                if (sparseArray.get(readInt15) != null) {
                    switch (((EnumC61171RgX) sparseArray.get(readInt15)).ordinal()) {
                        case 1:
                            ?? obj9 = new Object();
                            obj9.A00 = parcel.readString();
                            return obj9;
                        case 2:
                        case 3:
                        case 4:
                        default:
                            throw AbstractC166987dD.A12("Unknown event type");
                        case 5:
                            return new VpsCacheErrorEvent(parcel);
                        case 6:
                            ?? obj10 = new Object();
                            obj10.A00 = parcel.readString();
                            return obj10;
                        case 7:
                            return new VpsVideoCacheDatabaseFullEvent(parcel);
                        case 8:
                            ?? obj11 = new Object();
                            obj11.A01 = parcel.readString();
                            obj11.A00 = (Exception) parcel.readSerializable();
                            return obj11;
                        case 9:
                            return null;
                    }
                }
                throw AbstractC166987dD.A12("Invalid EventType value");
            case 90:
                return new Object();
            case 91:
                return new FbPayP2pFriend(parcel);
            case 92:
                return new FbPayP2pWidgetSendRequest(parcel);
            case 93:
                ?? obj12 = new Object();
                obj12.A05 = AbstractC37304Gc5.A1V(parcel);
                obj12.A03 = parcel.readString();
                obj12.A00 = parcel.readBundle(AbstractC58319PtB.A0g(obj12));
                String readString9 = parcel.readString();
                if (readString9.equals("NO_ERROR")) {
                    num3 = C05F.A00;
                } else if (readString9.equals("API_ERROR")) {
                    num3 = C05F.A01;
                } else if (readString9.equals("HTTP_400_AUTHENTICATION")) {
                    num3 = C05F.A0C;
                } else if (readString9.equals("HTTP_400_OTHER")) {
                    num3 = C05F.A0N;
                } else if (readString9.equals("HTTP_500_CLASS")) {
                    num3 = C05F.A0Y;
                } else if (readString9.equals("CONNECTION_FAILURE")) {
                    num3 = C05F.A0j;
                } else if (readString9.equals("ORCA_SERVICE_UNKNOWN_OPERATION")) {
                    num3 = C05F.A0u;
                } else if (readString9.equals("ORCA_SERVICE_IPC_FAILURE")) {
                    num3 = C05F.A15;
                } else if (readString9.equals("OUT_OF_MEMORY")) {
                    num3 = C05F.A1F;
                } else if (readString9.equals("OTHER")) {
                    num3 = C05F.A1I;
                } else if (readString9.equals("CANCELLED")) {
                    num3 = C05F.A02;
                } else if (readString9.equals("CACHE_DISK_ERROR")) {
                    num3 = C05F.A03;
                } else if (readString9.equals("MQTT_SEND_FAILURE")) {
                    num3 = C05F.A04;
                } else if (readString9.equals("WORK_AUTH_FAILED")) {
                    num3 = C05F.A05;
                } else if (readString9.equals("WORK_AUTH_COMMUNITY_ID_REQUIRED")) {
                    num3 = C05F.A06;
                } else if (readString9.equals("DATE_ERROR")) {
                    num3 = C05F.A07;
                } else if (readString9.equals("SEGMENTED_TRANSCODE_ERROR")) {
                    num3 = C05F.A08;
                } else if (readString9.equals("STREAMING_UPLOAD_ERROR")) {
                    num3 = C05F.A09;
                } else if (readString9.equals("PHASE_ONE_TRANSCODING_ERROR")) {
                    num3 = C05F.A0A;
                } else if (readString9.equals("UNREACHABLE_STATEMENT_ERROR")) {
                    num3 = C05F.A0B;
                } else if (readString9.equals("TAGGING_ERROR")) {
                    num3 = C05F.A0D;
                } else if (readString9.equals("ORCA_STALE_WEB_DATA")) {
                    num3 = C05F.A0E;
                } else if (readString9.equals("LASSO_LOGIN_UNAVAILABLE_IN_COUNTRY")) {
                    num3 = C05F.A0F;
                } else if (readString9.equals("LASSO_SHARE_SHEET__MESSAGE_LIMIT_EXCEEDED")) {
                    num3 = C05F.A0G;
                } else if (readString9.equals("API_EC_USER_CHECKPOINT")) {
                    num3 = C05F.A0H;
                } else {
                    throw AbstractC166987dD.A12(readString9);
                }
                obj12.A01 = num3;
                obj12.A02 = parcel.readString();
                obj12.A04 = (Throwable) parcel.readSerializable();
                return obj12;
            case 94:
                return new GraphQLError(parcel);
            case 95:
                return new ModelParcelHelper$LazyHolder(parcel);
            case 96:
                if (parcel == null) {
                    return null;
                }
                try {
                    String readString10 = parcel.readString();
                    if (GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT.equals(readString10)) {
                        readString10 = parcel.readString();
                    }
                    if (readString10 == null) {
                        return null;
                    }
                    int readInt16 = parcel.readInt();
                    byte[] bArr = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr);
                    return new TreeParcelable(bArr, readInt16, readString10);
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            case 97:
                String readString11 = parcel.readString();
                try {
                    return RequestPriority.valueOf(readString11);
                } catch (IllegalArgumentException unused) {
                    RequestPriority requestPriority = RequestPriority.A00;
                    C0K8.A09(RequestPriority.class, "Do not recognize priority %s. Defaulting to %s.", readString11, "NON_INTERACTIVE");
                    return requestPriority;
                }
            case 98:
                return new ApiErrorResult(parcel);
            default:
                C14360o3.A0B(parcel, 0);
                return new Availability(parcel.createStringArrayList(), AbstractC37304Gc5.A1V(parcel));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new CanShowPaymentModuleJSBridgeCall[i];
            case 1:
                return new CanShowPaymentModuleJSBridgeCallResult[i];
            case 2:
                return new PaymentsCheckoutJSBridgeCall[i];
            case 3:
                return new PaymentsCheckoutJSBridgeCallResult[i];
            case 4:
                return new PaymentsChargeRequestErrorCall[i];
            case 5:
                return new PaymentsChargeRequestSuccessCall[i];
            case 6:
                return new PaymentsChargeRequestUnknownCall[i];
            case 7:
                return new CameraPosition[i];
            case 8:
                return new LatLng[i];
            case 9:
                return new LatLngBounds[i];
            case 10:
                return new ViewerContext[i];
            case 11:
                return new IgModelDownloader[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new AESelfieCaptureConfig[i];
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new ParcelableBleScanResult[i];
            case 14:
                return new BrowserLiteJSBridgeProxy[i];
            case Process.SIGTERM /* 15 */:
                return new AutofillData[i];
            case 16:
                return new AutofillSettings[i];
            case 17:
                return new MetaCheckoutRequest[i];
            case 18:
                return new CommerceMetaCheckoutLogEventRequest[i];
            case Process.SIGSTOP /* 19 */:
                return new DisclaimerText[i];
            case 20:
                return new IGCallExtensionModel[i];
            case 21:
                return new IGLeadFormExtensionModel[i];
            case 22:
                return new CTWABrowserCTAExtensionModel[i];
            case 23:
                return new BrowserLiteJSBridgeCall[i];
            case 24:
                return new IABExtensionEventHandlerPayload[i];
            case 25:
                return new IABExtensionStatesHandlerPayload[i];
            case 26:
                return new PrefetchCacheEntry[i];
            case 27:
                return new IABViewModeLaunchConfig.FullScreen[i];
            case 28:
                return new IABViewModeLaunchConfig.FullSheet[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new IABViewModeLaunchConfig.HalfSheet[i];
            case 30:
                return new IABViewModeLaunchConfig.Peek[i];
            case 31:
                return new InitJSBridgeCallData[i];
            case 32:
                return new RequestAutofillJSBridgeCallData[i];
            case 33:
                return new SaveAutofillDataJSBridgeCallData[i];
            case 34:
                return new AREffectAsyncAsset[i];
            case 35:
                return new ARRequestEffect[i];
            case 36:
                return new BlurDetectionFilter[i];
            case 37:
                return new DefectDetectorFilter[i];
            case 38:
                return new TypedParameterMap[i];
            case 39:
                return new ValueMapFilterModel[i];
            case 40:
                return new DataDrivenFilter[i];
            case Seq.NULL_REFNUM /* 41 */:
                return new DataDrivenGraphFilter[i];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new ExternalRenderFilterModel[i];
            case 43:
                return new SurfaceCropFilterModel[i];
            case 44:
                return new SurfaceCropFilterModel.FitTransformParams[i];
            case 45:
                return new SurfaceCropFilterModel.FullTransform[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new SurfaceCropFilterModel.TransformSteps[i];
            case 47:
                return new GainmapAlphaFilter[i];
            case 48:
                return new TiltShiftFilter[i];
            case 49:
                return new TiltShiftOverlayFilter[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return new BasicAdjustTransitionFilter[i];
            case 51:
                return new BlurTransitionFilter[i];
            case 52:
                return new BoxBlurTransitionFilter[i];
            case 53:
                return new BrightnessTransitionFilter[i];
            case 54:
                return new ChromaticAberrationTransitionFilter[i];
            case 55:
                return new FadeOutTransitionFilter[i];
            case 56:
                return new FlareTransitionFilter[i];
            case 57:
                return new GlitchTransitionFilter[i];
            case 58:
                return new LinearGradientTransitionFilter[i];
            case 59:
                return new PanFilter[i];
            case 60:
                return new ScreenBlendWithColorFilter[i];
            case 61:
                return new SpinTransitionFilter[i];
            case 62:
                return new TintTransitionFilter[i];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new TransformTransitionFilter[i];
            case 64:
                return new WarpTransitionFilter[i];
            case 65:
                return new ZoomTransitionFilter[i];
            case 66:
                return new EffectAttribution[i];
            case 67:
                return new EffectAttribution.AttributedAsset[i];
            case 68:
                return new EffectAttribution.License[i];
            case 69:
                return new ParcelableCdmaCellInfo[i];
            case 70:
                return new ParcelableGeneralCellInfo[i];
            case 71:
                return new OneoffTask[i];
            case 72:
                return new PeriodicTask[i];
            case 73:
                return new Matrix3[i];
            case 74:
                return new ParcelableBoolean[i];
            case 75:
                return new Address[i];
            case 76:
                return new AdditionalFields[i];
            case 77:
                return new CreditCard[i];
            case 78:
                return new NewCreditCard[i];
            case 79:
                return new NewPayPal[i];
            case 80:
                return new PayPalBillingAgreement[i];
            case 81:
                return new Either[i];
            case 82:
                return new ParcelablePair[i];
            case 83:
                return new Quartet[i];
            case 84:
                return new Triplet[i];
            case 85:
                return new ColorData[i];
            case 86:
                return new OpacityData[i];
            case 87:
                return new RendererContext[i];
            case 88:
                return new VideoCacheStatus[i];
            case 89:
                return new VideoPlayerServiceEvent[i];
            case 90:
                return new SelfieFaceTrackerProvider[i];
            case 91:
                return new FbPayP2pFriend[i];
            case 92:
                return new FbPayP2pWidgetSendRequest[i];
            case 93:
                return new OperationResult[i];
            case 94:
                return new GraphQLError[i];
            case 95:
                return new ModelParcelHelper$LazyHolder[i];
            case 96:
                return new TreeParcelable[i];
            case 97:
                return new RequestPriority[i];
            case 98:
                return new ApiErrorResult[i];
            default:
                return new Availability[i];
        }
    }

    public static TransformMatrixParams A01(Parcel parcel, Class cls) {
        return (TransformMatrixParams) parcel.readParcelable(cls.getClassLoader());
    }
}
