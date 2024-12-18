package X;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes10.dex */
public abstract class SVB {
    public static final AbstractC63036SbB A00;
    public static final ByteBuffer A01;
    public static final byte[] A05;
    public static final Charset A03 = Charset.forName("US-ASCII");
    public static final Charset A04 = AbstractC58318PtA.A0u();
    public static final Charset A02 = Charset.forName("ISO-8859-1");

    static {
        byte[] bArr = new byte[0];
        A05 = bArr;
        A01 = ByteBuffer.wrap(bArr);
        A00 = AbstractC63036SbB.A06(bArr, 0, 0);
    }

    public static RYn A00(Object obj, Object obj2) {
        AbstractC60877RXa A0J = ((RYn) ((TEQ) obj)).A0J();
        TEQ teq = (TEQ) obj2;
        if (A0J.A02.getClass().isInstance(teq)) {
            A0J.A05((RYn) teq);
            return A0J.A03();
        }
        throw AbstractC166987dD.A12("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
