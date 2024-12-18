package X;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.android.maps.StaticMapView$StaticMapOptions;
import com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.model.SparkVisionCapability;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterGroup;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.CameraConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.common.locale.Country;
import com.facebook.common.math.matrix.Matrix4;
import com.facebook.forker.Process;
import com.facebook.pushlite.model.PushInfraMetaData;
import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import com.facebook.video.heroplayer.ipc.AudioFocusLossSettings;
import com.facebook.video.heroplayer.ipc.HeroScrollSetting;
import com.facebook.video.heroplayer.ipc.HttpTransferRequestedEvent;
import com.facebook.video.heroplayer.ipc.SubtitleConfiguration;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzk;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.analytics.ppr.loggingdata.PPRLoggingData;
import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.api.schemas.ActionButtonPartnerType;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.AdMetadataType;
import com.instagram.api.schemas.AppstoreMetadataDictImpl;
import com.instagram.api.schemas.AttributionUserImpl;
import com.instagram.api.schemas.AudienceGroup;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.api.schemas.AudioMetadataLabels;
import com.instagram.api.schemas.AudioMutingInfo;
import com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse;
import com.instagram.api.schemas.AvatarStatusImpl;
import com.instagram.api.schemas.BirthdayVisibilityForViewer;
import com.instagram.api.schemas.BizUserInboxState;
import com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObjImpl;
import com.instagram.api.schemas.BrandedContentAdsPaidPartnershipLabelRemovalOption;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.CanUseCreatorMonetizationProduct;
import com.instagram.api.schemas.CarouselRenderingType;
import com.instagram.api.schemas.CheckoutStyle;
import com.instagram.api.schemas.ClientDisplayMethod;
import com.instagram.api.schemas.ClipsCameraCommandAction;
import com.instagram.api.schemas.ClipsCreationEntryPoint;
import com.instagram.api.schemas.ClipsIFUType;
import com.instagram.api.schemas.ClipsMashupFollowButtonInfoImpl;
import com.instagram.api.schemas.ClipsMashupType;
import com.instagram.api.schemas.ClipsSpecialResponseType;
import com.instagram.api.schemas.ClipsTextAlignment;
import com.instagram.api.schemas.ClipsTextEmphasisMode;
import com.instagram.api.schemas.ClipsTextFormatType;
import com.instagram.api.schemas.CollabFollowButtonInfoImpl;
import com.instagram.api.schemas.CollectionMediaRole;
import com.instagram.api.schemas.CommentAudienceControlType;
import com.instagram.api.schemas.CommentGiphyMediaImages;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.api.schemas.CommentRestrictStatus;
import com.instagram.api.schemas.CommerceReviewStatisticsDict;
import com.instagram.api.schemas.ConfirmationStyle;
import com.instagram.api.schemas.ConfirmationTitleStyle;
import com.instagram.api.schemas.ContextualHighlightType;
import com.instagram.api.schemas.CornerStyle;
import com.instagram.api.schemas.CreateModeType;
import com.instagram.api.schemas.CreationToolEnum;
import com.instagram.api.schemas.CreatorSegmentation;
import com.instagram.api.schemas.DemarcatorStyleEnum;
import com.instagram.api.schemas.DirectAudioFallbackUrlImpl;
import com.instagram.api.schemas.DirectMediaFallbackUrl;
import com.instagram.api.schemas.DynamicProductAdDisplayOption;
import com.instagram.api.schemas.FBBioLinkSocialContextType;
import com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponse;
import com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponseImpl;
import com.instagram.api.schemas.FanClubInfoDictImpl;
import com.instagram.api.schemas.FanClubStatusSyncInfoImpl;
import com.instagram.api.schemas.FanClubStoriesTeaserType;
import com.instagram.api.schemas.FeedItemType;
import com.instagram.api.schemas.GalleryMediaFolderEnum;
import com.instagram.api.schemas.GrowthFrictionInfoImpl;
import com.instagram.api.schemas.GrowthFrictionInterventionCategories;
import com.instagram.api.schemas.GrowthFrictionInterventionCategoriesImpl;
import com.instagram.api.schemas.GrowthFrictionInterventionDetail;
import com.instagram.api.schemas.HallpassDetailsDictImpl;
import com.instagram.api.schemas.HasOnboardedCreatorMonetizationProduct;
import com.instagram.api.schemas.HasPasswordState;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.ProfilePicture;
import com.instagram.common.typedurl.directlogging.DirectImageLoggingData;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.9Aw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206149Aw implements Parcelable.Creator {
    public final int A00;

    public C206149Aw(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.recyclerview.widget.LinearLayoutManager$SavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v38, types: [java.lang.Object, com.google.android.gms.common.internal.zzk] */
    /* JADX WARN: Type inference failed for: r8v45, types: [java.lang.Object, com.instagram.accountlinking.model.AccountFamily] */
    /* JADX WARN: Type inference failed for: r8v7, types: [com.facebook.cameracore.ardelivery.model.SparkVisionCapability, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Long valueOf;
        Float valueOf2;
        Integer valueOf3;
        Boolean valueOf4;
        ArrayList arrayList;
        HashMap hashMap;
        ArrayList arrayList2;
        Boolean valueOf5;
        Boolean valueOf6;
        Boolean valueOf7;
        Float valueOf8;
        ArrayList arrayList3;
        Boolean valueOf9;
        Integer valueOf10;
        Boolean valueOf11;
        Boolean valueOf12;
        Boolean valueOf13;
        Long valueOf14;
        ArrayList arrayList4;
        switch (this.A00) {
            case 0:
                return new ParcelableSnapshotMutableFloatState(parcel.readFloat());
            case 1:
                return new ParcelableSnapshotMutableIntState(parcel.readInt());
            case 2:
                return new ParcelableSnapshotMutableLongState(parcel.readLong());
            case 3:
                ?? obj = new Object();
                obj.A01 = parcel.readInt();
                obj.A00 = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                obj.A02 = z;
                return obj;
            case 4:
                StaticMapView$StaticMapOptions staticMapView$StaticMapOptions = new StaticMapView$StaticMapOptions(parcel.readString());
                staticMapView$StaticMapOptions.A04 = parcel.readString();
                staticMapView$StaticMapOptions.A0B = parcel.readString();
                staticMapView$StaticMapOptions.A02 = parcel.readString();
                staticMapView$StaticMapOptions.A0A = parcel.readString();
                staticMapView$StaticMapOptions.A03 = parcel.readString();
                staticMapView$StaticMapOptions.A05 = parcel.readString();
                staticMapView$StaticMapOptions.A06 = parcel.readString();
                staticMapView$StaticMapOptions.A07 = parcel.readString();
                staticMapView$StaticMapOptions.A00 = parcel.readFloat();
                staticMapView$StaticMapOptions.A01 = parcel.readFloat();
                ArrayList arrayList5 = new ArrayList();
                staticMapView$StaticMapOptions.A0C = arrayList5;
                parcel.readStringList(arrayList5);
                staticMapView$StaticMapOptions.A09 = parcel.readString();
                return staticMapView$StaticMapOptions;
            case 5:
                return new ARCapabilityMinVersionModeling(parcel);
            case 6:
                return new ARRequestAsset(parcel);
            case 7:
                ?? obj2 = new Object();
                obj2.A00 = null;
                obj2.A00 = (List) parcel.readValue(List.class.getClassLoader());
                return obj2;
            case 8:
                C14360o3.A0B(parcel, 0);
                String readString = parcel.readString();
                float[] createFloatArray = parcel.createFloatArray();
                float[] createFloatArray2 = parcel.createFloatArray();
                float readFloat = parcel.readFloat();
                boolean z2 = false;
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z3 = true;
                }
                boolean z4 = false;
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                return new ColorFilter((TransformMatrixParams) parcel.readParcelable(ColorFilter.class.getClassLoader()), readString, createFloatArray, createFloatArray2, readFloat, z2, z3, z4);
            case 9:
                C14360o3.A0B(parcel, 0);
                int readInt = parcel.readInt();
                SparseArray sparseArray = new SparseArray(readInt);
                while (readInt != 0) {
                    sparseArray.put(parcel.readInt(), parcel.readParcelable(FilterChain.class.getClassLoader()));
                    readInt--;
                }
                int readInt2 = parcel.readInt();
                SparseArray sparseArray2 = new SparseArray(readInt2);
                while (readInt2 != 0) {
                    sparseArray2.put(parcel.readInt(), parcel.readParcelable(FilterChain.class.getClassLoader()));
                    readInt2--;
                }
                String readString2 = parcel.readString();
                boolean z5 = false;
                if (parcel.readInt() != 0) {
                    z5 = true;
                }
                return new FilterChain(sparseArray, sparseArray2, (TransformMatrixParams) parcel.readParcelable(FilterChain.class.getClassLoader()), readString2, parcel.createFloatArray(), parcel.createFloatArray(), z5);
            case 10:
                C14360o3.A0B(parcel, 0);
                int readInt3 = parcel.readInt();
                SparseArray sparseArray3 = new SparseArray(readInt3);
                while (readInt3 != 0) {
                    sparseArray3.put(parcel.readInt(), parcel.readParcelable(FilterGroup.class.getClassLoader()));
                    readInt3--;
                }
                int readInt4 = parcel.readInt();
                SparseArray sparseArray4 = new SparseArray(readInt4);
                while (readInt4 != 0) {
                    sparseArray4.put(parcel.readInt(), parcel.readParcelable(FilterGroup.class.getClassLoader()));
                    readInt4--;
                }
                String readString3 = parcel.readString();
                boolean z6 = false;
                if (parcel.readInt() != 0) {
                    z6 = true;
                }
                return new FilterGroup(sparseArray3, sparseArray4, (TransformMatrixParams) parcel.readParcelable(FilterGroup.class.getClassLoader()), readString3, parcel.createFloatArray(), parcel.createFloatArray(), z6);
            case 11:
                C14360o3.A0B(parcel, 0);
                float[] createFloatArray3 = parcel.createFloatArray();
                float[] createFloatArray4 = parcel.createFloatArray();
                Bitmap bitmap = (Bitmap) parcel.readParcelable(GradientTransformFilter.class.getClassLoader());
                boolean z7 = false;
                if (parcel.readInt() != 0) {
                    z7 = true;
                }
                float readFloat2 = parcel.readFloat();
                float readFloat3 = parcel.readFloat();
                float readFloat4 = parcel.readFloat();
                boolean z8 = false;
                if (parcel.readInt() != 0) {
                    z8 = true;
                }
                boolean z9 = false;
                if (parcel.readInt() != 0) {
                    z9 = true;
                }
                return new GradientTransformFilter(bitmap, (TransformMatrixParams) parcel.readParcelable(GradientTransformFilter.class.getClassLoader()), parcel.readString(), createFloatArray3, createFloatArray4, parcel.createFloatArray(), parcel.createFloatArray(), readFloat2, readFloat3, readFloat4, z7, z8, z9);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C14360o3.A0B(parcel, 0);
                float readFloat5 = parcel.readFloat();
                FilterModel filterModel = (FilterModel) parcel.readParcelable(SplitScreenFilter.class.getClassLoader());
                FilterModel filterModel2 = (FilterModel) parcel.readParcelable(SplitScreenFilter.class.getClassLoader());
                String readString4 = parcel.readString();
                float[] createFloatArray5 = parcel.createFloatArray();
                float[] createFloatArray6 = parcel.createFloatArray();
                boolean z10 = false;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                return new SplitScreenFilter(filterModel, filterModel2, (TransformMatrixParams) parcel.readParcelable(SplitScreenFilter.class.getClassLoader()), readString4, createFloatArray5, createFloatArray6, readFloat5, z10);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C14360o3.A0B(parcel, 0);
                float readFloat6 = parcel.readFloat();
                String readString5 = parcel.readString();
                float[] createFloatArray7 = parcel.createFloatArray();
                float[] createFloatArray8 = parcel.createFloatArray();
                boolean z11 = false;
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                return new GainmapFilter((TransformMatrixParams) parcel.readParcelable(GainmapFilter.class.getClassLoader()), readString5, createFloatArray7, createFloatArray8, readFloat6, z11);
            case 14:
                C14360o3.A0B(parcel, 0);
                boolean z12 = false;
                if (parcel.readInt() != 0) {
                    z12 = true;
                }
                return new TransformMatrixParams(AbstractC203548zF.A00(parcel.readString()), AbstractC203548zF.A00(parcel.readString()), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), z12);
            case Process.SIGTERM /* 15 */:
                return new CameraConfig(parcel);
            case 16:
                return new DeviceConfig(parcel);
            case 17:
                return new CallerContext(parcel);
            case 18:
                return new ContextChain(parcel);
            case Process.SIGSTOP /* 19 */:
                return Country.A00(null, parcel.readString());
            case 20:
                C14360o3.A0B(parcel, 0);
                return new Matrix4(parcel);
            case 21:
                C14360o3.A0B(parcel, 0);
                AbstractC73763Sg abstractC73763Sg = PushInfraMetaData.A0A;
                String readString6 = parcel.readString();
                Long l = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(parcel.readLong());
                }
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                if (parcel.readInt() != 0) {
                    l = Long.valueOf(parcel.readLong());
                }
                return new PushInfraMetaData(valueOf, l, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13);
            case 22:
                return new SubscribeTopic(parcel);
            case 23:
                return new AudioFocusLossSettings(parcel);
            case 24:
                return new HeroScrollSetting(parcel);
            case 25:
                return new HttpTransferRequestedEvent(parcel);
            case 26:
                return new SubtitleConfiguration(parcel);
            case 27:
                C14360o3.A0B(parcel, 0);
                C7I5 c7i5 = Capabilities.A01;
                byte[] createByteArray = parcel.createByteArray();
                if (createByteArray == null) {
                    createByteArray = new byte[0];
                }
                int length = createByteArray.length;
                if (length == 0) {
                    return Capabilities.A02;
                }
                BitSet bitSet = new BitSet(length * 8);
                int i = 0;
                do {
                    byte b = createByteArray[i];
                    int i2 = 0;
                    do {
                        if (((1 << i2) & b) != 0) {
                            bitSet.set((i * 8) + i2);
                        }
                        i2++;
                    } while (i2 < 8);
                    i++;
                } while (i < length);
                return new Capabilities(bitSet);
            case 28:
                return new Metadata(parcel);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new ColorInfo(parcel);
            case 30:
                int A00 = AbstractC125725mK.A00(parcel);
                String str = null;
                PendingIntent pendingIntent = null;
                ConnectionResult connectionResult = null;
                int i3 = 0;
                while (parcel.dataPosition() < A00) {
                    int readInt5 = parcel.readInt();
                    char c = (char) readInt5;
                    if (c != 1) {
                        if (c != 2) {
                            if (c != 3) {
                                if (c != 4) {
                                    AbstractC125725mK.A0C(parcel, readInt5);
                                } else {
                                    connectionResult = (ConnectionResult) AbstractC125725mK.A04(parcel, ConnectionResult.CREATOR, readInt5);
                                }
                            } else {
                                pendingIntent = (PendingIntent) AbstractC125725mK.A04(parcel, PendingIntent.CREATOR, readInt5);
                            }
                        } else {
                            str = AbstractC125725mK.A08(parcel, readInt5);
                        }
                    } else {
                        AbstractC125725mK.A0D(parcel, readInt5);
                        i3 = parcel.readInt();
                    }
                }
                AbstractC125725mK.A0B(parcel, A00);
                return new Status(pendingIntent, connectionResult, str, i3);
            case 31:
                int A002 = AbstractC125725mK.A00(parcel);
                int i4 = 0;
                boolean z13 = false;
                boolean z14 = false;
                int i5 = 0;
                int i6 = 0;
                while (parcel.dataPosition() < A002) {
                    int readInt6 = parcel.readInt();
                    char c2 = (char) readInt6;
                    if (c2 != 1) {
                        if (c2 != 2) {
                            if (c2 != 3) {
                                if (c2 != 4) {
                                    if (c2 != 5) {
                                        AbstractC125725mK.A0C(parcel, readInt6);
                                    } else {
                                        AbstractC125725mK.A0F(parcel, readInt6, 4);
                                        i6 = parcel.readInt();
                                    }
                                } else {
                                    AbstractC125725mK.A0F(parcel, readInt6, 4);
                                    i5 = parcel.readInt();
                                }
                            } else {
                                z14 = AbstractC125725mK.A0G(parcel, readInt6);
                            }
                        } else {
                            z13 = AbstractC125725mK.A0G(parcel, readInt6);
                        }
                    } else {
                        AbstractC125725mK.A0D(parcel, readInt6);
                        i4 = parcel.readInt();
                    }
                }
                AbstractC125725mK.A0B(parcel, A002);
                return new RootTelemetryConfiguration(i4, i5, i6, z13, z14);
            case 32:
                int A003 = AbstractC125725mK.A00(parcel);
                Bundle bundle = null;
                Feature[] featureArr = null;
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
                int i7 = 0;
                while (parcel.dataPosition() < A003) {
                    int readInt7 = parcel.readInt();
                    char c3 = (char) readInt7;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            if (c3 != 3) {
                                if (c3 != 4) {
                                    AbstractC125725mK.A0C(parcel, readInt7);
                                } else {
                                    connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) AbstractC125725mK.A04(parcel, ConnectionTelemetryConfiguration.CREATOR, readInt7);
                                }
                            } else {
                                AbstractC125725mK.A0D(parcel, readInt7);
                                i7 = parcel.readInt();
                            }
                        } else {
                            featureArr = (Feature[]) AbstractC125725mK.A0J(parcel, Feature.CREATOR, readInt7);
                        }
                    } else {
                        bundle = AbstractC125725mK.A02(parcel, readInt7);
                    }
                }
                AbstractC125725mK.A0B(parcel, A003);
                ?? obj3 = new Object();
                obj3.A01 = bundle;
                obj3.A03 = featureArr;
                obj3.A00 = i7;
                obj3.A02 = connectionTelemetryConfiguration;
                return obj3;
            case 33:
                int A004 = AbstractC125725mK.A00(parcel);
                RootTelemetryConfiguration rootTelemetryConfiguration = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z15 = false;
                boolean z16 = false;
                int i8 = 0;
                while (parcel.dataPosition() < A004) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            rootTelemetryConfiguration = (RootTelemetryConfiguration) AbstractC125725mK.A04(parcel, RootTelemetryConfiguration.CREATOR, readInt8);
                            break;
                        case 2:
                            z15 = AbstractC125725mK.A0G(parcel, readInt8);
                            break;
                        case 3:
                            z16 = AbstractC125725mK.A0G(parcel, readInt8);
                            break;
                        case 4:
                            iArr = AbstractC125725mK.A0I(parcel, readInt8);
                            break;
                        case 5:
                            AbstractC125725mK.A0D(parcel, readInt8);
                            i8 = parcel.readInt();
                            break;
                        case 6:
                            iArr2 = AbstractC125725mK.A0I(parcel, readInt8);
                            break;
                        default:
                            AbstractC125725mK.A0C(parcel, readInt8);
                            break;
                    }
                }
                AbstractC125725mK.A0B(parcel, A004);
                return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, iArr, iArr2, i8, z15, z16);
            case 34:
                int A005 = AbstractC125725mK.A00(parcel);
                Scope[] scopeArr = GetServiceRequest.A0F;
                Bundle bundle2 = new Bundle();
                Feature[] featureArr2 = GetServiceRequest.A0E;
                String str2 = null;
                Feature[] featureArr3 = featureArr2;
                IBinder iBinder = null;
                Account account = null;
                String str3 = null;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                boolean z17 = false;
                int i12 = 0;
                boolean z18 = false;
                while (parcel.dataPosition() < A005) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            AbstractC125725mK.A0D(parcel, readInt9);
                            i9 = parcel.readInt();
                            break;
                        case 2:
                            AbstractC125725mK.A0D(parcel, readInt9);
                            i10 = parcel.readInt();
                            break;
                        case 3:
                            AbstractC125725mK.A0D(parcel, readInt9);
                            i11 = parcel.readInt();
                            break;
                        case 4:
                            str2 = AbstractC125725mK.A08(parcel, readInt9);
                            break;
                        case 5:
                            iBinder = AbstractC125725mK.A03(parcel, readInt9);
                            break;
                        case 6:
                            scopeArr = (Scope[]) AbstractC125725mK.A0J(parcel, Scope.CREATOR, readInt9);
                            break;
                        case 7:
                            bundle2 = AbstractC125725mK.A02(parcel, readInt9);
                            break;
                        case '\b':
                            account = (Account) AbstractC125725mK.A04(parcel, Account.CREATOR, readInt9);
                            break;
                        case '\t':
                        default:
                            AbstractC125725mK.A0C(parcel, readInt9);
                            break;
                        case '\n':
                            featureArr2 = (Feature[]) AbstractC125725mK.A0J(parcel, Feature.CREATOR, readInt9);
                            break;
                        case 11:
                            featureArr3 = (Feature[]) AbstractC125725mK.A0J(parcel, Feature.CREATOR, readInt9);
                            break;
                        case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                            z17 = AbstractC125725mK.A0G(parcel, readInt9);
                            break;
                        case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                            AbstractC125725mK.A0D(parcel, readInt9);
                            i12 = parcel.readInt();
                            break;
                        case 14:
                            z18 = AbstractC125725mK.A0G(parcel, readInt9);
                            break;
                        case Process.SIGTERM /* 15 */:
                            str3 = AbstractC125725mK.A08(parcel, readInt9);
                            break;
                    }
                }
                AbstractC125725mK.A0B(parcel, A005);
                return new GetServiceRequest(account, bundle2, iBinder, str2, str3, featureArr2, featureArr3, scopeArr, i9, i10, i11, i12, z17, z18);
            case 35:
                int A006 = AbstractC125725mK.A00(parcel);
                int i13 = 0;
                PendingIntent pendingIntent2 = null;
                String str4 = null;
                int i14 = 0;
                while (parcel.dataPosition() < A006) {
                    int readInt10 = parcel.readInt();
                    char c4 = (char) readInt10;
                    if (c4 != 1) {
                        if (c4 != 2) {
                            if (c4 != 3) {
                                if (c4 != 4) {
                                    AbstractC125725mK.A0C(parcel, readInt10);
                                } else {
                                    str4 = AbstractC125725mK.A08(parcel, readInt10);
                                }
                            } else {
                                pendingIntent2 = (PendingIntent) AbstractC125725mK.A04(parcel, PendingIntent.CREATOR, readInt10);
                            }
                        } else {
                            AbstractC125725mK.A0D(parcel, readInt10);
                            i14 = parcel.readInt();
                        }
                    } else {
                        AbstractC125725mK.A0D(parcel, readInt10);
                        i13 = parcel.readInt();
                    }
                }
                AbstractC125725mK.A0B(parcel, A006);
                return new ConnectionResult(pendingIntent2, str4, i13, i14);
            case 36:
                int A007 = AbstractC125725mK.A00(parcel);
                long j = -1;
                int i15 = 0;
                String str5 = null;
                while (parcel.dataPosition() < A007) {
                    int readInt11 = parcel.readInt();
                    char c5 = (char) readInt11;
                    if (c5 != 1) {
                        if (c5 != 2) {
                            if (c5 != 3) {
                                AbstractC125725mK.A0C(parcel, readInt11);
                            } else {
                                AbstractC125725mK.A0F(parcel, readInt11, 8);
                                j = parcel.readLong();
                            }
                        } else {
                            AbstractC125725mK.A0D(parcel, readInt11);
                            i15 = parcel.readInt();
                        }
                    } else {
                        str5 = AbstractC125725mK.A08(parcel, readInt11);
                    }
                }
                AbstractC125725mK.A0B(parcel, A007);
                return new Feature(str5, i15, j);
            case 37:
                String readString14 = parcel.readString();
                readString14.getClass();
                ?? obj4 = new Object();
                obj4.A02 = readString14;
                obj4.A04 = new ArrayList();
                obj4.A03 = new ArrayList();
                obj4.A00 = EnumC2050795x.UNKNOWN;
                obj4.A00 = (EnumC2050795x) parcel.readSerializable();
                List list = obj4.A04;
                Parcelable.Creator creator = User.CREATOR;
                parcel.readTypedList(list, creator);
                parcel.readTypedList(obj4.A03, creator);
                return obj4;
            case 38:
                C14360o3.A0B(parcel, 0);
                String readString15 = parcel.readString();
                if (readString15 != null) {
                    Integer num = C05F.A00(5)[parcel.readInt()];
                    boolean z19 = false;
                    if (parcel.readInt() != 0) {
                        z19 = true;
                    }
                    boolean z20 = false;
                    if (parcel.readInt() != 0) {
                        z20 = true;
                    }
                    Integer num2 = C05F.A00(5)[parcel.readInt()];
                    boolean z21 = false;
                    if (parcel.readInt() != 0) {
                        z21 = true;
                    }
                    return new PPRLoggingData((DirectImageLoggingData) parcel.readParcelable(DirectImageLoggingData.class.getClassLoader()), num, num2, readString15, z19, z20, z21);
                }
                throw new IllegalStateException("Required value was null.");
            case 39:
                C14360o3.A0B(parcel, 0);
                return ACRType.values()[parcel.readInt()];
            case 40:
                C14360o3.A0B(parcel, 0);
                return AFI_TYPE.values()[parcel.readInt()];
            case Seq.NULL_REFNUM /* 41 */:
                C14360o3.A0B(parcel, 0);
                return ActionButtonPartnerType.values()[parcel.readInt()];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C14360o3.A0B(parcel, 0);
                return AdFormatType.values()[parcel.readInt()];
            case 43:
                C14360o3.A0B(parcel, 0);
                return AdMetadataType.values()[parcel.readInt()];
            case 44:
                C14360o3.A0B(parcel, 0);
                ArrayList arrayList6 = null;
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Float.valueOf(parcel.readFloat());
                }
                String readString16 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Integer.valueOf(parcel.readInt());
                }
                String readString17 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt12 = parcel.readInt();
                    arrayList6 = new ArrayList(readInt12);
                    for (int i16 = 0; i16 != readInt12; i16++) {
                        arrayList6.add(parcel.readParcelable(AppstoreMetadataDictImpl.class.getClassLoader()));
                    }
                }
                return new AppstoreMetadataDictImpl(valueOf2, valueOf3, readString16, readString17, arrayList6);
            case 45:
                C14360o3.A0B(parcel, 0);
                String readString18 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    boolean z22 = false;
                    if (parcel.readInt() != 0) {
                        z22 = true;
                    }
                    valueOf4 = Boolean.valueOf(z22);
                }
                return new AttributionUserImpl((ProfilePicture) parcel.readParcelable(AttributionUserImpl.class.getClassLoader()), valueOf4, readString18, parcel.readString());
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C14360o3.A0B(parcel, 0);
                return AudienceGroup.values()[parcel.readInt()];
            case 47:
                C14360o3.A0B(parcel, 0);
                return AudioFilterType.values()[parcel.readInt()];
            case 48:
                C14360o3.A0B(parcel, 0);
                return AudioMetadataLabels.values()[parcel.readInt()];
            case 49:
                C14360o3.A0B(parcel, 0);
                boolean z23 = false;
                if (parcel.readInt() != 0) {
                    z23 = true;
                }
                boolean z24 = false;
                if (parcel.readInt() != 0) {
                    z24 = true;
                }
                MusicMuteAudioReason musicMuteAudioReason = (MusicMuteAudioReason) parcel.readParcelable(AudioMutingInfo.class.getClassLoader());
                String readString19 = parcel.readString();
                boolean z25 = false;
                if (parcel.readInt() != 0) {
                    z25 = true;
                }
                return new AudioMutingInfo(musicMuteAudioReason, readString19, z23, z24, z25);
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                C14360o3.A0B(parcel, 0);
                return new AvatarCoinFlipBackgroundOptionResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 51:
                C14360o3.A0B(parcel, 0);
                boolean z26 = false;
                if (parcel.readInt() != 0) {
                    z26 = true;
                }
                return new AvatarStatusImpl(z26);
            case 52:
                C14360o3.A0B(parcel, 0);
                return BirthdayVisibilityForViewer.values()[parcel.readInt()];
            case 53:
                C14360o3.A0B(parcel, 0);
                return BizUserInboxState.values()[parcel.readInt()];
            case 54:
                C14360o3.A0B(parcel, 0);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt13 = parcel.readInt();
                    arrayList = new ArrayList(readInt13);
                    for (int i17 = 0; i17 != readInt13; i17++) {
                        arrayList.add(Integer.valueOf(parcel.readInt()));
                    }
                }
                return new BrandSafetyContentBlocklistBitmapQLObjImpl(arrayList);
            case 55:
                C14360o3.A0B(parcel, 0);
                return BrandedContentAdsPaidPartnershipLabelRemovalOption.values()[parcel.readInt()];
            case 56:
                C14360o3.A0B(parcel, 0);
                Integer num3 = null;
                if (parcel.readInt() == 0) {
                    hashMap = null;
                } else {
                    int readInt14 = parcel.readInt();
                    hashMap = new HashMap(readInt14);
                    for (int i18 = 0; i18 != readInt14; i18++) {
                        hashMap.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt15 = parcel.readInt();
                    arrayList2 = new ArrayList(readInt15);
                    for (int i19 = 0; i19 != readInt15; i19++) {
                        arrayList2.add(parcel.readParcelable(BrandedContentGatingInfo.class.getClassLoader()));
                    }
                }
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                if (parcel.readInt() != 0) {
                    num3 = Integer.valueOf(parcel.readInt());
                }
                return new BrandedContentGatingInfo(num3, parcel.readString(), hashMap, arrayList2, createStringArrayList);
            case 57:
                C14360o3.A0B(parcel, 0);
                return CameraTool.values()[parcel.readInt()];
            case 58:
                C14360o3.A0B(parcel, 0);
                return CanUseCreatorMonetizationProduct.values()[parcel.readInt()];
            case 59:
                C14360o3.A0B(parcel, 0);
                return CarouselRenderingType.values()[parcel.readInt()];
            case 60:
                C14360o3.A0B(parcel, 0);
                return CheckoutStyle.values()[parcel.readInt()];
            case 61:
                C14360o3.A0B(parcel, 0);
                return ClientDisplayMethod.values()[parcel.readInt()];
            case 62:
                C14360o3.A0B(parcel, 0);
                return ClipsCameraCommandAction.values()[parcel.readInt()];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                C14360o3.A0B(parcel, 0);
                return ClipsCreationEntryPoint.values()[parcel.readInt()];
            case 64:
                C14360o3.A0B(parcel, 0);
                return ClipsIFUType.values()[parcel.readInt()];
            case 65:
                C14360o3.A0B(parcel, 0);
                boolean z27 = true;
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    valueOf5 = null;
                } else {
                    boolean z28 = false;
                    if (parcel.readInt() != 0) {
                        z28 = true;
                    }
                    valueOf5 = Boolean.valueOf(z28);
                }
                if (parcel.readInt() != 0) {
                    if (parcel.readInt() == 0) {
                        z27 = false;
                    }
                    bool = Boolean.valueOf(z27);
                }
                return new ClipsMashupFollowButtonInfoImpl(valueOf5, bool);
            case 66:
                C14360o3.A0B(parcel, 0);
                return ClipsMashupType.values()[parcel.readInt()];
            case 67:
                C14360o3.A0B(parcel, 0);
                return ClipsSpecialResponseType.values()[parcel.readInt()];
            case 68:
                C14360o3.A0B(parcel, 0);
                return ClipsTextAlignment.values()[parcel.readInt()];
            case 69:
                C14360o3.A0B(parcel, 0);
                return ClipsTextEmphasisMode.values()[parcel.readInt()];
            case 70:
                C14360o3.A0B(parcel, 0);
                return ClipsTextFormatType.values()[parcel.readInt()];
            case 71:
                C14360o3.A0B(parcel, 0);
                boolean z29 = true;
                Boolean bool2 = null;
                if (parcel.readInt() == 0) {
                    valueOf6 = null;
                } else {
                    boolean z30 = false;
                    if (parcel.readInt() != 0) {
                        z30 = true;
                    }
                    valueOf6 = Boolean.valueOf(z30);
                }
                if (parcel.readInt() != 0) {
                    if (parcel.readInt() == 0) {
                        z29 = false;
                    }
                    bool2 = Boolean.valueOf(z29);
                }
                return new CollabFollowButtonInfoImpl(valueOf6, bool2);
            case 72:
                C14360o3.A0B(parcel, 0);
                return CollectionMediaRole.values()[parcel.readInt()];
            case 73:
                C14360o3.A0B(parcel, 0);
                return CommentAudienceControlType.values()[parcel.readInt()];
            case 74:
                C14360o3.A0B(parcel, 0);
                CommentGiphyMediaImages commentGiphyMediaImages = (CommentGiphyMediaImages) parcel.readParcelable(CommentGiphyMediaInfo.class.getClassLoader());
                String readString20 = parcel.readString();
                CommentGiphyMediaImages commentGiphyMediaImages2 = (CommentGiphyMediaImages) parcel.readParcelable(CommentGiphyMediaInfo.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf7 = null;
                } else {
                    boolean z31 = false;
                    if (parcel.readInt() != 0) {
                        z31 = true;
                    }
                    valueOf7 = Boolean.valueOf(z31);
                }
                return new CommentGiphyMediaInfo(commentGiphyMediaImages, commentGiphyMediaImages2, valueOf7, readString20, parcel.readString(), parcel.readString());
            case 75:
                C14360o3.A0B(parcel, 0);
                return CommentRestrictStatus.values()[parcel.readInt()];
            case 76:
                C14360o3.A0B(parcel, 0);
                Integer num4 = null;
                if (parcel.readInt() == 0) {
                    valueOf8 = null;
                } else {
                    valueOf8 = Float.valueOf(parcel.readFloat());
                }
                if (parcel.readInt() == 0) {
                    arrayList3 = null;
                } else {
                    int readInt16 = parcel.readInt();
                    arrayList3 = new ArrayList(readInt16);
                    for (int i20 = 0; i20 != readInt16; i20++) {
                        arrayList3.add(parcel.readParcelable(CommerceReviewStatisticsDict.class.getClassLoader()));
                    }
                }
                if (parcel.readInt() != 0) {
                    num4 = Integer.valueOf(parcel.readInt());
                }
                return new CommerceReviewStatisticsDict(valueOf8, num4, arrayList3);
            case 77:
                C14360o3.A0B(parcel, 0);
                return ConfirmationStyle.values()[parcel.readInt()];
            case 78:
                C14360o3.A0B(parcel, 0);
                return ConfirmationTitleStyle.values()[parcel.readInt()];
            case 79:
                C14360o3.A0B(parcel, 0);
                return ContextualHighlightType.values()[parcel.readInt()];
            case 80:
                C14360o3.A0B(parcel, 0);
                return CornerStyle.values()[parcel.readInt()];
            case 81:
                C14360o3.A0B(parcel, 0);
                return CreateModeType.values()[parcel.readInt()];
            case 82:
                C14360o3.A0B(parcel, 0);
                return CreationToolEnum.values()[parcel.readInt()];
            case 83:
                C14360o3.A0B(parcel, 0);
                return CreatorSegmentation.values()[parcel.readInt()];
            case 84:
                C14360o3.A0B(parcel, 0);
                return DemarcatorStyleEnum.values()[parcel.readInt()];
            case 85:
                C14360o3.A0B(parcel, 0);
                return new DirectAudioFallbackUrlImpl(parcel.readString());
            case 86:
                C14360o3.A0B(parcel, 0);
                return new DirectMediaFallbackUrl(parcel.readString());
            case 87:
                C14360o3.A0B(parcel, 0);
                return DynamicProductAdDisplayOption.values()[parcel.readInt()];
            case 88:
                C14360o3.A0B(parcel, 0);
                return FBBioLinkSocialContextType.values()[parcel.readInt()];
            case 89:
                boolean z32 = false;
                C14360o3.A0B(parcel, 0);
                boolean z33 = true;
                if (parcel.readInt() != 0) {
                    z32 = true;
                }
                if (parcel.readInt() == 0) {
                    z33 = false;
                }
                return new FanClubFanConsiderationPageFeatureEligibilityResponseImpl(z32, z33);
            case 90:
                C14360o3.A0B(parcel, 0);
                boolean z34 = true;
                Integer num5 = null;
                if (parcel.readInt() == 0) {
                    valueOf9 = null;
                } else {
                    boolean z35 = false;
                    if (parcel.readInt() != 0) {
                        z35 = true;
                    }
                    valueOf9 = Boolean.valueOf(z35);
                }
                if (parcel.readInt() == 0) {
                    valueOf10 = null;
                } else {
                    valueOf10 = Integer.valueOf(parcel.readInt());
                }
                String readString21 = parcel.readString();
                String readString22 = parcel.readString();
                FanClubFanConsiderationPageFeatureEligibilityResponse fanClubFanConsiderationPageFeatureEligibilityResponse = (FanClubFanConsiderationPageFeatureEligibilityResponse) parcel.readParcelable(FanClubInfoDictImpl.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf11 = null;
                } else {
                    boolean z36 = false;
                    if (parcel.readInt() != 0) {
                        z36 = true;
                    }
                    valueOf11 = Boolean.valueOf(z36);
                }
                if (parcel.readInt() == 0) {
                    valueOf12 = null;
                } else {
                    boolean z37 = false;
                    if (parcel.readInt() != 0) {
                        z37 = true;
                    }
                    valueOf12 = Boolean.valueOf(z37);
                }
                if (parcel.readInt() == 0) {
                    valueOf13 = null;
                } else {
                    if (parcel.readInt() == 0) {
                        z34 = false;
                    }
                    valueOf13 = Boolean.valueOf(z34);
                }
                String readString23 = parcel.readString();
                if (parcel.readInt() != 0) {
                    num5 = Integer.valueOf(parcel.readInt());
                }
                return new FanClubInfoDictImpl(fanClubFanConsiderationPageFeatureEligibilityResponse, valueOf9, valueOf11, valueOf12, valueOf13, valueOf10, num5, readString21, readString22, readString23);
            case 91:
                C14360o3.A0B(parcel, 0);
                boolean z38 = true;
                boolean z39 = false;
                if (parcel.readInt() != 0) {
                    z39 = true;
                }
                if (parcel.readInt() == 0) {
                    z38 = false;
                }
                if (parcel.readInt() == 0) {
                    valueOf14 = null;
                } else {
                    valueOf14 = Long.valueOf(parcel.readLong());
                }
                return new FanClubStatusSyncInfoImpl(valueOf14, z39, z38);
            case 92:
                C14360o3.A0B(parcel, 0);
                return FanClubStoriesTeaserType.values()[parcel.readInt()];
            case 93:
                C14360o3.A0B(parcel, 0);
                return FeedItemType.values()[parcel.readInt()];
            case 94:
                C14360o3.A0B(parcel, 0);
                return GalleryMediaFolderEnum.values()[parcel.readInt()];
            case 95:
                C14360o3.A0B(parcel, 0);
                boolean z40 = false;
                if (parcel.readInt() != 0) {
                    z40 = true;
                }
                return new GrowthFrictionInfoImpl((GrowthFrictionInterventionCategories) parcel.readParcelable(GrowthFrictionInfoImpl.class.getClassLoader()), z40);
            case 96:
                C14360o3.A0B(parcel, 0);
                return new GrowthFrictionInterventionCategoriesImpl((GrowthFrictionInterventionDetail) parcel.readParcelable(GrowthFrictionInterventionCategoriesImpl.class.getClassLoader()), (GrowthFrictionInterventionDetail) parcel.readParcelable(GrowthFrictionInterventionCategoriesImpl.class.getClassLoader()), (GrowthFrictionInterventionDetail) parcel.readParcelable(GrowthFrictionInterventionCategoriesImpl.class.getClassLoader()));
            case 97:
                C14360o3.A0B(parcel, 0);
                String readString24 = parcel.readString();
                String readString25 = parcel.readString();
                String readString26 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList4 = null;
                } else {
                    int readInt17 = parcel.readInt();
                    arrayList4 = new ArrayList(readInt17);
                    for (int i21 = 0; i21 != readInt17; i21++) {
                        arrayList4.add(parcel.readParcelable(HallpassDetailsDictImpl.class.getClassLoader()));
                    }
                }
                return new HallpassDetailsDictImpl(readString24, readString25, readString26, arrayList4);
            case 98:
                C14360o3.A0B(parcel, 0);
                return HasOnboardedCreatorMonetizationProduct.values()[parcel.readInt()];
            default:
                C14360o3.A0B(parcel, 0);
                return HasPasswordState.values()[parcel.readInt()];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new ParcelableSnapshotMutableFloatState[i];
            case 1:
                return new ParcelableSnapshotMutableIntState[i];
            case 2:
                return new ParcelableSnapshotMutableLongState[i];
            case 3:
                return new LinearLayoutManager.SavedState[i];
            case 4:
                return new StaticMapView$StaticMapOptions[i];
            case 5:
                return new ARCapabilityMinVersionModeling[i];
            case 6:
                return new ARRequestAsset[i];
            case 7:
                return new SparkVisionCapability[i];
            case 8:
                return new ColorFilter[i];
            case 9:
                return new FilterChain[i];
            case 10:
                return new FilterGroup[i];
            case 11:
                return new GradientTransformFilter[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new SplitScreenFilter[i];
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new GainmapFilter[i];
            case 14:
                return new TransformMatrixParams[i];
            case Process.SIGTERM /* 15 */:
                return new CameraConfig[i];
            case 16:
                return new DeviceConfig[i];
            case 17:
                return new CallerContext[i];
            case 18:
                return new ContextChain[i];
            case Process.SIGSTOP /* 19 */:
                return new Country[i];
            case 20:
                return new Matrix4[i];
            case 21:
                return new PushInfraMetaData[i];
            case 22:
                return new SubscribeTopic[i];
            case 23:
                return new AudioFocusLossSettings[i];
            case 24:
                return new HeroScrollSetting[i];
            case 25:
                return new HttpTransferRequestedEvent[i];
            case 26:
                return new SubtitleConfiguration[i];
            case 27:
                return new Capabilities[i];
            case 28:
                return new Metadata[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new ColorInfo[i];
            case 30:
                return new Status[i];
            case 31:
                return new RootTelemetryConfiguration[i];
            case 32:
                return new zzk[i];
            case 33:
                return new ConnectionTelemetryConfiguration[i];
            case 34:
                return new GetServiceRequest[i];
            case 35:
                return new ConnectionResult[i];
            case 36:
                return new Feature[i];
            case 37:
                return new AccountFamily[i];
            case 38:
                return new PPRLoggingData[i];
            case 39:
                return new ACRType[i];
            case 40:
                return new AFI_TYPE[i];
            case Seq.NULL_REFNUM /* 41 */:
                return new ActionButtonPartnerType[i];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new AdFormatType[i];
            case 43:
                return new AdMetadataType[i];
            case 44:
                return new AppstoreMetadataDictImpl[i];
            case 45:
                return new AttributionUserImpl[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new AudienceGroup[i];
            case 47:
                return new AudioFilterType[i];
            case 48:
                return new AudioMetadataLabels[i];
            case 49:
                return new AudioMutingInfo[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return new AvatarCoinFlipBackgroundOptionResponse[i];
            case 51:
                return new AvatarStatusImpl[i];
            case 52:
                return new BirthdayVisibilityForViewer[i];
            case 53:
                return new BizUserInboxState[i];
            case 54:
                return new BrandSafetyContentBlocklistBitmapQLObjImpl[i];
            case 55:
                return new BrandedContentAdsPaidPartnershipLabelRemovalOption[i];
            case 56:
                return new BrandedContentGatingInfo[i];
            case 57:
                return new CameraTool[i];
            case 58:
                return new CanUseCreatorMonetizationProduct[i];
            case 59:
                return new CarouselRenderingType[i];
            case 60:
                return new CheckoutStyle[i];
            case 61:
                return new ClientDisplayMethod[i];
            case 62:
                return new ClipsCameraCommandAction[i];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new ClipsCreationEntryPoint[i];
            case 64:
                return new ClipsIFUType[i];
            case 65:
                return new ClipsMashupFollowButtonInfoImpl[i];
            case 66:
                return new ClipsMashupType[i];
            case 67:
                return new ClipsSpecialResponseType[i];
            case 68:
                return new ClipsTextAlignment[i];
            case 69:
                return new ClipsTextEmphasisMode[i];
            case 70:
                return new ClipsTextFormatType[i];
            case 71:
                return new CollabFollowButtonInfoImpl[i];
            case 72:
                return new CollectionMediaRole[i];
            case 73:
                return new CommentAudienceControlType[i];
            case 74:
                return new CommentGiphyMediaInfo[i];
            case 75:
                return new CommentRestrictStatus[i];
            case 76:
                return new CommerceReviewStatisticsDict[i];
            case 77:
                return new ConfirmationStyle[i];
            case 78:
                return new ConfirmationTitleStyle[i];
            case 79:
                return new ContextualHighlightType[i];
            case 80:
                return new CornerStyle[i];
            case 81:
                return new CreateModeType[i];
            case 82:
                return new CreationToolEnum[i];
            case 83:
                return new CreatorSegmentation[i];
            case 84:
                return new DemarcatorStyleEnum[i];
            case 85:
                return new DirectAudioFallbackUrlImpl[i];
            case 86:
                return new DirectMediaFallbackUrl[i];
            case 87:
                return new DynamicProductAdDisplayOption[i];
            case 88:
                return new FBBioLinkSocialContextType[i];
            case 89:
                return new FanClubFanConsiderationPageFeatureEligibilityResponseImpl[i];
            case 90:
                return new FanClubInfoDictImpl[i];
            case 91:
                return new FanClubStatusSyncInfoImpl[i];
            case 92:
                return new FanClubStoriesTeaserType[i];
            case 93:
                return new FeedItemType[i];
            case 94:
                return new GalleryMediaFolderEnum[i];
            case 95:
                return new GrowthFrictionInfoImpl[i];
            case 96:
                return new GrowthFrictionInterventionCategoriesImpl[i];
            case 97:
                return new HallpassDetailsDictImpl[i];
            case 98:
                return new HasOnboardedCreatorMonetizationProduct[i];
            default:
                return new HasPasswordState[i];
        }
    }

    public static void A00(Parcel parcel, GetServiceRequest getServiceRequest, int i) {
        int A00 = AbstractC128825rw.A00(parcel);
        AbstractC128825rw.A05(parcel, getServiceRequest.A08);
        AbstractC128825rw.A07(parcel, 2, getServiceRequest.A09);
        AbstractC128825rw.A07(parcel, 3, getServiceRequest.A0A);
        AbstractC128825rw.A0C(parcel, getServiceRequest.A03, 4, false);
        AbstractC128825rw.A03(getServiceRequest.A02, parcel, 5);
        AbstractC128825rw.A0G(parcel, getServiceRequest.A07, 6, i);
        AbstractC128825rw.A02(getServiceRequest.A01, parcel, 7);
        AbstractC128825rw.A0A(parcel, getServiceRequest.A00, 8, i, false);
        AbstractC128825rw.A0G(parcel, getServiceRequest.A05, 10, i);
        AbstractC128825rw.A0G(parcel, getServiceRequest.A06, 11, i);
        AbstractC128825rw.A09(parcel, 12, getServiceRequest.A0D);
        AbstractC128825rw.A07(parcel, 13, getServiceRequest.A0B);
        AbstractC128825rw.A09(parcel, 14, getServiceRequest.A04);
        AbstractC128825rw.A0C(parcel, getServiceRequest.A0C, 15, false);
        AbstractC128825rw.A06(parcel, A00);
    }
}
