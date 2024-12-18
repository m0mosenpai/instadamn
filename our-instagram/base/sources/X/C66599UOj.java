package X;

import java.nio.ByteBuffer;

/* renamed from: X.UOj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66599UOj extends C56502ij implements X98 {
    @Override // X.X98
    public final void ANn(ByteBuffer byteBuffer, int i) {
        this.A03 = byteBuffer.get(i) & 255;
        this.A02 = byteBuffer.get(i + 1) & 255;
        this.A01 = byteBuffer.get(i + 2) & 255;
        this.A00 = byteBuffer.get(i + 3) & 255;
    }
}
