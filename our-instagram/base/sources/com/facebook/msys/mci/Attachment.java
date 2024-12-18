package com.facebook.msys.mci;

import X.C53882dS;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes.dex */
public class Attachment {
    public final NativeHolder mNativeHolder;

    private native boolean equalsNative(long j, Object obj, long j2);

    private native String getActionUrlNative(long j);

    private native String getAttachmentFbidNative(long j);

    private native Long getAttachmentIndexNative(long j);

    private native Long getAttachmentTypeNative(long j);

    private native String getAvatarAudioMessageAnimatedIdleAUrlNative(long j);

    private native String getAvatarAudioMessageAnimatedIdleBUrlNative(long j);

    private native String getAvatarAudioMessageAnimatedPoseAUrlNative(long j);

    private native String getAvatarAudioMessageAnimatedPoseBUrlNative(long j);

    private native String getAvatarAudioMessageBackgroundGraphicsImageUrlNative(long j);

    private native Integer getAvatarPoseTypeIDNative(long j);

    private native String getCta1IdNative(long j);

    private native String getCta1TitleNative(long j);

    private native String getCta2IdNative(long j);

    private native String getCta2TitleNative(long j);

    private native String getCta3IdNative(long j);

    private native String getCta3TitleNative(long j);

    private native String getDescriptionTextNative(long j);

    private native Long getEphemeralMediaViewModeNative(long j);

    private native String getFileNameNative(long j);

    private native String getFilePathNative(long j);

    private native Long getFileSizeNative(long j);

    private native boolean getHasMediaNative(long j);

    private native boolean getHasXmaNative(long j);

    private native String getLocalAssetIdentifierNative(long j);

    private native String getMiniPreviewNative(long j);

    private native String getOfflineAttachmentIdNative(long j);

    private native String getOriginalFileHashNative(long j);

    private native Long getPlayableDurationMsNative(long j);

    private native String getPlayableUrlMimeTypeNative(long j);

    private native String getPlayableUrlNative(long j);

    private native Long getPreviewHeightNative(long j);

    private native String getPreviewUrlMimeTypeNative(long j);

    private native String getPreviewUrlNative(long j);

    private native Long getPreviewWidthNative(long j);

    private native Integer getSamplingFrequencyHzNative(long j);

    private native boolean getShouldAutoplayVideoNative(long j);

    private native String getSoundBiteClientSoundKeyNative(long j);

    private native String getSoundBiteVisualNative(long j);

    private native String getSourceTextNative(long j);

    private native String getSubtitleTextNative(long j);

    private native String getTitleTextNative(long j);

    private native byte[] getUploadDataNative(long j);

    private native String getWaveformDataNative(long j);

    private native Long getXmaLayoutTypeNative(long j);

    private native Long getXmasTemplateTypeNative(long j);

    private native int hashCodeNative(long j);

    public static native NativeHolder initNativeHolder(String str, String str2, Long l, String str3, Long l2, String str4, Long l3, boolean z, boolean z2, String str5, String str6, Long l4, String str7, String str8, String str9, Long l5, Long l6, Long l7, Long l8, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, byte[] bArr, String str21, String str22, String str23, String str24, String str25, Integer num, Long l9, Integer num2, boolean z3, String str26, String str27, String str28, String str29, String str30);

    private native String toStringNative(long j);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof Attachment)) {
            return equalsNative(this.mNativeHolder.mNativePointer, obj, ((Attachment) obj).mNativeHolder.mNativePointer);
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

    public Attachment(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
