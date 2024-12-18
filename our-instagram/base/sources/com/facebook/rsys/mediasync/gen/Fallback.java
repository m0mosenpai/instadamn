package com.facebook.rsys.mediasync.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC50523MSb;
import X.C2N9;
import X.C55648OnZ;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class Fallback {
    public static C2N9 CONVERTER = C55648OnZ.A00(43);
    public static long sMcfTypeId;
    public final String attribution;
    public final String attributionImageUrl;
    public final String contentId;
    public final String coverImageUrl;
    public final String message;
    public final Video video;

    public static native Fallback createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Fallback)) {
                return false;
            }
            Fallback fallback = (Fallback) obj;
            if (this.contentId.equals(fallback.contentId) && this.coverImageUrl.equals(fallback.coverImageUrl)) {
                String str = this.message;
                String str2 = fallback.message;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                Video video = this.video;
                Video video2 = fallback.video;
                if (video == null) {
                    if (video2 != null) {
                        return false;
                    }
                } else if (!video.equals(video2)) {
                    return false;
                }
                String str3 = this.attributionImageUrl;
                String str4 = fallback.attributionImageUrl;
                if (str3 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str3.equals(str4)) {
                    return false;
                }
                String str5 = this.attribution;
                String str6 = fallback.attribution;
                if (str5 != null) {
                    if (!str5.equals(str6)) {
                        return false;
                    }
                } else if (str6 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((AbstractC166997dE.A0K(this.coverImageUrl, AbstractC50523MSb.A02(this.contentId)) + AbstractC167017dG.A0O(this.message)) * 31) + AbstractC167017dG.A0M(this.video)) * 31) + AbstractC167017dG.A0O(this.attributionImageUrl)) * 31) + AbstractC25227BEk.A07(this.attribution);
    }

    public Fallback(String str, String str2, String str3, Video video, String str4, String str5) {
        str.getClass();
        str2.getClass();
        this.contentId = str;
        this.coverImageUrl = str2;
        this.message = str3;
        this.video = video;
        this.attributionImageUrl = str4;
        this.attribution = str5;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Fallback{contentId=");
        A1C.append(this.contentId);
        A1C.append(",coverImageUrl=");
        A1C.append(this.coverImageUrl);
        A1C.append(",message=");
        A1C.append(this.message);
        A1C.append(",video=");
        A1C.append(this.video);
        A1C.append(",attributionImageUrl=");
        A1C.append(this.attributionImageUrl);
        A1C.append(",attribution=");
        return AbstractC50523MSb.A0W(this.attribution, A1C);
    }
}
