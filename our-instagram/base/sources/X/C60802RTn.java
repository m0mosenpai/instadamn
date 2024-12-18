package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.RTn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60802RTn extends AbstractC63351Si8 {
    public static final Logger A04 = AbstractC58319PtB.A17(C60802RTn.class);
    public static final boolean A05 = C58546PxE.A03;
    public int A00;
    public C62650SKj A01;
    public final int A02;
    public final byte[] A03;

    public C60802RTn(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.A03 = bArr;
            this.A00 = 0;
            this.A02 = i;
            return;
        }
        throw AbstractC58319PtB.A0j("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", AbstractC58320PtC.A1a(Integer.valueOf(length), 0, i));
    }

    public static int A01(long value) {
        if (((-128) & value) == 0) {
            return 1;
        }
        if (value < 0) {
            return 10;
        }
        int i = 2;
        if (((-34359738368L) & value) != 0) {
            i = 6;
            value >>>= 28;
        }
        if (((-2097152) & value) != 0) {
            i += 2;
            value >>>= 14;
        }
        return (value & (-16384)) != 0 ? i + 1 : i;
    }

    public final void A02(byte value) {
        try {
            byte[] bArr = this.A03;
            int i = this.A00;
            this.A00 = i + 1;
            bArr[i] = value;
        } catch (IndexOutOfBoundsException e) {
            throw new IOException(AbstractC58321PtD.A0s(this.A02, Integer.valueOf(this.A00)), e);
        }
    }

    public final void A03(int value) {
        try {
            byte[] bArr = this.A03;
            int A0D = AbstractC58323PtF.A0D(bArr, this.A00, value);
            this.A00 = A0D + 1;
            AbstractC58318PtA.A19(value >> 24, bArr, A0D);
        } catch (IndexOutOfBoundsException e) {
            throw new IOException(AbstractC58321PtD.A0s(this.A02, Integer.valueOf(this.A00)), e);
        }
    }

    public final void A04(int value) {
        while ((value & (-128)) != 0) {
            try {
                byte[] bArr = this.A03;
                int i = this.A00;
                this.A00 = i + 1;
                bArr[i] = (byte) ((value & StringTreeSet.MAX_SYMBOL_COUNT) | 128);
                value >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new IOException(AbstractC58321PtD.A0s(this.A02, Integer.valueOf(this.A00)), e);
            }
        }
        byte[] bArr2 = this.A03;
        int i2 = this.A00;
        this.A00 = i2 + 1;
        bArr2[i2] = (byte) value;
    }

    public final void A05(final int fieldNumber, final int value) {
        A04(fieldNumber << 3);
        if (value >= 0) {
            A04(value);
        } else {
            A08(value);
        }
    }

    public final void A07(long value) {
        try {
            byte[] bArr = this.A03;
            int A0G = AbstractC58323PtF.A0G(bArr, AbstractC58323PtF.A0H(bArr, this.A00, value), value);
            this.A00 = A0G + 1;
            AbstractC58322PtE.A17(value, bArr, A0G);
        } catch (IndexOutOfBoundsException e) {
            throw new IOException(AbstractC58321PtD.A0s(this.A02, Integer.valueOf(this.A00)), e);
        }
    }

    public final void A08(long value) {
        if (!A05 || this.A02 - this.A00 < 10) {
            while ((value & (-128)) != 0) {
                try {
                    byte[] bArr = this.A03;
                    int i = this.A00;
                    this.A00 = i + 1;
                    bArr[i] = (byte) ((((int) value) & StringTreeSet.MAX_SYMBOL_COUNT) | 128);
                    value >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new IOException(AbstractC58321PtD.A0s(this.A02, Integer.valueOf(this.A00)), e);
                }
            }
            byte[] bArr2 = this.A03;
            int i2 = this.A00;
            this.A00 = i2 + 1;
            bArr2[i2] = (byte) value;
            return;
        }
        while (true) {
            long j = value & (-128);
            byte[] bArr3 = this.A03;
            int i3 = this.A00;
            this.A00 = i3 + 1;
            long j2 = i3;
            int i4 = (int) value;
            if (j == 0) {
                C58546PxE.A07(bArr3, (byte) i4, j2);
                return;
            } else {
                C58546PxE.A07(bArr3, (byte) ((i4 & StringTreeSet.MAX_SYMBOL_COUNT) | 128), j2);
                value >>>= 7;
            }
        }
    }

    public final void A0A(byte[] value, int offset, int length) {
        try {
            System.arraycopy(value, offset, this.A03, this.A00, length);
            this.A00 += length;
        } catch (IndexOutOfBoundsException e) {
            throw new IOException(AnonymousClass001.A0R("CodedOutputStream was writing to a flat byte array and ran out of space.: ", String.format("Pos: %d, limit: %d, len: %d", AbstractC58320PtC.A1a(Integer.valueOf(this.A00), this.A02, length))), e);
        }
    }

    public static int A00(final int value) {
        return AbstractC58321PtD.A06(value);
    }

    public final void A06(final int fieldNumber, final String value) {
        int A00;
        AbstractC63351Si8.A04(this, fieldNumber);
        int i = this.A00;
        try {
            int length = value.length();
            int A06 = AbstractC58321PtD.A06(length * 3);
            int A062 = AbstractC58321PtD.A06(length);
            if (A062 == A06) {
                int i2 = i + A062;
                this.A00 = i2;
                A00 = SU4.A00.A00(value, this.A03, i2, this.A02 - i2);
                this.A00 = i;
                A04((A00 - i) - A062);
            } else {
                A04(SU4.A00(value));
                byte[] bArr = this.A03;
                int i3 = this.A00;
                A00 = SU4.A00.A00(value, bArr, i3, this.A02 - i3);
            }
            this.A00 = A00;
        } catch (RkQ e) {
            this.A00 = i;
            A04.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = value.getBytes(AbstractC62398S9x.A04);
            try {
                int length2 = bytes.length;
                A04(length2);
                A0A(bytes, 0, length2);
            } catch (IndexOutOfBoundsException e2) {
                throw new IOException("CodedOutputStream was writing to a flat byte array and ran out of space.", e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new IOException("CodedOutputStream was writing to a flat byte array and ran out of space.", e3);
        }
    }

    public final void A09(final AbstractC58536Px4 fieldNumber, final int value) {
        AbstractC63351Si8.A04(this, value);
        A04(fieldNumber.A02());
        C58535Px3 c58535Px3 = (C58535Px3) fieldNumber;
        A0A(c58535Px3.A00, c58535Px3.A05(), c58535Px3.A02());
    }

    public C60802RTn() {
    }
}
