package X;

import java.nio.ByteBuffer;

/* renamed from: X.0WX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0WX implements InterfaceC07170Zq {
    public int A00;

    public final String toString() {
        return String.valueOf(this.A00);
    }

    @Override // X.InterfaceC07170Zq
    public final void E7t(ByteBuffer byteBuffer) {
        this.A00 = byteBuffer.getInt();
    }
}
