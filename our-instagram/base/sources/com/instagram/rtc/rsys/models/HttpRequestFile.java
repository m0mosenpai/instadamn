package com.instagram.rtc.rsys.models;

import X.AbstractC166987dD;
import X.AbstractC25226BEj;
import X.AbstractC43591JPw;
import X.AbstractC50523MSb;
import X.C2N9;
import X.JQ0;
import X.YAL;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class HttpRequestFile {
    public static C2N9 CONVERTER = new YAL(15);
    public static long sMcfTypeId;
    public final String contentType;
    public final byte[] data;

    public static native HttpRequestFile createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequestFile)) {
            return false;
        }
        HttpRequestFile httpRequestFile = (HttpRequestFile) obj;
        return Arrays.equals(this.data, httpRequestFile.data) && this.contentType.equals(httpRequestFile.contentType);
    }

    public int hashCode() {
        return AbstractC25226BEj.A03(this.contentType, JQ0.A01(Arrays.hashCode(this.data)));
    }

    public HttpRequestFile(byte[] bArr, String str) {
        bArr.getClass();
        str.getClass();
        this.data = bArr;
        this.contentType = str;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("HttpRequestFile{data=");
        A1C.append(this.data);
        A1C.append(AbstractC43591JPw.A00(519));
        return AbstractC50523MSb.A0W(this.contentType, A1C);
    }
}
