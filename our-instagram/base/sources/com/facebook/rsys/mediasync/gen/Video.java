package com.facebook.rsys.mediasync.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25236BEt;
import X.C2N9;
import X.C55648OnZ;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class Video {
    public static C2N9 CONVERTER = C55648OnZ.A00(52);
    public static long sMcfTypeId;
    public final float aspectRatio;
    public final String dashManifest;
    public final long durationMs;
    public final SizedUrl url;

    public static native Video createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Video)) {
                return false;
            }
            Video video = (Video) obj;
            SizedUrl sizedUrl = this.url;
            SizedUrl sizedUrl2 = video.url;
            if (sizedUrl == null) {
                if (sizedUrl2 != null) {
                    return false;
                }
            } else if (!sizedUrl.equals(sizedUrl2)) {
                return false;
            }
            String str = this.dashManifest;
            String str2 = video.dashManifest;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            if (this.durationMs != video.durationMs || this.aspectRatio != video.aspectRatio) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbstractC25236BEt.A01(this.durationMs, (JQ0.A01(AbstractC167017dG.A0M(this.url)) + AbstractC25227BEk.A07(this.dashManifest)) * 31) + Float.floatToIntBits(this.aspectRatio);
    }

    public Video(SizedUrl sizedUrl, String str, long j, float f) {
        this.url = sizedUrl;
        this.dashManifest = str;
        this.durationMs = j;
        this.aspectRatio = f;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Video{url=");
        A1C.append(this.url);
        A1C.append(",dashManifest=");
        A1C.append(this.dashManifest);
        A1C.append(",durationMs=");
        A1C.append(this.durationMs);
        A1C.append(",aspectRatio=");
        A1C.append(this.aspectRatio);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
