package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class RWN extends CodedOutputStream {
    public int A00;
    public final int A01;
    public final byte[] A02;

    public RWN(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.A02 = bArr;
            this.A00 = 0;
            this.A01 = i;
            return;
        }
        throw AbstractC58319PtB.A0j("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", AbstractC58320PtC.A1a(Integer.valueOf(length), 0, i));
    }

    public final void A0K(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.A02, this.A00, i2);
            this.A00 += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new IOException(AnonymousClass001.A0R("CodedOutputStream was writing to a flat byte array and ran out of space.: ", String.format("Pos: %d, limit: %d, len: %d", AbstractC58320PtC.A1a(Integer.valueOf(this.A00), this.A01, i2))), e);
        }
    }
}
