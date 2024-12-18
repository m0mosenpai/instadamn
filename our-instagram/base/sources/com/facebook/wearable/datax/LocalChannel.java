package com.facebook.wearable.datax;

import X.AbstractC166987dD;
import X.AbstractC72572XhA;
import X.C14360o3;
import X.C63206SfA;
import X.C72342Xbe;
import X.C72573XhB;
import X.C73295Xzk;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.XM9;
import X.XkC;
import X.YKP;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public final class LocalChannel extends XkC implements Closeable {
    public static final C72573XhB Companion = new Object();

    /* renamed from: native, reason: not valid java name */
    public final YKP f3native;
    public InterfaceC16820sZ onClosed;
    public InterfaceC16660sJ onError;
    public InterfaceC16660sJ onReceived;
    public final int service;

    public LocalChannel(Connection connection, int i) {
        C14360o3.A0B(connection, 1);
        this.service = i;
        this.f3native = new YKP(this, new XM9(Companion, 1), allocateNative(connection.getHandle$fbandroid_java_com_facebook_wearable_datax_datax(), i));
    }

    private final native long allocateNative(long j, int i);

    private final native void closeNative(long j);

    private final native boolean closedNative(long j);

    public static final native void deallocateNative(long j);

    private final native int idNative(long j);

    private final native int sendNative(long j, int i, ByteBuffer byteBuffer, int i2, int i3);

    public final void send(C73295Xzk c73295Xzk) {
        C14360o3.A0B(c73295Xzk, 0);
        ByteBuffer byteBuffer = c73295Xzk.A00;
        if (byteBuffer != null) {
            C63206SfA c63206SfA = new C63206SfA(sendNative(this.f3native.A00(), c73295Xzk.A01, byteBuffer, byteBuffer.position(), byteBuffer.remaining()));
            if (c63206SfA.equals(C63206SfA.A08)) {
                byteBuffer.position(byteBuffer.limit());
                return;
            }
            throw new C72342Xbe(c63206SfA);
        }
        throw AbstractC166987dD.A14("invalid buffer");
    }

    private final void handleClosed() {
        InterfaceC16820sZ interfaceC16820sZ = this.onClosed;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
        AbstractC72572XhA.A00();
    }

    private final void handleError(int i) {
        InterfaceC16660sJ interfaceC16660sJ = this.onError;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(new C72342Xbe(new C63206SfA(i)));
        }
    }

    private final void handleReceived(int i, ByteBuffer byteBuffer) {
        InterfaceC16660sJ interfaceC16660sJ = this.onReceived;
        if (interfaceC16660sJ != null) {
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            C14360o3.A07(asReadOnlyBuffer);
            C73295Xzk c73295Xzk = new C73295Xzk(i, asReadOnlyBuffer);
            try {
                interfaceC16660sJ.invoke(c73295Xzk);
            } finally {
                c73295Xzk.A00 = null;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        closeNative(this.f3native.A00());
    }

    public final boolean getClosed() {
        if (this.f3native.A01.get() != 0 && !closedNative(this.f3native.A00())) {
            return false;
        }
        return true;
    }

    public final int getId() {
        return idNative(this.f3native.A00());
    }

    public final InterfaceC16820sZ getOnClosed() {
        return this.onClosed;
    }

    public final InterfaceC16660sJ getOnError() {
        return this.onError;
    }

    public final InterfaceC16660sJ getOnReceived() {
        return this.onReceived;
    }

    public final int getService() {
        return this.service;
    }

    public final void setOnClosed(InterfaceC16820sZ interfaceC16820sZ) {
        this.onClosed = interfaceC16820sZ;
    }

    public final void setOnError(InterfaceC16660sJ interfaceC16660sJ) {
        this.onError = interfaceC16660sJ;
    }

    public final void setOnReceived(InterfaceC16660sJ interfaceC16660sJ) {
        this.onReceived = interfaceC16660sJ;
    }
}
