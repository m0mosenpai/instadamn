package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.TIu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64538TIu implements Iterable, Serializable {
    public static final AbstractC64538TIu A01 = new RWI(SVB.A05);
    public static final InterfaceC65442TkE A02;
    public int A00 = 0;

    public final int A02() {
        RWI rwi = (RWI) this;
        if (rwi instanceof RWH) {
            return ((RWH) rwi).A00;
        }
        return rwi.A00.length;
    }

    public final AbstractC64538TIu A03(int i) {
        RWI rwi = (RWI) this;
        int A00 = A00(0, i, rwi.A02());
        if (A00 == 0) {
            return A01;
        }
        return new RWH(rwi.A00, rwi.A06(), A00);
    }

    public abstract boolean equals(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.TkE] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    static {
        ?? r0;
        if (S92.A00 != null && !S92.A01) {
            r0 = new Object();
        } else {
            r0 = new Object();
        }
        A02 = r0;
    }

    public static int A00(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    throw AbstractC25229BEm.A0l("Beginning index larger than ending index: ", ", ", i, i2);
                }
                throw AbstractC25229BEm.A0l("End index: ", " >= ", i2, i3);
            }
            throw AbstractC58320PtC.A0q(i);
        }
        return i4;
    }

    public static RWI A01(byte[] bArr, int i, int i2) {
        A00(i, i + i2, bArr.length);
        return new RWI(A02.AKv(bArr, i, i2));
    }

    public final String A04() {
        Charset charset = SVB.A04;
        if (A02() == 0) {
            return "";
        }
        RWI rwi = (RWI) this;
        return AbstractC58318PtA.A0n(charset, rwi.A00, rwi.A06(), rwi.A02());
    }

    public final int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int A022 = A02();
            RWI rwi = (RWI) this;
            byte[] bArr = rwi.A00;
            int A06 = rwi.A06();
            i = A022;
            Charset charset = SVB.A04;
            for (int i2 = A06; i2 < A06 + A022; i2++) {
                i = (i * 31) + bArr[i2];
            }
            if (i == 0) {
                i = 1;
            }
            this.A00 = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new TT5(this);
    }

    public final String toString() {
        String A0R;
        Locale locale = Locale.ROOT;
        String A0q = AbstractC58322PtE.A0q(this);
        int A022 = A02();
        Integer valueOf = Integer.valueOf(A022);
        if (A022 <= 50) {
            A0R = AbstractC62233S3e.A00(this);
        } else {
            A0R = AnonymousClass001.A0R(AbstractC62233S3e.A00(A03(47)), "...");
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", A0q, valueOf, A0R);
    }

    public final byte[] A05() {
        int A022 = A02();
        if (A022 == 0) {
            return SVB.A05;
        }
        byte[] bArr = new byte[A022];
        RWI rwi = (RWI) this;
        if (rwi instanceof RWH) {
            RWH rwh = (RWH) rwi;
            System.arraycopy(((RWI) rwh).A00, rwh.A01, bArr, 0, A022);
            return bArr;
        }
        System.arraycopy(rwi.A00, 0, bArr, 0, A022);
        return bArr;
    }
}
