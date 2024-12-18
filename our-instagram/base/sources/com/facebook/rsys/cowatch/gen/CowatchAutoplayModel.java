package com.facebook.rsys.cowatch.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.MSV;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class CowatchAutoplayModel {
    public final String actorId;
    public final CowatchAutoplaySimpleModel autoplay;
    public final String autoplayActionId;
    public final CowatchMediaInfoModel contentInfo;
    public final boolean needsUpdatePeer;
    public final String sourceMediaId;
    public final String sourceMediaSource;

    public static native CowatchAutoplayModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchAutoplayModel)) {
                return false;
            }
            CowatchAutoplayModel cowatchAutoplayModel = (CowatchAutoplayModel) obj;
            String str = this.sourceMediaId;
            String str2 = cowatchAutoplayModel.sourceMediaId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.sourceMediaSource;
            String str4 = cowatchAutoplayModel.sourceMediaSource;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.autoplayActionId;
            String str6 = cowatchAutoplayModel.autoplayActionId;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.actorId;
            String str8 = cowatchAutoplayModel.actorId;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            CowatchAutoplaySimpleModel cowatchAutoplaySimpleModel = this.autoplay;
            CowatchAutoplaySimpleModel cowatchAutoplaySimpleModel2 = cowatchAutoplayModel.autoplay;
            if (cowatchAutoplaySimpleModel == null) {
                if (cowatchAutoplaySimpleModel2 != null) {
                    return false;
                }
            } else if (!cowatchAutoplaySimpleModel.equals(cowatchAutoplaySimpleModel2)) {
                return false;
            }
            CowatchMediaInfoModel cowatchMediaInfoModel = this.contentInfo;
            CowatchMediaInfoModel cowatchMediaInfoModel2 = cowatchAutoplayModel.contentInfo;
            if (cowatchMediaInfoModel != null) {
                if (!cowatchMediaInfoModel.equals(cowatchMediaInfoModel2)) {
                    return false;
                }
            } else if (cowatchMediaInfoModel2 != null) {
                return false;
            }
            if (this.needsUpdatePeer != cowatchAutoplayModel.needsUpdatePeer) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((527 + AbstractC167017dG.A0O(this.sourceMediaId)) * 31) + AbstractC167017dG.A0O(this.sourceMediaSource)) * 31) + AbstractC167017dG.A0O(this.autoplayActionId)) * 31) + AbstractC167017dG.A0O(this.actorId)) * 31) + AbstractC167017dG.A0M(this.autoplay)) * 31) + AbstractC166997dE.A0I(this.contentInfo)) * 31) + (this.needsUpdatePeer ? 1 : 0);
    }

    public CowatchAutoplayModel(String str, String str2, String str3, String str4, CowatchAutoplaySimpleModel cowatchAutoplaySimpleModel, CowatchMediaInfoModel cowatchMediaInfoModel, boolean z) {
        this.sourceMediaId = str;
        this.sourceMediaSource = str2;
        this.autoplayActionId = str3;
        this.actorId = str4;
        this.autoplay = cowatchAutoplaySimpleModel;
        this.contentInfo = cowatchMediaInfoModel;
        this.needsUpdatePeer = z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CowatchAutoplayModel{sourceMediaId=");
        A1C.append(this.sourceMediaId);
        A1C.append(",sourceMediaSource=");
        A1C.append(this.sourceMediaSource);
        A1C.append(",autoplayActionId=");
        A1C.append(this.autoplayActionId);
        A1C.append(MSV.A00(301));
        A1C.append(this.actorId);
        A1C.append(",autoplay=");
        A1C.append(this.autoplay);
        A1C.append(",contentInfo=");
        A1C.append(this.contentInfo);
        A1C.append(",needsUpdatePeer=");
        A1C.append(this.needsUpdatePeer);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
