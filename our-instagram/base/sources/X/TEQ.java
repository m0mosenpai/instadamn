package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes10.dex */
public abstract class TEQ implements InterfaceC65445TkH {
    public int memoizedHashCode = 0;

    public final int A0E() {
        RYn rYn = (RYn) this;
        int i = rYn.memoizedSerializedSize;
        if (i == -1) {
            int BtW = AbstractC58320PtC.A0f(rYn).BtW(rYn);
            rYn.memoizedSerializedSize = BtW;
            return BtW;
        }
        return i;
    }

    public static int A0D(InterfaceC65596Tnf interfaceC65596Tnf, Object obj, Object obj2) {
        RYn rYn = (RYn) obj;
        int i = rYn.memoizedSerializedSize;
        if (i == -1) {
            int BtW = interfaceC65596Tnf.BtW(obj2);
            rYn.memoizedSerializedSize = BtW;
            return BtW;
        }
        return i;
    }

    public final void A0F(CodedOutputStream codedOutputStream) {
        InterfaceC65596Tnf A0f = AbstractC58320PtC.A0f(this);
        SCD scd = codedOutputStream.A00;
        if (scd == null) {
            scd = new SCD(codedOutputStream);
        }
        A0f.FEo(scd, this);
    }

    public final void A0G(OutputStream outputStream) {
        int A0E = A0E();
        if (A0E > 4096) {
            A0E = 4096;
        }
        RWO rwo = new RWO(outputStream, A0E);
        A0F(rwo);
        if (rwo.A00 > 0) {
            RWO.A03(rwo);
        }
    }

    public final byte[] A0H() {
        try {
            int A0E = A0E();
            byte[] bArr = new byte[A0E];
            RWN rwn = new RWN(bArr, A0E);
            A0F(rwn);
            if (rwn.A01 - rwn.A00 == 0) {
                return bArr;
            }
            throw AbstractC166987dD.A14("Did not write as much data as expected.");
        } catch (IOException e) {
            throw AbstractC58318PtA.A0e(AnonymousClass001.A11("Serializing ", MSY.A0h(this), " to a ", "byte array", " threw an IOException (should never happen)."), e);
        }
    }
}
