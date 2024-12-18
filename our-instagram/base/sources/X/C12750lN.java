package X;

import org.tukaani.xz.lzma.LZMAEncoder;
import org.tukaani.xz.rangecoder.RangeEncoder;

/* renamed from: X.0lN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12750lN extends AbstractC20490zQ {
    public static final C12750lN $redex_init_class = null;
    public C12760lO[] A00;
    public final /* synthetic */ LZMAEncoder A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12750lN(LZMAEncoder lZMAEncoder, int i) {
        super(lZMAEncoder, i, 0);
        this.A01 = lZMAEncoder;
        int i2 = 1 << i;
        C12760lO[] c12760lOArr = new C12760lO[i2];
        this.A00 = c12760lOArr;
        for (int i3 = 0; i3 < i2; i3++) {
            c12760lOArr[i3] = new C12760lO(this);
        }
    }

    static {
        if (LZMAEncoder.A0F == null) {
            try {
                LZMAEncoder.A0F = Class.forName("org.tukaani.xz.lzma.LZMAEncoder");
            } catch (ClassNotFoundException e) {
                throw new NoClassDefFoundError().initCause(e);
            }
        }
    }

    public final int A00(C20440zL c20440zL, int i, int i2, int i3, int i4) {
        int i5;
        LZMAEncoder lZMAEncoder = this.A01;
        short[][] sArr = ((AbstractC20480zP) lZMAEncoder).A0A;
        int i6 = c20440zL.A00;
        short s = sArr[i6][((AbstractC20480zP) lZMAEncoder).A00 & i4];
        int[] iArr = RangeEncoder.A06;
        int i7 = iArr[s >>> 4];
        int i8 = super.A00;
        int i9 = (i3 >> (8 - i8)) + ((i4 & super.A01) << i8);
        C12760lO[] c12760lOArr = this.A00;
        if (i6 < 7) {
            C12760lO c12760lO = c12760lOArr[i9];
            int i10 = i | 256;
            i5 = 0;
            do {
                short[] sArr2 = ((AbstractC20500zR) c12760lO).A00;
                i5 += iArr[(sArr2[i10 >>> 8] ^ ((-((i10 >>> 7) & 1)) & 2047)) >>> 4];
                i10 <<= 1;
            } while (i10 < 65536);
        } else {
            C12760lO c12760lO2 = c12760lOArr[i9];
            int i11 = 256;
            int i12 = i | 256;
            i5 = 0;
            do {
                i2 <<= 1;
                i5 += iArr[(((AbstractC20500zR) c12760lO2).A00[((i2 & i11) + i11) + (i12 >>> 8)] ^ ((-((i12 >>> 7) & 1)) & 2047)) >>> 4];
                i12 <<= 1;
                i11 &= (i2 ^ i12) ^ (-1);
            } while (i12 < 65536);
        }
        return i7 + i5;
    }
}
