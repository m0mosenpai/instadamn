package X;

import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class S2H {
    public static long A00(InterfaceC65245Tgb interfaceC65245Tgb) {
        byte[] bArr = (byte[]) ((C64217T4g) interfaceC65245Tgb).A01.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }
}
