package X;

import org.tukaani.xz.LZMA2Options;
import org.tukaani.xz.lzma.LZMAEncoder;

/* renamed from: X.0Tt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06040Tt extends AbstractC14760oq implements InterfaceC14770or {
    public final LZMA2Options A00;
    public final byte[] A01;

    public C06040Tt(LZMA2Options lZMA2Options) {
        byte[] bArr = new byte[1];
        this.A01 = bArr;
        if (lZMA2Options.A04 == 0) {
            bArr[0] = 0;
        } else {
            bArr[0] = (byte) (LZMAEncoder.A00(Math.max(lZMA2Options.A01, 4096) - 1) - 23);
        }
        this.A00 = (LZMA2Options) lZMA2Options.clone();
    }
}
