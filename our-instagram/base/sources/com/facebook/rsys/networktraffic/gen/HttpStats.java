package com.facebook.rsys.networktraffic.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC31180DnO;
import X.AbstractC50523MSb;
import X.C2N9;
import X.JQ0;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class HttpStats {
    public static C2N9 CONVERTER = YAM.A00(22);
    public static long sMcfTypeId;
    public final String errorDescription;
    public final String httpMethod;
    public final String networkType;
    public final long requestBodyBytes;
    public final String requestCallPath;
    public final int requestCategory;
    public final String requestFriendlyName;
    public final long requestHeaderBytes;
    public final String requestSurface;
    public final String requestUri;
    public final long responseBodyBytes;
    public final long responseHeaderBytes;
    public final int statusCode;

    public static native HttpStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof HttpStats)) {
                return false;
            }
            HttpStats httpStats = (HttpStats) obj;
            if (this.requestHeaderBytes == httpStats.requestHeaderBytes && this.requestBodyBytes == httpStats.requestBodyBytes && this.responseHeaderBytes == httpStats.responseHeaderBytes && this.responseBodyBytes == httpStats.responseBodyBytes && this.requestUri.equals(httpStats.requestUri) && this.requestFriendlyName.equals(httpStats.requestFriendlyName) && this.requestCallPath.equals(httpStats.requestCallPath) && this.requestCategory == httpStats.requestCategory && this.statusCode == httpStats.statusCode && this.httpMethod.equals(httpStats.httpMethod)) {
                String str = this.errorDescription;
                String str2 = httpStats.errorDescription;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                String str3 = this.networkType;
                String str4 = httpStats.networkType;
                if (str3 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str3.equals(str4)) {
                    return false;
                }
                String str5 = this.requestSurface;
                String str6 = httpStats.requestSurface;
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
        long j = this.requestHeaderBytes;
        int A07 = AbstractC167007dF.A07(this.responseHeaderBytes, AbstractC167007dF.A07(this.requestBodyBytes, JQ0.A01((int) (j ^ (j >>> 32)))));
        long j2 = this.responseBodyBytes;
        return ((((AbstractC166997dE.A0K(this.httpMethod, (((AbstractC166997dE.A0K(this.requestCallPath, AbstractC166997dE.A0K(this.requestFriendlyName, AbstractC166997dE.A0K(this.requestUri, (A07 + ((int) ((j2 >>> 32) ^ j2))) * 31))) + this.requestCategory) * 31) + this.statusCode) * 31) + AbstractC167017dG.A0O(this.errorDescription)) * 31) + AbstractC167017dG.A0O(this.networkType)) * 31) + AbstractC25227BEk.A07(this.requestSurface);
    }

    public HttpStats(long j, long j2, long j3, long j4, String str, String str2, String str3, int i, int i2, String str4, String str5, String str6, String str7) {
        AbstractC31180DnO.A1U(str, str2, str3);
        str4.getClass();
        this.requestHeaderBytes = j;
        this.requestBodyBytes = j2;
        this.responseHeaderBytes = j3;
        this.responseBodyBytes = j4;
        this.requestUri = str;
        this.requestFriendlyName = str2;
        this.requestCallPath = str3;
        this.requestCategory = i;
        this.statusCode = i2;
        this.httpMethod = str4;
        this.errorDescription = str5;
        this.networkType = str6;
        this.requestSurface = str7;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("HttpStats{requestHeaderBytes=");
        A1C.append(this.requestHeaderBytes);
        A1C.append(",requestBodyBytes=");
        A1C.append(this.requestBodyBytes);
        A1C.append(",responseHeaderBytes=");
        A1C.append(this.responseHeaderBytes);
        A1C.append(",responseBodyBytes=");
        A1C.append(this.responseBodyBytes);
        A1C.append(",requestUri=");
        A1C.append(this.requestUri);
        A1C.append(",requestFriendlyName=");
        A1C.append(this.requestFriendlyName);
        A1C.append(",requestCallPath=");
        A1C.append(this.requestCallPath);
        A1C.append(",requestCategory=");
        A1C.append(this.requestCategory);
        A1C.append(",statusCode=");
        A1C.append(this.statusCode);
        A1C.append(",httpMethod=");
        A1C.append(this.httpMethod);
        A1C.append(",errorDescription=");
        A1C.append(this.errorDescription);
        A1C.append(",networkType=");
        A1C.append(this.networkType);
        A1C.append(",requestSurface=");
        return AbstractC50523MSb.A0W(this.requestSurface, A1C);
    }
}
