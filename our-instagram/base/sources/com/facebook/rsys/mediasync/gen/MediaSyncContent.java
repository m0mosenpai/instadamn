package com.facebook.rsys.mediasync.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C2N9;
import X.C55648OnZ;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class MediaSyncContent {
    public static C2N9 CONVERTER = C55648OnZ.A00(48);
    public static long sMcfTypeId;
    public final FacebookVideoContent facebookVideoContent;
    public final Fallback fallback;
    public final InstagramContent instagramContent;
    public final Placeholder placeholder;

    public static native MediaSyncContent createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MediaSyncContent)) {
                return false;
            }
            MediaSyncContent mediaSyncContent = (MediaSyncContent) obj;
            InstagramContent instagramContent = this.instagramContent;
            InstagramContent instagramContent2 = mediaSyncContent.instagramContent;
            if (instagramContent == null) {
                if (instagramContent2 != null) {
                    return false;
                }
            } else if (!instagramContent.equals(instagramContent2)) {
                return false;
            }
            FacebookVideoContent facebookVideoContent = this.facebookVideoContent;
            FacebookVideoContent facebookVideoContent2 = mediaSyncContent.facebookVideoContent;
            if (facebookVideoContent == null) {
                if (facebookVideoContent2 != null) {
                    return false;
                }
            } else if (!facebookVideoContent.equals(facebookVideoContent2)) {
                return false;
            }
            Placeholder placeholder = this.placeholder;
            Placeholder placeholder2 = mediaSyncContent.placeholder;
            if (placeholder == null) {
                if (placeholder2 != null) {
                    return false;
                }
            } else if (!placeholder.equals(placeholder2)) {
                return false;
            }
            Fallback fallback = this.fallback;
            Fallback fallback2 = mediaSyncContent.fallback;
            if (fallback != null) {
                if (!fallback.equals(fallback2)) {
                    return false;
                }
            } else if (fallback2 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((JQ0.A01(AbstractC167017dG.A0M(this.instagramContent)) + AbstractC167017dG.A0M(this.facebookVideoContent)) * 31) + AbstractC167017dG.A0M(this.placeholder)) * 31) + AbstractC166997dE.A0I(this.fallback);
    }

    public MediaSyncContent(InstagramContent instagramContent, FacebookVideoContent facebookVideoContent, Placeholder placeholder, Fallback fallback) {
        this.instagramContent = instagramContent;
        this.facebookVideoContent = facebookVideoContent;
        this.placeholder = placeholder;
        this.fallback = fallback;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MediaSyncContent{instagramContent=");
        A1C.append(this.instagramContent);
        A1C.append(",facebookVideoContent=");
        A1C.append(this.facebookVideoContent);
        A1C.append(",placeholder=");
        A1C.append(this.placeholder);
        A1C.append(",fallback=");
        return JQ0.A0l(this.fallback, A1C);
    }
}
