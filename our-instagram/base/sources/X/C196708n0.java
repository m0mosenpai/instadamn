package X;

import android.graphics.Rect;
import android.media.Image;
import android.util.Pair;
import java.nio.ByteBuffer;

/* renamed from: X.8n0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196708n0 {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public Pair A04;
    public Float A05;
    public Long A06;
    public Long A07;
    public boolean A08;
    public byte[] A09;
    public float[] A0A;
    public C22904A7z[] A0B;
    public Rect A0C;

    public static void A00(Image image, C177637ux c177637ux, C196708n0 c196708n0, boolean z) {
        float[] fArr = (float[]) c177637ux.A00(C177637ux.A0Q);
        c196708n0.A02(image, (Pair) c177637ux.A00(C177637ux.A0N), (Float) c177637ux.A00(C177637ux.A0M), (Long) c177637ux.A00(C177637ux.A0O), (Long) c177637ux.A00(C177637ux.A0K), fArr, z, false);
    }

    public final void A01() {
        if (this.A0B != null) {
            int i = 0;
            while (true) {
                C22904A7z[] c22904A7zArr = this.A0B;
                if (i >= c22904A7zArr.length) {
                    break;
                }
                C22904A7z c22904A7z = c22904A7zArr[i];
                ByteBuffer byteBuffer = c22904A7z.A02;
                if (byteBuffer != null) {
                    byteBuffer.clear();
                    c22904A7z.A02 = null;
                }
                i++;
            }
            this.A0B = null;
        }
        this.A09 = null;
        this.A0A = null;
        this.A04 = null;
        this.A07 = null;
        this.A05 = null;
        this.A06 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r0 != r3) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(android.media.Image r7, android.util.Pair r8, java.lang.Float r9, java.lang.Long r10, java.lang.Long r11, float[] r12, boolean r13, boolean r14) {
        /*
            r6 = this;
            r6.A08 = r13
            android.media.Image$Plane[] r4 = r7.getPlanes()
            X.A7z[] r0 = r6.A0B
            if (r0 == 0) goto Le
            int r0 = r0.length
            int r3 = r4.length
            if (r0 == r3) goto L13
        Le:
            int r3 = r4.length
            X.A7z[] r0 = new X.C22904A7z[r3]
            r6.A0B = r0
        L13:
            r2 = 0
        L14:
            if (r2 >= r3) goto L5f
            X.A7z[] r1 = r6.A0B
            r0 = r1[r2]
            if (r0 != 0) goto L23
            X.A7z r0 = new X.A7z
            r0.<init>()
            r1[r2] = r0
        L23:
            r5 = r1[r2]
            r0 = r4[r2]
            java.nio.ByteBuffer r1 = r0.getBuffer()
            if (r14 == 0) goto L42
            int r0 = r1.capacity()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r1.rewind()
            r0.put(r1)
            r1.rewind()
            r0.flip()
            r1 = r0
        L42:
            r5.A02 = r1
            X.A7z[] r0 = r6.A0B
            r1 = r0[r2]
            r0 = r4[r2]
            int r0 = r0.getPixelStride()
            r1.A00 = r0
            X.A7z[] r0 = r6.A0B
            r1 = r0[r2]
            r0 = r4[r2]
            int r0 = r0.getRowStride()
            r1.A01 = r0
            int r2 = r2 + 1
            goto L14
        L5f:
            r6.A0A = r12
            r6.A04 = r8
            r6.A07 = r10
            r6.A05 = r9
            r6.A06 = r11
            int r0 = r7.getFormat()
            r6.A01 = r0
            long r0 = r7.getTimestamp()
            r6.A03 = r0
            int r0 = r7.getWidth()
            r6.A02 = r0
            int r0 = r7.getHeight()
            r6.A00 = r0
            android.graphics.Rect r0 = r7.getCropRect()
            r6.A0C = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196708n0.A02(android.media.Image, android.util.Pair, java.lang.Float, java.lang.Long, java.lang.Long, float[], boolean, boolean):void");
    }
}
