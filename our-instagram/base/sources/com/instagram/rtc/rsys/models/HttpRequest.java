package com.instagram.rtc.rsys.models;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC31180DnO;
import X.AbstractC50523MSb;
import X.C2N9;
import X.C55647OnY;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

/* loaded from: classes9.dex */
public class HttpRequest {
    public static C2N9 CONVERTER = new C55647OnY(9);
    public static long sMcfTypeId;
    public final Map files;
    public final String path;
    public final Map payload;
    public final String requestId;
    public final int requestMethod;
    public final int requestType;

    public static native HttpRequest createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        return this.requestId.equals(httpRequest.requestId) && this.path.equals(httpRequest.path) && this.requestType == httpRequest.requestType && this.requestMethod == httpRequest.requestMethod && this.payload.equals(httpRequest.payload) && this.files.equals(httpRequest.files);
    }

    public int hashCode() {
        return ((((((AbstractC166997dE.A0K(this.path, AbstractC50523MSb.A02(this.requestId)) + this.requestType) * 31) + this.requestMethod) * 31) + this.payload.hashCode()) * 31) + this.files.hashCode();
    }

    public HttpRequest(String str, String str2, int i, int i2, Map map, Map map2) {
        AbstractC31180DnO.A1U(str, str2, map);
        map2.getClass();
        this.requestId = str;
        this.path = str2;
        this.requestType = i;
        this.requestMethod = i2;
        this.payload = map;
        this.files = map2;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("HttpRequest{requestId=");
        A1C.append(this.requestId);
        A1C.append(",path=");
        A1C.append(this.path);
        A1C.append(",requestType=");
        A1C.append(this.requestType);
        A1C.append(",requestMethod=");
        A1C.append(this.requestMethod);
        A1C.append(",payload=");
        A1C.append(this.payload);
        A1C.append(",files=");
        return JQ0.A0l(this.files, A1C);
    }
}
