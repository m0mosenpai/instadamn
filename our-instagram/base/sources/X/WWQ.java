package X;

import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
public final class WWQ implements X98 {
    public float A00;
    public int[] A01;

    @Override // X.X98
    public final void ANn(ByteBuffer byteBuffer, int i) {
        C14360o3.A0B(byteBuffer, 0);
        this.A00 = WGe.A00(byteBuffer, i, 0);
        int[] A08 = WGe.A08(byteBuffer, i, 1);
        if (A08 != null) {
            this.A01 = A08;
            return;
        }
        throw new IllegalArgumentException("bitmap indices cannot be null");
    }
}
