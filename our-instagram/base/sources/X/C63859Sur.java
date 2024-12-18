package X;

import java.nio.ByteBuffer;

/* renamed from: X.Sur, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63859Sur implements InterfaceC65326Ti7 {
    @Override // X.InterfaceC65326Ti7
    public final InterfaceC65558Tme F8B(C63729Ssj c63729Ssj, InterfaceC65558Tme interfaceC65558Tme) {
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = ((Q2P) interfaceC65558Tme.get()).A09.A00.A0E.A09.asReadOnlyBuffer();
        if (!asReadOnlyBuffer.isReadOnly() && asReadOnlyBuffer.hasArray()) {
            byte[] array = asReadOnlyBuffer.array();
            int arrayOffset = asReadOnlyBuffer.arrayOffset();
            int limit = asReadOnlyBuffer.limit();
            if (arrayOffset == 0 && limit == array.length) {
                bArr = asReadOnlyBuffer.array();
                return new C63786Stg(bArr);
            }
        }
        ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
        bArr = new byte[asReadOnlyBuffer2.limit()];
        asReadOnlyBuffer2.position(0);
        asReadOnlyBuffer2.get(bArr);
        return new C63786Stg(bArr);
    }
}
