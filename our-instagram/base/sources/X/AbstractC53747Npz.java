package X;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;

/* renamed from: X.Npz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53747Npz {
    public static AbstractC95034Pm A00(InterfaceC58313Pt5 interfaceC58313Pt5, ByteBuffer byteBuffer) {
        byte[] bArr;
        ByteBuffer byteBuffer2 = AbstractC54362O0u.A00;
        if (byteBuffer == null) {
            bArr = AbstractC54362O0u.A01;
        } else if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0 && byteBuffer.position() == 0 && byteBuffer.limit() == byteBuffer.capacity()) {
            bArr = byteBuffer.array();
        } else {
            ByteBuffer duplicate = byteBuffer.duplicate();
            bArr = new byte[duplicate.remaining()];
            duplicate.get(bArr);
        }
        C4PO c4po = C4PN.A02;
        return interfaceC58313Pt5.Bit(new C4PN(new ByteArrayInputStream(bArr)));
    }
}
