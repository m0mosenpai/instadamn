package X;

import java.nio.ByteBuffer;

/* renamed from: X.68x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1349868x extends C1349968y implements C68Y {
    @Override // X.C68Y
    public final void ANn(ByteBuffer byteBuffer, int i) {
        float[] A05 = AbstractC1348468a.A05(byteBuffer, i, 0);
        if (A05 != null) {
            this.A01 = A05;
            this.A00 = A05.length;
            return;
        }
        throw new IllegalArgumentException("values cannot be null");
    }
}
