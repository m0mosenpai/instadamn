package X;

import java.util.Map;

/* renamed from: X.4Pm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC95034Pm {
    public C4PN A00;

    public byte A06() {
        C95024Pl c95024Pl = (C95024Pl) this;
        C4PO c4po = C4PN.A02;
        C4PN c4pn = ((AbstractC95034Pm) c95024Pl).A00;
        byte[] bArr = c95024Pl.A04;
        c4pn.A00(bArr, 1);
        return bArr[0];
    }

    public double A07() {
        C95024Pl c95024Pl = (C95024Pl) this;
        ((AbstractC95034Pm) c95024Pl).A00.A00(c95024Pl.A04, 8);
        return Double.longBitsToDouble(((r7[0] & 255) << 56) | ((r7[1] & 255) << 48) | ((r7[2] & 255) << 40) | ((r7[3] & 255) << 32) | ((r7[4] & 255) << 24) | ((r7[5] & 255) << 16) | ((r7[6] & 255) << 8) | (255 & r7[7]));
    }

    public float A08() {
        C95024Pl c95024Pl = (C95024Pl) this;
        C4PN c4pn = ((AbstractC95034Pm) c95024Pl).A00;
        byte[] bArr = c95024Pl.A04;
        c4pn.A00(bArr, 4);
        return Float.intBitsToFloat((bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8));
    }

    public int A09() {
        int A01 = C95024Pl.A01((C95024Pl) this);
        return (-(A01 & 1)) ^ (A01 >>> 1);
    }

    public C95054Po A0B() {
        short s;
        Boolean bool;
        C95024Pl c95024Pl = (C95024Pl) this;
        byte A06 = c95024Pl.A06();
        if (A06 == 0) {
            return C95024Pl.A07;
        }
        short s2 = (short) ((A06 & 240) >> 4);
        if (s2 == 0) {
            s = c95024Pl.A0H();
        } else {
            s = (short) (c95024Pl.A03 + s2);
        }
        int i = A06 & 15;
        byte b = (byte) i;
        C95054Po c95054Po = new C95054Po("", C95024Pl.A00(b), s);
        if (i == 1 || i == 2) {
            if (b == 1) {
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            c95024Pl.A02 = bool;
        }
        c95024Pl.A03 = c95054Po.A03;
        return c95054Po;
    }

    public C73293Xzi A0C() {
        C95024Pl c95024Pl = (C95024Pl) this;
        byte A06 = c95024Pl.A06();
        int i = (A06 >> 4) & 15;
        if (i == 15) {
            i = C95024Pl.A01(c95024Pl);
        }
        C95024Pl.A03(c95024Pl, i);
        byte A00 = C95024Pl.A00(A06);
        c95024Pl.A0b(A00);
        C4PO c4po = C4PN.A02;
        return new C73293Xzi(i, A00);
    }

    public C73303Xzu A0D() {
        byte A06;
        C95024Pl c95024Pl = (C95024Pl) this;
        int A01 = C95024Pl.A01(c95024Pl);
        C95024Pl.A03(c95024Pl, A01);
        if (A01 == 0) {
            A06 = 0;
        } else {
            A06 = c95024Pl.A06();
        }
        byte A00 = C95024Pl.A00((byte) (A06 >> 4));
        byte A002 = C95024Pl.A00((byte) (A06 & 15));
        if (A01 > 0) {
            c95024Pl.A0b(A00);
            c95024Pl.A0b(A002);
            C4PO c4po = C4PN.A02;
        }
        return new C73303Xzu(A00, A002, A01);
    }

    public C95044Pn A0F(Map map) {
        C95024Pl c95024Pl = (C95024Pl) this;
        c95024Pl.A00.A00(c95024Pl.A03);
        c95024Pl.A03 = (short) 0;
        return C95024Pl.A08;
    }

    public String A0G() {
        C95024Pl c95024Pl = (C95024Pl) this;
        int A01 = C95024Pl.A01(c95024Pl);
        C95024Pl.A04(c95024Pl, A01);
        if (A01 == 0) {
            return "";
        }
        C4PO c4po = C4PN.A02;
        if (-1 >= A01) {
            return new String((byte[]) null, 0, A01, AbstractC95084Ps.A00);
        }
        byte[] bArr = new byte[A01];
        ((AbstractC95034Pm) c95024Pl).A00.A00(bArr, A01);
        return new String(bArr, AbstractC95084Ps.A00);
    }

    public short A0H() {
        int A01 = C95024Pl.A01((C95024Pl) this);
        return (short) ((-(A01 & 1)) ^ (A01 >>> 1));
    }

    public void A0I() {
        C95024Pl c95024Pl = (C95024Pl) this;
        C4Pp c4Pp = c95024Pl.A00;
        short[] sArr = c4Pp.A01;
        int i = c4Pp.A00;
        c4Pp.A00 = i - 1;
        c95024Pl.A03 = sArr[i];
    }

    public void A0J() {
        C95024Pl.A02((C95024Pl) this, (byte) 0);
    }

    public void A0K() {
        C95024Pl c95024Pl = (C95024Pl) this;
        C4Pp c4Pp = c95024Pl.A00;
        short[] sArr = c4Pp.A01;
        int i = c4Pp.A00;
        c4Pp.A00 = i - 1;
        c95024Pl.A03 = sArr[i];
    }

    public void A0L(byte b) {
        C95024Pl.A02((C95024Pl) this, b);
    }

    public void A0M(double d) {
        C95024Pl c95024Pl = (C95024Pl) this;
        long doubleToLongBits = Double.doubleToLongBits(d);
        byte[] bArr = c95024Pl.A04;
        bArr[0] = (byte) ((doubleToLongBits >> 56) & 255);
        bArr[1] = (byte) ((doubleToLongBits >> 48) & 255);
        bArr[2] = (byte) ((doubleToLongBits >> 40) & 255);
        bArr[3] = (byte) ((doubleToLongBits >> 32) & 255);
        bArr[4] = (byte) ((doubleToLongBits >> 24) & 255);
        bArr[5] = (byte) ((doubleToLongBits >> 16) & 255);
        bArr[6] = (byte) ((doubleToLongBits >> 8) & 255);
        bArr[7] = (byte) (doubleToLongBits & 255);
        ((AbstractC95034Pm) c95024Pl).A00.A01(bArr, 8);
    }

    public void A0N(float f) {
        C95024Pl c95024Pl = (C95024Pl) this;
        int floatToIntBits = Float.floatToIntBits(f);
        byte[] bArr = c95024Pl.A04;
        bArr[0] = (byte) ((floatToIntBits >> 24) & 255);
        bArr[1] = (byte) ((floatToIntBits >> 16) & 255);
        bArr[2] = (byte) ((floatToIntBits >> 8) & 255);
        bArr[3] = (byte) (floatToIntBits & 255);
        ((AbstractC95034Pm) c95024Pl).A00.A01(bArr, 4);
    }

    public void A0O(int i) {
        C95024Pl.A05((C95024Pl) this, (i >> 31) ^ (i << 1));
    }

    public void A0P(long j) {
        C95024Pl c95024Pl = (C95024Pl) this;
        long j2 = (j >> 63) ^ (j << 1);
        int i = 0;
        while (true) {
            long j3 = (-128) & j2;
            byte[] bArr = c95024Pl.A04;
            int i2 = i + 1;
            if (j3 == 0) {
                bArr[i] = (byte) j2;
                ((AbstractC95034Pm) c95024Pl).A00.A01(bArr, i2);
                return;
            } else {
                bArr[i] = (byte) ((127 & j2) | 128);
                j2 >>>= 7;
                i = i2;
            }
        }
    }

    public void A0Q(C95054Po c95054Po) {
        int i;
        C95024Pl c95024Pl = (C95024Pl) this;
        byte b = c95054Po.A00;
        if (b == 2) {
            c95024Pl.A01 = c95054Po;
            return;
        }
        byte b2 = C95024Pl.A09[b];
        short s = c95054Po.A03;
        short s2 = c95024Pl.A03;
        if (s > s2 && (i = s - s2) <= 15) {
            C95024Pl.A02(c95024Pl, (byte) (b2 | (i << 4)));
        } else {
            C95024Pl.A02(c95024Pl, b2);
            c95024Pl.A0W(s);
        }
        c95024Pl.A03 = s;
    }

    public void A0R(C73293Xzi c73293Xzi) {
        C95024Pl c95024Pl = (C95024Pl) this;
        byte b = c73293Xzi.A00;
        int i = c73293Xzi.A01;
        if (i <= 14) {
            C95024Pl.A02(c95024Pl, (byte) (C95024Pl.A09[b] | (i << 4)));
        } else {
            C95024Pl.A02(c95024Pl, (byte) (C95024Pl.A09[b] | 240));
            C95024Pl.A05(c95024Pl, i);
        }
    }

    public void A0S(C73303Xzu c73303Xzu) {
        int i;
        C95024Pl c95024Pl = (C95024Pl) this;
        int i2 = c73303Xzu.A02;
        if (i2 == 0) {
            i = 0;
        } else {
            C95024Pl.A05(c95024Pl, i2);
            byte b = c73303Xzu.A00;
            byte[] bArr = C95024Pl.A09;
            i = bArr[c73303Xzu.A01] | (bArr[b] << 4);
        }
        C95024Pl.A02(c95024Pl, (byte) i);
    }

    public void A0T(C73294Xzj c73294Xzj) {
        C95024Pl c95024Pl = (C95024Pl) this;
        byte b = c73294Xzj.A00;
        int i = c73294Xzj.A01;
        if (i <= 14) {
            C95024Pl.A02(c95024Pl, (byte) (C95024Pl.A09[b] | (i << 4)));
        } else {
            C95024Pl.A02(c95024Pl, (byte) (C95024Pl.A09[b] | 240));
            C95024Pl.A05(c95024Pl, i);
        }
    }

    public void A0U(C95044Pn c95044Pn) {
        C95024Pl c95024Pl = (C95024Pl) this;
        c95024Pl.A00.A00(c95024Pl.A03);
        c95024Pl.A03 = (short) 0;
    }

    public void A0V(String str) {
        C95024Pl c95024Pl = (C95024Pl) this;
        byte[] bytes = str.getBytes(AbstractC95084Ps.A00);
        int length = bytes.length;
        C95024Pl.A05(c95024Pl, length);
        ((AbstractC95034Pm) c95024Pl).A00.A01(bytes, length);
    }

    public void A0W(short s) {
        C95024Pl.A05((C95024Pl) this, (s >> 31) ^ (s << 1));
    }

    public void A0X(boolean z) {
        int i;
        C95024Pl c95024Pl = (C95024Pl) this;
        C95054Po c95054Po = c95024Pl.A01;
        byte b = 1;
        if (c95054Po != null) {
            if (!z) {
                b = 2;
            }
            short s = c95054Po.A03;
            short s2 = c95024Pl.A03;
            if (s > s2 && (i = s - s2) <= 15) {
                C95024Pl.A02(c95024Pl, (byte) (b | (i << 4)));
            } else {
                C95024Pl.A02(c95024Pl, b);
                c95024Pl.A0W(s);
            }
            c95024Pl.A03 = s;
            c95024Pl.A01 = null;
            return;
        }
        if (!z) {
            b = 2;
        }
        C95024Pl.A02(c95024Pl, b);
    }

    public void A0Y(byte[] bArr) {
        C95024Pl c95024Pl = (C95024Pl) this;
        int length = bArr.length;
        C95024Pl.A05(c95024Pl, length);
        ((AbstractC95034Pm) c95024Pl).A00.A01(bArr, length);
    }

    public boolean A0Z() {
        C95024Pl c95024Pl = (C95024Pl) this;
        Boolean bool = c95024Pl.A02;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            c95024Pl.A02 = null;
            return booleanValue;
        }
        if (c95024Pl.A06() == 1) {
            return true;
        }
        return false;
    }

    public byte[] A0a() {
        C95024Pl c95024Pl = (C95024Pl) this;
        int A01 = C95024Pl.A01(c95024Pl);
        C95024Pl.A04(c95024Pl, A01);
        if (A01 == 0) {
            return new byte[0];
        }
        C4PO c4po = C4PN.A02;
        byte[] bArr = new byte[A01];
        ((AbstractC95034Pm) c95024Pl).A00.A00(bArr, A01);
        return bArr;
    }

    public long A0A() {
        C4PO c4po = C4PN.A02;
        int i = 0;
        long j = 0;
        while (true) {
            j |= (r2 & Byte.MAX_VALUE) << i;
            if ((A06() & 128) != 128) {
                return (-(j & 1)) ^ (j >>> 1);
            }
            i += 7;
        }
    }

    public C73294Xzj A0E() {
        C73293Xzi A0C = A0C();
        return new C73294Xzj(A0C.A01, A0C.A00);
    }
}
