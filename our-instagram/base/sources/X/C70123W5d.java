package X;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.W5d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C70123W5d {
    public int A00;
    public C22978ABc A01;
    public C71071WnT A02;
    public final int A03;
    public final ByteBuffer A04;

    public C70123W5d(C71071WnT c71071WnT) {
        C22978ABc c22978ABc = c71071WnT.A00;
        c22978ABc.getClass();
        this.A01 = c22978ABc;
        int[] iArr = {0};
        GLES20.glGenBuffers(1, iArr, 0);
        int i = iArr[0];
        this.A03 = i;
        this.A04 = AbstractC65702TsY.A0j(1048576);
        this.A00 = 0;
        GLES20.glBindBuffer(34962, i);
        GLES20.glBufferData(34962, 1048576, null, 35048);
        GLES20.glBindBuffer(34962, 0);
        this.A02 = c71071WnT;
    }

    public final VBE A00() {
        ByteBuffer byteBuffer = this.A04;
        byteBuffer.getClass();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        asReadOnlyBuffer.rewind();
        asReadOnlyBuffer.limit(this.A00);
        ByteBuffer A0j = AbstractC65702TsY.A0j(this.A00);
        A0j.put(asReadOnlyBuffer);
        A0j.rewind();
        return new VBE(this.A01, A0j);
    }

    public final void A01(int i, int i2) {
        ByteBuffer byteBuffer;
        if (!(this instanceof VBE) && (byteBuffer = this.A04) != null) {
            int position = byteBuffer.position();
            byteBuffer.position(i);
            GLES20.glBufferSubData(34962, i, i2, byteBuffer);
            byteBuffer.position(position);
            this.A00 = Math.max(i + i2, this.A00);
        }
    }

    public final void finalize() {
        C22978ABc c22978ABc = this.A01;
        c22978ABc.A02.add(new RunnableC71383Wss(this.A03));
    }

    public C70123W5d(C22978ABc c22978ABc, ByteBuffer byteBuffer) {
        if (!byteBuffer.order().equals(ByteOrder.nativeOrder())) {
            C0K8.A0C("MappedBuffer", "MappedBuffer storage MUST be in native order");
        }
        int[] iArr = {0};
        GLES20.glGenBuffers(1, iArr, 0);
        this.A03 = iArr[0];
        this.A04 = null;
        this.A00 = 0;
        this.A01 = c22978ABc;
    }
}
