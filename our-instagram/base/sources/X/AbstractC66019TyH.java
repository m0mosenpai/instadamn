package X;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.TyH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66019TyH {
    public static final ByteBuffer A00(int i, int i2) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * i2 * 4);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        GLES20.glReadPixels(0, 0, i, i2, 6408, 5121, allocateDirect);
        allocateDirect.rewind();
        AbstractC66018TyG.A01("glReadPixels");
        return allocateDirect;
    }

    public static final void A01(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i * 4;
        int arrayOffset = byteBuffer.arrayOffset();
        int arrayOffset2 = byteBuffer.arrayOffset() + ((i2 - 1) * i3);
        byte[] bArr = new byte[i3];
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            if (i4 < i2 / 2) {
                System.arraycopy(byteBuffer.array(), arrayOffset, bArr, 0, i3);
                System.arraycopy(byteBuffer.array(), arrayOffset2, byteBuffer.array(), arrayOffset, i3);
                System.arraycopy(bArr, 0, byteBuffer.array(), arrayOffset2, i3);
                arrayOffset += i3;
                arrayOffset2 -= i3;
                i4 = i5;
            } else {
                byteBuffer.rewind();
                return;
            }
        }
    }

    public static final boolean A02(AbstractC70118W4q abstractC70118W4q, int i, int i2) {
        boolean z = false;
        try {
            C1GJ.A03(new C67996V5l(abstractC70118W4q, A00(i, i2), i, i2));
            z = true;
            return true;
        } catch (Exception | OutOfMemoryError e) {
            C0K8.A0H("IgLiveScreenshotCapturer", "Error saving frame to buffer.", e);
            return z;
        }
    }
}
