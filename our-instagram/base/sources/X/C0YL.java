package X;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* renamed from: X.0YL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0YL implements InterfaceC07170Zq {
    public int A00;
    public int A01;
    public int A02;
    public final byte[] A03 = new byte[50];
    public final byte[] A04 = new byte[50];

    public final Object A00() {
        int i = this.A02;
        if (i >= 0) {
            return new String(this.A04, 0, i, StandardCharsets.UTF_8);
        }
        int i2 = -i;
        if (i2 == 1) {
            return Integer.valueOf(this.A00);
        }
        throw new UnsupportedOperationException(AnonymousClass001.A0O("Unsupported annotation value: ", i2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(new String(this.A03, 0, this.A01, StandardCharsets.UTF_8));
        sb.append("->");
        sb.append(A00());
        return sb.toString();
    }

    @Override // X.InterfaceC07170Zq
    public final void E7t(ByteBuffer byteBuffer) {
        this.A01 = byteBuffer.get();
        this.A02 = byteBuffer.get();
        byteBuffer.get(this.A03, 0, this.A01);
        int i = this.A02;
        if (i >= 0) {
            byteBuffer.get(this.A04, 0, i);
            return;
        }
        int i2 = -i;
        if (i2 == 1) {
            this.A00 = byteBuffer.getInt();
            return;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0O("Unsupported annotation type: ", i2));
    }
}
