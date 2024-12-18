package X;

import java.nio.ByteBuffer;

/* renamed from: X.WYp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70484WYp implements XEI {
    @Override // X.XEI
    public final YCL BmY() {
        return null;
    }

    @Override // X.XEI
    public final void E6B(ByteBuffer byteBuffer) {
    }

    @Override // X.XEI
    public final synchronized boolean Em1() {
        notify();
        return true;
    }

    @Override // X.XEI
    public final synchronized void FDt() {
        wait();
    }

    @Override // X.XEI
    public final void flush() {
    }

    @Override // X.XEI
    public final void release() {
    }
}
