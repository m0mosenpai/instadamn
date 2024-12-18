package com.instagram.rtc.rsys.models;

import X.C2N9;
import X.JQ0;
import X.WV3;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.mediastats.gen.MediaStats;

/* loaded from: classes11.dex */
public class IGMediaStats {
    public static C2N9 CONVERTER = new WV3(6);
    public static long sMcfTypeId;
    public final MediaStats mediaStats;
    public final String userId;

    public static native IGMediaStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IGMediaStats)) {
            return false;
        }
        IGMediaStats iGMediaStats = (IGMediaStats) obj;
        return this.userId.equals(iGMediaStats.userId) && this.mediaStats.equals(iGMediaStats.mediaStats);
    }

    public int hashCode() {
        return ((527 + this.userId.hashCode()) * 31) + this.mediaStats.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IGMediaStats{userId=");
        sb.append(this.userId);
        sb.append(",mediaStats=");
        return JQ0.A0l(this.mediaStats, sb);
    }

    public IGMediaStats(String str, MediaStats mediaStats) {
        str.getClass();
        mediaStats.getClass();
        this.userId = str;
        this.mediaStats = mediaStats;
    }
}
