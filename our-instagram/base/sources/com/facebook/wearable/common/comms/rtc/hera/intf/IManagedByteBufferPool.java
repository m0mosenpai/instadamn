package com.facebook.wearable.common.comms.rtc.hera.intf;

import X.C00O;
import X.InterfaceC16660sJ;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public interface IManagedByteBufferPool {
    IBuffer poll(long j);

    IBuffer poll(long j, TimeUnit timeUnit);

    /* loaded from: classes10.dex */
    public abstract class IBuffer implements AutoCloseable {
        @Override // java.lang.AutoCloseable
        public abstract void close();

        public abstract Object consume(InterfaceC16660sJ interfaceC16660sJ);

        public abstract void dispose();

        public abstract ByteBuffer getBuffer();

        public abstract int getLimit();

        public abstract void setLimit(int i);

        public IBuffer() {
            throw C00O.createAndThrow();
        }
    }
}
