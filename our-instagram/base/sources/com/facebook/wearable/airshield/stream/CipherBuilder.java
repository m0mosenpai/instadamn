package com.facebook.wearable.airshield.stream;

import X.AbstractC166987dD;
import X.C09170dP;
import X.C14360o3;
import X.InterfaceC09390do;
import X.Xh7;
import com.facebook.jni.HybridData;
import com.facebook.wearable.airshield.security.Hash;
import com.facebook.wearable.airshield.security.InitializationVector;
import com.facebook.wearable.airshield.security.PrivateKey;
import com.facebook.wearable.airshield.security.PublicKey;
import com.facebook.wearable.airshield.security.Random;

/* loaded from: classes12.dex */
public final class CipherBuilder {
    public static final int CHALLENGE_SIZE = 16;
    public static final Xh7 Companion = new Object();
    public static final int SEED_SIZE = 32;
    public byte[] challenge;
    public InitializationVector initializationVector;
    public final HybridData mHybridData = initHybrid();
    public PrivateKey privateKey;
    public PublicKey remotePublicKey;
    public byte[] seed;

    private final native Framing buildDecryptionFramingNative(int i, boolean z);

    private final native Framing buildEncryptionFramingNative(int i, boolean z);

    private final native Hash buildRxChallengeNative();

    private final native Hash buildTxChallengeNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    private final native void setChallengeNative(byte[] bArr);

    private final native void setInitializationVectorNative(long j);

    private final native void setPrivateKey(long j);

    private final native void setRemotePublicKeyNative(long j);

    private final native void setSeedNative(byte[] bArr);

    public final void setChallenge(byte[] bArr) {
        C14360o3.A0B(bArr, 0);
        this.challenge = bArr;
        setChallengeNative(bArr);
    }

    public final void setInitializationVector(InitializationVector initializationVector) {
        C14360o3.A0B(initializationVector, 0);
        this.initializationVector = initializationVector;
        setInitializationVectorNative(initializationVector.getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed());
    }

    public final void setPrivateKey(PrivateKey privateKey) {
        C14360o3.A0B(privateKey, 0);
        this.privateKey = privateKey;
        setPrivateKey(privateKey.getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed());
    }

    public final void setSeed(byte[] bArr) {
        C14360o3.A0B(bArr, 0);
        this.seed = bArr;
        setSeedNative(bArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Xh7] */
    static {
        C09170dP.A0C("airshield_light_mbed_jni");
    }

    private final void checkValues() {
        if (this.remotePublicKey != null) {
        } else {
            throw AbstractC166987dD.A14("RemotePublicKey was not set");
        }
    }

    public final PublicKey getPublicKey() {
        return this.privateKey.recoverPublicKey();
    }

    public final void setRemotePublicKey(PublicKey publicKey) {
        if (publicKey != null) {
            this.remotePublicKey = publicKey;
            setRemotePublicKeyNative(publicKey.getNative());
            return;
        }
        throw AbstractC166987dD.A14("remote public key is null");
    }

    public CipherBuilder() {
        PrivateKey privateKey = new PrivateKey();
        privateKey.generate();
        setPrivateKey(privateKey.getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed());
        this.privateKey = privateKey;
        byte[] bArr = new byte[16];
        InterfaceC09390do interfaceC09390do = Random.instance;
        ((Random) interfaceC09390do.getValue()).bytesNative(bArr);
        setChallengeNative(bArr);
        this.challenge = bArr;
        byte[] bArr2 = new byte[32];
        ((Random) interfaceC09390do.getValue()).bytesNative(bArr2);
        setSeedNative(bArr2);
        this.seed = bArr2;
        InitializationVector initializationVector = new InitializationVector();
        initializationVector.generate();
        setInitializationVectorNative(initializationVector.getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed());
        this.initializationVector = initializationVector;
    }

    public final Framing buildDecryptionFraming(int i, boolean z) {
        checkValues();
        return buildDecryptionFramingNative(i, z);
    }

    public final Framing buildEncryptionFraming(int i, boolean z) {
        checkValues();
        return buildEncryptionFramingNative(i, z);
    }

    public final Hash buildRxChallenge() {
        checkValues();
        return buildRxChallengeNative();
    }

    public final Hash buildTxChallenge() {
        checkValues();
        return buildTxChallengeNative();
    }

    public final byte[] getChallenge() {
        return this.challenge;
    }

    public final InitializationVector getInitializationVector() {
        return this.initializationVector;
    }

    public final PrivateKey getPrivateKey() {
        return this.privateKey;
    }

    public final PublicKey getRemotePublicKey() {
        return this.remotePublicKey;
    }

    public final byte[] getSeed() {
        return this.seed;
    }
}
