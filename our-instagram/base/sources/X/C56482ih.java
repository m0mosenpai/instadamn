package X;

import java.nio.ByteBuffer;

/* renamed from: X.2ih, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56482ih {
    public final byte A00;
    public final byte A01;
    public final float A02;
    public final C56502ij A03;
    public final C56502ij A04;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.2ij, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.2ij, java.lang.Object] */
    public C56482ih(C56472ig c56472ig, ByteBuffer byteBuffer) {
        C56502ij c56502ij;
        C56502ij c56502ij2;
        byte b = byteBuffer.get();
        int i = (b >> 6) & 3;
        int i2 = (b >> 4) & 3;
        if (i != 1 && i != 2) {
            c56502ij = null;
        } else {
            ?? obj = new Object();
            obj.A03 = 0;
            obj.A02 = 0;
            obj.A01 = 0;
            obj.A00 = 255;
            c56502ij = obj;
        }
        this.A03 = c56502ij;
        if (i2 != 1 && i2 != 2) {
            c56502ij2 = null;
        } else {
            ?? obj2 = new Object();
            obj2.A03 = 0;
            obj2.A02 = 0;
            obj2.A01 = 0;
            obj2.A00 = 255;
            c56502ij2 = obj2;
        }
        this.A04 = c56502ij2;
        this.A00 = (byte) ((b >> 2) & 3);
        this.A01 = (byte) (b & 3);
        this.A02 = c56472ig.A00 + ((byteBuffer.getShort() & 65535) * c56472ig.A01);
    }
}
