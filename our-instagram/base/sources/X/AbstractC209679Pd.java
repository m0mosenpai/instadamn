package X;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.9Pd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC209679Pd {
    public static final ByteBuffer A01(int i, int i2) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * i2 * 4);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        GLES20.glReadPixels(0, 0, i, i2, 6408, 5121, allocateDirect);
        allocateDirect.rewind();
        AbstractC180237zD.A02("glReadPixels", new Object[0]);
        return allocateDirect;
    }

    public static final Bitmap A00(int i, int i2) {
        ByteBuffer A01 = A01(i, i2);
        int i3 = i * 4;
        int arrayOffset = A01.arrayOffset();
        int arrayOffset2 = A01.arrayOffset() + ((i2 - 1) * i3);
        byte[] bArr = new byte[i3];
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            if (i4 < i2 / 2) {
                System.arraycopy(A01.array(), arrayOffset, bArr, 0, i3);
                System.arraycopy(A01.array(), arrayOffset2, A01.array(), arrayOffset, i3);
                System.arraycopy(bArr, 0, A01.array(), arrayOffset2, i3);
                arrayOffset += i3;
                arrayOffset2 -= i3;
                i4 = i5;
            } else {
                A01.rewind();
                Bitmap A0F = AbstractC167007dF.A0F(i, i2);
                A0F.copyPixelsFromBuffer(A01);
                return A0F;
            }
        }
    }
}
