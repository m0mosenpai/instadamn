package com.facebook.msys.mci;

import X.C2NJ;
import com.facebook.simplejni.NativeHolder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class UrlRequest {
    public final NativeHolder mNativeHolder;

    private native String[] getHeaderKeys();

    private native String[] getHeaderValues();

    public native byte[] getHttpBody();

    public native String getHttpMethod();

    public native String getUrl();

    public Map getHttpHeaders() {
        HashMap hashMap = new HashMap();
        String[] headerKeys = getHeaderKeys();
        String[] headerValues = getHeaderValues();
        if (headerKeys != null && headerValues != null) {
            for (int i = 0; i < headerKeys.length; i++) {
                hashMap.put(headerKeys[i], headerValues[i]);
            }
        }
        return hashMap;
    }

    static {
        C2NJ.A00();
    }

    public UrlRequest(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
