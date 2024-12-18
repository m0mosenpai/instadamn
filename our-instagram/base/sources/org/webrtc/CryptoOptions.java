package org.webrtc;

/* loaded from: classes12.dex */
public final class CryptoOptions {
    public final SFrame sframe;
    public final Srtp srtp;

    /* loaded from: classes12.dex */
    public class Builder {
        public boolean enableAes128Sha1_32CryptoCipher;
        public boolean enableEncryptedRtpHeaderExtensions;
        public boolean enableGcmCryptoSuites;
        public boolean requireFrameEncryption;

        public CryptoOptions createCryptoOptions() {
            return new CryptoOptions(this.enableGcmCryptoSuites, this.enableAes128Sha1_32CryptoCipher, this.enableEncryptedRtpHeaderExtensions, this.requireFrameEncryption);
        }

        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
        }

        public Builder setEnableAes128Sha1_32CryptoCipher(boolean z) {
            this.enableAes128Sha1_32CryptoCipher = z;
            return this;
        }

        public Builder setEnableEncryptedRtpHeaderExtensions(boolean z) {
            this.enableEncryptedRtpHeaderExtensions = z;
            return this;
        }

        public Builder setEnableGcmCryptoSuites(boolean z) {
            this.enableGcmCryptoSuites = z;
            return this;
        }

        public Builder setRequireFrameEncryption(boolean z) {
            this.requireFrameEncryption = z;
            return this;
        }

        public Builder() {
        }
    }

    /* loaded from: classes12.dex */
    public final class SFrame {
        public final boolean requireFrameEncryption;

        public SFrame(boolean z) {
            this.requireFrameEncryption = z;
        }

        public boolean getRequireFrameEncryption() {
            return this.requireFrameEncryption;
        }
    }

    /* loaded from: classes12.dex */
    public final class Srtp {
        public final boolean enableAes128Sha1_32CryptoCipher;
        public final boolean enableEncryptedRtpHeaderExtensions;
        public final boolean enableGcmCryptoSuites;

        public boolean getEnableAes128Sha1_32CryptoCipher() {
            return this.enableAes128Sha1_32CryptoCipher;
        }

        public boolean getEnableEncryptedRtpHeaderExtensions() {
            return this.enableEncryptedRtpHeaderExtensions;
        }

        public boolean getEnableGcmCryptoSuites() {
            return this.enableGcmCryptoSuites;
        }

        public Srtp(boolean z, boolean z2, boolean z3) {
            this.enableGcmCryptoSuites = z;
            this.enableAes128Sha1_32CryptoCipher = z2;
            this.enableEncryptedRtpHeaderExtensions = z3;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, org.webrtc.CryptoOptions$Builder] */
    public static Builder builder() {
        return new Object();
    }

    public SFrame getSFrame() {
        return this.sframe;
    }

    public Srtp getSrtp() {
        return this.srtp;
    }

    public CryptoOptions(boolean z, boolean z2, boolean z3, boolean z4) {
        this.srtp = new Srtp(z, z2, z3);
        this.sframe = new SFrame(z4);
    }
}
