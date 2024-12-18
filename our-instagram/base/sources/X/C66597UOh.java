package X;

import java.nio.ByteBuffer;

/* renamed from: X.UOh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66597UOh extends AbstractC68230VIq implements X98 {
    @Override // X.X98
    public final void ANn(ByteBuffer byteBuffer, int i) {
        byte[] A06 = WGe.A06(byteBuffer, i, 1);
        if (A06 != null) {
            this.A00 = A06;
            return;
        }
        throw new IllegalArgumentException("audio content cannot be null");
    }
}
