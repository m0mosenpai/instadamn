package X;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: X.Sso, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63734Sso implements InterfaceC65320Thz {
    public final ByteBuffer A00 = ByteBuffer.allocate(8);

    @Override // X.InterfaceC65320Thz
    public final /* bridge */ /* synthetic */ void FA7(Object obj, MessageDigest messageDigest, byte[] bArr) {
        Number number = (Number) obj;
        messageDigest.update(bArr);
        ByteBuffer byteBuffer = this.A00;
        synchronized (byteBuffer) {
            byteBuffer.position(0);
            byteBuffer.putLong(number.longValue());
            messageDigest.update(byteBuffer.array());
        }
    }
}
