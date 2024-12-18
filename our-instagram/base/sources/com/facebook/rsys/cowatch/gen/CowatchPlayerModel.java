package com.facebook.rsys.cowatch.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25236BEt;
import X.C2N9;
import X.JQ0;
import X.MSV;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class CowatchPlayerModel {
    public static C2N9 CONVERTER = YAN.A00(36);
    public static long sMcfTypeId;
    public final CowatchAdminMessageModel adminMessage;
    public final CowatchCaptionLocale captionSelectedLanguage;
    public final int contentAvailability;
    public final CowatchPlayerInternalModel internal;
    public final CowatchPlayerIosModel iosModel;
    public final boolean isStartedFromAutoplay;
    public final String mediaID;
    public final CowatchMediaInfoModel mediaInfo;
    public final int mediaPlaybackState;
    public final long mediaPositionMs;
    public final String mediaSource;
    public final CowatchSuggestedContentQueueModel suggestedContentQueue;

    public static native CowatchPlayerModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchPlayerModel)) {
                return false;
            }
            CowatchPlayerModel cowatchPlayerModel = (CowatchPlayerModel) obj;
            String str = this.mediaID;
            String str2 = cowatchPlayerModel.mediaID;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.mediaSource;
            String str4 = cowatchPlayerModel.mediaSource;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (this.mediaPlaybackState != cowatchPlayerModel.mediaPlaybackState || this.mediaPositionMs != cowatchPlayerModel.mediaPositionMs) {
                return false;
            }
            CowatchCaptionLocale cowatchCaptionLocale = this.captionSelectedLanguage;
            CowatchCaptionLocale cowatchCaptionLocale2 = cowatchPlayerModel.captionSelectedLanguage;
            if (cowatchCaptionLocale == null) {
                if (cowatchCaptionLocale2 != null) {
                    return false;
                }
            } else if (!cowatchCaptionLocale.equals(cowatchCaptionLocale2)) {
                return false;
            }
            CowatchMediaInfoModel cowatchMediaInfoModel = this.mediaInfo;
            CowatchMediaInfoModel cowatchMediaInfoModel2 = cowatchPlayerModel.mediaInfo;
            if (cowatchMediaInfoModel == null) {
                if (cowatchMediaInfoModel2 != null) {
                    return false;
                }
            } else if (!cowatchMediaInfoModel.equals(cowatchMediaInfoModel2)) {
                return false;
            }
            CowatchAdminMessageModel cowatchAdminMessageModel = this.adminMessage;
            CowatchAdminMessageModel cowatchAdminMessageModel2 = cowatchPlayerModel.adminMessage;
            if (cowatchAdminMessageModel == null) {
                if (cowatchAdminMessageModel2 != null) {
                    return false;
                }
            } else if (!cowatchAdminMessageModel.equals(cowatchAdminMessageModel2)) {
                return false;
            }
            if (this.contentAvailability != cowatchPlayerModel.contentAvailability || !this.iosModel.equals(cowatchPlayerModel.iosModel) || this.isStartedFromAutoplay != cowatchPlayerModel.isStartedFromAutoplay || !this.internal.equals(cowatchPlayerModel.internal)) {
                return false;
            }
            CowatchSuggestedContentQueueModel cowatchSuggestedContentQueueModel = this.suggestedContentQueue;
            CowatchSuggestedContentQueueModel cowatchSuggestedContentQueueModel2 = cowatchPlayerModel.suggestedContentQueue;
            if (cowatchSuggestedContentQueueModel != null) {
                if (!cowatchSuggestedContentQueueModel.equals(cowatchSuggestedContentQueueModel2)) {
                    return false;
                }
            } else if (cowatchSuggestedContentQueueModel2 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbstractC166997dE.A0J(this.internal, (AbstractC166997dE.A0J(this.iosModel, (((((((AbstractC25236BEt.A01(this.mediaPositionMs, (((JQ0.A01(AbstractC167017dG.A0O(this.mediaID)) + AbstractC167017dG.A0O(this.mediaSource)) * 31) + this.mediaPlaybackState) * 31) + AbstractC167017dG.A0M(this.captionSelectedLanguage)) * 31) + AbstractC167017dG.A0M(this.mediaInfo)) * 31) + AbstractC167017dG.A0M(this.adminMessage)) * 31) + this.contentAvailability) * 31) + (this.isStartedFromAutoplay ? 1 : 0)) * 31) + AbstractC166997dE.A0I(this.suggestedContentQueue);
    }

    public CowatchPlayerModel(String str, String str2, int i, long j, CowatchCaptionLocale cowatchCaptionLocale, CowatchMediaInfoModel cowatchMediaInfoModel, CowatchAdminMessageModel cowatchAdminMessageModel, int i2, CowatchPlayerIosModel cowatchPlayerIosModel, boolean z, CowatchPlayerInternalModel cowatchPlayerInternalModel, CowatchSuggestedContentQueueModel cowatchSuggestedContentQueueModel) {
        cowatchPlayerIosModel.getClass();
        cowatchPlayerInternalModel.getClass();
        this.mediaID = str;
        this.mediaSource = str2;
        this.mediaPlaybackState = i;
        this.mediaPositionMs = j;
        this.captionSelectedLanguage = cowatchCaptionLocale;
        this.mediaInfo = cowatchMediaInfoModel;
        this.adminMessage = cowatchAdminMessageModel;
        this.contentAvailability = i2;
        this.iosModel = cowatchPlayerIosModel;
        this.isStartedFromAutoplay = z;
        this.internal = cowatchPlayerInternalModel;
        this.suggestedContentQueue = cowatchSuggestedContentQueueModel;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CowatchPlayerModel{mediaID=");
        A1C.append(this.mediaID);
        A1C.append(",mediaSource=");
        A1C.append(this.mediaSource);
        A1C.append(",mediaPlaybackState=");
        A1C.append(this.mediaPlaybackState);
        A1C.append(MSV.A00(649));
        A1C.append(this.mediaPositionMs);
        A1C.append(",captionSelectedLanguage=");
        A1C.append(this.captionSelectedLanguage);
        A1C.append(",mediaInfo=");
        A1C.append(this.mediaInfo);
        A1C.append(MSV.A00(646));
        A1C.append(this.adminMessage);
        A1C.append(",contentAvailability=");
        A1C.append(this.contentAvailability);
        A1C.append(",iosModel=");
        A1C.append(this.iosModel);
        A1C.append(",isStartedFromAutoplay=");
        A1C.append(this.isStartedFromAutoplay);
        A1C.append(",internal=");
        A1C.append(this.internal);
        A1C.append(",suggestedContentQueue=");
        return JQ0.A0l(this.suggestedContentQueue, A1C);
    }
}
