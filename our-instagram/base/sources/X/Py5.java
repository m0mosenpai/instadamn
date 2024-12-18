package X;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.Py5;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.os.IResultReceiver;
import android.view.View;
import androidx.appcompat.widget.ActionMenuPresenter$SavedState;
import androidx.appcompat.widget.AppCompatSpinner$SavedState;
import androidx.compose.foundation.lazy.layout.DefaultLazyKey;
import androidx.compose.runtime.ParcelableSnapshotMutableDoubleState;
import androidx.core.widget.NestedScrollView;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Metadata;
import androidx.media3.common.StreamKey;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4OrientationData;
import androidx.media3.container.Mp4TimestampData;
import androidx.media3.container.XmpData;
import androidx.media3.exoplayer.offline.DownloadRequest;
import androidx.media3.exoplayer.scheduler.Requirements;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTable;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.flac.VorbisComment;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.media3.extractor.metadata.icy.IcyInfo;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.BinaryFrame;
import androidx.media3.extractor.metadata.id3.ChapterFrame;
import androidx.media3.extractor.metadata.id3.ChapterTocFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.GeobFrame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import androidx.media3.extractor.metadata.id3.PrivFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import androidx.media3.extractor.metadata.id3.UrlLinkFrame;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import androidx.media3.extractor.metadata.mp4.SlowMotionData;
import androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry;
import androidx.media3.extractor.metadata.scte35.PrivateCommand;
import androidx.media3.extractor.metadata.scte35.SpliceInsertCommand;
import androidx.media3.extractor.metadata.scte35.SpliceNullCommand;
import androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand;
import androidx.media3.extractor.metadata.scte35.TimeSignalCommand;
import androidx.navigation.NavBackStackEntryState;
import androidx.paging.compose.PagingPlaceholderKey;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SeekBarPreference;
import androidx.preference.TwoStatePreference;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.test.internal.util.ParcelableIBinder;
import androidx.versionedparcelable.ParcelImpl;
import androidx.work.multiprocess.parcelable.ParcelableConstraints;
import androidx.work.multiprocess.parcelable.ParcelableData;
import androidx.work.multiprocess.parcelable.ParcelableForegroundRequestInfo;
import androidx.work.multiprocess.parcelable.ParcelableInterruptRequest;
import androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest;
import androidx.work.multiprocess.parcelable.ParcelableResult;
import androidx.work.multiprocess.parcelable.ParcelableRuntimeExtras;
import androidx.work.multiprocess.parcelable.ParcelableUpdateRequest;
import androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl;
import androidx.work.multiprocess.parcelable.ParcelableWorkInfo;
import androidx.work.multiprocess.parcelable.ParcelableWorkInfos;
import androidx.work.multiprocess.parcelable.ParcelableWorkQuery;
import androidx.work.multiprocess.parcelable.ParcelableWorkRequest;
import androidx.work.multiprocess.parcelable.ParcelableWorkRequests;
import androidx.work.multiprocess.parcelable.ParcelableWorkerParameters;
import com.airbnb.lottie.LottieAnimationView$SavedState;
import com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager;
import com.encryptedbackups.storagemanagers.otc.model.OneTimeCodeDevice;
import com.facebook.AccessToken;
import com.facebook.advancedcryptotransport.model.PeerDevice;
import com.facebook.advancedcryptotransport.model.SecurityAlert;
import com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCall;
import com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCallResult;
import com.facebook.android.instantexperiences.autofill.model.AddressAutofillData;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.facebook.android.instantexperiences.autofill.model.EmailAutofillData;
import com.facebook.android.instantexperiences.autofill.model.NameAutofillData;
import com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData;
import com.facebook.android.instantexperiences.autofill.save.SaveAutofillDataJSBridgeCall;
import com.facebook.android.instantexperiences.core.IGInstantExperiencesFeatureEnabledList;
import com.facebook.android.instantexperiences.jscall.InstantExperienceGenericErrorResult;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesCallResult;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.facebook.android.instantexperiences.payment.CanMakePaymentJSBridgeCall;
import com.facebook.android.instantexperiences.payment.CanMakePaymentJSBridgeCallResult;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONException;

/* loaded from: classes10.dex */
public final class Py5 implements Parcelable.Creator {
    public final int A00;

    public Py5(int i) {
        this.A00 = i;
    }

    public static Py5 A00(int i) {
        return new Py5(i);
    }

    /* JADX WARN: Type inference failed for: r10v16, types: [android.view.View$BaseSavedState, com.airbnb.lottie.LottieAnimationView$SavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v23, types: [java.lang.Object, androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl] */
    /* JADX WARN: Type inference failed for: r10v35, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v36, types: [androidx.preference.TwoStatePreference$SavedState, androidx.preference.Preference$BaseSavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v37, types: [androidx.preference.SeekBarPreference$SavedState, androidx.preference.Preference$BaseSavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v38, types: [androidx.preference.PreferenceGroup$SavedState, androidx.preference.Preference$BaseSavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v40, types: [androidx.preference.Preference$BaseSavedState, java.lang.Object, androidx.preference.MultiSelectListPreference$SavedState] */
    /* JADX WARN: Type inference failed for: r10v41, types: [androidx.preference.Preference$BaseSavedState, java.lang.Object, androidx.preference.ListPreference$SavedState] */
    /* JADX WARN: Type inference failed for: r10v42, types: [androidx.preference.EditTextPreference$SavedState, androidx.preference.Preference$BaseSavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v83, types: [android.view.View$BaseSavedState, androidx.core.widget.NestedScrollView$SavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v84, types: [X.3Yi, androidx.compose.runtime.ParcelableSnapshotMutableDoubleState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v86, types: [android.view.View$BaseSavedState, androidx.appcompat.widget.AppCompatSpinner$SavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v87, types: [java.lang.Object, androidx.appcompat.widget.ActionMenuPresenter$SavedState] */
    /* JADX WARN: Type inference failed for: r10v88, types: [java.lang.Object, android.support.v4.os.ResultReceiver] */
    /* JADX WARN: Type inference failed for: r10v91, types: [android.support.v4.media.session.ParcelableVolumeInfo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v93, types: [android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v98, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.Q66, X.3Yq] */
    /* JADX WARN: Type inference failed for: r2v12, types: [X.Q66, X.3Yq] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, android.support.v4.os.IResultReceiver$Stub$Proxy] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(final Parcel parcel) {
        String str;
        IResultReceiver iResultReceiver;
        android.net.Uri uri;
        switch (this.A00) {
            case 0:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator CREATOR = Py5.A00(0);
                    public final int A00;
                    public final MediaDescriptionCompat A01;

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        StringBuilder A0s = AbstractC58318PtA.A0s("MediaItem{");
                        A0s.append("mFlags=");
                        A0s.append(this.A00);
                        A0s.append(", mDescription=");
                        return AbstractC58320PtC.A11(this.A01, A0s);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeInt(this.A00);
                        this.A01.writeToParcel(parcel2, i);
                    }

                    {
                        this.A00 = parcel.readInt();
                        this.A01 = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }
                };
            case 1:
                Object createFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                Bundle bundle = null;
                if (createFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) createFromParcel;
                String mediaId = mediaDescription.getMediaId();
                CharSequence title = mediaDescription.getTitle();
                CharSequence subtitle = mediaDescription.getSubtitle();
                CharSequence description = mediaDescription.getDescription();
                Bitmap iconBitmap = mediaDescription.getIconBitmap();
                android.net.Uri iconUri = mediaDescription.getIconUri();
                Bundle extras = mediaDescription.getExtras();
                if (extras != null) {
                    extras.setClassLoader(AbstractC61268Rke.class.getClassLoader());
                    try {
                        extras.isEmpty();
                    } catch (BadParcelableException unused) {
                        android.util.Log.e("MediaSessionCompat", "Could not unparcel the data.");
                        extras = null;
                    }
                }
                if (extras != null) {
                    uri = (android.net.Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
                    if (uri != null) {
                        if (!extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || extras.size() != 2) {
                            extras.remove("android.support.v4.media.description.MEDIA_URI");
                            extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                        }
                        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(iconBitmap, iconUri, uri, bundle, title, subtitle, description, mediaId);
                        mediaDescriptionCompat.A00 = mediaDescription;
                        return mediaDescriptionCompat;
                    }
                } else {
                    uri = null;
                }
                bundle = extras;
                if (uri == null) {
                    uri = mediaDescription.getMediaUri();
                }
                MediaDescriptionCompat mediaDescriptionCompat2 = new MediaDescriptionCompat(iconBitmap, iconUri, uri, bundle, title, subtitle, description, mediaId);
                mediaDescriptionCompat2.A00 = mediaDescription;
                return mediaDescriptionCompat2;
            case 2:
                return new MediaMetadataCompat(parcel);
            case 3:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 4:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator CREATOR = Py5.A00(4);
                    public final long A00;
                    public final MediaDescriptionCompat A01;

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        this.A01.writeToParcel(parcel2, i);
                        parcel2.writeLong(this.A00);
                    }

                    {
                        this.A01 = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.A00 = parcel.readLong();
                    }

                    public final String toString() {
                        StringBuilder A1C = AbstractC166987dD.A1C();
                        A1C.append("MediaSession.QueueItem {Description=");
                        A1C.append(this.A01);
                        A1C.append(", Id=");
                        A1C.append(this.A00);
                        return AbstractC166997dE.A0x(" }", A1C);
                    }
                };
            case 5:
                ?? obj = new Object();
                obj.A00 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return obj;
            case 6:
                final Parcelable readParcelable = parcel.readParcelable(null);
                return new Parcelable(readParcelable) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator CREATOR = Py5.A00(6);
                    public final Object A00;

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if (obj2 instanceof MediaSessionCompat$Token) {
                            Object obj3 = this.A00;
                            Object obj4 = ((MediaSessionCompat$Token) obj2).A00;
                            if (obj3 == null) {
                                return obj4 == null;
                            }
                            if (obj4 != null) {
                                return obj3.equals(obj4);
                            }
                        }
                        return false;
                    }

                    public final int hashCode() {
                        return AbstractC167017dG.A0M(this.A00);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeParcelable((Parcelable) this.A00, i);
                    }

                    {
                        this.A00 = readParcelable;
                    }
                };
            case 7:
                ?? obj2 = new Object();
                obj2.A04 = parcel.readInt();
                obj2.A01 = parcel.readInt();
                obj2.A03 = parcel.readInt();
                obj2.A02 = parcel.readInt();
                obj2.A00 = parcel.readInt();
                return obj2;
            case 8:
                return new PlaybackStateCompat(parcel);
            case 9:
                return new PlaybackStateCompat.CustomAction(parcel);
            case 10:
                ?? obj3 = new Object();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    iResultReceiver = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(IResultReceiver.A00);
                    if (queryLocalInterface != null && (queryLocalInterface instanceof IResultReceiver)) {
                        iResultReceiver = (IResultReceiver) queryLocalInterface;
                    } else {
                        ?? obj4 = new Object();
                        int A03 = C0f9.A03(-719786202);
                        obj4.A00 = readStrongBinder;
                        C0f9.A0A(-735258490, A03);
                        iResultReceiver = obj4;
                    }
                }
                obj3.A00 = iResultReceiver;
                return obj3;
            case 11:
                ?? obj5 = new Object();
                obj5.A00 = parcel.readInt();
                return obj5;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.A00 = AbstractC37304Gc5.A1X(parcel);
                return baseSavedState;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new DefaultLazyKey(parcel.readInt());
            case 14:
                double readDouble = parcel.readDouble();
                ?? abstractC74923Yi = new AbstractC74923Yi();
                ?? abstractC75003Yq = new AbstractC75003Yq();
                abstractC75003Yq.A00 = readDouble;
                if (C3Z5.A07()) {
                    ?? abstractC75003Yq2 = new AbstractC75003Yq();
                    abstractC75003Yq2.A00 = readDouble;
                    abstractC75003Yq2.A00 = 1;
                    abstractC75003Yq.A01 = abstractC75003Yq2;
                }
                abstractC74923Yi.A00 = abstractC75003Yq;
                return abstractC74923Yi;
            case Process.SIGTERM /* 15 */:
                ?? baseSavedState2 = new View.BaseSavedState(parcel);
                baseSavedState2.A00 = parcel.readInt();
                return baseSavedState2;
            case 16:
                return new DrmInitData(parcel);
            case 17:
                return new DrmInitData.SchemeData(parcel);
            case 18:
                return new Metadata(parcel);
            case Process.SIGSTOP /* 19 */:
                return new StreamKey(parcel);
            case 20:
                return new MdtaMetadataEntry(parcel);
            case 21:
                return new Mp4LocationData(parcel);
            case 22:
                return new Mp4OrientationData(parcel);
            case 23:
                return new Mp4TimestampData(parcel);
            case 24:
                return new XmpData(parcel);
            case 25:
                return new DownloadRequest(parcel);
            case 26:
                return new Requirements(parcel.readInt());
            case 27:
                String readString = parcel.readString();
                readString.getClass();
                return new AppInfoTable(parcel.readInt(), readString);
            case 28:
                return new EventMessage(parcel);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new PictureFrame(parcel);
            case 30:
                return new VorbisComment(parcel);
            case 31:
                return new IcyHeaders(parcel);
            case 32:
                return new IcyInfo(parcel);
            case 33:
                return new ApicFrame(parcel);
            case 34:
                return new BinaryFrame(parcel);
            case 35:
                return new ChapterFrame(parcel);
            case 36:
                return new ChapterTocFrame(parcel);
            case 37:
                return new CommentFrame(parcel);
            case 38:
                return new GeobFrame(parcel);
            case 39:
                return new InternalFrame(parcel);
            case 40:
                return new MlltFrame(parcel);
            case Seq.NULL_REFNUM /* 41 */:
                return new PrivFrame(parcel);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                String readString2 = parcel.readString();
                readString2.getClass();
                String readString3 = parcel.readString();
                String[] createStringArray = parcel.createStringArray();
                createStringArray.getClass();
                return new TextInformationFrame(readString2, readString3, ImmutableList.copyOf(createStringArray));
            case 43:
                return new UrlLinkFrame(parcel);
            case 44:
                return new MotionPhotoMetadata(parcel);
            case 45:
                ArrayList A1E = AbstractC166987dD.A1E();
                parcel.readList(A1E, SlowMotionData.Segment.class.getClassLoader());
                return new SlowMotionData(A1E);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new SlowMotionData.Segment(parcel.readLong(), parcel.readLong(), parcel.readInt());
            case 47:
                return new SmtaMetadataEntry(parcel);
            case 48:
                return new PrivateCommand(parcel);
            case 49:
                return new SpliceInsertCommand(parcel);
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return new Object();
            case 51:
                return new SpliceScheduleCommand(parcel);
            case 52:
                return new TimeSignalCommand(parcel.readLong(), parcel.readLong());
            case 53:
                return new VorbisComment(parcel);
            case 54:
                C14360o3.A0B(parcel, 0);
                return new NavBackStackEntryState(parcel);
            case 55:
                return new PagingPlaceholderKey(AbstractC37304Gc5.A00(parcel));
            case 56:
                ?? baseSavedState3 = new Preference.BaseSavedState(parcel);
                baseSavedState3.A00 = parcel.readString();
                return baseSavedState3;
            case 57:
                ?? baseSavedState4 = new Preference.BaseSavedState(parcel);
                baseSavedState4.A00 = parcel.readString();
                return baseSavedState4;
            case 58:
                ?? baseSavedState5 = new Preference.BaseSavedState(parcel);
                int readInt = parcel.readInt();
                baseSavedState5.A00 = AbstractC166987dD.A1H();
                String[] strArr = new String[readInt];
                parcel.readStringArray(strArr);
                Collections.addAll(baseSavedState5.A00, strArr);
                return baseSavedState5;
            case 59:
                return new Preference.BaseSavedState(parcel);
            case 60:
                ?? baseSavedState6 = new Preference.BaseSavedState(parcel);
                baseSavedState6.A00 = parcel.readInt();
                return baseSavedState6;
            case 61:
                ?? baseSavedState7 = new Preference.BaseSavedState(parcel);
                baseSavedState7.A02 = parcel.readInt();
                baseSavedState7.A01 = parcel.readInt();
                baseSavedState7.A00 = parcel.readInt();
                return baseSavedState7;
            case 62:
                ?? baseSavedState8 = new Preference.BaseSavedState(parcel);
                baseSavedState8.A00 = AbstractC58320PtC.A1T(parcel);
                return baseSavedState8;
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                ?? obj6 = new Object();
                obj6.A01 = parcel.readInt();
                obj6.A00 = parcel.readInt();
                obj6.A02 = AbstractC58320PtC.A1T(parcel);
                int readInt2 = parcel.readInt();
                if (readInt2 <= 0) {
                    return obj6;
                }
                int[] iArr = new int[readInt2];
                obj6.A03 = iArr;
                parcel.readIntArray(iArr);
                return obj6;
            case 64:
                ?? obj7 = new Object();
                obj7.A00 = parcel.readInt();
                obj7.A03 = parcel.readInt();
                int readInt3 = parcel.readInt();
                obj7.A02 = readInt3;
                if (readInt3 > 0) {
                    int[] iArr2 = new int[readInt3];
                    obj7.A09 = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt4 = parcel.readInt();
                obj7.A01 = readInt4;
                if (readInt4 > 0) {
                    int[] iArr3 = new int[readInt4];
                    obj7.A08 = iArr3;
                    parcel.readIntArray(iArr3);
                }
                obj7.A07 = AbstractC167007dF.A1P(parcel.readInt(), 1);
                obj7.A05 = AbstractC58320PtC.A1U(parcel);
                obj7.A06 = AbstractC58320PtC.A1V(parcel);
                obj7.A04 = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
                return obj7;
            case 65:
                return new SwipeRefreshLayout.SavedState(parcel);
            case 66:
                return new ParcelableIBinder(parcel);
            case 67:
                return new ParcelImpl(parcel);
            case 68:
                return new ParcelableConstraints(parcel);
            case 69:
                return new ParcelableData(parcel);
            case 70:
                return new ParcelableForegroundRequestInfo(parcel);
            case 71:
                String A0d = AbstractC37304Gc5.A0d(parcel);
                C14360o3.A0A(A0d);
                return new ParcelableInterruptRequest(A0d, parcel.readInt());
            case 72:
                return new ParcelableRemoteWorkRequest(parcel);
            case 73:
                return new ParcelableResult(parcel);
            case 74:
                return new ParcelableRuntimeExtras(parcel);
            case 75:
                return new ParcelableUpdateRequest(parcel);
            case 76:
                ?? obj8 = new Object();
                ArrayList arrayList = null;
                if (AbstractC58320PtC.A1T(parcel)) {
                    str = parcel.readString();
                } else {
                    str = null;
                }
                Integer num = ParcelableWorkContinuationImpl.A01[parcel.readInt()];
                int readInt5 = parcel.readInt();
                ArrayList A17 = AbstractC25225BEi.A17(readInt5);
                ClassLoader A0g = AbstractC58319PtB.A0g(obj8);
                for (int i = 0; i < readInt5; i++) {
                    A17.add(((ParcelableWorkRequest) parcel.readParcelable(A0g)).A00);
                }
                if (parcel.readInt() == 1) {
                    int readInt6 = parcel.readInt();
                    arrayList = AbstractC25225BEi.A17(readInt6);
                    for (int i2 = 0; i2 < readInt6; i2++) {
                        arrayList.add(((ParcelableWorkContinuationImpl) parcel.readParcelable(A0g)).A00);
                    }
                }
                obj8.A00 = new C62895SWb(num, str, A17, arrayList);
                return obj8;
            case 77:
                return new ParcelableWorkInfo(parcel);
            case 78:
                return new ParcelableWorkInfos(parcel);
            case 79:
                return new ParcelableWorkQuery(parcel);
            case 80:
                return new ParcelableWorkRequest(parcel);
            case 81:
                return new ParcelableWorkRequests(parcel);
            case 82:
                return new ParcelableWorkerParameters(parcel);
            case 83:
                ?? baseSavedState9 = new View.BaseSavedState(parcel);
                baseSavedState9.A04 = parcel.readString();
                baseSavedState9.A00 = parcel.readFloat();
                baseSavedState9.A06 = AbstractC58320PtC.A1T(parcel);
                baseSavedState9.A05 = parcel.readString();
                baseSavedState9.A03 = parcel.readInt();
                baseSavedState9.A02 = parcel.readInt();
                return baseSavedState9;
            case 84:
                C14360o3.A0B(parcel, 0);
                return new StickyHeadersLinearLayoutManager.SavedState(parcel);
            case 85:
                return new OneTimeCodeDevice(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 86:
                return new AccessToken(parcel);
            case 87:
                return new PeerDevice(parcel);
            case 88:
                return new SecurityAlert(parcel);
            case 89:
                C14360o3.A0B(parcel, 0);
                return new InstantExperiencesJSBridgeCall(parcel);
            case 90:
                C14360o3.A0B(parcel, 0);
                return new InstantExperiencesCallResult(parcel);
            case 91:
                C14360o3.A0B(parcel, 0);
                return new BrowserExtensionsAutofillData(parcel);
            case 92:
                C14360o3.A0B(parcel, 0);
                return new BrowserExtensionsAutofillData(parcel);
            case 93:
                C14360o3.A0B(parcel, 0);
                return new BrowserExtensionsAutofillData(parcel);
            case 94:
                C14360o3.A0B(parcel, 0);
                return new TelephoneAutofillData(parcel);
            case 95:
                C14360o3.A0B(parcel, 0);
                return new InstantExperiencesJSBridgeCall(parcel);
            case 96:
                try {
                    return new Object();
                } catch (JSONException e) {
                    C0K8.A0F("IGInstantExperiencesFeatureEnabledList", "Failed to create feature enabled list", e);
                    return null;
                }
            case 97:
                return new InstantExperiencesCallResult(parcel);
            case 98:
                return new InstantExperiencesJSBridgeCall(parcel);
            default:
                return new InstantExperiencesCallResult(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new MediaBrowserCompat$MediaItem[i];
            case 1:
                return new MediaDescriptionCompat[i];
            case 2:
                return new MediaMetadataCompat[i];
            case 3:
                return new RatingCompat[i];
            case 4:
                return new MediaSessionCompat$QueueItem[i];
            case 5:
                return new MediaSessionCompat$ResultReceiverWrapper[i];
            case 6:
                return new MediaSessionCompat$Token[i];
            case 7:
                return new ParcelableVolumeInfo[i];
            case 8:
                return new PlaybackStateCompat[i];
            case 9:
                return new PlaybackStateCompat.CustomAction[i];
            case 10:
                return new android.support.v4.os.ResultReceiver[i];
            case 11:
                return new ActionMenuPresenter$SavedState[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new AppCompatSpinner$SavedState[i];
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new DefaultLazyKey[i];
            case 14:
                return new ParcelableSnapshotMutableDoubleState[i];
            case Process.SIGTERM /* 15 */:
                return new NestedScrollView.SavedState[i];
            case 16:
                return new DrmInitData[i];
            case 17:
                return new DrmInitData.SchemeData[i];
            case 18:
                return new Metadata[i];
            case Process.SIGSTOP /* 19 */:
                return new StreamKey[i];
            case 20:
                return new MdtaMetadataEntry[i];
            case 21:
                return new Mp4LocationData[i];
            case 22:
                return new Mp4OrientationData[i];
            case 23:
                return new Mp4TimestampData[i];
            case 24:
                return new XmpData[i];
            case 25:
                return new DownloadRequest[i];
            case 26:
                return new Requirements[i];
            case 27:
                return new AppInfoTable[i];
            case 28:
                return new EventMessage[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new PictureFrame[i];
            case 30:
                return new VorbisComment[i];
            case 31:
                return new IcyHeaders[i];
            case 32:
                return new IcyInfo[i];
            case 33:
                return new ApicFrame[i];
            case 34:
                return new BinaryFrame[i];
            case 35:
                return new ChapterFrame[i];
            case 36:
                return new ChapterTocFrame[i];
            case 37:
                return new CommentFrame[i];
            case 38:
                return new GeobFrame[i];
            case 39:
                return new InternalFrame[i];
            case 40:
                return new MlltFrame[i];
            case Seq.NULL_REFNUM /* 41 */:
                return new PrivFrame[i];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new TextInformationFrame[i];
            case 43:
                return new UrlLinkFrame[i];
            case 44:
                return new MotionPhotoMetadata[i];
            case 45:
                return new SlowMotionData[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new SlowMotionData.Segment[i];
            case 47:
                return new SmtaMetadataEntry[i];
            case 48:
                return new PrivateCommand[i];
            case 49:
                return new SpliceInsertCommand[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return new SpliceNullCommand[i];
            case 51:
                return new SpliceScheduleCommand[i];
            case 52:
                return new TimeSignalCommand[i];
            case 53:
                return new androidx.media3.extractor.metadata.vorbis.VorbisComment[i];
            case 54:
                return new NavBackStackEntryState[i];
            case 55:
                return new PagingPlaceholderKey[i];
            case 56:
                return new EditTextPreference.SavedState[i];
            case 57:
                return new ListPreference.SavedState[i];
            case 58:
                return new MultiSelectListPreference.SavedState[i];
            case 59:
                return new Preference.BaseSavedState[i];
            case 60:
                return new PreferenceGroup.SavedState[i];
            case 61:
                return new SeekBarPreference.SavedState[i];
            case 62:
                return new TwoStatePreference.SavedState[i];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[i];
            case 64:
                return new StaggeredGridLayoutManager.SavedState[i];
            case 65:
                return new SwipeRefreshLayout.SavedState[i];
            case 66:
                return new ParcelableIBinder[i];
            case 67:
                return new ParcelImpl[i];
            case 68:
                return new ParcelableConstraints[i];
            case 69:
                return new ParcelableData[i];
            case 70:
                return new ParcelableForegroundRequestInfo[i];
            case 71:
                return new ParcelableInterruptRequest[i];
            case 72:
                return new ParcelableRemoteWorkRequest[i];
            case 73:
                return new ParcelableResult[i];
            case 74:
                return new ParcelableRuntimeExtras[i];
            case 75:
                return new ParcelableUpdateRequest[i];
            case 76:
                return new ParcelableWorkContinuationImpl[i];
            case 77:
                return new ParcelableWorkInfo[i];
            case 78:
                return new ParcelableWorkInfos[i];
            case 79:
                return new ParcelableWorkQuery[i];
            case 80:
                return new ParcelableWorkRequest[i];
            case 81:
                return new ParcelableWorkRequests[i];
            case 82:
                return new ParcelableWorkerParameters[i];
            case 83:
                return new LottieAnimationView$SavedState[i];
            case 84:
                return new StickyHeadersLinearLayoutManager.SavedState[i];
            case 85:
                return new OneTimeCodeDevice[i];
            case 86:
                return new AccessToken[i];
            case 87:
                return new PeerDevice[i];
            case 88:
                return new SecurityAlert[i];
            case 89:
                return new RequestAutofillJSBridgeCall[i];
            case 90:
                return new RequestAutofillJSBridgeCallResult[i];
            case 91:
                return new AddressAutofillData[i];
            case 92:
                return new EmailAutofillData[i];
            case 93:
                return new NameAutofillData[i];
            case 94:
                return new TelephoneAutofillData[i];
            case 95:
                return new SaveAutofillDataJSBridgeCall[i];
            case 96:
                return new IGInstantExperiencesFeatureEnabledList[i];
            case 97:
                return new InstantExperienceGenericErrorResult[i];
            case 98:
                return new CanMakePaymentJSBridgeCall[i];
            default:
                return new CanMakePaymentJSBridgeCallResult[i];
        }
    }
}
