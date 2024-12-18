package com.facebook.wearable.airshield.security;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C62179S1a;
import X.EnumC61094Rf8;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class Cipher {
    public static final C62179S1a Companion = new Object();
    public final HybridData mHybridData;
    public final EnumC61094Rf8 operation;

    public /* synthetic */ Cipher(EnumC61094Rf8 enumC61094Rf8, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC61094Rf8);
    }

    private final native long getHandleNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void setup(long j, boolean z, long j2);

    private final native int size();

    private final native boolean update(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3);

    public final boolean update(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        AbstractC167017dG.A1N(byteBuffer, byteBuffer2);
        if (byteBuffer.isDirect() && byteBuffer2.isDirect()) {
            return update(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), byteBuffer2, byteBuffer2.position());
        }
        throw AbstractC166987dD.A12("Byte buffer must be direct!");
    }

    public final EnumC61094Rf8 getOperation() {
        return this.operation;
    }

    public Cipher(EnumC61094Rf8 enumC61094Rf8) {
        this.operation = enumC61094Rf8;
        this.mHybridData = initHybrid();
    }

    public final long getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed() {
        return getHandleNative();
    }

    public final int getSize() {
        return size();
    }
}
