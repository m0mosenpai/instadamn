package X;

import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
public final class WWR implements X98 {
    public int[] A00;
    public AbstractC56612iu[] A01;
    public byte[] A02;

    @Override // X.X98
    public final void ANn(ByteBuffer byteBuffer, int i) {
        String A05 = WGe.A05(byteBuffer, i, 0);
        if (A05 != null && !A05.isEmpty()) {
            int[] A08 = WGe.A08(byteBuffer, i, 1);
            if (A08 != null) {
                this.A00 = A08;
                this.A01 = new AbstractC56612iu[A08.length];
                byte[] A06 = WGe.A06(byteBuffer, i, 2);
                if (A06 != null) {
                    this.A02 = A06;
                    return;
                }
                throw new IllegalArgumentException("variable props array cannot be null");
            }
            throw new IllegalArgumentException("variable layerIds array cannot be null");
        }
        throw new IllegalArgumentException("variable name cannot be null");
    }
}
