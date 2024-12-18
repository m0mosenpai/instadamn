package com.facebook.rsys.cowatch.gen;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC72049XLp;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class CowatchLoggingMetadata {
    public final String promotionSource;
    public final int sectionItemRenderingStyle;
    public final int sectionRenderingStyle;
    public final String tabLoggingName;

    public static native CowatchLoggingMetadata createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchLoggingMetadata)) {
                return false;
            }
            CowatchLoggingMetadata cowatchLoggingMetadata = (CowatchLoggingMetadata) obj;
            String str = this.tabLoggingName;
            String str2 = cowatchLoggingMetadata.tabLoggingName;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.promotionSource;
            String str4 = cowatchLoggingMetadata.promotionSource;
            if (str3 != null) {
                if (!str3.equals(str4)) {
                    return false;
                }
            } else if (str4 != null) {
                return false;
            }
            if (this.sectionRenderingStyle != cowatchLoggingMetadata.sectionRenderingStyle || this.sectionItemRenderingStyle != cowatchLoggingMetadata.sectionItemRenderingStyle) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((JQ0.A01(AbstractC167017dG.A0O(this.tabLoggingName)) + AbstractC25227BEk.A07(this.promotionSource)) * 31) + this.sectionRenderingStyle) * 31) + this.sectionItemRenderingStyle;
    }

    public CowatchLoggingMetadata(String str, String str2, int i, int i2) {
        this.tabLoggingName = str;
        this.promotionSource = str2;
        this.sectionRenderingStyle = i;
        this.sectionItemRenderingStyle = i2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CowatchLoggingMetadata{tabLoggingName=");
        A1C.append(this.tabLoggingName);
        A1C.append(",promotionSource=");
        A1C.append(this.promotionSource);
        A1C.append(",sectionRenderingStyle=");
        A1C.append(this.sectionRenderingStyle);
        A1C.append(",sectionItemRenderingStyle=");
        return AbstractC72049XLp.A0B(A1C, this.sectionItemRenderingStyle);
    }
}
