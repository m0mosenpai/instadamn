package com.facebook.wearable.datax;

import X.AbstractC166987dD;
import X.C14360o3;
import X.C63206SfA;
import X.C72342Xbe;
import X.C72574XhC;
import X.C73295Xzk;
import X.XM9;
import X.XkC;
import X.YKP;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public final class RemoteChannel extends XkC {
    public static final C72574XhC Companion = new Object();

    /* renamed from: native, reason: not valid java name */
    public final YKP f4native;

    private final native long allocateNative(long j);

    public static final native void deallocateNative(long j);

    private final native int idNative(long j);

    private final native int sendErrorNative(long j, int i);

    private final native int sendNative(long j, int i, ByteBuffer byteBuffer, int i2, int i3);

    public final void send(C73295Xzk c73295Xzk) {
        C14360o3.A0B(c73295Xzk, 0);
        ByteBuffer byteBuffer = c73295Xzk.A00;
        if (byteBuffer != null) {
            C63206SfA c63206SfA = new C63206SfA(sendNative(this.f4native.A00(), c73295Xzk.A01, byteBuffer, byteBuffer.position(), byteBuffer.remaining()));
            if (c63206SfA.equals(C63206SfA.A08)) {
                byteBuffer.position(byteBuffer.limit());
                return;
            }
            throw new C72342Xbe(c63206SfA);
        }
        throw AbstractC166987dD.A14("invalid buffer");
    }

    public final int getId() {
        return idNative(this.f4native.A00());
    }

    public RemoteChannel(long j) {
        this.f4native = new YKP(this, new XM9(Companion, 2), allocateNative(j));
    }

    public final void send(C63206SfA c63206SfA) {
        C14360o3.A0B(c63206SfA, 0);
        C63206SfA c63206SfA2 = new C63206SfA(sendErrorNative(this.f4native.A00(), c63206SfA.A00));
        if (c63206SfA2.equals(C63206SfA.A08)) {
        } else {
            throw new C72342Xbe(c63206SfA2);
        }
    }
}
