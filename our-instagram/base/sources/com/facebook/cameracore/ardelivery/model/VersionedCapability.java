package com.facebook.cameracore.ardelivery.model;

import X.C0K8;
import X.EnumC120355cd;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class VersionedCapability {
    public static final /* synthetic */ VersionedCapability[] $VALUES;
    public static final VersionedCapability BiBytedoc;
    public static final VersionedCapability BiDeepText;
    public static final VersionedCapability BiXray;
    public static final VersionedCapability BodyTracking;
    public static final VersionedCapability BodyTracking3D;
    public static final VersionedCapability DepthEstimation;
    public static final VersionedCapability EgoDetectorTracker;
    public static final VersionedCapability EnlightenGAN;
    public static final VersionedCapability FaceExpressionFitting;
    public static final VersionedCapability FaceExpressionFittingRTRRetargeting;
    public static final VersionedCapability FaceWave;
    public static final VersionedCapability Facetracker;
    public static final VersionedCapability GazeCorrection;
    public static final VersionedCapability HairSegmentation;
    public static final VersionedCapability HandGesture;
    public static final VersionedCapability HandTracker;
    public static final VersionedCapability IGReelsXRay;
    public static final VersionedCapability IiFaceTracker;
    public static final VersionedCapability IiIdDetector;
    public static final VersionedCapability IiReducedFaceTracker;
    public static final VersionedCapability MSuggestionsCore;
    public static final VersionedCapability MetaDetTrack;
    public static final VersionedCapability MobileVisionImageUnderstanding;
    public static final VersionedCapability MulticlassSegmentation;
    public static final VersionedCapability MultitaskPeopleSegmentation;
    public static final VersionedCapability Nametag;
    public static final VersionedCapability Ocr2goCreditCard;
    public static final VersionedCapability PytorchTest;
    public static final VersionedCapability Recognition;
    public static final VersionedCapability RingTryOn;
    public static final VersionedCapability Safechat;
    public static final VersionedCapability Saliency;
    public static final VersionedCapability SceneUnderstanding;
    public static final VersionedCapability SegmentAnything;
    public static final VersionedCapability Segmentation;
    public static final VersionedCapability SkySegmentation;
    public static final String TAG = "VersionedCapability";
    public static final Map UPPER_STRING_TO_CAPABILITY_MAP;
    public static final VersionedCapability UTwoNet;
    public static final VersionedCapability VideoHighlights;
    public static final VersionedCapability VideoHighlightsTemporal;
    public static final SparseArray XPLAT_VALUE_TO_VERSIONED_CAPABILITY_MAP;
    public static final VersionedCapability XRay;
    public final XplatAssetType mAssetType;
    public final EnumC120355cd mMLFrameworkType;
    public final int mXplatValue;

    public static /* synthetic */ VersionedCapability[] $values() {
        VersionedCapability[] versionedCapabilityArr = new VersionedCapability[40];
        System.arraycopy(new VersionedCapability[]{Facetracker, HandTracker, Segmentation, HairSegmentation, XRay, RingTryOn, FaceExpressionFitting, MSuggestionsCore, GazeCorrection, Nametag, BiBytedoc, BiDeepText, PytorchTest, BiXray, BodyTracking, Safechat, IiReducedFaceTracker, MulticlassSegmentation, EnlightenGAN, SceneUnderstanding, Ocr2goCreditCard, IiIdDetector, Recognition, IGReelsXRay, SkySegmentation, DepthEstimation, IiFaceTracker}, 0, versionedCapabilityArr, 0, 27);
        System.arraycopy(new VersionedCapability[]{HandGesture, FaceWave, Saliency, MultitaskPeopleSegmentation, EgoDetectorTracker, FaceExpressionFittingRTRRetargeting, VideoHighlights, MobileVisionImageUnderstanding, VideoHighlightsTemporal, MetaDetTrack, SegmentAnything, UTwoNet, BodyTracking3D}, 0, versionedCapabilityArr, 27, 13);
        return versionedCapabilityArr;
    }

    static {
        EnumC120355cd enumC120355cd = EnumC120355cd.NONE;
        XplatAssetType xplatAssetType = XplatAssetType.FaceTrackerModel;
        Facetracker = new VersionedCapability("Facetracker", 0, enumC120355cd, 1, xplatAssetType);
        EnumC120355cd enumC120355cd2 = EnumC120355cd.CAFFE2;
        XplatAssetType xplatAssetType2 = XplatAssetType.Caffe2Model;
        HandTracker = new VersionedCapability("HandTracker", 1, enumC120355cd2, 2, xplatAssetType2);
        Segmentation = new VersionedCapability("Segmentation", 2, enumC120355cd2, 3, XplatAssetType.SegmentationModel);
        HairSegmentation = new VersionedCapability("HairSegmentation", 3, enumC120355cd2, 4, XplatAssetType.HairSegmentationModel);
        XRay = new VersionedCapability("XRay", 4, enumC120355cd2, 5, XplatAssetType.XRayModel);
        RingTryOn = new VersionedCapability("RingTryOn", 5, enumC120355cd2, 6, xplatAssetType2);
        FaceExpressionFitting = new VersionedCapability("FaceExpressionFitting", 6, enumC120355cd, 7, XplatAssetType.FittedExpressionTrackerModel);
        MSuggestionsCore = new VersionedCapability("MSuggestionsCore", 7, enumC120355cd2, 8, XplatAssetType.MSuggestionsCoreModel);
        GazeCorrection = new VersionedCapability("GazeCorrection", 8, enumC120355cd2, 9, xplatAssetType2);
        Nametag = new VersionedCapability("Nametag", 9, enumC120355cd2, 10, XplatAssetType.NametagModel);
        EnumC120355cd enumC120355cd3 = EnumC120355cd.PYTORCH;
        XplatAssetType xplatAssetType3 = XplatAssetType.PyTorchModel;
        BiBytedoc = new VersionedCapability("BiBytedoc", 10, enumC120355cd3, 11, xplatAssetType3);
        BiDeepText = new VersionedCapability("BiDeepText", 11, enumC120355cd2, 12, xplatAssetType2);
        PytorchTest = new VersionedCapability("PytorchTest", 12, enumC120355cd3, 13, xplatAssetType3);
        BiXray = new VersionedCapability("BiXray", 13, enumC120355cd3, 14, xplatAssetType3);
        BodyTracking = new VersionedCapability("BodyTracking", 14, enumC120355cd2, 15, xplatAssetType2);
        Safechat = new VersionedCapability("Safechat", 15, enumC120355cd3, 16, xplatAssetType3);
        IiReducedFaceTracker = new VersionedCapability("IiReducedFaceTracker", 16, enumC120355cd3, 17, xplatAssetType3);
        MulticlassSegmentation = new VersionedCapability("MulticlassSegmentation", 17, enumC120355cd3, 18, XplatAssetType.MulticlassSegmentationModel);
        EnlightenGAN = new VersionedCapability("EnlightenGAN", 18, enumC120355cd3, 19, xplatAssetType3);
        SceneUnderstanding = new VersionedCapability("SceneUnderstanding", 19, enumC120355cd3, 20, xplatAssetType3);
        Ocr2goCreditCard = new VersionedCapability("Ocr2goCreditCard", 20, enumC120355cd3, 21, XplatAssetType.Ocr2goCreditCardModel);
        IiIdDetector = new VersionedCapability("IiIdDetector", 21, enumC120355cd3, 22, xplatAssetType3);
        Recognition = new VersionedCapability("Recognition", 22, enumC120355cd3, 23, XplatAssetType.RecognitionModel);
        IGReelsXRay = new VersionedCapability("IGReelsXRay", 23, enumC120355cd3, 24, xplatAssetType3);
        SkySegmentation = new VersionedCapability("SkySegmentation", 24, enumC120355cd3, 25, xplatAssetType3);
        DepthEstimation = new VersionedCapability("DepthEstimation", 25, enumC120355cd3, 26, xplatAssetType3);
        IiFaceTracker = new VersionedCapability("IiFaceTracker", 26, enumC120355cd, 27, xplatAssetType);
        HandGesture = new VersionedCapability("HandGesture", 27, enumC120355cd3, 28, xplatAssetType3);
        FaceWave = new VersionedCapability("FaceWave", 28, enumC120355cd3, 29, xplatAssetType3);
        Saliency = new VersionedCapability("Saliency", 29, enumC120355cd3, 30, xplatAssetType3);
        MultitaskPeopleSegmentation = new VersionedCapability("MultitaskPeopleSegmentation", 30, enumC120355cd3, 31, xplatAssetType3);
        EgoDetectorTracker = new VersionedCapability("EgoDetectorTracker", 31, enumC120355cd3, 32, xplatAssetType3);
        FaceExpressionFittingRTRRetargeting = new VersionedCapability("FaceExpressionFittingRTRRetargeting", 32, enumC120355cd, 33, XplatAssetType.FittedExpressionTrackerRuntimeRigRetargetingConfig);
        VideoHighlights = new VersionedCapability("VideoHighlights", 33, enumC120355cd3, 34, xplatAssetType3);
        MobileVisionImageUnderstanding = new VersionedCapability("MobileVisionImageUnderstanding", 34, enumC120355cd3, 35, xplatAssetType3);
        VideoHighlightsTemporal = new VersionedCapability("VideoHighlightsTemporal", 35, enumC120355cd3, 36, xplatAssetType3);
        MetaDetTrack = new VersionedCapability("MetaDetTrack", 36, enumC120355cd3, 37, xplatAssetType3);
        SegmentAnything = new VersionedCapability("SegmentAnything", 37, enumC120355cd3, 38, xplatAssetType3);
        UTwoNet = new VersionedCapability("UTwoNet", 38, enumC120355cd3, 39, xplatAssetType3);
        BodyTracking3D = new VersionedCapability("BodyTracking3D", 39, enumC120355cd3, 40, XplatAssetType.BodyTracking3DModel);
        $VALUES = $values();
        XPLAT_VALUE_TO_VERSIONED_CAPABILITY_MAP = new SparseArray(values().length + 1);
        UPPER_STRING_TO_CAPABILITY_MAP = new HashMap();
        for (VersionedCapability versionedCapability : values()) {
            UPPER_STRING_TO_CAPABILITY_MAP.put(versionedCapability.name().toUpperCase(Locale.US), versionedCapability);
            XPLAT_VALUE_TO_VERSIONED_CAPABILITY_MAP.put(versionedCapability.getXplatValue(), versionedCapability);
        }
    }

    public static VersionedCapability fromServerValue(String str) {
        VersionedCapability versionedCapability = (VersionedCapability) UPPER_STRING_TO_CAPABILITY_MAP.get(str.toUpperCase(Locale.US));
        if (versionedCapability == null) {
            C0K8.A0Q(TAG, "Unsupported capability: %s", str);
            return null;
        }
        return versionedCapability;
    }

    public static VersionedCapability fromXplatValue(int i) {
        return (VersionedCapability) XPLAT_VALUE_TO_VERSIONED_CAPABILITY_MAP.get(i);
    }

    public static VersionedCapability valueOf(String str) {
        return (VersionedCapability) Enum.valueOf(VersionedCapability.class, str);
    }

    public static VersionedCapability[] values() {
        return (VersionedCapability[]) $VALUES.clone();
    }

    public EnumC120355cd getMLFrameworkType() {
        return this.mMLFrameworkType;
    }

    public XplatAssetType getXplatAssetType() {
        return this.mAssetType;
    }

    public int getXplatValue() {
        return this.mXplatValue;
    }

    public VersionedCapability(String str, int i, EnumC120355cd enumC120355cd, int i2, XplatAssetType xplatAssetType) {
        this.mMLFrameworkType = enumC120355cd;
        this.mXplatValue = i2;
        this.mAssetType = xplatAssetType;
    }

    public String toServerValue() {
        return name();
    }
}
