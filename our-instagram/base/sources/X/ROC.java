package X;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes10.dex */
public final class ROC extends SSM {
    public static final Logger A04 = AbstractC58319PtB.A17(ROC.class);
    public static final boolean A05 = C63409Sjj.A0P();
    public int A00;
    public C64256T6f A01;
    public final int A02;
    public final byte[] A03;

    public ROC() {
    }

    public /* synthetic */ ROC(AbstractC61504Rof abstractC61504Rof) {
    }

    public ROC(byte[] bArr, int i) {
        this(null);
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.A03 = bArr;
            this.A00 = 0;
            this.A02 = i;
            return;
        }
        throw AbstractC58319PtB.A0j("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", AbstractC58320PtC.A1a(Integer.valueOf(length), 0, i));
    }

    public final int A08() {
        return this.A02 - this.A00;
    }

    public final void A0R(byte[] bArr, int i) {
        try {
            System.arraycopy(bArr, 0, this.A03, this.A00, i);
            this.A00 += i;
        } catch (IndexOutOfBoundsException e) {
            throw new C61033Re3(String.format("Pos: %d, limit: %d, len: %d", AbstractC58320PtC.A1a(Integer.valueOf(this.A00), this.A02, i)), e);
        }
    }

    public static int A02(InterfaceC65665Tqv interfaceC65665Tqv, InterfaceC65591TnW interfaceC65591TnW) {
        int A0I = ((AbstractC64251T6a) interfaceC65665Tqv).A0I(interfaceC65591TnW);
        return A00(A0I) + A0I;
    }

    public static ROC A05(byte[] bArr, int i) {
        return new ROC(bArr, i);
    }

    public static C61033Re3 A06(ROC roc, Throwable th) {
        return new C61033Re3(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(roc.A00), Integer.valueOf(roc.A02), 1), th);
    }

    public final void A0A(byte b) {
        try {
            byte[] bArr = this.A03;
            int i = this.A00;
            this.A00 = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw A06(this, e);
        }
    }

    public final void A0B(int i) {
        try {
            byte[] bArr = this.A03;
            int A0D = AbstractC58323PtF.A0D(bArr, this.A00, i);
            this.A00 = A0D + 1;
            AbstractC58318PtA.A19(i >> 24, bArr, A0D);
        } catch (IndexOutOfBoundsException e) {
            throw A06(this, e);
        }
    }

    public final void A0C(int i) {
        if (i >= 0) {
            A0D(i);
        } else {
            A0N(i);
        }
    }

    public final void A0D(int i) {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.A03;
                int i2 = this.A00;
                this.A00 = i2 + 1;
                AbstractC58318PtA.A19(i | 128, bArr, i2);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw A06(this, e);
            }
        }
        byte[] bArr2 = this.A03;
        int i3 = this.A00;
        this.A00 = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    public final void A0E(int i, int i2) {
        A0D((i << 3) | 5);
        A0B(i2);
    }

    public final void A0F(int i, int i2) {
        A0D(i << 3);
        A0C(i2);
    }

    public final void A0G(int i, int i2) {
        A0D((i << 3) | i2);
    }

    public final void A0H(int i, int i2) {
        A0D(i << 3);
        A0D(i2);
    }

    public final void A0I(int i, long j) {
        A0D((i << 3) | 1);
        A0M(j);
    }

    public final void A0J(int i, long j) {
        A0D(i << 3);
        A0N(j);
    }

    public final void A0K(int i, String str) {
        A0D((i << 3) | 2);
        A0Q(str);
    }

    public final void A0L(int i, boolean z) {
        A0D(i << 3);
        A0A(z ? (byte) 1 : (byte) 0);
    }

    public final void A0M(long j) {
        try {
            byte[] bArr = this.A03;
            int A0G = AbstractC58323PtF.A0G(bArr, AbstractC58323PtF.A0H(bArr, this.A00, j), j);
            this.A00 = A0G + 1;
            AbstractC58322PtE.A17(j, bArr, A0G);
        } catch (IndexOutOfBoundsException e) {
            throw A06(this, e);
        }
    }

    public final void A0O(AbstractC64539TIv abstractC64539TIv, int i) {
        A0D((i << 3) | 2);
        A0D(abstractC64539TIv.A05());
        abstractC64539TIv.A0A(this);
    }

    public final void A0P(RkM rkM, String str) {
        A04.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) rkM);
        byte[] bytes = str.getBytes(AbstractC63328Shc.A03);
        try {
            int length = bytes.length;
            A0D(length);
            A0S(bytes, length);
        } catch (IndexOutOfBoundsException e) {
            throw new C61033Re3(e);
        }
    }

    public final void A0Q(String str) {
        int A01;
        int i = this.A00;
        try {
            int length = str.length();
            int A00 = A00(length * 3);
            int A002 = A00(length);
            if (A002 == A00) {
                int i2 = i + A002;
                this.A00 = i2;
                A01 = AbstractC63353SiA.A01(str, this.A03, i2, this.A02 - i2);
                this.A00 = i;
                A0D((A01 - i) - A002);
            } else {
                A0D(AbstractC63353SiA.A00(str));
                byte[] bArr = this.A03;
                int i3 = this.A00;
                A01 = AbstractC63353SiA.A01(str, bArr, i3, this.A02 - i3);
            }
            this.A00 = A01;
        } catch (RkM e) {
            this.A00 = i;
            A0P(e, str);
        } catch (IndexOutOfBoundsException e2) {
            throw new C61033Re3(e2);
        }
    }

    public static int A00(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int A01(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    @Deprecated
    public static int A03(InterfaceC65665Tqv interfaceC65665Tqv, InterfaceC65591TnW interfaceC65591TnW, int i) {
        int A08 = SSM.A08(i);
        return A08 + A08 + ((AbstractC64251T6a) interfaceC65665Tqv).A0I(interfaceC65591TnW);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public static int A04(String str) {
        int i;
        try {
            str = AbstractC63353SiA.A00(str);
            i = str;
        } catch (RkM unused) {
            i = str.getBytes(AbstractC63328Shc.A03).length;
        }
        return A00(i) + i;
    }

    public final void A09() {
        if (A08() == 0) {
        } else {
            throw AbstractC166987dD.A14("Did not write as much data as expected.");
        }
    }

    public final void A0N(long j) {
        if (!A05 || this.A02 - this.A00 < 10) {
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr = this.A03;
                    int i = this.A00;
                    this.A00 = i + 1;
                    AbstractC58318PtA.A19(((int) j) | 128, bArr, i);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw A06(this, e);
                }
            }
            byte[] bArr2 = this.A03;
            int i2 = this.A00;
            this.A00 = i2 + 1;
            bArr2[i2] = (byte) j;
            return;
        }
        while (true) {
            long j2 = j & (-128);
            int i3 = (int) j;
            byte[] bArr3 = this.A03;
            int i4 = this.A00;
            this.A00 = i4 + 1;
            long j3 = i4;
            if (j2 == 0) {
                C63409Sjj.A0O(bArr3, (byte) i3, j3);
                return;
            } else {
                C63409Sjj.A0O(bArr3, (byte) ((i3 | 128) & 255), j3);
                j >>>= 7;
            }
        }
    }

    public final void A0S(byte[] bArr, int i) {
        A0R(bArr, i);
    }
}
