package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Rqa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61611Rqa {
    public int A00;
    public C58545PxD A01;

    public final double A06() {
        long A0U;
        if (this instanceof C58557PxZ) {
            A0U = ((C58557PxZ) this).A0U();
        } else {
            A0U = ((C58539Px7) this).A0U();
        }
        return Double.longBitsToDouble(A0U);
    }

    public final float A07() {
        int A0S;
        if (this instanceof C58557PxZ) {
            A0S = ((C58557PxZ) this).A0S();
        } else {
            A0S = ((C58539Px7) this).A0S();
        }
        return Float.intBitsToFloat(A0S);
    }

    public final int A08() {
        if (this instanceof C58557PxZ) {
            C58557PxZ c58557PxZ = (C58557PxZ) this;
            return c58557PxZ.A04 + c58557PxZ.A03;
        }
        C58539Px7 c58539Px7 = (C58539Px7) this;
        return c58539Px7.A03 - c58539Px7.A04;
    }

    public final int A09() {
        if (this instanceof C58557PxZ) {
            return ((C58557PxZ) this).A0T();
        }
        return ((C58539Px7) this).A0T();
    }

    public final int A0A() {
        if (this instanceof C58557PxZ) {
            return ((C58557PxZ) this).A0S();
        }
        return ((C58539Px7) this).A0S();
    }

    public final int A0B() {
        if (this instanceof C58557PxZ) {
            return ((C58557PxZ) this).A0T();
        }
        return ((C58539Px7) this).A0T();
    }

    public final int A0C() {
        if (this instanceof C58557PxZ) {
            return ((C58557PxZ) this).A0S();
        }
        return ((C58539Px7) this).A0S();
    }

    public final int A0D() {
        if (this instanceof C58557PxZ) {
            return AbstractC58319PtB.A01(((C58557PxZ) this).A0T());
        }
        return AbstractC58319PtB.A01(((C58539Px7) this).A0T());
    }

    public final int A0E() {
        if (this instanceof C58557PxZ) {
            C58557PxZ c58557PxZ = (C58557PxZ) this;
            if (c58557PxZ.A0Q()) {
                c58557PxZ.A02 = 0;
                return 0;
            }
            int A0T = c58557PxZ.A0T();
            c58557PxZ.A02 = A0T;
            if ((A0T >>> 3) != 0) {
                return A0T;
            }
            throw C61032Re1.A01("Protocol message contained an invalid tag (zero).");
        }
        C58539Px7 c58539Px7 = (C58539Px7) this;
        if (c58539Px7.A0Q()) {
            c58539Px7.A01 = 0;
            return 0;
        }
        int A0T2 = c58539Px7.A0T();
        c58539Px7.A01 = A0T2;
        if ((A0T2 >>> 3) != 0) {
            return A0T2;
        }
        throw C61032Re1.A01("Protocol message contained an invalid tag (zero).");
    }

    public final int A0F() {
        if (this instanceof C58557PxZ) {
            return ((C58557PxZ) this).A0T();
        }
        return ((C58539Px7) this).A0T();
    }

    public final int A0G(int byteLimit) {
        if (this instanceof C58539Px7) {
            C58539Px7 c58539Px7 = (C58539Px7) this;
            if (byteLimit >= 0) {
                int i = byteLimit + (c58539Px7.A03 - c58539Px7.A04);
                if (i >= 0) {
                    int i2 = c58539Px7.A00;
                    if (i <= i2) {
                        c58539Px7.A00 = i;
                        C58539Px7.A00(c58539Px7);
                        return i2;
                    }
                    throw C61032Re1.A01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                throw C61032Re1.A01("Failed to parse the message.");
            }
            throw C61032Re1.A01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        C58557PxZ c58557PxZ = (C58557PxZ) this;
        if (byteLimit >= 0) {
            int i3 = byteLimit + c58557PxZ.A04 + c58557PxZ.A03;
            int i4 = c58557PxZ.A01;
            if (i3 <= i4) {
                c58557PxZ.A01 = i3;
                C58557PxZ.A01(c58557PxZ);
                return i4;
            }
            throw C61032Re1.A01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw C61032Re1.A01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final long A0H() {
        if (this instanceof C58557PxZ) {
            return ((C58557PxZ) this).A0U();
        }
        return ((C58539Px7) this).A0U();
    }

    public final long A0I() {
        if (this instanceof C58557PxZ) {
            return ((C58557PxZ) this).A0V();
        }
        return ((C58539Px7) this).A0V();
    }

    public final long A0J() {
        if (this instanceof C58557PxZ) {
            return ((C58557PxZ) this).A0U();
        }
        return ((C58539Px7) this).A0U();
    }

    public final long A0K() {
        if (this instanceof C58557PxZ) {
            return AbstractC58320PtC.A07(((C58557PxZ) this).A0V());
        }
        return AbstractC58320PtC.A07(((C58539Px7) this).A0V());
    }

    public final long A0L() {
        if (this instanceof C58557PxZ) {
            return ((C58557PxZ) this).A0V();
        }
        return ((C58539Px7) this).A0V();
    }

    public final AbstractC58536Px4 A0M() {
        if (this instanceof C58539Px7) {
            C58539Px7 c58539Px7 = (C58539Px7) this;
            int A0T = c58539Px7.A0T();
            if (A0T > 0) {
                int i = c58539Px7.A02;
                int i2 = c58539Px7.A03;
                if (A0T <= i - i2) {
                    C58535Px3 A01 = AbstractC58536Px4.A01(c58539Px7.A06, i2, A0T);
                    c58539Px7.A03 += A0T;
                    return A01;
                }
                throw C61032Re1.A01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (A0T != 0) {
                throw C61032Re1.A01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
        } else {
            C58557PxZ c58557PxZ = (C58557PxZ) this;
            int A0T2 = c58557PxZ.A0T();
            int i3 = c58557PxZ.A00;
            int i4 = c58557PxZ.A03;
            if (A0T2 <= i3 - i4 && A0T2 > 0) {
                C58535Px3 A012 = AbstractC58536Px4.A01(c58557PxZ.A07, i4, A0T2);
                c58557PxZ.A03 += A0T2;
                return A012;
            }
            if (A0T2 != 0) {
                byte[] A05 = C58557PxZ.A05(c58557PxZ, A0T2);
                if (A05 != null) {
                    return AbstractC58536Px4.A01(A05, 0, A05.length);
                }
                int i5 = c58557PxZ.A03;
                int i6 = c58557PxZ.A00;
                int i7 = i6 - i5;
                c58557PxZ.A04 += i6;
                c58557PxZ.A03 = 0;
                c58557PxZ.A00 = 0;
                ArrayList A00 = C58557PxZ.A00(c58557PxZ, A0T2 - i7);
                byte[] bArr = new byte[A0T2];
                System.arraycopy(c58557PxZ.A07, i5, bArr, 0, i7);
                Iterator it = A00.iterator();
                while (it.hasNext()) {
                    i7 = AbstractC58320PtC.A00(bArr, it, i7);
                }
                return new C58535Px3(bArr);
            }
        }
        return AbstractC58536Px4.A01;
    }

    public final String A0N() {
        String A0n;
        if (this instanceof C58557PxZ) {
            C58557PxZ c58557PxZ = (C58557PxZ) this;
            int A0T = c58557PxZ.A0T();
            if (A0T > 0) {
                int i = c58557PxZ.A00;
                int i2 = c58557PxZ.A03;
                if (A0T <= i - i2) {
                    A0n = AbstractC58318PtA.A0n(AbstractC62398S9x.A04, c58557PxZ.A07, i2, A0T);
                    c58557PxZ.A03 += A0T;
                    return A0n;
                }
            } else if (A0T == 0) {
                return "";
            }
            if (A0T <= c58557PxZ.A00) {
                C58557PxZ.A02(c58557PxZ, A0T);
                A0n = AbstractC58318PtA.A0n(AbstractC62398S9x.A04, c58557PxZ.A07, c58557PxZ.A03, A0T);
                c58557PxZ.A03 += A0T;
                return A0n;
            }
            return AbstractC58318PtA.A0m(AbstractC62398S9x.A04, C58557PxZ.A04(c58557PxZ, A0T));
        }
        C58539Px7 c58539Px7 = (C58539Px7) this;
        int A0T2 = c58539Px7.A0T();
        if (A0T2 > 0) {
            int i3 = c58539Px7.A02;
            int i4 = c58539Px7.A03;
            if (A0T2 <= i3 - i4) {
                String A0n2 = AbstractC58318PtA.A0n(AbstractC62398S9x.A04, c58539Px7.A06, i4, A0T2);
                c58539Px7.A03 += A0T2;
                return A0n2;
            }
            throw C61032Re1.A01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (A0T2 != 0) {
            throw C61032Re1.A01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        return "";
    }

    public final String A0O() {
        byte[] A04;
        if (this instanceof C58557PxZ) {
            C58557PxZ c58557PxZ = (C58557PxZ) this;
            int A0T = c58557PxZ.A0T();
            int i = c58557PxZ.A03;
            int i2 = c58557PxZ.A00;
            if (A0T <= i2 - i && A0T > 0) {
                A04 = c58557PxZ.A07;
                c58557PxZ.A03 = i + A0T;
            } else if (A0T != 0) {
                if (A0T <= i2) {
                    C58557PxZ.A02(c58557PxZ, A0T);
                    A04 = c58557PxZ.A07;
                    c58557PxZ.A03 = A0T;
                } else {
                    A04 = C58557PxZ.A04(c58557PxZ, A0T);
                }
                i = 0;
            } else {
                return "";
            }
            return SU4.A00.A02(A04, i, A0T);
        }
        C58539Px7 c58539Px7 = (C58539Px7) this;
        int A0T2 = c58539Px7.A0T();
        if (A0T2 > 0) {
            int i3 = c58539Px7.A02;
            int i4 = c58539Px7.A03;
            if (A0T2 <= i3 - i4) {
                String A02 = SU4.A00.A02(c58539Px7.A06, i4, A0T2);
                c58539Px7.A03 += A0T2;
                return A02;
            }
            throw C61032Re1.A01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (A0T2 != 0) {
            throw C61032Re1.A01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        return "";
    }

    public final void A0P() {
        if (this instanceof C58539Px7) {
            if (((C58539Px7) this).A01 != 0) {
                throw C61032Re1.A01("Protocol message end-group tag did not match expected tag.");
            }
        } else if (((C58557PxZ) this).A02 != 0) {
            throw C61032Re1.A01("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean A0Q() {
        if (this instanceof C58557PxZ) {
            C58557PxZ c58557PxZ = (C58557PxZ) this;
            if (c58557PxZ.A03 == c58557PxZ.A00 && !C58557PxZ.A03(c58557PxZ, 1)) {
                return true;
            }
            return false;
        }
        C58539Px7 c58539Px7 = (C58539Px7) this;
        return AbstractC167007dF.A1P(c58539Px7.A03, c58539Px7.A02);
    }

    public final boolean A0R() {
        if (this instanceof C58557PxZ) {
            return AbstractC167007dF.A1M((((C58557PxZ) this).A0V() > 0L ? 1 : (((C58557PxZ) this).A0V() == 0L ? 0 : -1)));
        }
        return AbstractC167007dF.A1M((((C58539Px7) this).A0V() > 0L ? 1 : (((C58539Px7) this).A0V() == 0L ? 0 : -1)));
    }
}
