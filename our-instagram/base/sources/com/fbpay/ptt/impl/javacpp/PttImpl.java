package com.fbpay.ptt.impl.javacpp;

import X.AbstractC166987dD;
import X.C09170dP;
import com.facebook.jni.HybridData;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes10.dex */
public class PttImpl {
    public Set mAtFingerprints;
    public HybridData mHybridData;

    private native String decodeResponsePtt(String str);

    private native String generatePtt(String str);

    private native String getE2eeError();

    private native byte[] getSigningPayload(String str);

    public static native HybridData initHybrid(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr, String str);

    static {
        C09170dP.A0C("fbpayptt-android");
    }

    public String createPtt(String str) {
        return generatePtt(str);
    }

    public String decodeResponse(String str) {
        return decodeResponsePtt(str);
    }

    public String getEncryptionError() {
        return getE2eeError();
    }

    public Map getSigningPayloads() {
        HashMap A1G = AbstractC166987dD.A1G();
        Iterator it = this.mAtFingerprints.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            A1G.put(A1B, getSigningPayload(A1B));
        }
        return Collections.unmodifiableMap(A1G);
    }
}
