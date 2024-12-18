package com.google.protobuf;

import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.AbstractC58322PtE;
import X.AbstractC58323PtF;
import X.AbstractC58324PtG;
import X.AbstractC63073Sbv;
import X.AbstractC64538TIu;
import X.C61026Rdu;
import X.InterfaceC65596Tnf;
import X.RWI;
import X.RWN;
import X.RWO;
import X.RkR;
import X.S92;
import X.SCD;
import X.SU7;
import X.SVB;
import X.TEQ;
import com.facebook.common.dextricks.StringTreeSet;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes10.dex */
public abstract class CodedOutputStream extends AbstractC63073Sbv {
    public static final Logger A01 = AbstractC58319PtB.A17(CodedOutputStream.class);
    public static final boolean A02 = UnsafeUtil.A04;
    public SCD A00;

    public static int A01(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        int i = 2;
        if (((-34359738368L) & j) != 0) {
            i = 6;
            j >>>= 28;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public final void A05(byte b) {
        if (this instanceof RWO) {
            RWO rwo = (RWO) this;
            if (rwo.A00 == rwo.A02) {
                RWO.A03(rwo);
            }
            byte[] bArr = rwo.A03;
            int i = rwo.A00;
            rwo.A00 = i + 1;
            bArr[i] = b;
            rwo.A01++;
            return;
        }
        RWN rwn = (RWN) this;
        try {
            byte[] bArr2 = rwn.A02;
            int i2 = rwn.A00;
            rwn.A00 = i2 + 1;
            bArr2[i2] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new IOException(AbstractC58321PtD.A0s(rwn.A01, Integer.valueOf(rwn.A00)), e);
        }
    }

    public final void A06(int i) {
        if (this instanceof RWO) {
            RWO rwo = (RWO) this;
            RWO.A04(rwo, 4);
            byte[] bArr = rwo.A03;
            int A0D = AbstractC58323PtF.A0D(bArr, rwo.A00, i);
            rwo.A00 = A0D + 1;
            AbstractC58318PtA.A19(i >> 24, bArr, A0D);
            rwo.A01 += 4;
            return;
        }
        RWN rwn = (RWN) this;
        try {
            byte[] bArr2 = rwn.A02;
            int A0D2 = AbstractC58323PtF.A0D(bArr2, rwn.A00, i);
            rwn.A00 = A0D2 + 1;
            AbstractC58318PtA.A19(i >> 24, bArr2, A0D2);
        } catch (IndexOutOfBoundsException e) {
            throw new IOException(AbstractC58321PtD.A0s(rwn.A01, Integer.valueOf(rwn.A00)), e);
        }
    }

    public final void A07(int i) {
        long j;
        byte b;
        if (this instanceof RWO) {
            RWO rwo = (RWO) this;
            RWO.A04(rwo, 5);
            rwo.A0K(i);
            return;
        }
        RWN rwn = (RWN) this;
        if (A02 && (S92.A00 == null || S92.A01)) {
            int i2 = rwn.A01;
            int i3 = rwn.A00;
            if (i2 - i3 >= 5) {
                int i4 = i & (-128);
                byte[] bArr = rwn.A02;
                rwn.A00 = i3 + 1;
                if (i4 == 0) {
                    j = i3;
                    b = (byte) i;
                } else {
                    UnsafeUtil.A08(bArr, (byte) (i | 128), i3);
                    int i5 = i >>> 7;
                    if ((i5 & (-128)) != 0) {
                        int i6 = rwn.A00;
                        rwn.A00 = i6 + 1;
                        UnsafeUtil.A08(bArr, (byte) (i5 | 128), i6);
                        i5 >>>= 7;
                        if ((i5 & (-128)) != 0) {
                            int i7 = rwn.A00;
                            rwn.A00 = i7 + 1;
                            UnsafeUtil.A08(bArr, (byte) (i5 | 128), i7);
                            i5 >>>= 7;
                            if ((i5 & (-128)) != 0) {
                                int i8 = rwn.A00;
                                rwn.A00 = i8 + 1;
                                UnsafeUtil.A08(bArr, (byte) (i5 | 128), i8);
                                i5 >>>= 7;
                            }
                        }
                    }
                    int i9 = rwn.A00;
                    rwn.A00 = i9 + 1;
                    j = i9;
                    b = (byte) i5;
                }
                UnsafeUtil.A08(bArr, b, j);
                return;
            }
        }
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr2 = rwn.A02;
                int i10 = rwn.A00;
                rwn.A00 = i10 + 1;
                bArr2[i10] = (byte) ((i & StringTreeSet.MAX_SYMBOL_COUNT) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new IOException(AbstractC58321PtD.A0s(rwn.A01, Integer.valueOf(rwn.A00)), e);
            }
        }
        byte[] bArr3 = rwn.A02;
        int i11 = rwn.A00;
        rwn.A00 = i11 + 1;
        bArr3[i11] = (byte) i;
    }

    public final void A08(int i, int i2) {
        if (this instanceof RWO) {
            RWO rwo = (RWO) this;
            RWO.A04(rwo, 14);
            rwo.A0K((i << 3) | 5);
            byte[] bArr = rwo.A03;
            int A0D = AbstractC58323PtF.A0D(bArr, rwo.A00, i2);
            rwo.A00 = A0D + 1;
            AbstractC58318PtA.A19(i2 >> 24, bArr, A0D);
            rwo.A01 += 4;
            return;
        }
        A07((i << 3) | 5);
        A06(i2);
    }

    public final void A09(int i, int i2) {
        if (this instanceof RWO) {
            RWO rwo = (RWO) this;
            RWO.A04(rwo, 20);
            rwo.A0K(i << 3);
            if (i2 >= 0) {
                rwo.A0K(i2);
                return;
            } else {
                rwo.A0L(i2);
                return;
            }
        }
        A07(i << 3);
        if (i2 >= 0) {
            A07(i2);
        } else {
            A0F(i2);
        }
    }

    public final void A0A(int i, int i2) {
        if (this instanceof RWO) {
            RWO rwo = (RWO) this;
            RWO.A04(rwo, 20);
            rwo.A0K(i << 3);
            rwo.A0K(i2);
            return;
        }
        A07(i << 3);
        A07(i2);
    }

    public final void A0B(int i, long j) {
        if (this instanceof RWO) {
            RWO rwo = (RWO) this;
            RWO.A04(rwo, 18);
            rwo.A0K((i << 3) | 1);
            byte[] bArr = rwo.A03;
            int A0G = AbstractC58323PtF.A0G(bArr, AbstractC58324PtG.A00(bArr, rwo.A00, j), j);
            rwo.A00 = A0G + 1;
            AbstractC58322PtE.A17(j, bArr, A0G);
            rwo.A01 += 8;
            return;
        }
        A07((i << 3) | 1);
        A0E(j);
    }

    public final void A0C(int i, long j) {
        if (this instanceof RWO) {
            RWO rwo = (RWO) this;
            RWO.A04(rwo, 20);
            rwo.A0K(i << 3);
            rwo.A0L(j);
            return;
        }
        A07(i << 3);
        A0F(j);
    }

    public final void A0D(int i, boolean z) {
        if (this instanceof RWO) {
            RWO rwo = (RWO) this;
            RWO.A04(rwo, 11);
            rwo.A0K(i << 3);
            byte b = z ? (byte) 1 : (byte) 0;
            byte[] bArr = rwo.A03;
            int i2 = rwo.A00;
            rwo.A00 = i2 + 1;
            bArr[i2] = b;
            rwo.A01++;
            return;
        }
        A07(i << 3);
        A05(z ? (byte) 1 : (byte) 0);
    }

    public final void A0E(long j) {
        if (this instanceof RWO) {
            RWO rwo = (RWO) this;
            RWO.A04(rwo, 8);
            byte[] bArr = rwo.A03;
            int A0G = AbstractC58323PtF.A0G(bArr, AbstractC58324PtG.A00(bArr, rwo.A00, j), j);
            rwo.A00 = A0G + 1;
            AbstractC58322PtE.A17(j, bArr, A0G);
            rwo.A01 += 8;
            return;
        }
        RWN rwn = (RWN) this;
        try {
            byte[] bArr2 = rwn.A02;
            int A0G2 = AbstractC58323PtF.A0G(bArr2, AbstractC58323PtF.A0H(bArr2, rwn.A00, j), j);
            rwn.A00 = A0G2 + 1;
            AbstractC58322PtE.A17(j, bArr2, A0G2);
        } catch (IndexOutOfBoundsException e) {
            throw new IOException(AbstractC58321PtD.A0s(rwn.A01, Integer.valueOf(rwn.A00)), e);
        }
    }

    public final void A0F(long j) {
        if (this instanceof RWO) {
            RWO rwo = (RWO) this;
            RWO.A04(rwo, 10);
            rwo.A0L(j);
            return;
        }
        RWN rwn = (RWN) this;
        if (!A02 || rwn.A01 - rwn.A00 < 10) {
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr = rwn.A02;
                    int i = rwn.A00;
                    rwn.A00 = i + 1;
                    bArr[i] = (byte) ((((int) j) & StringTreeSet.MAX_SYMBOL_COUNT) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new IOException(AbstractC58321PtD.A0s(rwn.A01, Integer.valueOf(rwn.A00)), e);
                }
            }
            byte[] bArr2 = rwn.A02;
            int i2 = rwn.A00;
            rwn.A00 = i2 + 1;
            bArr2[i2] = (byte) j;
            return;
        }
        while (true) {
            long j2 = j & (-128);
            byte[] bArr3 = rwn.A02;
            int i3 = rwn.A00;
            rwn.A00 = i3 + 1;
            long j3 = i3;
            int i4 = (int) j;
            if (j2 == 0) {
                UnsafeUtil.A08(bArr3, (byte) i4, j3);
                return;
            } else {
                UnsafeUtil.A08(bArr3, (byte) ((i4 & StringTreeSet.MAX_SYMBOL_COUNT) | 128), j3);
                j >>>= 7;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.RWN, com.google.protobuf.CodedOutputStream] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.protobuf.CodedOutputStream] */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.RWO, com.google.protobuf.CodedOutputStream] */
    public final void A0I(String str) {
        ?? r4;
        int A022;
        int A00;
        int A023;
        if (this instanceof RWO) {
            r4 = (RWO) this;
            try {
                int length = str.length();
                int i = length * 3;
                int A06 = AbstractC58321PtD.A06(i);
                int i2 = A06 + i;
                int i3 = r4.A02;
                if (i2 > i3) {
                    byte[] bArr = new byte[i];
                    int A024 = SU7.A00.A02(str, bArr, 0, i);
                    r4.A07(A024);
                    r4.A0J(bArr, 0, A024);
                    return;
                }
                if (i2 > i3 - r4.A00) {
                    RWO.A03(r4);
                }
                int A062 = AbstractC58321PtD.A06(length);
                int i4 = r4.A00;
                try {
                    try {
                        if (A062 == A06) {
                            int i5 = i4 + A062;
                            r4.A00 = i5;
                            A023 = SU7.A00.A02(str, r4.A03, i5, i3 - i5);
                            r4.A00 = i4;
                            A00 = (A023 - i4) - A062;
                            r4.A0K(A00);
                        } else {
                            A00 = SU7.A00(str);
                            r4.A0K(A00);
                            A023 = SU7.A00.A02(str, r4.A03, r4.A00, A00);
                        }
                        r4.A00 = A023;
                        r4.A01 += A00;
                        return;
                    } catch (RkR e) {
                        r4.A01 -= r4.A00 - i4;
                        r4.A00 = i4;
                        throw e;
                    }
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new IOException("CodedOutputStream was writing to a flat byte array and ran out of space.", e2);
                }
            } catch (RkR e3) {
                e = e3;
            }
        } else {
            r4 = (RWN) this;
            int i6 = r4.A00;
            try {
                int length2 = str.length();
                int A063 = AbstractC58321PtD.A06(length2 * 3);
                int A064 = AbstractC58321PtD.A06(length2);
                if (A064 == A063) {
                    int i7 = i6 + A064;
                    r4.A00 = i7;
                    A022 = SU7.A00.A02(str, r4.A02, i7, r4.A01 - i7);
                    r4.A00 = i6;
                    r4.A07((A022 - i6) - A064);
                } else {
                    r4.A07(SU7.A00(str));
                    byte[] bArr2 = r4.A02;
                    int i8 = r4.A00;
                    A022 = SU7.A00.A02(str, bArr2, i8, r4.A01 - i8);
                }
                r4.A00 = A022;
                return;
            } catch (RkR e4) {
                e = e4;
                r4.A00 = i6;
            } catch (IndexOutOfBoundsException e5) {
                throw new IOException("CodedOutputStream was writing to a flat byte array and ran out of space.", e5);
            }
        }
        A01.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
        byte[] bytes = str.getBytes(SVB.A04);
        try {
            int length3 = bytes.length;
            r4.A07(length3);
            r4.A0J(bytes, 0, length3);
        } catch (C61026Rdu e6) {
            throw e6;
        } catch (IndexOutOfBoundsException e7) {
            throw new IOException("CodedOutputStream was writing to a flat byte array and ran out of space.", e7);
        }
    }

    public final void A0J(byte[] bArr, int i, int i2) {
        if (this instanceof RWO) {
            ((RWO) this).A0M(bArr, i, i2);
        } else {
            ((RWN) this).A0K(bArr, i, i2);
        }
    }

    public static int A00(int i) {
        return AbstractC58321PtD.A06(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public static int A02(String str) {
        int i;
        try {
            str = SU7.A00(str);
            i = str;
        } catch (RkR unused) {
            i = str.getBytes(SVB.A04).length;
        }
        return AbstractC58321PtD.A06(i) + i;
    }

    public final void A0G(TEQ teq, InterfaceC65596Tnf interfaceC65596Tnf, int i) {
        AbstractC63073Sbv.A06(this, i);
        A07(TEQ.A0D(interfaceC65596Tnf, teq, teq));
        interfaceC65596Tnf.FEo(this.A00, teq);
    }

    public final void A0H(AbstractC64538TIu abstractC64538TIu) {
        A07(abstractC64538TIu.A02());
        RWI rwi = (RWI) abstractC64538TIu;
        A0J(rwi.A00, rwi.A06(), rwi.A02());
    }
}
