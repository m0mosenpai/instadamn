package X;

import com.facebook.common.dextricks.Constants;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.2oF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59722oF {
    public int A00;
    public final C1O3 A04;
    public byte[] A02 = new byte[Constants.LOAD_RESULT_PGO_ATTEMPTED];
    public final byte[] A03 = new byte[4096];
    public boolean A01 = false;

    public final void A01() {
        this.A01 = false;
        this.A00 = 0;
        C1O3 c1o3 = this.A04;
        C1O4 c1o4 = c1o3.A00;
        if (this.A02.length <= 1310720) {
            ConcurrentLinkedQueue concurrentLinkedQueue = c1o3.A01;
            if (concurrentLinkedQueue.size() < c1o4.A00) {
                concurrentLinkedQueue.add(this);
            }
        }
    }

    public C59722oF(C1O3 c1o3) {
        this.A04 = c1o3;
    }

    private void A00(byte[] bArr, int i, int i2) {
        int i3 = this.A00;
        int i4 = (i3 + i) - i2;
        byte[] bArr2 = this.A02;
        int length = bArr2.length;
        if (i4 > length) {
            byte[] bArr3 = new byte[Math.max(length << 1, i4)];
            System.arraycopy(bArr2, 0, bArr3, 0, i3);
            this.A02 = bArr3;
            bArr2 = bArr3;
        }
        System.arraycopy(bArr, i2, bArr2, this.A00, i - i2);
        this.A00 = i4;
    }

    public final void A02(InputStream inputStream) {
        while (true) {
            byte[] bArr = this.A03;
            int read = inputStream.read(bArr);
            if (read != -1) {
                if (!this.A01) {
                    if (read >= 0) {
                        if (read != 0) {
                            A00(bArr, read, 0);
                        }
                    } else {
                        throw new IndexOutOfBoundsException(AnonymousClass001.A0O("Negative length detected : ", read));
                    }
                } else {
                    throw new RuntimeException("The buffer is already frozen");
                }
            } else {
                return;
            }
        }
    }

    public final void A03(ByteBuffer byteBuffer) {
        if (!this.A01) {
            if (byteBuffer.limit() != 0) {
                A00(byteBuffer.array(), byteBuffer.limit(), byteBuffer.position());
                return;
            }
            return;
        }
        throw new RuntimeException("The buffer is already frozen");
    }
}
