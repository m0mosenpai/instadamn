package com.facebook.mobilenetwork;

import X.C00O;
import X.C09170dP;
import com.facebook.simplejni.NativeHolder;
import javax.net.ssl.SSLSocket;

/* loaded from: classes10.dex */
public abstract class Tls13Socket extends SSLSocket {
    public static final byte[] ALPN_HTTP2_BYTES;
    public static final byte[] ALPN_HTTP_1_1_BYTES;
    public static final String[] CIPHER_SUITES;
    public final NativeHolder mNativeHolder;

    private native void closeNative();

    private native NativeHolder initNative(int i);

    private native int readNative(byte[] bArr, int i, int i2, int i3);

    private native void setClosingNative();

    private native void startHandshakeNative(String str, byte[] bArr, boolean z);

    private void verifyCertificates(byte[][] bArr) {
        throw C00O.createAndThrow();
    }

    private native void writeNative(byte[] bArr, int i, int i2);

    public native byte[][] getPeerCertificatesNative();

    static {
        C09170dP.A0C("tls13_socket");
        ALPN_HTTP2_BYTES = new byte[]{104, 50};
        ALPN_HTTP_1_1_BYTES = new byte[]{104, 116, 116, 112, 47, 49, 46, 49};
        CIPHER_SUITES = new String[]{"TLS_AES_128_GCM_SHA256", "use default"};
    }

    private void onNewSessionTicket(byte[] bArr) {
        throw C00O.createAndThrow();
    }
}
