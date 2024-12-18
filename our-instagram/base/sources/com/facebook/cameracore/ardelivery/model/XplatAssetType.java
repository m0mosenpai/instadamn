package com.facebook.cameracore.ardelivery.model;

import X.C0J8;
import X.C174407pa;

/* loaded from: classes3.dex */
public enum XplatAssetType {
    Unknown(0),
    AREffect(1),
    Async(2),
    StyleTransferEffect(3),
    LegacyEffect(4),
    ARLink(5),
    Remote(6),
    FaceTrackerModel(7),
    HairSegmentationModel(8),
    SegmentationModel(9),
    XRayModel(10),
    FittedExpressionTrackerModel(11),
    MSuggestionsCoreModel(12),
    NametagModel(13),
    PyTorchModel(14),
    Caffe2Model(15),
    MulticlassSegmentationModel(16),
    ScriptingPackage(17),
    Ocr2goCreditCardModel(18),
    RecognitionModel(19),
    AR3DObject(20),
    SparkVision(21),
    FittedExpressionTrackerRuntimeRigRetargetingConfig(22),
    BodyTracking3DModel(23);

    public static final XplatAssetType[] cppValueToEnumArray = new XplatAssetType[values().length];
    public final int mCppValue;

    static {
        for (XplatAssetType xplatAssetType : values()) {
            cppValueToEnumArray[xplatAssetType.mCppValue] = xplatAssetType;
        }
    }

    public static XplatAssetType fromARRequestAsset(ARRequestAsset aRRequestAsset) {
        C174407pa c174407pa = aRRequestAsset.A02;
        ARAssetType aRAssetType = c174407pa.A02;
        int ordinal = aRAssetType.ordinal();
        if (ordinal != 0) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 1) {
                            boolean z = false;
                            if (aRAssetType == ARAssetType.SUPPORT) {
                                z = true;
                            }
                            C0J8.A09(z, "Cannot get VersionedCapability from Effect Asset");
                            VersionedCapability versionedCapability = c174407pa.A00;
                            if (versionedCapability != null) {
                                return fromVersionedCapability(versionedCapability);
                            }
                            throw new NullPointerException(String.valueOf("SUPPORT ARRequestAsset should have versioned capability field"));
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unknown ARRequestAsset type : ");
                        sb.append(aRAssetType);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    return ScriptingPackage;
                }
                return Remote;
            }
            return Async;
        }
        return AREffect;
    }

    public static XplatAssetType ofCppValue(int i) {
        if (i >= 0 && i < values().length) {
            return cppValueToEnumArray[i];
        }
        throw new IllegalArgumentException("Invalid cpp value for AssetType");
    }

    public int getValue() {
        return this.mCppValue;
    }

    XplatAssetType(int i) {
        this.mCppValue = i;
    }

    public static XplatAssetType fromVersionedCapability(VersionedCapability versionedCapability) {
        return versionedCapability.getXplatAssetType();
    }
}
