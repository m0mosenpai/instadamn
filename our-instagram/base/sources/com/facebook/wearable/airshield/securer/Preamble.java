package com.facebook.wearable.airshield.securer;

import X.AbstractC58318PtA;
import X.C09170dP;
import X.C14360o3;
import X.C72569Xgx;
import X.Xh1;
import X.Xh8;
import com.facebook.jni.HybridData;
import com.facebook.wearable.airshield.security.Hash;
import com.facebook.wearable.datax.Connection;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class Preamble {
    public static final C72569Xgx Companion = new Object();
    public Connection connection;
    public final Object connectionLock;
    public final HybridData mHybridData;

    private final native void acceptAuthenticationNative(byte[] bArr, boolean z);

    private final native boolean asMainNative();

    private final native long connectionNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    private final native void rejectAuthenticationNative(int i);

    private final native byte[] rxChallengeNative();

    private final native int streamIdNative();

    private final native byte[] txChallengeNative();

    public final void acceptAuthentication(byte[] bArr, boolean z) {
        C14360o3.A0B(bArr, 0);
        acceptAuthenticationNative(bArr, z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Xgx] */
    static {
        C09170dP.A0C("airshield_light_mbed_jni");
    }

    private final Connection createConnection() {
        Xh8 xh8 = Connection.Companion;
        return new Connection(connectionNative());
    }

    public final Connection getConnection() {
        Connection connection;
        synchronized (this.connectionLock) {
            connection = this.connection;
            if (connection == null) {
                connection = createConnection();
                this.connection = connection;
            }
        }
        return connection;
    }

    public final Hash getRxChallenge() {
        Xh1 xh1 = Hash.Companion;
        byte[] rxChallengeNative = rxChallengeNative();
        C14360o3.A0B(rxChallengeNative, 0);
        Hash hash = new Hash(null);
        hash.setRaw(rxChallengeNative);
        return hash;
    }

    public final Hash getTxChallenge() {
        Xh1 xh1 = Hash.Companion;
        byte[] txChallengeNative = txChallengeNative();
        C14360o3.A0B(txChallengeNative, 0);
        Hash hash = new Hash(null);
        hash.setRaw(txChallengeNative);
        return hash;
    }

    public Preamble(HybridData hybridData) {
        this.connectionLock = AbstractC58318PtA.A0b();
        this.mHybridData = hybridData == null ? initHybrid() : hybridData;
    }

    public final boolean getAsMain() {
        return asMainNative();
    }

    public final int getStreamId() {
        return streamIdNative();
    }

    public final void rejectAuthentication(int i) {
        rejectAuthenticationNative(i);
    }

    public /* synthetic */ Preamble(HybridData hybridData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : hybridData);
    }
}
