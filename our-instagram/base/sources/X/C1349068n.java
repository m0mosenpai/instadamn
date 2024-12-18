package X;

import java.nio.ByteBuffer;

/* renamed from: X.68n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1349068n implements C68Y {
    public byte A00;
    public byte A01;
    public int A02 = -1;
    public int A03 = -1;
    public C68k A04;
    public C68j A05;
    public C68h A06;
    public C68h A07;
    public C68h A08;
    public C68h A09;
    public C68h A0A;
    public byte[] A0B;
    public byte[] A0C;
    public C68h[] A0D;
    public String[] A0E;

    @Override // X.C68Y
    public final void ANn(ByteBuffer byteBuffer, int i) {
        int i2 = 0;
        int A00 = AbstractC1348468a.A00(byteBuffer, i, 0);
        if (A00 != 0) {
            i2 = byteBuffer.getInt(A00);
        }
        this.A02 = i2;
        this.A0B = AbstractC1348468a.A04(byteBuffer, i, 1);
    }
}
