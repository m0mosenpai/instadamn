package com.facebook.msys.mci;

import X.C53882dS;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes.dex */
public class MediaSendContentInfo {
    public final NativeHolder mNativeHolder;

    private native boolean equalsNative(long j, Object obj, long j2);

    private native Long getAttachmentDurationMsNative(long j);

    private native Long getAttachmentSamplingFrequencyHzNative(long j);

    private native Long getAttachmentTypeNative(long j);

    private native String getAttachmentWaveformDataNative(long j);

    private native Long getAvatarAudioMessagePoseTypeIDNative(long j);

    private native String getCaptionTextNative(long j);

    private native String getDataclassParamsNative(long j);

    private native byte[] getEffectsNative(long j);

    private native Long getEphemeralMediaViewModeNative(long j);

    private native String getFileNameNative(long j);

    private native String getFilePathNative(long j);

    private native Long getFileSizeNative(long j);

    private native boolean getHasMediaEditsNative(long j);

    private native boolean getIsHDNative(long j);

    private native boolean getIsMutedNative(long j);

    private native boolean getIsSpatialMediaNative(long j);

    private native String getLocalAssetIdentifierNative(long j);

    private native Long getMessageSourceNative(long j);

    private native String getMetadataDataclassNative(long j);

    private native String getMimeTypeNative(long j);

    private native String getNavigationChainNative(long j);

    private native String getOfflineAttachmentIdNative(long j);

    private native String getOfflineThreadingIdNative(long j);

    private native String getOriginalFileHashNative(long j);

    private native String getOverlayImageFilePathNative(long j);

    private native Long getOverlayRotationInDegreesNative(long j);

    private native boolean getPerformActionAsPageNative(long j);

    private native Long getPowerUpStyleNative(long j);

    private native String getProductAttributionNative(long j);

    private native String getProductFBIDNative(long j);

    private native String getProductTypeNative(long j);

    private native String getRecipientIdNative(long j);

    private native String getReplySourceIdNative(long j);

    private native Long getReplySourceTypeNative(long j);

    private native Long getSenderFbIdNative(long j);

    private native boolean getShouldAutoplayVideoNative(long j);

    private native Double getTrimEndTimeInSecondsNative(long j);

    private native Double getTrimStartTimeInSecondsNative(long j);

    private native byte[] getUploadDataNative(long j);

    private native boolean getWasTranscodedNative(long j);

    private native int hashCodeNative(long j);

    public static native NativeHolder initNativeHolder(byte[] bArr, String str, Long l, String str2, String str3, String str4, String str5, Long l2, String str6, String str7, String str8, String str9, String str10, Long l3, Long l4, String str11, Long l5, Long l6, byte[] bArr2, boolean z, String str12, Long l7, boolean z2, Double d, Double d2, boolean z3, String str13, String str14, String str15, String str16, Long l8, Long l9, Long l10, boolean z4, String str17, boolean z5, boolean z6, String str18, Long l11, boolean z7);

    private native String toStringNative(long j);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof MediaSendContentInfo)) {
            return equalsNative(this.mNativeHolder.mNativePointer, obj, ((MediaSendContentInfo) obj).mNativeHolder.mNativePointer);
        }
        return false;
    }

    public int hashCode() {
        return hashCodeNative(this.mNativeHolder.mNativePointer);
    }

    public String toString() {
        return toStringNative(this.mNativeHolder.mNativePointer);
    }

    static {
        C53882dS.A00();
    }

    public MediaSendContentInfo(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
