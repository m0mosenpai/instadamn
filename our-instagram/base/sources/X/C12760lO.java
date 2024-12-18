package X;

import org.tukaani.xz.lz.LZEncoder;
import org.tukaani.xz.lzma.LZMAEncoder;
import org.tukaani.xz.rangecoder.RangeEncoder;

/* renamed from: X.0lO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12760lO extends AbstractC20500zR {
    public final /* synthetic */ C12750lN A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12760lO(C12750lN c12750lN) {
        super(c12750lN);
        this.A00 = c12750lN;
    }

    public final void A00() {
        C12750lN c12750lN = this.A00;
        C12750lN c12750lN2 = C12750lN.$redex_init_class;
        LZMAEncoder lZMAEncoder = c12750lN.A01;
        LZEncoder lZEncoder = lZMAEncoder.A07;
        int i = lZMAEncoder.A03;
        byte[] bArr = lZEncoder.A08;
        int i2 = lZEncoder.A02;
        int i3 = 256;
        int i4 = (bArr[i2 - i] & 255) | 256;
        C20440zL c20440zL = ((AbstractC20480zP) lZMAEncoder).A01;
        boolean z = false;
        if (c20440zL.A00 < 7) {
            z = true;
        }
        if (!z) {
            int i5 = bArr[i2 - ((((AbstractC20480zP) lZMAEncoder).A02[0] + 1) + i)] & 255;
            do {
                i5 <<= 1;
                lZMAEncoder.A0B.A03(super.A00, (i5 & i3) + i3 + (i4 >>> 8), (i4 >>> 7) & 1);
                i4 <<= 1;
                i3 &= (i5 ^ i4) ^ (-1);
            } while (i4 < 65536);
            c20440zL.A00();
        }
        do {
            RangeEncoder rangeEncoder = lZMAEncoder.A0B;
            short[] sArr = super.A00;
            rangeEncoder.A03(sArr, i4 >>> 8, (i4 >>> 7) & 1);
            i4 <<= 1;
        } while (i4 < 65536);
        c20440zL.A00();
    }
}
