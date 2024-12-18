package com.facebook.rsys.cowatch.gen;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C2N9;
import X.JQ0;
import X.LSW;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

/* loaded from: classes8.dex */
public class CowatchLoggingModel {
    public static C2N9 CONVERTER = new LSW(2);
    public static long sMcfTypeId;
    public final int action;
    public final Map extraInfo;
    public final String source;
    public final String trace;
    public final String videoId;

    public static native CowatchLoggingModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchLoggingModel)) {
                return false;
            }
            CowatchLoggingModel cowatchLoggingModel = (CowatchLoggingModel) obj;
            if (this.action == cowatchLoggingModel.action) {
                String str = this.source;
                String str2 = cowatchLoggingModel.source;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                String str3 = this.trace;
                String str4 = cowatchLoggingModel.trace;
                if (str3 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str3.equals(str4)) {
                    return false;
                }
                String str5 = this.videoId;
                String str6 = cowatchLoggingModel.videoId;
                if (str5 == null) {
                    if (str6 != null) {
                        return false;
                    }
                } else if (!str5.equals(str6)) {
                    return false;
                }
                Map map = this.extraInfo;
                Map map2 = cowatchLoggingModel.extraInfo;
                if (map != null) {
                    if (!map.equals(map2)) {
                        return false;
                    }
                } else if (map2 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A01 = (((((JQ0.A01(this.action) + AbstractC167017dG.A0O(this.source)) * 31) + AbstractC167017dG.A0O(this.trace)) * 31) + AbstractC167017dG.A0O(this.videoId)) * 31;
        Map map = this.extraInfo;
        if (map != null) {
            i = map.hashCode();
        }
        return A01 + i;
    }

    public CowatchLoggingModel(int i, String str, String str2, String str3, Map map) {
        this.action = i;
        this.source = str;
        this.trace = str2;
        this.videoId = str3;
        this.extraInfo = map;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CowatchLoggingModel{action=");
        A1C.append(this.action);
        A1C.append(",source=");
        A1C.append(this.source);
        A1C.append(",trace=");
        A1C.append(this.trace);
        A1C.append(",videoId=");
        A1C.append(this.videoId);
        A1C.append(",extraInfo=");
        return JQ0.A0l(this.extraInfo, A1C);
    }
}
