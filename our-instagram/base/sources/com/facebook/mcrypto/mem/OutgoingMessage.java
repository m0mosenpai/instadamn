package com.facebook.mcrypto.mem;

import X.C09170dP;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes8.dex */
public class OutgoingMessage {
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(PlaintextApplicationPayload plaintextApplicationPayload, EnvelopeProperties envelopeProperties);

    private native boolean nativeEquals(Object obj);

    public native EnvelopeProperties getEnvelopeProperties();

    public native PlaintextApplicationPayload getPlaintextApplicationPayload();

    public native int hashCode();

    public native String toString();

    static {
        C09170dP.A0C("mcryptojni");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof OutgoingMessage)) {
            return nativeEquals(obj);
        }
        return false;
    }

    public OutgoingMessage(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public OutgoingMessage(PlaintextApplicationPayload plaintextApplicationPayload, EnvelopeProperties envelopeProperties) {
        plaintextApplicationPayload.getClass();
        this.mNativeHolder = initNativeHolder(plaintextApplicationPayload, envelopeProperties);
    }
}
