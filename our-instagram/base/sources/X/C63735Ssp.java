package X;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: X.Ssp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63735Ssp implements InterfaceC65320Thz {
    public final ByteBuffer A00 = ByteBuffer.allocate(4);

    @Override // X.InterfaceC65320Thz
    public final /* bridge */ /* synthetic */ void FA7(Object obj, MessageDigest messageDigest, byte[] bArr) {
        Number number = (Number) obj;
        if (number != null) {
            messageDigest.update(bArr);
            ByteBuffer byteBuffer = this.A00;
            synchronized (byteBuffer) {
                byteBuffer.position(0);
                messageDigest.update(AbstractC58320PtC.A1Y(number, byteBuffer));
            }
        }
    }
}
