package com.facebook.rsys.mediasync.gen;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC50523MSb;
import X.C2N9;
import X.C55648OnZ;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class SizedUrl {
    public static C2N9 CONVERTER = C55648OnZ.A00(51);
    public static long sMcfTypeId;
    public final int height;
    public final String type;
    public final String url;
    public final int width;

    public static native SizedUrl createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SizedUrl)) {
                return false;
            }
            SizedUrl sizedUrl = (SizedUrl) obj;
            if (this.url.equals(sizedUrl.url) && this.height == sizedUrl.height && this.width == sizedUrl.width) {
                String str = this.type;
                String str2 = sizedUrl.type;
                if (str != null) {
                    if (!str.equals(str2)) {
                        return false;
                    }
                } else if (str2 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((AbstractC50523MSb.A02(this.url) + this.height) * 31) + this.width) * 31) + AbstractC167017dG.A0O(this.type);
    }

    public SizedUrl(String str, int i, int i2, String str2) {
        str.getClass();
        this.url = str;
        this.height = i;
        this.width = i2;
        this.type = str2;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SizedUrl{url=");
        A1C.append(this.url);
        A1C.append(",height=");
        A1C.append(this.height);
        A1C.append(",width=");
        A1C.append(this.width);
        A1C.append(",type=");
        return AbstractC50523MSb.A0W(this.type, A1C);
    }
}
