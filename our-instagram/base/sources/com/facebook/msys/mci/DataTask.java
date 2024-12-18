package com.facebook.msys.mci;

import X.C2NJ;

/* loaded from: classes3.dex */
public class DataTask {
    public final long mContentLength;
    public final String mContentUrl;
    public final long mNativeContext;
    public final String mTaskCategory;
    public final String mTaskIdentifier;
    public final int mTaskMode;
    public final int mTaskType;
    public final UrlRequest mUrlRequest;

    static {
        C2NJ.A00();
    }

    public DataTask(String str, String str2, int i, UrlRequest urlRequest, String str3, long j, int i2, long j2) {
        this.mTaskCategory = str;
        this.mTaskIdentifier = str2;
        this.mTaskType = i;
        this.mUrlRequest = urlRequest;
        this.mContentUrl = str3;
        this.mContentLength = j;
        this.mTaskMode = i2;
        this.mNativeContext = j2;
    }
}
