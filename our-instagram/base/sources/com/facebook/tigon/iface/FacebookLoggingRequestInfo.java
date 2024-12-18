package com.facebook.tigon.iface;

/* loaded from: classes.dex */
public class FacebookLoggingRequestInfo {
    public String mAnalyticsTag;
    public String mCallerClass;
    public String mLogName;

    public FacebookLoggingRequestInfo(String str, String str2, String str3) {
        this.mLogName = str;
        this.mAnalyticsTag = str2;
        this.mCallerClass = str3;
    }
}
