package com.facebook.wearable.datax;

import X.AbstractC166987dD;
import X.AbstractC25232BEp;
import X.AbstractC72572XhA;
import X.C14360o3;
import X.C63206SfA;
import X.C72342Xbe;
import X.C72823XoB;
import X.InterfaceC16610sE;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.XM9;
import X.Xh8;
import X.XkC;
import X.YKP;
import com.facebook.wearable.datax.util.MessageInfo;
import java.io.Closeable;
import java.nio.ByteBuffer;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* loaded from: classes12.dex */
public final class Connection extends XkC implements Closeable {
    public static final Xh8 Companion = new Object();

    /* renamed from: native, reason: not valid java name */
    public final YKP f2native;
    public InterfaceC16660sJ onRead;
    public InterfaceC16610sE onWriteError;
    public final C72823XoB receiveFragment;
    public final InterfaceC16620sF writer;

    private final native long allocateNative(long j);

    private final native void closeNative(long j);

    private final native boolean closedNative(long j);

    public static final native void deallocateNative(long j);

    private final native MessageInfo getMessageInfoNative(long j, ByteBuffer byteBuffer, int i, int i2, boolean z);

    private final native long handleNative(long j);

    private final native int interruptCodeNative(long j);

    private final native void interruptNative(long j, int i);

    private final native int mtuNative(long j);

    private final native boolean onReceivedNative(long j, ByteBuffer byteBuffer, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public final native int pollReceiveFragmentNative(long j, ByteBuffer byteBuffer, int i);

    private final native void registerServiceNative(long j, long j2);

    private final native void resetNative(long j);

    private final native int versionNative(long j);

    public final MessageInfo getMessageInfo(ByteBuffer byteBuffer, boolean z) {
        C14360o3.A0B(byteBuffer, 0);
        return getMessageInfoNative(this.f2native.A00(), byteBuffer, byteBuffer.remaining(), byteBuffer.position(), z);
    }

    public final void interruptWithError(C63206SfA c63206SfA) {
        C14360o3.A0B(c63206SfA, 0);
        interruptNative(this.f2native.A00(), c63206SfA.A00);
    }

    @Deprecated(message = "Received data can be interrupted with error", replaceWith = @ReplaceWith(expression = "onReceivedWithInterrupt(bytes: ByteBuffer): Error", imports = {}))
    public final void onReceived(ByteBuffer byteBuffer) {
        C14360o3.A0B(byteBuffer, 0);
        if (byteBuffer.isDirect()) {
            if (onReceivedNative(this.f2native.A00(), byteBuffer, byteBuffer.position(), byteBuffer.remaining())) {
                byteBuffer.position(byteBuffer.limit());
                return;
            }
            throw new C72342Xbe(C63206SfA.A07);
        }
        throw AbstractC166987dD.A14("Bytes buffer must be direct");
    }

    public final C63206SfA onReceivedWithInterrupt(ByteBuffer byteBuffer) {
        C14360o3.A0B(byteBuffer, 0);
        if (byteBuffer.isDirect()) {
            int position = byteBuffer.position();
            int remaining = byteBuffer.remaining();
            byteBuffer.position(byteBuffer.limit());
            if (onReceivedNative(this.f2native.A00(), byteBuffer, position, remaining)) {
                int interruptCodeNative = interruptCodeNative(this.f2native.A00());
                if (interruptCodeNative != 0) {
                    return new C63206SfA(interruptCodeNative);
                }
                return C63206SfA.A08;
            }
            throw new C72342Xbe(C63206SfA.A07);
        }
        throw AbstractC166987dD.A14("Bytes buffer must be direct");
    }

    public final void register(Service service) {
        C14360o3.A0B(service, 0);
        registerServiceNative(this.f2native.A00(), service.getHandle$fbandroid_java_com_facebook_wearable_datax_datax());
    }

    private final void handleRead(MessageInfo messageInfo) {
        InterfaceC16660sJ interfaceC16660sJ = this.onRead;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(messageInfo);
        }
    }

    private final int handleWrite(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        InterfaceC16620sF interfaceC16620sF = this.writer;
        if (interfaceC16620sF != null) {
            return ((C63206SfA) interfaceC16620sF.invoke(byteBuffer, byteBuffer2)).A00;
        }
        throw AbstractC166987dD.A14("invalid connection configuration");
    }

    private final int handleWriteError(int i, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        C63206SfA c63206SfA;
        InterfaceC16610sE interfaceC16610sE = this.onWriteError;
        if (interfaceC16610sE != null && (c63206SfA = (C63206SfA) interfaceC16610sE.invoke(new C63206SfA(i), byteBuffer, byteBuffer2)) != null) {
            return c63206SfA.A00;
        }
        return i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        closeNative(this.f2native.A00());
        AbstractC72572XhA.A00();
    }

    public final boolean getClosed() {
        if (this.f2native.A01.get() != 0 && !closedNative(this.f2native.A00())) {
            return false;
        }
        return true;
    }

    public final long getHandle$fbandroid_java_com_facebook_wearable_datax_datax() {
        return handleNative(this.f2native.A00());
    }

    public final int getMtu() {
        return mtuNative(this.f2native.A00());
    }

    public final int getVersion() {
        return versionNative(this.f2native.A00());
    }

    public final LocalChannel openChannel(int i) {
        return new LocalChannel(this, i);
    }

    public final void reset() {
        resetNative(this.f2native.A00());
    }

    public Connection(Long l, InterfaceC16620sF interfaceC16620sF) {
        this.writer = interfaceC16620sF;
        this.f2native = new YKP(this, new XM9(Companion, 0), allocateNative(AbstractC25232BEp.A0t(l)));
        this.receiveFragment = new C72823XoB(this);
    }

    public final InterfaceC16660sJ getOnRead() {
        return this.onRead;
    }

    public final InterfaceC16610sE getOnWriteError() {
        return this.onWriteError;
    }

    public final C72823XoB getReceiveFragment() {
        return this.receiveFragment;
    }

    public final void setOnRead(InterfaceC16660sJ interfaceC16660sJ) {
        this.onRead = interfaceC16660sJ;
    }

    public final void setOnWriteError(InterfaceC16610sE interfaceC16610sE) {
        this.onWriteError = interfaceC16610sE;
    }

    public Connection(long j) {
        this(Long.valueOf(j), null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Connection(InterfaceC16620sF interfaceC16620sF) {
        this(null, interfaceC16620sF);
        C14360o3.A0B(interfaceC16620sF, 1);
    }
}
