package X;

import java.io.EOFException;

/* renamed from: X.4bK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98414bK implements InterfaceC98054ak {
    public final byte[] A00 = new byte[4096];

    @Override // X.InterfaceC98054ak
    public final void AWa(C4B6 c4b6) {
    }

    @Override // X.InterfaceC98054ak
    public final void ELT(C98094ao c98094ao, int i, int i2, int i3, long j) {
    }

    @Override // X.InterfaceC98054ak
    public final void FDI(android.net.Uri uri) {
    }

    @Override // X.InterfaceC98054ak
    public final int ELR(InterfaceC92364Br interfaceC92364Br, int i, int i2, boolean z) {
        int read = interfaceC92364Br.read(this.A00, 0, Math.min(4096, i));
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }

    @Override // X.InterfaceC98054ak
    public final /* synthetic */ void ELN(C97974ac c97974ac, int i) {
        c97974ac.A0H(i);
    }

    @Override // X.InterfaceC98054ak
    public final void ELO(C97974ac c97974ac, int i, int i2) {
        c97974ac.A0H(i);
    }
}
