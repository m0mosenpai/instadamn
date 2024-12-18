package org.webrtc;

import org.webrtc.PeerConnection;

/* loaded from: classes7.dex */
public class RtcCertificatePem {
    public static final long DEFAULT_EXPIRY = 2592000;
    public final String certificate;
    public final String privateKey;

    public static native RtcCertificatePem nativeGenerateCertificate(PeerConnection.KeyType keyType, long j);

    public String getCertificate() {
        return this.certificate;
    }

    public String getPrivateKey() {
        return this.privateKey;
    }

    public RtcCertificatePem(String str, String str2) {
        this.privateKey = str;
        this.certificate = str2;
    }

    public static RtcCertificatePem generateCertificate(PeerConnection.KeyType keyType) {
        return nativeGenerateCertificate(keyType, DEFAULT_EXPIRY);
    }

    public static RtcCertificatePem generateCertificate(long j) {
        return nativeGenerateCertificate(PeerConnection.KeyType.ECDSA, j);
    }

    public static RtcCertificatePem generateCertificate(PeerConnection.KeyType keyType, long j) {
        return nativeGenerateCertificate(keyType, j);
    }

    public static RtcCertificatePem generateCertificate() {
        return nativeGenerateCertificate(PeerConnection.KeyType.ECDSA, DEFAULT_EXPIRY);
    }
}
