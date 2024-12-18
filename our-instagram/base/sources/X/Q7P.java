package X;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes10.dex */
public abstract class Q7P extends AbstractC63226Sfd {
    public static final Logger A01 = AbstractC58319PtB.A17(Q7P.class);
    public static final boolean A02 = C58400Pue.A04;
    public C63603SqB A00;

    public static int A03(long j) {
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

    public final void A05(int i) {
        Q7O q7o = (Q7O) this;
        Q7O.A01(q7o, 5);
        q7o.A0E(i);
    }

    public final void A06(int i, int i2) {
        Q7O q7o = (Q7O) this;
        Q7O.A01(q7o, 14);
        q7o.A0E((i << 3) | 5);
        q7o.A0D(i2);
    }

    public final void A07(int i, int i2) {
        Q7O q7o = (Q7O) this;
        AbstractC63226Sfd.A06(q7o, i);
        if (i2 >= 0) {
            q7o.A0E(i2);
        } else {
            q7o.A0G(i2);
        }
    }

    public final void A08(int i, long j) {
        Q7O q7o = (Q7O) this;
        Q7O.A01(q7o, 18);
        q7o.A0E((i << 3) | 1);
        q7o.A0F(j);
    }

    public final void A09(int i, long j) {
        Q7O q7o = (Q7O) this;
        AbstractC63226Sfd.A06(q7o, i);
        q7o.A0G(j);
    }

    public final void A0A(AbstractC58387PuR abstractC58387PuR) {
        Q7O q7o = (Q7O) this;
        q7o.A05(abstractC58387PuR.A01());
        C58386PuQ c58386PuQ = (C58386PuQ) abstractC58387PuR;
        q7o.A0H(c58386PuQ.A00, c58386PuQ.A02(), c58386PuQ.A01());
    }

    public final void A0B(String str) {
        int A00;
        int A002;
        Q7O q7o = (Q7O) this;
        try {
            int length = str.length();
            int i = length * 3;
            int A06 = AbstractC58321PtD.A06(i);
            int i2 = A06 + i;
            int i3 = q7o.A02;
            if (i2 > i3) {
                byte[] bArr = new byte[i];
                int A003 = AbstractC58407Pul.A00.A00(str, bArr, 0, i);
                q7o.A05(A003);
                q7o.A0H(bArr, 0, A003);
                return;
            }
            if (i2 > i3 - q7o.A00) {
                Q7O.A00(q7o);
            }
            int A062 = AbstractC58321PtD.A06(length);
            int i4 = q7o.A00;
            try {
                if (A062 == A06) {
                    int i5 = i4 + A062;
                    q7o.A00 = i5;
                    A002 = AbstractC58407Pul.A00.A00(str, q7o.A03, i5, i3 - i5);
                    q7o.A00 = i4;
                    A00 = (A002 - i4) - A062;
                    q7o.A0E(A00);
                } else {
                    A00 = AbstractC58407Pul.A00(str);
                    q7o.A0E(A00);
                    A002 = AbstractC58407Pul.A00.A00(str, q7o.A03, q7o.A00, A00);
                }
                q7o.A00 = A002;
                q7o.A01 += A00;
            } catch (RkK e) {
                q7o.A01 -= q7o.A00 - i4;
                q7o.A00 = i4;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new IOException("CodedOutputStream was writing to a flat byte array and ran out of space.", e2);
            }
        } catch (RkK e3) {
            A01.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(AbstractC58376PuG.A03);
            try {
                int length2 = bytes.length;
                q7o.A05(length2);
                q7o.A0H(bytes, 0, length2);
            } catch (C61020Rdo e4) {
                throw e4;
            } catch (IndexOutOfBoundsException e5) {
                throw new IOException("CodedOutputStream was writing to a flat byte array and ran out of space.", e5);
            }
        }
    }

    public final void A0C(boolean z) {
        byte b = z ? (byte) 1 : (byte) 0;
        Q7O q7o = (Q7O) this;
        if (q7o.A00 == q7o.A02) {
            Q7O.A00(q7o);
        }
        byte[] bArr = q7o.A03;
        int i = q7o.A00;
        q7o.A00 = i + 1;
        bArr[i] = b;
        q7o.A01++;
    }

    public static int A02(int i) {
        return AbstractC58321PtD.A06(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public static int A04(String str) {
        int i;
        try {
            str = AbstractC58407Pul.A00(str);
            i = str;
        } catch (RkK unused) {
            i = str.getBytes(AbstractC58376PuG.A03).length;
        }
        return AbstractC58321PtD.A06(i) + i;
    }
}
