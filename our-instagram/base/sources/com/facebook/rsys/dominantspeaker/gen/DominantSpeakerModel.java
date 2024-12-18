package com.facebook.rsys.dominantspeaker.gen;

import X.C2N9;
import X.JQ0;
import X.WV3;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public class DominantSpeakerModel {
    public static C2N9 CONVERTER = new WV3(1);
    public static long sMcfTypeId;
    public final String dominantSpeakerUserId;
    public final ArrayList recentDominantSpeakerUserIds;

    public static native DominantSpeakerModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DominantSpeakerModel)) {
            return false;
        }
        DominantSpeakerModel dominantSpeakerModel = (DominantSpeakerModel) obj;
        return this.dominantSpeakerUserId.equals(dominantSpeakerModel.dominantSpeakerUserId) && this.recentDominantSpeakerUserIds.equals(dominantSpeakerModel.recentDominantSpeakerUserIds);
    }

    public int hashCode() {
        return ((527 + this.dominantSpeakerUserId.hashCode()) * 31) + this.recentDominantSpeakerUserIds.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DominantSpeakerModel{dominantSpeakerUserId=");
        sb.append(this.dominantSpeakerUserId);
        sb.append(",recentDominantSpeakerUserIds=");
        return JQ0.A0l(this.recentDominantSpeakerUserIds, sb);
    }

    public DominantSpeakerModel(String str, ArrayList arrayList) {
        str.getClass();
        arrayList.getClass();
        this.dominantSpeakerUserId = str;
        this.recentDominantSpeakerUserIds = arrayList;
    }
}
