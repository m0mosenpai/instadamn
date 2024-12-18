package X;

import java.nio.ByteBuffer;

/* renamed from: X.UOt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66609UOt extends C1349968y implements X98 {
    @Override // X.X98
    public final void ANn(ByteBuffer byteBuffer, int i) {
        float[] A07 = WGe.A07(byteBuffer, i, 0);
        if (A07 != null) {
            this.A01 = A07;
            this.A00 = A07.length;
            return;
        }
        throw new IllegalArgumentException("values cannot be null");
    }
}
