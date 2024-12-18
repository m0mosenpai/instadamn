package com.facebook.wearable.datax;

import X.AbstractC72572XhA;
import X.C14360o3;
import X.C50358MLk;
import X.C72575XhD;
import X.C73295Xzk;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.XkC;
import X.YKP;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class Service extends XkC {
    public static final C72575XhD Companion = new Object();
    public static final String TAG = "DataXService";
    public final int id;

    /* renamed from: native, reason: not valid java name */
    public final YKP f5native;
    public InterfaceC16660sJ onConnected;
    public InterfaceC16660sJ onDisconnected;
    public InterfaceC16620sF onReceived;

    private final native long allocateNative(int i);

    public static final native void deallocateNative(long j);

    public static /* synthetic */ void getNative$annotations() {
    }

    private final native long handleNative(long j);

    private final native void unregisterNative(long j);

    public void onConnected(RemoteChannel remoteChannel) {
    }

    public void onDisconnected(RemoteChannel remoteChannel) {
    }

    public void onReceived(RemoteChannel remoteChannel, C73295Xzk c73295Xzk) {
    }

    public void onUnregister() {
    }

    private final void handleConnected(RemoteChannel remoteChannel) {
        InterfaceC16660sJ interfaceC16660sJ = this.onConnected;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(remoteChannel);
        }
    }

    private final void handleDisconnected(RemoteChannel remoteChannel) {
        InterfaceC16660sJ interfaceC16660sJ = this.onDisconnected;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(remoteChannel);
        }
        AbstractC72572XhA.A00();
    }

    public final long getHandle$fbandroid_java_com_facebook_wearable_datax_datax() {
        return handleNative(this.f5native.A00());
    }

    public final void unregister() {
        unregisterNative(this.f5native.A00());
        AbstractC72572XhA.A00();
    }

    public Service(int i) {
        this.id = i;
        this.f5native = new YKP(this, new C50358MLk(this, 26), allocateNative(i));
    }

    private final void handleReceived(RemoteChannel remoteChannel, int i, ByteBuffer byteBuffer) {
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        C14360o3.A07(asReadOnlyBuffer);
        C73295Xzk c73295Xzk = new C73295Xzk(i, asReadOnlyBuffer);
        try {
            ByteBuffer byteBuffer2 = c73295Xzk.A00;
            if (byteBuffer2 != null) {
                byteBuffer2.rewind();
            }
            InterfaceC16620sF interfaceC16620sF = this.onReceived;
            if (interfaceC16620sF != null) {
                interfaceC16620sF.invoke(remoteChannel, c73295Xzk);
            }
        } finally {
            c73295Xzk.A00 = null;
        }
    }

    public final int getId() {
        return this.id;
    }

    public final InterfaceC16660sJ getOnConnected() {
        return this.onConnected;
    }

    public final InterfaceC16660sJ getOnDisconnected() {
        return this.onDisconnected;
    }

    public final InterfaceC16620sF getOnReceived() {
        return this.onReceived;
    }

    public final void setOnConnected(InterfaceC16660sJ interfaceC16660sJ) {
        this.onConnected = interfaceC16660sJ;
    }

    public final void setOnDisconnected(InterfaceC16660sJ interfaceC16660sJ) {
        this.onDisconnected = interfaceC16660sJ;
    }

    public final void setOnReceived(InterfaceC16620sF interfaceC16620sF) {
        this.onReceived = interfaceC16620sF;
    }
}
