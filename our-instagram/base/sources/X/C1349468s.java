package X;

import java.nio.ByteBuffer;

/* renamed from: X.68s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1349468s implements C68Y {
    public byte A00;
    public C68g A01;
    public C68g A02;
    public C68g A03;

    @Override // X.C68Y
    public final void ANn(ByteBuffer byteBuffer, int i) {
        byte b = 0;
        int A00 = AbstractC1348468a.A00(byteBuffer, i, 0);
        if (A00 != 0) {
            b = byteBuffer.get(A00);
        }
        this.A00 = b;
        C68g c68g = (C68g) AbstractC1348468a.A01(C68g.class, byteBuffer, i, 1);
        if (c68g != null) {
            this.A03 = c68g;
            C68g c68g2 = (C68g) AbstractC1348468a.A01(C68g.class, byteBuffer, i, 2);
            if (c68g2 != null) {
                this.A01 = c68g2;
                C68g c68g3 = (C68g) AbstractC1348468a.A01(C68g.class, byteBuffer, i, 3);
                if (c68g3 != null) {
                    this.A02 = c68g3;
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("point cannot be null");
    }
}
