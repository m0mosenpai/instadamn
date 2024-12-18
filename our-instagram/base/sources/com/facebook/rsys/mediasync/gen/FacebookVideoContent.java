package com.facebook.rsys.mediasync.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC31180DnO;
import X.AbstractC50523MSb;
import X.C2N9;
import X.C55648OnZ;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public class FacebookVideoContent {
    public static C2N9 CONVERTER = C55648OnZ.A00(42);
    public static long sMcfTypeId;
    public final ArrayList availableCaptionLocales;
    public final String contentId;
    public final boolean isLiveStreaming;
    public final boolean isReportable;
    public final String subtitle;
    public final SizedUrl thumbnail;
    public final String title;
    public final Video video;

    public static native FacebookVideoContent createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FacebookVideoContent)) {
                return false;
            }
            FacebookVideoContent facebookVideoContent = (FacebookVideoContent) obj;
            if (this.contentId.equals(facebookVideoContent.contentId) && this.video.equals(facebookVideoContent.video)) {
                SizedUrl sizedUrl = this.thumbnail;
                SizedUrl sizedUrl2 = facebookVideoContent.thumbnail;
                if (sizedUrl == null) {
                    if (sizedUrl2 != null) {
                        return false;
                    }
                } else if (!sizedUrl.equals(sizedUrl2)) {
                    return false;
                }
                String str = this.title;
                String str2 = facebookVideoContent.title;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                String str3 = this.subtitle;
                String str4 = facebookVideoContent.subtitle;
                if (str3 != null) {
                    if (!str3.equals(str4)) {
                        return false;
                    }
                } else if (str4 != null) {
                    return false;
                }
                if (this.isLiveStreaming != facebookVideoContent.isLiveStreaming || this.isReportable != facebookVideoContent.isReportable || !this.availableCaptionLocales.equals(facebookVideoContent.availableCaptionLocales)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbstractC166987dD.A0I(this.availableCaptionLocales, (((((((((AbstractC166997dE.A0J(this.video, AbstractC50523MSb.A02(this.contentId)) + AbstractC167017dG.A0M(this.thumbnail)) * 31) + AbstractC167017dG.A0O(this.title)) * 31) + AbstractC25227BEk.A07(this.subtitle)) * 31) + (this.isLiveStreaming ? 1 : 0)) * 31) + (this.isReportable ? 1 : 0)) * 31);
    }

    public FacebookVideoContent(String str, Video video, SizedUrl sizedUrl, String str2, String str3, boolean z, boolean z2, ArrayList arrayList) {
        AbstractC31180DnO.A1U(str, video, arrayList);
        this.contentId = str;
        this.video = video;
        this.thumbnail = sizedUrl;
        this.title = str2;
        this.subtitle = str3;
        this.isLiveStreaming = z;
        this.isReportable = z2;
        this.availableCaptionLocales = arrayList;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FacebookVideoContent{contentId=");
        A1C.append(this.contentId);
        A1C.append(",video=");
        A1C.append(this.video);
        A1C.append(",thumbnail=");
        A1C.append(this.thumbnail);
        A1C.append(",title=");
        A1C.append(this.title);
        A1C.append(",subtitle=");
        A1C.append(this.subtitle);
        A1C.append(",isLiveStreaming=");
        A1C.append(this.isLiveStreaming);
        A1C.append(",isReportable=");
        A1C.append(this.isReportable);
        A1C.append(",availableCaptionLocales=");
        return JQ0.A0l(this.availableCaptionLocales, A1C);
    }
}
