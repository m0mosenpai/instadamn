package com.facebook.rsys.ended.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C2N9;
import X.JQ0;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class VideoStats {
    public static C2N9 CONVERTER = YAN.A00(48);
    public static long sMcfTypeId;
    public final Long total1080phdDurationMs;
    public final Long total720phdDurationMs;
    public final Long totalDurationMs;

    public static native VideoStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoStats)) {
                return false;
            }
            VideoStats videoStats = (VideoStats) obj;
            Long l = this.totalDurationMs;
            Long l2 = videoStats.totalDurationMs;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            Long l3 = this.total720phdDurationMs;
            Long l4 = videoStats.total720phdDurationMs;
            if (l3 == null) {
                if (l4 != null) {
                    return false;
                }
            } else if (!l3.equals(l4)) {
                return false;
            }
            Long l5 = this.total1080phdDurationMs;
            Long l6 = videoStats.total1080phdDurationMs;
            if (l5 != null) {
                if (!l5.equals(l6)) {
                    return false;
                }
            } else if (l6 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((JQ0.A01(AbstractC167017dG.A0M(this.totalDurationMs)) + AbstractC167017dG.A0M(this.total720phdDurationMs)) * 31) + AbstractC166997dE.A0I(this.total1080phdDurationMs);
    }

    public VideoStats(Long l, Long l2, Long l3) {
        this.totalDurationMs = l;
        this.total720phdDurationMs = l2;
        this.total1080phdDurationMs = l3;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VideoStats{totalDurationMs=");
        A1C.append(this.totalDurationMs);
        A1C.append(",total720phdDurationMs=");
        A1C.append(this.total720phdDurationMs);
        A1C.append(",total1080phdDurationMs=");
        return JQ0.A0l(this.total1080phdDurationMs, A1C);
    }
}
